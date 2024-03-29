// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetNodePoolArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNodePoolArgs Empty = new GetNodePoolArgs();

    /**
     * `(string)` - The name of the node pool to fetch.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return `(string)` - The name of the node pool to fetch.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetNodePoolArgs() {}

    private GetNodePoolArgs(GetNodePoolArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNodePoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNodePoolArgs $;

        public Builder() {
            $ = new GetNodePoolArgs();
        }

        public Builder(GetNodePoolArgs defaults) {
            $ = new GetNodePoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name `(string)` - The name of the node pool to fetch.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name `(string)` - The name of the node pool to fetch.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetNodePoolArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetNodePoolArgs", "name");
            }
            return $;
        }
    }

}
