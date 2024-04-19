// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nomad

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-nomad/sdk/v2/go/nomad/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provisions a namespace within a Nomad cluster.
//
// Nomad auto-generates a default namespace called `default`. This namespace
// cannot be removed, so destroying a `Namespace` resource where
// `name = "default"` will cause the namespace to be reset to its default
// configuration.
//
// ## Example Usage
//
// Registering a namespace:
//
// <!--Start PulumiCodeChooser -->
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
//			_, err := nomad.NewNamespace(ctx, "dev", &nomad.NamespaceArgs{
//				Name:        pulumi.String("dev"),
//				Description: pulumi.String("Shared development environment."),
//				Quota:       pulumi.String("dev"),
//				Meta: pulumi.StringMap{
//					"owner": pulumi.String("John Doe"),
//					"foo":   pulumi.String("bar"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// Registering a namespace with a quota:
//
// <!--Start PulumiCodeChooser -->
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
//			webTeam, err := nomad.NewQuoteSpecification(ctx, "web_team", &nomad.QuoteSpecificationArgs{
//				Name:        pulumi.String("web-team"),
//				Description: pulumi.String("web team quota"),
//				Limits: nomad.QuoteSpecificationLimitArray{
//					&nomad.QuoteSpecificationLimitArgs{
//						Region: pulumi.String("global"),
//						RegionLimit: &nomad.QuoteSpecificationLimitRegionLimitArgs{
//							Cpu:      pulumi.Int(1000),
//							MemoryMb: pulumi.Int(256),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = nomad.NewNamespace(ctx, "web", &nomad.NamespaceArgs{
//				Name:        pulumi.String("web"),
//				Description: pulumi.String("Web team production environment."),
//				Quota:       webTeam.Name,
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
type Namespace struct {
	pulumi.CustomResourceState

	// `(block: <optional>)` - A block of capabilities for the namespace. Can't
	// be repeated. See below for the structure of this block.
	Capabilities NamespaceCapabilitiesPtrOutput `pulumi:"capabilities"`
	// `(string: "")` - A description of the namespace.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// `(map[string]string: <optional>)` -  Specifies arbitrary KV metadata to associate with the namespace.
	Meta pulumi.StringMapOutput `pulumi:"meta"`
	// `(string: <required>)` - A unique name for the namespace.
	Name pulumi.StringOutput `pulumi:"name"`
	// `(block: <optional>)` - A block with node pool configuration for the namespace (Nomad Enterprise only).
	NodePoolConfig NamespaceNodePoolConfigOutput `pulumi:"nodePoolConfig"`
	// `(string: "")` - A resource quota to attach to the namespace.
	Quota pulumi.StringPtrOutput `pulumi:"quota"`
}

