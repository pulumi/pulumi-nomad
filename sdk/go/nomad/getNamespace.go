// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nomad

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-nomad/sdk/go/nomad/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Get information about a namespace in Nomad.
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
//			_, err := nomad.LookupNamespace(ctx, &nomad.LookupNamespaceArgs{
//				Name: "default",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupNamespace(ctx *pulumi.Context, args *LookupNamespaceArgs, opts ...pulumi.InvokeOption) (*LookupNamespaceResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupNamespaceResult
	err := ctx.Invoke("nomad:index/getNamespace:getNamespace", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNamespace.
type LookupNamespaceArgs struct {
	// `(string)` - The name of the namespace.
	Name string `pulumi:"name"`
}

// A collection of values returned by getNamespace.
type LookupNamespaceResult struct {
	// `(block)` - Capabilities of the namespace
	Capabilities []GetNamespaceCapability `pulumi:"capabilities"`
	// `(string)` - The description of the namespace.
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// `(map[string]string)` -  Arbitrary KV metadata associated with the namespace.
	Meta map[string]string `pulumi:"meta"`
	Name string            `pulumi:"name"`
	// `(string)` - The quota associated with the namespace.
	Quota string `pulumi:"quota"`
}

func LookupNamespaceOutput(ctx *pulumi.Context, args LookupNamespaceOutputArgs, opts ...pulumi.InvokeOption) LookupNamespaceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupNamespaceResult, error) {
			args := v.(LookupNamespaceArgs)
			r, err := LookupNamespace(ctx, &args, opts...)
			var s LookupNamespaceResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupNamespaceResultOutput)
}

// A collection of arguments for invoking getNamespace.
type LookupNamespaceOutputArgs struct {
	// `(string)` - The name of the namespace.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupNamespaceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNamespaceArgs)(nil)).Elem()
}

// A collection of values returned by getNamespace.
type LookupNamespaceResultOutput struct{ *pulumi.OutputState }

func (LookupNamespaceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNamespaceResult)(nil)).Elem()
}

func (o LookupNamespaceResultOutput) ToLookupNamespaceResultOutput() LookupNamespaceResultOutput {
	return o
}

func (o LookupNamespaceResultOutput) ToLookupNamespaceResultOutputWithContext(ctx context.Context) LookupNamespaceResultOutput {
	return o
}

func (o LookupNamespaceResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupNamespaceResult] {
	return pulumix.Output[LookupNamespaceResult]{
		OutputState: o.OutputState,
	}
}

// `(block)` - Capabilities of the namespace
func (o LookupNamespaceResultOutput) Capabilities() GetNamespaceCapabilityArrayOutput {
	return o.ApplyT(func(v LookupNamespaceResult) []GetNamespaceCapability { return v.Capabilities }).(GetNamespaceCapabilityArrayOutput)
}

// `(string)` - The description of the namespace.
func (o LookupNamespaceResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNamespaceResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupNamespaceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNamespaceResult) string { return v.Id }).(pulumi.StringOutput)
}

// `(map[string]string)` -  Arbitrary KV metadata associated with the namespace.
func (o LookupNamespaceResultOutput) Meta() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupNamespaceResult) map[string]string { return v.Meta }).(pulumi.StringMapOutput)
}

func (o LookupNamespaceResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNamespaceResult) string { return v.Name }).(pulumi.StringOutput)
}

// `(string)` - The quota associated with the namespace.
func (o LookupNamespaceResultOutput) Quota() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNamespaceResult) string { return v.Quota }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupNamespaceResultOutput{})
}
