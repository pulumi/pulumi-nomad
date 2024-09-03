// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAllocationsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAllocationsPlainArgs Empty = new GetAllocationsPlainArgs();

    @Import(name="filter")
    private @Nullable String filter;

    public Optional<String> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * `(string: &lt;optional&gt;)` - Specifies the namespace to search for
     * allocations in.
     * 
     */
    @Import(name="namespace")
    private @Nullable String namespace;

    /**
     * @return `(string: &lt;optional&gt;)` - Specifies the namespace to search for
     * allocations in.
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * `(string: &lt;optional&gt;)` - Specifies a string to filter allocations
     * based on an ID prefix.
     * 
     */
    @Import(name="prefix")
    private @Nullable String prefix;

    /**
     * @return `(string: &lt;optional&gt;)` - Specifies a string to filter allocations
     * based on an ID prefix.
     * 
     */
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    private GetAllocationsPlainArgs() {}

    private GetAllocationsPlainArgs(GetAllocationsPlainArgs $) {
        this.filter = $.filter;
        this.namespace = $.namespace;
        this.prefix = $.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAllocationsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAllocationsPlainArgs $;

        public Builder() {
            $ = new GetAllocationsPlainArgs();
        }

        public Builder(GetAllocationsPlainArgs defaults) {
            $ = new GetAllocationsPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder filter(@Nullable String filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param namespace `(string: &lt;optional&gt;)` - Specifies the namespace to search for
         * allocations in.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable String namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param prefix `(string: &lt;optional&gt;)` - Specifies a string to filter allocations
         * based on an ID prefix.
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable String prefix) {
            $.prefix = prefix;
            return this;
        }

        public GetAllocationsPlainArgs build() {
            return $;
        }
    }

}
