// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nomad

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

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
//			_, err := nomad.LookupAclToken(ctx, &GetAclTokenArgs{
//				AccessorId: "aa534e09-6a07-0a45-2295-a7f77063d429",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupAclToken(ctx *pulumi.Context, args *LookupAclTokenArgs, opts ...pulumi.InvokeOption) (*LookupAclTokenResult, error) {
	var rv LookupAclTokenResult
	err := ctx.Invoke("nomad:index/getAclToken:getAclToken", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAclToken.
type LookupAclTokenArgs struct {
	AccessorId string `pulumi:"accessorId"`
}

// A collection of values returned by getAclToken.
type LookupAclTokenResult struct {
	AccessorId string `pulumi:"accessorId"`
	CreateTime string `pulumi:"createTime"`
	Global     bool   `pulumi:"global"`
	// The provider-assigned unique ID for this managed resource.
	Id       string   `pulumi:"id"`
	Name     string   `pulumi:"name"`
	Policies []string `pulumi:"policies"`
	SecretId string   `pulumi:"secretId"`
	Type     string   `pulumi:"type"`
}

func LookupAclTokenOutput(ctx *pulumi.Context, args LookupAclTokenOutputArgs, opts ...pulumi.InvokeOption) LookupAclTokenResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupAclTokenResult, error) {
			args := v.(LookupAclTokenArgs)
			r, err := LookupAclToken(ctx, &args, opts...)
			var s LookupAclTokenResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupAclTokenResultOutput)
}

// A collection of arguments for invoking getAclToken.
type LookupAclTokenOutputArgs struct {
	AccessorId pulumi.StringInput `pulumi:"accessorId"`
}

func (LookupAclTokenOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAclTokenArgs)(nil)).Elem()
}

// A collection of values returned by getAclToken.
type LookupAclTokenResultOutput struct{ *pulumi.OutputState }

func (LookupAclTokenResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAclTokenResult)(nil)).Elem()
}

func (o LookupAclTokenResultOutput) ToLookupAclTokenResultOutput() LookupAclTokenResultOutput {
	return o
}

func (o LookupAclTokenResultOutput) ToLookupAclTokenResultOutputWithContext(ctx context.Context) LookupAclTokenResultOutput {
	return o
}

func (o LookupAclTokenResultOutput) AccessorId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAclTokenResult) string { return v.AccessorId }).(pulumi.StringOutput)
}

func (o LookupAclTokenResultOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAclTokenResult) string { return v.CreateTime }).(pulumi.StringOutput)
}

func (o LookupAclTokenResultOutput) Global() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupAclTokenResult) bool { return v.Global }).(pulumi.BoolOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAclTokenResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAclTokenResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupAclTokenResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAclTokenResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupAclTokenResultOutput) Policies() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAclTokenResult) []string { return v.Policies }).(pulumi.StringArrayOutput)
}

func (o LookupAclTokenResultOutput) SecretId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAclTokenResult) string { return v.SecretId }).(pulumi.StringOutput)
}

func (o LookupAclTokenResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAclTokenResult) string { return v.Type }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAclTokenResultOutput{})
}
