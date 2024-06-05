// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AclAuthMethodConfig {
    /**
     * @return `([]string: &lt;optional&gt;)` - A list of allowed values
     * that can be used for the redirect URI.
     * 
     */
    private @Nullable List<String> allowedRedirectUris;
    /**
     * @return `([]string: &lt;optional&gt;)` - List of auth claims that are
     * valid for login.
     * 
     */
    private @Nullable List<String> boundAudiences;
    /**
     * @return `([]string: &lt;optional&gt;)` - The value against which to match
     * the iss claim in a JWT.
     * 
     */
    private @Nullable List<String> boundIssuers;
    /**
     * @return Mappings of claims (key) that will be copied to a metadata field (value).
     * 
     */
    private @Nullable Map<String,String> claimMappings;
    /**
     * @return `(string: &lt;optional&gt;)` - Duration of leeway when validating
     * all claims in the form of a time duration such as &#34;5m&#34; or &#34;1h&#34;.
     * 
     */
    private @Nullable String clockSkewLeeway;
    /**
     * @return `([]string: &lt;optional&gt;)` - PEM encoded CA certs for use
     * by the TLS client used to talk with the OIDC Discovery URL.
     * 
     */
    private @Nullable List<String> discoveryCaPems;
    /**
     * @return `(string: &lt;optional&gt;)` - Duration of leeway when validating
     * expiration of a JWT in the form of a time duration such as &#34;5m&#34; or &#34;1h&#34;.
     * 
     */
    private @Nullable String expirationLeeway;
    /**
     * @return `(string: &lt;optional&gt;)` - PEM encoded CA cert for use by the
     * TLS client used to talk with the JWKS server.
     * 
     */
    private @Nullable String jwksCaCert;
    /**
     * @return `(string: &lt;optional&gt;)` - JSON Web Key Sets url for authenticating
     * signatures.
     * 
     */
    private @Nullable String jwksUrl;
    /**
     * @return `([]string: &lt;optional&gt;)` - List of PEM-encoded
     * public keys to use to authenticate signatures locally.
     * 
     */
    private @Nullable List<String> jwtValidationPubKeys;
    /**
     * @return Mappings of list claims (key) that will be copied to a metadata field (value).
     * 
     */
    private @Nullable Map<String,String> listClaimMappings;
    /**
     * @return `(string: &lt;optional&gt;)` - Duration of leeway when validating
     * not before values of a token in the form of a time duration such as &#34;5m&#34; or &#34;1h&#34;.
     * 
     */
    private @Nullable String notBeforeLeeway;
    /**
     * @return `(string: &lt;optional&gt;)` - The OAuth Client ID configured
     * with the OIDC provider.
     * 
     */
    private @Nullable String oidcClientId;
    /**
     * @return `(string: &lt;optional&gt;)` - The OAuth Client Secret
     * configured with the OIDC provider.
     * 
     */
    private @Nullable String oidcClientSecret;
    /**
     * @return `(bool: false)` - When set to `true`, Nomad will
     * not make a request to the identity provider to get OIDC `UserInfo`.
     * You may wish to set this if your identity provider doesn&#39;t send any
     * additional claims from the `UserInfo` endpoint.
     * 
     */
    private @Nullable Boolean oidcDisableUserinfo;
    /**
     * @return `(string: &lt;optional&gt;)` - The OIDC Discovery URL,
     * without any .well-known component (base path).
     * 
     */
    private @Nullable String oidcDiscoveryUrl;
    /**
     * @return `([]string: &lt;optional&gt;)` - List of OIDC scopes.
     * 
     */
    private @Nullable List<String> oidcScopes;
    /**
     * @return `([]string: &lt;optional&gt;)` - A list of supported signing
     * algorithms.
     * 
     */
    private @Nullable List<String> signingAlgs;

    private AclAuthMethodConfig() {}
    /**
     * @return `([]string: &lt;optional&gt;)` - A list of allowed values
     * that can be used for the redirect URI.
     * 
     */
    public List<String> allowedRedirectUris() {
        return this.allowedRedirectUris == null ? List.of() : this.allowedRedirectUris;
    }
    /**
     * @return `([]string: &lt;optional&gt;)` - List of auth claims that are
     * valid for login.
     * 
     */
    public List<String> boundAudiences() {
        return this.boundAudiences == null ? List.of() : this.boundAudiences;
    }
    /**
     * @return `([]string: &lt;optional&gt;)` - The value against which to match
     * the iss claim in a JWT.
     * 
     */
    public List<String> boundIssuers() {
        return this.boundIssuers == null ? List.of() : this.boundIssuers;
    }
    /**
     * @return Mappings of claims (key) that will be copied to a metadata field (value).
     * 
     */
    public Map<String,String> claimMappings() {
        return this.claimMappings == null ? Map.of() : this.claimMappings;
    }
    /**
     * @return `(string: &lt;optional&gt;)` - Duration of leeway when validating
     * all claims in the form of a time duration such as &#34;5m&#34; or &#34;1h&#34;.
     * 
     */
    public Optional<String> clockSkewLeeway() {
        return Optional.ofNullable(this.clockSkewLeeway);
    }
    /**
     * @return `([]string: &lt;optional&gt;)` - PEM encoded CA certs for use
     * by the TLS client used to talk with the OIDC Discovery URL.
     * 
     */
    public List<String> discoveryCaPems() {
        return this.discoveryCaPems == null ? List.of() : this.discoveryCaPems;
    }
    /**
     * @return `(string: &lt;optional&gt;)` - Duration of leeway when validating
     * expiration of a JWT in the form of a time duration such as &#34;5m&#34; or &#34;1h&#34;.
     * 
     */
    public Optional<String> expirationLeeway() {
        return Optional.ofNullable(this.expirationLeeway);
    }
    /**
     * @return `(string: &lt;optional&gt;)` - PEM encoded CA cert for use by the
     * TLS client used to talk with the JWKS server.
     * 
     */
    public Optional<String> jwksCaCert() {
        return Optional.ofNullable(this.jwksCaCert);
    }
    /**
     * @return `(string: &lt;optional&gt;)` - JSON Web Key Sets url for authenticating
     * signatures.
     * 
     */
    public Optional<String> jwksUrl() {
        return Optional.ofNullable(this.jwksUrl);
    }
    /**
     * @return `([]string: &lt;optional&gt;)` - List of PEM-encoded
     * public keys to use to authenticate signatures locally.
     * 
     */
    public List<String> jwtValidationPubKeys() {
        return this.jwtValidationPubKeys == null ? List.of() : this.jwtValidationPubKeys;
    }
    /**
     * @return Mappings of list claims (key) that will be copied to a metadata field (value).
     * 
     */
    public Map<String,String> listClaimMappings() {
        return this.listClaimMappings == null ? Map.of() : this.listClaimMappings;
    }
    /**
     * @return `(string: &lt;optional&gt;)` - Duration of leeway when validating
     * not before values of a token in the form of a time duration such as &#34;5m&#34; or &#34;1h&#34;.
     * 
     */
    public Optional<String> notBeforeLeeway() {
        return Optional.ofNullable(this.notBeforeLeeway);
    }
    /**
     * @return `(string: &lt;optional&gt;)` - The OAuth Client ID configured
     * with the OIDC provider.
     * 
     */
    public Optional<String> oidcClientId() {
        return Optional.ofNullable(this.oidcClientId);
    }
    /**
     * @return `(string: &lt;optional&gt;)` - The OAuth Client Secret
     * configured with the OIDC provider.
     * 
     */
    public Optional<String> oidcClientSecret() {
        return Optional.ofNullable(this.oidcClientSecret);
    }
    /**
     * @return `(bool: false)` - When set to `true`, Nomad will
     * not make a request to the identity provider to get OIDC `UserInfo`.
     * You may wish to set this if your identity provider doesn&#39;t send any
     * additional claims from the `UserInfo` endpoint.
     * 
     */
    public Optional<Boolean> oidcDisableUserinfo() {
        return Optional.ofNullable(this.oidcDisableUserinfo);
    }
    /**
     * @return `(string: &lt;optional&gt;)` - The OIDC Discovery URL,
     * without any .well-known component (base path).
     * 
     */
    public Optional<String> oidcDiscoveryUrl() {
        return Optional.ofNullable(this.oidcDiscoveryUrl);
    }
    /**
     * @return `([]string: &lt;optional&gt;)` - List of OIDC scopes.
     * 
     */
    public List<String> oidcScopes() {
        return this.oidcScopes == null ? List.of() : this.oidcScopes;
    }
    /**
     * @return `([]string: &lt;optional&gt;)` - A list of supported signing
     * algorithms.
     * 
     */
    public List<String> signingAlgs() {
        return this.signingAlgs == null ? List.of() : this.signingAlgs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AclAuthMethodConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> allowedRedirectUris;
        private @Nullable List<String> boundAudiences;
        private @Nullable List<String> boundIssuers;
        private @Nullable Map<String,String> claimMappings;
        private @Nullable String clockSkewLeeway;
        private @Nullable List<String> discoveryCaPems;
        private @Nullable String expirationLeeway;
        private @Nullable String jwksCaCert;
        private @Nullable String jwksUrl;
        private @Nullable List<String> jwtValidationPubKeys;
        private @Nullable Map<String,String> listClaimMappings;
        private @Nullable String notBeforeLeeway;
        private @Nullable String oidcClientId;
        private @Nullable String oidcClientSecret;
        private @Nullable Boolean oidcDisableUserinfo;
        private @Nullable String oidcDiscoveryUrl;
        private @Nullable List<String> oidcScopes;
        private @Nullable List<String> signingAlgs;
        public Builder() {}
        public Builder(AclAuthMethodConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedRedirectUris = defaults.allowedRedirectUris;
    	      this.boundAudiences = defaults.boundAudiences;
    	      this.boundIssuers = defaults.boundIssuers;
    	      this.claimMappings = defaults.claimMappings;
    	      this.clockSkewLeeway = defaults.clockSkewLeeway;
    	      this.discoveryCaPems = defaults.discoveryCaPems;
    	      this.expirationLeeway = defaults.expirationLeeway;
    	      this.jwksCaCert = defaults.jwksCaCert;
    	      this.jwksUrl = defaults.jwksUrl;
    	      this.jwtValidationPubKeys = defaults.jwtValidationPubKeys;
    	      this.listClaimMappings = defaults.listClaimMappings;
    	      this.notBeforeLeeway = defaults.notBeforeLeeway;
    	      this.oidcClientId = defaults.oidcClientId;
    	      this.oidcClientSecret = defaults.oidcClientSecret;
    	      this.oidcDisableUserinfo = defaults.oidcDisableUserinfo;
    	      this.oidcDiscoveryUrl = defaults.oidcDiscoveryUrl;
    	      this.oidcScopes = defaults.oidcScopes;
    	      this.signingAlgs = defaults.signingAlgs;
        }

        @CustomType.Setter
        public Builder allowedRedirectUris(@Nullable List<String> allowedRedirectUris) {

            this.allowedRedirectUris = allowedRedirectUris;
            return this;
        }
        public Builder allowedRedirectUris(String... allowedRedirectUris) {
            return allowedRedirectUris(List.of(allowedRedirectUris));
        }
        @CustomType.Setter
        public Builder boundAudiences(@Nullable List<String> boundAudiences) {

            this.boundAudiences = boundAudiences;
            return this;
        }
        public Builder boundAudiences(String... boundAudiences) {
            return boundAudiences(List.of(boundAudiences));
        }
        @CustomType.Setter
        public Builder boundIssuers(@Nullable List<String> boundIssuers) {

            this.boundIssuers = boundIssuers;
            return this;
        }
        public Builder boundIssuers(String... boundIssuers) {
            return boundIssuers(List.of(boundIssuers));
        }
        @CustomType.Setter
        public Builder claimMappings(@Nullable Map<String,String> claimMappings) {

            this.claimMappings = claimMappings;
            return this;
        }
        @CustomType.Setter
        public Builder clockSkewLeeway(@Nullable String clockSkewLeeway) {

            this.clockSkewLeeway = clockSkewLeeway;
            return this;
        }
        @CustomType.Setter
        public Builder discoveryCaPems(@Nullable List<String> discoveryCaPems) {

            this.discoveryCaPems = discoveryCaPems;
            return this;
        }
        public Builder discoveryCaPems(String... discoveryCaPems) {
            return discoveryCaPems(List.of(discoveryCaPems));
        }
        @CustomType.Setter
        public Builder expirationLeeway(@Nullable String expirationLeeway) {

            this.expirationLeeway = expirationLeeway;
            return this;
        }
        @CustomType.Setter
        public Builder jwksCaCert(@Nullable String jwksCaCert) {

            this.jwksCaCert = jwksCaCert;
            return this;
        }
        @CustomType.Setter
        public Builder jwksUrl(@Nullable String jwksUrl) {

            this.jwksUrl = jwksUrl;
            return this;
        }
        @CustomType.Setter
        public Builder jwtValidationPubKeys(@Nullable List<String> jwtValidationPubKeys) {

            this.jwtValidationPubKeys = jwtValidationPubKeys;
            return this;
        }
        public Builder jwtValidationPubKeys(String... jwtValidationPubKeys) {
            return jwtValidationPubKeys(List.of(jwtValidationPubKeys));
        }
        @CustomType.Setter
        public Builder listClaimMappings(@Nullable Map<String,String> listClaimMappings) {

            this.listClaimMappings = listClaimMappings;
            return this;
        }
        @CustomType.Setter
        public Builder notBeforeLeeway(@Nullable String notBeforeLeeway) {

            this.notBeforeLeeway = notBeforeLeeway;
            return this;
        }
        @CustomType.Setter
        public Builder oidcClientId(@Nullable String oidcClientId) {

            this.oidcClientId = oidcClientId;
            return this;
        }
        @CustomType.Setter
        public Builder oidcClientSecret(@Nullable String oidcClientSecret) {

            this.oidcClientSecret = oidcClientSecret;
            return this;
        }
        @CustomType.Setter
        public Builder oidcDisableUserinfo(@Nullable Boolean oidcDisableUserinfo) {

            this.oidcDisableUserinfo = oidcDisableUserinfo;
            return this;
        }
        @CustomType.Setter
        public Builder oidcDiscoveryUrl(@Nullable String oidcDiscoveryUrl) {

            this.oidcDiscoveryUrl = oidcDiscoveryUrl;
            return this;
        }
        @CustomType.Setter
        public Builder oidcScopes(@Nullable List<String> oidcScopes) {

            this.oidcScopes = oidcScopes;
            return this;
        }
        public Builder oidcScopes(String... oidcScopes) {
            return oidcScopes(List.of(oidcScopes));
        }
        @CustomType.Setter
        public Builder signingAlgs(@Nullable List<String> signingAlgs) {

            this.signingAlgs = signingAlgs;
            return this;
        }
        public Builder signingAlgs(String... signingAlgs) {
            return signingAlgs(List.of(signingAlgs));
        }
        public AclAuthMethodConfig build() {
            final var _resultValue = new AclAuthMethodConfig();
            _resultValue.allowedRedirectUris = allowedRedirectUris;
            _resultValue.boundAudiences = boundAudiences;
            _resultValue.boundIssuers = boundIssuers;
            _resultValue.claimMappings = claimMappings;
            _resultValue.clockSkewLeeway = clockSkewLeeway;
            _resultValue.discoveryCaPems = discoveryCaPems;
            _resultValue.expirationLeeway = expirationLeeway;
            _resultValue.jwksCaCert = jwksCaCert;
            _resultValue.jwksUrl = jwksUrl;
            _resultValue.jwtValidationPubKeys = jwtValidationPubKeys;
            _resultValue.listClaimMappings = listClaimMappings;
            _resultValue.notBeforeLeeway = notBeforeLeeway;
            _resultValue.oidcClientId = oidcClientId;
            _resultValue.oidcClientSecret = oidcClientSecret;
            _resultValue.oidcDisableUserinfo = oidcDisableUserinfo;
            _resultValue.oidcDiscoveryUrl = oidcDiscoveryUrl;
            _resultValue.oidcScopes = oidcScopes;
            _resultValue.signingAlgs = signingAlgs;
            return _resultValue;
        }
    }
}
