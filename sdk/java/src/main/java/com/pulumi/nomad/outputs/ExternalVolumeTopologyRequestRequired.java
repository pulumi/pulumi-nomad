// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.nomad.outputs.ExternalVolumeTopologyRequestRequiredTopology;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ExternalVolumeTopologyRequestRequired {
    /**
     * @return `(List of segments: &lt;required&gt;)` - Defines the location for the volume.
     * 
     */
    private List<ExternalVolumeTopologyRequestRequiredTopology> topologies;

    private ExternalVolumeTopologyRequestRequired() {}
    /**
     * @return `(List of segments: &lt;required&gt;)` - Defines the location for the volume.
     * 
     */
    public List<ExternalVolumeTopologyRequestRequiredTopology> topologies() {
        return this.topologies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalVolumeTopologyRequestRequired defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<ExternalVolumeTopologyRequestRequiredTopology> topologies;
        public Builder() {}
        public Builder(ExternalVolumeTopologyRequestRequired defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.topologies = defaults.topologies;
        }

        @CustomType.Setter
        public Builder topologies(List<ExternalVolumeTopologyRequestRequiredTopology> topologies) {
            this.topologies = Objects.requireNonNull(topologies);
            return this;
        }
        public Builder topologies(ExternalVolumeTopologyRequestRequiredTopology... topologies) {
            return topologies(List.of(topologies));
        }
        public ExternalVolumeTopologyRequestRequired build() {
            final var _resultValue = new ExternalVolumeTopologyRequestRequired();
            _resultValue.topologies = topologies;
            return _resultValue;
        }
    }
}
