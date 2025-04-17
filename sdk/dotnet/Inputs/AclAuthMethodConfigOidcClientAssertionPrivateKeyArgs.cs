// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad.Inputs
{

    public sealed class AclAuthMethodConfigOidcClientAssertionPrivateKeyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// `(string: optional)` - Becomes the JWT's "kid" header.
        /// Mutually exclusive with `pem_cert` and `pem_cert_file`.
        /// Allowed `key_id_header` values: "kid" (the default)
        /// </summary>
        [Input("keyId")]
        public Input<string>? KeyId { get; set; }

        /// <summary>
        /// `(string: optional)` - Which header the provider uses
        /// to find the public key to verify the signed JWT.
        /// The default and allowed values depend on whether you set `key_id`,
        /// `pem_cert`, or `pem_cert_file`. You must set exactly one of those
        /// options, so refer to them for their requirements.
        /// </summary>
        [Input("keyIdHeader")]
        public Input<string>? KeyIdHeader { get; set; }

        /// <summary>
        /// `(string: optional)` - An x509 certificate, signed by the
        /// private key or a CA, in pem format. Nomad uses this certificate to
        /// derive an [x5t#S256][] (or [x5t][]) key_id.
        /// Mutually exclusive with `pem_cert_file` and `key_id`.
        /// Allowed `key_id_header` values: "x5t", "x5t#S256" (default "x5t#S256")
        /// </summary>
        [Input("pemCert")]
        public Input<string>? PemCert { get; set; }

        /// <summary>
        /// `(string: optional)` - An absolute path to an x509
        /// certificate on Nomad servers' disk, signed by the private key or a CA,
        /// in pem format.
        /// Nomad uses this certificate to derive an [x5t#S256][] (or [x5t][])
        /// header. Mutually exclusive with `pem_cert` and key_id.
        /// Allowed `key_id_header` values: "x5t", "x5t#S256" (default "x5t#S256")
        /// </summary>
        [Input("pemCertFile")]
        public Input<string>? PemCertFile { get; set; }

        [Input("pemKey")]
        private Input<string>? _pemKey;

        /// <summary>
        /// `(string: &lt;optional&gt;)` - An RSA private key, in pem format.
        /// It is used to sign the JWT. Mutually exclusive with `pem_key`.
        /// </summary>
        public Input<string>? PemKey
        {
            get => _pemKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _pemKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// `(string: optional)` - An absolute path to a private key
        /// on Nomad servers' disk, in pem format. It is used to sign the JWT.
        /// Mutually exclusive with `pem_key_file`.
        /// </summary>
        [Input("pemKeyFile")]
        public Input<string>? PemKeyFile { get; set; }

        public AclAuthMethodConfigOidcClientAssertionPrivateKeyArgs()
        {
        }
        public static new AclAuthMethodConfigOidcClientAssertionPrivateKeyArgs Empty => new AclAuthMethodConfigOidcClientAssertionPrivateKeyArgs();
    }
}
