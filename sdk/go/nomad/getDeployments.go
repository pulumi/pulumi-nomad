// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nomad

import (
	"context"
	"reflect"

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
	// * `ID`: `string` Deployment ID.
	// * `JobID`: `string` Job ID associated with the deployment.
	// * `JobVersion`: `string` Job version.
	// * `Status`: `string` Deployment status.
	// * `StatusDescription`: `string` Detailed description of the deployment's status.
	Deployments []map[string]interface{} `pulumi:"deployments"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
}

func GetDeploymentsOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetDeploymentsResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetDeploymentsResult, error) {
		r, err := GetDeployments(ctx, opts...)
		var s GetDeploymentsResult
		if r != nil {
			s = *r
		}
		return s, err
	}).(GetDeploymentsResultOutput)
}

// A collection of values returned by getDeployments.
type GetDeploymentsResultOutput struct{ *pulumi.OutputState }

func (GetDeploymentsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDeploymentsResult)(nil)).Elem()
}

func (o GetDeploymentsResultOutput) ToGetDeploymentsResultOutput() GetDeploymentsResultOutput {
	return o
}

func (o GetDeploymentsResultOutput) ToGetDeploymentsResultOutputWithContext(ctx context.Context) GetDeploymentsResultOutput {
	return o
}

// `list of maps` a list of deployments in the cluster.
// * `ID`: `string` Deployment ID.
// * `JobID`: `string` Job ID associated with the deployment.
// * `JobVersion`: `string` Job version.
// * `Status`: `string` Deployment status.
// * `StatusDescription`: `string` Detailed description of the deployment's status.
func (o GetDeploymentsResultOutput) Deployments() pulumi.MapArrayOutput {
	return o.ApplyT(func(v GetDeploymentsResult) []map[string]interface{} { return v.Deployments }).(pulumi.MapArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDeploymentsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDeploymentsResult) string { return v.Id }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDeploymentsResultOutput{})
}
