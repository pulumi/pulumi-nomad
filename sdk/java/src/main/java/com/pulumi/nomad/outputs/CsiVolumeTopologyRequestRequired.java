// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.nomad.outputs.CsiVolumeTopologyRequestRequiredTopology;
import java.util.List;
import java.util.Objects;

@CustomType
public final class CsiVolumeTopologyRequestRequired {
    /**
     * @return `(List of segments: &lt;required&gt;)` - Defines the location for the volume.
     * 
     */
    private List<CsiVolumeTopologyRequestRequiredTopology> topologies;

    private CsiVolumeTopologyRequestRequired() {}
    /**
     * @return `(List of segments: &lt;required&gt;)` - Defines the location for the volume.
     * 
     */
    public List<CsiVolumeTopologyRequestRequiredTopology> topologies() {
        return this.topologies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CsiVolumeTopologyRequestRequired defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<CsiVolumeTopologyRequestRequiredTopology> topologies;
        public Builder() {}
        public Builder(CsiVolumeTopologyRequestRequired defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.topologies = defaults.topologies;
        }

        @CustomType.Setter
        public Builder topologies(List<CsiVolumeTopologyRequestRequiredTopology> topologies) {
            this.topologies = Objects.requireNonNull(topologies);
            return this;
        }
        public Builder topologies(CsiVolumeTopologyRequestRequiredTopology... topologies) {
            return topologies(List.of(topologies));
        }
        public CsiVolumeTopologyRequestRequired build() {
            final var o = new CsiVolumeTopologyRequestRequired();
            o.topologies = topologies;
            return o;
        }
    }
}
