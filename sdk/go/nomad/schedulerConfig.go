// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nomad

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-nomad/sdk/go/nomad/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Manages scheduler configuration of the Nomad cluster.
//
// > **Warning:** destroying this resource will not have any effect in the
// cluster configuration, since there's no clear definition of what a destroy
// action should do. The cluster will be left as-is and only the state reference
// will be removed.
//
// ## Example Usage
//
// Set cluster scheduler configuration:
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
//			_, err := nomad.NewSchedulerConfig(ctx, "config", &nomad.SchedulerConfigArgs{
//				MemoryOversubscriptionEnabled: pulumi.Bool(true),
//				PreemptionConfig: pulumi.BoolMap{
//					"batch_scheduler_enabled":    pulumi.Bool(true),
//					"service_scheduler_enabled":  pulumi.Bool(true),
//					"sysbatch_scheduler_enabled": pulumi.Bool(true),
//					"system_scheduler_enabled":   pulumi.Bool(true),
//				},
//				SchedulerAlgorithm: pulumi.String("spread"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type SchedulerConfig struct {
	pulumi.CustomResourceState

	// `(bool: false)` - When `true`, tasks may exceed their reserved memory limit.
	MemoryOversubscriptionEnabled pulumi.BoolPtrOutput `pulumi:"memoryOversubscriptionEnabled"`
	// `(map[string]bool)` - Options to enable preemption for various schedulers.
	PreemptionConfig pulumi.BoolMapOutput `pulumi:"preemptionConfig"`
	// `(string: "binpack")` - Specifies whether scheduler binpacks or spreads allocations on available nodes. Possible values are `binpack` and `spread`.
	SchedulerAlgorithm pulumi.StringPtrOutput `pulumi:"schedulerAlgorithm"`
}

