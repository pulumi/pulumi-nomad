// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Get a list of ACL tokens.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const tokens = nomad.getAclTokens({
 *     prefix: "a242",
 * });
 * ```
 */
export function getAclTokens(args?: GetAclTokensArgs, opts?: pulumi.InvokeOptions): Promise<GetAclTokensResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("nomad:index/getAclTokens:getAclTokens", {
        "prefix": args.prefix,
    }, opts);
}

/**
 * A collection of arguments for invoking getAclTokens.
 */
export interface GetAclTokensArgs {
    /**
     * `(string)` Optional prefix to filter the tokens.
     */
    prefix?: string;
}

/**
 * A collection of values returned by getAclTokens.
 */
export interface GetAclTokensResult {
    /**
     * `(list of objects)` The list of tokens found in the given prefix.
     */
    readonly aclTokens: outputs.GetAclTokensAclToken[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly prefix?: string;
}
/**
 * Get a list of ACL tokens.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const tokens = nomad.getAclTokens({
 *     prefix: "a242",
 * });
 * ```
 */
export function getAclTokensOutput(args?: GetAclTokensOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAclTokensResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("nomad:index/getAclTokens:getAclTokens", {
        "prefix": args.prefix,
    }, opts);
}

/**
 * A collection of arguments for invoking getAclTokens.
 */
export interface GetAclTokensOutputArgs {
    /**
     * `(string)` Optional prefix to filter the tokens.
     */
    prefix?: pulumi.Input<string>;
}
