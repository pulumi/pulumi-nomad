// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPluginNode {
    private Boolean healthy;
    private String healthyDescription;
    private String name;

    private GetPluginNode() {}
    public Boolean healthy() {
        return this.healthy;
    }
    public String healthyDescription() {
        return this.healthyDescription;
    }
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPluginNode defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean healthy;
        private String healthyDescription;
        private String name;
        public Builder() {}
        public Builder(GetPluginNode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthy = defaults.healthy;
    	      this.healthyDescription = defaults.healthyDescription;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder healthy(Boolean healthy) {
            if (healthy == null) {
              throw new MissingRequiredPropertyException("GetPluginNode", "healthy");
            }
            this.healthy = healthy;
            return this;
        }
        @CustomType.Setter
        public Builder healthyDescription(String healthyDescription) {
            if (healthyDescription == null) {
              throw new MissingRequiredPropertyException("GetPluginNode", "healthyDescription");
            }
            this.healthyDescription = healthyDescription;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetPluginNode", "name");
            }
            this.name = name;
            return this;
        }
        public GetPluginNode build() {
            final var _resultValue = new GetPluginNode();
            _resultValue.healthy = healthy;
            _resultValue.healthyDescription = healthyDescription;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
