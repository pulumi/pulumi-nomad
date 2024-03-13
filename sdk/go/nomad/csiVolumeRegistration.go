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

type CsiVolumeRegistration struct {
	pulumi.CustomResourceState

	// `(``Capability``: <required>)` - Options for validating the capability of a volume.
	Capabilities CsiVolumeRegistrationCapabilityArrayOutput `pulumi:"capabilities"`
	Capacity     pulumi.IntOutput                           `pulumi:"capacity"`
	// `(string: <optional>)` - Option to signal a maximum volume size. This may not be supported by all storage providers.
	CapacityMax      pulumi.StringPtrOutput `pulumi:"capacityMax"`
	CapacityMaxBytes pulumi.IntOutput       `pulumi:"capacityMaxBytes"`
	// `(string: <optional>)` - Option to signal a minimum volume size. This may not be supported by all storage providers.
	CapacityMin      pulumi.StringPtrOutput `pulumi:"capacityMin"`
	CapacityMinBytes pulumi.IntOutput       `pulumi:"capacityMinBytes"`
	// `(map[string]string: <optional>)` - An optional key-value map of strings passed directly to the CSI plugin to validate the volume.
	Context pulumi.StringMapOutput `pulumi:"context"`
	// `(boolean)`
	ControllerRequired pulumi.BoolOutput `pulumi:"controllerRequired"`
	// `(integer)`
	ControllersExpected pulumi.IntOutput `pulumi:"controllersExpected"`
	// `(integer)`
	ControllersHealthy pulumi.IntOutput `pulumi:"controllersHealthy"`
	// `(boolean: true)` - If true, the volume will be deregistered on destroy.
	DeregisterOnDestroy pulumi.BoolPtrOutput `pulumi:"deregisterOnDestroy"`
	// `(string: <required>)` - The ID of the physical volume from the storage provider.
	ExternalId pulumi.StringOutput `pulumi:"externalId"`
	// `(block: <optional>)` Options for mounting `block-device` volumes without a pre-formatted file system.
	MountOptions CsiVolumeRegistrationMountOptionsPtrOutput `pulumi:"mountOptions"`
	// `(string: <required>)` - The display name for the volume.
	Name pulumi.StringOutput `pulumi:"name"`
	// `(string: "default")` - The namespace in which to register the volume.
	Namespace pulumi.StringPtrOutput `pulumi:"namespace"`
	// `(integer)`
	NodesExpected pulumi.IntOutput `pulumi:"nodesExpected"`
	// `(integer)`
	NodesHealthy pulumi.IntOutput `pulumi:"nodesHealthy"`
	// `(map[string]string: <optional>)` - An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
	Parameters pulumi.StringMapOutput `pulumi:"parameters"`
	// `(string: <required>)` - The ID of the Nomad plugin for registering this volume.
	PluginId pulumi.StringOutput `pulumi:"pluginId"`
	// `(string)`
	PluginProvider pulumi.StringOutput `pulumi:"pluginProvider"`
	// `(string)`
	PluginProviderVersion pulumi.StringOutput `pulumi:"pluginProviderVersion"`
	// `(boolean)`
	Schedulable pulumi.BoolOutput `pulumi:"schedulable"`
	// `(map[string]string: <optional>)` - An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
	Secrets pulumi.StringMapOutput `pulumi:"secrets"`
	// `(List of topologies)`
	Topologies CsiVolumeRegistrationTopologyArrayOutput `pulumi:"topologies"`
	// `(``TopologyRequest``: <optional>)` - Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
	TopologyRequest CsiVolumeRegistrationTopologyRequestPtrOutput `pulumi:"topologyRequest"`
	// `(string: <required>)` - The unique ID of the volume.
	VolumeId pulumi.StringOutput `pulumi:"volumeId"`
}

