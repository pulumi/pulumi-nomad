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


public final class VariableState extends com.pulumi.resources.ResourceArgs {

    public static final VariableState Empty = new VariableState();

    /**
     * `(map[string]string: &lt;required&gt;)` - An arbitrary map of items to create in the variable.
     * 
     */
    @Import(name="items")
    private @Nullable Output<Map<String,String>> items;

    /**
     * @return `(map[string]string: &lt;required&gt;)` - An arbitrary map of items to create in the variable.
     * 
     */
    public Optional<Output<Map<String,String>>> items() {
        return Optional.ofNullable(this.items);
    }

    /**
     * `(string: &#34;default&#34;)` - The namepsace to create the variable in.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return `(string: &#34;default&#34;)` - The namepsace to create the variable in.
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * `(string: &lt;required&gt;)` - A unique path to create the variable at.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return `(string: &lt;required&gt;)` - A unique path to create the variable at.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    private VariableState() {}

    private VariableState(VariableState $) {
        this.items = $.items;
        this.namespace = $.namespace;
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VariableState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VariableState $;

        public Builder() {
            $ = new VariableState();
        }

        public Builder(VariableState defaults) {
            $ = new VariableState(Objects.requireNonNull(defaults));
        }

        /**
         * @param items `(map[string]string: &lt;required&gt;)` - An arbitrary map of items to create in the variable.
         * 
         * @return builder
         * 
         */
        public Builder items(@Nullable Output<Map<String,String>> items) {
            $.items = items;
            return this;
        }

        /**
         * @param items `(map[string]string: &lt;required&gt;)` - An arbitrary map of items to create in the variable.
         * 
         * @return builder
         * 
         */
        public Builder items(Map<String,String> items) {
            return items(Output.of(items));
        }

        /**
         * @param namespace `(string: &#34;default&#34;)` - The namepsace to create the variable in.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace `(string: &#34;default&#34;)` - The namepsace to create the variable in.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param path `(string: &lt;required&gt;)` - A unique path to create the variable at.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path `(string: &lt;required&gt;)` - A unique path to create the variable at.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        public VariableState build() {
            return $;
        }
    }

}
