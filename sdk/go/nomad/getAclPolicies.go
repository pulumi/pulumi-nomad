// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package nomad

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieve a list of ACL Policies.
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
// 		opt0 := "prod"
// 		_, err := nomad.GetAclPolicies(ctx, &nomad.GetAclPoliciesArgs{
// 			Prefix: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func GetAclPolicies(ctx *pulumi.Context, args *GetAclPoliciesArgs, opts ...pulumi.InvokeOption) (*GetAclPoliciesResult, error) {
	var rv GetAclPoliciesResult
	err := ctx.Invoke("nomad:index/getAclPolicies:getAclPolicies", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAclPolicies.
type GetAclPoliciesArgs struct {
	Prefix *string `pulumi:"prefix"`
}

// A collection of values returned by getAclPolicies.
type GetAclPoliciesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id       string                 `pulumi:"id"`
	Policies []GetAclPoliciesPolicy `pulumi:"policies"`
	Prefix   *string                `pulumi:"prefix"`
}