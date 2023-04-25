// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AclBindingRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final AclBindingRuleArgs Empty = new AclBindingRuleArgs();

    /**
     * `(string: &lt;required&gt;)` - Name of the auth method for which this
     * rule applies to.
     * 
     */
    @Import(name="authMethod", required=true)
    private Output<String> authMethod;

    /**
     * @return `(string: &lt;required&gt;)` - Name of the auth method for which this
     * rule applies to.
     * 
     */
    public Output<String> authMethod() {
        return this.authMethod;
    }

    /**
     * `(string: &#34;&#34;)` - Target of the binding.
     * 
     */
    @Import(name="bindName", required=true)
    private Output<String> bindName;

    /**
     * @return `(string: &#34;&#34;)` - Target of the binding.
     * 
     */
    public Output<String> bindName() {
        return this.bindName;
    }

    /**
     * `(string: &lt;required&gt;)` - Adjusts how this binding rule is applied
     * at login time. Valid values are `role`, `policy`, and `management`.
     * 
     */
    @Import(name="bindType", required=true)
    private Output<String> bindType;

    /**
     * @return `(string: &lt;required&gt;)` - Adjusts how this binding rule is applied
     * at login time. Valid values are `role`, `policy`, and `management`.
     * 
     */
    public Output<String> bindType() {
        return this.bindType;
    }

    /**
     * `(string: &#34;&#34;)` - Description for this ACL binding rule.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return `(string: &#34;&#34;)` - Description for this ACL binding rule.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * `(string: &#34;&#34;)` - A boolean expression that matches against verified
     * identity attributes returned from the auth method during login.
     * 
     */
    @Import(name="selector")
    private @Nullable Output<String> selector;

    /**
     * @return `(string: &#34;&#34;)` - A boolean expression that matches against verified
     * identity attributes returned from the auth method during login.
     * 
     */
    public Optional<Output<String>> selector() {
        return Optional.ofNullable(this.selector);
    }

    private AclBindingRuleArgs() {}

    private AclBindingRuleArgs(AclBindingRuleArgs $) {
        this.authMethod = $.authMethod;
        this.bindName = $.bindName;
        this.bindType = $.bindType;
        this.description = $.description;
        this.selector = $.selector;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AclBindingRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AclBindingRuleArgs $;

        public Builder() {
            $ = new AclBindingRuleArgs();
        }

        public Builder(AclBindingRuleArgs defaults) {
            $ = new AclBindingRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authMethod `(string: &lt;required&gt;)` - Name of the auth method for which this
         * rule applies to.
         * 
         * @return builder
         * 
         */
        public Builder authMethod(Output<String> authMethod) {
            $.authMethod = authMethod;
            return this;
        }

        /**
         * @param authMethod `(string: &lt;required&gt;)` - Name of the auth method for which this
         * rule applies to.
         * 
         * @return builder
         * 
         */
        public Builder authMethod(String authMethod) {
            return authMethod(Output.of(authMethod));
        }

        /**
         * @param bindName `(string: &#34;&#34;)` - Target of the binding.
         * 
         * @return builder
         * 
         */
        public Builder bindName(Output<String> bindName) {
            $.bindName = bindName;
            return this;
        }

        /**
         * @param bindName `(string: &#34;&#34;)` - Target of the binding.
         * 
         * @return builder
         * 
         */
        public Builder bindName(String bindName) {
            return bindName(Output.of(bindName));
        }

        /**
         * @param bindType `(string: &lt;required&gt;)` - Adjusts how this binding rule is applied
         * at login time. Valid values are `role`, `policy`, and `management`.
         * 
         * @return builder
         * 
         */
        public Builder bindType(Output<String> bindType) {
            $.bindType = bindType;
            return this;
        }

        /**
         * @param bindType `(string: &lt;required&gt;)` - Adjusts how this binding rule is applied
         * at login time. Valid values are `role`, `policy`, and `management`.
         * 
         * @return builder
         * 
         */
        public Builder bindType(String bindType) {
            return bindType(Output.of(bindType));
        }

        /**
         * @param description `(string: &#34;&#34;)` - Description for this ACL binding rule.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description `(string: &#34;&#34;)` - Description for this ACL binding rule.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param selector `(string: &#34;&#34;)` - A boolean expression that matches against verified
         * identity attributes returned from the auth method during login.
         * 
         * @return builder
         * 
         */
        public Builder selector(@Nullable Output<String> selector) {
            $.selector = selector;
            return this;
        }

        /**
         * @param selector `(string: &#34;&#34;)` - A boolean expression that matches against verified
         * identity attributes returned from the auth method during login.
         * 
         * @return builder
         * 
         */
        public Builder selector(String selector) {
            return selector(Output.of(selector));
        }

        public AclBindingRuleArgs build() {
            $.authMethod = Objects.requireNonNull($.authMethod, "expected parameter 'authMethod' to be non-null");
            $.bindName = Objects.requireNonNull($.bindName, "expected parameter 'bindName' to be non-null");
            $.bindType = Objects.requireNonNull($.bindType, "expected parameter 'bindType' to be non-null");
            return $;
        }
    }

}
