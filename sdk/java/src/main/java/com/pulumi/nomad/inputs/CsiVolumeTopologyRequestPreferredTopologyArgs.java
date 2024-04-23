// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class CsiVolumeTopologyRequestPreferredTopologyArgs extends com.pulumi.resources.ResourceArgs {

    public static final CsiVolumeTopologyRequestPreferredTopologyArgs Empty = new CsiVolumeTopologyRequestPreferredTopologyArgs();

    /**
     * Define the attributes for the topology request.
     * 
     */
    @Import(name="segments", required=true)
    private Output<Map<String,String>> segments;

    /**
     * @return Define the attributes for the topology request.
     * 
     */
    public Output<Map<String,String>> segments() {
        return this.segments;
    }

    private CsiVolumeTopologyRequestPreferredTopologyArgs() {}

    private CsiVolumeTopologyRequestPreferredTopologyArgs(CsiVolumeTopologyRequestPreferredTopologyArgs $) {
        this.segments = $.segments;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CsiVolumeTopologyRequestPreferredTopologyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CsiVolumeTopologyRequestPreferredTopologyArgs $;

        public Builder() {
            $ = new CsiVolumeTopologyRequestPreferredTopologyArgs();
        }

        public Builder(CsiVolumeTopologyRequestPreferredTopologyArgs defaults) {
            $ = new CsiVolumeTopologyRequestPreferredTopologyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param segments Define the attributes for the topology request.
         * 
         * @return builder
         * 
         */
        public Builder segments(Output<Map<String,String>> segments) {
            $.segments = segments;
            return this;
        }

        /**
         * @param segments Define the attributes for the topology request.
         * 
         * @return builder
         * 
         */
        public Builder segments(Map<String,String> segments) {
            return segments(Output.of(segments));
        }

        public CsiVolumeTopologyRequestPreferredTopologyArgs build() {
            if ($.segments == null) {
                throw new MissingRequiredPropertyException("CsiVolumeTopologyRequestPreferredTopologyArgs", "segments");
            }
            return $;
        }
    }

}
