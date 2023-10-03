// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.nomad.outputs.VolumeTopologyRequestRequiredTopology;
import java.util.List;
import java.util.Objects;

@CustomType
public final class VolumeTopologyRequestRequired {
    /**
     * @return `(List of segments: &lt;required&gt;)` - Defines the location for the volume.
     * 
     */
    private List<VolumeTopologyRequestRequiredTopology> topologies;

    private VolumeTopologyRequestRequired() {}
    /**
     * @return `(List of segments: &lt;required&gt;)` - Defines the location for the volume.
     * 
     */
    public List<VolumeTopologyRequestRequiredTopology> topologies() {
        return this.topologies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeTopologyRequestRequired defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<VolumeTopologyRequestRequiredTopology> topologies;
        public Builder() {}
        public Builder(VolumeTopologyRequestRequired defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.topologies = defaults.topologies;
        }

        @CustomType.Setter
        public Builder topologies(List<VolumeTopologyRequestRequiredTopology> topologies) {
            this.topologies = Objects.requireNonNull(topologies);
            return this;
        }
        public Builder topologies(VolumeTopologyRequestRequiredTopology... topologies) {
            return topologies(List.of(topologies));
        }
        public VolumeTopologyRequestRequired build() {
            final var o = new VolumeTopologyRequestRequired();
            o.topologies = topologies;
            return o;
        }
    }
}
