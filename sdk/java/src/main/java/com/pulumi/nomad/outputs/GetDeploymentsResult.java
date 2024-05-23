// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetDeploymentsResult {
    /**
     * @return `list of maps` a list of deployments in the cluster.
     * * `ID`: `string` Deployment ID.
     * * `JobID`: `string` Job ID associated with the deployment.
     * * `JobVersion`: `string` Job version.
     * * `Status`: `string` Deployment status.
     * * `StatusDescription`: `string` Detailed description of the deployment&#39;s status.
     * 
     */
    private List<Map<String,Object>> deployments;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;

    private GetDeploymentsResult() {}
    /**
     * @return `list of maps` a list of deployments in the cluster.
     * * `ID`: `string` Deployment ID.
     * * `JobID`: `string` Job ID associated with the deployment.
     * * `JobVersion`: `string` Job version.
     * * `Status`: `string` Deployment status.
     * * `StatusDescription`: `string` Detailed description of the deployment&#39;s status.
     * 
     */
    public List<Map<String,Object>> deployments() {
        return this.deployments;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeploymentsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<Map<String,Object>> deployments;
        private String id;
        public Builder() {}
        public Builder(GetDeploymentsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deployments = defaults.deployments;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder deployments(List<Map<String,Object>> deployments) {
            if (deployments == null) {
              throw new MissingRequiredPropertyException("GetDeploymentsResult", "deployments");
            }
            this.deployments = deployments;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDeploymentsResult", "id");
            }
            this.id = id;
            return this;
        }
        public GetDeploymentsResult build() {
            final var _resultValue = new GetDeploymentsResult();
            _resultValue.deployments = deployments;
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
