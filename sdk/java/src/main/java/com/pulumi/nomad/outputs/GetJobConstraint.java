// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetJobConstraint {
    /**
     * @return `(string)` Attribute being constrained.
     * 
     */
    private String ltarget;
    /**
     * @return `(string)` Operator used to compare the attribute to the constraint.
     * 
     */
    private String operand;
    /**
     * @return `(string)` Constraint value.
     * 
     */
    private String rtarget;

    private GetJobConstraint() {}
    /**
     * @return `(string)` Attribute being constrained.
     * 
     */
    public String ltarget() {
        return this.ltarget;
    }
    /**
     * @return `(string)` Operator used to compare the attribute to the constraint.
     * 
     */
    public String operand() {
        return this.operand;
    }
    /**
     * @return `(string)` Constraint value.
     * 
     */
    public String rtarget() {
        return this.rtarget;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobConstraint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ltarget;
        private String operand;
        private String rtarget;
        public Builder() {}
        public Builder(GetJobConstraint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ltarget = defaults.ltarget;
    	      this.operand = defaults.operand;
    	      this.rtarget = defaults.rtarget;
        }

        @CustomType.Setter
        public Builder ltarget(String ltarget) {
            if (ltarget == null) {
              throw new MissingRequiredPropertyException("GetJobConstraint", "ltarget");
            }
            this.ltarget = ltarget;
            return this;
        }
        @CustomType.Setter
        public Builder operand(String operand) {
            if (operand == null) {
              throw new MissingRequiredPropertyException("GetJobConstraint", "operand");
            }
            this.operand = operand;
            return this;
        }
        @CustomType.Setter
        public Builder rtarget(String rtarget) {
            if (rtarget == null) {
              throw new MissingRequiredPropertyException("GetJobConstraint", "rtarget");
            }
            this.rtarget = rtarget;
            return this;
        }
        public GetJobConstraint build() {
            final var _resultValue = new GetJobConstraint();
            _resultValue.ltarget = ltarget;
            _resultValue.operand = operand;
            _resultValue.rtarget = rtarget;
            return _resultValue;
        }
    }
}