// NewNamespace registers a new resource with the given unique name, arguments, and options.
func NewNamespace(ctx *pulumi.Context,
	name string, args *NamespaceArgs, opts ...pulumi.ResourceOption) (*Namespace, error) {
	if args == nil {
		args = &NamespaceArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Namespace
	err := ctx.RegisterResource("nomad:index/namespace:Namespace", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNamespace gets an existing Namespace resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNamespace(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NamespaceState, opts ...pulumi.ResourceOption) (*Namespace, error) {
	var resource Namespace
	err := ctx.ReadResource("nomad:index/namespace:Namespace", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Namespace resources.
type namespaceState struct {
	// `(block: <optional>)` - A block of capabilities for the namespace. Can't
	// be repeated. See below for the structure of this block.
	Capabilities *NamespaceCapabilities `pulumi:"capabilities"`
	// `(string: "")` - A description of the namespace.
	Description *string `pulumi:"description"`
	// `(map[string]string: <optional>)` -  Specifies arbitrary KV metadata to associate with the namespace.
	Meta map[string]string `pulumi:"meta"`
	// `(string: <required>)` - A unique name for the namespace.
	Name *string `pulumi:"name"`
	// `(block: <optional>)` - A block with node pool configuration for the namespace (Nomad Enterprise only).
	NodePoolConfig *NamespaceNodePoolConfig `pulumi:"nodePoolConfig"`
	// `(string: "")` - A resource quota to attach to the namespace.
	Quota *string `pulumi:"quota"`
}

type NamespaceState struct {
	// `(block: <optional>)` - A block of capabilities for the namespace. Can't
	// be repeated. See below for the structure of this block.
	Capabilities NamespaceCapabilitiesPtrInput
	// `(string: "")` - A description of the namespace.
	Description pulumi.StringPtrInput
	// `(map[string]string: <optional>)` -  Specifies arbitrary KV metadata to associate with the namespace.
	Meta pulumi.StringMapInput
	// `(string: <required>)` - A unique name for the namespace.
	Name pulumi.StringPtrInput
	// `(block: <optional>)` - A block with node pool configuration for the namespace (Nomad Enterprise only).
	NodePoolConfig NamespaceNodePoolConfigPtrInput
	// `(string: "")` - A resource quota to attach to the namespace.
	Quota pulumi.StringPtrInput
}

func (NamespaceState) ElementType() reflect.Type {
	return reflect.TypeOf((*namespaceState)(nil)).Elem()
}

type namespaceArgs struct {
	// `(block: <optional>)` - A block of capabilities for the namespace. Can't
	// be repeated. See below for the structure of this block.
	Capabilities *NamespaceCapabilities `pulumi:"capabilities"`
	// `(string: "")` - A description of the namespace.
	Description *string `pulumi:"description"`
	// `(map[string]string: <optional>)` -  Specifies arbitrary KV metadata to associate with the namespace.
	Meta map[string]string `pulumi:"meta"`
	// `(string: <required>)` - A unique name for the namespace.
	Name *string `pulumi:"name"`
	// `(block: <optional>)` - A block with node pool configuration for the namespace (Nomad Enterprise only).
	NodePoolConfig *NamespaceNodePoolConfig `pulumi:"nodePoolConfig"`
	// `(string: "")` - A resource quota to attach to the namespace.
	Quota *string `pulumi:"quota"`
}

// The set of arguments for constructing a Namespace resource.
type NamespaceArgs struct {
	// `(block: <optional>)` - A block of capabilities for the namespace. Can't
	// be repeated. See below for the structure of this block.
	Capabilities NamespaceCapabilitiesPtrInput
	// `(string: "")` - A description of the namespace.
	Description pulumi.StringPtrInput
	// `(map[string]string: <optional>)` -  Specifies arbitrary KV metadata to associate with the namespace.
	Meta pulumi.StringMapInput
	// `(string: <required>)` - A unique name for the namespace.
	Name pulumi.StringPtrInput
	// `(block: <optional>)` - A block with node pool configuration for the namespace (Nomad Enterprise only).
	NodePoolConfig NamespaceNodePoolConfigPtrInput
	// `(string: "")` - A resource quota to attach to the namespace.
	Quota pulumi.StringPtrInput
}

func (NamespaceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*namespaceArgs)(nil)).Elem()
}

type NamespaceInput interface {
	pulumi.Input

	ToNamespaceOutput() NamespaceOutput
	ToNamespaceOutputWithContext(ctx context.Context) NamespaceOutput
}

func (*Namespace) ElementType() reflect.Type {
	return reflect.TypeOf((**Namespace)(nil)).Elem()
}

func (i *Namespace) ToNamespaceOutput() NamespaceOutput {
	return i.ToNamespaceOutputWithContext(context.Background())
}

func (i *Namespace) ToNamespaceOutputWithContext(ctx context.Context) NamespaceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NamespaceOutput)
}

// NamespaceArrayInput is an input type that accepts NamespaceArray and NamespaceArrayOutput values.
// You can construct a concrete instance of `NamespaceArrayInput` via:
//
//	NamespaceArray{ NamespaceArgs{...} }
type NamespaceArrayInput interface {
	pulumi.Input

	ToNamespaceArrayOutput() NamespaceArrayOutput
	ToNamespaceArrayOutputWithContext(context.Context) NamespaceArrayOutput
}

type NamespaceArray []NamespaceInput

func (NamespaceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Namespace)(nil)).Elem()
}

func (i NamespaceArray) ToNamespaceArrayOutput() NamespaceArrayOutput {
	return i.ToNamespaceArrayOutputWithContext(context.Background())
}

func (i NamespaceArray) ToNamespaceArrayOutputWithContext(ctx context.Context) NamespaceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NamespaceArrayOutput)
}

