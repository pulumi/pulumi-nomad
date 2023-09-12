// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.nomad.inputs.CsiVolumeTopologyRequestPreferredArgs;
import com.pulumi.nomad.inputs.CsiVolumeTopologyRequestRequiredArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CsiVolumeTopologyRequestArgs extends com.pulumi.resources.ResourceArgs {

    public static final CsiVolumeTopologyRequestArgs Empty = new CsiVolumeTopologyRequestArgs();

    /**
     * `(``Topology``: &lt;optional&gt;)` - Preferred topologies indicate that the volume should be created in a location accessible from some of the listed topologies.
     * 
     */
    @Import(name="preferred")
    private @Nullable Output<CsiVolumeTopologyRequestPreferredArgs> preferred;

    /**
     * @return `(``Topology``: &lt;optional&gt;)` - Preferred topologies indicate that the volume should be created in a location accessible from some of the listed topologies.
     * 
     */
    public Optional<Output<CsiVolumeTopologyRequestPreferredArgs>> preferred() {
        return Optional.ofNullable(this.preferred);
    }

    /**
     * `(``Topology``: &lt;optional&gt;)` - Required topologies indicate that the volume must be created in a location accessible from all the listed topologies.
     * 
     */
    @Import(name="required")
    private @Nullable Output<CsiVolumeTopologyRequestRequiredArgs> required;

    /**
     * @return `(``Topology``: &lt;optional&gt;)` - Required topologies indicate that the volume must be created in a location accessible from all the listed topologies.
     * 
     */
    public Optional<Output<CsiVolumeTopologyRequestRequiredArgs>> required() {
        return Optional.ofNullable(this.required);
    }

    private CsiVolumeTopologyRequestArgs() {}

    private CsiVolumeTopologyRequestArgs(CsiVolumeTopologyRequestArgs $) {
        this.preferred = $.preferred;
        this.required = $.required;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CsiVolumeTopologyRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CsiVolumeTopologyRequestArgs $;

        public Builder() {
            $ = new CsiVolumeTopologyRequestArgs();
        }

        public Builder(CsiVolumeTopologyRequestArgs defaults) {
            $ = new CsiVolumeTopologyRequestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param preferred `(``Topology``: &lt;optional&gt;)` - Preferred topologies indicate that the volume should be created in a location accessible from some of the listed topologies.
         * 
         * @return builder
         * 
         */
        public Builder preferred(@Nullable Output<CsiVolumeTopologyRequestPreferredArgs> preferred) {
            $.preferred = preferred;
            return this;
        }

        /**
         * @param preferred `(``Topology``: &lt;optional&gt;)` - Preferred topologies indicate that the volume should be created in a location accessible from some of the listed topologies.
         * 
         * @return builder
         * 
         */
        public Builder preferred(CsiVolumeTopologyRequestPreferredArgs preferred) {
            return preferred(Output.of(preferred));
        }

        /**
         * @param required `(``Topology``: &lt;optional&gt;)` - Required topologies indicate that the volume must be created in a location accessible from all the listed topologies.
         * 
         * @return builder
         * 
         */
        public Builder required(@Nullable Output<CsiVolumeTopologyRequestRequiredArgs> required) {
            $.required = required;
            return this;
        }

        /**
         * @param required `(``Topology``: &lt;optional&gt;)` - Required topologies indicate that the volume must be created in a location accessible from all the listed topologies.
         * 
         * @return builder
         * 
         */
        public Builder required(CsiVolumeTopologyRequestRequiredArgs required) {
            return required(Output.of(required));
        }

        public CsiVolumeTopologyRequestArgs build() {
            return $;
        }
    }

}
