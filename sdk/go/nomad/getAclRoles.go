// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nomad

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieve a list of ACL Roles.
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
//			_, err := nomad.GetAclRoles(ctx, &nomad.GetAclRolesArgs{
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
func GetAclRoles(ctx *pulumi.Context, args *GetAclRolesArgs, opts ...pulumi.InvokeOption) (*GetAclRolesResult, error) {
	var rv GetAclRolesResult
	err := ctx.Invoke("nomad:index/getAclRoles:getAclRoles", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAclRoles.
type GetAclRolesArgs struct {
	// `(string)` An optional string to filter ACL Roles based on ID
	// prefix. If not provided, all policies are returned.
	Prefix *string `pulumi:"prefix"`
}

// A collection of values returned by getAclRoles.
type GetAclRolesResult struct {
	AclRoles []GetAclRolesAclRole `pulumi:"aclRoles"`
	// The provider-assigned unique ID for this managed resource.
	Id     string  `pulumi:"id"`
	Prefix *string `pulumi:"prefix"`
}

func GetAclRolesOutput(ctx *pulumi.Context, args GetAclRolesOutputArgs, opts ...pulumi.InvokeOption) GetAclRolesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAclRolesResult, error) {
			args := v.(GetAclRolesArgs)
			r, err := GetAclRoles(ctx, &args, opts...)
			var s GetAclRolesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetAclRolesResultOutput)
}

// A collection of arguments for invoking getAclRoles.
type GetAclRolesOutputArgs struct {
	// `(string)` An optional string to filter ACL Roles based on ID
	// prefix. If not provided, all policies are returned.
	Prefix pulumi.StringPtrInput `pulumi:"prefix"`
}

func (GetAclRolesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAclRolesArgs)(nil)).Elem()
}

// A collection of values returned by getAclRoles.
type GetAclRolesResultOutput struct{ *pulumi.OutputState }

func (GetAclRolesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAclRolesResult)(nil)).Elem()
}

func (o GetAclRolesResultOutput) ToGetAclRolesResultOutput() GetAclRolesResultOutput {
	return o
}

func (o GetAclRolesResultOutput) ToGetAclRolesResultOutputWithContext(ctx context.Context) GetAclRolesResultOutput {
	return o
}

func (o GetAclRolesResultOutput) AclRoles() GetAclRolesAclRoleArrayOutput {
	return o.ApplyT(func(v GetAclRolesResult) []GetAclRolesAclRole { return v.AclRoles }).(GetAclRolesAclRoleArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAclRolesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAclRolesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetAclRolesResultOutput) Prefix() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAclRolesResult) *string { return v.Prefix }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAclRolesResultOutput{})
}
