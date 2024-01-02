// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class CsiVolumeRegistrationTopology {
    /**
     * @return `(map[string]string)` - Define the attributes for the topology request.
     * 
     * In addition to the above arguments, the following attributes are exported and
     * can be referenced:
     * 
     */
    private @Nullable Map<String,String> segments;

    private CsiVolumeRegistrationTopology() {}
    /**
     * @return `(map[string]string)` - Define the attributes for the topology request.
     * 
     * In addition to the above arguments, the following attributes are exported and
     * can be referenced:
     * 
     */
    public Map<String,String> segments() {
        return this.segments == null ? Map.of() : this.segments;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CsiVolumeRegistrationTopology defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,String> segments;
        public Builder() {}
        public Builder(CsiVolumeRegistrationTopology defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.segments = defaults.segments;
        }

        @CustomType.Setter
        public Builder segments(@Nullable Map<String,String> segments) {

            this.segments = segments;
            return this;
        }
        public CsiVolumeRegistrationTopology build() {
            final var _resultValue = new CsiVolumeRegistrationTopology();
            _resultValue.segments = segments;
            return _resultValue;
        }
    }
}
