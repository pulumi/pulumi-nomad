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
    /// Manages a Sentinel policy registered in Nomad.
    /// 
    /// &gt; **Enterprise Only!** This API endpoint and functionality only exists in
    ///    Nomad Enterprise. This is not present in the open source version of Nomad.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Nomad = Pulumi.Nomad;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exec_only = new Nomad.SentinelPolicy("exec-only", new()
    ///     {
    ///         Description = "Only allow jobs that are based on an exec driver.",
    ///         EnforcementLevel = "soft-mandatory",
    ///         Policy = @"main = rule { all_drivers_exec }
    /// 
    /// # all_drivers_exec checks that all the drivers in use are exec
    /// all_drivers_exec = rule {
    ///     all job.task_groups as tg {
    ///         all tg.tasks as task {
    ///             task.driver is ""exec""
    ///         }
    ///     }
    /// }
    /// 
    /// ",
    ///         Scope = "submit-job",
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [NomadResourceType("nomad:index/sentinelPolicy:SentinelPolicy")]
    public partial class SentinelPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// `(string: "")` - A description of the policy.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// `(strings: &lt;required&gt;)` - The [enforcement level][enforcement-level]
        /// for this policy.
        /// </summary>
        [Output("enforcementLevel")]
        public Output<string> EnforcementLevel { get; private set; } = null!;

        /// <summary>
        /// `(string: &lt;required&gt;)` - A unique name for the policy.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// `(string: &lt;required&gt;)` - The contents of the policy to register.
        /// </summary>
        [Output("policy")]
        public Output<string> Policy { get; private set; } = null!;

        /// <summary>
        /// `(strings: &lt;required&gt;)` - The [scope][scope] for this policy.
        /// </summary>
        [Output("scope")]
        public Output<string> Scope { get; private set; } = null!;


        /// <summary>
        /// Create a SentinelPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SentinelPolicy(string name, SentinelPolicyArgs args, CustomResourceOptions? options = null)
            : base("nomad:index/sentinelPolicy:SentinelPolicy", name, args ?? new SentinelPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SentinelPolicy(string name, Input<string> id, SentinelPolicyState? state = null, CustomResourceOptions? options = null)
            : base("nomad:index/sentinelPolicy:SentinelPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SentinelPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SentinelPolicy Get(string name, Input<string> id, SentinelPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new SentinelPolicy(name, id, state, options);
        }
    }

    public sealed class SentinelPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// `(string: "")` - A description of the policy.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// `(strings: &lt;required&gt;)` - The [enforcement level][enforcement-level]
        /// for this policy.
        /// </summary>
        [Input("enforcementLevel", required: true)]
        public Input<string> EnforcementLevel { get; set; } = null!;

        /// <summary>
        /// `(string: &lt;required&gt;)` - A unique name for the policy.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// `(string: &lt;required&gt;)` - The contents of the policy to register.
        /// </summary>
        [Input("policy", required: true)]
        public Input<string> Policy { get; set; } = null!;

        /// <summary>
        /// `(strings: &lt;required&gt;)` - The [scope][scope] for this policy.
        /// </summary>
        [Input("scope", required: true)]
        public Input<string> Scope { get; set; } = null!;

        public SentinelPolicyArgs()
        {
        }
        public static new SentinelPolicyArgs Empty => new SentinelPolicyArgs();
    }

    public sealed class SentinelPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// `(string: "")` - A description of the policy.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// `(strings: &lt;required&gt;)` - The [enforcement level][enforcement-level]
        /// for this policy.
        /// </summary>
        [Input("enforcementLevel")]
        public Input<string>? EnforcementLevel { get; set; }

        /// <summary>
        /// `(string: &lt;required&gt;)` - A unique name for the policy.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// `(string: &lt;required&gt;)` - The contents of the policy to register.
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        /// <summary>
        /// `(strings: &lt;required&gt;)` - The [scope][scope] for this policy.
        /// </summary>
        [Input("scope")]
        public Input<string>? Scope { get; set; }

        public SentinelPolicyState()
        {
        }
        public static new SentinelPolicyState Empty => new SentinelPolicyState();
    }
}
