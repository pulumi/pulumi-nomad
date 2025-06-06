// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nomad

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-nomad/sdk/v2/go/nomad/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an ACL policy registered in Nomad.
type AclPolicy struct {
	pulumi.CustomResourceState

	// `(string: "")` - A description of the policy.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// `(``JobACL``: <optional>)` - Options for assigning the
	// ACL rules to a job, group, or task.
	JobAcl AclPolicyJobAclPtrOutput `pulumi:"jobAcl"`
	// `(string: <required>)` - A unique name for the policy.
	Name pulumi.StringOutput `pulumi:"name"`
	// `(string: <required>)` - The contents of the policy to register,
	// as HCL or JSON.
	RulesHcl pulumi.StringOutput `pulumi:"rulesHcl"`
}

// NewAclPolicy registers a new resource with the given unique name, arguments, and options.
func NewAclPolicy(ctx *pulumi.Context,
	name string, args *AclPolicyArgs, opts ...pulumi.ResourceOption) (*AclPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.RulesHcl == nil {
		return nil, errors.New("invalid value for required argument 'RulesHcl'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AclPolicy
	err := ctx.RegisterResource("nomad:index/aclPolicy:AclPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAclPolicy gets an existing AclPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAclPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AclPolicyState, opts ...pulumi.ResourceOption) (*AclPolicy, error) {
	var resource AclPolicy
	err := ctx.ReadResource("nomad:index/aclPolicy:AclPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AclPolicy resources.
type aclPolicyState struct {
	// `(string: "")` - A description of the policy.
	Description *string `pulumi:"description"`
	// `(``JobACL``: <optional>)` - Options for assigning the
	// ACL rules to a job, group, or task.
	JobAcl *AclPolicyJobAcl `pulumi:"jobAcl"`
	// `(string: <required>)` - A unique name for the policy.
	Name *string `pulumi:"name"`
	// `(string: <required>)` - The contents of the policy to register,
	// as HCL or JSON.
	RulesHcl *string `pulumi:"rulesHcl"`
}

type AclPolicyState struct {
	// `(string: "")` - A description of the policy.
	Description pulumi.StringPtrInput
	// `(``JobACL``: <optional>)` - Options for assigning the
	// ACL rules to a job, group, or task.
	JobAcl AclPolicyJobAclPtrInput
	// `(string: <required>)` - A unique name for the policy.
	Name pulumi.StringPtrInput
	// `(string: <required>)` - The contents of the policy to register,
	// as HCL or JSON.
	RulesHcl pulumi.StringPtrInput
}

func (AclPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*aclPolicyState)(nil)).Elem()
}

type aclPolicyArgs struct {
	// `(string: "")` - A description of the policy.
	Description *string `pulumi:"description"`
	// `(``JobACL``: <optional>)` - Options for assigning the
	// ACL rules to a job, group, or task.
	JobAcl *AclPolicyJobAcl `pulumi:"jobAcl"`
	// `(string: <required>)` - A unique name for the policy.
	Name *string `pulumi:"name"`
	// `(string: <required>)` - The contents of the policy to register,
	// as HCL or JSON.
	RulesHcl string `pulumi:"rulesHcl"`
}

// The set of arguments for constructing a AclPolicy resource.
type AclPolicyArgs struct {
	// `(string: "")` - A description of the policy.
	Description pulumi.StringPtrInput
	// `(``JobACL``: <optional>)` - Options for assigning the
	// ACL rules to a job, group, or task.
	JobAcl AclPolicyJobAclPtrInput
	// `(string: <required>)` - A unique name for the policy.
	Name pulumi.StringPtrInput
	// `(string: <required>)` - The contents of the policy to register,
	// as HCL or JSON.
	RulesHcl pulumi.StringInput
}

func (AclPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*aclPolicyArgs)(nil)).Elem()
}

type AclPolicyInput interface {
	pulumi.Input

	ToAclPolicyOutput() AclPolicyOutput
	ToAclPolicyOutputWithContext(ctx context.Context) AclPolicyOutput
}

func (*AclPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**AclPolicy)(nil)).Elem()
}

func (i *AclPolicy) ToAclPolicyOutput() AclPolicyOutput {
	return i.ToAclPolicyOutputWithContext(context.Background())
}

func (i *AclPolicy) ToAclPolicyOutputWithContext(ctx context.Context) AclPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AclPolicyOutput)
}

