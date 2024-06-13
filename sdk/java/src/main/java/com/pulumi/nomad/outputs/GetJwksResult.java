// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.nomad.outputs.GetJwksKey;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetJwksResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return `list of maps` a list of JWK keys in structured format: see [RFC7517](https://datatracker.ietf.org/doc/html/rfc7517) for the
     * JWK field meanings.
     * 
     */
    private List<GetJwksKey> keys;
    /**
     * @return `list of strings` a list JWK keys rendered as PEM-encoded X.509 keys
     * 
     */
    private List<String> pemKeys;

    private GetJwksResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return `list of maps` a list of JWK keys in structured format: see [RFC7517](https://datatracker.ietf.org/doc/html/rfc7517) for the
     * JWK field meanings.
     * 
     */
    public List<GetJwksKey> keys() {
        return this.keys;
    }
    /**
     * @return `list of strings` a list JWK keys rendered as PEM-encoded X.509 keys
     * 
     */
    public List<String> pemKeys() {
        return this.pemKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJwksResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<GetJwksKey> keys;
        private List<String> pemKeys;
        public Builder() {}
        public Builder(GetJwksResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.keys = defaults.keys;
    	      this.pemKeys = defaults.pemKeys;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetJwksResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder keys(List<GetJwksKey> keys) {
            if (keys == null) {
              throw new MissingRequiredPropertyException("GetJwksResult", "keys");
            }
            this.keys = keys;
            return this;
        }
        public Builder keys(GetJwksKey... keys) {
            return keys(List.of(keys));
        }
        @CustomType.Setter
        public Builder pemKeys(List<String> pemKeys) {
            if (pemKeys == null) {
              throw new MissingRequiredPropertyException("GetJwksResult", "pemKeys");
            }
            this.pemKeys = pemKeys;
            return this;
        }
        public Builder pemKeys(String... pemKeys) {
            return pemKeys(List.of(pemKeys));
        }
        public GetJwksResult build() {
            final var _resultValue = new GetJwksResult();
            _resultValue.id = id;
            _resultValue.keys = keys;
            _resultValue.pemKeys = pemKeys;
            return _resultValue;
        }
    }
}