// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const myToken = nomad.getAclToken({
 *     accessorId: "aa534e09-6a07-0a45-2295-a7f77063d429",
 * });
 * ```
 */
export function getAclToken(args: GetAclTokenArgs, opts?: pulumi.InvokeOptions): Promise<GetAclTokenResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("nomad:index/getAclToken:getAclToken", {
        "accessorId": args.accessorId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAclToken.
 */
export interface GetAclTokenArgs {
    /**
     * `(string)` Non-sensitive identifier for this token.
     */
    accessorId: string;
}

/**
 * A collection of values returned by getAclToken.
 */
export interface GetAclTokenResult {
    /**
     * `(string)` Non-sensitive identifier for this token.
     */
    readonly accessorId: string;
    /**
     * `(string)` Date and time the token was created.
     */
    readonly createTime: string;
    /**
     * `(string)` - The timestamp after which the token is
     * considered expired and eligible for destruction.
     */
    readonly expirationTime: string;
    /**
     * `(string)` The expiration TTL for the token.
     */
    readonly expirationTtl: string;
    /**
     * `(bool)` Whether the token is replicated to all regions, or if it 
     * will only be used in the region it was created.
     */
    readonly global: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * `(string)` Non-sensitive identifier for this token.
     */
    readonly name: string;
    /**
     * `(list of strings)` List of policy names associated with this token.
     */
    readonly policies: string[];
    /**
     * `(set: [])` - The list of roles attached to the token. Each entry has
     * `name` and `id` attributes.
     */
    readonly roles: outputs.GetAclTokenRole[];
    /**
     * `(string)` The token value itself.
     */
    readonly secretId: string;
    /**
     * `(string)` The type of the token.
     */
    readonly type: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const myToken = nomad.getAclToken({
 *     accessorId: "aa534e09-6a07-0a45-2295-a7f77063d429",
 * });
 * ```
 */
export function getAclTokenOutput(args: GetAclTokenOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAclTokenResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("nomad:index/getAclToken:getAclToken", {
        "accessorId": args.accessorId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAclToken.
 */
export interface GetAclTokenOutputArgs {
    /**
     * `(string)` Non-sensitive identifier for this token.
     */
    accessorId: pulumi.Input<string>;
}
