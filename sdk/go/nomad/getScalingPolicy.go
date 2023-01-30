// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nomad

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieve a Scaling Policy.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-nomad/sdk/go/nomad"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := nomad.GetScalingPolicy(ctx, &nomad.GetScalingPolicyArgs{
//				Id: "ad19848d-1921-179c-affa-244a3543be88",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetScalingPolicy(ctx *pulumi.Context, args *GetScalingPolicyArgs, opts ...pulumi.InvokeOption) (*GetScalingPolicyResult, error) {
	var rv GetScalingPolicyResult
	err := ctx.Invoke("nomad:index/getScalingPolicy:getScalingPolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getScalingPolicy.
type GetScalingPolicyArgs struct {
	// `(string: <required>)` - The  ID of the scaling policy.
	Id string `pulumi:"id"`
}

// A collection of values returned by getScalingPolicy.
type GetScalingPolicyResult struct {
	// `(boolean)` - Whether or not the scaling policy is enabled.
	Enabled bool   `pulumi:"enabled"`
	Id      string `pulumi:"id"`
	// `(integer)` - The maximum value set in the scaling policy.
	Max int `pulumi:"max"`
	// `(integer)` - The minimum value set in the scaling policy.
	Min int `pulumi:"min"`
	// `(string)` - The policy inside the scaling policy.
	Policy string `pulumi:"policy"`
	// `(map[string]string)` - The scaling policy target.
	Target map[string]interface{} `pulumi:"target"`
	// `(string)` - The scaling policy type.
	Type string `pulumi:"type"`
}

func GetScalingPolicyOutput(ctx *pulumi.Context, args GetScalingPolicyOutputArgs, opts ...pulumi.InvokeOption) GetScalingPolicyResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetScalingPolicyResult, error) {
			args := v.(GetScalingPolicyArgs)
			r, err := GetScalingPolicy(ctx, &args, opts...)
			var s GetScalingPolicyResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetScalingPolicyResultOutput)
}

// A collection of arguments for invoking getScalingPolicy.
type GetScalingPolicyOutputArgs struct {
	// `(string: <required>)` - The  ID of the scaling policy.
	Id pulumi.StringInput `pulumi:"id"`
}

func (GetScalingPolicyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetScalingPolicyArgs)(nil)).Elem()
}

// A collection of values returned by getScalingPolicy.
type GetScalingPolicyResultOutput struct{ *pulumi.OutputState }

func (GetScalingPolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetScalingPolicyResult)(nil)).Elem()
}

func (o GetScalingPolicyResultOutput) ToGetScalingPolicyResultOutput() GetScalingPolicyResultOutput {
	return o
}

func (o GetScalingPolicyResultOutput) ToGetScalingPolicyResultOutputWithContext(ctx context.Context) GetScalingPolicyResultOutput {
	return o
}

// `(boolean)` - Whether or not the scaling policy is enabled.
func (o GetScalingPolicyResultOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v GetScalingPolicyResult) bool { return v.Enabled }).(pulumi.BoolOutput)
}

func (o GetScalingPolicyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetScalingPolicyResult) string { return v.Id }).(pulumi.StringOutput)
}

// `(integer)` - The maximum value set in the scaling policy.
func (o GetScalingPolicyResultOutput) Max() pulumi.IntOutput {
	return o.ApplyT(func(v GetScalingPolicyResult) int { return v.Max }).(pulumi.IntOutput)
}

// `(integer)` - The minimum value set in the scaling policy.
func (o GetScalingPolicyResultOutput) Min() pulumi.IntOutput {
	return o.ApplyT(func(v GetScalingPolicyResult) int { return v.Min }).(pulumi.IntOutput)
}

// `(string)` - The policy inside the scaling policy.
func (o GetScalingPolicyResultOutput) Policy() pulumi.StringOutput {
	return o.ApplyT(func(v GetScalingPolicyResult) string { return v.Policy }).(pulumi.StringOutput)
}

// `(map[string]string)` - The scaling policy target.
func (o GetScalingPolicyResultOutput) Target() pulumi.MapOutput {
	return o.ApplyT(func(v GetScalingPolicyResult) map[string]interface{} { return v.Target }).(pulumi.MapOutput)
}

// `(string)` - The scaling policy type.
func (o GetScalingPolicyResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v GetScalingPolicyResult) string { return v.Type }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetScalingPolicyResultOutput{})
}
