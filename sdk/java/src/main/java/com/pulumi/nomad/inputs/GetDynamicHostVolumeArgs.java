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


public final class GetDynamicHostVolumeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDynamicHostVolumeArgs Empty = new GetDynamicHostVolumeArgs();

    /**
     * `(string)` - the ID of the volume
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return `(string)` - the ID of the volume
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * `(string)` - the namespace of the volume. Defaults to `&#34;default&#34;`
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return `(string)` - the namespace of the volume. Defaults to `&#34;default&#34;`
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    private GetDynamicHostVolumeArgs() {}

    private GetDynamicHostVolumeArgs(GetDynamicHostVolumeArgs $) {
        this.id = $.id;
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDynamicHostVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDynamicHostVolumeArgs $;

        public Builder() {
            $ = new GetDynamicHostVolumeArgs();
        }

        public Builder(GetDynamicHostVolumeArgs defaults) {
            $ = new GetDynamicHostVolumeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id `(string)` - the ID of the volume
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id `(string)` - the ID of the volume
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param namespace `(string)` - the namespace of the volume. Defaults to `&#34;default&#34;`
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace `(string)` - the namespace of the volume. Defaults to `&#34;default&#34;`
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public GetDynamicHostVolumeArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetDynamicHostVolumeArgs", "id");
            }
            return $;
        }
    }

}
