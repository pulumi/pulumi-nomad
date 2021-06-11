// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * The provider type for the nomad package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 */
export class Provider extends pulumi.ProviderResource {
    /** @internal */
    public static readonly __pulumiType = 'nomad';

    /**
     * Returns true if the given object is an instance of Provider.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Provider {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Provider.__pulumiType;
    }

    /**
     * URL of the root of the target Nomad agent.
     */
    public readonly address!: pulumi.Output<string>;
    /**
     * A path to a PEM-encoded certificate authority used to verify the remote agent's certificate.
     */
    public readonly caFile!: pulumi.Output<string | undefined>;
    /**
     * PEM-encoded certificate authority used to verify the remote agent's certificate.
     */
    public readonly caPem!: pulumi.Output<string | undefined>;
    /**
     * A path to a PEM-encoded certificate provided to the remote agent; requires use of key_file or key_pem.
     */
    public readonly certFile!: pulumi.Output<string | undefined>;
    /**
     * PEM-encoded certificate provided to the remote agent; requires use of key_file or key_pem.
     */
    public readonly certPem!: pulumi.Output<string | undefined>;
    /**
     * Consul token to validate Consul Connect Service Identity policies specified in the job file.
     */
    public readonly consulToken!: pulumi.Output<string | undefined>;
    /**
     * HTTP basic auth configuration.
     */
    public readonly httpAuth!: pulumi.Output<string | undefined>;
    /**
     * A path to a PEM-encoded private key, required if cert_file or cert_pem is specified.
     */
    public readonly keyFile!: pulumi.Output<string | undefined>;
    /**
     * PEM-encoded private key, required if cert_file or cert_pem is specified.
     */
    public readonly keyPem!: pulumi.Output<string | undefined>;
    /**
     * Region of the target Nomad agent.
     */
    public readonly region!: pulumi.Output<string | undefined>;
    /**
     * ACL token secret for API requests.
     */
    public readonly secretId!: pulumi.Output<string | undefined>;
    /**
     * Vault token if policies are specified in the job file.
     */
    public readonly vaultToken!: pulumi.Output<string | undefined>;

    /**
     * Create a Provider resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProviderArgs, opts?: pulumi.ResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        {
            if ((!args || args.address === undefined) && !opts.urn) {
                throw new Error("Missing required property 'address'");
            }
            inputs["address"] = args ? args.address : undefined;
            inputs["caFile"] = args ? args.caFile : undefined;
            inputs["caPem"] = args ? args.caPem : undefined;
            inputs["certFile"] = args ? args.certFile : undefined;
            inputs["certPem"] = args ? args.certPem : undefined;
            inputs["consulToken"] = args ? args.consulToken : undefined;
            inputs["headers"] = pulumi.output(args ? args.headers : undefined).apply(JSON.stringify);
            inputs["httpAuth"] = args ? args.httpAuth : undefined;
            inputs["keyFile"] = args ? args.keyFile : undefined;
            inputs["keyPem"] = args ? args.keyPem : undefined;
            inputs["region"] = args ? args.region : undefined;
            inputs["secretId"] = args ? args.secretId : undefined;
            inputs["vaultToken"] = args ? args.vaultToken : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Provider.__pulumiType, name, inputs, opts);
    }
}

/**
 * The set of arguments for constructing a Provider resource.
 */
export interface ProviderArgs {
    /**
     * URL of the root of the target Nomad agent.
     */
    address: pulumi.Input<string>;
    /**
     * A path to a PEM-encoded certificate authority used to verify the remote agent's certificate.
     */
    caFile?: pulumi.Input<string>;
    /**
     * PEM-encoded certificate authority used to verify the remote agent's certificate.
     */
    caPem?: pulumi.Input<string>;
    /**
     * A path to a PEM-encoded certificate provided to the remote agent; requires use of key_file or key_pem.
     */
    certFile?: pulumi.Input<string>;
    /**
     * PEM-encoded certificate provided to the remote agent; requires use of key_file or key_pem.
     */
    certPem?: pulumi.Input<string>;
    /**
     * Consul token to validate Consul Connect Service Identity policies specified in the job file.
     */
    consulToken?: pulumi.Input<string>;
    /**
     * The headers to send with each Nomad request.
     */
    headers?: pulumi.Input<pulumi.Input<inputs.ProviderHeader>[]>;
    /**
     * HTTP basic auth configuration.
     */
    httpAuth?: pulumi.Input<string>;
    /**
     * A path to a PEM-encoded private key, required if cert_file or cert_pem is specified.
     */
    keyFile?: pulumi.Input<string>;
    /**
     * PEM-encoded private key, required if cert_file or cert_pem is specified.
     */
    keyPem?: pulumi.Input<string>;
    /**
     * Region of the target Nomad agent.
     */
    region?: pulumi.Input<string>;
    /**
     * ACL token secret for API requests.
     */
    secretId?: pulumi.Input<string>;
    /**
     * Vault token if policies are specified in the job file.
     */
    vaultToken?: pulumi.Input<string>;
}
