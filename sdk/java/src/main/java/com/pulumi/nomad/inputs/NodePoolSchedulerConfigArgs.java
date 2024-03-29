// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodePoolSchedulerConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodePoolSchedulerConfigArgs Empty = new NodePoolSchedulerConfigArgs();

    /**
     * `(string)` - Whether or not memory
     * oversubscription is enabled in the node pool. Possible values are
     * `&#34;enabled&#34;` or `&#34;disabled&#34;`. If not defined the global cluster
     * configuration is used.
     * 
     * &gt; This option differs from Nomad, where it&#39;s represented as a boolean, to
     * allow distinguishing between memory oversubscription being disabled in the
     * node pool and this property not being set.
     * 
     */
    @Import(name="memoryOversubscription")
    private @Nullable Output<String> memoryOversubscription;

    /**
     * @return `(string)` - Whether or not memory
     * oversubscription is enabled in the node pool. Possible values are
     * `&#34;enabled&#34;` or `&#34;disabled&#34;`. If not defined the global cluster
     * configuration is used.
     * 
     * &gt; This option differs from Nomad, where it&#39;s represented as a boolean, to
     * allow distinguishing between memory oversubscription being disabled in the
     * node pool and this property not being set.
     * 
     */
    public Optional<Output<String>> memoryOversubscription() {
        return Optional.ofNullable(this.memoryOversubscription);
    }

    /**
     * `(string)` - The scheduler algorithm used in the node
     * pool. Possible values are `binpack` or `spread`. If not defined the global
     * cluster configuration is used.
     * 
     */
    @Import(name="schedulerAlgorithm")
    private @Nullable Output<String> schedulerAlgorithm;

    /**
     * @return `(string)` - The scheduler algorithm used in the node
     * pool. Possible values are `binpack` or `spread`. If not defined the global
     * cluster configuration is used.
     * 
     */
    public Optional<Output<String>> schedulerAlgorithm() {
        return Optional.ofNullable(this.schedulerAlgorithm);
    }

    private NodePoolSchedulerConfigArgs() {}

    private NodePoolSchedulerConfigArgs(NodePoolSchedulerConfigArgs $) {
        this.memoryOversubscription = $.memoryOversubscription;
        this.schedulerAlgorithm = $.schedulerAlgorithm;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodePoolSchedulerConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodePoolSchedulerConfigArgs $;

        public Builder() {
            $ = new NodePoolSchedulerConfigArgs();
        }

        public Builder(NodePoolSchedulerConfigArgs defaults) {
            $ = new NodePoolSchedulerConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param memoryOversubscription `(string)` - Whether or not memory
         * oversubscription is enabled in the node pool. Possible values are
         * `&#34;enabled&#34;` or `&#34;disabled&#34;`. If not defined the global cluster
         * configuration is used.
         * 
         * &gt; This option differs from Nomad, where it&#39;s represented as a boolean, to
         * allow distinguishing between memory oversubscription being disabled in the
         * node pool and this property not being set.
         * 
         * @return builder
         * 
         */
        public Builder memoryOversubscription(@Nullable Output<String> memoryOversubscription) {
            $.memoryOversubscription = memoryOversubscription;
            return this;
        }

        /**
         * @param memoryOversubscription `(string)` - Whether or not memory
         * oversubscription is enabled in the node pool. Possible values are
         * `&#34;enabled&#34;` or `&#34;disabled&#34;`. If not defined the global cluster
         * configuration is used.
         * 
         * &gt; This option differs from Nomad, where it&#39;s represented as a boolean, to
         * allow distinguishing between memory oversubscription being disabled in the
         * node pool and this property not being set.
         * 
         * @return builder
         * 
         */
        public Builder memoryOversubscription(String memoryOversubscription) {
            return memoryOversubscription(Output.of(memoryOversubscription));
        }

        /**
         * @param schedulerAlgorithm `(string)` - The scheduler algorithm used in the node
         * pool. Possible values are `binpack` or `spread`. If not defined the global
         * cluster configuration is used.
         * 
         * @return builder
         * 
         */
        public Builder schedulerAlgorithm(@Nullable Output<String> schedulerAlgorithm) {
            $.schedulerAlgorithm = schedulerAlgorithm;
            return this;
        }

        /**
         * @param schedulerAlgorithm `(string)` - The scheduler algorithm used in the node
         * pool. Possible values are `binpack` or `spread`. If not defined the global
         * cluster configuration is used.
         * 
         * @return builder
         * 
         */
        public Builder schedulerAlgorithm(String schedulerAlgorithm) {
            return schedulerAlgorithm(Output.of(schedulerAlgorithm));
        }

        public NodePoolSchedulerConfigArgs build() {
            return $;
        }
    }

}
