// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad.Outputs
{

    [OutputType]
    public sealed class AclAuthMethodConfigOidcClientAssertion
    {
        /// <summary>
        /// `([]string: optional)` - Who processes the assertion.
        /// Defaults to the auth method's `oidc_discovery_url`.
        /// </summary>
        public readonly ImmutableArray<string> Audiences;
        /// <summary>
        /// `(map[string]string: optional)` - Add to the JWT headers,
        /// alongside "kid" and "type". Setting the "kid" header here is not allowed;
        /// use `private_key.key_id`.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? ExtraHeaders;
        /// <summary>
        /// `(string: &lt;optional&gt;)` is the key's algorithm.
        /// Its default values are based on the `key_source`:
        /// - "nomad": "RS256"; this is from Nomad's keyring and must not be changed
        /// - "private_key": "RS256"; must be RS256, RS384, or RS512
        /// - "client_secret": "HS256"; must be HS256, HS384, or HS512
        /// </summary>
        public readonly string? KeyAlgorithm;
        /// <summary>
        /// `(string: &lt;required&gt;)` - Specifies where to get the private
        /// key to sign the JWT.
        /// Available sources:
        /// - "nomad": Use current active key in Nomad's keyring
        /// - "private_key": Use key material in the `private_key` field
        /// - "client_secret": Use the `oidc_client_secret` as an HMAC key
        /// </summary>
        public readonly string KeySource;
        /// <summary>
        /// `(OIDCClientAssertionKey: &lt;optional&gt;)` - External key
        /// to sign the JWT. `key_source` must be "private_key" to enable this.
        /// </summary>
        public readonly Outputs.AclAuthMethodConfigOidcClientAssertionPrivateKey? PrivateKey;

        [OutputConstructor]
        private AclAuthMethodConfigOidcClientAssertion(
            ImmutableArray<string> audiences,

            ImmutableDictionary<string, string>? extraHeaders,

            string? keyAlgorithm,

            string keySource,

            Outputs.AclAuthMethodConfigOidcClientAssertionPrivateKey? privateKey)
        {
            Audiences = audiences;
            ExtraHeaders = extraHeaders;
            KeyAlgorithm = keyAlgorithm;
            KeySource = keySource;
            PrivateKey = privateKey;
        }
    }
}
