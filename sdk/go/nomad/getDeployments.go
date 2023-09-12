// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nomad

import (
	"github.com/pulumi/pulumi-nomad/sdk/v2/go/nomad/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieve a list of deployments in Nomad.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-nomad/sdk/v2/go/nomad"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := nomad.GetDeployments(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetDeployments(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetDeploymentsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetDeploymentsResult
	err := ctx.Invoke("nomad:index/getDeployments:getDeployments", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getDeployments.
type GetDeploymentsResult struct {
	// `list of maps` a list of deployments in the cluster.
	Deployments []map[string]interface{} `pulumi:"deployments"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
}
