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
	"fmt"
	// embed is used to store bridge-metadata.json in the compiled binary
	_ "embed"
	"path/filepath"
	"unicode"

	"github.com/hashicorp/terraform-provider-nomad/nomad"
	"github.com/pulumi/pulumi-nomad/provider/v2/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tfbridgetokens "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
	"github.com/pulumi/pulumi/sdk/v3/go/common/util/contract"
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
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
		},
		Python: (func() *tfbridge.PythonInfo {
			i := &tfbridge.PythonInfo{
				Requires: map[string]string{
					"pulumi": ">=3.0.0,<4.0.0",
				}}
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
		},
		CSharp: &tfbridge.CSharpInfo{
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

//go:embed cmd/pulumi-resource-nomad/bridge-metadata.json
var metadata []byte
