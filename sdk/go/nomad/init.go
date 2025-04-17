// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nomad

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-nomad/sdk/v2/go/nomad/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "nomad:index/aclAuthMethod:AclAuthMethod":
		r = &AclAuthMethod{}
	case "nomad:index/aclBindingRule:AclBindingRule":
		r = &AclBindingRule{}
	case "nomad:index/aclPolicy:AclPolicy":
		r = &AclPolicy{}
	case "nomad:index/aclRole:AclRole":
		r = &AclRole{}
	case "nomad:index/aclToken:AclToken":
		r = &AclToken{}
	case "nomad:index/csiVolume:CsiVolume":
		r = &CsiVolume{}
	case "nomad:index/csiVolumeRegistration:CsiVolumeRegistration":
		r = &CsiVolumeRegistration{}
	case "nomad:index/dynamicHostVolume:DynamicHostVolume":
		r = &DynamicHostVolume{}
	case "nomad:index/dynamicHostVolumeRegistration:DynamicHostVolumeRegistration":
		r = &DynamicHostVolumeRegistration{}
	case "nomad:index/externalVolume:ExternalVolume":
		r = &ExternalVolume{}
	case "nomad:index/job:Job":
		r = &Job{}
	case "nomad:index/namespace:Namespace":
		r = &Namespace{}
	case "nomad:index/nodePool:NodePool":
		r = &NodePool{}
	case "nomad:index/quoteSpecification:QuoteSpecification":
		r = &QuoteSpecification{}
	case "nomad:index/schedulerConfig:SchedulerConfig":
		r = &SchedulerConfig{}
	case "nomad:index/sentinelPolicy:SentinelPolicy":
		r = &SentinelPolicy{}
	case "nomad:index/variable:Variable":
		r = &Variable{}
	case "nomad:index/volume:Volume":
		r = &Volume{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

type pkg struct {
	version semver.Version
}

func (p *pkg) Version() semver.Version {
	return p.version
}

func (p *pkg) ConstructProvider(ctx *pulumi.Context, name, typ, urn string) (pulumi.ProviderResource, error) {
	if typ != "pulumi:providers:nomad" {
		return nil, fmt.Errorf("unknown provider type: %s", typ)
	}

	r := &Provider{}
	err := ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return r, err
}

func init() {
	version, err := internal.PkgVersion()
	if err != nil {
		version = semver.Version{Major: 1}
	}
	pulumi.RegisterResourceModule(
		"nomad",
		"index/aclAuthMethod",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"nomad",
		"index/aclBindingRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"nomad",
		"index/aclPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"nomad",
		"index/aclRole",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"nomad",
		"index/aclToken",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"nomad",
		"index/csiVolume",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"nomad",
		"index/csiVolumeRegistration",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"nomad",
		"index/dynamicHostVolume",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"nomad",
		"index/dynamicHostVolumeRegistration",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"nomad",
		"index/externalVolume",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"nomad",
		"index/job",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"nomad",
		"index/namespace",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"nomad",
		"index/nodePool",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"nomad",
		"index/quoteSpecification",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"nomad",
		"index/schedulerConfig",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"nomad",
		"index/sentinelPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"nomad",
		"index/variable",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"nomad",
		"index/volume",
		&module{version},
	)
	pulumi.RegisterResourcePackage(
		"nomad",
		&pkg{version},
	)
}
