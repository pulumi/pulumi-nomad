// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nomad

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieve information on an ACL Policy.
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
//			_, err := nomad.LookupAclPolicy(ctx, &nomad.LookupAclPolicyArgs{
//				Name: "my-policy",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupAclPolicy(ctx *pulumi.Context, args *LookupAclPolicyArgs, opts ...pulumi.InvokeOption) (*LookupAclPolicyResult, error) {
	var rv LookupAclPolicyResult
	err := ctx.Invoke("nomad:index/getAclPolicy:getAclPolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAclPolicy.
type LookupAclPolicyArgs struct {
	// `(string)` - the name of the ACL Policy.
	Name string `pulumi:"name"`
}

// A collection of values returned by getAclPolicy.
type LookupAclPolicyResult struct {
	// `(string)` - the description of the ACL Policy.
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// `(string)` - the name of the ACL Policy.
	Name string `pulumi:"name"`
	// `(string)` - the ACL Policy rules in HCL format.
	Rules string `pulumi:"rules"`
}

func LookupAclPolicyOutput(ctx *pulumi.Context, args LookupAclPolicyOutputArgs, opts ...pulumi.InvokeOption) LookupAclPolicyResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupAclPolicyResult, error) {
			args := v.(LookupAclPolicyArgs)
			r, err := LookupAclPolicy(ctx, &args, opts...)
			var s LookupAclPolicyResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupAclPolicyResultOutput)
}

// A collection of arguments for invoking getAclPolicy.
type LookupAclPolicyOutputArgs struct {
	// `(string)` - the name of the ACL Policy.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupAclPolicyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAclPolicyArgs)(nil)).Elem()
}

// A collection of values returned by getAclPolicy.
type LookupAclPolicyResultOutput struct{ *pulumi.OutputState }

func (LookupAclPolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAclPolicyResult)(nil)).Elem()
}

func (o LookupAclPolicyResultOutput) ToLookupAclPolicyResultOutput() LookupAclPolicyResultOutput {
	return o
}

func (o LookupAclPolicyResultOutput) ToLookupAclPolicyResultOutputWithContext(ctx context.Context) LookupAclPolicyResultOutput {
	return o
}

// `(string)` - the description of the ACL Policy.
func (o LookupAclPolicyResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAclPolicyResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAclPolicyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAclPolicyResult) string { return v.Id }).(pulumi.StringOutput)
}

// `(string)` - the name of the ACL Policy.
func (o LookupAclPolicyResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAclPolicyResult) string { return v.Name }).(pulumi.StringOutput)
}

// `(string)` - the ACL Policy rules in HCL format.
func (o LookupAclPolicyResultOutput) Rules() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAclPolicyResult) string { return v.Rules }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAclPolicyResultOutput{})
}
