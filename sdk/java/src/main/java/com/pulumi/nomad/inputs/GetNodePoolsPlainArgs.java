// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNodePoolsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNodePoolsPlainArgs Empty = new GetNodePoolsPlainArgs();

    @Import(name="filter")
    private @Nullable String filter;

    public Optional<String> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * `(string)` - Specifies a string to filter node pools based on a name
     * prefix.
     * 
     */
    @Import(name="prefix")
    private @Nullable String prefix;

    /**
     * @return `(string)` - Specifies a string to filter node pools based on a name
     * prefix.
     * 
     */
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    private GetNodePoolsPlainArgs() {}

    private GetNodePoolsPlainArgs(GetNodePoolsPlainArgs $) {
        this.filter = $.filter;
        this.prefix = $.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNodePoolsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNodePoolsPlainArgs $;

        public Builder() {
            $ = new GetNodePoolsPlainArgs();
        }

        public Builder(GetNodePoolsPlainArgs defaults) {
            $ = new GetNodePoolsPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder filter(@Nullable String filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param prefix `(string)` - Specifies a string to filter node pools based on a name
         * prefix.
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable String prefix) {
            $.prefix = prefix;
            return this;
        }

        public GetNodePoolsPlainArgs build() {
            return $;
        }
    }

}
