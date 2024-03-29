// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAclPolicyResult {
    /**
     * @return `(string)` - the description of the ACL Policy.
     * 
     */
    private String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return `(string)` - the name of the ACL Policy.
     * 
     */
    private String name;
    /**
     * @return `(string)` - the ACL Policy rules in HCL format.
     * 
     */
    private String rules;

    private GetAclPolicyResult() {}
    /**
     * @return `(string)` - the description of the ACL Policy.
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
     * @return `(string)` - the name of the ACL Policy.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return `(string)` - the ACL Policy rules in HCL format.
     * 
     */
    public String rules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAclPolicyResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String id;
        private String name;
        private String rules;
        public Builder() {}
        public Builder(GetAclPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.rules = defaults.rules;
        }

        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetAclPolicyResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAclPolicyResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetAclPolicyResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder rules(String rules) {
            if (rules == null) {
              throw new MissingRequiredPropertyException("GetAclPolicyResult", "rules");
            }
            this.rules = rules;
            return this;
        }
        public GetAclPolicyResult build() {
            final var _resultValue = new GetAclPolicyResult();
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.rules = rules;
            return _resultValue;
        }
    }
}