// NewCsiVolumeRegistration registers a new resource with the given unique name, arguments, and options.
func NewCsiVolumeRegistration(ctx *pulumi.Context,
	name string, args *CsiVolumeRegistrationArgs, opts ...pulumi.ResourceOption) (*CsiVolumeRegistration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ExternalId == nil {
		return nil, errors.New("invalid value for required argument 'ExternalId'")
	}
	if args.PluginId == nil {
		return nil, errors.New("invalid value for required argument 'PluginId'")
	}
	if args.VolumeId == nil {
		return nil, errors.New("invalid value for required argument 'VolumeId'")
	}
	if args.Secrets != nil {
		args.Secrets = pulumi.ToSecret(args.Secrets).(pulumi.StringMapInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"secrets",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CsiVolumeRegistration
	err := ctx.RegisterResource("nomad:index/csiVolumeRegistration:CsiVolumeRegistration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCsiVolumeRegistration gets an existing CsiVolumeRegistration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCsiVolumeRegistration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CsiVolumeRegistrationState, opts ...pulumi.ResourceOption) (*CsiVolumeRegistration, error) {
	var resource CsiVolumeRegistration
	err := ctx.ReadResource("nomad:index/csiVolumeRegistration:CsiVolumeRegistration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CsiVolumeRegistration resources.
type csiVolumeRegistrationState struct {
	// `(``Capability``: <required>)` - Options for validating the capability of a volume.
	Capabilities []CsiVolumeRegistrationCapability `pulumi:"capabilities"`
	Capacity     *int                              `pulumi:"capacity"`
	// `(string: <optional>)` - Option to signal a maximum volume size. This may not be supported by all storage providers.
	CapacityMax      *string `pulumi:"capacityMax"`
	CapacityMaxBytes *int    `pulumi:"capacityMaxBytes"`
	// `(string: <optional>)` - Option to signal a minimum volume size. This may not be supported by all storage providers.
	CapacityMin      *string `pulumi:"capacityMin"`
	CapacityMinBytes *int    `pulumi:"capacityMinBytes"`
	// `(map[string]string: <optional>)` - An optional key-value map of strings passed directly to the CSI plugin to validate the volume.
	Context map[string]string `pulumi:"context"`
	// `(boolean)`
	ControllerRequired *bool `pulumi:"controllerRequired"`
	// `(integer)`
	ControllersExpected *int `pulumi:"controllersExpected"`
	// `(integer)`
	ControllersHealthy *int `pulumi:"controllersHealthy"`
	// `(boolean: true)` - If true, the volume will be deregistered on destroy.
	DeregisterOnDestroy *bool `pulumi:"deregisterOnDestroy"`
	// `(string: <required>)` - The ID of the physical volume from the storage provider.
	ExternalId *string `pulumi:"externalId"`
	// `(block: <optional>)` Options for mounting `block-device` volumes without a pre-formatted file system.
	MountOptions *CsiVolumeRegistrationMountOptions `pulumi:"mountOptions"`
	// `(string: <required>)` - The display name for the volume.
	Name *string `pulumi:"name"`
	// `(string: "default")` - The namespace in which to register the volume.
	Namespace *string `pulumi:"namespace"`
	// `(integer)`
	NodesExpected *int `pulumi:"nodesExpected"`
	// `(integer)`
	NodesHealthy *int `pulumi:"nodesHealthy"`
	// `(map[string]string: <optional>)` - An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
	Parameters map[string]string `pulumi:"parameters"`
	// `(string: <required>)` - The ID of the Nomad plugin for registering this volume.
	PluginId *string `pulumi:"pluginId"`
	// `(string)`
	PluginProvider *string `pulumi:"pluginProvider"`
	// `(string)`
	PluginProviderVersion *string `pulumi:"pluginProviderVersion"`
	// `(boolean)`
	Schedulable *bool `pulumi:"schedulable"`
	// `(map[string]string: <optional>)` - An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
	Secrets map[string]string `pulumi:"secrets"`
	// `(List of topologies)`
	Topologies []CsiVolumeRegistrationTopology `pulumi:"topologies"`
	// `(``TopologyRequest``: <optional>)` - Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
	TopologyRequest *CsiVolumeRegistrationTopologyRequest `pulumi:"topologyRequest"`
	// `(string: <required>)` - The unique ID of the volume.
	VolumeId *string `pulumi:"volumeId"`
}

type CsiVolumeRegistrationState struct {
	// `(``Capability``: <required>)` - Options for validating the capability of a volume.
	Capabilities CsiVolumeRegistrationCapabilityArrayInput
	Capacity     pulumi.IntPtrInput
	// `(string: <optional>)` - Option to signal a maximum volume size. This may not be supported by all storage providers.
	CapacityMax      pulumi.StringPtrInput
	CapacityMaxBytes pulumi.IntPtrInput
	// `(string: <optional>)` - Option to signal a minimum volume size. This may not be supported by all storage providers.
	CapacityMin      pulumi.StringPtrInput
	CapacityMinBytes pulumi.IntPtrInput
	// `(map[string]string: <optional>)` - An optional key-value map of strings passed directly to the CSI plugin to validate the volume.
	Context pulumi.StringMapInput
	// `(boolean)`
	ControllerRequired pulumi.BoolPtrInput
	// `(integer)`
	ControllersExpected pulumi.IntPtrInput
	// `(integer)`
	ControllersHealthy pulumi.IntPtrInput
	// `(boolean: true)` - If true, the volume will be deregistered on destroy.
	DeregisterOnDestroy pulumi.BoolPtrInput
	// `(string: <required>)` - The ID of the physical volume from the storage provider.
	ExternalId pulumi.StringPtrInput
	// `(block: <optional>)` Options for mounting `block-device` volumes without a pre-formatted file system.
	MountOptions CsiVolumeRegistrationMountOptionsPtrInput
	// `(string: <required>)` - The display name for the volume.
	Name pulumi.StringPtrInput
	// `(string: "default")` - The namespace in which to register the volume.
	Namespace pulumi.StringPtrInput
	// `(integer)`
	NodesExpected pulumi.IntPtrInput
	// `(integer)`
	NodesHealthy pulumi.IntPtrInput
	// `(map[string]string: <optional>)` - An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
	Parameters pulumi.StringMapInput
	// `(string: <required>)` - The ID of the Nomad plugin for registering this volume.
	PluginId pulumi.StringPtrInput
	// `(string)`
	PluginProvider pulumi.StringPtrInput
	// `(string)`
	PluginProviderVersion pulumi.StringPtrInput
	// `(boolean)`
	Schedulable pulumi.BoolPtrInput
	// `(map[string]string: <optional>)` - An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
	Secrets pulumi.StringMapInput
	// `(List of topologies)`
	Topologies CsiVolumeRegistrationTopologyArrayInput
	// `(``TopologyRequest``: <optional>)` - Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
	TopologyRequest CsiVolumeRegistrationTopologyRequestPtrInput
	// `(string: <required>)` - The unique ID of the volume.
	VolumeId pulumi.StringPtrInput
}

func (CsiVolumeRegistrationState) ElementType() reflect.Type {
	return reflect.TypeOf((*csiVolumeRegistrationState)(nil)).Elem()
}

type csiVolumeRegistrationArgs struct {
	// `(``Capability``: <required>)` - Options for validating the capability of a volume.
	Capabilities []CsiVolumeRegistrationCapability `pulumi:"capabilities"`
	// `(string: <optional>)` - Option to signal a maximum volume size. This may not be supported by all storage providers.
	CapacityMax *string `pulumi:"capacityMax"`
	// `(string: <optional>)` - Option to signal a minimum volume size. This may not be supported by all storage providers.
	CapacityMin *string `pulumi:"capacityMin"`
	// `(map[string]string: <optional>)` - An optional key-value map of strings passed directly to the CSI plugin to validate the volume.
	Context map[string]string `pulumi:"context"`
	// `(boolean: true)` - If true, the volume will be deregistered on destroy.
	DeregisterOnDestroy *bool `pulumi:"deregisterOnDestroy"`
	// `(string: <required>)` - The ID of the physical volume from the storage provider.
	ExternalId string `pulumi:"externalId"`
	// `(block: <optional>)` Options for mounting `block-device` volumes without a pre-formatted file system.
	MountOptions *CsiVolumeRegistrationMountOptions `pulumi:"mountOptions"`
	// `(string: <required>)` - The display name for the volume.
	Name *string `pulumi:"name"`
	// `(string: "default")` - The namespace in which to register the volume.
	Namespace *string `pulumi:"namespace"`
	// `(map[string]string: <optional>)` - An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
	Parameters map[string]string `pulumi:"parameters"`
	// `(string: <required>)` - The ID of the Nomad plugin for registering this volume.
	PluginId string `pulumi:"pluginId"`
	// `(map[string]string: <optional>)` - An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
	Secrets map[string]string `pulumi:"secrets"`
	// `(``TopologyRequest``: <optional>)` - Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
	TopologyRequest *CsiVolumeRegistrationTopologyRequest `pulumi:"topologyRequest"`
	// `(string: <required>)` - The unique ID of the volume.
	VolumeId string `pulumi:"volumeId"`
}

// The set of arguments for constructing a CsiVolumeRegistration resource.
type CsiVolumeRegistrationArgs struct {
	// `(``Capability``: <required>)` - Options for validating the capability of a volume.
	Capabilities CsiVolumeRegistrationCapabilityArrayInput
	// `(string: <optional>)` - Option to signal a maximum volume size. This may not be supported by all storage providers.
	CapacityMax pulumi.StringPtrInput
	// `(string: <optional>)` - Option to signal a minimum volume size. This may not be supported by all storage providers.
	CapacityMin pulumi.StringPtrInput
	// `(map[string]string: <optional>)` - An optional key-value map of strings passed directly to the CSI plugin to validate the volume.
	Context pulumi.StringMapInput
	// `(boolean: true)` - If true, the volume will be deregistered on destroy.
	DeregisterOnDestroy pulumi.BoolPtrInput
	// `(string: <required>)` - The ID of the physical volume from the storage provider.
	ExternalId pulumi.StringInput
	// `(block: <optional>)` Options for mounting `block-device` volumes without a pre-formatted file system.
	MountOptions CsiVolumeRegistrationMountOptionsPtrInput
	// `(string: <required>)` - The display name for the volume.
	Name pulumi.StringPtrInput
	// `(string: "default")` - The namespace in which to register the volume.
	Namespace pulumi.StringPtrInput
	// `(map[string]string: <optional>)` - An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
	Parameters pulumi.StringMapInput
	// `(string: <required>)` - The ID of the Nomad plugin for registering this volume.
	PluginId pulumi.StringInput
	// `(map[string]string: <optional>)` - An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
	Secrets pulumi.StringMapInput
	// `(``TopologyRequest``: <optional>)` - Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
	TopologyRequest CsiVolumeRegistrationTopologyRequestPtrInput
	// `(string: <required>)` - The unique ID of the volume.
	VolumeId pulumi.StringInput
}

func (CsiVolumeRegistrationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*csiVolumeRegistrationArgs)(nil)).Elem()
}

type CsiVolumeRegistrationInput interface {
	pulumi.Input

	ToCsiVolumeRegistrationOutput() CsiVolumeRegistrationOutput
	ToCsiVolumeRegistrationOutputWithContext(ctx context.Context) CsiVolumeRegistrationOutput
}

func (*CsiVolumeRegistration) ElementType() reflect.Type {
	return reflect.TypeOf((**CsiVolumeRegistration)(nil)).Elem()
}

func (i *CsiVolumeRegistration) ToCsiVolumeRegistrationOutput() CsiVolumeRegistrationOutput {
	return i.ToCsiVolumeRegistrationOutputWithContext(context.Background())
}

func (i *CsiVolumeRegistration) ToCsiVolumeRegistrationOutputWithContext(ctx context.Context) CsiVolumeRegistrationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CsiVolumeRegistrationOutput)
}

// CsiVolumeRegistrationArrayInput is an input type that accepts CsiVolumeRegistrationArray and CsiVolumeRegistrationArrayOutput values.
// You can construct a concrete instance of `CsiVolumeRegistrationArrayInput` via:
//
//	CsiVolumeRegistrationArray{ CsiVolumeRegistrationArgs{...} }
type CsiVolumeRegistrationArrayInput interface {
	pulumi.Input

	ToCsiVolumeRegistrationArrayOutput() CsiVolumeRegistrationArrayOutput
	ToCsiVolumeRegistrationArrayOutputWithContext(context.Context) CsiVolumeRegistrationArrayOutput
}

type CsiVolumeRegistrationArray []CsiVolumeRegistrationInput

func (CsiVolumeRegistrationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CsiVolumeRegistration)(nil)).Elem()
}

