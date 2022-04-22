// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nomad

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieve a list of Scaling Policies.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-nomad/sdk/go/nomad"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := nomad.GetScalingPolicies(ctx, &GetScalingPoliciesArgs{
// 			JobId: pulumi.StringRef("webapp"),
// 			Type:  pulumi.StringRef("horizontal"),
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func GetScalingPolicies(ctx *pulumi.Context, args *GetScalingPoliciesArgs, opts ...pulumi.InvokeOption) (*GetScalingPoliciesResult, error) {
	var rv GetScalingPoliciesResult
	err := ctx.Invoke("nomad:index/getScalingPolicies:getScalingPolicies", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getScalingPolicies.
type GetScalingPoliciesArgs struct {
	// `(string)` - An optional string to filter scaling policies based on the target job. If not provided, policies for all jobs are returned.
	JobId *string `pulumi:"jobId"`
	// `(string)` - An optional string to filter scaling policies based on policy type. If not provided, policies of all types are returned.
	Type *string `pulumi:"type"`
}

// A collection of values returned by getScalingPolicies.
type GetScalingPoliciesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id       string                     `pulumi:"id"`
	JobId    *string                    `pulumi:"jobId"`
	Policies []GetScalingPoliciesPolicy `pulumi:"policies"`
	Type     *string                    `pulumi:"type"`
}

func GetScalingPoliciesOutput(ctx *pulumi.Context, args GetScalingPoliciesOutputArgs, opts ...pulumi.InvokeOption) GetScalingPoliciesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetScalingPoliciesResult, error) {
			args := v.(GetScalingPoliciesArgs)
			r, err := GetScalingPolicies(ctx, &args, opts...)
			var s GetScalingPoliciesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetScalingPoliciesResultOutput)
}

// A collection of arguments for invoking getScalingPolicies.
type GetScalingPoliciesOutputArgs struct {
	// `(string)` - An optional string to filter scaling policies based on the target job. If not provided, policies for all jobs are returned.
	JobId pulumi.StringPtrInput `pulumi:"jobId"`
	// `(string)` - An optional string to filter scaling policies based on policy type. If not provided, policies of all types are returned.
	Type pulumi.StringPtrInput `pulumi:"type"`
}

func (GetScalingPoliciesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetScalingPoliciesArgs)(nil)).Elem()
}

// A collection of values returned by getScalingPolicies.
type GetScalingPoliciesResultOutput struct{ *pulumi.OutputState }

func (GetScalingPoliciesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetScalingPoliciesResult)(nil)).Elem()
}

func (o GetScalingPoliciesResultOutput) ToGetScalingPoliciesResultOutput() GetScalingPoliciesResultOutput {
	return o
}

func (o GetScalingPoliciesResultOutput) ToGetScalingPoliciesResultOutputWithContext(ctx context.Context) GetScalingPoliciesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetScalingPoliciesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetScalingPoliciesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetScalingPoliciesResultOutput) JobId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetScalingPoliciesResult) *string { return v.JobId }).(pulumi.StringPtrOutput)
}

func (o GetScalingPoliciesResultOutput) Policies() GetScalingPoliciesPolicyArrayOutput {
	return o.ApplyT(func(v GetScalingPoliciesResult) []GetScalingPoliciesPolicy { return v.Policies }).(GetScalingPoliciesPolicyArrayOutput)
}

func (o GetScalingPoliciesResultOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetScalingPoliciesResult) *string { return v.Type }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetScalingPoliciesResultOutput{})
}
