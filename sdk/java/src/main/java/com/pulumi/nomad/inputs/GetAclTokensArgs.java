// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAclTokensArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAclTokensArgs Empty = new GetAclTokensArgs();

    /**
     * `(string)` Optional prefix to filter the tokens.
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    /**
     * @return `(string)` Optional prefix to filter the tokens.
     * 
     */
    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    private GetAclTokensArgs() {}

    private GetAclTokensArgs(GetAclTokensArgs $) {
        this.prefix = $.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAclTokensArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAclTokensArgs $;

        public Builder() {
            $ = new GetAclTokensArgs();
        }

        public Builder(GetAclTokensArgs defaults) {
            $ = new GetAclTokensArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param prefix `(string)` Optional prefix to filter the tokens.
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix `(string)` Optional prefix to filter the tokens.
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        public GetAclTokensArgs build() {
            return $;
        }
    }

}
