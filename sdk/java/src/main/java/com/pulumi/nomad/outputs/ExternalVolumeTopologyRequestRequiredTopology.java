// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class ExternalVolumeTopologyRequestRequiredTopology {
    private Map<String,String> segments;

    private ExternalVolumeTopologyRequestRequiredTopology() {}
    public Map<String,String> segments() {
        return this.segments;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalVolumeTopologyRequestRequiredTopology defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> segments;
        public Builder() {}
        public Builder(ExternalVolumeTopologyRequestRequiredTopology defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.segments = defaults.segments;
        }

        @CustomType.Setter
        public Builder segments(Map<String,String> segments) {
            this.segments = Objects.requireNonNull(segments);
            return this;
        }
        public ExternalVolumeTopologyRequestRequiredTopology build() {
            final var o = new ExternalVolumeTopologyRequestRequiredTopology();
            o.segments = segments;
            return o;
        }
    }
}
