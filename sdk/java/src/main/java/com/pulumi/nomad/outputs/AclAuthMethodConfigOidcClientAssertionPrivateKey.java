// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AclAuthMethodConfigOidcClientAssertionPrivateKey {
    /**
     * @return `(string: optional)` - Becomes the JWT&#39;s &#34;kid&#34; header.
     * Mutually exclusive with `pem_cert` and `pem_cert_file`.
     * Allowed `key_id_header` values: &#34;kid&#34; (the default)
     * 
     */
    private @Nullable String keyId;
    /**
     * @return `(string: optional)` - Which header the provider uses
     * to find the public key to verify the signed JWT.
     * The default and allowed values depend on whether you set `key_id`,
     * `pem_cert`, or `pem_cert_file`. You must set exactly one of those
     * options, so refer to them for their requirements.
     * 
     */
    private @Nullable String keyIdHeader;
    /**
     * @return `(string: optional)` - An x509 certificate, signed by the
     * private key or a CA, in pem format. Nomad uses this certificate to
     * derive an [x5t#S256][] (or [x5t][]) key_id.
     * Mutually exclusive with `pem_cert_file` and `key_id`.
     * Allowed `key_id_header` values: &#34;x5t&#34;, &#34;x5t#S256&#34; (default &#34;x5t#S256&#34;)
     * 
     */
    private @Nullable String pemCert;
    /**
     * @return `(string: optional)` - An absolute path to an x509
     * certificate on Nomad servers&#39; disk, signed by the private key or a CA,
     * in pem format.
     * Nomad uses this certificate to derive an [x5t#S256][] (or [x5t][])
     * header. Mutually exclusive with `pem_cert` and key_id.
     * Allowed `key_id_header` values: &#34;x5t&#34;, &#34;x5t#S256&#34; (default &#34;x5t#S256&#34;)
     * 
     */
    private @Nullable String pemCertFile;
    /**
     * @return `(string: &lt;optional&gt;)` - An RSA private key, in pem format.
     * It is used to sign the JWT. Mutually exclusive with `pem_key`.
     * 
     */
    private @Nullable String pemKey;
    /**
     * @return `(string: optional)` - An absolute path to a private key
     * on Nomad servers&#39; disk, in pem format. It is used to sign the JWT.
     * Mutually exclusive with `pem_key_file`.
     * 
     */
    private @Nullable String pemKeyFile;

    private AclAuthMethodConfigOidcClientAssertionPrivateKey() {}
    /**
     * @return `(string: optional)` - Becomes the JWT&#39;s &#34;kid&#34; header.
     * Mutually exclusive with `pem_cert` and `pem_cert_file`.
     * Allowed `key_id_header` values: &#34;kid&#34; (the default)
     * 
     */
    public Optional<String> keyId() {
        return Optional.ofNullable(this.keyId);
    }
    /**
     * @return `(string: optional)` - Which header the provider uses
     * to find the public key to verify the signed JWT.
     * The default and allowed values depend on whether you set `key_id`,
     * `pem_cert`, or `pem_cert_file`. You must set exactly one of those
     * options, so refer to them for their requirements.
     * 
     */
    public Optional<String> keyIdHeader() {
        return Optional.ofNullable(this.keyIdHeader);
    }
    /**
     * @return `(string: optional)` - An x509 certificate, signed by the
     * private key or a CA, in pem format. Nomad uses this certificate to
     * derive an [x5t#S256][] (or [x5t][]) key_id.
     * Mutually exclusive with `pem_cert_file` and `key_id`.
     * Allowed `key_id_header` values: &#34;x5t&#34;, &#34;x5t#S256&#34; (default &#34;x5t#S256&#34;)
     * 
     */
    public Optional<String> pemCert() {
        return Optional.ofNullable(this.pemCert);
    }
    /**
     * @return `(string: optional)` - An absolute path to an x509
     * certificate on Nomad servers&#39; disk, signed by the private key or a CA,
     * in pem format.
     * Nomad uses this certificate to derive an [x5t#S256][] (or [x5t][])
     * header. Mutually exclusive with `pem_cert` and key_id.
     * Allowed `key_id_header` values: &#34;x5t&#34;, &#34;x5t#S256&#34; (default &#34;x5t#S256&#34;)
     * 
     */
    public Optional<String> pemCertFile() {
        return Optional.ofNullable(this.pemCertFile);
    }
    /**
     * @return `(string: &lt;optional&gt;)` - An RSA private key, in pem format.
     * It is used to sign the JWT. Mutually exclusive with `pem_key`.
     * 
     */
    public Optional<String> pemKey() {
        return Optional.ofNullable(this.pemKey);
    }
    /**
     * @return `(string: optional)` - An absolute path to a private key
     * on Nomad servers&#39; disk, in pem format. It is used to sign the JWT.
     * Mutually exclusive with `pem_key_file`.
     * 
     */
    public Optional<String> pemKeyFile() {
        return Optional.ofNullable(this.pemKeyFile);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AclAuthMethodConfigOidcClientAssertionPrivateKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String keyId;
        private @Nullable String keyIdHeader;
        private @Nullable String pemCert;
        private @Nullable String pemCertFile;
        private @Nullable String pemKey;
        private @Nullable String pemKeyFile;
        public Builder() {}
        public Builder(AclAuthMethodConfigOidcClientAssertionPrivateKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyId = defaults.keyId;
    	      this.keyIdHeader = defaults.keyIdHeader;
    	      this.pemCert = defaults.pemCert;
    	      this.pemCertFile = defaults.pemCertFile;
    	      this.pemKey = defaults.pemKey;
    	      this.pemKeyFile = defaults.pemKeyFile;
        }

        @CustomType.Setter
        public Builder keyId(@Nullable String keyId) {

            this.keyId = keyId;
            return this;
        }
        @CustomType.Setter
        public Builder keyIdHeader(@Nullable String keyIdHeader) {

            this.keyIdHeader = keyIdHeader;
            return this;
        }
        @CustomType.Setter
        public Builder pemCert(@Nullable String pemCert) {

            this.pemCert = pemCert;
            return this;
        }
        @CustomType.Setter
        public Builder pemCertFile(@Nullable String pemCertFile) {

            this.pemCertFile = pemCertFile;
            return this;
        }
        @CustomType.Setter
        public Builder pemKey(@Nullable String pemKey) {

            this.pemKey = pemKey;
            return this;
        }
        @CustomType.Setter
        public Builder pemKeyFile(@Nullable String pemKeyFile) {

            this.pemKeyFile = pemKeyFile;
            return this;
        }
        public AclAuthMethodConfigOidcClientAssertionPrivateKey build() {
            final var _resultValue = new AclAuthMethodConfigOidcClientAssertionPrivateKey();
            _resultValue.keyId = keyId;
            _resultValue.keyIdHeader = keyIdHeader;
            _resultValue.pemCert = pemCert;
            _resultValue.pemCertFile = pemCertFile;
            _resultValue.pemKey = pemKey;
            _resultValue.pemKeyFile = pemKeyFile;
            return _resultValue;
        }
    }
}