func (i CsiVolumeRegistrationArray) ToCsiVolumeRegistrationArrayOutput() CsiVolumeRegistrationArrayOutput {
	return i.ToCsiVolumeRegistrationArrayOutputWithContext(context.Background())
}

func (i CsiVolumeRegistrationArray) ToCsiVolumeRegistrationArrayOutputWithContext(ctx context.Context) CsiVolumeRegistrationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CsiVolumeRegistrationArrayOutput)
}

// CsiVolumeRegistrationMapInput is an input type that accepts CsiVolumeRegistrationMap and CsiVolumeRegistrationMapOutput values.
// You can construct a concrete instance of `CsiVolumeRegistrationMapInput` via:
//
//	CsiVolumeRegistrationMap{ "key": CsiVolumeRegistrationArgs{...} }
type CsiVolumeRegistrationMapInput interface {
	pulumi.Input

	ToCsiVolumeRegistrationMapOutput() CsiVolumeRegistrationMapOutput
	ToCsiVolumeRegistrationMapOutputWithContext(context.Context) CsiVolumeRegistrationMapOutput
}

type CsiVolumeRegistrationMap map[string]CsiVolumeRegistrationInput

func (CsiVolumeRegistrationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CsiVolumeRegistration)(nil)).Elem()
}

func (i CsiVolumeRegistrationMap) ToCsiVolumeRegistrationMapOutput() CsiVolumeRegistrationMapOutput {
	return i.ToCsiVolumeRegistrationMapOutputWithContext(context.Background())
}

