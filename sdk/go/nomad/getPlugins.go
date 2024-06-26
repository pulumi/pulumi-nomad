// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nomad

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-nomad/sdk/v2/go/nomad/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieve a list of dynamic plugins in Nomad.
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
//			_, err := nomad.GetPlugins(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetPlugins(ctx *pulumi.Context, args *GetPluginsArgs, opts ...pulumi.InvokeOption) (*GetPluginsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetPluginsResult
	err := ctx.Invoke("nomad:index/getPlugins:getPlugins", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPlugins.
type GetPluginsArgs struct {
	Type *string `pulumi:"type"`
}

// A collection of values returned by getPlugins.
type GetPluginsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// `(list of maps)` a list of dynamic plugins registered in the cluster.
	Plugins []map[string]interface{} `pulumi:"plugins"`
	Type    *string                  `pulumi:"type"`
}

func GetPluginsOutput(ctx *pulumi.Context, args GetPluginsOutputArgs, opts ...pulumi.InvokeOption) GetPluginsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetPluginsResult, error) {
			args := v.(GetPluginsArgs)
			r, err := GetPlugins(ctx, &args, opts...)
			var s GetPluginsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetPluginsResultOutput)
}

// A collection of arguments for invoking getPlugins.
type GetPluginsOutputArgs struct {
	Type pulumi.StringPtrInput `pulumi:"type"`
}

func (GetPluginsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPluginsArgs)(nil)).Elem()
}

// A collection of values returned by getPlugins.
type GetPluginsResultOutput struct{ *pulumi.OutputState }

func (GetPluginsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPluginsResult)(nil)).Elem()
}

func (o GetPluginsResultOutput) ToGetPluginsResultOutput() GetPluginsResultOutput {
	return o
}

func (o GetPluginsResultOutput) ToGetPluginsResultOutputWithContext(ctx context.Context) GetPluginsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetPluginsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetPluginsResult) string { return v.Id }).(pulumi.StringOutput)
}

// `(list of maps)` a list of dynamic plugins registered in the cluster.
func (o GetPluginsResultOutput) Plugins() pulumi.MapArrayOutput {
	return o.ApplyT(func(v GetPluginsResult) []map[string]interface{} { return v.Plugins }).(pulumi.MapArrayOutput)
}

func (o GetPluginsResultOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPluginsResult) *string { return v.Type }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetPluginsResultOutput{})
}
