// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nomad

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-nomad/sdk/v2/go/nomad/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// Creating a token with limited policies:
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
//			_, err := nomad.NewAclToken(ctx, "dakota", &nomad.AclTokenArgs{
//				Policies: pulumi.StringArray{
//					pulumi.String("dev"),
//					pulumi.String("qa"),
//				},
//				Type: pulumi.String("client"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// Creating a global token that will be replicated to all regions:
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
//			_, err := nomad.NewAclToken(ctx, "dakota", &nomad.AclTokenArgs{
//				Global: pulumi.Bool(true),
//				Policies: pulumi.StringArray{
//					pulumi.String("dev"),
//					pulumi.String("qa"),
//				},
//				Type: pulumi.String("client"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// Creating a token with full access to the cluster:
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
//			_, err := nomad.NewAclToken(ctx, "iman", &nomad.AclTokenArgs{
//				Type: pulumi.String("management"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// Accessing the token:
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
//			token, err := nomad.NewAclToken(ctx, "token", &nomad.AclTokenArgs{
//				Type: pulumi.String("client"),
//				Policies: pulumi.StringArray{
//					pulumi.String("dev"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("nomadToken", token.SecretId)
//			return nil
//		})
//	}
//
// ```
type AclToken struct {
	pulumi.CustomResourceState

	// `(string)` - A non-sensitive identifier for this token that
	// can be logged and shared safely without granting any access to the cluster.
	AccessorId pulumi.StringOutput `pulumi:"accessorId"`
	// `(string)` - The timestamp the token was created.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// `(string)` - The timestamp after which the token is
	// considered expired and eligible for destruction.
	ExpirationTime pulumi.StringOutput `pulumi:"expirationTime"`
	// `(string: "")` - Provides a TTL for the token in the form of
	// a time duration such as `"5m"` or `"1h"`.
	//
	// In addition to the above arguments, the following attributes are exported and
	// can be referenced:
	ExpirationTtl pulumi.StringPtrOutput `pulumi:"expirationTtl"`
	// `(bool: false)` - Whether the token should be replicated to all
	// regions, or if it will only be used in the region it was created in.
	Global pulumi.BoolPtrOutput `pulumi:"global"`
	// `(string: "")` - A human-friendly name for this token.
	Name pulumi.StringOutput `pulumi:"name"`
	// `(set: [])` - A set of policy names to associate with this
	// token. Must be set on `client`-type tokens, must not be set on
	// `management`-type tokens. Policies do not need to exist before being
	// used here.
	Policies pulumi.StringArrayOutput `pulumi:"policies"`
	// `(set: [])` - The list of roles attached to the token. Each entry has
	// `name` and `id` attributes. It may be used multiple times.
	Roles AclTokenRoleArrayOutput `pulumi:"roles"`
	// `(string)` - The token value itself, which is presented for
	// access to the cluster.
	SecretId pulumi.StringOutput `pulumi:"secretId"`
	// `(string: <required>)` - The type of token this is. Use `client`
	// for tokens that will have policies associated with them. Use `management`
	// for tokens that can perform any action.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewAclToken registers a new resource with the given unique name, arguments, and options.
func NewAclToken(ctx *pulumi.Context,
	name string, args *AclTokenArgs, opts ...pulumi.ResourceOption) (*AclToken, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"secretId",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AclToken
	err := ctx.RegisterResource("nomad:index/aclToken:AclToken", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAclToken gets an existing AclToken resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAclToken(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AclTokenState, opts ...pulumi.ResourceOption) (*AclToken, error) {
	var resource AclToken
	err := ctx.ReadResource("nomad:index/aclToken:AclToken", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AclToken resources.
type aclTokenState struct {
	// `(string)` - A non-sensitive identifier for this token that
	// can be logged and shared safely without granting any access to the cluster.
	AccessorId *string `pulumi:"accessorId"`
	// `(string)` - The timestamp the token was created.
	CreateTime *string `pulumi:"createTime"`
	// `(string)` - The timestamp after which the token is
	// considered expired and eligible for destruction.
	ExpirationTime *string `pulumi:"expirationTime"`
	// `(string: "")` - Provides a TTL for the token in the form of
	// a time duration such as `"5m"` or `"1h"`.
	//
	// In addition to the above arguments, the following attributes are exported and
	// can be referenced:
	ExpirationTtl *string `pulumi:"expirationTtl"`
	// `(bool: false)` - Whether the token should be replicated to all
	// regions, or if it will only be used in the region it was created in.
	Global *bool `pulumi:"global"`
	// `(string: "")` - A human-friendly name for this token.
	Name *string `pulumi:"name"`
	// `(set: [])` - A set of policy names to associate with this
	// token. Must be set on `client`-type tokens, must not be set on
	// `management`-type tokens. Policies do not need to exist before being
	// used here.
	Policies []string `pulumi:"policies"`
	// `(set: [])` - The list of roles attached to the token. Each entry has
	// `name` and `id` attributes. It may be used multiple times.
	Roles []AclTokenRole `pulumi:"roles"`
	// `(string)` - The token value itself, which is presented for
	// access to the cluster.
	SecretId *string `pulumi:"secretId"`
	// `(string: <required>)` - The type of token this is. Use `client`
	// for tokens that will have policies associated with them. Use `management`
	// for tokens that can perform any action.
	Type *string `pulumi:"type"`
}

type AclTokenState struct {
	// `(string)` - A non-sensitive identifier for this token that
	// can be logged and shared safely without granting any access to the cluster.
	AccessorId pulumi.StringPtrInput
	// `(string)` - The timestamp the token was created.
	CreateTime pulumi.StringPtrInput
	// `(string)` - The timestamp after which the token is
	// considered expired and eligible for destruction.
	ExpirationTime pulumi.StringPtrInput
	// `(string: "")` - Provides a TTL for the token in the form of
	// a time duration such as `"5m"` or `"1h"`.
	//
	// In addition to the above arguments, the following attributes are exported and
	// can be referenced:
	ExpirationTtl pulumi.StringPtrInput
	// `(bool: false)` - Whether the token should be replicated to all
	// regions, or if it will only be used in the region it was created in.
	Global pulumi.BoolPtrInput
	// `(string: "")` - A human-friendly name for this token.
	Name pulumi.StringPtrInput
	// `(set: [])` - A set of policy names to associate with this
	// token. Must be set on `client`-type tokens, must not be set on
	// `management`-type tokens. Policies do not need to exist before being
	// used here.
	Policies pulumi.StringArrayInput
	// `(set: [])` - The list of roles attached to the token. Each entry has
	// `name` and `id` attributes. It may be used multiple times.
	Roles AclTokenRoleArrayInput
	// `(string)` - The token value itself, which is presented for
	// access to the cluster.
	SecretId pulumi.StringPtrInput
	// `(string: <required>)` - The type of token this is. Use `client`
	// for tokens that will have policies associated with them. Use `management`
	// for tokens that can perform any action.
	Type pulumi.StringPtrInput
}

func (AclTokenState) ElementType() reflect.Type {
	return reflect.TypeOf((*aclTokenState)(nil)).Elem()
}

type aclTokenArgs struct {
	// `(string: "")` - Provides a TTL for the token in the form of
	// a time duration such as `"5m"` or `"1h"`.
	//
	// In addition to the above arguments, the following attributes are exported and
	// can be referenced:
	ExpirationTtl *string `pulumi:"expirationTtl"`
	// `(bool: false)` - Whether the token should be replicated to all
	// regions, or if it will only be used in the region it was created in.
	Global *bool `pulumi:"global"`
	// `(string: "")` - A human-friendly name for this token.
	Name *string `pulumi:"name"`
	// `(set: [])` - A set of policy names to associate with this
	// token. Must be set on `client`-type tokens, must not be set on
	// `management`-type tokens. Policies do not need to exist before being
	// used here.
	Policies []string `pulumi:"policies"`
	// `(set: [])` - The list of roles attached to the token. Each entry has
	// `name` and `id` attributes. It may be used multiple times.
	Roles []AclTokenRole `pulumi:"roles"`
	// `(string: <required>)` - The type of token this is. Use `client`
	// for tokens that will have policies associated with them. Use `management`
	// for tokens that can perform any action.
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a AclToken resource.
type AclTokenArgs struct {
	// `(string: "")` - Provides a TTL for the token in the form of
	// a time duration such as `"5m"` or `"1h"`.
	//
	// In addition to the above arguments, the following attributes are exported and
	// can be referenced:
	ExpirationTtl pulumi.StringPtrInput
	// `(bool: false)` - Whether the token should be replicated to all
	// regions, or if it will only be used in the region it was created in.
	Global pulumi.BoolPtrInput
	// `(string: "")` - A human-friendly name for this token.
	Name pulumi.StringPtrInput
	// `(set: [])` - A set of policy names to associate with this
	// token. Must be set on `client`-type tokens, must not be set on
	// `management`-type tokens. Policies do not need to exist before being
	// used here.
	Policies pulumi.StringArrayInput
	// `(set: [])` - The list of roles attached to the token. Each entry has
	// `name` and `id` attributes. It may be used multiple times.
	Roles AclTokenRoleArrayInput
	// `(string: <required>)` - The type of token this is. Use `client`
	// for tokens that will have policies associated with them. Use `management`
	// for tokens that can perform any action.
	Type pulumi.StringInput
}

func (AclTokenArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*aclTokenArgs)(nil)).Elem()
}

type AclTokenInput interface {
	pulumi.Input

	ToAclTokenOutput() AclTokenOutput
	ToAclTokenOutputWithContext(ctx context.Context) AclTokenOutput
}

func (*AclToken) ElementType() reflect.Type {
	return reflect.TypeOf((**AclToken)(nil)).Elem()
}

func (i *AclToken) ToAclTokenOutput() AclTokenOutput {
	return i.ToAclTokenOutputWithContext(context.Background())
}

func (i *AclToken) ToAclTokenOutputWithContext(ctx context.Context) AclTokenOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AclTokenOutput)
}

// AclTokenArrayInput is an input type that accepts AclTokenArray and AclTokenArrayOutput values.
// You can construct a concrete instance of `AclTokenArrayInput` via:
//
//	AclTokenArray{ AclTokenArgs{...} }
type AclTokenArrayInput interface {
	pulumi.Input

	ToAclTokenArrayOutput() AclTokenArrayOutput
	ToAclTokenArrayOutputWithContext(context.Context) AclTokenArrayOutput
}

type AclTokenArray []AclTokenInput

func (AclTokenArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AclToken)(nil)).Elem()
}

