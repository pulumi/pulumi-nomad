// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad
{
    /// <summary>
    /// Manages an ACL Auth Method in Nomad.
    /// 
    /// ## Example Usage
    /// 
    /// Creating an ALC Auth Method:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Nomad = Pulumi.Nomad;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var myNomadAclAuthMethod = new Nomad.AclAuthMethod("my_nomad_acl_auth_method", new()
    ///     {
    ///         Name = "my-nomad-acl-auth-method",
    ///         Type = "OIDC",
    ///         TokenLocality = "global",
    ///         MaxTokenTtl = "10m0s",
    ///         TokenNameFormat = "${auth_method_type}-${value.user}",
    ///         Default = true,
    ///         Config = new Nomad.Inputs.AclAuthMethodConfigArgs
    ///         {
    ///             OidcDiscoveryUrl = "https://uk.auth0.com/",
    ///             OidcClientId = "someclientid",
    ///             OidcClientSecret = "someclientsecret-t",
    ///             BoundAudiences = new[]
    ///             {
    ///                 "someclientid",
    ///             },
    ///             AllowedRedirectUris = new[]
    ///             {
    ///                 "http://localhost:4649/oidc/callback",
    ///                 "http://localhost:4646/ui/settings/tokens",
    ///             },
    ///             ListClaimMappings = 
    ///             {
    ///                 { "http://nomad.internal/roles", "roles" },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [NomadResourceType("nomad:index/aclAuthMethod:AclAuthMethod")]
    public partial class AclAuthMethod : global::Pulumi.CustomResource
    {
        /// <summary>
        /// `(block: &lt;required&gt;)` - Configuration specific to the auth method
        /// provider.
        /// </summary>
        [Output("config")]
        public Output<Outputs.AclAuthMethodConfig> Config { get; private set; } = null!;

        /// <summary>
        /// `(bool: false)` - Defines whether this ACL Auth Method is to be set
        /// as default.
        /// </summary>
        [Output("default")]
        public Output<bool?> Default { get; private set; } = null!;

        /// <summary>
        /// `(string: &lt;required&gt;)` - Defines the maximum life of a token
        /// created by this method and is specified as a time duration such as "15h".
        /// </summary>
        [Output("maxTokenTtl")]
        public Output<string> MaxTokenTtl { get; private set; } = null!;

        /// <summary>
        /// `(string: &lt;required&gt;)` - The identifier of the ACL Auth Method.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// `(string: &lt;required&gt;)` - Defines whether the ACL Auth Method
        /// creates a local or global token when performing SSO login. This field must be
        /// set to either `local` or `global`.
        /// </summary>
        [Output("tokenLocality")]
        public Output<string> TokenLocality { get; private set; } = null!;

        /// <summary>
        /// `(string: "${auth_method_type}-${auth_method_name}")` -
        /// Defines the token name format for the generated tokens This can be lightly
        /// templated using HIL '${foo}' syntax.
        /// </summary>
        [Output("tokenNameFormat")]
        public Output<string?> TokenNameFormat { get; private set; } = null!;

        /// <summary>
        /// `(string: &lt;required&gt;)` - ACL Auth Method SSO workflow type. Valid values,
        /// are `OIDC` and `JWT`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a AclAuthMethod resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AclAuthMethod(string name, AclAuthMethodArgs args, CustomResourceOptions? options = null)
            : base("nomad:index/aclAuthMethod:AclAuthMethod", name, args ?? new AclAuthMethodArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AclAuthMethod(string name, Input<string> id, AclAuthMethodState? state = null, CustomResourceOptions? options = null)
            : base("nomad:index/aclAuthMethod:AclAuthMethod", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AclAuthMethod resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AclAuthMethod Get(string name, Input<string> id, AclAuthMethodState? state = null, CustomResourceOptions? options = null)
        {
            return new AclAuthMethod(name, id, state, options);
        }
    }

    public sealed class AclAuthMethodArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// `(block: &lt;required&gt;)` - Configuration specific to the auth method
        /// provider.
        /// </summary>
        [Input("config", required: true)]
        public Input<Inputs.AclAuthMethodConfigArgs> Config { get; set; } = null!;

        /// <summary>
        /// `(bool: false)` - Defines whether this ACL Auth Method is to be set
        /// as default.
        /// </summary>
        [Input("default")]
        public Input<bool>? Default { get; set; }

        /// <summary>
        /// `(string: &lt;required&gt;)` - Defines the maximum life of a token
        /// created by this method and is specified as a time duration such as "15h".
        /// </summary>
        [Input("maxTokenTtl", required: true)]
        public Input<string> MaxTokenTtl { get; set; } = null!;

        /// <summary>
        /// `(string: &lt;required&gt;)` - The identifier of the ACL Auth Method.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// `(string: &lt;required&gt;)` - Defines whether the ACL Auth Method
        /// creates a local or global token when performing SSO login. This field must be
        /// set to either `local` or `global`.
        /// </summary>
        [Input("tokenLocality", required: true)]
        public Input<string> TokenLocality { get; set; } = null!;

        /// <summary>
        /// `(string: "${auth_method_type}-${auth_method_name}")` -
        /// Defines the token name format for the generated tokens This can be lightly
        /// templated using HIL '${foo}' syntax.
        /// </summary>
        [Input("tokenNameFormat")]
        public Input<string>? TokenNameFormat { get; set; }

        /// <summary>
        /// `(string: &lt;required&gt;)` - ACL Auth Method SSO workflow type. Valid values,
        /// are `OIDC` and `JWT`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public AclAuthMethodArgs()
        {
        }
        public static new AclAuthMethodArgs Empty => new AclAuthMethodArgs();
    }

    public sealed class AclAuthMethodState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// `(block: &lt;required&gt;)` - Configuration specific to the auth method
        /// provider.
        /// </summary>
        [Input("config")]
        public Input<Inputs.AclAuthMethodConfigGetArgs>? Config { get; set; }

        /// <summary>
        /// `(bool: false)` - Defines whether this ACL Auth Method is to be set
        /// as default.
        /// </summary>
        [Input("default")]
        public Input<bool>? Default { get; set; }

        /// <summary>
        /// `(string: &lt;required&gt;)` - Defines the maximum life of a token
        /// created by this method and is specified as a time duration such as "15h".
        /// </summary>
        [Input("maxTokenTtl")]
        public Input<string>? MaxTokenTtl { get; set; }

        /// <summary>
        /// `(string: &lt;required&gt;)` - The identifier of the ACL Auth Method.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// `(string: &lt;required&gt;)` - Defines whether the ACL Auth Method
        /// creates a local or global token when performing SSO login. This field must be
        /// set to either `local` or `global`.
        /// </summary>
        [Input("tokenLocality")]
        public Input<string>? TokenLocality { get; set; }

        /// <summary>
        /// `(string: "${auth_method_type}-${auth_method_name}")` -
        /// Defines the token name format for the generated tokens This can be lightly
        /// templated using HIL '${foo}' syntax.
        /// </summary>
        [Input("tokenNameFormat")]
        public Input<string>? TokenNameFormat { get; set; }

        /// <summary>
        /// `(string: &lt;required&gt;)` - ACL Auth Method SSO workflow type. Valid values,
        /// are `OIDC` and `JWT`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public AclAuthMethodState()
        {
        }
        public static new AclAuthMethodState Empty => new AclAuthMethodState();
    }
}
