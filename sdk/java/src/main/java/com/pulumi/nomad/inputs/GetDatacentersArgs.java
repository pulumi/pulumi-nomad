// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDatacentersArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatacentersArgs Empty = new GetDatacentersArgs();

    /**
     * `(bool: false)`: An optional flag that, if set to `true` will ignore down nodes when compiling the list of datacenters.
     * 
     */
    @Import(name="ignoreDownNodes")
    private @Nullable Output<Boolean> ignoreDownNodes;

    /**
     * @return `(bool: false)`: An optional flag that, if set to `true` will ignore down nodes when compiling the list of datacenters.
     * 
     */
    public Optional<Output<Boolean>> ignoreDownNodes() {
        return Optional.ofNullable(this.ignoreDownNodes);
    }

    /**
     * `(string)`: An optional string to filter datacenters based on name prefix. If not provided, all datacenters are returned.
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    /**
     * @return `(string)`: An optional string to filter datacenters based on name prefix. If not provided, all datacenters are returned.
     * 
     */
    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    private GetDatacentersArgs() {}

    private GetDatacentersArgs(GetDatacentersArgs $) {
        this.ignoreDownNodes = $.ignoreDownNodes;
        this.prefix = $.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatacentersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatacentersArgs $;

        public Builder() {
            $ = new GetDatacentersArgs();
        }

        public Builder(GetDatacentersArgs defaults) {
            $ = new GetDatacentersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ignoreDownNodes `(bool: false)`: An optional flag that, if set to `true` will ignore down nodes when compiling the list of datacenters.
         * 
         * @return builder
         * 
         */
        public Builder ignoreDownNodes(@Nullable Output<Boolean> ignoreDownNodes) {
            $.ignoreDownNodes = ignoreDownNodes;
            return this;
        }

        /**
         * @param ignoreDownNodes `(bool: false)`: An optional flag that, if set to `true` will ignore down nodes when compiling the list of datacenters.
         * 
         * @return builder
         * 
         */
        public Builder ignoreDownNodes(Boolean ignoreDownNodes) {
            return ignoreDownNodes(Output.of(ignoreDownNodes));
        }

        /**
         * @param prefix `(string)`: An optional string to filter datacenters based on name prefix. If not provided, all datacenters are returned.
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix `(string)`: An optional string to filter datacenters based on name prefix. If not provided, all datacenters are returned.
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        public GetDatacentersArgs build() {
            return $;
        }
    }

}
