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
    /// layout: "nomad"
    /// page_title: "Nomad: nomad.DynamicHostVolume"
    /// sidebar_current: "docs-nomad-resource-dynamic-host-volume"
    /// description: |-
    ///   Manages the lifecycle of creating and deleting dynamic host volumes.
    /// ---
    /// 
    /// Creates and registers a dynamic host volume in Nomad. Note that Nomad supports
    /// two workflows for dynamic host volumes: create and register. Both resources
    /// result in the same data source with the same outputs.
    /// 
    /// &gt; **Warning:** Destroying this resource **will result in data loss**. Use the
    ///   [`prevent_destroy`][tf_docs_prevent_destroy] directive to avoid accidental
    ///   deletions.
    /// 
    /// ## Example Usage
    /// 
    /// Creating a dynamic host volume:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Nomad = Pulumi.Nomad;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Nomad.DynamicHostVolume("example", new()
    ///     {
    ///         Name = "example",
    ///         Namespace = "prod",
    ///         PluginId = "mkdir",
    ///         CapacityMax = "12 GiB",
    ///         CapacityMin = "1.0 GiB",
    ///         Capabilities = new[]
    ///         {
    ///             new Nomad.Inputs.DynamicHostVolumeCapabilityArgs
    ///             {
    ///                 AccessMode = "single-node-writer",
    ///                 AttachmentMode = "file-system",
    ///             },
    ///         },
    ///         Constraints = new[]
    ///         {
    ///             new Nomad.Inputs.DynamicHostVolumeConstraintArgs
    ///             {
    ///                 Attribute = "${attr.kernel.name}",
    ///                 Value = "linux",
    ///             },
    ///         },
    ///         Parameters = 
    ///         {
    ///             { "some_key", "some_value" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [NomadResourceType("nomad:index/dynamicHostVolume:DynamicHostVolume")]
    public partial class DynamicHostVolume : global::Pulumi.CustomResource
    {
        /// <summary>
        /// `(block: &lt;optional&gt;)` - Option for validating the capability of a
        /// volume. Each capability block has the following attributes:
        /// </summary>
        [Output("capabilities")]
        public Output<ImmutableArray<Outputs.DynamicHostVolumeCapability>> Capabilities { get; private set; } = null!;

        /// <summary>
        /// Provisioned capacity
        /// </summary>
        [Output("capacity")]
        public Output<string> Capacity { get; private set; } = null!;

        [Output("capacityBytes")]
        public Output<int> CapacityBytes { get; private set; } = null!;

        /// <summary>
        /// `(string: &lt;optional&gt;)` - Option for requesting a maximum
        /// capacity, in bytes. The capacity of a volume may be the physical size of a
        /// disk, or a quota, depending on the plugin. The specific size of the resulting
        /// volume is somewhere between `capacity_min` and `capacity_max`; the exact
        /// behavior is up to the plugin. If you want to specify an exact size, set
        /// `capacity_min` and `capacity_max` to the same value. Accepts human-friendly
        /// suffixes such as `"100GiB"`. Plugins that cannot restrict the size of volumes
        /// may ignore this field.
        /// </summary>
        [Output("capacityMax")]
        public Output<string?> CapacityMax { get; private set; } = null!;

        [Output("capacityMaxBytes")]
        public Output<int> CapacityMaxBytes { get; private set; } = null!;

        /// <summary>
        /// `(string: &lt;optional&gt;)` - Option for requesting a minimum
        /// capacity, in bytes. The capacity of a volume may be the physical size of a
        /// disk, or a quota, depending on the plugin. The specific size of the resulting
        /// volume is somewhere between `capacity_min` and `capacity_max`; the exact
        /// behavior is up to the plugin. If you want to specify an exact size, set
        /// `capacity_min` and `capacity_max` to the same value. Accepts human-friendly
        /// suffixes such as `"100GiB"`. Plugins that cannot restrict the size of volumes
        /// may ignore this field.
        /// </summary>
        [Output("capacityMin")]
        public Output<string?> CapacityMin { get; private set; } = null!;

        [Output("capacityMinBytes")]
        public Output<int> CapacityMinBytes { get; private set; } = null!;

        /// <summary>
        /// `(block: &lt;optional&gt;)` - A restriction on the eligible nodes where
        /// a volume can be created, similar to the [`constraint`][] block on a Nomad job
        /// specification.. You can provide multiple `constraint` blocks to add more
        /// constraints. Each constraint block has the following attributes.
        /// </summary>
        [Output("constraints")]
        public Output<ImmutableArray<Outputs.DynamicHostVolumeConstraint>> Constraints { get; private set; } = null!;

        /// <summary>
        /// Host path
        /// </summary>
        [Output("hostPath")]
        public Output<string> HostPath { get; private set; } = null!;

        /// <summary>
        /// `(string: &lt;required&gt;)` - The name of the volume, which is used as the
        /// [`volume.source`][volume_source] field in job specifications that claim this
        /// volume. Host volume names must be unique per node. Names are visible to any
        /// user with `node:read` ACL, even across namespaces, so they should not be
        /// treated as sensitive values.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// `(string: &lt;optional&gt;)` - The namespace of the volume. This field
        /// overrides the namespace provided by the `-namespace` flag or `NOMAD_NAMESPACE`
        /// environment variable. Defaults to `"default"` if unset.
        /// </summary>
        [Output("namespace")]
        public Output<string?> Namespace { get; private set; } = null!;

        /// <summary>
        /// `(string: &lt;optional&gt;)` - A specific node where you would like the
        /// volume to be created.
        /// </summary>
        [Output("nodeId")]
        public Output<string> NodeId { get; private set; } = null!;

        /// <summary>
        /// `(string: &lt;optional&gt;)` - A specific node pool where you would like
        /// the volume to be created. If you also provide `node_id`, the node must be in the
        /// provided `node_pool`.
        /// </summary>
        [Output("nodePool")]
        public Output<string> NodePool { get; private set; } = null!;

        /// <summary>
        /// `(map&lt;string|string&gt;: &lt;optional&gt;)` - A key-value map of strings
        /// passed directly to the plugin to configure the volume. The details of these
        /// parameters are specific to the plugin.
        /// </summary>
        [Output("parameters")]
        public Output<ImmutableDictionary<string, string>?> Parameters { get; private set; } = null!;

        /// <summary>
        /// Plugin ID
        /// </summary>
        [Output("pluginId")]
        public Output<string> PluginId { get; private set; } = null!;

        /// <summary>
        /// State
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;


        /// <summary>
        /// Create a DynamicHostVolume resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DynamicHostVolume(string name, DynamicHostVolumeArgs args, CustomResourceOptions? options = null)
            : base("nomad:index/dynamicHostVolume:DynamicHostVolume", name, args ?? new DynamicHostVolumeArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DynamicHostVolume(string name, Input<string> id, DynamicHostVolumeState? state = null, CustomResourceOptions? options = null)
            : base("nomad:index/dynamicHostVolume:DynamicHostVolume", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DynamicHostVolume resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DynamicHostVolume Get(string name, Input<string> id, DynamicHostVolumeState? state = null, CustomResourceOptions? options = null)
        {
            return new DynamicHostVolume(name, id, state, options);
        }
    }

    public sealed class DynamicHostVolumeArgs : global::Pulumi.ResourceArgs
    {
        [Input("capabilities", required: true)]
        private InputList<Inputs.DynamicHostVolumeCapabilityArgs>? _capabilities;

        /// <summary>
        /// `(block: &lt;optional&gt;)` - Option for validating the capability of a
        /// volume. Each capability block has the following attributes:
        /// </summary>
        public InputList<Inputs.DynamicHostVolumeCapabilityArgs> Capabilities
        {
            get => _capabilities ?? (_capabilities = new InputList<Inputs.DynamicHostVolumeCapabilityArgs>());
            set => _capabilities = value;
        }

        /// <summary>
        /// `(string: &lt;optional&gt;)` - Option for requesting a maximum
        /// capacity, in bytes. The capacity of a volume may be the physical size of a
        /// disk, or a quota, depending on the plugin. The specific size of the resulting
        /// volume is somewhere between `capacity_min` and `capacity_max`; the exact
        /// behavior is up to the plugin. If you want to specify an exact size, set
        /// `capacity_min` and `capacity_max` to the same value. Accepts human-friendly
        /// suffixes such as `"100GiB"`. Plugins that cannot restrict the size of volumes
        /// may ignore this field.
        /// </summary>
        [Input("capacityMax")]
        public Input<string>? CapacityMax { get; set; }

        /// <summary>
        /// `(string: &lt;optional&gt;)` - Option for requesting a minimum
        /// capacity, in bytes. The capacity of a volume may be the physical size of a
        /// disk, or a quota, depending on the plugin. The specific size of the resulting
        /// volume is somewhere between `capacity_min` and `capacity_max`; the exact
        /// behavior is up to the plugin. If you want to specify an exact size, set
        /// `capacity_min` and `capacity_max` to the same value. Accepts human-friendly
        /// suffixes such as `"100GiB"`. Plugins that cannot restrict the size of volumes
        /// may ignore this field.
        /// </summary>
        [Input("capacityMin")]
        public Input<string>? CapacityMin { get; set; }

        [Input("constraints")]
        private InputList<Inputs.DynamicHostVolumeConstraintArgs>? _constraints;

        /// <summary>
        /// `(block: &lt;optional&gt;)` - A restriction on the eligible nodes where
        /// a volume can be created, similar to the [`constraint`][] block on a Nomad job
        /// specification.. You can provide multiple `constraint` blocks to add more
        /// constraints. Each constraint block has the following attributes.
        /// </summary>
        public InputList<Inputs.DynamicHostVolumeConstraintArgs> Constraints
        {
            get => _constraints ?? (_constraints = new InputList<Inputs.DynamicHostVolumeConstraintArgs>());
            set => _constraints = value;
        }

        /// <summary>
        /// `(string: &lt;required&gt;)` - The name of the volume, which is used as the
        /// [`volume.source`][volume_source] field in job specifications that claim this
        /// volume. Host volume names must be unique per node. Names are visible to any
        /// user with `node:read` ACL, even across namespaces, so they should not be
        /// treated as sensitive values.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// `(string: &lt;optional&gt;)` - The namespace of the volume. This field
        /// overrides the namespace provided by the `-namespace` flag or `NOMAD_NAMESPACE`
        /// environment variable. Defaults to `"default"` if unset.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// `(string: &lt;optional&gt;)` - A specific node where you would like the
        /// volume to be created.
        /// </summary>
        [Input("nodeId")]
        public Input<string>? NodeId { get; set; }

        /// <summary>
        /// `(string: &lt;optional&gt;)` - A specific node pool where you would like
        /// the volume to be created. If you also provide `node_id`, the node must be in the
        /// provided `node_pool`.
        /// </summary>
        [Input("nodePool")]
        public Input<string>? NodePool { get; set; }

        [Input("parameters")]
        private InputMap<string>? _parameters;

        /// <summary>
        /// `(map&lt;string|string&gt;: &lt;optional&gt;)` - A key-value map of strings
        /// passed directly to the plugin to configure the volume. The details of these
        /// parameters are specific to the plugin.
        /// </summary>
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        /// <summary>
        /// Plugin ID
        /// </summary>
        [Input("pluginId", required: true)]
        public Input<string> PluginId { get; set; } = null!;

        public DynamicHostVolumeArgs()
        {
        }
        public static new DynamicHostVolumeArgs Empty => new DynamicHostVolumeArgs();
    }

    public sealed class DynamicHostVolumeState : global::Pulumi.ResourceArgs
    {
        [Input("capabilities")]
        private InputList<Inputs.DynamicHostVolumeCapabilityGetArgs>? _capabilities;

        /// <summary>
        /// `(block: &lt;optional&gt;)` - Option for validating the capability of a
        /// volume. Each capability block has the following attributes:
        /// </summary>
        public InputList<Inputs.DynamicHostVolumeCapabilityGetArgs> Capabilities
        {
            get => _capabilities ?? (_capabilities = new InputList<Inputs.DynamicHostVolumeCapabilityGetArgs>());
            set => _capabilities = value;
        }

        /// <summary>
        /// Provisioned capacity
        /// </summary>
        [Input("capacity")]
        public Input<string>? Capacity { get; set; }

        [Input("capacityBytes")]
        public Input<int>? CapacityBytes { get; set; }

        /// <summary>
        /// `(string: &lt;optional&gt;)` - Option for requesting a maximum
        /// capacity, in bytes. The capacity of a volume may be the physical size of a
        /// disk, or a quota, depending on the plugin. The specific size of the resulting
        /// volume is somewhere between `capacity_min` and `capacity_max`; the exact
        /// behavior is up to the plugin. If you want to specify an exact size, set
        /// `capacity_min` and `capacity_max` to the same value. Accepts human-friendly
        /// suffixes such as `"100GiB"`. Plugins that cannot restrict the size of volumes
        /// may ignore this field.
        /// </summary>
        [Input("capacityMax")]
        public Input<string>? CapacityMax { get; set; }

        [Input("capacityMaxBytes")]
        public Input<int>? CapacityMaxBytes { get; set; }

        /// <summary>
        /// `(string: &lt;optional&gt;)` - Option for requesting a minimum
        /// capacity, in bytes. The capacity of a volume may be the physical size of a
        /// disk, or a quota, depending on the plugin. The specific size of the resulting
        /// volume is somewhere between `capacity_min` and `capacity_max`; the exact
        /// behavior is up to the plugin. If you want to specify an exact size, set
        /// `capacity_min` and `capacity_max` to the same value. Accepts human-friendly
        /// suffixes such as `"100GiB"`. Plugins that cannot restrict the size of volumes
        /// may ignore this field.
        /// </summary>
        [Input("capacityMin")]
        public Input<string>? CapacityMin { get; set; }

        [Input("capacityMinBytes")]
        public Input<int>? CapacityMinBytes { get; set; }

        [Input("constraints")]
        private InputList<Inputs.DynamicHostVolumeConstraintGetArgs>? _constraints;

        /// <summary>
        /// `(block: &lt;optional&gt;)` - A restriction on the eligible nodes where
        /// a volume can be created, similar to the [`constraint`][] block on a Nomad job
        /// specification.. You can provide multiple `constraint` blocks to add more
        /// constraints. Each constraint block has the following attributes.
        /// </summary>
        public InputList<Inputs.DynamicHostVolumeConstraintGetArgs> Constraints
        {
            get => _constraints ?? (_constraints = new InputList<Inputs.DynamicHostVolumeConstraintGetArgs>());
            set => _constraints = value;
        }

        /// <summary>
        /// Host path
        /// </summary>
        [Input("hostPath")]
        public Input<string>? HostPath { get; set; }

        /// <summary>
        /// `(string: &lt;required&gt;)` - The name of the volume, which is used as the
        /// [`volume.source`][volume_source] field in job specifications that claim this
        /// volume. Host volume names must be unique per node. Names are visible to any
        /// user with `node:read` ACL, even across namespaces, so they should not be
        /// treated as sensitive values.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// `(string: &lt;optional&gt;)` - The namespace of the volume. This field
        /// overrides the namespace provided by the `-namespace` flag or `NOMAD_NAMESPACE`
        /// environment variable. Defaults to `"default"` if unset.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// `(string: &lt;optional&gt;)` - A specific node where you would like the
        /// volume to be created.
        /// </summary>
        [Input("nodeId")]
        public Input<string>? NodeId { get; set; }

        /// <summary>
        /// `(string: &lt;optional&gt;)` - A specific node pool where you would like
        /// the volume to be created. If you also provide `node_id`, the node must be in the
        /// provided `node_pool`.
        /// </summary>
        [Input("nodePool")]
        public Input<string>? NodePool { get; set; }

        [Input("parameters")]
        private InputMap<string>? _parameters;

        /// <summary>
        /// `(map&lt;string|string&gt;: &lt;optional&gt;)` - A key-value map of strings
        /// passed directly to the plugin to configure the volume. The details of these
        /// parameters are specific to the plugin.
        /// </summary>
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        /// <summary>
        /// Plugin ID
        /// </summary>
        [Input("pluginId")]
        public Input<string>? PluginId { get; set; }

        /// <summary>
        /// State
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        public DynamicHostVolumeState()
        {
        }
        public static new DynamicHostVolumeState Empty => new DynamicHostVolumeState();
    }
}