// AclPolicyArrayInput is an input type that accepts AclPolicyArray and AclPolicyArrayOutput values.
// You can construct a concrete instance of `AclPolicyArrayInput` via:
//
//	AclPolicyArray{ AclPolicyArgs{...} }
type AclPolicyArrayInput interface {
	pulumi.Input

	ToAclPolicyArrayOutput() AclPolicyArrayOutput
	ToAclPolicyArrayOutputWithContext(context.Context) AclPolicyArrayOutput
}

type AclPolicyArray []AclPolicyInput

func (AclPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AclPolicy)(nil)).Elem()
}

func (i AclPolicyArray) ToAclPolicyArrayOutput() AclPolicyArrayOutput {
	return i.ToAclPolicyArrayOutputWithContext(context.Background())
}

func (i AclPolicyArray) ToAclPolicyArrayOutputWithContext(ctx context.Context) AclPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AclPolicyArrayOutput)
}

// AclPolicyMapInput is an input type that accepts AclPolicyMap and AclPolicyMapOutput values.
// You can construct a concrete instance of `AclPolicyMapInput` via:
//
//	AclPolicyMap{ "key": AclPolicyArgs{...} }
type AclPolicyMapInput interface {
	pulumi.Input

	ToAclPolicyMapOutput() AclPolicyMapOutput
	ToAclPolicyMapOutputWithContext(context.Context) AclPolicyMapOutput
}

type AclPolicyMap map[string]AclPolicyInput

func (AclPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AclPolicy)(nil)).Elem()
}

func (i AclPolicyMap) ToAclPolicyMapOutput() AclPolicyMapOutput {
	return i.ToAclPolicyMapOutputWithContext(context.Background())
}

func (i AclPolicyMap) ToAclPolicyMapOutputWithContext(ctx context.Context) AclPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AclPolicyMapOutput)
}

type AclPolicyOutput struct{ *pulumi.OutputState }

func (AclPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AclPolicy)(nil)).Elem()
}

func (o AclPolicyOutput) ToAclPolicyOutput() AclPolicyOutput {
	return o
}

func (o AclPolicyOutput) ToAclPolicyOutputWithContext(ctx context.Context) AclPolicyOutput {
	return o
}

// `(string: "")` - A description of the policy.
func (o AclPolicyOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AclPolicy) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// `(“JobACL“: <optional>)` - Options for assigning the
// ACL rules to a job, group, or task.
func (o AclPolicyOutput) JobAcl() AclPolicyJobAclPtrOutput {
	return o.ApplyT(func(v *AclPolicy) AclPolicyJobAclPtrOutput { return v.JobAcl }).(AclPolicyJobAclPtrOutput)
}

// `(string: <required>)` - A unique name for the policy.
func (o AclPolicyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AclPolicy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// `(string: <required>)` - The contents of the policy to register,
// as HCL or JSON.
func (o AclPolicyOutput) RulesHcl() pulumi.StringOutput {
	return o.ApplyT(func(v *AclPolicy) pulumi.StringOutput { return v.RulesHcl }).(pulumi.StringOutput)
}

type AclPolicyArrayOutput struct{ *pulumi.OutputState }

func (AclPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AclPolicy)(nil)).Elem()
}

func (o AclPolicyArrayOutput) ToAclPolicyArrayOutput() AclPolicyArrayOutput {
	return o
}

func (o AclPolicyArrayOutput) ToAclPolicyArrayOutputWithContext(ctx context.Context) AclPolicyArrayOutput {
	return o
}

func (o AclPolicyArrayOutput) Index(i pulumi.IntInput) AclPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AclPolicy {
		return vs[0].([]*AclPolicy)[vs[1].(int)]
	}).(AclPolicyOutput)
}

type AclPolicyMapOutput struct{ *pulumi.OutputState }

func (AclPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AclPolicy)(nil)).Elem()
}

func (o AclPolicyMapOutput) ToAclPolicyMapOutput() AclPolicyMapOutput {
	return o
}

func (o AclPolicyMapOutput) ToAclPolicyMapOutputWithContext(ctx context.Context) AclPolicyMapOutput {
	return o
}

func (o AclPolicyMapOutput) MapIndex(k pulumi.StringInput) AclPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AclPolicy {
		return vs[0].(map[string]*AclPolicy)[vs[1].(string)]
	}).(AclPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AclPolicyInput)(nil)).Elem(), &AclPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*AclPolicyArrayInput)(nil)).Elem(), AclPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AclPolicyMapInput)(nil)).Elem(), AclPolicyMap{})
	pulumi.RegisterOutputType(AclPolicyOutput{})
	pulumi.RegisterOutputType(AclPolicyArrayOutput{})
	pulumi.RegisterOutputType(AclPolicyMapOutput{})
}
