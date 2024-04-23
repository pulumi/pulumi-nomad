// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nomad

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-nomad/sdk/v2/go/nomad/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieve the cluster's [scheduler configuration](https://www.nomadproject.io/api-docs/operator#sample-response-3).
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
//			_, err := nomad.GetSchedulerPolicy(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetSchedulerPolicy(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetSchedulerPolicyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSchedulerPolicyResult
	err := ctx.Invoke("nomad:index/getSchedulerPolicy:getSchedulerPolicy", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getSchedulerPolicy.
type GetSchedulerPolicyResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// `(bool: false)` - When `true`, tasks may exceed their reserved memory limit.
	MemoryOversubscriptionEnabled bool `pulumi:"memoryOversubscriptionEnabled"`
	// `(map[string]bool)` - Options to enable preemption for various schedulers.
	PreemptionConfig map[string]bool `pulumi:"preemptionConfig"`
	// `(string)` - Specifies whether scheduler binpacks or spreads allocations on available nodes.
	SchedulerAlgorithm string `pulumi:"schedulerAlgorithm"`
}

func GetSchedulerPolicyOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetSchedulerPolicyResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetSchedulerPolicyResult, error) {
		r, err := GetSchedulerPolicy(ctx, opts...)
		var s GetSchedulerPolicyResult
		if r != nil {
			s = *r
		}
		return s, err
	}).(GetSchedulerPolicyResultOutput)
}

// A collection of values returned by getSchedulerPolicy.
type GetSchedulerPolicyResultOutput struct{ *pulumi.OutputState }

func (GetSchedulerPolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSchedulerPolicyResult)(nil)).Elem()
}

func (o GetSchedulerPolicyResultOutput) ToGetSchedulerPolicyResultOutput() GetSchedulerPolicyResultOutput {
	return o
}

func (o GetSchedulerPolicyResultOutput) ToGetSchedulerPolicyResultOutputWithContext(ctx context.Context) GetSchedulerPolicyResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetSchedulerPolicyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSchedulerPolicyResult) string { return v.Id }).(pulumi.StringOutput)
}

// `(bool: false)` - When `true`, tasks may exceed their reserved memory limit.
func (o GetSchedulerPolicyResultOutput) MemoryOversubscriptionEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v GetSchedulerPolicyResult) bool { return v.MemoryOversubscriptionEnabled }).(pulumi.BoolOutput)
}

// `(map[string]bool)` - Options to enable preemption for various schedulers.
func (o GetSchedulerPolicyResultOutput) PreemptionConfig() pulumi.BoolMapOutput {
	return o.ApplyT(func(v GetSchedulerPolicyResult) map[string]bool { return v.PreemptionConfig }).(pulumi.BoolMapOutput)
}

// `(string)` - Specifies whether scheduler binpacks or spreads allocations on available nodes.
func (o GetSchedulerPolicyResultOutput) SchedulerAlgorithm() pulumi.StringOutput {
	return o.ApplyT(func(v GetSchedulerPolicyResult) string { return v.SchedulerAlgorithm }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSchedulerPolicyResultOutput{})
}
