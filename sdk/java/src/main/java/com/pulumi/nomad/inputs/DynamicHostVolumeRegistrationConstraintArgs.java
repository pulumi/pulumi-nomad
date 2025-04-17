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


public final class DynamicHostVolumeRegistrationConstraintArgs extends com.pulumi.resources.ResourceArgs {

    public static final DynamicHostVolumeRegistrationConstraintArgs Empty = new DynamicHostVolumeRegistrationConstraintArgs();

    /**
     * An attribute to check to constrain volume placement
     * 
     */
    @Import(name="attribute", required=true)
    private Output<String> attribute;

    /**
     * @return An attribute to check to constrain volume placement
     * 
     */
    public Output<String> attribute() {
        return this.attribute;
    }

    /**
     * The operator to use for comparison
     * 
     */
    @Import(name="operator")
    private @Nullable Output<String> operator;

    /**
     * @return The operator to use for comparison
     * 
     */
    public Optional<Output<String>> operator() {
        return Optional.ofNullable(this.operator);
    }

    /**
     * The requested value of the attribute
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The requested value of the attribute
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private DynamicHostVolumeRegistrationConstraintArgs() {}

    private DynamicHostVolumeRegistrationConstraintArgs(DynamicHostVolumeRegistrationConstraintArgs $) {
        this.attribute = $.attribute;
        this.operator = $.operator;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DynamicHostVolumeRegistrationConstraintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DynamicHostVolumeRegistrationConstraintArgs $;

        public Builder() {
            $ = new DynamicHostVolumeRegistrationConstraintArgs();
        }

        public Builder(DynamicHostVolumeRegistrationConstraintArgs defaults) {
            $ = new DynamicHostVolumeRegistrationConstraintArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attribute An attribute to check to constrain volume placement
         * 
         * @return builder
         * 
         */
        public Builder attribute(Output<String> attribute) {
            $.attribute = attribute;
            return this;
        }

        /**
         * @param attribute An attribute to check to constrain volume placement
         * 
         * @return builder
         * 
         */
        public Builder attribute(String attribute) {
            return attribute(Output.of(attribute));
        }

        /**
         * @param operator The operator to use for comparison
         * 
         * @return builder
         * 
         */
        public Builder operator(@Nullable Output<String> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator The operator to use for comparison
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        /**
         * @param value The requested value of the attribute
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The requested value of the attribute
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public DynamicHostVolumeRegistrationConstraintArgs build() {
            if ($.attribute == null) {
                throw new MissingRequiredPropertyException("DynamicHostVolumeRegistrationConstraintArgs", "attribute");
            }
            return $;
        }
    }

}
