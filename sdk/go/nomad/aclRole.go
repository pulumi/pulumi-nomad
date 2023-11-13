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

type AclRole struct {
	pulumi.CustomResourceState

	// `(string: "")` - A description of the ACL Role.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// `(string: <required>)` - A human-friendly name for this ACL Role.
	Name pulumi.StringOutput `pulumi:"name"`
	// `(set: <required>)` - A set of policy names to associate with this
	// ACL Role. It may be used multiple times.
	Policies AclRolePolicyArrayOutput `pulumi:"policies"`
}

// NewAclRole registers a new resource with the given unique name, arguments, and options.
func NewAclRole(ctx *pulumi.Context,
	name string, args *AclRoleArgs, opts ...pulumi.ResourceOption) (*AclRole, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Policies == nil {
		return nil, errors.New("invalid value for required argument 'Policies'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AclRole
	err := ctx.RegisterResource("nomad:index/aclRole:AclRole", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAclRole gets an existing AclRole resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAclRole(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AclRoleState, opts ...pulumi.ResourceOption) (*AclRole, error) {
	var resource AclRole
	err := ctx.ReadResource("nomad:index/aclRole:AclRole", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AclRole resources.
type aclRoleState struct {
	// `(string: "")` - A description of the ACL Role.
	Description *string `pulumi:"description"`
	// `(string: <required>)` - A human-friendly name for this ACL Role.
	Name *string `pulumi:"name"`
	// `(set: <required>)` - A set of policy names to associate with this
	// ACL Role. It may be used multiple times.
	Policies []AclRolePolicy `pulumi:"policies"`
}

type AclRoleState struct {
	// `(string: "")` - A description of the ACL Role.
	Description pulumi.StringPtrInput
	// `(string: <required>)` - A human-friendly name for this ACL Role.
	Name pulumi.StringPtrInput
	// `(set: <required>)` - A set of policy names to associate with this
	// ACL Role. It may be used multiple times.
	Policies AclRolePolicyArrayInput
}

func (AclRoleState) ElementType() reflect.Type {
	return reflect.TypeOf((*aclRoleState)(nil)).Elem()
}

type aclRoleArgs struct {
	// `(string: "")` - A description of the ACL Role.
	Description *string `pulumi:"description"`
	// `(string: <required>)` - A human-friendly name for this ACL Role.
	Name *string `pulumi:"name"`
	// `(set: <required>)` - A set of policy names to associate with this
	// ACL Role. It may be used multiple times.
	Policies []AclRolePolicy `pulumi:"policies"`
}

// The set of arguments for constructing a AclRole resource.
type AclRoleArgs struct {
	// `(string: "")` - A description of the ACL Role.
	Description pulumi.StringPtrInput
	// `(string: <required>)` - A human-friendly name for this ACL Role.
	Name pulumi.StringPtrInput
	// `(set: <required>)` - A set of policy names to associate with this
	// ACL Role. It may be used multiple times.
	Policies AclRolePolicyArrayInput
}

func (AclRoleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*aclRoleArgs)(nil)).Elem()
}

type AclRoleInput interface {
	pulumi.Input

	ToAclRoleOutput() AclRoleOutput
	ToAclRoleOutputWithContext(ctx context.Context) AclRoleOutput
}

func (*AclRole) ElementType() reflect.Type {
	return reflect.TypeOf((**AclRole)(nil)).Elem()
}

func (i *AclRole) ToAclRoleOutput() AclRoleOutput {
	return i.ToAclRoleOutputWithContext(context.Background())
}

func (i *AclRole) ToAclRoleOutputWithContext(ctx context.Context) AclRoleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AclRoleOutput)
}

// AclRoleArrayInput is an input type that accepts AclRoleArray and AclRoleArrayOutput values.
// You can construct a concrete instance of `AclRoleArrayInput` via:
//
//	AclRoleArray{ AclRoleArgs{...} }
type AclRoleArrayInput interface {
	pulumi.Input

	ToAclRoleArrayOutput() AclRoleArrayOutput
	ToAclRoleArrayOutputWithContext(context.Context) AclRoleArrayOutput
}

type AclRoleArray []AclRoleInput

func (AclRoleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AclRole)(nil)).Elem()
}