func (i AclTokenArray) ToAclTokenArrayOutput() AclTokenArrayOutput {
	return i.ToAclTokenArrayOutputWithContext(context.Background())
}

func (i AclTokenArray) ToAclTokenArrayOutputWithContext(ctx context.Context) AclTokenArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AclTokenArrayOutput)
}

// AclTokenMapInput is an input type that accepts AclTokenMap and AclTokenMapOutput values.
// You can construct a concrete instance of `AclTokenMapInput` via:
//
//	AclTokenMap{ "key": AclTokenArgs{...} }
type AclTokenMapInput interface {
	pulumi.Input

	ToAclTokenMapOutput() AclTokenMapOutput
	ToAclTokenMapOutputWithContext(context.Context) AclTokenMapOutput
}

type AclTokenMap map[string]AclTokenInput

func (AclTokenMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AclToken)(nil)).Elem()
}

func (i AclTokenMap) ToAclTokenMapOutput() AclTokenMapOutput {
	return i.ToAclTokenMapOutputWithContext(context.Background())
}

func (i AclTokenMap) ToAclTokenMapOutputWithContext(ctx context.Context) AclTokenMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AclTokenMapOutput)
}

type AclTokenOutput struct{ *pulumi.OutputState }

func (AclTokenOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AclToken)(nil)).Elem()
}

