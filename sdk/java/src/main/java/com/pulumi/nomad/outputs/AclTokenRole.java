// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AclTokenRole {
    /**
     * @return The ID of the ACL role to link.
     * 
     */
    private String id;
    /**
     * @return `(string: &#34;&#34;)` - A human-friendly name for this token.
     * 
     */
    private @Nullable String name;

    private AclTokenRole() {}
    /**
     * @return The ID of the ACL role to link.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return `(string: &#34;&#34;)` - A human-friendly name for this token.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AclTokenRole defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable String name;
        public Builder() {}
        public Builder(AclTokenRole defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("AclTokenRole", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        public AclTokenRole build() {
            final var _resultValue = new AclTokenRole();
            _resultValue.id = id;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}