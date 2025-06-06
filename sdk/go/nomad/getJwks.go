// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nomad

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-nomad/sdk/v2/go/nomad/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieve the cluster JWKS public keys.
//
// The keys are returned both as a list of maps (`keys`), and as a list of PEM-encoded strings
// (`pemKeys`), which may be more convenient for use.
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
//			_, err := nomad.GetJwks(ctx, map[string]interface{}{}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetJwks(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetJwksResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetJwksResult
	err := ctx.Invoke("nomad:index/getJwks:getJwks", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getJwks.
type GetJwksResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// `list of maps` a list of JWK keys in structured format: see [RFC7517](https://datatracker.ietf.org/doc/html/rfc7517) for the
	// JWK field meanings.
	Keys []GetJwksKey `pulumi:"keys"`
	// `list of strings` a list JWK keys rendered as PEM-encoded X.509 keys
	PemKeys []string `pulumi:"pemKeys"`
}

func GetJwksOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetJwksResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetJwksResultOutput, error) {
		options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
		return ctx.InvokeOutput("nomad:index/getJwks:getJwks", nil, GetJwksResultOutput{}, options).(GetJwksResultOutput), nil
	}).(GetJwksResultOutput)
}

// A collection of values returned by getJwks.
type GetJwksResultOutput struct{ *pulumi.OutputState }

func (GetJwksResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetJwksResult)(nil)).Elem()
}

func (o GetJwksResultOutput) ToGetJwksResultOutput() GetJwksResultOutput {
	return o
}

func (o GetJwksResultOutput) ToGetJwksResultOutputWithContext(ctx context.Context) GetJwksResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetJwksResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetJwksResult) string { return v.Id }).(pulumi.StringOutput)
}

// `list of maps` a list of JWK keys in structured format: see [RFC7517](https://datatracker.ietf.org/doc/html/rfc7517) for the
// JWK field meanings.
func (o GetJwksResultOutput) Keys() GetJwksKeyArrayOutput {
	return o.ApplyT(func(v GetJwksResult) []GetJwksKey { return v.Keys }).(GetJwksKeyArrayOutput)
}

// `list of strings` a list JWK keys rendered as PEM-encoded X.509 keys
func (o GetJwksResultOutput) PemKeys() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetJwksResult) []string { return v.PemKeys }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetJwksResultOutput{})
}
