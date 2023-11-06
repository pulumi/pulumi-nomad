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
// Creating a volume:
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
//			ebs, err := nomad.GetPlugin(ctx, &nomad.GetPluginArgs{
//				PluginId:       "aws-ebs0",
//				WaitForHealthy: pulumi.BoolRef(true),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = nomad.NewCsiVolume(ctx, "mysqlVolume", &nomad.CsiVolumeArgs{
//				PluginId:    pulumi.String("aws-ebs0"),
//				VolumeId:    pulumi.String("mysql_volume"),
//				CapacityMin: pulumi.String("10GiB"),
//				CapacityMax: pulumi.String("20GiB"),
//				Capabilities: nomad.CsiVolumeCapabilityArray{
//					&nomad.CsiVolumeCapabilityArgs{
//						AccessMode:     pulumi.String("single-node-writer"),
//						AttachmentMode: pulumi.String("file-system"),
//					},
//				},
//				MountOptions: &nomad.CsiVolumeMountOptionsArgs{
//					FsType: pulumi.String("ext4"),
//				},
//				TopologyRequest: &nomad.CsiVolumeTopologyRequestArgs{
//					Required: &nomad.CsiVolumeTopologyRequestRequiredArgs{
//						Topologies: nomad.CsiVolumeTopologyRequestRequiredTopologyArray{
//							&nomad.CsiVolumeTopologyRequestRequiredTopologyArgs{
//								Segments: pulumi.StringMap{
//									"rack": pulumi.String("R1"),
//									"zone": pulumi.String("us-east-1a"),
//								},
//							},
//							&nomad.CsiVolumeTopologyRequestRequiredTopologyArgs{
//								Segments: pulumi.StringMap{
//									"rack": pulumi.String("R2"),
//								},
//							},
//						},
//					},
//				},
//			}, pulumi.DependsOn([]pulumi.Resource{
//				ebs,
//			}))
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type CsiVolume struct {
	pulumi.CustomResourceState

	// `(``Capability``: <required>)` - Options for validating the capability of a volume.
	Capabilities CsiVolumeCapabilityArrayOutput `pulumi:"capabilities"`
	// `(string: <optional>)` - Option to signal a maximum volume size. This may not be supported by all storage providers.
	CapacityMax pulumi.StringPtrOutput `pulumi:"capacityMax"`
	// `(string: <optional>)` - Option to signal a minimum volume size. This may not be supported by all storage providers.
	CapacityMin pulumi.StringPtrOutput `pulumi:"capacityMin"`
	// `(string: <optional>)` - The external ID of an existing volume to restore. If ommited, the volume will be created from scratch. Conflicts with `snapshotId`.
	CloneId pulumi.StringPtrOutput `pulumi:"cloneId"`
	// `(boolean)`
	ControllerRequired pulumi.BoolOutput `pulumi:"controllerRequired"`
	// `(integer)`
	ControllersExpected pulumi.IntOutput `pulumi:"controllersExpected"`
	// `(integer)`
	ControllersHealthy pulumi.IntOutput `pulumi:"controllersHealthy"`
	// `(block: optional)` Options for mounting `block-device` volumes without a pre-formatted file system.
	MountOptions CsiVolumeMountOptionsPtrOutput `pulumi:"mountOptions"`
	// `(string: <required>)` - The display name for the volume.
	Name pulumi.StringOutput `pulumi:"name"`
	// `(string: "default")` - The namespace in which to register the volume.
	Namespace pulumi.StringPtrOutput `pulumi:"namespace"`
	// `(integer)`
	NodesExpected pulumi.IntOutput `pulumi:"nodesExpected"`
	// `(integer)`
	NodesHealthy pulumi.IntOutput `pulumi:"nodesHealthy"`
	// `(map[string]string: optional)` An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
	Parameters pulumi.StringMapOutput `pulumi:"parameters"`
	// `(string: <required>)` - The ID of the Nomad plugin for registering this volume.
	PluginId pulumi.StringOutput `pulumi:"pluginId"`
	// `(string)`
	PluginProvider pulumi.StringOutput `pulumi:"pluginProvider"`
	// `(string)`
	PluginProviderVersion pulumi.StringOutput `pulumi:"pluginProviderVersion"`
	// `(boolean)`
	Schedulable pulumi.BoolOutput `pulumi:"schedulable"`
	// `(map[string]string: optional)` An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
	Secrets pulumi.StringMapOutput `pulumi:"secrets"`
	// `(string: <optional>)` - The external ID of a snapshot to restore. If ommited, the volume will be created from scratch. Conflicts with `cloneId`.
	SnapshotId pulumi.StringPtrOutput `pulumi:"snapshotId"`
	// `(List of topologies)`
	Topologies CsiVolumeTopologyArrayOutput `pulumi:"topologies"`
	// `(``TopologyRequest``: <optional>)` - Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
	TopologyRequest CsiVolumeTopologyRequestPtrOutput `pulumi:"topologyRequest"`
	// `(string: <required>)` - The unique ID of the volume.
	VolumeId pulumi.StringOutput `pulumi:"volumeId"`
}

