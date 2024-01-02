// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVariableResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return `(map[string]string)` - Map of items in the variable.
     * 
     */
    private Map<String,Object> items;
    /**
     * @return `(string)` - The namespace in which the variable exists.
     * 
     */
    private @Nullable String namespace;
    /**
     * @return `(string)` - The path at which the variable exists.
     * 
     */
    private String path;

    private GetVariableResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return `(map[string]string)` - Map of items in the variable.
     * 
     */
    public Map<String,Object> items() {
        return this.items;
    }
    /**
     * @return `(string)` - The namespace in which the variable exists.
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    /**
     * @return `(string)` - The path at which the variable exists.
     * 
     */
    public String path() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVariableResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private Map<String,Object> items;
        private @Nullable String namespace;
        private String path;
        public Builder() {}
        public Builder(GetVariableResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.items = defaults.items;
    	      this.namespace = defaults.namespace;
    	      this.path = defaults.path;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetVariableResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder items(Map<String,Object> items) {
            if (items == null) {
              throw new MissingRequiredPropertyException("GetVariableResult", "items");
            }
            this.items = items;
            return this;
        }
        @CustomType.Setter
        public Builder namespace(@Nullable String namespace) {

            this.namespace = namespace;
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            if (path == null) {
              throw new MissingRequiredPropertyException("GetVariableResult", "path");
            }
            this.path = path;
            return this;
        }
        public GetVariableResult build() {
            final var _resultValue = new GetVariableResult();
            _resultValue.id = id;
            _resultValue.items = items;
            _resultValue.namespace = namespace;
            _resultValue.path = path;
            return _resultValue;
        }
    }
}
