// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.nomad.outputs.GetPluginNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPluginResult {
    /**
     * @return `(boolean)` Whether a controller is required.
     * 
     */
    private Boolean controllerRequired;
    /**
     * @return `(integer)` The number of registered controllers.
     * 
     */
    private Integer controllersExpected;
    /**
     * @return `(integer)` The number of healthy controllers.
     * 
     */
    private Integer controllersHealthy;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<GetPluginNode> nodes;
    /**
     * @return `(integer)` The number of registered nodes.
     * 
     */
    private Integer nodesExpected;
    /**
     * @return `(integer)` The number of healthy nodes.
     * 
     */
    private Integer nodesHealthy;
    /**
     * @return `(string)` ID of the plugin
     * 
     */
    private String pluginId;
    /**
     * @return `(string)` Plugin provider name
     * 
     */
    private String pluginProvider;
    /**
     * @return `(string)` Plugin provider version
     * 
     */
    private String pluginProviderVersion;
    private @Nullable Boolean waitForHealthy;
    private @Nullable Boolean waitForRegistration;

    private GetPluginResult() {}
    /**
     * @return `(boolean)` Whether a controller is required.
     * 
     */
    public Boolean controllerRequired() {
        return this.controllerRequired;
    }
    /**
     * @return `(integer)` The number of registered controllers.
     * 
     */
    public Integer controllersExpected() {
        return this.controllersExpected;
    }
    /**
     * @return `(integer)` The number of healthy controllers.
     * 
     */
    public Integer controllersHealthy() {
        return this.controllersHealthy;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetPluginNode> nodes() {
        return this.nodes;
    }
    /**
     * @return `(integer)` The number of registered nodes.
     * 
     */
    public Integer nodesExpected() {
        return this.nodesExpected;
    }
    /**
     * @return `(integer)` The number of healthy nodes.
     * 
     */
    public Integer nodesHealthy() {
        return this.nodesHealthy;
    }
    /**
     * @return `(string)` ID of the plugin
     * 
     */
    public String pluginId() {
        return this.pluginId;
    }
    /**
     * @return `(string)` Plugin provider name
     * 
     */
    public String pluginProvider() {
        return this.pluginProvider;
    }
    /**
     * @return `(string)` Plugin provider version
     * 
     */
    public String pluginProviderVersion() {
        return this.pluginProviderVersion;
    }
    public Optional<Boolean> waitForHealthy() {
        return Optional.ofNullable(this.waitForHealthy);
    }
    public Optional<Boolean> waitForRegistration() {
        return Optional.ofNullable(this.waitForRegistration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPluginResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean controllerRequired;
        private Integer controllersExpected;
        private Integer controllersHealthy;
        private String id;
        private List<GetPluginNode> nodes;
        private Integer nodesExpected;
        private Integer nodesHealthy;
        private String pluginId;
        private String pluginProvider;
        private String pluginProviderVersion;
        private @Nullable Boolean waitForHealthy;
        private @Nullable Boolean waitForRegistration;
        public Builder() {}
        public Builder(GetPluginResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.controllerRequired = defaults.controllerRequired;
    	      this.controllersExpected = defaults.controllersExpected;
    	      this.controllersHealthy = defaults.controllersHealthy;
    	      this.id = defaults.id;
    	      this.nodes = defaults.nodes;
    	      this.nodesExpected = defaults.nodesExpected;
    	      this.nodesHealthy = defaults.nodesHealthy;
    	      this.pluginId = defaults.pluginId;
    	      this.pluginProvider = defaults.pluginProvider;
    	      this.pluginProviderVersion = defaults.pluginProviderVersion;
    	      this.waitForHealthy = defaults.waitForHealthy;
    	      this.waitForRegistration = defaults.waitForRegistration;
        }

        @CustomType.Setter
        public Builder controllerRequired(Boolean controllerRequired) {
            this.controllerRequired = Objects.requireNonNull(controllerRequired);
            return this;
        }
        @CustomType.Setter
        public Builder controllersExpected(Integer controllersExpected) {
            this.controllersExpected = Objects.requireNonNull(controllersExpected);
            return this;
        }
        @CustomType.Setter
        public Builder controllersHealthy(Integer controllersHealthy) {
            this.controllersHealthy = Objects.requireNonNull(controllersHealthy);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder nodes(List<GetPluginNode> nodes) {
            this.nodes = Objects.requireNonNull(nodes);
            return this;
        }
        public Builder nodes(GetPluginNode... nodes) {
            return nodes(List.of(nodes));
        }
        @CustomType.Setter
        public Builder nodesExpected(Integer nodesExpected) {
            this.nodesExpected = Objects.requireNonNull(nodesExpected);
            return this;
        }
        @CustomType.Setter
        public Builder nodesHealthy(Integer nodesHealthy) {
            this.nodesHealthy = Objects.requireNonNull(nodesHealthy);
            return this;
        }
        @CustomType.Setter
        public Builder pluginId(String pluginId) {
            this.pluginId = Objects.requireNonNull(pluginId);
            return this;
        }
        @CustomType.Setter
        public Builder pluginProvider(String pluginProvider) {
            this.pluginProvider = Objects.requireNonNull(pluginProvider);
            return this;
        }
        @CustomType.Setter
        public Builder pluginProviderVersion(String pluginProviderVersion) {
            this.pluginProviderVersion = Objects.requireNonNull(pluginProviderVersion);
            return this;
        }
        @CustomType.Setter
        public Builder waitForHealthy(@Nullable Boolean waitForHealthy) {
            this.waitForHealthy = waitForHealthy;
            return this;
        }
        @CustomType.Setter
        public Builder waitForRegistration(@Nullable Boolean waitForRegistration) {
            this.waitForRegistration = waitForRegistration;
            return this;
        }
        public GetPluginResult build() {
            final var _resultValue = new GetPluginResult();
            _resultValue.controllerRequired = controllerRequired;
            _resultValue.controllersExpected = controllersExpected;
            _resultValue.controllersHealthy = controllersHealthy;
            _resultValue.id = id;
            _resultValue.nodes = nodes;
            _resultValue.nodesExpected = nodesExpected;
            _resultValue.nodesHealthy = nodesHealthy;
            _resultValue.pluginId = pluginId;
            _resultValue.pluginProvider = pluginProvider;
            _resultValue.pluginProviderVersion = pluginProviderVersion;
            _resultValue.waitForHealthy = waitForHealthy;
            _resultValue.waitForRegistration = waitForRegistration;
            return _resultValue;
        }
    }
}
