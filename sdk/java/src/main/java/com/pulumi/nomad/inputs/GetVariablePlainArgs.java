// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVariablePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVariablePlainArgs Empty = new GetVariablePlainArgs();

    /**
     * `(string: &#34;default&#34;)` - The namepsace in which the variable exists.
     * 
     */
    @Import(name="namespace")
    private @Nullable String namespace;

    /**
     * @return `(string: &#34;default&#34;)` - The namepsace in which the variable exists.
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * `(string)` - Path to the existing variable.
     * 
     */
    @Import(name="path", required=true)
    private String path;

    /**
     * @return `(string)` - Path to the existing variable.
     * 
     */
    public String path() {
        return this.path;
    }

    private GetVariablePlainArgs() {}

    private GetVariablePlainArgs(GetVariablePlainArgs $) {
        this.namespace = $.namespace;
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVariablePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVariablePlainArgs $;

        public Builder() {
            $ = new GetVariablePlainArgs();
        }

        public Builder(GetVariablePlainArgs defaults) {
            $ = new GetVariablePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param namespace `(string: &#34;default&#34;)` - The namepsace in which the variable exists.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable String namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param path `(string)` - Path to the existing variable.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            $.path = path;
            return this;
        }

        public GetVariablePlainArgs build() {
            if ($.path == null) {
                throw new MissingRequiredPropertyException("GetVariablePlainArgs", "path");
            }
            return $;
        }
    }

}
