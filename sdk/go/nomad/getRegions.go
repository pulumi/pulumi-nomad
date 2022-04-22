// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nomad

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieve a list of regions available in Nomad.
func GetRegions(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetRegionsResult, error) {
	var rv GetRegionsResult
	err := ctx.Invoke("nomad:index/getRegions:getRegions", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getRegions.
type GetRegionsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id      string   `pulumi:"id"`
	Regions []string `pulumi:"regions"`
}
