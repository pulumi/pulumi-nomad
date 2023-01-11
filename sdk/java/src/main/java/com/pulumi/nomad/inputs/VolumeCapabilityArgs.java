// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class VolumeCapabilityArgs extends com.pulumi.resources.ResourceArgs {

    public static final VolumeCapabilityArgs Empty = new VolumeCapabilityArgs();

    @Import(name="accessMode", required=true)
    private Output<String> accessMode;

    public Output<String> accessMode() {
        return this.accessMode;
    }

    @Import(name="attachmentMode", required=true)
    private Output<String> attachmentMode;

    public Output<String> attachmentMode() {
        return this.attachmentMode;
    }

    private VolumeCapabilityArgs() {}

    private VolumeCapabilityArgs(VolumeCapabilityArgs $) {
        this.accessMode = $.accessMode;
        this.attachmentMode = $.attachmentMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumeCapabilityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumeCapabilityArgs $;

        public Builder() {
            $ = new VolumeCapabilityArgs();
        }

        public Builder(VolumeCapabilityArgs defaults) {
            $ = new VolumeCapabilityArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessMode(Output<String> accessMode) {
            $.accessMode = accessMode;
            return this;
        }

        public Builder accessMode(String accessMode) {
            return accessMode(Output.of(accessMode));
        }

        public Builder attachmentMode(Output<String> attachmentMode) {
            $.attachmentMode = attachmentMode;
            return this;
        }

        public Builder attachmentMode(String attachmentMode) {
            return attachmentMode(Output.of(attachmentMode));
        }

        public VolumeCapabilityArgs build() {
            $.accessMode = Objects.requireNonNull($.accessMode, "expected parameter 'accessMode' to be non-null");
            $.attachmentMode = Objects.requireNonNull($.attachmentMode, "expected parameter 'attachmentMode' to be non-null");
            return $;
        }
    }

}