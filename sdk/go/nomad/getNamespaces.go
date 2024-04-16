// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nomad

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-nomad/sdk/v2/go/nomad/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieve a list of namespaces available in Nomad.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-nomad/sdk/v2/go/nomad"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			namespaces, err := nomad.GetNamespaces(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			var namespace []*nomad.AclPolicy
//			for index := 0; index < len(namespaces.Namespaces); index++ {
//				key0 := index
//				val0 := index
//				__res, err := nomad.NewAclPolicy(ctx, fmt.Sprintf("namespace-%v", key0), &nomad.AclPolicyArgs{
//					Name:        pulumi.String(fmt.Sprintf("namespace-%v", namespaces[val0])),
//					Description: pulumi.String(fmt.Sprintf("Write to the namespace %v", namespaces[val0])),
//					RulesHcl:    pulumi.String(fmt.Sprintf("namespace \"%v\" {\n  policy = \"write\"\n}\n", namespaces[val0])),
//				})
//				if err != nil {
//					return err
//				}
//				namespace = append(namespace, __res)
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
func GetNamespaces(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetNamespacesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetNamespacesResult
	err := ctx.Invoke("nomad:index/getNamespaces:getNamespaces", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getNamespaces.
type GetNamespacesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// `(list of strings)` - a list of namespaces available in the cluster.
	Namespaces []string `pulumi:"namespaces"`
}

func GetNamespacesOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetNamespacesResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetNamespacesResult, error) {
		r, err := GetNamespaces(ctx, opts...)
		var s GetNamespacesResult
		if r != nil {
			s = *r
		}
		return s, err
	}).(GetNamespacesResultOutput)
}

// A collection of values returned by getNamespaces.
type GetNamespacesResultOutput struct{ *pulumi.OutputState }

func (GetNamespacesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNamespacesResult)(nil)).Elem()
}

func (o GetNamespacesResultOutput) ToGetNamespacesResultOutput() GetNamespacesResultOutput {
	return o
}

func (o GetNamespacesResultOutput) ToGetNamespacesResultOutputWithContext(ctx context.Context) GetNamespacesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetNamespacesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetNamespacesResult) string { return v.Id }).(pulumi.StringOutput)
}

// `(list of strings)` - a list of namespaces available in the cluster.
func (o GetNamespacesResultOutput) Namespaces() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetNamespacesResult) []string { return v.Namespaces }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetNamespacesResultOutput{})
}