// NewCsiVolume registers a new resource with the given unique name, arguments, and options.
func NewCsiVolume(ctx *pulumi.Context,
	name string, args *CsiVolumeArgs, opts ...pulumi.ResourceOption) (*CsiVolume, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Capabilities == nil {
		return nil, errors.New("invalid value for required argument 'Capabilities'")
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
	var resource CsiVolume
	err := ctx.RegisterResource("nomad:index/csiVolume:CsiVolume", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCsiVolume gets an existing CsiVolume resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCsiVolume(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CsiVolumeState, opts ...pulumi.ResourceOption) (*CsiVolume, error) {
	var resource CsiVolume
	err := ctx.ReadResource("nomad:index/csiVolume:CsiVolume", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CsiVolume resources.
type csiVolumeState struct {
	// `(``Capability``: <required>)` - Options for validating the capability of a volume.
	Capabilities []CsiVolumeCapability `pulumi:"capabilities"`
	// `(string: <optional>)` - Option to signal a maximum volume size. This may not be supported by all storage providers.
	CapacityMax *string `pulumi:"capacityMax"`
	// `(string: <optional>)` - Option to signal a minimum volume size. This may not be supported by all storage providers.
	CapacityMin *string `pulumi:"capacityMin"`
	// `(string: <optional>)` - The external ID of an existing volume to restore. If ommited, the volume will be created from scratch. Conflicts with `snapshotId`.
	CloneId *string `pulumi:"cloneId"`
	// `(boolean)`
	ControllerRequired *bool `pulumi:"controllerRequired"`
	// `(integer)`
	ControllersExpected *int `pulumi:"controllersExpected"`
	// `(integer)`
	ControllersHealthy *int `pulumi:"controllersHealthy"`
	// `(block: optional)` Options for mounting `block-device` volumes without a pre-formatted file system.
	MountOptions *CsiVolumeMountOptions `pulumi:"mountOptions"`
	// `(string: <required>)` - The display name for the volume.
	Name *string `pulumi:"name"`
	// `(string: "default")` - The namespace in which to register the volume.
	Namespace *string `pulumi:"namespace"`
	// `(integer)`
	NodesExpected *int `pulumi:"nodesExpected"`
	// `(integer)`
	NodesHealthy *int `pulumi:"nodesHealthy"`
	// `(map[string]string: optional)` An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
	Parameters map[string]string `pulumi:"parameters"`
	// `(string: <required>)` - The ID of the Nomad plugin for registering this volume.
	PluginId *string `pulumi:"pluginId"`
	// `(string)`
	PluginProvider *string `pulumi:"pluginProvider"`
	// `(string)`
	PluginProviderVersion *string `pulumi:"pluginProviderVersion"`
	// `(boolean)`
	Schedulable *bool `pulumi:"schedulable"`
	// `(map[string]string: optional)` An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
	Secrets map[string]string `pulumi:"secrets"`
	// `(string: <optional>)` - The external ID of a snapshot to restore. If ommited, the volume will be created from scratch. Conflicts with `cloneId`.
	SnapshotId *string `pulumi:"snapshotId"`
	// `(List of topologies)`
	Topologies []CsiVolumeTopology `pulumi:"topologies"`
	// `(``TopologyRequest``: <optional>)` - Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
	TopologyRequest *CsiVolumeTopologyRequest `pulumi:"topologyRequest"`
	// `(string: <required>)` - The unique ID of the volume.
	VolumeId *string `pulumi:"volumeId"`
}

type CsiVolumeState struct {
	// `(``Capability``: <required>)` - Options for validating the capability of a volume.
	Capabilities CsiVolumeCapabilityArrayInput
	// `(string: <optional>)` - Option to signal a maximum volume size. This may not be supported by all storage providers.
	CapacityMax pulumi.StringPtrInput
	// `(string: <optional>)` - Option to signal a minimum volume size. This may not be supported by all storage providers.
	CapacityMin pulumi.StringPtrInput
	// `(string: <optional>)` - The external ID of an existing volume to restore. If ommited, the volume will be created from scratch. Conflicts with `snapshotId`.
	CloneId pulumi.StringPtrInput
	// `(boolean)`
	ControllerRequired pulumi.BoolPtrInput
	// `(integer)`
	ControllersExpected pulumi.IntPtrInput
	// `(integer)`
	ControllersHealthy pulumi.IntPtrInput
	// `(block: optional)` Options for mounting `block-device` volumes without a pre-formatted file system.
	MountOptions CsiVolumeMountOptionsPtrInput
	// `(string: <required>)` - The display name for the volume.
	Name pulumi.StringPtrInput
	// `(string: "default")` - The namespace in which to register the volume.
	Namespace pulumi.StringPtrInput
	// `(integer)`
	NodesExpected pulumi.IntPtrInput
	// `(integer)`
	NodesHealthy pulumi.IntPtrInput
	// `(map[string]string: optional)` An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
	Parameters pulumi.StringMapInput
	// `(string: <required>)` - The ID of the Nomad plugin for registering this volume.
	PluginId pulumi.StringPtrInput
	// `(string)`
	PluginProvider pulumi.StringPtrInput
	// `(string)`
	PluginProviderVersion pulumi.StringPtrInput
	// `(boolean)`
	Schedulable pulumi.BoolPtrInput
	// `(map[string]string: optional)` An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
	Secrets pulumi.StringMapInput
	// `(string: <optional>)` - The external ID of a snapshot to restore. If ommited, the volume will be created from scratch. Conflicts with `cloneId`.
	SnapshotId pulumi.StringPtrInput
	// `(List of topologies)`
	Topologies CsiVolumeTopologyArrayInput
	// `(``TopologyRequest``: <optional>)` - Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
	TopologyRequest CsiVolumeTopologyRequestPtrInput
	// `(string: <required>)` - The unique ID of the volume.
	VolumeId pulumi.StringPtrInput
}

func (CsiVolumeState) ElementType() reflect.Type {
	return reflect.TypeOf((*csiVolumeState)(nil)).Elem()
}

type csiVolumeArgs struct {
	// `(``Capability``: <required>)` - Options for validating the capability of a volume.
	Capabilities []CsiVolumeCapability `pulumi:"capabilities"`
	// `(string: <optional>)` - Option to signal a maximum volume size. This may not be supported by all storage providers.
	CapacityMax *string `pulumi:"capacityMax"`
	// `(string: <optional>)` - Option to signal a minimum volume size. This may not be supported by all storage providers.
	CapacityMin *string `pulumi:"capacityMin"`
	// `(string: <optional>)` - The external ID of an existing volume to restore. If ommited, the volume will be created from scratch. Conflicts with `snapshotId`.
	CloneId *string `pulumi:"cloneId"`
	// `(block: optional)` Options for mounting `block-device` volumes without a pre-formatted file system.
	MountOptions *CsiVolumeMountOptions `pulumi:"mountOptions"`
	// `(string: <required>)` - The display name for the volume.
	Name *string `pulumi:"name"`
	// `(string: "default")` - The namespace in which to register the volume.
	Namespace *string `pulumi:"namespace"`
	// `(map[string]string: optional)` An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
	Parameters map[string]string `pulumi:"parameters"`
	// `(string: <required>)` - The ID of the Nomad plugin for registering this volume.
	PluginId string `pulumi:"pluginId"`
	// `(map[string]string: optional)` An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
	Secrets map[string]string `pulumi:"secrets"`
	// `(string: <optional>)` - The external ID of a snapshot to restore. If ommited, the volume will be created from scratch. Conflicts with `cloneId`.
	SnapshotId *string `pulumi:"snapshotId"`
	// `(``TopologyRequest``: <optional>)` - Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
	TopologyRequest *CsiVolumeTopologyRequest `pulumi:"topologyRequest"`
	// `(string: <required>)` - The unique ID of the volume.
	VolumeId string `pulumi:"volumeId"`
}

// The set of arguments for constructing a CsiVolume resource.
type CsiVolumeArgs struct {
	// `(``Capability``: <required>)` - Options for validating the capability of a volume.
	Capabilities CsiVolumeCapabilityArrayInput
	// `(string: <optional>)` - Option to signal a maximum volume size. This may not be supported by all storage providers.
	CapacityMax pulumi.StringPtrInput
	// `(string: <optional>)` - Option to signal a minimum volume size. This may not be supported by all storage providers.
	CapacityMin pulumi.StringPtrInput
	// `(string: <optional>)` - The external ID of an existing volume to restore. If ommited, the volume will be created from scratch. Conflicts with `snapshotId`.
	CloneId pulumi.StringPtrInput
	// `(block: optional)` Options for mounting `block-device` volumes without a pre-formatted file system.
	MountOptions CsiVolumeMountOptionsPtrInput
	// `(string: <required>)` - The display name for the volume.
	Name pulumi.StringPtrInput
	// `(string: "default")` - The namespace in which to register the volume.
	Namespace pulumi.StringPtrInput
	// `(map[string]string: optional)` An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
	Parameters pulumi.StringMapInput
	// `(string: <required>)` - The ID of the Nomad plugin for registering this volume.
	PluginId pulumi.StringInput
	// `(map[string]string: optional)` An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
	Secrets pulumi.StringMapInput
	// `(string: <optional>)` - The external ID of a snapshot to restore. If ommited, the volume will be created from scratch. Conflicts with `cloneId`.
	SnapshotId pulumi.StringPtrInput
	// `(``TopologyRequest``: <optional>)` - Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
	TopologyRequest CsiVolumeTopologyRequestPtrInput
	// `(string: <required>)` - The unique ID of the volume.
	VolumeId pulumi.StringInput
}

func (CsiVolumeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*csiVolumeArgs)(nil)).Elem()
}

type CsiVolumeInput interface {
	pulumi.Input

	ToCsiVolumeOutput() CsiVolumeOutput
	ToCsiVolumeOutputWithContext(ctx context.Context) CsiVolumeOutput
}

func (*CsiVolume) ElementType() reflect.Type {
	return reflect.TypeOf((**CsiVolume)(nil)).Elem()
}

func (i *CsiVolume) ToCsiVolumeOutput() CsiVolumeOutput {
	return i.ToCsiVolumeOutputWithContext(context.Background())
}

func (i *CsiVolume) ToCsiVolumeOutputWithContext(ctx context.Context) CsiVolumeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CsiVolumeOutput)
}

// CsiVolumeArrayInput is an input type that accepts CsiVolumeArray and CsiVolumeArrayOutput values.
// You can construct a concrete instance of `CsiVolumeArrayInput` via:
//
//	CsiVolumeArray{ CsiVolumeArgs{...} }
type CsiVolumeArrayInput interface {
	pulumi.Input

	ToCsiVolumeArrayOutput() CsiVolumeArrayOutput
	ToCsiVolumeArrayOutputWithContext(context.Context) CsiVolumeArrayOutput
}

type CsiVolumeArray []CsiVolumeInput

func (CsiVolumeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CsiVolume)(nil)).Elem()
}