func (i AclRoleArray) ToAclRoleArrayOutput() AclRoleArrayOutput {
	return i.ToAclRoleArrayOutputWithContext(context.Background())
}

func (i AclRoleArray) ToAclRoleArrayOutputWithContext(ctx context.Context) AclRoleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AclRoleArrayOutput)
}

// AclRoleMapInput is an input type that accepts AclRoleMap and AclRoleMapOutput values.
// You can construct a concrete instance of `AclRoleMapInput` via:
//
//	AclRoleMap{ "key": AclRoleArgs{...} }
type AclRoleMapInput interface {
	pulumi.Input

	ToAclRoleMapOutput() AclRoleMapOutput
	ToAclRoleMapOutputWithContext(context.Context) AclRoleMapOutput
}

type AclRoleMap map[string]AclRoleInput

func (AclRoleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AclRole)(nil)).Elem()
}

func (i AclRoleMap) ToAclRoleMapOutput() AclRoleMapOutput {
	return i.ToAclRoleMapOutputWithContext(context.Background())
}

func (i AclRoleMap) ToAclRoleMapOutputWithContext(ctx context.Context) AclRoleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AclRoleMapOutput)
}

type AclRoleOutput struct{ *pulumi.OutputState }

func (AclRoleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AclRole)(nil)).Elem()
}

func (o AclRoleOutput) ToAclRoleOutput() AclRoleOutput {
	return o
}

func (o AclRoleOutput) ToAclRoleOutputWithContext(ctx context.Context) AclRoleOutput {
	return o
}

// `(string: "")` - A description of the ACL Role.
func (o AclRoleOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AclRole) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// `(string: <required>)` - A human-friendly name for this ACL Role.
func (o AclRoleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AclRole) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// `(set: <required>)` - A set of policy names to associate with this
// ACL Role. It may be used multiple times.
func (o AclRoleOutput) Policies() AclRolePolicyArrayOutput {
	return o.ApplyT(func(v *AclRole) AclRolePolicyArrayOutput { return v.Policies }).(AclRolePolicyArrayOutput)
}

type AclRoleArrayOutput struct{ *pulumi.OutputState }

func (AclRoleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AclRole)(nil)).Elem()
}

func (o AclRoleArrayOutput) ToAclRoleArrayOutput() AclRoleArrayOutput {
	return o
}

func (o AclRoleArrayOutput) ToAclRoleArrayOutputWithContext(ctx context.Context) AclRoleArrayOutput {
	return o
}

func (o AclRoleArrayOutput) Index(i pulumi.IntInput) AclRoleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AclRole {
		return vs[0].([]*AclRole)[vs[1].(int)]
	}).(AclRoleOutput)
}

type AclRoleMapOutput struct{ *pulumi.OutputState }

func (AclRoleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AclRole)(nil)).Elem()
}

func (o AclRoleMapOutput) ToAclRoleMapOutput() AclRoleMapOutput {
	return o
}

func (o AclRoleMapOutput) ToAclRoleMapOutputWithContext(ctx context.Context) AclRoleMapOutput {
	return o
}

func (o AclRoleMapOutput) MapIndex(k pulumi.StringInput) AclRoleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AclRole {
		return vs[0].(map[string]*AclRole)[vs[1].(string)]
	}).(AclRoleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AclRoleInput)(nil)).Elem(), &AclRole{})
	pulumi.RegisterInputType(reflect.TypeOf((*AclRoleArrayInput)(nil)).Elem(), AclRoleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AclRoleMapInput)(nil)).Elem(), AclRoleMap{})
	pulumi.RegisterOutputType(AclRoleOutput{})
	pulumi.RegisterOutputType(AclRoleArrayOutput{})
	pulumi.RegisterOutputType(AclRoleMapOutput{})
}
