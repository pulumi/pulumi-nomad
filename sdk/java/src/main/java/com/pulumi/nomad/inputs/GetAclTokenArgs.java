// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetAclTokenArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAclTokenArgs Empty = new GetAclTokenArgs();

    /**
     * `(string)` Non-sensitive identifier for this token.
     * 
     */
    @Import(name="accessorId", required=true)
    private Output<String> accessorId;

    /**
     * @return `(string)` Non-sensitive identifier for this token.
     * 
     */
    public Output<String> accessorId() {
        return this.accessorId;
    }

    private GetAclTokenArgs() {}

    private GetAclTokenArgs(GetAclTokenArgs $) {
        this.accessorId = $.accessorId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAclTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAclTokenArgs $;

        public Builder() {
            $ = new GetAclTokenArgs();
        }

        public Builder(GetAclTokenArgs defaults) {
            $ = new GetAclTokenArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessorId `(string)` Non-sensitive identifier for this token.
         * 
         * @return builder
         * 
         */
        public Builder accessorId(Output<String> accessorId) {
            $.accessorId = accessorId;
            return this;
        }

        /**
         * @param accessorId `(string)` Non-sensitive identifier for this token.
         * 
         * @return builder
         * 
         */
        public Builder accessorId(String accessorId) {
            return accessorId(Output.of(accessorId));
        }

        public GetAclTokenArgs build() {
            if ($.accessorId == null) {
                throw new MissingRequiredPropertyException("GetAclTokenArgs", "accessorId");
            }
            return $;
        }
    }

}