func (i CsiVolumeArray) ToCsiVolumeArrayOutput() CsiVolumeArrayOutput {
	return i.ToCsiVolumeArrayOutputWithContext(context.Background())
}

func (i CsiVolumeArray) ToCsiVolumeArrayOutputWithContext(ctx context.Context) CsiVolumeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CsiVolumeArrayOutput)
}

// CsiVolumeMapInput is an input type that accepts CsiVolumeMap and CsiVolumeMapOutput values.
// You can construct a concrete instance of `CsiVolumeMapInput` via:
//
//	CsiVolumeMap{ "key": CsiVolumeArgs{...} }
type CsiVolumeMapInput interface {
	pulumi.Input

	ToCsiVolumeMapOutput() CsiVolumeMapOutput
	ToCsiVolumeMapOutputWithContext(context.Context) CsiVolumeMapOutput
}

type CsiVolumeMap map[string]CsiVolumeInput

func (CsiVolumeMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CsiVolume)(nil)).Elem()
}

func (i CsiVolumeMap) ToCsiVolumeMapOutput() CsiVolumeMapOutput {
	return i.ToCsiVolumeMapOutputWithContext(context.Background())
}

func (i CsiVolumeMap) ToCsiVolumeMapOutputWithContext(ctx context.Context) CsiVolumeMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CsiVolumeMapOutput)
}

