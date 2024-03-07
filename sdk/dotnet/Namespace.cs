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
    /// Provisions a namespace within a Nomad cluster.
    /// 
    /// Nomad auto-generates a default namespace called `default`. This namespace
    /// cannot be removed, so destroying a `nomad.Namespace` resource where
    /// `name = "default"` will cause the namespace to be reset to its default
    /// configuration.
    /// 
    /// ## Example Usage
    /// 
    /// Registering a namespace:
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
    ///     var dev = new Nomad.Namespace("dev", new()
    ///     {
    ///         Description = "Shared development environment.",
    ///         Meta = 
    ///         {
    ///             { "foo", "bar" },
    ///             { "owner", "John Doe" },
    ///         },
    ///         Quota = "dev",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// Registering a namespace with a quota:
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
    ///     var webTeam = new Nomad.QuoteSpecification("webTeam", new()
    ///     {
    ///         Description = "web team quota",
    ///         Limits = new[]
    ///         {
    ///             new Nomad.Inputs.QuoteSpecificationLimitArgs
    ///             {
    ///                 Region = "global",
    ///                 RegionLimit = new Nomad.Inputs.QuoteSpecificationLimitRegionLimitArgs
    ///                 {
    ///                     Cpu = 1000,
    ///                     MemoryMb = 256,
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var web = new Nomad.Namespace("web", new()
    ///     {
    ///         Description = "Web team production environment.",
    ///         Quota = webTeam.Name,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// </summary>
    [NomadResourceType("nomad:index/namespace:Namespace")]
    public partial class Namespace : global::Pulumi.CustomResource
    {
        /// <summary>
        /// `(block: &lt;optional&gt;)` - A block of capabilities for the namespace. Can't
        /// be repeated. See below for the structure of this block.
        /// </summary>
        [Output("capabilities")]
        public Output<Outputs.NamespaceCapabilities?> Capabilities { get; private set; } = null!;

        /// <summary>
        /// `(string: "")` - A description of the namespace.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// `(map[string]string: &lt;optional&gt;)` -  Specifies arbitrary KV metadata to associate with the namespace.
        /// </summary>
        [Output("meta")]
        public Output<ImmutableDictionary<string, string>?> Meta { get; private set; } = null!;

        /// <summary>
        /// `(string: &lt;required&gt;)` - A unique name for the namespace.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// `(block: &lt;optional&gt;)` - A block with node pool configuration for the namespace (Nomad Enterprise only).
        /// </summary>
        [Output("nodePoolConfig")]
        public Output<Outputs.NamespaceNodePoolConfig> NodePoolConfig { get; private set; } = null!;

        /// <summary>
        /// `(string: "")` - A resource quota to attach to the namespace.
        /// </summary>
        [Output("quota")]
        public Output<string?> Quota { get; private set; } = null!;


        /// <summary>
        /// Create a Namespace resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Namespace(string name, NamespaceArgs? args = null, CustomResourceOptions? options = null)
            : base("nomad:index/namespace:Namespace", name, args ?? new NamespaceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Namespace(string name, Input<string> id, NamespaceState? state = null, CustomResourceOptions? options = null)
            : base("nomad:index/namespace:Namespace", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Namespace resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Namespace Get(string name, Input<string> id, NamespaceState? state = null, CustomResourceOptions? options = null)
        {
            return new Namespace(name, id, state, options);
        }
    }

    public sealed class NamespaceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// `(block: &lt;optional&gt;)` - A block of capabilities for the namespace. Can't
        /// be repeated. See below for the structure of this block.
        /// </summary>
        [Input("capabilities")]
        public Input<Inputs.NamespaceCapabilitiesArgs>? Capabilities { get; set; }

        /// <summary>
        /// `(string: "")` - A description of the namespace.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("meta")]
        private InputMap<string>? _meta;

        /// <summary>
        /// `(map[string]string: &lt;optional&gt;)` -  Specifies arbitrary KV metadata to associate with the namespace.
        /// </summary>
        public InputMap<string> Meta
        {
            get => _meta ?? (_meta = new InputMap<string>());
            set => _meta = value;
        }

        /// <summary>
        /// `(string: &lt;required&gt;)` - A unique name for the namespace.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// `(block: &lt;optional&gt;)` - A block with node pool configuration for the namespace (Nomad Enterprise only).
        /// </summary>
        [Input("nodePoolConfig")]
        public Input<Inputs.NamespaceNodePoolConfigArgs>? NodePoolConfig { get; set; }

        /// <summary>
        /// `(string: "")` - A resource quota to attach to the namespace.
        /// </summary>
        [Input("quota")]
        public Input<string>? Quota { get; set; }

        public NamespaceArgs()
        {
        }
        public static new NamespaceArgs Empty => new NamespaceArgs();
    }

    public sealed class NamespaceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// `(block: &lt;optional&gt;)` - A block of capabilities for the namespace. Can't
        /// be repeated. See below for the structure of this block.
        /// </summary>
        [Input("capabilities")]
        public Input<Inputs.NamespaceCapabilitiesGetArgs>? Capabilities { get; set; }

        /// <summary>
        /// `(string: "")` - A description of the namespace.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("meta")]
        private InputMap<string>? _meta;

        /// <summary>
        /// `(map[string]string: &lt;optional&gt;)` -  Specifies arbitrary KV metadata to associate with the namespace.
        /// </summary>
        public InputMap<string> Meta
        {
            get => _meta ?? (_meta = new InputMap<string>());
            set => _meta = value;
        }

        /// <summary>
        /// `(string: &lt;required&gt;)` - A unique name for the namespace.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// `(block: &lt;optional&gt;)` - A block with node pool configuration for the namespace (Nomad Enterprise only).
        /// </summary>
        [Input("nodePoolConfig")]
        public Input<Inputs.NamespaceNodePoolConfigGetArgs>? NodePoolConfig { get; set; }

        /// <summary>
        /// `(string: "")` - A resource quota to attach to the namespace.
        /// </summary>
        [Input("quota")]
        public Input<string>? Quota { get; set; }

        public NamespaceState()
        {
        }
        public static new NamespaceState Empty => new NamespaceState();
    }
}
