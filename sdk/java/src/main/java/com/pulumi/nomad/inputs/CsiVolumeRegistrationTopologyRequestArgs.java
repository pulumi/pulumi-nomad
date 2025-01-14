// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.nomad.inputs.CsiVolumeRegistrationTopologyRequestRequiredArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CsiVolumeRegistrationTopologyRequestArgs extends com.pulumi.resources.ResourceArgs {

    public static final CsiVolumeRegistrationTopologyRequestArgs Empty = new CsiVolumeRegistrationTopologyRequestArgs();

    /**
     * `(``Topology``: &lt;optional&gt;)` - Required topologies indicate that the volume must be created in a location accessible from all the listed topologies.
     * 
     */
    @Import(name="required")
    private @Nullable Output<CsiVolumeRegistrationTopologyRequestRequiredArgs> required;

    /**
     * @return `(``Topology``: &lt;optional&gt;)` - Required topologies indicate that the volume must be created in a location accessible from all the listed topologies.
     * 
     */
    public Optional<Output<CsiVolumeRegistrationTopologyRequestRequiredArgs>> required() {
        return Optional.ofNullable(this.required);
    }

    private CsiVolumeRegistrationTopologyRequestArgs() {}

    private CsiVolumeRegistrationTopologyRequestArgs(CsiVolumeRegistrationTopologyRequestArgs $) {
        this.required = $.required;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CsiVolumeRegistrationTopologyRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CsiVolumeRegistrationTopologyRequestArgs $;

        public Builder() {
            $ = new CsiVolumeRegistrationTopologyRequestArgs();
        }

        public Builder(CsiVolumeRegistrationTopologyRequestArgs defaults) {
            $ = new CsiVolumeRegistrationTopologyRequestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param required `(``Topology``: &lt;optional&gt;)` - Required topologies indicate that the volume must be created in a location accessible from all the listed topologies.
         * 
         * @return builder
         * 
         */
        public Builder required(@Nullable Output<CsiVolumeRegistrationTopologyRequestRequiredArgs> required) {
            $.required = required;
            return this;
        }

        /**
         * @param required `(``Topology``: &lt;optional&gt;)` - Required topologies indicate that the volume must be created in a location accessible from all the listed topologies.
         * 
         * @return builder
         * 
         */
        public Builder required(CsiVolumeRegistrationTopologyRequestRequiredArgs required) {
            return required(Output.of(required));
        }

        public CsiVolumeRegistrationTopologyRequestArgs build() {
            return $;
        }
    }

}