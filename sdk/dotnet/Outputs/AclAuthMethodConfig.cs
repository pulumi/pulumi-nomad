// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad.Outputs
{

    [OutputType]
    public sealed class AclAuthMethodConfig
    {
        /// <summary>
        /// `([]string: &lt;optional&gt;)` - A list of allowed values
        /// that can be used for the redirect URI.
        /// </summary>
        public readonly ImmutableArray<string> AllowedRedirectUris;
        /// <summary>
        /// `([]string: &lt;optional&gt;)` - List of auth claims that are
        /// valid for login.
        /// </summary>
        public readonly ImmutableArray<string> BoundAudiences;
        /// <summary>
        /// `(map[string]string: &lt;optional&gt;)` - Mappings of claims (key)
        /// that will be copied to a metadata field (value).
        /// </summary>
        public readonly ImmutableDictionary<string, string>? ClaimMappings;
        /// <summary>
        /// `([]string: &lt;optional&gt;)` - PEM encoded CA certs for use
        /// by the TLS client used to talk with the OIDC Discovery URL.
        /// </summary>
        public readonly ImmutableArray<string> DiscoveryCaPems;
        /// <summary>
        /// `(map[string]string: &lt;optional&gt;)` - Mappings of list
        /// claims (key) that will be copied to a metadata field (value).
        /// </summary>
        public readonly ImmutableDictionary<string, string>? ListClaimMappings;
        /// <summary>
        /// `(string: &lt;required&gt;)` - The OAuth Client ID configured
        /// with the OIDC provider.
        /// </summary>
        public readonly string OidcClientId;
        /// <summary>
        /// `(string: &lt;required&gt;)` - The OAuth Client Secret
        /// configured with the OIDC provider.
        /// </summary>
        public readonly string OidcClientSecret;
        /// <summary>
        /// `(bool: false)` - When set to `true`, Nomad will
        /// not make a request to the identity provider to get OIDC `UserInfo`.
        /// You may wish to set this if your identity provider doesn't send any
        /// additional claims from the `UserInfo` endpoint.
        /// </summary>
        public readonly bool? OidcDisableUserinfo;
        /// <summary>
        /// `(string: &lt;required&gt;)` - The OIDC Discovery URL,
        /// without any .well-known component (base path).
        /// </summary>
        public readonly string OidcDiscoveryUrl;
        /// <summary>
        /// `([]string: &lt;optional&gt;)` - List of OIDC scopes.
        /// </summary>
        public readonly ImmutableArray<string> OidcScopes;
        /// <summary>
        /// `([]string: &lt;optional&gt;)` - A list of supported signing
        /// algorithms.
        /// </summary>
        public readonly ImmutableArray<string> SigningAlgs;

        [OutputConstructor]
        private AclAuthMethodConfig(
            ImmutableArray<string> allowedRedirectUris,

            ImmutableArray<string> boundAudiences,

            ImmutableDictionary<string, string>? claimMappings,

            ImmutableArray<string> discoveryCaPems,

            ImmutableDictionary<string, string>? listClaimMappings,

            string oidcClientId,

            string oidcClientSecret,

            bool? oidcDisableUserinfo,

            string oidcDiscoveryUrl,

            ImmutableArray<string> oidcScopes,

            ImmutableArray<string> signingAlgs)
        {
            AllowedRedirectUris = allowedRedirectUris;
            BoundAudiences = boundAudiences;
            ClaimMappings = claimMappings;
            DiscoveryCaPems = discoveryCaPems;
            ListClaimMappings = listClaimMappings;
            OidcClientId = oidcClientId;
            OidcClientSecret = oidcClientSecret;
            OidcDisableUserinfo = oidcDisableUserinfo;
            OidcDiscoveryUrl = oidcDiscoveryUrl;
            OidcScopes = oidcScopes;
            SigningAlgs = signingAlgs;
        }
    }
}
