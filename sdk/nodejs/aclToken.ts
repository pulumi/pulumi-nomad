// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * Creating a token with limited policies:
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const dakota = new nomad.AclToken("dakota", {
 *     policies: [
 *         "dev",
 *         "qa",
 *     ],
 *     type: "client",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * Creating a global token that will be replicated to all regions:
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const dakota = new nomad.AclToken("dakota", {
 *     global: true,
 *     policies: [
 *         "dev",
 *         "qa",
 *     ],
 *     type: "client",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * Creating a token with full access to the cluster:
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const iman = new nomad.AclToken("iman", {type: "management"});
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * Accessing the token:
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const token = new nomad.AclToken("token", {
 *     type: "client",
 *     policies: ["dev"],
 * });
 * export const nomadToken = token.secretId;
 * ```
 * <!--End PulumiCodeChooser -->
 */
export class AclToken extends pulumi.CustomResource {
    /**
     * Get an existing AclToken resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AclTokenState, opts?: pulumi.CustomResourceOptions): AclToken {
        return new AclToken(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'nomad:index/aclToken:AclToken';

    /**
     * Returns true if the given object is an instance of AclToken.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AclToken {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AclToken.__pulumiType;
    }

    /**
     * `(string)` - A non-sensitive identifier for this token that
     * can be logged and shared safely without granting any access to the cluster.
     */
    public /*out*/ readonly accessorId!: pulumi.Output<string>;
    /**
     * `(string)` - The timestamp the token was created.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * `(string)` - The timestamp after which the token is
     * considered expired and eligible for destruction.
     */
    public /*out*/ readonly expirationTime!: pulumi.Output<string>;
    /**
     * `(string: "")` - Provides a TTL for the token in the form of
     * a time duration such as `"5m"` or `"1h"`.
     *
     * In addition to the above arguments, the following attributes are exported and
     * can be referenced:
     */
    public readonly expirationTtl!: pulumi.Output<string | undefined>;
    /**
     * `(bool: false)` - Whether the token should be replicated to all
     * regions, or if it will only be used in the region it was created in.
     */
    public readonly global!: pulumi.Output<boolean | undefined>;
    /**
     * `(string: "")` - A human-friendly name for this token.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * `(set: [])` - A set of policy names to associate with this
     * token. Must be set on `client`-type tokens, must not be set on
     * `management`-type tokens. Policies do not need to exist before being
     * used here.
     */
    public readonly policies!: pulumi.Output<string[] | undefined>;
    /**
     * `(set: [])` - The list of roles attached to the token. Each entry has
     * `name` and `id` attributes. It may be used multiple times.
     */
    public readonly roles!: pulumi.Output<outputs.AclTokenRole[] | undefined>;
    /**
     * `(string)` - The token value itself, which is presented for
     * access to the cluster.
     */
    public /*out*/ readonly secretId!: pulumi.Output<string>;
    /**
     * `(string: <required>)` - The type of token this is. Use `client`
     * for tokens that will have policies associated with them. Use `management`
     * for tokens that can perform any action.
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a AclToken resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AclTokenArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AclTokenArgs | AclTokenState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AclTokenState | undefined;
            resourceInputs["accessorId"] = state ? state.accessorId : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["expirationTime"] = state ? state.expirationTime : undefined;
            resourceInputs["expirationTtl"] = state ? state.expirationTtl : undefined;
            resourceInputs["global"] = state ? state.global : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["policies"] = state ? state.policies : undefined;
            resourceInputs["roles"] = state ? state.roles : undefined;
            resourceInputs["secretId"] = state ? state.secretId : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as AclTokenArgs | undefined;
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["expirationTtl"] = args ? args.expirationTtl : undefined;
            resourceInputs["global"] = args ? args.global : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["policies"] = args ? args.policies : undefined;
            resourceInputs["roles"] = args ? args.roles : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["accessorId"] = undefined /*out*/;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["expirationTime"] = undefined /*out*/;
            resourceInputs["secretId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["secretId"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(AclToken.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AclToken resources.
 */
export interface AclTokenState {
    /**
     * `(string)` - A non-sensitive identifier for this token that
     * can be logged and shared safely without granting any access to the cluster.
     */
    accessorId?: pulumi.Input<string>;
    /**
     * `(string)` - The timestamp the token was created.
     */
    createTime?: pulumi.Input<string>;
    /**
     * `(string)` - The timestamp after which the token is
     * considered expired and eligible for destruction.
     */
    expirationTime?: pulumi.Input<string>;
    /**
     * `(string: "")` - Provides a TTL for the token in the form of
     * a time duration such as `"5m"` or `"1h"`.
     *
     * In addition to the above arguments, the following attributes are exported and
     * can be referenced:
     */
    expirationTtl?: pulumi.Input<string>;
    /**
     * `(bool: false)` - Whether the token should be replicated to all
     * regions, or if it will only be used in the region it was created in.
     */
    global?: pulumi.Input<boolean>;
    /**
     * `(string: "")` - A human-friendly name for this token.
     */
    name?: pulumi.Input<string>;
    /**
     * `(set: [])` - A set of policy names to associate with this
     * token. Must be set on `client`-type tokens, must not be set on
     * `management`-type tokens. Policies do not need to exist before being
     * used here.
     */
    policies?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * `(set: [])` - The list of roles attached to the token. Each entry has
     * `name` and `id` attributes. It may be used multiple times.
     */
    roles?: pulumi.Input<pulumi.Input<inputs.AclTokenRole>[]>;
    /**
     * `(string)` - The token value itself, which is presented for
     * access to the cluster.
     */
    secretId?: pulumi.Input<string>;
    /**
     * `(string: <required>)` - The type of token this is. Use `client`
     * for tokens that will have policies associated with them. Use `management`
     * for tokens that can perform any action.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AclToken resource.
 */
export interface AclTokenArgs {
    /**
     * `(string: "")` - Provides a TTL for the token in the form of
     * a time duration such as `"5m"` or `"1h"`.
     *
     * In addition to the above arguments, the following attributes are exported and
     * can be referenced:
     */
    expirationTtl?: pulumi.Input<string>;
    /**
     * `(bool: false)` - Whether the token should be replicated to all
     * regions, or if it will only be used in the region it was created in.
     */
    global?: pulumi.Input<boolean>;
    /**
     * `(string: "")` - A human-friendly name for this token.
     */
    name?: pulumi.Input<string>;
    /**
     * `(set: [])` - A set of policy names to associate with this
     * token. Must be set on `client`-type tokens, must not be set on
     * `management`-type tokens. Policies do not need to exist before being
     * used here.
     */
    policies?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * `(set: [])` - The list of roles attached to the token. Each entry has
     * `name` and `id` attributes. It may be used multiple times.
     */
    roles?: pulumi.Input<pulumi.Input<inputs.AclTokenRole>[]>;
    /**
     * `(string: <required>)` - The type of token this is. Use `client`
     * for tokens that will have policies associated with them. Use `management`
     * for tokens that can perform any action.
     */
    type: pulumi.Input<string>;
}
