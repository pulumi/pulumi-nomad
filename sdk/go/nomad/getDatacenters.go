// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nomad

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-nomad/sdk/v2/go/nomad/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieve a list of datacenters.
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
//			_, err := nomad.GetDatacenters(ctx, &nomad.GetDatacentersArgs{
//				Prefix:          pulumi.StringRef("prod"),
//				IgnoreDownNodes: pulumi.BoolRef(true),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetDatacenters(ctx *pulumi.Context, args *GetDatacentersArgs, opts ...pulumi.InvokeOption) (*GetDatacentersResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetDatacentersResult
	err := ctx.Invoke("nomad:index/getDatacenters:getDatacenters", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDatacenters.
type GetDatacentersArgs struct {
	// `(bool: false)`: An optional flag that, if set to `true` will ignore down nodes when compiling the list of datacenters.
	IgnoreDownNodes *bool `pulumi:"ignoreDownNodes"`
	// `(string)`: An optional string to filter datacenters based on name prefix. If not provided, all datacenters are returned.
	Prefix *string `pulumi:"prefix"`
}

// A collection of values returned by getDatacenters.
type GetDatacentersResult struct {
	// `list(string)` a list of datacenters.
	Datacenters []string `pulumi:"datacenters"`
	// The provider-assigned unique ID for this managed resource.
	Id              string  `pulumi:"id"`
	IgnoreDownNodes *bool   `pulumi:"ignoreDownNodes"`
	Prefix          *string `pulumi:"prefix"`
}

func GetDatacentersOutput(ctx *pulumi.Context, args GetDatacentersOutputArgs, opts ...pulumi.InvokeOption) GetDatacentersResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetDatacentersResultOutput, error) {
			args := v.(GetDatacentersArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("nomad:index/getDatacenters:getDatacenters", args, GetDatacentersResultOutput{}, options).(GetDatacentersResultOutput), nil
		}).(GetDatacentersResultOutput)
}

// A collection of arguments for invoking getDatacenters.
type GetDatacentersOutputArgs struct {
	// `(bool: false)`: An optional flag that, if set to `true` will ignore down nodes when compiling the list of datacenters.
	IgnoreDownNodes pulumi.BoolPtrInput `pulumi:"ignoreDownNodes"`
	// `(string)`: An optional string to filter datacenters based on name prefix. If not provided, all datacenters are returned.
	Prefix pulumi.StringPtrInput `pulumi:"prefix"`
}

func (GetDatacentersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDatacentersArgs)(nil)).Elem()
}

// A collection of values returned by getDatacenters.
type GetDatacentersResultOutput struct{ *pulumi.OutputState }

func (GetDatacentersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDatacentersResult)(nil)).Elem()
}

func (o GetDatacentersResultOutput) ToGetDatacentersResultOutput() GetDatacentersResultOutput {
	return o
}

func (o GetDatacentersResultOutput) ToGetDatacentersResultOutputWithContext(ctx context.Context) GetDatacentersResultOutput {
	return o
}

// `list(string)` a list of datacenters.
func (o GetDatacentersResultOutput) Datacenters() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDatacentersResult) []string { return v.Datacenters }).(pulumi.StringArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDatacentersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDatacentersResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetDatacentersResultOutput) IgnoreDownNodes() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetDatacentersResult) *bool { return v.IgnoreDownNodes }).(pulumi.BoolPtrOutput)
}

func (o GetDatacentersResultOutput) Prefix() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDatacentersResult) *string { return v.Prefix }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDatacentersResultOutput{})
}