func (o AclTokenOutput) ToAclTokenOutput() AclTokenOutput {
	return o
}

func (o AclTokenOutput) ToAclTokenOutputWithContext(ctx context.Context) AclTokenOutput {
	return o
}

// `(string)` - A non-sensitive identifier for this token that
// can be logged and shared safely without granting any access to the cluster.
func (o AclTokenOutput) AccessorId() pulumi.StringOutput {
	return o.ApplyT(func(v *AclToken) pulumi.StringOutput { return v.AccessorId }).(pulumi.StringOutput)
}

// `(string)` - The timestamp the token was created.
func (o AclTokenOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *AclToken) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// `(string)` - The timestamp after which the token is
// considered expired and eligible for destruction.
func (o AclTokenOutput) ExpirationTime() pulumi.StringOutput {
	return o.ApplyT(func(v *AclToken) pulumi.StringOutput { return v.ExpirationTime }).(pulumi.StringOutput)
}

// `(string: "")` - Provides a TTL for the token in the form of
// a time duration such as `"5m"` or `"1h"`.
//
// In addition to the above arguments, the following attributes are exported and
// can be referenced:
func (o AclTokenOutput) ExpirationTtl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AclToken) pulumi.StringPtrOutput { return v.ExpirationTtl }).(pulumi.StringPtrOutput)
}