func (i CsiVolumeRegistrationMap) ToCsiVolumeRegistrationMapOutputWithContext(ctx context.Context) CsiVolumeRegistrationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CsiVolumeRegistrationMapOutput)
}

type CsiVolumeRegistrationOutput struct{ *pulumi.OutputState }

func (CsiVolumeRegistrationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CsiVolumeRegistration)(nil)).Elem()
}

func (o CsiVolumeRegistrationOutput) ToCsiVolumeRegistrationOutput() CsiVolumeRegistrationOutput {
	return o
}

func (o CsiVolumeRegistrationOutput) ToCsiVolumeRegistrationOutputWithContext(ctx context.Context) CsiVolumeRegistrationOutput {
	return o
}

// `(“Capability“: <required>)` - Options for validating the capability of a volume.
func (o CsiVolumeRegistrationOutput) Capabilities() CsiVolumeRegistrationCapabilityArrayOutput {
	return o.ApplyT(func(v *CsiVolumeRegistration) CsiVolumeRegistrationCapabilityArrayOutput { return v.Capabilities }).(CsiVolumeRegistrationCapabilityArrayOutput)
}

func (o CsiVolumeRegistrationOutput) Capacity() pulumi.IntOutput {
	return o.ApplyT(func(v *CsiVolumeRegistration) pulumi.IntOutput { return v.Capacity }).(pulumi.IntOutput)
}

