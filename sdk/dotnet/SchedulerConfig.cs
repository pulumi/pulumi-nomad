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
    /// Manages scheduler configuration of the Nomad cluster.
    /// 
    /// &gt; **Warning:** destroying this resource will not have any effect in the
    /// cluster configuration, since there's no clear definition of what a destroy
    /// action should do. The cluster will be left as-is and only the state reference
    /// will be removed.
    /// 
    /// ## Example Usage
    /// 
    /// Set cluster scheduler configuration:
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
    ///     var config = new Nomad.SchedulerConfig("config", new()
    ///     {
    ///         MemoryOversubscriptionEnabled = true,
    ///         PreemptionConfig = 
    ///         {
    ///             { "batch_scheduler_enabled", true },
    ///             { "service_scheduler_enabled", true },
    ///             { "sysbatch_scheduler_enabled", true },
    ///             { "system_scheduler_enabled", true },
    ///         },
    ///         SchedulerAlgorithm = "spread",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// </summary>
    [NomadResourceType("nomad:index/schedulerConfig:SchedulerConfig")]
    public partial class SchedulerConfig : global::Pulumi.CustomResource
    {
        /// <summary>
        /// `(bool: false)` - When `true`, tasks may exceed their reserved memory limit.
        /// </summary>
        [Output("memoryOversubscriptionEnabled")]
        public Output<bool?> MemoryOversubscriptionEnabled { get; private set; } = null!;

        /// <summary>
        /// `(map[string]bool)` - Options to enable preemption for various schedulers.
        /// </summary>
        [Output("preemptionConfig")]
        public Output<ImmutableDictionary<string, bool>?> PreemptionConfig { get; private set; } = null!;

        /// <summary>
        /// `(string: "binpack")` - Specifies whether scheduler binpacks or spreads allocations on available nodes. Possible values are `binpack` and `spread`.
        /// </summary>
        [Output("schedulerAlgorithm")]
        public Output<string?> SchedulerAlgorithm { get; private set; } = null!;


        /// <summary>
        /// Create a SchedulerConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SchedulerConfig(string name, SchedulerConfigArgs? args = null, CustomResourceOptions? options = null)
            : base("nomad:index/schedulerConfig:SchedulerConfig", name, args ?? new SchedulerConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SchedulerConfig(string name, Input<string> id, SchedulerConfigState? state = null, CustomResourceOptions? options = null)
            : base("nomad:index/schedulerConfig:SchedulerConfig", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SchedulerConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SchedulerConfig Get(string name, Input<string> id, SchedulerConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new SchedulerConfig(name, id, state, options);
        }
    }

    public sealed class SchedulerConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// `(bool: false)` - When `true`, tasks may exceed their reserved memory limit.
        /// </summary>
        [Input("memoryOversubscriptionEnabled")]
        public Input<bool>? MemoryOversubscriptionEnabled { get; set; }

        [Input("preemptionConfig")]
        private InputMap<bool>? _preemptionConfig;

        /// <summary>
        /// `(map[string]bool)` - Options to enable preemption for various schedulers.
        /// </summary>
        public InputMap<bool> PreemptionConfig
        {
            get => _preemptionConfig ?? (_preemptionConfig = new InputMap<bool>());
            set => _preemptionConfig = value;
        }

        /// <summary>
        /// `(string: "binpack")` - Specifies whether scheduler binpacks or spreads allocations on available nodes. Possible values are `binpack` and `spread`.
        /// </summary>
        [Input("schedulerAlgorithm")]
        public Input<string>? SchedulerAlgorithm { get; set; }

        public SchedulerConfigArgs()
        {
        }
        public static new SchedulerConfigArgs Empty => new SchedulerConfigArgs();
    }

    public sealed class SchedulerConfigState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// `(bool: false)` - When `true`, tasks may exceed their reserved memory limit.
        /// </summary>
        [Input("memoryOversubscriptionEnabled")]
        public Input<bool>? MemoryOversubscriptionEnabled { get; set; }

        [Input("preemptionConfig")]
        private InputMap<bool>? _preemptionConfig;

        /// <summary>
        /// `(map[string]bool)` - Options to enable preemption for various schedulers.
        /// </summary>
        public InputMap<bool> PreemptionConfig
        {
            get => _preemptionConfig ?? (_preemptionConfig = new InputMap<bool>());
            set => _preemptionConfig = value;
        }

        /// <summary>
        /// `(string: "binpack")` - Specifies whether scheduler binpacks or spreads allocations on available nodes. Possible values are `binpack` and `spread`.
        /// </summary>
        [Input("schedulerAlgorithm")]
        public Input<string>? SchedulerAlgorithm { get; set; }

        public SchedulerConfigState()
        {
        }
        public static new SchedulerConfigState Empty => new SchedulerConfigState();
    }
}
