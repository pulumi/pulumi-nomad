// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class ExternalVolumeTopologyRequestRequiredTopologyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExternalVolumeTopologyRequestRequiredTopologyArgs Empty = new ExternalVolumeTopologyRequestRequiredTopologyArgs();

    @Import(name="segments", required=true)
    private Output<Map<String,String>> segments;

    public Output<Map<String,String>> segments() {
        return this.segments;
    }

    private ExternalVolumeTopologyRequestRequiredTopologyArgs() {}

    private ExternalVolumeTopologyRequestRequiredTopologyArgs(ExternalVolumeTopologyRequestRequiredTopologyArgs $) {
        this.segments = $.segments;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExternalVolumeTopologyRequestRequiredTopologyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExternalVolumeTopologyRequestRequiredTopologyArgs $;

        public Builder() {
            $ = new ExternalVolumeTopologyRequestRequiredTopologyArgs();
        }

        public Builder(ExternalVolumeTopologyRequestRequiredTopologyArgs defaults) {
            $ = new ExternalVolumeTopologyRequestRequiredTopologyArgs(Objects.requireNonNull(defaults));
        }

        public Builder segments(Output<Map<String,String>> segments) {
            $.segments = segments;
            return this;
        }

        public Builder segments(Map<String,String> segments) {
            return segments(Output.of(segments));
        }

        public ExternalVolumeTopologyRequestRequiredTopologyArgs build() {
            $.segments = Objects.requireNonNull($.segments, "expected parameter 'segments' to be non-null");
            return $;
        }
    }

}