// NewSchedulerConfig registers a new resource with the given unique name, arguments, and options.
func NewSchedulerConfig(ctx *pulumi.Context,
	name string, args *SchedulerConfigArgs, opts ...pulumi.ResourceOption) (*SchedulerConfig, error) {
	if args == nil {
		args = &SchedulerConfigArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SchedulerConfig
	err := ctx.RegisterResource("nomad:index/schedulerConfig:SchedulerConfig", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSchedulerConfig gets an existing SchedulerConfig resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSchedulerConfig(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SchedulerConfigState, opts ...pulumi.ResourceOption) (*SchedulerConfig, error) {
	var resource SchedulerConfig
	err := ctx.ReadResource("nomad:index/schedulerConfig:SchedulerConfig", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SchedulerConfig resources.
type schedulerConfigState struct {
	// `(bool: false)` - When `true`, tasks may exceed their reserved memory limit.
	MemoryOversubscriptionEnabled *bool `pulumi:"memoryOversubscriptionEnabled"`
	// `(map[string]bool)` - Options to enable preemption for various schedulers.
	PreemptionConfig map[string]bool `pulumi:"preemptionConfig"`
	// `(string: "binpack")` - Specifies whether scheduler binpacks or spreads allocations on available nodes. Possible values are `binpack` and `spread`.
	SchedulerAlgorithm *string `pulumi:"schedulerAlgorithm"`
}

type SchedulerConfigState struct {
	// `(bool: false)` - When `true`, tasks may exceed their reserved memory limit.
	MemoryOversubscriptionEnabled pulumi.BoolPtrInput
	// `(map[string]bool)` - Options to enable preemption for various schedulers.
	PreemptionConfig pulumi.BoolMapInput
	// `(string: "binpack")` - Specifies whether scheduler binpacks or spreads allocations on available nodes. Possible values are `binpack` and `spread`.
	SchedulerAlgorithm pulumi.StringPtrInput
}

func (SchedulerConfigState) ElementType() reflect.Type {
	return reflect.TypeOf((*schedulerConfigState)(nil)).Elem()
}

type schedulerConfigArgs struct {
	// `(bool: false)` - When `true`, tasks may exceed their reserved memory limit.
	MemoryOversubscriptionEnabled *bool `pulumi:"memoryOversubscriptionEnabled"`
	// `(map[string]bool)` - Options to enable preemption for various schedulers.
	PreemptionConfig map[string]bool `pulumi:"preemptionConfig"`
	// `(string: "binpack")` - Specifies whether scheduler binpacks or spreads allocations on available nodes. Possible values are `binpack` and `spread`.
	SchedulerAlgorithm *string `pulumi:"schedulerAlgorithm"`
}

// The set of arguments for constructing a SchedulerConfig resource.
type SchedulerConfigArgs struct {
	// `(bool: false)` - When `true`, tasks may exceed their reserved memory limit.
	MemoryOversubscriptionEnabled pulumi.BoolPtrInput
	// `(map[string]bool)` - Options to enable preemption for various schedulers.
	PreemptionConfig pulumi.BoolMapInput
	// `(string: "binpack")` - Specifies whether scheduler binpacks or spreads allocations on available nodes. Possible values are `binpack` and `spread`.
	SchedulerAlgorithm pulumi.StringPtrInput
}

func (SchedulerConfigArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*schedulerConfigArgs)(nil)).Elem()
}

type SchedulerConfigInput interface {
	pulumi.Input

	ToSchedulerConfigOutput() SchedulerConfigOutput
	ToSchedulerConfigOutputWithContext(ctx context.Context) SchedulerConfigOutput
}

func (*SchedulerConfig) ElementType() reflect.Type {
	return reflect.TypeOf((**SchedulerConfig)(nil)).Elem()
}

func (i *SchedulerConfig) ToSchedulerConfigOutput() SchedulerConfigOutput {
	return i.ToSchedulerConfigOutputWithContext(context.Background())
}

func (i *SchedulerConfig) ToSchedulerConfigOutputWithContext(ctx context.Context) SchedulerConfigOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchedulerConfigOutput)
}

func (i *SchedulerConfig) ToOutput(ctx context.Context) pulumix.Output[*SchedulerConfig] {
	return pulumix.Output[*SchedulerConfig]{
		OutputState: i.ToSchedulerConfigOutputWithContext(ctx).OutputState,
	}
}

// SchedulerConfigArrayInput is an input type that accepts SchedulerConfigArray and SchedulerConfigArrayOutput values.
// You can construct a concrete instance of `SchedulerConfigArrayInput` via:
//
//	SchedulerConfigArray{ SchedulerConfigArgs{...} }
type SchedulerConfigArrayInput interface {
	pulumi.Input

	ToSchedulerConfigArrayOutput() SchedulerConfigArrayOutput
	ToSchedulerConfigArrayOutputWithContext(context.Context) SchedulerConfigArrayOutput
}

type SchedulerConfigArray []SchedulerConfigInput

func (SchedulerConfigArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SchedulerConfig)(nil)).Elem()
}

func (i SchedulerConfigArray) ToSchedulerConfigArrayOutput() SchedulerConfigArrayOutput {
	return i.ToSchedulerConfigArrayOutputWithContext(context.Background())
}

func (i SchedulerConfigArray) ToSchedulerConfigArrayOutputWithContext(ctx context.Context) SchedulerConfigArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchedulerConfigArrayOutput)
}

func (i SchedulerConfigArray) ToOutput(ctx context.Context) pulumix.Output[[]*SchedulerConfig] {
	return pulumix.Output[[]*SchedulerConfig]{
		OutputState: i.ToSchedulerConfigArrayOutputWithContext(ctx).OutputState,
	}
}

// SchedulerConfigMapInput is an input type that accepts SchedulerConfigMap and SchedulerConfigMapOutput values.
// You can construct a concrete instance of `SchedulerConfigMapInput` via:
//
//	SchedulerConfigMap{ "key": SchedulerConfigArgs{...} }
type SchedulerConfigMapInput interface {
	pulumi.Input

	ToSchedulerConfigMapOutput() SchedulerConfigMapOutput
	ToSchedulerConfigMapOutputWithContext(context.Context) SchedulerConfigMapOutput
}

type SchedulerConfigMap map[string]SchedulerConfigInput

func (SchedulerConfigMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SchedulerConfig)(nil)).Elem()
}

func (i SchedulerConfigMap) ToSchedulerConfigMapOutput() SchedulerConfigMapOutput {
	return i.ToSchedulerConfigMapOutputWithContext(context.Background())
}

func (i SchedulerConfigMap) ToSchedulerConfigMapOutputWithContext(ctx context.Context) SchedulerConfigMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchedulerConfigMapOutput)
}

