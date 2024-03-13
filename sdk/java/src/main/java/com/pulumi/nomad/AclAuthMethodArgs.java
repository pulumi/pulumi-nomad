// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.nomad.inputs.AclAuthMethodConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AclAuthMethodArgs extends com.pulumi.resources.ResourceArgs {

    public static final AclAuthMethodArgs Empty = new AclAuthMethodArgs();

    /**
     * `(block: &lt;required&gt;)` - Configuration specific to the auth method
     * provider.
     * 
     */
    @Import(name="config", required=true)
    private Output<AclAuthMethodConfigArgs> config;

    /**
     * @return `(block: &lt;required&gt;)` - Configuration specific to the auth method
     * provider.
     * 
     */
    public Output<AclAuthMethodConfigArgs> config() {
        return this.config;
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
    @Import(name="maxTokenTtl", required=true)
    private Output<String> maxTokenTtl;

    /**
     * @return `(string: &lt;required&gt;)` - Defines the maximum life of a token
     * created by this method and is specified as a time duration such as &#34;15h&#34;.
     * 
     */
    public Output<String> maxTokenTtl() {
        return this.maxTokenTtl;
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
    @Import(name="tokenLocality", required=true)
    private Output<String> tokenLocality;

    /**
     * @return `(string: &lt;required&gt;)` - Defines whether the ACL Auth Method
     * creates a local or global token when performing SSO login. This field must be
     * set to either `local` or `global`.
     * 
     */
    public Output<String> tokenLocality() {
        return this.tokenLocality;
    }

    /**
     * `(string: &#34;${auth_method_type}-${auth_method_name}&#34;)` -
     * Defines the token name format for the generated tokens This can be lightly
     * templated using HIL &#39;${foo}&#39; syntax.
     * 
     */
    @Import(name="tokenNameFormat")
    private @Nullable Output<String> tokenNameFormat;

    /**
     * @return `(string: &#34;${auth_method_type}-${auth_method_name}&#34;)` -
     * Defines the token name format for the generated tokens This can be lightly
     * templated using HIL &#39;${foo}&#39; syntax.
     * 
     */
    public Optional<Output<String>> tokenNameFormat() {
        return Optional.ofNullable(this.tokenNameFormat);
    }

    /**
     * `(string: &lt;required&gt;)` - ACL Auth Method SSO workflow type. Currently,
     * the only supported type is `OIDC`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return `(string: &lt;required&gt;)` - ACL Auth Method SSO workflow type. Currently,
     * the only supported type is `OIDC`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private AclAuthMethodArgs() {}

    private AclAuthMethodArgs(AclAuthMethodArgs $) {
        this.config = $.config;
        this.default_ = $.default_;
        this.maxTokenTtl = $.maxTokenTtl;
        this.name = $.name;
        this.tokenLocality = $.tokenLocality;
        this.tokenNameFormat = $.tokenNameFormat;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AclAuthMethodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AclAuthMethodArgs $;

        public Builder() {
            $ = new AclAuthMethodArgs();
        }

        public Builder(AclAuthMethodArgs defaults) {
            $ = new AclAuthMethodArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param config `(block: &lt;required&gt;)` - Configuration specific to the auth method
         * provider.
         * 
         * @return builder
         * 
         */
        public Builder config(Output<AclAuthMethodConfigArgs> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config `(block: &lt;required&gt;)` - Configuration specific to the auth method
         * provider.
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
        public Builder maxTokenTtl(Output<String> maxTokenTtl) {
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
        public Builder tokenLocality(Output<String> tokenLocality) {
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
         * @param tokenNameFormat `(string: &#34;${auth_method_type}-${auth_method_name}&#34;)` -
         * Defines the token name format for the generated tokens This can be lightly
         * templated using HIL &#39;${foo}&#39; syntax.
         * 
         * @return builder
         * 
         */
        public Builder tokenNameFormat(@Nullable Output<String> tokenNameFormat) {
            $.tokenNameFormat = tokenNameFormat;
            return this;
        }

        /**
         * @param tokenNameFormat `(string: &#34;${auth_method_type}-${auth_method_name}&#34;)` -
         * Defines the token name format for the generated tokens This can be lightly
         * templated using HIL &#39;${foo}&#39; syntax.
         * 
         * @return builder
         * 
         */
        public Builder tokenNameFormat(String tokenNameFormat) {
            return tokenNameFormat(Output.of(tokenNameFormat));
        }

        /**
         * @param type `(string: &lt;required&gt;)` - ACL Auth Method SSO workflow type. Currently,
         * the only supported type is `OIDC`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
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

        public AclAuthMethodArgs build() {
            if ($.config == null) {
                throw new MissingRequiredPropertyException("AclAuthMethodArgs", "config");
            }
            if ($.maxTokenTtl == null) {
                throw new MissingRequiredPropertyException("AclAuthMethodArgs", "maxTokenTtl");
            }
            if ($.tokenLocality == null) {
                throw new MissingRequiredPropertyException("AclAuthMethodArgs", "tokenLocality");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("AclAuthMethodArgs", "type");
            }
            return $;
        }
    }

}
