// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.nomad.outputs.GetAclRolesAclRole;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAclRolesResult {
    private List<GetAclRolesAclRole> aclRoles;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String prefix;

    private GetAclRolesResult() {}
    public List<GetAclRolesAclRole> aclRoles() {
        return this.aclRoles;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAclRolesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetAclRolesAclRole> aclRoles;
        private String id;
        private @Nullable String prefix;
        public Builder() {}
        public Builder(GetAclRolesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aclRoles = defaults.aclRoles;
    	      this.id = defaults.id;
    	      this.prefix = defaults.prefix;
        }

        @CustomType.Setter
        public Builder aclRoles(List<GetAclRolesAclRole> aclRoles) {
            this.aclRoles = Objects.requireNonNull(aclRoles);
            return this;
        }
        public Builder aclRoles(GetAclRolesAclRole... aclRoles) {
            return aclRoles(List.of(aclRoles));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }
        public GetAclRolesResult build() {
            final var o = new GetAclRolesResult();
            o.aclRoles = aclRoles;
            o.id = id;
            o.prefix = prefix;
            return o;
        }
    }
}
