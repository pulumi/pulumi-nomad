// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.nomad.inputs.VolumeTopologyRequestRequiredTopologyArgs;
import java.util.List;
import java.util.Objects;


public final class VolumeTopologyRequestRequiredArgs extends com.pulumi.resources.ResourceArgs {

    public static final VolumeTopologyRequestRequiredArgs Empty = new VolumeTopologyRequestRequiredArgs();

    @Import(name="topologies", required=true)
    private Output<List<VolumeTopologyRequestRequiredTopologyArgs>> topologies;

    public Output<List<VolumeTopologyRequestRequiredTopologyArgs>> topologies() {
        return this.topologies;
    }

    private VolumeTopologyRequestRequiredArgs() {}

    private VolumeTopologyRequestRequiredArgs(VolumeTopologyRequestRequiredArgs $) {
        this.topologies = $.topologies;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumeTopologyRequestRequiredArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumeTopologyRequestRequiredArgs $;

        public Builder() {
            $ = new VolumeTopologyRequestRequiredArgs();
        }

        public Builder(VolumeTopologyRequestRequiredArgs defaults) {
            $ = new VolumeTopologyRequestRequiredArgs(Objects.requireNonNull(defaults));
        }

        public Builder topologies(Output<List<VolumeTopologyRequestRequiredTopologyArgs>> topologies) {
            $.topologies = topologies;
            return this;
        }

        public Builder topologies(List<VolumeTopologyRequestRequiredTopologyArgs> topologies) {
            return topologies(Output.of(topologies));
        }

        public Builder topologies(VolumeTopologyRequestRequiredTopologyArgs... topologies) {
            return topologies(List.of(topologies));
        }

        public VolumeTopologyRequestRequiredArgs build() {
            $.topologies = Objects.requireNonNull($.topologies, "expected parameter 'topologies' to be non-null");
            return $;
        }
    }

}
