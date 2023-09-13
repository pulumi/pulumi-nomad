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

// Get a list of ACL tokens.
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
//			_, err := nomad.GetAclTokens(ctx, &nomad.GetAclTokensArgs{
//				Prefix: pulumi.StringRef("a242"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetAclTokens(ctx *pulumi.Context, args *GetAclTokensArgs, opts ...pulumi.InvokeOption) (*GetAclTokensResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAclTokensResult
	err := ctx.Invoke("nomad:index/getAclTokens:getAclTokens", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAclTokens.
type GetAclTokensArgs struct {
	// `(string)` Optional prefix to filter the tokens.
	Prefix *string `pulumi:"prefix"`
}

// A collection of values returned by getAclTokens.
type GetAclTokensResult struct {
	// `(list of objects)` The list of tokens found in the given prefix.
	AclTokens []GetAclTokensAclToken `pulumi:"aclTokens"`
	// The provider-assigned unique ID for this managed resource.
	Id     string  `pulumi:"id"`
	Prefix *string `pulumi:"prefix"`
}

func GetAclTokensOutput(ctx *pulumi.Context, args GetAclTokensOutputArgs, opts ...pulumi.InvokeOption) GetAclTokensResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAclTokensResult, error) {
			args := v.(GetAclTokensArgs)
			r, err := GetAclTokens(ctx, &args, opts...)
			var s GetAclTokensResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetAclTokensResultOutput)
}

// A collection of arguments for invoking getAclTokens.
type GetAclTokensOutputArgs struct {
	// `(string)` Optional prefix to filter the tokens.
	Prefix pulumi.StringPtrInput `pulumi:"prefix"`
}

func (GetAclTokensOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAclTokensArgs)(nil)).Elem()
}

// A collection of values returned by getAclTokens.
type GetAclTokensResultOutput struct{ *pulumi.OutputState }

func (GetAclTokensResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAclTokensResult)(nil)).Elem()
}

func (o GetAclTokensResultOutput) ToGetAclTokensResultOutput() GetAclTokensResultOutput {
	return o
}

func (o GetAclTokensResultOutput) ToGetAclTokensResultOutputWithContext(ctx context.Context) GetAclTokensResultOutput {
	return o
}

func (o GetAclTokensResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetAclTokensResult] {
	return pulumix.Output[GetAclTokensResult]{
		OutputState: o.OutputState,
	}
}

// `(list of objects)` The list of tokens found in the given prefix.
func (o GetAclTokensResultOutput) AclTokens() GetAclTokensAclTokenArrayOutput {
	return o.ApplyT(func(v GetAclTokensResult) []GetAclTokensAclToken { return v.AclTokens }).(GetAclTokensAclTokenArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAclTokensResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAclTokensResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetAclTokensResultOutput) Prefix() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAclTokensResult) *string { return v.Prefix }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAclTokensResultOutput{})
}