// `(string: <optional>)` - Option to signal a maximum volume size. This may not be supported by all storage providers.
func (o CsiVolumeRegistrationOutput) CapacityMax() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CsiVolumeRegistration) pulumi.StringPtrOutput { return v.CapacityMax }).(pulumi.StringPtrOutput)
}

func (o CsiVolumeRegistrationOutput) CapacityMaxBytes() pulumi.IntOutput {
	return o.ApplyT(func(v *CsiVolumeRegistration) pulumi.IntOutput { return v.CapacityMaxBytes }).(pulumi.IntOutput)
}

// `(string: <optional>)` - Option to signal a minimum volume size. This may not be supported by all storage providers.
func (o CsiVolumeRegistrationOutput) CapacityMin() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CsiVolumeRegistration) pulumi.StringPtrOutput { return v.CapacityMin }).(pulumi.StringPtrOutput)
}

func (o CsiVolumeRegistrationOutput) CapacityMinBytes() pulumi.IntOutput {
	return o.ApplyT(func(v *CsiVolumeRegistration) pulumi.IntOutput { return v.CapacityMinBytes }).(pulumi.IntOutput)
}

// `(map[string]string: <optional>)` - An optional key-value map of strings passed directly to the CSI plugin to validate the volume.
func (o CsiVolumeRegistrationOutput) Context() pulumi.StringMapOutput {
	return o.ApplyT(func(v *CsiVolumeRegistration) pulumi.StringMapOutput { return v.Context }).(pulumi.StringMapOutput)
}

