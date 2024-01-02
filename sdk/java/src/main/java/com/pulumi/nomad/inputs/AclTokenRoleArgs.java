// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AclTokenRoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final AclTokenRoleArgs Empty = new AclTokenRoleArgs();

    @Import(name="id", required=true)
    private Output<String> id;

    public Output<String> id() {
        return this.id;
    }

    /**
     * `(string: &#34;&#34;)` - A human-friendly name for this token.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return `(string: &#34;&#34;)` - A human-friendly name for this token.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private AclTokenRoleArgs() {}

    private AclTokenRoleArgs(AclTokenRoleArgs $) {
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AclTokenRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AclTokenRoleArgs $;

        public Builder() {
            $ = new AclTokenRoleArgs();
        }

        public Builder(AclTokenRoleArgs defaults) {
            $ = new AclTokenRoleArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name `(string: &#34;&#34;)` - A human-friendly name for this token.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name `(string: &#34;&#34;)` - A human-friendly name for this token.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public AclTokenRoleArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("AclTokenRoleArgs", "id");
            }
            return $;
        }
    }

}
