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
    /// Registering a volume:
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Nomad = Pulumi.Nomad;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var ebs = Nomad.GetPlugin.Invoke(new()
    ///     {
    ///         PluginId = "aws-ebs0",
    ///         WaitForHealthy = true,
    ///     });
    /// 
    ///     var mysqlVolume = new Nomad.Volume("mysqlVolume", new()
    ///     {
    ///         Type = "csi",
    ///         PluginId = "aws-ebs0",
    ///         VolumeId = "mysql_volume",
    ///         ExternalId = module.Hashistack.Ebs_test_volume_id,
    ///         Capabilities = new[]
    ///         {
    ///             new Nomad.Inputs.VolumeCapabilityArgs
    ///             {
    ///                 AccessMode = "single-node-writer",
    ///                 AttachmentMode = "file-system",
    ///             },
    ///         },
    ///         MountOptions = new Nomad.Inputs.VolumeMountOptionsArgs
    ///         {
    ///             FsType = "ext4",
    ///         },
    ///         TopologyRequest = new Nomad.Inputs.VolumeTopologyRequestArgs
    ///         {
    ///             Required = new Nomad.Inputs.VolumeTopologyRequestRequiredArgs
    ///             {
    ///                 Topologies = new[]
    ///                 {
    ///                     new Nomad.Inputs.VolumeTopologyRequestRequiredTopologyArgs
    ///                     {
    ///                         Segments = 
    ///                         {
    ///                             { "rack", "R1" },
    ///                             { "zone", "us-east-1a" },
    ///                         },
    ///                     },
    ///                     new Nomad.Inputs.VolumeTopologyRequestRequiredTopologyArgs
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
    ///         DependsOn = new[]
    ///         {
    ///             ebs,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// </summary>
    [NomadResourceType("nomad:index/volume:Volume")]
    public partial class Volume : global::Pulumi.CustomResource
    {
        /// <summary>
        /// `(string: &lt;optional&gt;)` - **Deprecated**. Use `capability` block instead. Defines whether a volume should be available concurrently. Possible values are:
        /// - `single-node-reader-only`
        /// - `single-node-writer`
        /// - `multi-node-reader-only`
        /// - `multi-node-single-writer`
        /// - `multi-node-multi-writer`
        /// </summary>
        [Output("accessMode")]
        public Output<string?> AccessMode { get; private set; } = null!;

        /// <summary>
        /// `(string: &lt;otional&gt;)` - **Deprecated**. Use `capability` block instead. The storage API that will be used by the volume.
        /// </summary>
        [Output("attachmentMode")]
        public Output<string?> AttachmentMode { get; private set; } = null!;

        /// <summary>
        /// `(``Capability``: &lt;required&gt;)` - Options for validating the capability of a volume.
        /// </summary>
        [Output("capabilities")]
        public Output<ImmutableArray<Outputs.VolumeCapability>> Capabilities { get; private set; } = null!;

        /// <summary>
        /// `(map[string]string: &lt;optional&gt;)` - An optional key-value map of strings passed directly to the CSI plugin to validate the volume.
        /// </summary>
        [Output("context")]
        public Output<ImmutableDictionary<string, string>?> Context { get; private set; } = null!;

        /// <summary>
        /// `(boolean)`
        /// </summary>
        [Output("controllerRequired")]
        public Output<bool> ControllerRequired { get; private set; } = null!;

        /// <summary>
        /// `(integer)`
        /// </summary>
        [Output("controllersExpected")]
        public Output<int> ControllersExpected { get; private set; } = null!;

        /// <summary>
        /// `(integer)`
        /// </summary>
        [Output("controllersHealthy")]
        public Output<int> ControllersHealthy { get; private set; } = null!;

        /// <summary>
        /// `(boolean: true)` - If true, the volume will be deregistered on destroy.
        /// </summary>
        [Output("deregisterOnDestroy")]
        public Output<bool?> DeregisterOnDestroy { get; private set; } = null!;

        /// <summary>
        /// `(string: &lt;required&gt;)` - The ID of the physical volume from the storage provider.
        /// </summary>
        [Output("externalId")]
        public Output<string> ExternalId { get; private set; } = null!;

        /// <summary>
        /// `(block: &lt;optional&gt;)` Options for mounting `block-device` volumes without a pre-formatted file system.
        /// </summary>
        [Output("mountOptions")]
        public Output<Outputs.VolumeMountOptions?> MountOptions { get; private set; } = null!;

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

        /// <summary>
        /// `(integer)`
        /// </summary>
        [Output("nodesExpected")]
        public Output<int> NodesExpected { get; private set; } = null!;

        /// <summary>
        /// `(integer)`
        /// </summary>
        [Output("nodesHealthy")]
        public Output<int> NodesHealthy { get; private set; } = null!;

        /// <summary>
        /// `(map[string]string: &lt;optional&gt;)` - An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
        /// </summary>
        [Output("parameters")]
        public Output<ImmutableDictionary<string, string>?> Parameters { get; private set; } = null!;

        /// <summary>
        /// `(string: &lt;required&gt;)` - The ID of the Nomad plugin for registering this volume.
        /// </summary>
        [Output("pluginId")]
        public Output<string> PluginId { get; private set; } = null!;

        /// <summary>
        /// `(string)`
        /// </summary>
        [Output("pluginProvider")]
        public Output<string> PluginProvider { get; private set; } = null!;

        /// <summary>
        /// `(string)`
        /// </summary>
        [Output("pluginProviderVersion")]
        public Output<string> PluginProviderVersion { get; private set; } = null!;

        /// <summary>
        /// `(boolean)`
        /// </summary>
        [Output("schedulable")]
        public Output<bool> Schedulable { get; private set; } = null!;

        /// <summary>
        /// `(map[string]string: &lt;optional&gt;)` - An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
        /// </summary>
        [Output("secrets")]
        public Output<ImmutableDictionary<string, string>?> Secrets { get; private set; } = null!;

        /// <summary>
        /// `(List of topologies)`
        /// </summary>
        [Output("topologies")]
        public Output<ImmutableArray<Outputs.VolumeTopology>> Topologies { get; private set; } = null!;

        /// <summary>
        /// `(``TopologyRequest``: &lt;optional&gt;)` - Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
        /// </summary>
        [Output("topologyRequest")]
        public Output<Outputs.VolumeTopologyRequest?> TopologyRequest { get; private set; } = null!;

        /// <summary>
        /// `(string: &lt;required&gt;)` - The type of the volume. Currently, only `csi` is supported.
        /// </summary>
        [Output("type")]
        public Output<string?> Type { get; private set; } = null!;

        /// <summary>
        /// `(string: &lt;required&gt;)` - The unique ID of the volume.
        /// </summary>
        [Output("volumeId")]
        public Output<string> VolumeId { get; private set; } = null!;


        /// <summary>
        /// Create a Volume resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Volume(string name, VolumeArgs args, CustomResourceOptions? options = null)
            : base("nomad:index/volume:Volume", name, args ?? new VolumeArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Volume(string name, Input<string> id, VolumeState? state = null, CustomResourceOptions? options = null)
            : base("nomad:index/volume:Volume", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Volume resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Volume Get(string name, Input<string> id, VolumeState? state = null, CustomResourceOptions? options = null)
        {
            return new Volume(name, id, state, options);
        }
    }

    public sealed class VolumeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// `(string: &lt;optional&gt;)` - **Deprecated**. Use `capability` block instead. Defines whether a volume should be available concurrently. Possible values are:
        /// - `single-node-reader-only`
        /// - `single-node-writer`
        /// - `multi-node-reader-only`
        /// - `multi-node-single-writer`
        /// - `multi-node-multi-writer`
        /// </summary>
        [Input("accessMode")]
        public Input<string>? AccessMode { get; set; }

        /// <summary>
        /// `(string: &lt;otional&gt;)` - **Deprecated**. Use `capability` block instead. The storage API that will be used by the volume.
        /// </summary>
        [Input("attachmentMode")]
        public Input<string>? AttachmentMode { get; set; }

        [Input("capabilities")]
        private InputList<Inputs.VolumeCapabilityArgs>? _capabilities;

        /// <summary>
        /// `(``Capability``: &lt;required&gt;)` - Options for validating the capability of a volume.
        /// </summary>
        public InputList<Inputs.VolumeCapabilityArgs> Capabilities
        {
            get => _capabilities ?? (_capabilities = new InputList<Inputs.VolumeCapabilityArgs>());
            set => _capabilities = value;
        }

        [Input("context")]
        private InputMap<string>? _context;

        /// <summary>
        /// `(map[string]string: &lt;optional&gt;)` - An optional key-value map of strings passed directly to the CSI plugin to validate the volume.
        /// </summary>
        public InputMap<string> Context
        {
            get => _context ?? (_context = new InputMap<string>());
            set => _context = value;
        }

        /// <summary>
        /// `(boolean: true)` - If true, the volume will be deregistered on destroy.
        /// </summary>
        [Input("deregisterOnDestroy")]
        public Input<bool>? DeregisterOnDestroy { get; set; }

        /// <summary>
        /// `(string: &lt;required&gt;)` - The ID of the physical volume from the storage provider.
        /// </summary>
        [Input("externalId", required: true)]
        public Input<string> ExternalId { get; set; } = null!;

        /// <summary>
        /// `(block: &lt;optional&gt;)` Options for mounting `block-device` volumes without a pre-formatted file system.
        /// </summary>
        [Input("mountOptions")]
        public Input<Inputs.VolumeMountOptionsArgs>? MountOptions { get; set; }

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
        /// `(map[string]string: &lt;optional&gt;)` - An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
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
        /// `(map[string]string: &lt;optional&gt;)` - An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
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
        /// `(``TopologyRequest``: &lt;optional&gt;)` - Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
        /// </summary>
        [Input("topologyRequest")]
        public Input<Inputs.VolumeTopologyRequestArgs>? TopologyRequest { get; set; }

        /// <summary>
        /// `(string: &lt;required&gt;)` - The type of the volume. Currently, only `csi` is supported.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// `(string: &lt;required&gt;)` - The unique ID of the volume.
        /// </summary>
        [Input("volumeId", required: true)]
        public Input<string> VolumeId { get; set; } = null!;

        public VolumeArgs()
        {
        }
        public static new VolumeArgs Empty => new VolumeArgs();
    }

    public sealed class VolumeState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// `(string: &lt;optional&gt;)` - **Deprecated**. Use `capability` block instead. Defines whether a volume should be available concurrently. Possible values are:
        /// - `single-node-reader-only`
        /// - `single-node-writer`
        /// - `multi-node-reader-only`
        /// - `multi-node-single-writer`
        /// - `multi-node-multi-writer`
        /// </summary>
        [Input("accessMode")]
        public Input<string>? AccessMode { get; set; }

        /// <summary>
        /// `(string: &lt;otional&gt;)` - **Deprecated**. Use `capability` block instead. The storage API that will be used by the volume.
        /// </summary>
        [Input("attachmentMode")]
        public Input<string>? AttachmentMode { get; set; }

        [Input("capabilities")]
        private InputList<Inputs.VolumeCapabilityGetArgs>? _capabilities;

        /// <summary>
        /// `(``Capability``: &lt;required&gt;)` - Options for validating the capability of a volume.
        /// </summary>
        public InputList<Inputs.VolumeCapabilityGetArgs> Capabilities
        {
            get => _capabilities ?? (_capabilities = new InputList<Inputs.VolumeCapabilityGetArgs>());
            set => _capabilities = value;
        }

        [Input("context")]
        private InputMap<string>? _context;

        /// <summary>
        /// `(map[string]string: &lt;optional&gt;)` - An optional key-value map of strings passed directly to the CSI plugin to validate the volume.
        /// </summary>
        public InputMap<string> Context
        {
            get => _context ?? (_context = new InputMap<string>());
            set => _context = value;
        }

        /// <summary>
        /// `(boolean)`
        /// </summary>
        [Input("controllerRequired")]
        public Input<bool>? ControllerRequired { get; set; }

        /// <summary>
        /// `(integer)`
        /// </summary>
        [Input("controllersExpected")]
        public Input<int>? ControllersExpected { get; set; }

        /// <summary>
        /// `(integer)`
        /// </summary>
        [Input("controllersHealthy")]
        public Input<int>? ControllersHealthy { get; set; }

        /// <summary>
        /// `(boolean: true)` - If true, the volume will be deregistered on destroy.
        /// </summary>
        [Input("deregisterOnDestroy")]
        public Input<bool>? DeregisterOnDestroy { get; set; }

        /// <summary>
        /// `(string: &lt;required&gt;)` - The ID of the physical volume from the storage provider.
        /// </summary>
        [Input("externalId")]
        public Input<string>? ExternalId { get; set; }

        /// <summary>
        /// `(block: &lt;optional&gt;)` Options for mounting `block-device` volumes without a pre-formatted file system.
        /// </summary>
        [Input("mountOptions")]
        public Input<Inputs.VolumeMountOptionsGetArgs>? MountOptions { get; set; }

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

        /// <summary>
        /// `(integer)`
        /// </summary>
        [Input("nodesExpected")]
        public Input<int>? NodesExpected { get; set; }

        /// <summary>
        /// `(integer)`
        /// </summary>
        [Input("nodesHealthy")]
        public Input<int>? NodesHealthy { get; set; }

        [Input("parameters")]
        private InputMap<string>? _parameters;

        /// <summary>
        /// `(map[string]string: &lt;optional&gt;)` - An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
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

        /// <summary>
        /// `(string)`
        /// </summary>
        [Input("pluginProvider")]
        public Input<string>? PluginProvider { get; set; }

        /// <summary>
        /// `(string)`
        /// </summary>
        [Input("pluginProviderVersion")]
        public Input<string>? PluginProviderVersion { get; set; }

        /// <summary>
        /// `(boolean)`
        /// </summary>
        [Input("schedulable")]
        public Input<bool>? Schedulable { get; set; }

        [Input("secrets")]
        private InputMap<string>? _secrets;

        /// <summary>
        /// `(map[string]string: &lt;optional&gt;)` - An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
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

        [Input("topologies")]
        private InputList<Inputs.VolumeTopologyGetArgs>? _topologies;

        /// <summary>
        /// `(List of topologies)`
        /// </summary>
        public InputList<Inputs.VolumeTopologyGetArgs> Topologies
        {
            get => _topologies ?? (_topologies = new InputList<Inputs.VolumeTopologyGetArgs>());
            set => _topologies = value;
        }

        /// <summary>
        /// `(``TopologyRequest``: &lt;optional&gt;)` - Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
        /// </summary>
        [Input("topologyRequest")]
        public Input<Inputs.VolumeTopologyRequestGetArgs>? TopologyRequest { get; set; }

        /// <summary>
        /// `(string: &lt;required&gt;)` - The type of the volume. Currently, only `csi` is supported.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// `(string: &lt;required&gt;)` - The unique ID of the volume.
        /// </summary>
        [Input("volumeId")]
        public Input<string>? VolumeId { get; set; }

        public VolumeState()
        {
        }
        public static new VolumeState Empty => new VolumeState();
    }
}
