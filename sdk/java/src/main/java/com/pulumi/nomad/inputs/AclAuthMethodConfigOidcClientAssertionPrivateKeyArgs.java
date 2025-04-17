// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AclAuthMethodConfigOidcClientAssertionPrivateKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AclAuthMethodConfigOidcClientAssertionPrivateKeyArgs Empty = new AclAuthMethodConfigOidcClientAssertionPrivateKeyArgs();

    /**
     * `(string: optional)` - Becomes the JWT&#39;s &#34;kid&#34; header.
     * Mutually exclusive with `pem_cert` and `pem_cert_file`.
     * Allowed `key_id_header` values: &#34;kid&#34; (the default)
     * 
     */
    @Import(name="keyId")
    private @Nullable Output<String> keyId;

    /**
     * @return `(string: optional)` - Becomes the JWT&#39;s &#34;kid&#34; header.
     * Mutually exclusive with `pem_cert` and `pem_cert_file`.
     * Allowed `key_id_header` values: &#34;kid&#34; (the default)
     * 
     */
    public Optional<Output<String>> keyId() {
        return Optional.ofNullable(this.keyId);
    }

    /**
     * `(string: optional)` - Which header the provider uses
     * to find the public key to verify the signed JWT.
     * The default and allowed values depend on whether you set `key_id`,
     * `pem_cert`, or `pem_cert_file`. You must set exactly one of those
     * options, so refer to them for their requirements.
     * 
     */
    @Import(name="keyIdHeader")
    private @Nullable Output<String> keyIdHeader;

    /**
     * @return `(string: optional)` - Which header the provider uses
     * to find the public key to verify the signed JWT.
     * The default and allowed values depend on whether you set `key_id`,
     * `pem_cert`, or `pem_cert_file`. You must set exactly one of those
     * options, so refer to them for their requirements.
     * 
     */
    public Optional<Output<String>> keyIdHeader() {
        return Optional.ofNullable(this.keyIdHeader);
    }

    /**
     * `(string: optional)` - An x509 certificate, signed by the
     * private key or a CA, in pem format. Nomad uses this certificate to
     * derive an [x5t#S256][] (or [x5t][]) key_id.
     * Mutually exclusive with `pem_cert_file` and `key_id`.
     * Allowed `key_id_header` values: &#34;x5t&#34;, &#34;x5t#S256&#34; (default &#34;x5t#S256&#34;)
     * 
     */
    @Import(name="pemCert")
    private @Nullable Output<String> pemCert;

    /**
     * @return `(string: optional)` - An x509 certificate, signed by the
     * private key or a CA, in pem format. Nomad uses this certificate to
     * derive an [x5t#S256][] (or [x5t][]) key_id.
     * Mutually exclusive with `pem_cert_file` and `key_id`.
     * Allowed `key_id_header` values: &#34;x5t&#34;, &#34;x5t#S256&#34; (default &#34;x5t#S256&#34;)
     * 
     */
    public Optional<Output<String>> pemCert() {
        return Optional.ofNullable(this.pemCert);
    }

    /**
     * `(string: optional)` - An absolute path to an x509
     * certificate on Nomad servers&#39; disk, signed by the private key or a CA,
     * in pem format.
     * Nomad uses this certificate to derive an [x5t#S256][] (or [x5t][])
     * header. Mutually exclusive with `pem_cert` and key_id.
     * Allowed `key_id_header` values: &#34;x5t&#34;, &#34;x5t#S256&#34; (default &#34;x5t#S256&#34;)
     * 
     */
    @Import(name="pemCertFile")
    private @Nullable Output<String> pemCertFile;

    /**
     * @return `(string: optional)` - An absolute path to an x509
     * certificate on Nomad servers&#39; disk, signed by the private key or a CA,
     * in pem format.
     * Nomad uses this certificate to derive an [x5t#S256][] (or [x5t][])
     * header. Mutually exclusive with `pem_cert` and key_id.
     * Allowed `key_id_header` values: &#34;x5t&#34;, &#34;x5t#S256&#34; (default &#34;x5t#S256&#34;)
     * 
     */
    public Optional<Output<String>> pemCertFile() {
        return Optional.ofNullable(this.pemCertFile);
    }

    /**
     * `(string: &lt;optional&gt;)` - An RSA private key, in pem format.
     * It is used to sign the JWT. Mutually exclusive with `pem_key`.
     * 
     */
    @Import(name="pemKey")
    private @Nullable Output<String> pemKey;

    /**
     * @return `(string: &lt;optional&gt;)` - An RSA private key, in pem format.
     * It is used to sign the JWT. Mutually exclusive with `pem_key`.
     * 
     */
    public Optional<Output<String>> pemKey() {
        return Optional.ofNullable(this.pemKey);
    }

    /**
     * `(string: optional)` - An absolute path to a private key
     * on Nomad servers&#39; disk, in pem format. It is used to sign the JWT.
     * Mutually exclusive with `pem_key_file`.
     * 
     */
    @Import(name="pemKeyFile")
    private @Nullable Output<String> pemKeyFile;

    /**
     * @return `(string: optional)` - An absolute path to a private key
     * on Nomad servers&#39; disk, in pem format. It is used to sign the JWT.
     * Mutually exclusive with `pem_key_file`.
     * 
     */
    public Optional<Output<String>> pemKeyFile() {
        return Optional.ofNullable(this.pemKeyFile);
    }

    private AclAuthMethodConfigOidcClientAssertionPrivateKeyArgs() {}

    private AclAuthMethodConfigOidcClientAssertionPrivateKeyArgs(AclAuthMethodConfigOidcClientAssertionPrivateKeyArgs $) {
        this.keyId = $.keyId;
        this.keyIdHeader = $.keyIdHeader;
        this.pemCert = $.pemCert;
        this.pemCertFile = $.pemCertFile;
        this.pemKey = $.pemKey;
        this.pemKeyFile = $.pemKeyFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AclAuthMethodConfigOidcClientAssertionPrivateKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AclAuthMethodConfigOidcClientAssertionPrivateKeyArgs $;

        public Builder() {
            $ = new AclAuthMethodConfigOidcClientAssertionPrivateKeyArgs();
        }

        public Builder(AclAuthMethodConfigOidcClientAssertionPrivateKeyArgs defaults) {
            $ = new AclAuthMethodConfigOidcClientAssertionPrivateKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyId `(string: optional)` - Becomes the JWT&#39;s &#34;kid&#34; header.
         * Mutually exclusive with `pem_cert` and `pem_cert_file`.
         * Allowed `key_id_header` values: &#34;kid&#34; (the default)
         * 
         * @return builder
         * 
         */
        public Builder keyId(@Nullable Output<String> keyId) {
            $.keyId = keyId;
            return this;
        }

        /**
         * @param keyId `(string: optional)` - Becomes the JWT&#39;s &#34;kid&#34; header.
         * Mutually exclusive with `pem_cert` and `pem_cert_file`.
         * Allowed `key_id_header` values: &#34;kid&#34; (the default)
         * 
         * @return builder
         * 
         */
        public Builder keyId(String keyId) {
            return keyId(Output.of(keyId));
        }

        /**
         * @param keyIdHeader `(string: optional)` - Which header the provider uses
         * to find the public key to verify the signed JWT.
         * The default and allowed values depend on whether you set `key_id`,
         * `pem_cert`, or `pem_cert_file`. You must set exactly one of those
         * options, so refer to them for their requirements.
         * 
         * @return builder
         * 
         */
        public Builder keyIdHeader(@Nullable Output<String> keyIdHeader) {
            $.keyIdHeader = keyIdHeader;
            return this;
        }

        /**
         * @param keyIdHeader `(string: optional)` - Which header the provider uses
         * to find the public key to verify the signed JWT.
         * The default and allowed values depend on whether you set `key_id`,
         * `pem_cert`, or `pem_cert_file`. You must set exactly one of those
         * options, so refer to them for their requirements.
         * 
         * @return builder
         * 
         */
        public Builder keyIdHeader(String keyIdHeader) {
            return keyIdHeader(Output.of(keyIdHeader));
        }

        /**
         * @param pemCert `(string: optional)` - An x509 certificate, signed by the
         * private key or a CA, in pem format. Nomad uses this certificate to
         * derive an [x5t#S256][] (or [x5t][]) key_id.
         * Mutually exclusive with `pem_cert_file` and `key_id`.
         * Allowed `key_id_header` values: &#34;x5t&#34;, &#34;x5t#S256&#34; (default &#34;x5t#S256&#34;)
         * 
         * @return builder
         * 
         */
        public Builder pemCert(@Nullable Output<String> pemCert) {
            $.pemCert = pemCert;
            return this;
        }

        /**
         * @param pemCert `(string: optional)` - An x509 certificate, signed by the
         * private key or a CA, in pem format. Nomad uses this certificate to
         * derive an [x5t#S256][] (or [x5t][]) key_id.
         * Mutually exclusive with `pem_cert_file` and `key_id`.
         * Allowed `key_id_header` values: &#34;x5t&#34;, &#34;x5t#S256&#34; (default &#34;x5t#S256&#34;)
         * 
         * @return builder
         * 
         */
        public Builder pemCert(String pemCert) {
            return pemCert(Output.of(pemCert));
        }

        /**
         * @param pemCertFile `(string: optional)` - An absolute path to an x509
         * certificate on Nomad servers&#39; disk, signed by the private key or a CA,
         * in pem format.
         * Nomad uses this certificate to derive an [x5t#S256][] (or [x5t][])
         * header. Mutually exclusive with `pem_cert` and key_id.
         * Allowed `key_id_header` values: &#34;x5t&#34;, &#34;x5t#S256&#34; (default &#34;x5t#S256&#34;)
         * 
         * @return builder
         * 
         */
        public Builder pemCertFile(@Nullable Output<String> pemCertFile) {
            $.pemCertFile = pemCertFile;
            return this;
        }

        /**
         * @param pemCertFile `(string: optional)` - An absolute path to an x509
         * certificate on Nomad servers&#39; disk, signed by the private key or a CA,
         * in pem format.
         * Nomad uses this certificate to derive an [x5t#S256][] (or [x5t][])
         * header. Mutually exclusive with `pem_cert` and key_id.
         * Allowed `key_id_header` values: &#34;x5t&#34;, &#34;x5t#S256&#34; (default &#34;x5t#S256&#34;)
         * 
         * @return builder
         * 
         */
        public Builder pemCertFile(String pemCertFile) {
            return pemCertFile(Output.of(pemCertFile));
        }

        /**
         * @param pemKey `(string: &lt;optional&gt;)` - An RSA private key, in pem format.
         * It is used to sign the JWT. Mutually exclusive with `pem_key`.
         * 
         * @return builder
         * 
         */
        public Builder pemKey(@Nullable Output<String> pemKey) {
            $.pemKey = pemKey;
            return this;
        }

        /**
         * @param pemKey `(string: &lt;optional&gt;)` - An RSA private key, in pem format.
         * It is used to sign the JWT. Mutually exclusive with `pem_key`.
         * 
         * @return builder
         * 
         */
        public Builder pemKey(String pemKey) {
            return pemKey(Output.of(pemKey));
        }

        /**
         * @param pemKeyFile `(string: optional)` - An absolute path to a private key
         * on Nomad servers&#39; disk, in pem format. It is used to sign the JWT.
         * Mutually exclusive with `pem_key_file`.
         * 
         * @return builder
         * 
         */
        public Builder pemKeyFile(@Nullable Output<String> pemKeyFile) {
            $.pemKeyFile = pemKeyFile;
            return this;
        }

        /**
         * @param pemKeyFile `(string: optional)` - An absolute path to a private key
         * on Nomad servers&#39; disk, in pem format. It is used to sign the JWT.
         * Mutually exclusive with `pem_key_file`.
         * 
         * @return builder
         * 
         */
        public Builder pemKeyFile(String pemKeyFile) {
            return pemKeyFile(Output.of(pemKeyFile));
        }

        public AclAuthMethodConfigOidcClientAssertionPrivateKeyArgs build() {
            return $;
        }
    }

}
