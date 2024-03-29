// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.nomad.outputs.GetAclTokensAclToken;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAclTokensResult {
    /**
     * @return `(list of objects)` The list of tokens found in the given prefix.
     * 
     */
    private List<GetAclTokensAclToken> aclTokens;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String prefix;

    private GetAclTokensResult() {}
    /**
     * @return `(list of objects)` The list of tokens found in the given prefix.
     * 
     */
    public List<GetAclTokensAclToken> aclTokens() {
        return this.aclTokens;
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

    public static Builder builder(GetAclTokensResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetAclTokensAclToken> aclTokens;
        private String id;
        private @Nullable String prefix;
        public Builder() {}
        public Builder(GetAclTokensResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aclTokens = defaults.aclTokens;
    	      this.id = defaults.id;
    	      this.prefix = defaults.prefix;
        }

        @CustomType.Setter
        public Builder aclTokens(List<GetAclTokensAclToken> aclTokens) {
            if (aclTokens == null) {
              throw new MissingRequiredPropertyException("GetAclTokensResult", "aclTokens");
            }
            this.aclTokens = aclTokens;
            return this;
        }
        public Builder aclTokens(GetAclTokensAclToken... aclTokens) {
            return aclTokens(List.of(aclTokens));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAclTokensResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder prefix(@Nullable String prefix) {

            this.prefix = prefix;
            return this;
        }
        public GetAclTokensResult build() {
            final var _resultValue = new GetAclTokensResult();
            _resultValue.aclTokens = aclTokens;
            _resultValue.id = id;
            _resultValue.prefix = prefix;
            return _resultValue;
        }
    }
}