type CsiVolumeOutput struct{ *pulumi.OutputState }

func (CsiVolumeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CsiVolume)(nil)).Elem()
}

func (o CsiVolumeOutput) ToCsiVolumeOutput() CsiVolumeOutput {
	return o
}

func (o CsiVolumeOutput) ToCsiVolumeOutputWithContext(ctx context.Context) CsiVolumeOutput {
	return o
}

// `(“Capability“: <required>)` - Options for validating the capability of a volume.
func (o CsiVolumeOutput) Capabilities() CsiVolumeCapabilityArrayOutput {
	return o.ApplyT(func(v *CsiVolume) CsiVolumeCapabilityArrayOutput { return v.Capabilities }).(CsiVolumeCapabilityArrayOutput)
}

// `(string: <optional>)` - Option to signal a maximum volume size. This may not be supported by all storage providers.
func (o CsiVolumeOutput) CapacityMax() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CsiVolume) pulumi.StringPtrOutput { return v.CapacityMax }).(pulumi.StringPtrOutput)
}

// `(string: <optional>)` - Option to signal a minimum volume size. This may not be supported by all storage providers.
func (o CsiVolumeOutput) CapacityMin() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CsiVolume) pulumi.StringPtrOutput { return v.CapacityMin }).(pulumi.StringPtrOutput)
}

