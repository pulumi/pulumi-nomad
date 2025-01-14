// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.nomad.outputs.GetScalingPoliciesPolicy;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetScalingPoliciesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String jobId;
    /**
     * @return `list of maps` - A list of scaling policies.
     * 
     */
    private List<GetScalingPoliciesPolicy> policies;
    /**
     * @return `(string)` - The scaling policy type.
     * 
     */
    private @Nullable String type;

    private GetScalingPoliciesResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> jobId() {
        return Optional.ofNullable(this.jobId);
    }
    /**
     * @return `list of maps` - A list of scaling policies.
     * 
     */
    public List<GetScalingPoliciesPolicy> policies() {
        return this.policies;
    }
    /**
     * @return `(string)` - The scaling policy type.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScalingPoliciesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable String jobId;
        private List<GetScalingPoliciesPolicy> policies;
        private @Nullable String type;
        public Builder() {}
        public Builder(GetScalingPoliciesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.jobId = defaults.jobId;
    	      this.policies = defaults.policies;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetScalingPoliciesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder jobId(@Nullable String jobId) {

            this.jobId = jobId;
            return this;
        }
        @CustomType.Setter
        public Builder policies(List<GetScalingPoliciesPolicy> policies) {
            if (policies == null) {
              throw new MissingRequiredPropertyException("GetScalingPoliciesResult", "policies");
            }
            this.policies = policies;
            return this;
        }
        public Builder policies(GetScalingPoliciesPolicy... policies) {
            return policies(List.of(policies));
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public GetScalingPoliciesResult build() {
            final var _resultValue = new GetScalingPoliciesResult();
            _resultValue.id = id;
            _resultValue.jobId = jobId;
            _resultValue.policies = policies;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}