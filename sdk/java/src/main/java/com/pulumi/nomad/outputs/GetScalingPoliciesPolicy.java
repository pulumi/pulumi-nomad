// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
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
    private Map<String,Object> target;
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
    public Map<String,Object> target() {
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
        private Map<String,Object> target;
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
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder target(Map<String,Object> target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetScalingPoliciesPolicy build() {
            final var o = new GetScalingPoliciesPolicy();
            o.enabled = enabled;
            o.id = id;
            o.target = target;
            o.type = type;
            return o;
        }
    }
}
