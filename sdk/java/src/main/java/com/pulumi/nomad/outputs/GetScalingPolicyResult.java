// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetScalingPolicyResult {
    private Boolean enabled;
    private String id;
    private Integer max;
    private Integer min;
    private String policy;
    private Map<String,Object> target;
    private String type;

    private GetScalingPolicyResult() {}
    public Boolean enabled() {
        return this.enabled;
    }
    public String id() {
        return this.id;
    }
    public Integer max() {
        return this.max;
    }
    public Integer min() {
        return this.min;
    }
    public String policy() {
        return this.policy;
    }
    public Map<String,Object> target() {
        return this.target;
    }
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
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder max(Integer max) {
            this.max = Objects.requireNonNull(max);
            return this;
        }
        @CustomType.Setter
        public Builder min(Integer min) {
            this.min = Objects.requireNonNull(min);
            return this;
        }
        @CustomType.Setter
        public Builder policy(String policy) {
            this.policy = Objects.requireNonNull(policy);
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
        public GetScalingPolicyResult build() {
            final var o = new GetScalingPolicyResult();
            o.enabled = enabled;
            o.id = id;
            o.max = max;
            o.min = min;
            o.policy = policy;
            o.target = target;
            o.type = type;
            return o;
        }
    }
}