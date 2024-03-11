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
    /// Creating a token with limited policies:
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
    ///     var dakota = new Nomad.AclToken("dakota", new()
    ///     {
    ///         Policies = new[]
    ///         {
    ///             "dev",
    ///             "qa",
    ///         },
    ///         Type = "client",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// Creating a global token that will be replicated to all regions:
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
    ///     var dakota = new Nomad.AclToken("dakota", new()
    ///     {
    ///         Global = true,
    ///         Policies = new[]
    ///         {
    ///             "dev",
    ///             "qa",
    ///         },
    ///         Type = "client",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// Creating a token with full access to the cluster:
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
    ///     var iman = new Nomad.AclToken("iman", new()
    ///     {
    ///         Type = "management",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// Accessing the token:
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
    ///     var token = new Nomad.AclToken("token", new()
    ///     {
    ///         Type = "client",
    ///         Policies = new[]
    ///         {
    ///             "dev",
    ///         },
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["nomadToken"] = token.SecretId,
    ///     };
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// </summary>
    [NomadResourceType("nomad:index/aclToken:AclToken")]
    public partial class AclToken : global::Pulumi.CustomResource
    {
        /// <summary>
        /// `(string)` - A non-sensitive identifier for this token that
        /// can be logged and shared safely without granting any access to the cluster.
        /// </summary>
        [Output("accessorId")]
        public Output<string> AccessorId { get; private set; } = null!;

        /// <summary>
        /// `(string)` - The timestamp the token was created.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// `(string)` - The timestamp after which the token is
        /// considered expired and eligible for destruction.
        /// </summary>
        [Output("expirationTime")]
        public Output<string> ExpirationTime { get; private set; } = null!;

        /// <summary>
        /// `(string: "")` - Provides a TTL for the token in the form of
        /// a time duration such as `"5m"` or `"1h"`.
        /// 
        /// In addition to the above arguments, the following attributes are exported and
        /// can be referenced:
        /// </summary>
        [Output("expirationTtl")]
        public Output<string?> ExpirationTtl { get; private set; } = null!;

        /// <summary>
        /// `(bool: false)` - Whether the token should be replicated to all
        /// regions, or if it will only be used in the region it was created in.
        /// </summary>
        [Output("global")]
        public Output<bool?> Global { get; private set; } = null!;

        /// <summary>
        /// `(string: "")` - A human-friendly name for this token.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// `(set: [])` - A set of policy names to associate with this
        /// token. Must be set on `client`-type tokens, must not be set on
        /// `management`-type tokens. Policies do not need to exist before being
        /// used here.
        /// </summary>
        [Output("policies")]
        public Output<ImmutableArray<string>> Policies { get; private set; } = null!;

        /// <summary>
        /// `(set: [])` - The list of roles attached to the token. Each entry has
        /// `name` and `id` attributes. It may be used multiple times.
        /// </summary>
        [Output("roles")]
        public Output<ImmutableArray<Outputs.AclTokenRole>> Roles { get; private set; } = null!;

        /// <summary>
        /// `(string)` - The token value itself, which is presented for
        /// access to the cluster.
        /// </summary>
        [Output("secretId")]
        public Output<string> SecretId { get; private set; } = null!;

        /// <summary>
        /// `(string: &lt;required&gt;)` - The type of token this is. Use `client`
        /// for tokens that will have policies associated with them. Use `management`
        /// for tokens that can perform any action.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a AclToken resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AclToken(string name, AclTokenArgs args, CustomResourceOptions? options = null)
            : base("nomad:index/aclToken:AclToken", name, args ?? new AclTokenArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AclToken(string name, Input<string> id, AclTokenState? state = null, CustomResourceOptions? options = null)
            : base("nomad:index/aclToken:AclToken", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "secretId",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing AclToken resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AclToken Get(string name, Input<string> id, AclTokenState? state = null, CustomResourceOptions? options = null)
        {
            return new AclToken(name, id, state, options);
        }
    }

    public sealed class AclTokenArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// `(string: "")` - Provides a TTL for the token in the form of
        /// a time duration such as `"5m"` or `"1h"`.
        /// 
        /// In addition to the above arguments, the following attributes are exported and
        /// can be referenced:
        /// </summary>
        [Input("expirationTtl")]
        public Input<string>? ExpirationTtl { get; set; }

        /// <summary>
        /// `(bool: false)` - Whether the token should be replicated to all
        /// regions, or if it will only be used in the region it was created in.
        /// </summary>
        [Input("global")]
        public Input<bool>? Global { get; set; }

        /// <summary>
        /// `(string: "")` - A human-friendly name for this token.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("policies")]
        private InputList<string>? _policies;

        /// <summary>
        /// `(set: [])` - A set of policy names to associate with this
        /// token. Must be set on `client`-type tokens, must not be set on
        /// `management`-type tokens. Policies do not need to exist before being
        /// used here.
        /// </summary>
        public InputList<string> Policies
        {
            get => _policies ?? (_policies = new InputList<string>());
            set => _policies = value;
        }

        [Input("roles")]
        private InputList<Inputs.AclTokenRoleArgs>? _roles;

        /// <summary>
        /// `(set: [])` - The list of roles attached to the token. Each entry has
        /// `name` and `id` attributes. It may be used multiple times.
        /// </summary>
        public InputList<Inputs.AclTokenRoleArgs> Roles
        {
            get => _roles ?? (_roles = new InputList<Inputs.AclTokenRoleArgs>());
            set => _roles = value;
        }

        /// <summary>
        /// `(string: &lt;required&gt;)` - The type of token this is. Use `client`
        /// for tokens that will have policies associated with them. Use `management`
        /// for tokens that can perform any action.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public AclTokenArgs()
        {
        }
        public static new AclTokenArgs Empty => new AclTokenArgs();
    }

    public sealed class AclTokenState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// `(string)` - A non-sensitive identifier for this token that
        /// can be logged and shared safely without granting any access to the cluster.
        /// </summary>
        [Input("accessorId")]
        public Input<string>? AccessorId { get; set; }

        /// <summary>
        /// `(string)` - The timestamp the token was created.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// `(string)` - The timestamp after which the token is
        /// considered expired and eligible for destruction.
        /// </summary>
        [Input("expirationTime")]
        public Input<string>? ExpirationTime { get; set; }

        /// <summary>
        /// `(string: "")` - Provides a TTL for the token in the form of
        /// a time duration such as `"5m"` or `"1h"`.
        /// 
        /// In addition to the above arguments, the following attributes are exported and
        /// can be referenced:
        /// </summary>
        [Input("expirationTtl")]
        public Input<string>? ExpirationTtl { get; set; }

        /// <summary>
        /// `(bool: false)` - Whether the token should be replicated to all
        /// regions, or if it will only be used in the region it was created in.
        /// </summary>
        [Input("global")]
        public Input<bool>? Global { get; set; }

        /// <summary>
        /// `(string: "")` - A human-friendly name for this token.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("policies")]
        private InputList<string>? _policies;

        /// <summary>
        /// `(set: [])` - A set of policy names to associate with this
        /// token. Must be set on `client`-type tokens, must not be set on
        /// `management`-type tokens. Policies do not need to exist before being
        /// used here.
        /// </summary>
        public InputList<string> Policies
        {
            get => _policies ?? (_policies = new InputList<string>());
            set => _policies = value;
        }

        [Input("roles")]
        private InputList<Inputs.AclTokenRoleGetArgs>? _roles;

        /// <summary>
        /// `(set: [])` - The list of roles attached to the token. Each entry has
        /// `name` and `id` attributes. It may be used multiple times.
        /// </summary>
        public InputList<Inputs.AclTokenRoleGetArgs> Roles
        {
            get => _roles ?? (_roles = new InputList<Inputs.AclTokenRoleGetArgs>());
            set => _roles = value;
        }

        [Input("secretId")]
        private Input<string>? _secretId;

        /// <summary>
        /// `(string)` - The token value itself, which is presented for
        /// access to the cluster.
        /// </summary>
        public Input<string>? SecretId
        {
            get => _secretId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secretId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// `(string: &lt;required&gt;)` - The type of token this is. Use `client`
        /// for tokens that will have policies associated with them. Use `management`
        /// for tokens that can perform any action.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public AclTokenState()
        {
        }
        public static new AclTokenState Empty => new AclTokenState();
    }
}
