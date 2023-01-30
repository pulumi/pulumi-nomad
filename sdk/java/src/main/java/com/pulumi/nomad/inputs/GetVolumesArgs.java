// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVolumesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVolumesArgs Empty = new GetVolumesArgs();

    /**
     * `(string: &#34;default&#34;)` Nomad namespace.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return `(string: &#34;default&#34;)` Nomad namespace.
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * `(string: optional)` Volume node filter.
     * 
     */
    @Import(name="nodeId")
    private @Nullable Output<String> nodeId;

    /**
     * @return `(string: optional)` Volume node filter.
     * 
     */
    public Optional<Output<String>> nodeId() {
        return Optional.ofNullable(this.nodeId);
    }

    /**
     * `(string: optional)` Plugin ID filter.
     * 
     */
    @Import(name="pluginId")
    private @Nullable Output<String> pluginId;

    /**
     * @return `(string: optional)` Plugin ID filter.
     * 
     */
    public Optional<Output<String>> pluginId() {
        return Optional.ofNullable(this.pluginId);
    }

    /**
     * `(string: &#34;csi&#34;)` Volume type (currently only supports `csi`)
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return `(string: &#34;csi&#34;)` Volume type (currently only supports `csi`)
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private GetVolumesArgs() {}

    private GetVolumesArgs(GetVolumesArgs $) {
        this.namespace = $.namespace;
        this.nodeId = $.nodeId;
        this.pluginId = $.pluginId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVolumesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVolumesArgs $;

        public Builder() {
            $ = new GetVolumesArgs();
        }

        public Builder(GetVolumesArgs defaults) {
            $ = new GetVolumesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param namespace `(string: &#34;default&#34;)` Nomad namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace `(string: &#34;default&#34;)` Nomad namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param nodeId `(string: optional)` Volume node filter.
         * 
         * @return builder
         * 
         */
        public Builder nodeId(@Nullable Output<String> nodeId) {
            $.nodeId = nodeId;
            return this;
        }

        /**
         * @param nodeId `(string: optional)` Volume node filter.
         * 
         * @return builder
         * 
         */
        public Builder nodeId(String nodeId) {
            return nodeId(Output.of(nodeId));
        }

        /**
         * @param pluginId `(string: optional)` Plugin ID filter.
         * 
         * @return builder
         * 
         */
        public Builder pluginId(@Nullable Output<String> pluginId) {
            $.pluginId = pluginId;
            return this;
        }

        /**
         * @param pluginId `(string: optional)` Plugin ID filter.
         * 
         * @return builder
         * 
         */
        public Builder pluginId(String pluginId) {
            return pluginId(Output.of(pluginId));
        }

        /**
         * @param type `(string: &#34;csi&#34;)` Volume type (currently only supports `csi`)
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type `(string: &#34;csi&#34;)` Volume type (currently only supports `csi`)
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public GetVolumesArgs build() {
            return $;
        }
    }

}
