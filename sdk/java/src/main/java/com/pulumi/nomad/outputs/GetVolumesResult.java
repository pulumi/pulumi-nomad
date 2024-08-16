// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVolumesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return `string` Volume namespace.
     * 
     */
    private @Nullable String namespace;
    private @Nullable String nodeId;
    private @Nullable String pluginId;
    private @Nullable String type;
    /**
     * @return `list of maps` a list of volumes in the cluster.
     * 
     */
    private List<Map<String,String>> volumes;

    private GetVolumesResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return `string` Volume namespace.
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    public Optional<String> nodeId() {
        return Optional.ofNullable(this.nodeId);
    }
    public Optional<String> pluginId() {
        return Optional.ofNullable(this.pluginId);
    }
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return `list of maps` a list of volumes in the cluster.
     * 
     */
    public List<Map<String,String>> volumes() {
        return this.volumes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVolumesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable String namespace;
        private @Nullable String nodeId;
        private @Nullable String pluginId;
        private @Nullable String type;
        private List<Map<String,String>> volumes;
        public Builder() {}
        public Builder(GetVolumesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.namespace = defaults.namespace;
    	      this.nodeId = defaults.nodeId;
    	      this.pluginId = defaults.pluginId;
    	      this.type = defaults.type;
    	      this.volumes = defaults.volumes;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetVolumesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder namespace(@Nullable String namespace) {

            this.namespace = namespace;
            return this;
        }
        @CustomType.Setter
        public Builder nodeId(@Nullable String nodeId) {

            this.nodeId = nodeId;
            return this;
        }
        @CustomType.Setter
        public Builder pluginId(@Nullable String pluginId) {

            this.pluginId = pluginId;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder volumes(List<Map<String,String>> volumes) {
            if (volumes == null) {
              throw new MissingRequiredPropertyException("GetVolumesResult", "volumes");
            }
            this.volumes = volumes;
            return this;
        }
        public GetVolumesResult build() {
            final var _resultValue = new GetVolumesResult();
            _resultValue.id = id;
            _resultValue.namespace = namespace;
            _resultValue.nodeId = nodeId;
            _resultValue.pluginId = pluginId;
            _resultValue.type = type;
            _resultValue.volumes = volumes;
            return _resultValue;
        }
    }
}
