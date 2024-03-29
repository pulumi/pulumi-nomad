// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.nomad.outputs.GetNamespaceCapability;
import com.pulumi.nomad.outputs.GetNamespaceNodePoolConfig;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetNamespaceResult {
    /**
     * @return `(block)` - Capabilities of the namespace
     * 
     */
    private List<GetNamespaceCapability> capabilities;
    /**
     * @return `(string)` - The description of the namespace.
     * 
     */
    private String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return `(map[string]string)` -  Arbitrary KV metadata associated with the namespace.
     * 
     */
    private Map<String,String> meta;
    private String name;
    private List<GetNamespaceNodePoolConfig> nodePoolConfigs;
    /**
     * @return `(string)` - The quota associated with the namespace.
     * 
     */
    private String quota;

    private GetNamespaceResult() {}
    /**
     * @return `(block)` - Capabilities of the namespace
     * 
     */
    public List<GetNamespaceCapability> capabilities() {
        return this.capabilities;
    }
    /**
     * @return `(string)` - The description of the namespace.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return `(map[string]string)` -  Arbitrary KV metadata associated with the namespace.
     * 
     */
    public Map<String,String> meta() {
        return this.meta;
    }
    public String name() {
        return this.name;
    }
    public List<GetNamespaceNodePoolConfig> nodePoolConfigs() {
        return this.nodePoolConfigs;
    }
    /**
     * @return `(string)` - The quota associated with the namespace.
     * 
     */
    public String quota() {
        return this.quota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNamespaceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetNamespaceCapability> capabilities;
        private String description;
        private String id;
        private Map<String,String> meta;
        private String name;
        private List<GetNamespaceNodePoolConfig> nodePoolConfigs;
        private String quota;
        public Builder() {}
        public Builder(GetNamespaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capabilities = defaults.capabilities;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.meta = defaults.meta;
    	      this.name = defaults.name;
    	      this.nodePoolConfigs = defaults.nodePoolConfigs;
    	      this.quota = defaults.quota;
        }

        @CustomType.Setter
        public Builder capabilities(List<GetNamespaceCapability> capabilities) {
            if (capabilities == null) {
              throw new MissingRequiredPropertyException("GetNamespaceResult", "capabilities");
            }
            this.capabilities = capabilities;
            return this;
        }
        public Builder capabilities(GetNamespaceCapability... capabilities) {
            return capabilities(List.of(capabilities));
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetNamespaceResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetNamespaceResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder meta(Map<String,String> meta) {
            if (meta == null) {
              throw new MissingRequiredPropertyException("GetNamespaceResult", "meta");
            }
            this.meta = meta;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetNamespaceResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder nodePoolConfigs(List<GetNamespaceNodePoolConfig> nodePoolConfigs) {
            if (nodePoolConfigs == null) {
              throw new MissingRequiredPropertyException("GetNamespaceResult", "nodePoolConfigs");
            }
            this.nodePoolConfigs = nodePoolConfigs;
            return this;
        }
        public Builder nodePoolConfigs(GetNamespaceNodePoolConfig... nodePoolConfigs) {
            return nodePoolConfigs(List.of(nodePoolConfigs));
        }
        @CustomType.Setter
        public Builder quota(String quota) {
            if (quota == null) {
              throw new MissingRequiredPropertyException("GetNamespaceResult", "quota");
            }
            this.quota = quota;
            return this;
        }
        public GetNamespaceResult build() {
            final var _resultValue = new GetNamespaceResult();
            _resultValue.capabilities = capabilities;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.meta = meta;
            _resultValue.name = name;
            _resultValue.nodePoolConfigs = nodePoolConfigs;
            _resultValue.quota = quota;
            return _resultValue;
        }
    }
}
