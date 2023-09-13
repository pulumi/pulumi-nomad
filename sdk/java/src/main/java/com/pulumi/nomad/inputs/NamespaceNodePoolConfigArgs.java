// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NamespaceNodePoolConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NamespaceNodePoolConfigArgs Empty = new NamespaceNodePoolConfigArgs();

    /**
     * `([]string: &lt;optional&gt;)` - The list of node pools that are allowed to be used in this namespace.
     * 
     */
    @Import(name="alloweds")
    private @Nullable Output<List<String>> alloweds;

    /**
     * @return `([]string: &lt;optional&gt;)` - The list of node pools that are allowed to be used in this namespace.
     * 
     */
    public Optional<Output<List<String>>> alloweds() {
        return Optional.ofNullable(this.alloweds);
    }

    /**
     * `(string: &lt;optional&gt;)` - The default node pool for jobs that don&#39;t define one.
     * 
     */
    @Import(name="default")
    private @Nullable Output<String> default_;

    /**
     * @return `(string: &lt;optional&gt;)` - The default node pool for jobs that don&#39;t define one.
     * 
     */
    public Optional<Output<String>> default_() {
        return Optional.ofNullable(this.default_);
    }

    /**
     * `([]string: &lt;optional&gt;)` - The list of node pools that are not allowed to be used in this namespace.
     * 
     */
    @Import(name="denieds")
    private @Nullable Output<List<String>> denieds;

    /**
     * @return `([]string: &lt;optional&gt;)` - The list of node pools that are not allowed to be used in this namespace.
     * 
     */
    public Optional<Output<List<String>>> denieds() {
        return Optional.ofNullable(this.denieds);
    }

    private NamespaceNodePoolConfigArgs() {}

    private NamespaceNodePoolConfigArgs(NamespaceNodePoolConfigArgs $) {
        this.alloweds = $.alloweds;
        this.default_ = $.default_;
        this.denieds = $.denieds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NamespaceNodePoolConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NamespaceNodePoolConfigArgs $;

        public Builder() {
            $ = new NamespaceNodePoolConfigArgs();
        }

        public Builder(NamespaceNodePoolConfigArgs defaults) {
            $ = new NamespaceNodePoolConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alloweds `([]string: &lt;optional&gt;)` - The list of node pools that are allowed to be used in this namespace.
         * 
         * @return builder
         * 
         */
        public Builder alloweds(@Nullable Output<List<String>> alloweds) {
            $.alloweds = alloweds;
            return this;
        }

        /**
         * @param alloweds `([]string: &lt;optional&gt;)` - The list of node pools that are allowed to be used in this namespace.
         * 
         * @return builder
         * 
         */
        public Builder alloweds(List<String> alloweds) {
            return alloweds(Output.of(alloweds));
        }

        /**
         * @param alloweds `([]string: &lt;optional&gt;)` - The list of node pools that are allowed to be used in this namespace.
         * 
         * @return builder
         * 
         */
        public Builder alloweds(String... alloweds) {
            return alloweds(List.of(alloweds));
        }

        /**
         * @param default_ `(string: &lt;optional&gt;)` - The default node pool for jobs that don&#39;t define one.
         * 
         * @return builder
         * 
         */
        public Builder default_(@Nullable Output<String> default_) {
            $.default_ = default_;
            return this;
        }

        /**
         * @param default_ `(string: &lt;optional&gt;)` - The default node pool for jobs that don&#39;t define one.
         * 
         * @return builder
         * 
         */
        public Builder default_(String default_) {
            return default_(Output.of(default_));
        }

        /**
         * @param denieds `([]string: &lt;optional&gt;)` - The list of node pools that are not allowed to be used in this namespace.
         * 
         * @return builder
         * 
         */
        public Builder denieds(@Nullable Output<List<String>> denieds) {
            $.denieds = denieds;
            return this;
        }

        /**
         * @param denieds `([]string: &lt;optional&gt;)` - The list of node pools that are not allowed to be used in this namespace.
         * 
         * @return builder
         * 
         */
        public Builder denieds(List<String> denieds) {
            return denieds(Output.of(denieds));
        }

        /**
         * @param denieds `([]string: &lt;optional&gt;)` - The list of node pools that are not allowed to be used in this namespace.
         * 
         * @return builder
         * 
         */
        public Builder denieds(String... denieds) {
            return denieds(List.of(denieds));
        }

        public NamespaceNodePoolConfigArgs build() {
            return $;
        }
    }

}