// `(boolean)`
func (o CsiVolumeRegistrationOutput) ControllerRequired() pulumi.BoolOutput {
	return o.ApplyT(func(v *CsiVolumeRegistration) pulumi.BoolOutput { return v.ControllerRequired }).(pulumi.BoolOutput)
}

// `(integer)`
func (o CsiVolumeRegistrationOutput) ControllersExpected() pulumi.IntOutput {
	return o.ApplyT(func(v *CsiVolumeRegistration) pulumi.IntOutput { return v.ControllersExpected }).(pulumi.IntOutput)
}

// `(integer)`
func (o CsiVolumeRegistrationOutput) ControllersHealthy() pulumi.IntOutput {
	return o.ApplyT(func(v *CsiVolumeRegistration) pulumi.IntOutput { return v.ControllersHealthy }).(pulumi.IntOutput)
}

// `(boolean: true)` - If true, the volume will be deregistered on destroy.
func (o CsiVolumeRegistrationOutput) DeregisterOnDestroy() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CsiVolumeRegistration) pulumi.BoolPtrOutput { return v.DeregisterOnDestroy }).(pulumi.BoolPtrOutput)
}

// `(string: <required>)` - The ID of the physical volume from the storage provider.
func (o CsiVolumeRegistrationOutput) ExternalId() pulumi.StringOutput {
	return o.ApplyT(func(v *CsiVolumeRegistration) pulumi.StringOutput { return v.ExternalId }).(pulumi.StringOutput)
}

// `(block: <optional>)` Options for mounting `block-device` volumes without a pre-formatted file system.
func (o CsiVolumeRegistrationOutput) MountOptions() CsiVolumeRegistrationMountOptionsPtrOutput {
	return o.ApplyT(func(v *CsiVolumeRegistration) CsiVolumeRegistrationMountOptionsPtrOutput { return v.MountOptions }).(CsiVolumeRegistrationMountOptionsPtrOutput)
}

// `(string: <required>)` - The display name for the volume.
func (o CsiVolumeRegistrationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *CsiVolumeRegistration) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// `(string: "default")` - The namespace in which to register the volume.
func (o CsiVolumeRegistrationOutput) Namespace() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CsiVolumeRegistration) pulumi.StringPtrOutput { return v.Namespace }).(pulumi.StringPtrOutput)
}

// `(integer)`
func (o CsiVolumeRegistrationOutput) NodesExpected() pulumi.IntOutput {
	return o.ApplyT(func(v *CsiVolumeRegistration) pulumi.IntOutput { return v.NodesExpected }).(pulumi.IntOutput)
}

// `(integer)`
func (o CsiVolumeRegistrationOutput) NodesHealthy() pulumi.IntOutput {
	return o.ApplyT(func(v *CsiVolumeRegistration) pulumi.IntOutput { return v.NodesHealthy }).(pulumi.IntOutput)
}

// `(map[string]string: <optional>)` - An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
func (o CsiVolumeRegistrationOutput) Parameters() pulumi.StringMapOutput {
	return o.ApplyT(func(v *CsiVolumeRegistration) pulumi.StringMapOutput { return v.Parameters }).(pulumi.StringMapOutput)
}

// `(string: <required>)` - The ID of the Nomad plugin for registering this volume.
func (o CsiVolumeRegistrationOutput) PluginId() pulumi.StringOutput {
	return o.ApplyT(func(v *CsiVolumeRegistration) pulumi.StringOutput { return v.PluginId }).(pulumi.StringOutput)
}

// `(string)`
func (o CsiVolumeRegistrationOutput) PluginProvider() pulumi.StringOutput {
	return o.ApplyT(func(v *CsiVolumeRegistration) pulumi.StringOutput { return v.PluginProvider }).(pulumi.StringOutput)
}