// `(string: <optional>)` - The external ID of an existing volume to restore. If ommited, the volume will be created from scratch. Conflicts with `snapshotId`.
func (o CsiVolumeOutput) CloneId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CsiVolume) pulumi.StringPtrOutput { return v.CloneId }).(pulumi.StringPtrOutput)
}

// `(boolean)`
func (o CsiVolumeOutput) ControllerRequired() pulumi.BoolOutput {
	return o.ApplyT(func(v *CsiVolume) pulumi.BoolOutput { return v.ControllerRequired }).(pulumi.BoolOutput)
}

// `(integer)`
func (o CsiVolumeOutput) ControllersExpected() pulumi.IntOutput {
	return o.ApplyT(func(v *CsiVolume) pulumi.IntOutput { return v.ControllersExpected }).(pulumi.IntOutput)
}

// `(integer)`
func (o CsiVolumeOutput) ControllersHealthy() pulumi.IntOutput {
	return o.ApplyT(func(v *CsiVolume) pulumi.IntOutput { return v.ControllersHealthy }).(pulumi.IntOutput)
}

// `(block: optional)` Options for mounting `block-device` volumes without a pre-formatted file system.
func (o CsiVolumeOutput) MountOptions() CsiVolumeMountOptionsPtrOutput {
	return o.ApplyT(func(v *CsiVolume) CsiVolumeMountOptionsPtrOutput { return v.MountOptions }).(CsiVolumeMountOptionsPtrOutput)
}

// `(string: <required>)` - The display name for the volume.
func (o CsiVolumeOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *CsiVolume) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// `(string: "default")` - The namespace in which to register the volume.
func (o CsiVolumeOutput) Namespace() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CsiVolume) pulumi.StringPtrOutput { return v.Namespace }).(pulumi.StringPtrOutput)
}

// `(integer)`
func (o CsiVolumeOutput) NodesExpected() pulumi.IntOutput {
	return o.ApplyT(func(v *CsiVolume) pulumi.IntOutput { return v.NodesExpected }).(pulumi.IntOutput)
}

// `(integer)`
func (o CsiVolumeOutput) NodesHealthy() pulumi.IntOutput {
	return o.ApplyT(func(v *CsiVolume) pulumi.IntOutput { return v.NodesHealthy }).(pulumi.IntOutput)
}

// `(map[string]string: optional)` An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
func (o CsiVolumeOutput) Parameters() pulumi.StringMapOutput {
	return o.ApplyT(func(v *CsiVolume) pulumi.StringMapOutput { return v.Parameters }).(pulumi.StringMapOutput)
}

