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

    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    @Import(name="nodeId")
    private @Nullable Output<String> nodeId;

    public Optional<Output<String>> nodeId() {
        return Optional.ofNullable(this.nodeId);
    }

    @Import(name="pluginId")
    private @Nullable Output<String> pluginId;

    public Optional<Output<String>> pluginId() {
        return Optional.ofNullable(this.pluginId);
    }

    @Import(name="type")
    private @Nullable Output<String> type;

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

        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public Builder nodeId(@Nullable Output<String> nodeId) {
            $.nodeId = nodeId;
            return this;
        }

        public Builder nodeId(String nodeId) {
            return nodeId(Output.of(nodeId));
        }

        public Builder pluginId(@Nullable Output<String> pluginId) {
            $.pluginId = pluginId;
            return this;
        }

        public Builder pluginId(String pluginId) {
            return pluginId(Output.of(pluginId));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public GetVolumesArgs build() {
            return $;
        }
    }

}