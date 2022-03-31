// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package nomad

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get a list of ACL tokens.
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
// 		_, err := nomad.GetAclTokens(ctx, &GetAclTokensArgs{
// 			Prefix: pulumi.StringRef("a242"),
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func GetAclTokens(ctx *pulumi.Context, args *GetAclTokensArgs, opts ...pulumi.InvokeOption) (*GetAclTokensResult, error) {
	var rv GetAclTokensResult
	err := ctx.Invoke("nomad:index/getAclTokens:getAclTokens", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAclTokens.
type GetAclTokensArgs struct {
	Prefix *string `pulumi:"prefix"`
}

// A collection of values returned by getAclTokens.
type GetAclTokensResult struct {
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
			return *r, err
		}).(GetAclTokensResultOutput)
}

// A collection of arguments for invoking getAclTokens.
type GetAclTokensOutputArgs struct {
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
