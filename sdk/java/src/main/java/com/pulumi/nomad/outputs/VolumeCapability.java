// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VolumeCapability {
    private String accessMode;
    private String attachmentMode;

    private VolumeCapability() {}
    public String accessMode() {
        return this.accessMode;
    }
    public String attachmentMode() {
        return this.attachmentMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeCapability defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accessMode;
        private String attachmentMode;
        public Builder() {}
        public Builder(VolumeCapability defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessMode = defaults.accessMode;
    	      this.attachmentMode = defaults.attachmentMode;
        }

        @CustomType.Setter
        public Builder accessMode(String accessMode) {
            this.accessMode = Objects.requireNonNull(accessMode);
            return this;
        }
        @CustomType.Setter
        public Builder attachmentMode(String attachmentMode) {
            this.attachmentMode = Objects.requireNonNull(attachmentMode);
            return this;
        }
        public VolumeCapability build() {
            final var o = new VolumeCapability();
            o.accessMode = accessMode;
            o.attachmentMode = attachmentMode;
            return o;
        }
    }
}