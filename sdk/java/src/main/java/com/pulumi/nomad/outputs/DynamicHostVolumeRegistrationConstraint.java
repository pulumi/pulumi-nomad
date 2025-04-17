// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DynamicHostVolumeRegistrationConstraint {
    /**
     * @return An attribute to check to constrain volume placement
     * 
     */
    private String attribute;
    /**
     * @return The operator to use for comparison
     * 
     */
    private @Nullable String operator;
    /**
     * @return The requested value of the attribute
     * 
     */
    private @Nullable String value;

    private DynamicHostVolumeRegistrationConstraint() {}
    /**
     * @return An attribute to check to constrain volume placement
     * 
     */
    public String attribute() {
        return this.attribute;
    }
    /**
     * @return The operator to use for comparison
     * 
     */
    public Optional<String> operator() {
        return Optional.ofNullable(this.operator);
    }
    /**
     * @return The requested value of the attribute
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DynamicHostVolumeRegistrationConstraint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String attribute;
        private @Nullable String operator;
        private @Nullable String value;
        public Builder() {}
        public Builder(DynamicHostVolumeRegistrationConstraint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attribute = defaults.attribute;
    	      this.operator = defaults.operator;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder attribute(String attribute) {
            if (attribute == null) {
              throw new MissingRequiredPropertyException("DynamicHostVolumeRegistrationConstraint", "attribute");
            }
            this.attribute = attribute;
            return this;
        }
        @CustomType.Setter
        public Builder operator(@Nullable String operator) {

            this.operator = operator;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        public DynamicHostVolumeRegistrationConstraint build() {
            final var _resultValue = new DynamicHostVolumeRegistrationConstraint();
            _resultValue.attribute = attribute;
            _resultValue.operator = operator;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
