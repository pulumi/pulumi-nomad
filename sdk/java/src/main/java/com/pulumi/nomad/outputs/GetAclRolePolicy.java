// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAclRolePolicy {
    /**
     * @return `(string)` - Unique name of the ACL role.
     * 
     */
    private String name;

    private GetAclRolePolicy() {}
    /**
     * @return `(string)` - Unique name of the ACL role.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAclRolePolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        public Builder() {}
        public Builder(GetAclRolePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetAclRolePolicy", "name");
            }
            this.name = name;
            return this;
        }
        public GetAclRolePolicy build() {
            final var _resultValue = new GetAclRolePolicy();
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
