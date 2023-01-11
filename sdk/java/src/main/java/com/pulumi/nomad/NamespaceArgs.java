// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NamespaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final NamespaceArgs Empty = new NamespaceArgs();

    /**
     * `(string: &#34;&#34;)` - A description of the namespace.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return `(string: &#34;&#34;)` - A description of the namespace.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * `(string: &lt;required&gt;)` - A unique name for the namespace.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return `(string: &lt;required&gt;)` - A unique name for the namespace.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * `(string: &#34;&#34;)` - A resource quota to attach to the namespace.
     * 
     */
    @Import(name="quota")
    private @Nullable Output<String> quota;

    /**
     * @return `(string: &#34;&#34;)` - A resource quota to attach to the namespace.
     * 
     */
    public Optional<Output<String>> quota() {
        return Optional.ofNullable(this.quota);
    }

    private NamespaceArgs() {}

    private NamespaceArgs(NamespaceArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.quota = $.quota;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NamespaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NamespaceArgs $;

        public Builder() {
            $ = new NamespaceArgs();
        }

        public Builder(NamespaceArgs defaults) {
            $ = new NamespaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description `(string: &#34;&#34;)` - A description of the namespace.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description `(string: &#34;&#34;)` - A description of the namespace.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name `(string: &lt;required&gt;)` - A unique name for the namespace.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name `(string: &lt;required&gt;)` - A unique name for the namespace.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param quota `(string: &#34;&#34;)` - A resource quota to attach to the namespace.
         * 
         * @return builder
         * 
         */
        public Builder quota(@Nullable Output<String> quota) {
            $.quota = quota;
            return this;
        }

        /**
         * @param quota `(string: &#34;&#34;)` - A resource quota to attach to the namespace.
         * 
         * @return builder
         * 
         */
        public Builder quota(String quota) {
            return quota(Output.of(quota));
        }

        public NamespaceArgs build() {
            return $;
        }
    }

}