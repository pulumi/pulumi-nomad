// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetScalingPolicyResult {
    /**
     * @return `(boolean)` - Whether or not the scaling policy is enabled.
     * 
     */
    private Boolean enabled;
    private String id;
    /**
     * @return `(integer)` - The maximum value set in the scaling policy.
     * 
     */
    private Integer max;
    /**
     * @return `(integer)` - The minimum value set in the scaling policy.
     * 
     */
    private Integer min;
    /**
     * @return `(string)` - The policy inside the scaling policy.
     * 
     */
    private String policy;
    /**
     * @return `(map[string]string)` - The scaling policy target.
     * 
     */
    private Map<String,Object> target;
    /**
     * @return `(string)` - The scaling policy type.
     * 
     */
    private String type;

    private GetScalingPolicyResult() {}
    /**
     * @return `(boolean)` - Whether or not the scaling policy is enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return `(integer)` - The maximum value set in the scaling policy.
     * 
     */
    public Integer max() {
        return this.max;
    }
    /**
     * @return `(integer)` - The minimum value set in the scaling policy.
     * 
     */
    public Integer min() {
        return this.min;
    }
    /**
     * @return `(string)` - The policy inside the scaling policy.
     * 
     */
    public String policy() {
        return this.policy;
    }
    /**
     * @return `(map[string]string)` - The scaling policy target.
     * 
     */
    public Map<String,Object> target() {
        return this.target;
    }
    /**
     * @return `(string)` - The scaling policy type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScalingPolicyResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private String id;
        private Integer max;
        private Integer min;
        private String policy;
        private Map<String,Object> target;
        private String type;
        public Builder() {}
        public Builder(GetScalingPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.max = defaults.max;
    	      this.min = defaults.min;
    	      this.policy = defaults.policy;
    	      this.target = defaults.target;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetScalingPolicyResult", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetScalingPolicyResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder max(Integer max) {
            if (max == null) {
              throw new MissingRequiredPropertyException("GetScalingPolicyResult", "max");
            }
            this.max = max;
            return this;
        }
        @CustomType.Setter
        public Builder min(Integer min) {
            if (min == null) {
              throw new MissingRequiredPropertyException("GetScalingPolicyResult", "min");
            }
            this.min = min;
            return this;
        }
        @CustomType.Setter
        public Builder policy(String policy) {
            if (policy == null) {
              throw new MissingRequiredPropertyException("GetScalingPolicyResult", "policy");
            }
            this.policy = policy;
            return this;
        }
        @CustomType.Setter
        public Builder target(Map<String,Object> target) {
            if (target == null) {
              throw new MissingRequiredPropertyException("GetScalingPolicyResult", "target");
            }
            this.target = target;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetScalingPolicyResult", "type");
            }
            this.type = type;
            return this;
        }
        public GetScalingPolicyResult build() {
            final var _resultValue = new GetScalingPolicyResult();
            _resultValue.enabled = enabled;
            _resultValue.id = id;
            _resultValue.max = max;
            _resultValue.min = min;
            _resultValue.policy = policy;
            _resultValue.target = target;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
