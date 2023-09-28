// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nomad

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-nomad/sdk/v2/go/nomad/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Get information about a node pool in Nomad.
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
//			_, err := nomad.LookupNodePool(ctx, &nomad.LookupNodePoolArgs{
//				Name: "dev",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupNodePool(ctx *pulumi.Context, args *LookupNodePoolArgs, opts ...pulumi.InvokeOption) (*LookupNodePoolResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupNodePoolResult
	err := ctx.Invoke("nomad:index/getNodePool:getNodePool", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNodePool.
type LookupNodePoolArgs struct {
	// `(string)` - The name of the node pool to fetch.
	Name string `pulumi:"name"`
}

// A collection of values returned by getNodePool.
type LookupNodePoolResult struct {
	// `(string)` - The description of the node pool.
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// `(map[string]string)` - Arbitrary KV metadata associated with the
	// node pool.
	Meta map[string]string `pulumi:"meta"`
	Name string            `pulumi:"name"`
	// `(block)` - Scheduler configuration for the node pool.
	SchedulerConfigs []GetNodePoolSchedulerConfig `pulumi:"schedulerConfigs"`
}

func LookupNodePoolOutput(ctx *pulumi.Context, args LookupNodePoolOutputArgs, opts ...pulumi.InvokeOption) LookupNodePoolResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupNodePoolResult, error) {
			args := v.(LookupNodePoolArgs)
			r, err := LookupNodePool(ctx, &args, opts...)
			var s LookupNodePoolResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupNodePoolResultOutput)
}

// A collection of arguments for invoking getNodePool.
type LookupNodePoolOutputArgs struct {
	// `(string)` - The name of the node pool to fetch.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupNodePoolOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNodePoolArgs)(nil)).Elem()
}

// A collection of values returned by getNodePool.
type LookupNodePoolResultOutput struct{ *pulumi.OutputState }

func (LookupNodePoolResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNodePoolResult)(nil)).Elem()
}

func (o LookupNodePoolResultOutput) ToLookupNodePoolResultOutput() LookupNodePoolResultOutput {
	return o
}

func (o LookupNodePoolResultOutput) ToLookupNodePoolResultOutputWithContext(ctx context.Context) LookupNodePoolResultOutput {
	return o
}

func (o LookupNodePoolResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupNodePoolResult] {
	return pulumix.Output[LookupNodePoolResult]{
		OutputState: o.OutputState,
	}
}

// `(string)` - The description of the node pool.
func (o LookupNodePoolResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodePoolResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupNodePoolResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodePoolResult) string { return v.Id }).(pulumi.StringOutput)
}

// `(map[string]string)` - Arbitrary KV metadata associated with the
// node pool.
func (o LookupNodePoolResultOutput) Meta() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupNodePoolResult) map[string]string { return v.Meta }).(pulumi.StringMapOutput)
}

func (o LookupNodePoolResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodePoolResult) string { return v.Name }).(pulumi.StringOutput)
}

// `(block)` - Scheduler configuration for the node pool.
func (o LookupNodePoolResultOutput) SchedulerConfigs() GetNodePoolSchedulerConfigArrayOutput {
	return o.ApplyT(func(v LookupNodePoolResult) []GetNodePoolSchedulerConfig { return v.SchedulerConfigs }).(GetNodePoolSchedulerConfigArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupNodePoolResultOutput{})
}