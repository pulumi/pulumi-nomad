// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package nomad

import (
	"bytes"
	"fmt"
	"os"
	"path/filepath"
	"unicode"

	// embed is used to store bridge-metadata.json in the compiled binary
	_ "embed"

	"github.com/hashicorp/terraform-provider-nomad/nomad"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tfbridgetokens "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfgen"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
	"github.com/pulumi/pulumi/sdk/v3/go/common/util/contract"

	"github.com/pulumi/pulumi-nomad/provider/v2/pkg/version"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "nomad"
	// modules:
	mainMod = "index" // the y module
)

// makeMember manufactures a type token for the package and the given module and type.
func makeMember(mod string, mem string) tokens.ModuleMember {
	return tokens.ModuleMember(mainPkg + ":" + mod + ":" + mem)
}

// makeType manufactures a type token for the package and the given module and type.
func makeType(mod string, typ string) tokens.Type {
	return tokens.Type(makeMember(mod, typ))
}

// makeDataSource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the data source's
// first character.
func makeDataSource(mod string, res string) tokens.ModuleMember {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeMember(mod+"/"+fn, res)
}

// makeResource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the resource's
// first character.
func makeResource(mod string, res string) tokens.Type {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeType(mod+"/"+fn, res)
}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := shimv2.NewProvider(nomad.Provider())

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "nomad",
		Description: "A Pulumi package for creating and managing nomad cloud resources.",
		Keywords:    []string{"pulumi", "nomad"},
		License:     "Apache-2.0",
		Homepage:    "https://pulumi.io",
		GitHubOrg:   "hashicorp",
		Repository:  "https://github.com/pulumi/pulumi-nomad",
		Config:      map[string]*tfbridge.SchemaInfo{},
		DocRules:    &tfbridge.DocRuleInfo{EditRules: docEditRules},
		Resources: map[string]*tfbridge.ResourceInfo{
			"nomad_acl_policy":          {Tok: makeResource(mainMod, "AclPolicy")},
			"nomad_acl_role":            {Tok: makeResource(mainMod, "AclRole")},
			"nomad_acl_token":           {Tok: makeResource(mainMod, "AclToken")},
			"nomad_external_volume":     {Tok: makeResource(mainMod, "ExternalVolume")},
			"nomad_job":                 {Tok: makeResource(mainMod, "Job")},
			"nomad_namespace":           {Tok: makeResource(mainMod, "Namespace")},
			"nomad_quota_specification": {Tok: makeResource(mainMod, "QuoteSpecification")},
			"nomad_sentinel_policy":     {Tok: makeResource(mainMod, "SentinelPolicy")},
			"nomad_volume":              {Tok: makeResource(mainMod, "Volume")},
			"nomad_scheduler_config":    {Tok: makeResource(mainMod, "SchedulerConfig")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"nomad_acl_policies":     {Tok: makeDataSource(mainMod, "getAclPolicies")},
			"nomad_acl_policy":       {Tok: makeDataSource(mainMod, "getAclPolicy")},
			"nomad_acl_role":         {Tok: makeDataSource(mainMod, "getAclRole")},
			"nomad_acl_roles":        {Tok: makeDataSource(mainMod, "getAclRoles")},
			"nomad_acl_token":        {Tok: makeDataSource(mainMod, "getAclToken")},
			"nomad_acl_tokens":       {Tok: makeDataSource(mainMod, "getAclTokens")},
			"nomad_datacenters":      {Tok: makeDataSource(mainMod, "getDatacenters")},
			"nomad_deployments":      {Tok: makeDataSource(mainMod, "getDeployments")},
			"nomad_job":              {Tok: makeDataSource(mainMod, "getJob")},
			"nomad_job_parser":       {Tok: makeDataSource(mainMod, "getJobParser")},
			"nomad_namespace":        {Tok: makeDataSource(mainMod, "getNamespace")},
			"nomad_namespaces":       {Tok: makeDataSource(mainMod, "getNamespaces")},
			"nomad_plugin":           {Tok: makeDataSource(mainMod, "getPlugin")},
			"nomad_plugins":          {Tok: makeDataSource(mainMod, "getPlugins")},
			"nomad_scaling_policies": {Tok: makeDataSource(mainMod, "getScalingPolicies")},
			"nomad_scaling_policy":   {Tok: makeDataSource(mainMod, "getScalingPolicy")},
			"nomad_scheduler_config": {Tok: makeDataSource(mainMod, "getSchedulerPolicy")},
			"nomad_regions":          {Tok: makeDataSource(mainMod, "getRegions")},
			"nomad_volumes":          {Tok: makeDataSource(mainMod, "getVolumes")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			RespectSchemaVersion: true,
		},
		Python: (func() *tfbridge.PythonInfo {
			i := &tfbridge.PythonInfo{
				RespectSchemaVersion: true,
			}
			i.PyProject.Enabled = true
			return i
		})(),

		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
			RespectSchemaVersion:           true,
		},
		CSharp: &tfbridge.CSharpInfo{
			RespectSchemaVersion: true,
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
		}, MetadataInfo: tfbridge.NewProviderMetadata(metadata),
	}

	prov.MustComputeTokens(tfbridgetokens.SingleModule("nomad_", mainMod, tfbridgetokens.MakeStandard(mainPkg)))
	err := prov.ApplyAutoAliases()
	contract.AssertNoErrorf(err, "auto aliasing apply failed")

	prov.SetAutonaming(255, "-")

	return prov
}

func docEditRules(defaults []tfbridge.DocsEdit) []tfbridge.DocsEdit {
	edits := []tfbridge.DocsEdit{
		cleanUpEnvVars,
	}
	edits = append(edits, defaults...)
	return append(
		edits,
		skipSections()...,
	)
}

// Removes sections with TF specific instructions.
func skipSections() []tfbridge.DocsEdit {
	edits := []tfbridge.DocsEdit{}
	titles := []string{
		"Configuring Multiple Tokens",
		"Multi-Region Deployments",
	}
	for _, title := range titles {
		edits = append(edits, tfbridge.DocsEdit{
			Path: "index.html.markdown",
			Edit: func(_ string, content []byte) ([]byte, error) {
				return tfgen.SkipSectionByHeaderContent(content, func(headerText string) bool {
					return headerText == title
				})
			},
		})
	}
	return edits
}

// Cleans up TF Cloud specific references from env var documentation.
var cleanUpEnvVars = tfbridge.DocsEdit{
	Path: "index.html.markdown",
	Edit: func(_ string, content []byte) ([]byte, error) {
		replacesDir := "docs/index-md-replaces/"
		input, err := os.ReadFile(replacesDir + "env-vars-input.md")
		if err != nil {
			return nil, err
		}
		desired, err := os.ReadFile(replacesDir + "env-vars-desired.md")
		if err != nil {
			return nil, err
		}
		if bytes.Contains(content, input) {
			content = bytes.ReplaceAll(
				content,
				input,
				desired)
		} else {
			// Hard error to ensure we keep this content up to date
			return nil, fmt.Errorf("could not find text in upstream index.html.markdown, "+
				"please verify file content at %s\n*****\n%s\n*****\n", replacesDir+"overview-input.md", string(input))
		}
		return content, nil
	},
}

//go:embed cmd/pulumi-resource-nomad/bridge-metadata.json
var metadata []byte
