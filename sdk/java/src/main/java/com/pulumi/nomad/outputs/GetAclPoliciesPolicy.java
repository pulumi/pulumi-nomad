// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAclPoliciesPolicy {
    /**
     * @return `(string)` - the description of the ACL Policy.
     * 
     */
    private String description;
    /**
     * @return `(string)` - the name of the ACL Policy.
     * 
     */
    private String name;

    private GetAclPoliciesPolicy() {}
    /**
     * @return `(string)` - the description of the ACL Policy.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return `(string)` - the name of the ACL Policy.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAclPoliciesPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String name;
        public Builder() {}
        public Builder(GetAclPoliciesPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetAclPoliciesPolicy", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetAclPoliciesPolicy", "name");
            }
            this.name = name;
            return this;
        }
        public GetAclPoliciesPolicy build() {
            final var _resultValue = new GetAclPoliciesPolicy();
            _resultValue.description = description;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
