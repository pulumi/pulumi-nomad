// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad.Inputs
{

    public sealed class AclAuthMethodConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowedRedirectUris", required: true)]
        private InputList<string>? _allowedRedirectUris;

        /// <summary>
        /// A list of allowed values that can be used for the redirect URI.
        /// </summary>
        public InputList<string> AllowedRedirectUris
        {
            get => _allowedRedirectUris ?? (_allowedRedirectUris = new InputList<string>());
            set => _allowedRedirectUris = value;
        }

        [Input("boundAudiences")]
        private InputList<string>? _boundAudiences;

        /// <summary>
        /// List of auth claims that are valid for login.
        /// </summary>
        public InputList<string> BoundAudiences
        {
            get => _boundAudiences ?? (_boundAudiences = new InputList<string>());
            set => _boundAudiences = value;
        }

        [Input("claimMappings")]
        private InputMap<string>? _claimMappings;

        /// <summary>
        /// Mappings of claims (key) that will be copied to a metadata field (value).
        /// </summary>
        public InputMap<string> ClaimMappings
        {
            get => _claimMappings ?? (_claimMappings = new InputMap<string>());
            set => _claimMappings = value;
        }

        [Input("discoveryCaPems")]
        private InputList<string>? _discoveryCaPems;

        /// <summary>
        /// PEM encoded CA certs for use by the TLS client used to talk with the OIDC Discovery URL.
        /// </summary>
        public InputList<string> DiscoveryCaPems
        {
            get => _discoveryCaPems ?? (_discoveryCaPems = new InputList<string>());
            set => _discoveryCaPems = value;
        }

        [Input("listClaimMappings")]
        private InputMap<string>? _listClaimMappings;

        /// <summary>
        /// Mappings of list claims (key) that will be copied to a metadata field (value).
        /// </summary>
        public InputMap<string> ListClaimMappings
        {
            get => _listClaimMappings ?? (_listClaimMappings = new InputMap<string>());
            set => _listClaimMappings = value;
        }

        /// <summary>
        /// The OAuth Client ID configured with the OIDC provider.
        /// </summary>
        [Input("oidcClientId", required: true)]
        public Input<string> OidcClientId { get; set; } = null!;

        [Input("oidcClientSecret", required: true)]
        private Input<string>? _oidcClientSecret;

        /// <summary>
        /// The OAuth Client Secret configured with the OIDC provider.
        /// </summary>
        public Input<string>? OidcClientSecret
        {
            get => _oidcClientSecret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _oidcClientSecret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The OIDC Discovery URL, without any .well-known component (base path).
        /// </summary>
        [Input("oidcDiscoveryUrl", required: true)]
        public Input<string> OidcDiscoveryUrl { get; set; } = null!;

        [Input("oidcScopes")]
        private InputList<string>? _oidcScopes;

        /// <summary>
        /// List of OIDC scopes.
        /// </summary>
        public InputList<string> OidcScopes
        {
            get => _oidcScopes ?? (_oidcScopes = new InputList<string>());
            set => _oidcScopes = value;
        }

        [Input("signingAlgs")]
        private InputList<string>? _signingAlgs;

        /// <summary>
        /// A list of supported signing algorithms.
        /// </summary>
        public InputList<string> SigningAlgs
        {
            get => _signingAlgs ?? (_signingAlgs = new InputList<string>());
            set => _signingAlgs = value;
        }

        public AclAuthMethodConfigArgs()
        {
        }
        public static new AclAuthMethodConfigArgs Empty => new AclAuthMethodConfigArgs();
    }
}
