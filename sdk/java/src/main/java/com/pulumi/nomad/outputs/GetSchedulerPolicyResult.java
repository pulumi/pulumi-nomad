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
public final class GetSchedulerPolicyResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return `(bool: false)` - When `true`, tasks may exceed their reserved memory limit.
     * 
     */
    private Boolean memoryOversubscriptionEnabled;
    /**
     * @return `(map[string]bool)` - Options to enable preemption for various schedulers.
     * 
     */
    private Map<String,Boolean> preemptionConfig;
    /**
     * @return `(string)` - Specifies whether scheduler binpacks or spreads allocations on available nodes.
     * 
     */
    private String schedulerAlgorithm;

    private GetSchedulerPolicyResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return `(bool: false)` - When `true`, tasks may exceed their reserved memory limit.
     * 
     */
    public Boolean memoryOversubscriptionEnabled() {
        return this.memoryOversubscriptionEnabled;
    }
    /**
     * @return `(map[string]bool)` - Options to enable preemption for various schedulers.
     * 
     */
    public Map<String,Boolean> preemptionConfig() {
        return this.preemptionConfig;
    }
    /**
     * @return `(string)` - Specifies whether scheduler binpacks or spreads allocations on available nodes.
     * 
     */
    public String schedulerAlgorithm() {
        return this.schedulerAlgorithm;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSchedulerPolicyResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private Boolean memoryOversubscriptionEnabled;
        private Map<String,Boolean> preemptionConfig;
        private String schedulerAlgorithm;
        public Builder() {}
        public Builder(GetSchedulerPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.memoryOversubscriptionEnabled = defaults.memoryOversubscriptionEnabled;
    	      this.preemptionConfig = defaults.preemptionConfig;
    	      this.schedulerAlgorithm = defaults.schedulerAlgorithm;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSchedulerPolicyResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder memoryOversubscriptionEnabled(Boolean memoryOversubscriptionEnabled) {
            if (memoryOversubscriptionEnabled == null) {
              throw new MissingRequiredPropertyException("GetSchedulerPolicyResult", "memoryOversubscriptionEnabled");
            }
            this.memoryOversubscriptionEnabled = memoryOversubscriptionEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder preemptionConfig(Map<String,Boolean> preemptionConfig) {
            if (preemptionConfig == null) {
              throw new MissingRequiredPropertyException("GetSchedulerPolicyResult", "preemptionConfig");
            }
            this.preemptionConfig = preemptionConfig;
            return this;
        }
        @CustomType.Setter
        public Builder schedulerAlgorithm(String schedulerAlgorithm) {
            if (schedulerAlgorithm == null) {
              throw new MissingRequiredPropertyException("GetSchedulerPolicyResult", "schedulerAlgorithm");
            }
            this.schedulerAlgorithm = schedulerAlgorithm;
            return this;
        }
        public GetSchedulerPolicyResult build() {
            final var _resultValue = new GetSchedulerPolicyResult();
            _resultValue.id = id;
            _resultValue.memoryOversubscriptionEnabled = memoryOversubscriptionEnabled;
            _resultValue.preemptionConfig = preemptionConfig;
            _resultValue.schedulerAlgorithm = schedulerAlgorithm;
            return _resultValue;
        }
    }
}
