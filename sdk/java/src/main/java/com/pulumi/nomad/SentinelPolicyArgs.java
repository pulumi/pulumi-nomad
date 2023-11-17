// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SentinelPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final SentinelPolicyArgs Empty = new SentinelPolicyArgs();

    /**
     * `(string: &#34;&#34;)` - A description of the policy.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return `(string: &#34;&#34;)` - A description of the policy.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * `(strings: &lt;required&gt;)` - The [enforcement level][enforcement-level]
     * for this policy.
     * 
     */
    @Import(name="enforcementLevel", required=true)
    private Output<String> enforcementLevel;

    /**
     * @return `(strings: &lt;required&gt;)` - The [enforcement level][enforcement-level]
     * for this policy.
     * 
     */
    public Output<String> enforcementLevel() {
        return this.enforcementLevel;
    }

    /**
     * `(string: &lt;required&gt;)` - A unique name for the policy.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return `(string: &lt;required&gt;)` - A unique name for the policy.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * `(string: &lt;required&gt;)` - The contents of the policy to register.
     * 
     */
    @Import(name="policy", required=true)
    private Output<String> policy;

    /**
     * @return `(string: &lt;required&gt;)` - The contents of the policy to register.
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }

    /**
     * `(strings: &lt;required&gt;)` - The [scope][scope] for this policy.
     * 
     */
    @Import(name="scope", required=true)
    private Output<String> scope;

    /**
     * @return `(strings: &lt;required&gt;)` - The [scope][scope] for this policy.
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }

    private SentinelPolicyArgs() {}

    private SentinelPolicyArgs(SentinelPolicyArgs $) {
        this.description = $.description;
        this.enforcementLevel = $.enforcementLevel;
        this.name = $.name;
        this.policy = $.policy;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SentinelPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SentinelPolicyArgs $;

        public Builder() {
            $ = new SentinelPolicyArgs();
        }

        public Builder(SentinelPolicyArgs defaults) {
            $ = new SentinelPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description `(string: &#34;&#34;)` - A description of the policy.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description `(string: &#34;&#34;)` - A description of the policy.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enforcementLevel `(strings: &lt;required&gt;)` - The [enforcement level][enforcement-level]
         * for this policy.
         * 
         * @return builder
         * 
         */
        public Builder enforcementLevel(Output<String> enforcementLevel) {
            $.enforcementLevel = enforcementLevel;
            return this;
        }

        /**
         * @param enforcementLevel `(strings: &lt;required&gt;)` - The [enforcement level][enforcement-level]
         * for this policy.
         * 
         * @return builder
         * 
         */
        public Builder enforcementLevel(String enforcementLevel) {
            return enforcementLevel(Output.of(enforcementLevel));
        }

        /**
         * @param name `(string: &lt;required&gt;)` - A unique name for the policy.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name `(string: &lt;required&gt;)` - A unique name for the policy.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param policy `(string: &lt;required&gt;)` - The contents of the policy to register.
         * 
         * @return builder
         * 
         */
        public Builder policy(Output<String> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy `(string: &lt;required&gt;)` - The contents of the policy to register.
         * 
         * @return builder
         * 
         */
        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        /**
         * @param scope `(strings: &lt;required&gt;)` - The [scope][scope] for this policy.
         * 
         * @return builder
         * 
         */
        public Builder scope(Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope `(strings: &lt;required&gt;)` - The [scope][scope] for this policy.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public SentinelPolicyArgs build() {
            $.enforcementLevel = Objects.requireNonNull($.enforcementLevel, "expected parameter 'enforcementLevel' to be non-null");
            $.policy = Objects.requireNonNull($.policy, "expected parameter 'policy' to be non-null");
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}
