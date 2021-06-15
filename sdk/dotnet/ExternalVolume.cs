// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad
{
    [NomadResourceType("nomad:index/externalVolume:ExternalVolume")]
    public partial class ExternalVolume : Pulumi.CustomResource
    {
        /// <summary>
        /// Capabilities intended to be used in a job. At least one capability must be provided.
        /// </summary>
        [Output("capabilities")]
        public Output<ImmutableArray<Outputs.ExternalVolumeCapability>> Capabilities { get; private set; } = null!;

        /// <summary>
        /// Defines how large the volume can be. The storage provider may return a volume that is smaller than this value.
        /// </summary>
        [Output("capacityMax")]
        public Output<string?> CapacityMax { get; private set; } = null!;

        /// <summary>
        /// Defines how small the volume can be. The storage provider may return a volume that is larger than this value.
        /// </summary>
        [Output("capacityMin")]
        public Output<string?> CapacityMin { get; private set; } = null!;

        /// <summary>
        /// The volume ID to clone when creating this volume. Storage provider must support cloning. Conflicts with 'snapshot_id'.
        /// </summary>
        [Output("cloneId")]
        public Output<string?> CloneId { get; private set; } = null!;

        [Output("controllerRequired")]
        public Output<bool> ControllerRequired { get; private set; } = null!;

        [Output("controllersExpected")]
        public Output<int> ControllersExpected { get; private set; } = null!;

        [Output("controllersHealthy")]
        public Output<int> ControllersHealthy { get; private set; } = null!;

        /// <summary>
        /// Options for mounting 'block-device' volumes without a pre-formatted file system.
        /// </summary>
        [Output("mountOptions")]
        public Output<Outputs.ExternalVolumeMountOptions?> MountOptions { get; private set; } = null!;

        /// <summary>
        /// The display name of the volume.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The namespace in which to create the volume.
        /// </summary>
        [Output("namespace")]
        public Output<string?> Namespace { get; private set; } = null!;

        [Output("nodesExpected")]
        public Output<int> NodesExpected { get; private set; } = null!;

        [Output("nodesHealthy")]
        public Output<int> NodesHealthy { get; private set; } = null!;

        /// <summary>
        /// An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
        /// </summary>
        [Output("parameters")]
        public Output<ImmutableDictionary<string, string>?> Parameters { get; private set; } = null!;

        /// <summary>
        /// The ID of the CSI plugin that manages this volume.
        /// </summary>
        [Output("pluginId")]
        public Output<string> PluginId { get; private set; } = null!;

        [Output("pluginProvider")]
        public Output<string> PluginProvider { get; private set; } = null!;

        [Output("pluginProviderVersion")]
        public Output<string> PluginProviderVersion { get; private set; } = null!;

        [Output("schedulable")]
        public Output<bool> Schedulable { get; private set; } = null!;

        /// <summary>
        /// An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
        /// </summary>
        [Output("secrets")]
        public Output<ImmutableDictionary<string, string>?> Secrets { get; private set; } = null!;

        /// <summary>
        /// The snapshot ID to restore when creating this volume. Storage provider must support snapshots. Conflicts with
        /// 'clone_id'.
        /// </summary>
        [Output("snapshotId")]
        public Output<string?> SnapshotId { get; private set; } = null!;

        /// <summary>
        /// The type of the volume. Currently, only 'csi' is supported.
        /// </summary>
        [Output("type")]
        public Output<string?> Type { get; private set; } = null!;

        /// <summary>
        /// The unique ID of the volume, how jobs will refer to the volume.
        /// </summary>
        [Output("volumeId")]
        public Output<string> VolumeId { get; private set; } = null!;


        /// <summary>
        /// Create a ExternalVolume resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ExternalVolume(string name, ExternalVolumeArgs args, CustomResourceOptions? options = null)
            : base("nomad:index/externalVolume:ExternalVolume", name, args ?? new ExternalVolumeArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ExternalVolume(string name, Input<string> id, ExternalVolumeState? state = null, CustomResourceOptions? options = null)
            : base("nomad:index/externalVolume:ExternalVolume", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ExternalVolume resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ExternalVolume Get(string name, Input<string> id, ExternalVolumeState? state = null, CustomResourceOptions? options = null)
        {
            return new ExternalVolume(name, id, state, options);
        }
    }

    public sealed class ExternalVolumeArgs : Pulumi.ResourceArgs
    {
        [Input("capabilities", required: true)]
        private InputList<Inputs.ExternalVolumeCapabilityArgs>? _capabilities;

        /// <summary>
        /// Capabilities intended to be used in a job. At least one capability must be provided.
        /// </summary>
        public InputList<Inputs.ExternalVolumeCapabilityArgs> Capabilities
        {
            get => _capabilities ?? (_capabilities = new InputList<Inputs.ExternalVolumeCapabilityArgs>());
            set => _capabilities = value;
        }

        /// <summary>
        /// Defines how large the volume can be. The storage provider may return a volume that is smaller than this value.
        /// </summary>
        [Input("capacityMax")]
        public Input<string>? CapacityMax { get; set; }

        /// <summary>
        /// Defines how small the volume can be. The storage provider may return a volume that is larger than this value.
        /// </summary>
        [Input("capacityMin")]
        public Input<string>? CapacityMin { get; set; }

        /// <summary>
        /// The volume ID to clone when creating this volume. Storage provider must support cloning. Conflicts with 'snapshot_id'.
        /// </summary>
        [Input("cloneId")]
        public Input<string>? CloneId { get; set; }

        /// <summary>
        /// Options for mounting 'block-device' volumes without a pre-formatted file system.
        /// </summary>
        [Input("mountOptions")]
        public Input<Inputs.ExternalVolumeMountOptionsArgs>? MountOptions { get; set; }

        /// <summary>
        /// The display name of the volume.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The namespace in which to create the volume.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        [Input("parameters")]
        private InputMap<string>? _parameters;

        /// <summary>
        /// An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
        /// </summary>
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        /// <summary>
        /// The ID of the CSI plugin that manages this volume.
        /// </summary>
        [Input("pluginId", required: true)]
        public Input<string> PluginId { get; set; } = null!;

        [Input("secrets")]
        private InputMap<string>? _secrets;

        /// <summary>
        /// An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
        /// </summary>
        public InputMap<string> Secrets
        {
            get => _secrets ?? (_secrets = new InputMap<string>());
            set => _secrets = value;
        }

        /// <summary>
        /// The snapshot ID to restore when creating this volume. Storage provider must support snapshots. Conflicts with
        /// 'clone_id'.
        /// </summary>
        [Input("snapshotId")]
        public Input<string>? SnapshotId { get; set; }

        /// <summary>
        /// The type of the volume. Currently, only 'csi' is supported.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The unique ID of the volume, how jobs will refer to the volume.
        /// </summary>
        [Input("volumeId", required: true)]
        public Input<string> VolumeId { get; set; } = null!;

        public ExternalVolumeArgs()
        {
        }
    }

    public sealed class ExternalVolumeState : Pulumi.ResourceArgs
    {
        [Input("capabilities")]
        private InputList<Inputs.ExternalVolumeCapabilityGetArgs>? _capabilities;

        /// <summary>
        /// Capabilities intended to be used in a job. At least one capability must be provided.
        /// </summary>
        public InputList<Inputs.ExternalVolumeCapabilityGetArgs> Capabilities
        {
            get => _capabilities ?? (_capabilities = new InputList<Inputs.ExternalVolumeCapabilityGetArgs>());
            set => _capabilities = value;
        }

        /// <summary>
        /// Defines how large the volume can be. The storage provider may return a volume that is smaller than this value.
        /// </summary>
        [Input("capacityMax")]
        public Input<string>? CapacityMax { get; set; }

        /// <summary>
        /// Defines how small the volume can be. The storage provider may return a volume that is larger than this value.
        /// </summary>
        [Input("capacityMin")]
        public Input<string>? CapacityMin { get; set; }

        /// <summary>
        /// The volume ID to clone when creating this volume. Storage provider must support cloning. Conflicts with 'snapshot_id'.
        /// </summary>
        [Input("cloneId")]
        public Input<string>? CloneId { get; set; }

        [Input("controllerRequired")]
        public Input<bool>? ControllerRequired { get; set; }

        [Input("controllersExpected")]
        public Input<int>? ControllersExpected { get; set; }

        [Input("controllersHealthy")]
        public Input<int>? ControllersHealthy { get; set; }

        /// <summary>
        /// Options for mounting 'block-device' volumes without a pre-formatted file system.
        /// </summary>
        [Input("mountOptions")]
        public Input<Inputs.ExternalVolumeMountOptionsGetArgs>? MountOptions { get; set; }

        /// <summary>
        /// The display name of the volume.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The namespace in which to create the volume.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        [Input("nodesExpected")]
        public Input<int>? NodesExpected { get; set; }

        [Input("nodesHealthy")]
        public Input<int>? NodesHealthy { get; set; }

        [Input("parameters")]
        private InputMap<string>? _parameters;

        /// <summary>
        /// An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
        /// </summary>
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        /// <summary>
        /// The ID of the CSI plugin that manages this volume.
        /// </summary>
        [Input("pluginId")]
        public Input<string>? PluginId { get; set; }

        [Input("pluginProvider")]
        public Input<string>? PluginProvider { get; set; }

        [Input("pluginProviderVersion")]
        public Input<string>? PluginProviderVersion { get; set; }

        [Input("schedulable")]
        public Input<bool>? Schedulable { get; set; }

        [Input("secrets")]
        private InputMap<string>? _secrets;

        /// <summary>
        /// An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
        /// </summary>
        public InputMap<string> Secrets
        {
            get => _secrets ?? (_secrets = new InputMap<string>());
            set => _secrets = value;
        }

        /// <summary>
        /// The snapshot ID to restore when creating this volume. Storage provider must support snapshots. Conflicts with
        /// 'clone_id'.
        /// </summary>
        [Input("snapshotId")]
        public Input<string>? SnapshotId { get; set; }

        /// <summary>
        /// The type of the volume. Currently, only 'csi' is supported.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The unique ID of the volume, how jobs will refer to the volume.
        /// </summary>
        [Input("volumeId")]
        public Input<string>? VolumeId { get; set; }

        public ExternalVolumeState()
        {
        }
    }
}