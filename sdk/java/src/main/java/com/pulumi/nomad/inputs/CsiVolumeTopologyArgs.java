// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CsiVolumeTopologyArgs extends com.pulumi.resources.ResourceArgs {

    public static final CsiVolumeTopologyArgs Empty = new CsiVolumeTopologyArgs();

    /**
     * `(map[string]string)` - Define the attributes for the topology request.
     * 
     * In addition to the above arguments, the following attributes are exported and
     * can be referenced:
     * 
     */
    @Import(name="segments")
    private @Nullable Output<Map<String,String>> segments;

    /**
     * @return `(map[string]string)` - Define the attributes for the topology request.
     * 
     * In addition to the above arguments, the following attributes are exported and
     * can be referenced:
     * 
     */
    public Optional<Output<Map<String,String>>> segments() {
        return Optional.ofNullable(this.segments);
    }

    private CsiVolumeTopologyArgs() {}

    private CsiVolumeTopologyArgs(CsiVolumeTopologyArgs $) {
        this.segments = $.segments;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CsiVolumeTopologyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CsiVolumeTopologyArgs $;

        public Builder() {
            $ = new CsiVolumeTopologyArgs();
        }

        public Builder(CsiVolumeTopologyArgs defaults) {
            $ = new CsiVolumeTopologyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param segments `(map[string]string)` - Define the attributes for the topology request.
         * 
         * In addition to the above arguments, the following attributes are exported and
         * can be referenced:
         * 
         * @return builder
         * 
         */
        public Builder segments(@Nullable Output<Map<String,String>> segments) {
            $.segments = segments;
            return this;
        }

        /**
         * @param segments `(map[string]string)` - Define the attributes for the topology request.
         * 
         * In addition to the above arguments, the following attributes are exported and
         * can be referenced:
         * 
         * @return builder
         * 
         */
        public Builder segments(Map<String,String> segments) {
            return segments(Output.of(segments));
        }

        public CsiVolumeTopologyArgs build() {
            return $;
        }
    }

}