func (i SchedulerConfigMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*SchedulerConfig] {
	return pulumix.Output[map[string]*SchedulerConfig]{
		OutputState: i.ToSchedulerConfigMapOutputWithContext(ctx).OutputState,
	}
}

type SchedulerConfigOutput struct{ *pulumi.OutputState }

func (SchedulerConfigOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SchedulerConfig)(nil)).Elem()
}

func (o SchedulerConfigOutput) ToSchedulerConfigOutput() SchedulerConfigOutput {
	return o
}

func (o SchedulerConfigOutput) ToSchedulerConfigOutputWithContext(ctx context.Context) SchedulerConfigOutput {
	return o
}

func (o SchedulerConfigOutput) ToOutput(ctx context.Context) pulumix.Output[*SchedulerConfig] {
	return pulumix.Output[*SchedulerConfig]{
		OutputState: o.OutputState,
	}
}

// `(bool: false)` - When `true`, tasks may exceed their reserved memory limit.
func (o SchedulerConfigOutput) MemoryOversubscriptionEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *SchedulerConfig) pulumi.BoolPtrOutput { return v.MemoryOversubscriptionEnabled }).(pulumi.BoolPtrOutput)
}

// `(map[string]bool)` - Options to enable preemption for various schedulers.
func (o SchedulerConfigOutput) PreemptionConfig() pulumi.BoolMapOutput {
	return o.ApplyT(func(v *SchedulerConfig) pulumi.BoolMapOutput { return v.PreemptionConfig }).(pulumi.BoolMapOutput)
}

// `(string: "binpack")` - Specifies whether scheduler binpacks or spreads allocations on available nodes. Possible values are `binpack` and `spread`.
func (o SchedulerConfigOutput) SchedulerAlgorithm() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SchedulerConfig) pulumi.StringPtrOutput { return v.SchedulerAlgorithm }).(pulumi.StringPtrOutput)
}

type SchedulerConfigArrayOutput struct{ *pulumi.OutputState }

func (SchedulerConfigArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SchedulerConfig)(nil)).Elem()
}

func (o SchedulerConfigArrayOutput) ToSchedulerConfigArrayOutput() SchedulerConfigArrayOutput {
	return o
}

func (o SchedulerConfigArrayOutput) ToSchedulerConfigArrayOutputWithContext(ctx context.Context) SchedulerConfigArrayOutput {
	return o
}

func (o SchedulerConfigArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*SchedulerConfig] {
	return pulumix.Output[[]*SchedulerConfig]{
		OutputState: o.OutputState,
	}
}

func (o SchedulerConfigArrayOutput) Index(i pulumi.IntInput) SchedulerConfigOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SchedulerConfig {
		return vs[0].([]*SchedulerConfig)[vs[1].(int)]
	}).(SchedulerConfigOutput)
}

type SchedulerConfigMapOutput struct{ *pulumi.OutputState }

func (SchedulerConfigMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SchedulerConfig)(nil)).Elem()
}

func (o SchedulerConfigMapOutput) ToSchedulerConfigMapOutput() SchedulerConfigMapOutput {
	return o
}

func (o SchedulerConfigMapOutput) ToSchedulerConfigMapOutputWithContext(ctx context.Context) SchedulerConfigMapOutput {
	return o
}

func (o SchedulerConfigMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*SchedulerConfig] {
	return pulumix.Output[map[string]*SchedulerConfig]{
		OutputState: o.OutputState,
	}
}

func (o SchedulerConfigMapOutput) MapIndex(k pulumi.StringInput) SchedulerConfigOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SchedulerConfig {
		return vs[0].(map[string]*SchedulerConfig)[vs[1].(string)]
	}).(SchedulerConfigOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SchedulerConfigInput)(nil)).Elem(), &SchedulerConfig{})
	pulumi.RegisterInputType(reflect.TypeOf((*SchedulerConfigArrayInput)(nil)).Elem(), SchedulerConfigArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SchedulerConfigMapInput)(nil)).Elem(), SchedulerConfigMap{})
	pulumi.RegisterOutputType(SchedulerConfigOutput{})
	pulumi.RegisterOutputType(SchedulerConfigArrayOutput{})
	pulumi.RegisterOutputType(SchedulerConfigMapOutput{})
}
