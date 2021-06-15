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
    /// Manages an ACL policy registered in Nomad.
    /// 
    /// ## Example Usage
    /// 
    /// Registering a policy from a HCL file:
    /// 
    /// ```csharp
    /// using System.IO;
    /// using Pulumi;
    /// using Nomad = Pulumi.Nomad;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var dev = new Nomad.AclPolicy("dev", new Nomad.AclPolicyArgs
    ///         {
    ///             Description = "Submit jobs to the dev environment.",
    ///             RulesHcl = File.ReadAllText($"{path.Module}/dev.hcl"),
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// Registering a policy from inline HCL:
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Nomad = Pulumi.Nomad;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var dev = new Nomad.AclPolicy("dev", new Nomad.AclPolicyArgs
    ///         {
    ///             Description = "Submit jobs to the dev environment.",
    ///             RulesHcl = @"namespace ""dev"" {
    ///   policy = ""write""
    /// }
    /// 
    /// ",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    [NomadResourceType("nomad:index/aclPolicy:AclPolicy")]
    public partial class AclPolicy : Pulumi.CustomResource
    {
        /// <summary>
        /// `(string: "")` - A description of the policy.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// `(string: &lt;required&gt;)` - A unique name for the policy.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// `(string: &lt;required&gt;)` - The contents of the policy to register,
        /// as HCL or JSON.
        /// </summary>
        [Output("rulesHcl")]
        public Output<string> RulesHcl { get; private set; } = null!;


        /// <summary>
        /// Create a AclPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AclPolicy(string name, AclPolicyArgs args, CustomResourceOptions? options = null)
            : base("nomad:index/aclPolicy:AclPolicy", name, args ?? new AclPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AclPolicy(string name, Input<string> id, AclPolicyState? state = null, CustomResourceOptions? options = null)
            : base("nomad:index/aclPolicy:AclPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AclPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AclPolicy Get(string name, Input<string> id, AclPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new AclPolicy(name, id, state, options);
        }
    }

    public sealed class AclPolicyArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// `(string: "")` - A description of the policy.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// `(string: &lt;required&gt;)` - A unique name for the policy.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// `(string: &lt;required&gt;)` - The contents of the policy to register,
        /// as HCL or JSON.
        /// </summary>
        [Input("rulesHcl", required: true)]
        public Input<string> RulesHcl { get; set; } = null!;

        public AclPolicyArgs()
        {
        }
    }

    public sealed class AclPolicyState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// `(string: "")` - A description of the policy.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// `(string: &lt;required&gt;)` - A unique name for the policy.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// `(string: &lt;required&gt;)` - The contents of the policy to register,
        /// as HCL or JSON.
        /// </summary>
        [Input("rulesHcl")]
        public Input<string>? RulesHcl { get; set; }

        public AclPolicyState()
        {
        }
    }
}