// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class ExternalVolumeTopologyRequestPreferredTopology {
    /**
     * @return `(map[string]string)` - Define the attributes for the topology request.
     * 
     * In addition to the above arguments, the following attributes are exported and
     * can be referenced:
     * 
     */
    private Map<String,String> segments;

    private ExternalVolumeTopologyRequestPreferredTopology() {}
    /**
     * @return `(map[string]string)` - Define the attributes for the topology request.
     * 
     * In addition to the above arguments, the following attributes are exported and
     * can be referenced:
     * 
     */
    public Map<String,String> segments() {
        return this.segments;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalVolumeTopologyRequestPreferredTopology defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> segments;
        public Builder() {}
        public Builder(ExternalVolumeTopologyRequestPreferredTopology defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.segments = defaults.segments;
        }

        @CustomType.Setter
        public Builder segments(Map<String,String> segments) {
            if (segments == null) {
              throw new MissingRequiredPropertyException("ExternalVolumeTopologyRequestPreferredTopology", "segments");
            }
            this.segments = segments;
            return this;
        }
        public ExternalVolumeTopologyRequestPreferredTopology build() {
            final var _resultValue = new ExternalVolumeTopologyRequestPreferredTopology();
            _resultValue.segments = segments;
            return _resultValue;
        }
    }
}
