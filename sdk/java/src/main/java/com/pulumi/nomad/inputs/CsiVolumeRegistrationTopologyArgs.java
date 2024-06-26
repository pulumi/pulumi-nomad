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


public final class CsiVolumeRegistrationTopologyArgs extends com.pulumi.resources.ResourceArgs {

    public static final CsiVolumeRegistrationTopologyArgs Empty = new CsiVolumeRegistrationTopologyArgs();

    @Import(name="segments")
    private @Nullable Output<Map<String,String>> segments;

    public Optional<Output<Map<String,String>>> segments() {
        return Optional.ofNullable(this.segments);
    }

    private CsiVolumeRegistrationTopologyArgs() {}

    private CsiVolumeRegistrationTopologyArgs(CsiVolumeRegistrationTopologyArgs $) {
        this.segments = $.segments;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CsiVolumeRegistrationTopologyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CsiVolumeRegistrationTopologyArgs $;

        public Builder() {
            $ = new CsiVolumeRegistrationTopologyArgs();
        }

        public Builder(CsiVolumeRegistrationTopologyArgs defaults) {
            $ = new CsiVolumeRegistrationTopologyArgs(Objects.requireNonNull(defaults));
        }

        public Builder segments(@Nullable Output<Map<String,String>> segments) {
            $.segments = segments;
            return this;
        }

        public Builder segments(Map<String,String> segments) {
            return segments(Output.of(segments));
        }

        public CsiVolumeRegistrationTopologyArgs build() {
            return $;
        }
    }

}