// `(string)`
func (o CsiVolumeRegistrationOutput) PluginProviderVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *CsiVolumeRegistration) pulumi.StringOutput { return v.PluginProviderVersion }).(pulumi.StringOutput)
}

// `(boolean)`
func (o CsiVolumeRegistrationOutput) Schedulable() pulumi.BoolOutput {
	return o.ApplyT(func(v *CsiVolumeRegistration) pulumi.BoolOutput { return v.Schedulable }).(pulumi.BoolOutput)
}

// `(map[string]string: <optional>)` - An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
func (o CsiVolumeRegistrationOutput) Secrets() pulumi.StringMapOutput {
	return o.ApplyT(func(v *CsiVolumeRegistration) pulumi.StringMapOutput { return v.Secrets }).(pulumi.StringMapOutput)
}

// `(List of topologies)`
func (o CsiVolumeRegistrationOutput) Topologies() CsiVolumeRegistrationTopologyArrayOutput {
	return o.ApplyT(func(v *CsiVolumeRegistration) CsiVolumeRegistrationTopologyArrayOutput { return v.Topologies }).(CsiVolumeRegistrationTopologyArrayOutput)
}

// `(“TopologyRequest“: <optional>)` - Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
func (o CsiVolumeRegistrationOutput) TopologyRequest() CsiVolumeRegistrationTopologyRequestPtrOutput {
	return o.ApplyT(func(v *CsiVolumeRegistration) CsiVolumeRegistrationTopologyRequestPtrOutput { return v.TopologyRequest }).(CsiVolumeRegistrationTopologyRequestPtrOutput)
}

// `(string: <required>)` - The unique ID of the volume.
func (o CsiVolumeRegistrationOutput) VolumeId() pulumi.StringOutput {
	return o.ApplyT(func(v *CsiVolumeRegistration) pulumi.StringOutput { return v.VolumeId }).(pulumi.StringOutput)
}

type CsiVolumeRegistrationArrayOutput struct{ *pulumi.OutputState }

func (CsiVolumeRegistrationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CsiVolumeRegistration)(nil)).Elem()
}

func (o CsiVolumeRegistrationArrayOutput) ToCsiVolumeRegistrationArrayOutput() CsiVolumeRegistrationArrayOutput {
	return o
}

func (o CsiVolumeRegistrationArrayOutput) ToCsiVolumeRegistrationArrayOutputWithContext(ctx context.Context) CsiVolumeRegistrationArrayOutput {
	return o
}

func (o CsiVolumeRegistrationArrayOutput) Index(i pulumi.IntInput) CsiVolumeRegistrationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CsiVolumeRegistration {
		return vs[0].([]*CsiVolumeRegistration)[vs[1].(int)]
	}).(CsiVolumeRegistrationOutput)
}

type CsiVolumeRegistrationMapOutput struct{ *pulumi.OutputState }

func (CsiVolumeRegistrationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CsiVolumeRegistration)(nil)).Elem()
}

func (o CsiVolumeRegistrationMapOutput) ToCsiVolumeRegistrationMapOutput() CsiVolumeRegistrationMapOutput {
	return o
}

func (o CsiVolumeRegistrationMapOutput) ToCsiVolumeRegistrationMapOutputWithContext(ctx context.Context) CsiVolumeRegistrationMapOutput {
	return o
}

func (o CsiVolumeRegistrationMapOutput) MapIndex(k pulumi.StringInput) CsiVolumeRegistrationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CsiVolumeRegistration {
		return vs[0].(map[string]*CsiVolumeRegistration)[vs[1].(string)]
	}).(CsiVolumeRegistrationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CsiVolumeRegistrationInput)(nil)).Elem(), &CsiVolumeRegistration{})
	pulumi.RegisterInputType(reflect.TypeOf((*CsiVolumeRegistrationArrayInput)(nil)).Elem(), CsiVolumeRegistrationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CsiVolumeRegistrationMapInput)(nil)).Elem(), CsiVolumeRegistrationMap{})
	pulumi.RegisterOutputType(CsiVolumeRegistrationOutput{})
	pulumi.RegisterOutputType(CsiVolumeRegistrationArrayOutput{})
	pulumi.RegisterOutputType(CsiVolumeRegistrationMapOutput{})
}