// `(bool: false)` - Whether the token should be replicated to all
// regions, or if it will only be used in the region it was created in.
func (o AclTokenOutput) Global() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AclToken) pulumi.BoolPtrOutput { return v.Global }).(pulumi.BoolPtrOutput)
}

// `(string: "")` - A human-friendly name for this token.
func (o AclTokenOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AclToken) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// `(set: [])` - A set of policy names to associate with this
// token. Must be set on `client`-type tokens, must not be set on
// `management`-type tokens. Policies do not need to exist before being
// used here.
func (o AclTokenOutput) Policies() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AclToken) pulumi.StringArrayOutput { return v.Policies }).(pulumi.StringArrayOutput)
}

// `(set: [])` - The list of roles attached to the token. Each entry has
// `name` and `id` attributes. It may be used multiple times.
func (o AclTokenOutput) Roles() AclTokenRoleArrayOutput {
	return o.ApplyT(func(v *AclToken) AclTokenRoleArrayOutput { return v.Roles }).(AclTokenRoleArrayOutput)
}

// `(string)` - The token value itself, which is presented for
// access to the cluster.
func (o AclTokenOutput) SecretId() pulumi.StringOutput {
	return o.ApplyT(func(v *AclToken) pulumi.StringOutput { return v.SecretId }).(pulumi.StringOutput)
}

// `(string: <required>)` - The type of token this is. Use `client`
// for tokens that will have policies associated with them. Use `management`
// for tokens that can perform any action.
func (o AclTokenOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *AclToken) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type AclTokenArrayOutput struct{ *pulumi.OutputState }

func (AclTokenArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AclToken)(nil)).Elem()
}

func (o AclTokenArrayOutput) ToAclTokenArrayOutput() AclTokenArrayOutput {
	return o
}

func (o AclTokenArrayOutput) ToAclTokenArrayOutputWithContext(ctx context.Context) AclTokenArrayOutput {
	return o
}

func (o AclTokenArrayOutput) Index(i pulumi.IntInput) AclTokenOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AclToken {
		return vs[0].([]*AclToken)[vs[1].(int)]
	}).(AclTokenOutput)
}

type AclTokenMapOutput struct{ *pulumi.OutputState }

func (AclTokenMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AclToken)(nil)).Elem()
}

func (o AclTokenMapOutput) ToAclTokenMapOutput() AclTokenMapOutput {
	return o
}

func (o AclTokenMapOutput) ToAclTokenMapOutputWithContext(ctx context.Context) AclTokenMapOutput {
	return o
}

func (o AclTokenMapOutput) MapIndex(k pulumi.StringInput) AclTokenOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AclToken {
		return vs[0].(map[string]*AclToken)[vs[1].(string)]
	}).(AclTokenOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AclTokenInput)(nil)).Elem(), &AclToken{})
	pulumi.RegisterInputType(reflect.TypeOf((*AclTokenArrayInput)(nil)).Elem(), AclTokenArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AclTokenMapInput)(nil)).Elem(), AclTokenMap{})
	pulumi.RegisterOutputType(AclTokenOutput{})
	pulumi.RegisterOutputType(AclTokenArrayOutput{})
	pulumi.RegisterOutputType(AclTokenMapOutput{})
}
