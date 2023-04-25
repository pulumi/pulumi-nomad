// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AclAuthMethodConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final AclAuthMethodConfigArgs Empty = new AclAuthMethodConfigArgs();

    @Import(name="allowedRedirectUris", required=true)
    private Output<List<String>> allowedRedirectUris;

    public Output<List<String>> allowedRedirectUris() {
        return this.allowedRedirectUris;
    }

    @Import(name="boundAudiences")
    private @Nullable Output<List<String>> boundAudiences;

    public Optional<Output<List<String>>> boundAudiences() {
        return Optional.ofNullable(this.boundAudiences);
    }

    @Import(name="claimMappings")
    private @Nullable Output<Map<String,String>> claimMappings;

    public Optional<Output<Map<String,String>>> claimMappings() {
        return Optional.ofNullable(this.claimMappings);
    }

    @Import(name="discoveryCaPems")
    private @Nullable Output<List<String>> discoveryCaPems;

    public Optional<Output<List<String>>> discoveryCaPems() {
        return Optional.ofNullable(this.discoveryCaPems);
    }

    @Import(name="listClaimMappings")
    private @Nullable Output<Map<String,String>> listClaimMappings;

    public Optional<Output<Map<String,String>>> listClaimMappings() {
        return Optional.ofNullable(this.listClaimMappings);
    }

    @Import(name="oidcClientId", required=true)
    private Output<String> oidcClientId;

    public Output<String> oidcClientId() {
        return this.oidcClientId;
    }

    @Import(name="oidcClientSecret", required=true)
    private Output<String> oidcClientSecret;

    public Output<String> oidcClientSecret() {
        return this.oidcClientSecret;
    }

    @Import(name="oidcDiscoveryUrl", required=true)
    private Output<String> oidcDiscoveryUrl;

    public Output<String> oidcDiscoveryUrl() {
        return this.oidcDiscoveryUrl;
    }

    @Import(name="oidcScopes")
    private @Nullable Output<List<String>> oidcScopes;

    public Optional<Output<List<String>>> oidcScopes() {
        return Optional.ofNullable(this.oidcScopes);
    }

    @Import(name="signingAlgs")
    private @Nullable Output<List<String>> signingAlgs;

    public Optional<Output<List<String>>> signingAlgs() {
        return Optional.ofNullable(this.signingAlgs);
    }

    private AclAuthMethodConfigArgs() {}

    private AclAuthMethodConfigArgs(AclAuthMethodConfigArgs $) {
        this.allowedRedirectUris = $.allowedRedirectUris;
        this.boundAudiences = $.boundAudiences;
        this.claimMappings = $.claimMappings;
        this.discoveryCaPems = $.discoveryCaPems;
        this.listClaimMappings = $.listClaimMappings;
        this.oidcClientId = $.oidcClientId;
        this.oidcClientSecret = $.oidcClientSecret;
        this.oidcDiscoveryUrl = $.oidcDiscoveryUrl;
        this.oidcScopes = $.oidcScopes;
        this.signingAlgs = $.signingAlgs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AclAuthMethodConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AclAuthMethodConfigArgs $;

        public Builder() {
            $ = new AclAuthMethodConfigArgs();
        }

        public Builder(AclAuthMethodConfigArgs defaults) {
            $ = new AclAuthMethodConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowedRedirectUris(Output<List<String>> allowedRedirectUris) {
            $.allowedRedirectUris = allowedRedirectUris;
            return this;
        }

        public Builder allowedRedirectUris(List<String> allowedRedirectUris) {
            return allowedRedirectUris(Output.of(allowedRedirectUris));
        }

        public Builder allowedRedirectUris(String... allowedRedirectUris) {
            return allowedRedirectUris(List.of(allowedRedirectUris));
        }

        public Builder boundAudiences(@Nullable Output<List<String>> boundAudiences) {
            $.boundAudiences = boundAudiences;
            return this;
        }

        public Builder boundAudiences(List<String> boundAudiences) {
            return boundAudiences(Output.of(boundAudiences));
        }

        public Builder boundAudiences(String... boundAudiences) {
            return boundAudiences(List.of(boundAudiences));
        }

        public Builder claimMappings(@Nullable Output<Map<String,String>> claimMappings) {
            $.claimMappings = claimMappings;
            return this;
        }

        public Builder claimMappings(Map<String,String> claimMappings) {
            return claimMappings(Output.of(claimMappings));
        }

        public Builder discoveryCaPems(@Nullable Output<List<String>> discoveryCaPems) {
            $.discoveryCaPems = discoveryCaPems;
            return this;
        }

        public Builder discoveryCaPems(List<String> discoveryCaPems) {
            return discoveryCaPems(Output.of(discoveryCaPems));
        }

        public Builder discoveryCaPems(String... discoveryCaPems) {
            return discoveryCaPems(List.of(discoveryCaPems));
        }

        public Builder listClaimMappings(@Nullable Output<Map<String,String>> listClaimMappings) {
            $.listClaimMappings = listClaimMappings;
            return this;
        }

        public Builder listClaimMappings(Map<String,String> listClaimMappings) {
            return listClaimMappings(Output.of(listClaimMappings));
        }

        public Builder oidcClientId(Output<String> oidcClientId) {
            $.oidcClientId = oidcClientId;
            return this;
        }

        public Builder oidcClientId(String oidcClientId) {
            return oidcClientId(Output.of(oidcClientId));
        }

        public Builder oidcClientSecret(Output<String> oidcClientSecret) {
            $.oidcClientSecret = oidcClientSecret;
            return this;
        }

        public Builder oidcClientSecret(String oidcClientSecret) {
            return oidcClientSecret(Output.of(oidcClientSecret));
        }

        public Builder oidcDiscoveryUrl(Output<String> oidcDiscoveryUrl) {
            $.oidcDiscoveryUrl = oidcDiscoveryUrl;
            return this;
        }

        public Builder oidcDiscoveryUrl(String oidcDiscoveryUrl) {
            return oidcDiscoveryUrl(Output.of(oidcDiscoveryUrl));
        }

        public Builder oidcScopes(@Nullable Output<List<String>> oidcScopes) {
            $.oidcScopes = oidcScopes;
            return this;
        }

        public Builder oidcScopes(List<String> oidcScopes) {
            return oidcScopes(Output.of(oidcScopes));
        }

        public Builder oidcScopes(String... oidcScopes) {
            return oidcScopes(List.of(oidcScopes));
        }

        public Builder signingAlgs(@Nullable Output<List<String>> signingAlgs) {
            $.signingAlgs = signingAlgs;
            return this;
        }

        public Builder signingAlgs(List<String> signingAlgs) {
            return signingAlgs(Output.of(signingAlgs));
        }

        public Builder signingAlgs(String... signingAlgs) {
            return signingAlgs(List.of(signingAlgs));
        }

        public AclAuthMethodConfigArgs build() {
            $.allowedRedirectUris = Objects.requireNonNull($.allowedRedirectUris, "expected parameter 'allowedRedirectUris' to be non-null");
            $.oidcClientId = Objects.requireNonNull($.oidcClientId, "expected parameter 'oidcClientId' to be non-null");
            $.oidcClientSecret = Objects.requireNonNull($.oidcClientSecret, "expected parameter 'oidcClientSecret' to be non-null");
            $.oidcDiscoveryUrl = Objects.requireNonNull($.oidcDiscoveryUrl, "expected parameter 'oidcDiscoveryUrl' to be non-null");
            return $;
        }
    }

}
