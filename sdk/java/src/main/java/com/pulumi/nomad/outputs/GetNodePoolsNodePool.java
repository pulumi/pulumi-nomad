// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.nomad.outputs.GetNodePoolsNodePoolSchedulerConfig;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetNodePoolsNodePool {
    /**
     * @return `(string)` - The description of the node pool.
     * 
     */
    private String description;
    /**
     * @return `(map[string]string)` - Arbitrary KV metadata associated with the
     * node pool.
     * 
     */
    private Map<String,String> meta;
    /**
     * @return `(string)` - The name of the node pool.
     * 
     */
    private String name;
    /**
     * @return `(block)` - Scheduler configuration for the node pool.
     * 
     */
    private List<GetNodePoolsNodePoolSchedulerConfig> schedulerConfigs;

    private GetNodePoolsNodePool() {}
    /**
     * @return `(string)` - The description of the node pool.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return `(map[string]string)` - Arbitrary KV metadata associated with the
     * node pool.
     * 
     */
    public Map<String,String> meta() {
        return this.meta;
    }
    /**
     * @return `(string)` - The name of the node pool.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return `(block)` - Scheduler configuration for the node pool.
     * 
     */
    public List<GetNodePoolsNodePoolSchedulerConfig> schedulerConfigs() {
        return this.schedulerConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodePoolsNodePool defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private Map<String,String> meta;
        private String name;
        private List<GetNodePoolsNodePoolSchedulerConfig> schedulerConfigs;
        public Builder() {}
        public Builder(GetNodePoolsNodePool defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.meta = defaults.meta;
    	      this.name = defaults.name;
    	      this.schedulerConfigs = defaults.schedulerConfigs;
        }

        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder meta(Map<String,String> meta) {
            this.meta = Objects.requireNonNull(meta);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder schedulerConfigs(List<GetNodePoolsNodePoolSchedulerConfig> schedulerConfigs) {
            this.schedulerConfigs = Objects.requireNonNull(schedulerConfigs);
            return this;
        }
        public Builder schedulerConfigs(GetNodePoolsNodePoolSchedulerConfig... schedulerConfigs) {
            return schedulerConfigs(List.of(schedulerConfigs));
        }
        public GetNodePoolsNodePool build() {
            final var _resultValue = new GetNodePoolsNodePool();
            _resultValue.description = description;
            _resultValue.meta = meta;
            _resultValue.name = name;
            _resultValue.schedulerConfigs = schedulerConfigs;
            return _resultValue;
        }
    }
}
