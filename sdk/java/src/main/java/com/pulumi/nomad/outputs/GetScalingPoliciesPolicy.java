// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetScalingPoliciesPolicy {
    /**
     * @return `(boolean)` - Whether or not the scaling policy is enabled.
     * 
     */
    private Boolean enabled;
    /**
     * @return `(string)` - The scaling policy ID.
     * 
     */
    private String id;
    /**
     * @return `(map[string]string)` - The scaling policy target.
     * 
     */
    private Map<String,String> target;
    /**
     * @return `(string)` - An optional string to filter scaling policies based on policy type. If not provided, policies of all types are returned.
     * 
     */
    private String type;

    private GetScalingPoliciesPolicy() {}
    /**
     * @return `(boolean)` - Whether or not the scaling policy is enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return `(string)` - The scaling policy ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return `(map[string]string)` - The scaling policy target.
     * 
     */
    public Map<String,String> target() {
        return this.target;
    }
    /**
     * @return `(string)` - An optional string to filter scaling policies based on policy type. If not provided, policies of all types are returned.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScalingPoliciesPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private String id;
        private Map<String,String> target;
        private String type;
        public Builder() {}
        public Builder(GetScalingPoliciesPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.target = defaults.target;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetScalingPoliciesPolicy", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetScalingPoliciesPolicy", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder target(Map<String,String> target) {
            if (target == null) {
              throw new MissingRequiredPropertyException("GetScalingPoliciesPolicy", "target");
            }
            this.target = target;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetScalingPoliciesPolicy", "type");
            }
            this.type = type;
            return this;
        }
        public GetScalingPoliciesPolicy build() {
            final var _resultValue = new GetScalingPoliciesPolicy();
            _resultValue.enabled = enabled;
            _resultValue.id = id;
            _resultValue.target = target;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
