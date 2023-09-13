// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.nomad.outputs.CsiVolumeTopologyRequestPreferred;
import com.pulumi.nomad.outputs.CsiVolumeTopologyRequestRequired;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CsiVolumeTopologyRequest {
    /**
     * @return `(``Topology``: &lt;optional&gt;)` - Preferred topologies indicate that the volume should be created in a location accessible from some of the listed topologies.
     * 
     */
    private @Nullable CsiVolumeTopologyRequestPreferred preferred;
    /**
     * @return `(``Topology``: &lt;optional&gt;)` - Required topologies indicate that the volume must be created in a location accessible from all the listed topologies.
     * 
     */
    private @Nullable CsiVolumeTopologyRequestRequired required;

    private CsiVolumeTopologyRequest() {}
    /**
     * @return `(``Topology``: &lt;optional&gt;)` - Preferred topologies indicate that the volume should be created in a location accessible from some of the listed topologies.
     * 
     */
    public Optional<CsiVolumeTopologyRequestPreferred> preferred() {
        return Optional.ofNullable(this.preferred);
    }
    /**
     * @return `(``Topology``: &lt;optional&gt;)` - Required topologies indicate that the volume must be created in a location accessible from all the listed topologies.
     * 
     */
    public Optional<CsiVolumeTopologyRequestRequired> required() {
        return Optional.ofNullable(this.required);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CsiVolumeTopologyRequest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable CsiVolumeTopologyRequestPreferred preferred;
        private @Nullable CsiVolumeTopologyRequestRequired required;
        public Builder() {}
        public Builder(CsiVolumeTopologyRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preferred = defaults.preferred;
    	      this.required = defaults.required;
        }

        @CustomType.Setter
        public Builder preferred(@Nullable CsiVolumeTopologyRequestPreferred preferred) {
            this.preferred = preferred;
            return this;
        }
        @CustomType.Setter
        public Builder required(@Nullable CsiVolumeTopologyRequestRequired required) {
            this.required = required;
            return this;
        }
        public CsiVolumeTopologyRequest build() {
            final var o = new CsiVolumeTopologyRequest();
            o.preferred = preferred;
            o.required = required;
            return o;
        }
    }
}
