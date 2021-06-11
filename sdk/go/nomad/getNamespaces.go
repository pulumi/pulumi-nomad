// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package nomad

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieve a list of namespaces available in Nomad.
func GetNamespaces(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetNamespacesResult, error) {
	var rv GetNamespacesResult
	err := ctx.Invoke("nomad:index/getNamespaces:getNamespaces", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getNamespaces.
type GetNamespacesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Namespaces []string `pulumi:"namespaces"`
}
