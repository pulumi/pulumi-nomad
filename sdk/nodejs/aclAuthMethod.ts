// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Manages an ACL Auth Method in Nomad.
 *
 * ## Example Usage
 *
 * Creating an ALC Auth Method:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const myNomadAclAuthMethod = new nomad.AclAuthMethod("myNomadAclAuthMethod", {
 *     type: "OIDC",
 *     tokenLocality: "global",
 *     maxTokenTtl: "10m0s",
 *     "default": true,
 *     config: {
 *         oidcDiscoveryUrl: "https://uk.auth0.com/",
 *         oidcClientId: "someclientid",
 *         oidcClientSecret: "someclientsecret-t",
 *         boundAudiences: ["someclientid"],
 *         allowedRedirectUris: [
 *             "http://localhost:4649/oidc/callback",
 *             "http://localhost:4646/ui/settings/tokens",
 *         ],
 *         listClaimMappings: {
 *             "http://nomad.internal/roles": "roles",
 *         },
 *     },
 * });
 * ```
 */
export class AclAuthMethod extends pulumi.CustomResource {
    /**
     * Get an existing AclAuthMethod resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AclAuthMethodState, opts?: pulumi.CustomResourceOptions): AclAuthMethod {
        return new AclAuthMethod(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'nomad:index/aclAuthMethod:AclAuthMethod';

    /**
     * Returns true if the given object is an instance of AclAuthMethod.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AclAuthMethod {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AclAuthMethod.__pulumiType;
    }

    /**
     * Configuration specific to the auth method provider.
     */
    public readonly config!: pulumi.Output<outputs.AclAuthMethodConfig>;
    /**
     * `(bool: false)` - Defines whether this ACL Auth Method is to be set
     * as default.
     */
    public readonly default!: pulumi.Output<boolean | undefined>;
    /**
     * `(string: <required>)` - Defines the maximum life of a token 
     * created by this method and is specified as a time duration such as "15h".
     */
    public readonly maxTokenTtl!: pulumi.Output<string>;
    /**
     * `(string: <required>)` - The identifier of the ACL Auth Method.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * `(string: <required>)` - Defines whether the ACL Auth Method
     * creates a local or global token when performing SSO login. This field must be
     * set to either `local` or `global`.
     */
    public readonly tokenLocality!: pulumi.Output<string>;
    /**
     * `(string: <required>)` - ACL Auth Method SSO workflow type. Currently,
     * the only supported type is `OIDC`.
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a AclAuthMethod resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AclAuthMethodArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AclAuthMethodArgs | AclAuthMethodState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AclAuthMethodState | undefined;
            resourceInputs["config"] = state ? state.config : undefined;
            resourceInputs["default"] = state ? state.default : undefined;
            resourceInputs["maxTokenTtl"] = state ? state.maxTokenTtl : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["tokenLocality"] = state ? state.tokenLocality : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as AclAuthMethodArgs | undefined;
            if ((!args || args.config === undefined) && !opts.urn) {
                throw new Error("Missing required property 'config'");
            }
            if ((!args || args.maxTokenTtl === undefined) && !opts.urn) {
                throw new Error("Missing required property 'maxTokenTtl'");
            }
            if ((!args || args.tokenLocality === undefined) && !opts.urn) {
                throw new Error("Missing required property 'tokenLocality'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["config"] = args ? args.config : undefined;
            resourceInputs["default"] = args ? args.default : undefined;
            resourceInputs["maxTokenTtl"] = args ? args.maxTokenTtl : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["tokenLocality"] = args ? args.tokenLocality : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AclAuthMethod.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AclAuthMethod resources.
 */
export interface AclAuthMethodState {
    /**
     * Configuration specific to the auth method provider.
     */
    config?: pulumi.Input<inputs.AclAuthMethodConfig>;
    /**
     * `(bool: false)` - Defines whether this ACL Auth Method is to be set
     * as default.
     */
    default?: pulumi.Input<boolean>;
    /**
     * `(string: <required>)` - Defines the maximum life of a token 
     * created by this method and is specified as a time duration such as "15h".
     */
    maxTokenTtl?: pulumi.Input<string>;
    /**
     * `(string: <required>)` - The identifier of the ACL Auth Method.
     */
    name?: pulumi.Input<string>;
    /**
     * `(string: <required>)` - Defines whether the ACL Auth Method
     * creates a local or global token when performing SSO login. This field must be
     * set to either `local` or `global`.
     */
    tokenLocality?: pulumi.Input<string>;
    /**
     * `(string: <required>)` - ACL Auth Method SSO workflow type. Currently,
     * the only supported type is `OIDC`.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AclAuthMethod resource.
 */
export interface AclAuthMethodArgs {
    /**
     * Configuration specific to the auth method provider.
     */
    config: pulumi.Input<inputs.AclAuthMethodConfig>;
    /**
     * `(bool: false)` - Defines whether this ACL Auth Method is to be set
     * as default.
     */
    default?: pulumi.Input<boolean>;
    /**
     * `(string: <required>)` - Defines the maximum life of a token 
     * created by this method and is specified as a time duration such as "15h".
     */
    maxTokenTtl: pulumi.Input<string>;
    /**
     * `(string: <required>)` - The identifier of the ACL Auth Method.
     */
    name?: pulumi.Input<string>;
    /**
     * `(string: <required>)` - Defines whether the ACL Auth Method
     * creates a local or global token when performing SSO login. This field must be
     * set to either `local` or `global`.
     */
    tokenLocality: pulumi.Input<string>;
    /**
     * `(string: <required>)` - ACL Auth Method SSO workflow type. Currently,
     * the only supported type is `OIDC`.
     */
    type: pulumi.Input<string>;
}