// `(string: <required>)` - The ID of the Nomad plugin for registering this volume.
func (o CsiVolumeOutput) PluginId() pulumi.StringOutput {
	return o.ApplyT(func(v *CsiVolume) pulumi.StringOutput { return v.PluginId }).(pulumi.StringOutput)
}

// `(string)`
func (o CsiVolumeOutput) PluginProvider() pulumi.StringOutput {
	return o.ApplyT(func(v *CsiVolume) pulumi.StringOutput { return v.PluginProvider }).(pulumi.StringOutput)
}

// `(string)`
func (o CsiVolumeOutput) PluginProviderVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *CsiVolume) pulumi.StringOutput { return v.PluginProviderVersion }).(pulumi.StringOutput)
}

// `(boolean)`
func (o CsiVolumeOutput) Schedulable() pulumi.BoolOutput {
	return o.ApplyT(func(v *CsiVolume) pulumi.BoolOutput { return v.Schedulable }).(pulumi.BoolOutput)
}

// `(map[string]string: optional)` An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
func (o CsiVolumeOutput) Secrets() pulumi.StringMapOutput {
	return o.ApplyT(func(v *CsiVolume) pulumi.StringMapOutput { return v.Secrets }).(pulumi.StringMapOutput)
}

// `(string: <optional>)` - The external ID of a snapshot to restore. If ommited, the volume will be created from scratch. Conflicts with `cloneId`.
func (o CsiVolumeOutput) SnapshotId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CsiVolume) pulumi.StringPtrOutput { return v.SnapshotId }).(pulumi.StringPtrOutput)
}

// `(List of topologies)`
func (o CsiVolumeOutput) Topologies() CsiVolumeTopologyArrayOutput {
	return o.ApplyT(func(v *CsiVolume) CsiVolumeTopologyArrayOutput { return v.Topologies }).(CsiVolumeTopologyArrayOutput)
}

// `(“TopologyRequest“: <optional>)` - Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
func (o CsiVolumeOutput) TopologyRequest() CsiVolumeTopologyRequestPtrOutput {
	return o.ApplyT(func(v *CsiVolume) CsiVolumeTopologyRequestPtrOutput { return v.TopologyRequest }).(CsiVolumeTopologyRequestPtrOutput)
}

// `(string: <required>)` - The unique ID of the volume.
func (o CsiVolumeOutput) VolumeId() pulumi.StringOutput {
	return o.ApplyT(func(v *CsiVolume) pulumi.StringOutput { return v.VolumeId }).(pulumi.StringOutput)
}

type CsiVolumeArrayOutput struct{ *pulumi.OutputState }

func (CsiVolumeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CsiVolume)(nil)).Elem()
}

func (o CsiVolumeArrayOutput) ToCsiVolumeArrayOutput() CsiVolumeArrayOutput {
	return o
}

func (o CsiVolumeArrayOutput) ToCsiVolumeArrayOutputWithContext(ctx context.Context) CsiVolumeArrayOutput {
	return o
}

func (o CsiVolumeArrayOutput) Index(i pulumi.IntInput) CsiVolumeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CsiVolume {
		return vs[0].([]*CsiVolume)[vs[1].(int)]
	}).(CsiVolumeOutput)
}

type CsiVolumeMapOutput struct{ *pulumi.OutputState }

func (CsiVolumeMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CsiVolume)(nil)).Elem()
}

func (o CsiVolumeMapOutput) ToCsiVolumeMapOutput() CsiVolumeMapOutput {
	return o
}

func (o CsiVolumeMapOutput) ToCsiVolumeMapOutputWithContext(ctx context.Context) CsiVolumeMapOutput {
	return o
}

func (o CsiVolumeMapOutput) MapIndex(k pulumi.StringInput) CsiVolumeOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CsiVolume {
		return vs[0].(map[string]*CsiVolume)[vs[1].(string)]
	}).(CsiVolumeOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CsiVolumeInput)(nil)).Elem(), &CsiVolume{})
	pulumi.RegisterInputType(reflect.TypeOf((*CsiVolumeArrayInput)(nil)).Elem(), CsiVolumeArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CsiVolumeMapInput)(nil)).Elem(), CsiVolumeMap{})
	pulumi.RegisterOutputType(CsiVolumeOutput{})
	pulumi.RegisterOutputType(CsiVolumeArrayOutput{})
	pulumi.RegisterOutputType(CsiVolumeMapOutput{})
}