// NamespaceMapInput is an input type that accepts NamespaceMap and NamespaceMapOutput values.
// You can construct a concrete instance of `NamespaceMapInput` via:
//
//	NamespaceMap{ "key": NamespaceArgs{...} }
type NamespaceMapInput interface {
	pulumi.Input

	ToNamespaceMapOutput() NamespaceMapOutput
	ToNamespaceMapOutputWithContext(context.Context) NamespaceMapOutput
}

type NamespaceMap map[string]NamespaceInput

func (NamespaceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Namespace)(nil)).Elem()
}

func (i NamespaceMap) ToNamespaceMapOutput() NamespaceMapOutput {
	return i.ToNamespaceMapOutputWithContext(context.Background())
}

func (i NamespaceMap) ToNamespaceMapOutputWithContext(ctx context.Context) NamespaceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NamespaceMapOutput)
}

type NamespaceOutput struct{ *pulumi.OutputState }

func (NamespaceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Namespace)(nil)).Elem()
}

func (o NamespaceOutput) ToNamespaceOutput() NamespaceOutput {
	return o
}

func (o NamespaceOutput) ToNamespaceOutputWithContext(ctx context.Context) NamespaceOutput {
	return o
}

// `(block: <optional>)` - A block of capabilities for the namespace. Can't
// be repeated. See below for the structure of this block.
func (o NamespaceOutput) Capabilities() NamespaceCapabilitiesPtrOutput {
	return o.ApplyT(func(v *Namespace) NamespaceCapabilitiesPtrOutput { return v.Capabilities }).(NamespaceCapabilitiesPtrOutput)
}

// `(string: "")` - A description of the namespace.
func (o NamespaceOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Namespace) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// `(map[string]string: <optional>)` -  Specifies arbitrary KV metadata to associate with the namespace.
func (o NamespaceOutput) Meta() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Namespace) pulumi.StringMapOutput { return v.Meta }).(pulumi.StringMapOutput)
}

// `(string: <required>)` - A unique name for the namespace.
func (o NamespaceOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Namespace) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// `(block: <optional>)` - A block with node pool configuration for the namespace (Nomad Enterprise only).
func (o NamespaceOutput) NodePoolConfig() NamespaceNodePoolConfigOutput {
	return o.ApplyT(func(v *Namespace) NamespaceNodePoolConfigOutput { return v.NodePoolConfig }).(NamespaceNodePoolConfigOutput)
}

// `(string: "")` - A resource quota to attach to the namespace.
func (o NamespaceOutput) Quota() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Namespace) pulumi.StringPtrOutput { return v.Quota }).(pulumi.StringPtrOutput)
}

type NamespaceArrayOutput struct{ *pulumi.OutputState }

func (NamespaceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Namespace)(nil)).Elem()
}

func (o NamespaceArrayOutput) ToNamespaceArrayOutput() NamespaceArrayOutput {
	return o
}

func (o NamespaceArrayOutput) ToNamespaceArrayOutputWithContext(ctx context.Context) NamespaceArrayOutput {
	return o
}

func (o NamespaceArrayOutput) Index(i pulumi.IntInput) NamespaceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Namespace {
		return vs[0].([]*Namespace)[vs[1].(int)]
	}).(NamespaceOutput)
}

type NamespaceMapOutput struct{ *pulumi.OutputState }

func (NamespaceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Namespace)(nil)).Elem()
}

func (o NamespaceMapOutput) ToNamespaceMapOutput() NamespaceMapOutput {
	return o
}

func (o NamespaceMapOutput) ToNamespaceMapOutputWithContext(ctx context.Context) NamespaceMapOutput {
	return o
}

func (o NamespaceMapOutput) MapIndex(k pulumi.StringInput) NamespaceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Namespace {
		return vs[0].(map[string]*Namespace)[vs[1].(string)]
	}).(NamespaceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NamespaceInput)(nil)).Elem(), &Namespace{})
	pulumi.RegisterInputType(reflect.TypeOf((*NamespaceArrayInput)(nil)).Elem(), NamespaceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NamespaceMapInput)(nil)).Elem(), NamespaceMap{})
	pulumi.RegisterOutputType(NamespaceOutput{})
	pulumi.RegisterOutputType(NamespaceArrayOutput{})
	pulumi.RegisterOutputType(NamespaceMapOutput{})
}
