// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nomad

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-nomad/sdk/v2/go/nomad/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieve a list of node pools available in Nomad.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
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
//			_, err := nomad.GetNodePools(ctx, &nomad.GetNodePoolsArgs{
//				Filter: pulumi.StringRef("Meta.env == \"prod\""),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
func GetNodePools(ctx *pulumi.Context, args *GetNodePoolsArgs, opts ...pulumi.InvokeOption) (*GetNodePoolsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetNodePoolsResult
	err := ctx.Invoke("nomad:index/getNodePools:getNodePools", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNodePools.
type GetNodePoolsArgs struct {
	// `(string)` - Specifies the [expression][nomadApiFilter] used to
	// filter the results.
	Filter *string `pulumi:"filter"`
	// `(string)` - Specifies a string to filter node pools based on a name
	// prefix.
	Prefix *string `pulumi:"prefix"`
}

// A collection of values returned by getNodePools.
type GetNodePoolsResult struct {
	Filter *string `pulumi:"filter"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// `(list of node pools)` - A list of node pools matching the
	// search criteria.
	NodePools []GetNodePoolsNodePool `pulumi:"nodePools"`
	Prefix    *string                `pulumi:"prefix"`
}

func GetNodePoolsOutput(ctx *pulumi.Context, args GetNodePoolsOutputArgs, opts ...pulumi.InvokeOption) GetNodePoolsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetNodePoolsResult, error) {
			args := v.(GetNodePoolsArgs)
			r, err := GetNodePools(ctx, &args, opts...)
			var s GetNodePoolsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetNodePoolsResultOutput)
}

// A collection of arguments for invoking getNodePools.
type GetNodePoolsOutputArgs struct {
	// `(string)` - Specifies the [expression][nomadApiFilter] used to
	// filter the results.
	Filter pulumi.StringPtrInput `pulumi:"filter"`
	// `(string)` - Specifies a string to filter node pools based on a name
	// prefix.
	Prefix pulumi.StringPtrInput `pulumi:"prefix"`
}

func (GetNodePoolsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNodePoolsArgs)(nil)).Elem()
}

// A collection of values returned by getNodePools.
type GetNodePoolsResultOutput struct{ *pulumi.OutputState }

func (GetNodePoolsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNodePoolsResult)(nil)).Elem()
}

func (o GetNodePoolsResultOutput) ToGetNodePoolsResultOutput() GetNodePoolsResultOutput {
	return o
}

func (o GetNodePoolsResultOutput) ToGetNodePoolsResultOutputWithContext(ctx context.Context) GetNodePoolsResultOutput {
	return o
}

func (o GetNodePoolsResultOutput) Filter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNodePoolsResult) *string { return v.Filter }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetNodePoolsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetNodePoolsResult) string { return v.Id }).(pulumi.StringOutput)
}

// `(list of node pools)` - A list of node pools matching the
// search criteria.
func (o GetNodePoolsResultOutput) NodePools() GetNodePoolsNodePoolArrayOutput {
	return o.ApplyT(func(v GetNodePoolsResult) []GetNodePoolsNodePool { return v.NodePools }).(GetNodePoolsNodePoolArrayOutput)
}

func (o GetNodePoolsResultOutput) Prefix() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNodePoolsResult) *string { return v.Prefix }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetNodePoolsResultOutput{})
}
