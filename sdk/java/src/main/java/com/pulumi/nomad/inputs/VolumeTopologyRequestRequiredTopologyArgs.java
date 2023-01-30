// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class VolumeTopologyRequestRequiredTopologyArgs extends com.pulumi.resources.ResourceArgs {

    public static final VolumeTopologyRequestRequiredTopologyArgs Empty = new VolumeTopologyRequestRequiredTopologyArgs();

    /**
     * `(map[string]string)` - Define the attributes for the topology request.
     * 
     */
    @Import(name="segments", required=true)
    private Output<Map<String,String>> segments;

    /**
     * @return `(map[string]string)` - Define the attributes for the topology request.
     * 
     */
    public Output<Map<String,String>> segments() {
        return this.segments;
    }

    private VolumeTopologyRequestRequiredTopologyArgs() {}

    private VolumeTopologyRequestRequiredTopologyArgs(VolumeTopologyRequestRequiredTopologyArgs $) {
        this.segments = $.segments;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumeTopologyRequestRequiredTopologyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumeTopologyRequestRequiredTopologyArgs $;

        public Builder() {
            $ = new VolumeTopologyRequestRequiredTopologyArgs();
        }

        public Builder(VolumeTopologyRequestRequiredTopologyArgs defaults) {
            $ = new VolumeTopologyRequestRequiredTopologyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param segments `(map[string]string)` - Define the attributes for the topology request.
         * 
         * @return builder
         * 
         */
        public Builder segments(Output<Map<String,String>> segments) {
            $.segments = segments;
            return this;
        }

        /**
         * @param segments `(map[string]string)` - Define the attributes for the topology request.
         * 
         * @return builder
         * 
         */
        public Builder segments(Map<String,String> segments) {
            return segments(Output.of(segments));
        }

        public VolumeTopologyRequestRequiredTopologyArgs build() {
            $.segments = Objects.requireNonNull($.segments, "expected parameter 'segments' to be non-null");
            return $;
        }
    }

}
