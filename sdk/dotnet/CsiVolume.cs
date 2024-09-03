// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// Creating a volume:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Nomad = Pulumi.Nomad;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // It can sometimes be helpful to wait for a particular plugin to be available
    ///     var ebs = Nomad.GetPlugin.Invoke(new()
    ///     {
    ///         PluginId = "aws-ebs0",
    ///         WaitForHealthy = true,
    ///     });
    /// 
    ///     var mysqlVolume = new Nomad.CsiVolume("mysql_volume", new()
    ///     {
    ///         PluginId = "aws-ebs0",
    ///         VolumeId = "mysql_volume",
    ///         Name = "mysql_volume",
    ///         CapacityMin = "10GiB",
    ///         CapacityMax = "20GiB",
    ///         Capabilities = new[]
    ///         {
    ///             new Nomad.Inputs.CsiVolumeCapabilityArgs
    ///             {
    ///                 AccessMode = "single-node-writer",
    ///                 AttachmentMode = "file-system",
    ///             },
    ///         },
    ///         MountOptions = new Nomad.Inputs.CsiVolumeMountOptionsArgs
    ///         {
    ///             FsType = "ext4",
    ///         },
    ///         TopologyRequest = new Nomad.Inputs.CsiVolumeTopologyRequestArgs
    ///         {
    ///             Required = new Nomad.Inputs.CsiVolumeTopologyRequestRequiredArgs
    ///             {
    ///                 Topologies = new[]
    ///                 {
    ///                     new Nomad.Inputs.CsiVolumeTopologyRequestRequiredTopologyArgs
    ///                     {
    ///                         Segments = 
    ///                         {
    ///                             { "rack", "R1" },
    ///                             { "zone", "us-east-1a" },
    ///                         },
    ///                     },
    ///                     new Nomad.Inputs.CsiVolumeTopologyRequestRequiredTopologyArgs
    ///                     {
    ///                         Segments = 
    ///                         {
    ///                             { "rack", "R2" },
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             ebs,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Importing CSI Volumes
    /// 
    /// CSI volumes are imported using the pattern `&lt;volume ID&gt;@&lt;namespace&gt;` .
    /// </summary>
    [NomadResourceType("nomad:index/csiVolume:CsiVolume")]
    public partial class CsiVolume : global::Pulumi.CustomResource
    {
        /// <summary>
        /// `(``Capability``: &lt;required&gt;)` - Options for validating the capability of a volume.
        /// </summary>
        [Output("capabilities")]
        public Output<ImmutableArray<Outputs.CsiVolumeCapability>> Capabilities { get; private set; } = null!;

        [Output("capacity")]
        public Output<int> Capacity { get; private set; } = null!;

        /// <summary>
        /// `(string: &lt;optional&gt;)` - Option to signal a maximum volume size. This may not be supported by all storage providers.
        /// </summary>
        [Output("capacityMax")]
        public Output<string?> CapacityMax { get; private set; } = null!;

        [Output("capacityMaxBytes")]
        public Output<int> CapacityMaxBytes { get; private set; } = null!;

        /// <summary>
        /// `(string: &lt;optional&gt;)` - Option to signal a minimum volume size. This may not be supported by all storage providers.
        /// </summary>
        [Output("capacityMin")]
        public Output<string?> CapacityMin { get; private set; } = null!;

        [Output("capacityMinBytes")]
        public Output<int> CapacityMinBytes { get; private set; } = null!;

        /// <summary>
        /// `(string: &lt;optional&gt;)` - The external ID of an existing volume to restore. If ommited, the volume will be created from scratch. Conflicts with `snapshot_id`.
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
        /// The ID of the physical volume from the storage provider.
        /// </summary>
        [Output("externalId")]
        public Output<string> ExternalId { get; private set; } = null!;

        /// <summary>
        /// `(block: optional)` Options for mounting `block-device` volumes without a pre-formatted file system.
        /// </summary>
        [Output("mountOptions")]
        public Output<Outputs.CsiVolumeMountOptions?> MountOptions { get; private set; } = null!;

        /// <summary>
        /// `(string: &lt;required&gt;)` - The display name for the volume.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// `(string: "default")` - The namespace in which to register the volume.
        /// </summary>
        [Output("namespace")]
        public Output<string?> Namespace { get; private set; } = null!;

        [Output("nodesExpected")]
        public Output<int> NodesExpected { get; private set; } = null!;

        [Output("nodesHealthy")]
        public Output<int> NodesHealthy { get; private set; } = null!;

        /// <summary>
        /// `(map[string]string: optional)` An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
        /// </summary>
        [Output("parameters")]
        public Output<ImmutableDictionary<string, string>?> Parameters { get; private set; } = null!;

        /// <summary>
        /// `(string: &lt;required&gt;)` - The ID of the Nomad plugin for registering this volume.
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
        /// `(map[string]string: optional)` An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
        /// </summary>
        [Output("secrets")]
        public Output<ImmutableDictionary<string, string>?> Secrets { get; private set; } = null!;

        /// <summary>
        /// `(string: &lt;optional&gt;)` - The external ID of a snapshot to restore. If ommited, the volume will be created from scratch. Conflicts with `clone_id`.
        /// </summary>
        [Output("snapshotId")]
        public Output<string?> SnapshotId { get; private set; } = null!;

        [Output("topologies")]
        public Output<ImmutableArray<Outputs.CsiVolumeTopology>> Topologies { get; private set; } = null!;

        /// <summary>
        /// `(``TopologyRequest``: &lt;optional&gt;)` - Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
        /// </summary>
        [Output("topologyRequest")]
        public Output<Outputs.CsiVolumeTopologyRequest?> TopologyRequest { get; private set; } = null!;

        /// <summary>
        /// `(string: &lt;required&gt;)` - The unique ID of the volume.
        /// </summary>
        [Output("volumeId")]
        public Output<string> VolumeId { get; private set; } = null!;


        /// <summary>
        /// Create a CsiVolume resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CsiVolume(string name, CsiVolumeArgs args, CustomResourceOptions? options = null)
            : base("nomad:index/csiVolume:CsiVolume", name, args ?? new CsiVolumeArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CsiVolume(string name, Input<string> id, CsiVolumeState? state = null, CustomResourceOptions? options = null)
            : base("nomad:index/csiVolume:CsiVolume", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "secrets",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing CsiVolume resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CsiVolume Get(string name, Input<string> id, CsiVolumeState? state = null, CustomResourceOptions? options = null)
        {
            return new CsiVolume(name, id, state, options);
        }
    }

    public sealed class CsiVolumeArgs : global::Pulumi.ResourceArgs
    {
        [Input("capabilities", required: true)]
        private InputList<Inputs.CsiVolumeCapabilityArgs>? _capabilities;

        /// <summary>
        /// `(``Capability``: &lt;required&gt;)` - Options for validating the capability of a volume.
        /// </summary>
        public InputList<Inputs.CsiVolumeCapabilityArgs> Capabilities
        {
            get => _capabilities ?? (_capabilities = new InputList<Inputs.CsiVolumeCapabilityArgs>());
            set => _capabilities = value;
        }

        /// <summary>
        /// `(string: &lt;optional&gt;)` - Option to signal a maximum volume size. This may not be supported by all storage providers.
        /// </summary>
        [Input("capacityMax")]
        public Input<string>? CapacityMax { get; set; }

        /// <summary>
        /// `(string: &lt;optional&gt;)` - Option to signal a minimum volume size. This may not be supported by all storage providers.
        /// </summary>
        [Input("capacityMin")]
        public Input<string>? CapacityMin { get; set; }

        /// <summary>
        /// `(string: &lt;optional&gt;)` - The external ID of an existing volume to restore. If ommited, the volume will be created from scratch. Conflicts with `snapshot_id`.
        /// </summary>
        [Input("cloneId")]
        public Input<string>? CloneId { get; set; }

        /// <summary>
        /// `(block: optional)` Options for mounting `block-device` volumes without a pre-formatted file system.
        /// </summary>
        [Input("mountOptions")]
        public Input<Inputs.CsiVolumeMountOptionsArgs>? MountOptions { get; set; }

        /// <summary>
        /// `(string: &lt;required&gt;)` - The display name for the volume.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// `(string: "default")` - The namespace in which to register the volume.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        [Input("parameters")]
        private InputMap<string>? _parameters;

        /// <summary>
        /// `(map[string]string: optional)` An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
        /// </summary>
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        /// <summary>
        /// `(string: &lt;required&gt;)` - The ID of the Nomad plugin for registering this volume.
        /// </summary>
        [Input("pluginId", required: true)]
        public Input<string> PluginId { get; set; } = null!;

        [Input("secrets")]
        private InputMap<string>? _secrets;

        /// <summary>
        /// `(map[string]string: optional)` An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
        /// </summary>
        public InputMap<string> Secrets
        {
            get => _secrets ?? (_secrets = new InputMap<string>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, string>());
                _secrets = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// `(string: &lt;optional&gt;)` - The external ID of a snapshot to restore. If ommited, the volume will be created from scratch. Conflicts with `clone_id`.
        /// </summary>
        [Input("snapshotId")]
        public Input<string>? SnapshotId { get; set; }

        /// <summary>
        /// `(``TopologyRequest``: &lt;optional&gt;)` - Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
        /// </summary>
        [Input("topologyRequest")]
        public Input<Inputs.CsiVolumeTopologyRequestArgs>? TopologyRequest { get; set; }

        /// <summary>
        /// `(string: &lt;required&gt;)` - The unique ID of the volume.
        /// </summary>
        [Input("volumeId", required: true)]
        public Input<string> VolumeId { get; set; } = null!;

        public CsiVolumeArgs()
        {
        }
        public static new CsiVolumeArgs Empty => new CsiVolumeArgs();
    }

    public sealed class CsiVolumeState : global::Pulumi.ResourceArgs
    {
        [Input("capabilities")]
        private InputList<Inputs.CsiVolumeCapabilityGetArgs>? _capabilities;

        /// <summary>
        /// `(``Capability``: &lt;required&gt;)` - Options for validating the capability of a volume.
        /// </summary>
        public InputList<Inputs.CsiVolumeCapabilityGetArgs> Capabilities
        {
            get => _capabilities ?? (_capabilities = new InputList<Inputs.CsiVolumeCapabilityGetArgs>());
            set => _capabilities = value;
        }

        [Input("capacity")]
        public Input<int>? Capacity { get; set; }

        /// <summary>
        /// `(string: &lt;optional&gt;)` - Option to signal a maximum volume size. This may not be supported by all storage providers.
        /// </summary>
        [Input("capacityMax")]
        public Input<string>? CapacityMax { get; set; }

        [Input("capacityMaxBytes")]
        public Input<int>? CapacityMaxBytes { get; set; }

        /// <summary>
        /// `(string: &lt;optional&gt;)` - Option to signal a minimum volume size. This may not be supported by all storage providers.
        /// </summary>
        [Input("capacityMin")]
        public Input<string>? CapacityMin { get; set; }

        [Input("capacityMinBytes")]
        public Input<int>? CapacityMinBytes { get; set; }

        /// <summary>
        /// `(string: &lt;optional&gt;)` - The external ID of an existing volume to restore. If ommited, the volume will be created from scratch. Conflicts with `snapshot_id`.
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
        /// The ID of the physical volume from the storage provider.
        /// </summary>
        [Input("externalId")]
        public Input<string>? ExternalId { get; set; }

        /// <summary>
        /// `(block: optional)` Options for mounting `block-device` volumes without a pre-formatted file system.
        /// </summary>
        [Input("mountOptions")]
        public Input<Inputs.CsiVolumeMountOptionsGetArgs>? MountOptions { get; set; }

        /// <summary>
        /// `(string: &lt;required&gt;)` - The display name for the volume.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// `(string: "default")` - The namespace in which to register the volume.
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
        /// `(map[string]string: optional)` An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
        /// </summary>
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        /// <summary>
        /// `(string: &lt;required&gt;)` - The ID of the Nomad plugin for registering this volume.
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
        /// `(map[string]string: optional)` An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
        /// </summary>
        public InputMap<string> Secrets
        {
            get => _secrets ?? (_secrets = new InputMap<string>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, string>());
                _secrets = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// `(string: &lt;optional&gt;)` - The external ID of a snapshot to restore. If ommited, the volume will be created from scratch. Conflicts with `clone_id`.
        /// </summary>
        [Input("snapshotId")]
        public Input<string>? SnapshotId { get; set; }

        [Input("topologies")]
        private InputList<Inputs.CsiVolumeTopologyGetArgs>? _topologies;
        public InputList<Inputs.CsiVolumeTopologyGetArgs> Topologies
        {
            get => _topologies ?? (_topologies = new InputList<Inputs.CsiVolumeTopologyGetArgs>());
            set => _topologies = value;
        }

        /// <summary>
        /// `(``TopologyRequest``: &lt;optional&gt;)` - Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
        /// </summary>
        [Input("topologyRequest")]
        public Input<Inputs.CsiVolumeTopologyRequestGetArgs>? TopologyRequest { get; set; }

        /// <summary>
        /// `(string: &lt;required&gt;)` - The unique ID of the volume.
        /// </summary>
        [Input("volumeId")]
        public Input<string>? VolumeId { get; set; }

        public CsiVolumeState()
        {
        }
        public static new CsiVolumeState Empty => new CsiVolumeState();
    }
}
