// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.nomad.inputs.AclAuthMethodConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AclAuthMethodState extends com.pulumi.resources.ResourceArgs {

    public static final AclAuthMethodState Empty = new AclAuthMethodState();

    /**
     * Configuration specific to the auth method provider.
     * 
     */
    @Import(name="config")
    private @Nullable Output<AclAuthMethodConfigArgs> config;

    /**
     * @return Configuration specific to the auth method provider.
     * 
     */
    public Optional<Output<AclAuthMethodConfigArgs>> config() {
        return Optional.ofNullable(this.config);
    }

    /**
     * `(bool: false)` - Defines whether this ACL Auth Method is to be set
     * as default.
     * 
     */
    @Import(name="default")
    private @Nullable Output<Boolean> default_;

    /**
     * @return `(bool: false)` - Defines whether this ACL Auth Method is to be set
     * as default.
     * 
     */
    public Optional<Output<Boolean>> default_() {
        return Optional.ofNullable(this.default_);
    }

    /**
     * `(string: &lt;required&gt;)` - Defines the maximum life of a token
     * created by this method and is specified as a time duration such as &#34;15h&#34;.
     * 
     */
    @Import(name="maxTokenTtl")
    private @Nullable Output<String> maxTokenTtl;

    /**
     * @return `(string: &lt;required&gt;)` - Defines the maximum life of a token
     * created by this method and is specified as a time duration such as &#34;15h&#34;.
     * 
     */
    public Optional<Output<String>> maxTokenTtl() {
        return Optional.ofNullable(this.maxTokenTtl);
    }

    /**
     * `(string: &lt;required&gt;)` - The identifier of the ACL Auth Method.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return `(string: &lt;required&gt;)` - The identifier of the ACL Auth Method.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * `(string: &lt;required&gt;)` - Defines whether the ACL Auth Method
     * creates a local or global token when performing SSO login. This field must be
     * set to either `local` or `global`.
     * 
     */
    @Import(name="tokenLocality")
    private @Nullable Output<String> tokenLocality;

    /**
     * @return `(string: &lt;required&gt;)` - Defines whether the ACL Auth Method
     * creates a local or global token when performing SSO login. This field must be
     * set to either `local` or `global`.
     * 
     */
    public Optional<Output<String>> tokenLocality() {
        return Optional.ofNullable(this.tokenLocality);
    }

    /**
     * `(string: &lt;required&gt;)` - ACL Auth Method SSO workflow type. Currently,
     * the only supported type is `OIDC`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return `(string: &lt;required&gt;)` - ACL Auth Method SSO workflow type. Currently,
     * the only supported type is `OIDC`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private AclAuthMethodState() {}

    private AclAuthMethodState(AclAuthMethodState $) {
        this.config = $.config;
        this.default_ = $.default_;
        this.maxTokenTtl = $.maxTokenTtl;
        this.name = $.name;
        this.tokenLocality = $.tokenLocality;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AclAuthMethodState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AclAuthMethodState $;

        public Builder() {
            $ = new AclAuthMethodState();
        }

        public Builder(AclAuthMethodState defaults) {
            $ = new AclAuthMethodState(Objects.requireNonNull(defaults));
        }

        /**
         * @param config Configuration specific to the auth method provider.
         * 
         * @return builder
         * 
         */
        public Builder config(@Nullable Output<AclAuthMethodConfigArgs> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config Configuration specific to the auth method provider.
         * 
         * @return builder
         * 
         */
        public Builder config(AclAuthMethodConfigArgs config) {
            return config(Output.of(config));
        }

        /**
         * @param default_ `(bool: false)` - Defines whether this ACL Auth Method is to be set
         * as default.
         * 
         * @return builder
         * 
         */
        public Builder default_(@Nullable Output<Boolean> default_) {
            $.default_ = default_;
            return this;
        }

        /**
         * @param default_ `(bool: false)` - Defines whether this ACL Auth Method is to be set
         * as default.
         * 
         * @return builder
         * 
         */
        public Builder default_(Boolean default_) {
            return default_(Output.of(default_));
        }

        /**
         * @param maxTokenTtl `(string: &lt;required&gt;)` - Defines the maximum life of a token
         * created by this method and is specified as a time duration such as &#34;15h&#34;.
         * 
         * @return builder
         * 
         */
        public Builder maxTokenTtl(@Nullable Output<String> maxTokenTtl) {
            $.maxTokenTtl = maxTokenTtl;
            return this;
        }

        /**
         * @param maxTokenTtl `(string: &lt;required&gt;)` - Defines the maximum life of a token
         * created by this method and is specified as a time duration such as &#34;15h&#34;.
         * 
         * @return builder
         * 
         */
        public Builder maxTokenTtl(String maxTokenTtl) {
            return maxTokenTtl(Output.of(maxTokenTtl));
        }

        /**
         * @param name `(string: &lt;required&gt;)` - The identifier of the ACL Auth Method.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name `(string: &lt;required&gt;)` - The identifier of the ACL Auth Method.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tokenLocality `(string: &lt;required&gt;)` - Defines whether the ACL Auth Method
         * creates a local or global token when performing SSO login. This field must be
         * set to either `local` or `global`.
         * 
         * @return builder
         * 
         */
        public Builder tokenLocality(@Nullable Output<String> tokenLocality) {
            $.tokenLocality = tokenLocality;
            return this;
        }

        /**
         * @param tokenLocality `(string: &lt;required&gt;)` - Defines whether the ACL Auth Method
         * creates a local or global token when performing SSO login. This field must be
         * set to either `local` or `global`.
         * 
         * @return builder
         * 
         */
        public Builder tokenLocality(String tokenLocality) {
            return tokenLocality(Output.of(tokenLocality));
        }

        /**
         * @param type `(string: &lt;required&gt;)` - ACL Auth Method SSO workflow type. Currently,
         * the only supported type is `OIDC`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type `(string: &lt;required&gt;)` - ACL Auth Method SSO workflow type. Currently,
         * the only supported type is `OIDC`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AclAuthMethodState build() {
            return $;
        }
    }

}