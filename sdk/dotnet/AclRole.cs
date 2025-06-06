// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad
{
    [NomadResourceType("nomad:index/aclRole:AclRole")]
    public partial class AclRole : global::Pulumi.CustomResource
    {
        /// <summary>
        /// `(string: "")` - A description of the ACL Role.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// `(string: &lt;required&gt;)` - A human-friendly name for this ACL Role.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// `(set: &lt;required&gt;)` - A set of policy names to associate with this
        /// ACL Role. It may be used multiple times.
        /// </summary>
        [Output("policies")]
        public Output<ImmutableArray<Outputs.AclRolePolicy>> Policies { get; private set; } = null!;


        /// <summary>
        /// Create a AclRole resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AclRole(string name, AclRoleArgs args, CustomResourceOptions? options = null)
            : base("nomad:index/aclRole:AclRole", name, args ?? new AclRoleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AclRole(string name, Input<string> id, AclRoleState? state = null, CustomResourceOptions? options = null)
            : base("nomad:index/aclRole:AclRole", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AclRole resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AclRole Get(string name, Input<string> id, AclRoleState? state = null, CustomResourceOptions? options = null)
        {
            return new AclRole(name, id, state, options);
        }
    }

    public sealed class AclRoleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// `(string: "")` - A description of the ACL Role.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// `(string: &lt;required&gt;)` - A human-friendly name for this ACL Role.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("policies", required: true)]
        private InputList<Inputs.AclRolePolicyArgs>? _policies;

        /// <summary>
        /// `(set: &lt;required&gt;)` - A set of policy names to associate with this
        /// ACL Role. It may be used multiple times.
        /// </summary>
        public InputList<Inputs.AclRolePolicyArgs> Policies
        {
            get => _policies ?? (_policies = new InputList<Inputs.AclRolePolicyArgs>());
            set => _policies = value;
        }

        public AclRoleArgs()
        {
        }
        public static new AclRoleArgs Empty => new AclRoleArgs();
    }

    public sealed class AclRoleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// `(string: "")` - A description of the ACL Role.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// `(string: &lt;required&gt;)` - A human-friendly name for this ACL Role.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("policies")]
        private InputList<Inputs.AclRolePolicyGetArgs>? _policies;

        /// <summary>
        /// `(set: &lt;required&gt;)` - A set of policy names to associate with this
        /// ACL Role. It may be used multiple times.
        /// </summary>
        public InputList<Inputs.AclRolePolicyGetArgs> Policies
        {
            get => _policies ?? (_policies = new InputList<Inputs.AclRolePolicyGetArgs>());
            set => _policies = value;
        }

        public AclRoleState()
        {
        }
        public static new AclRoleState Empty => new AclRoleState();
    }
}
