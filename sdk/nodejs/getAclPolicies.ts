// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Retrieve a list of ACL Policies.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const example = nomad.getAclPolicies({
 *     prefix: "prod",
 * });
 * ```
 */
export function getAclPolicies(args?: GetAclPoliciesArgs, opts?: pulumi.InvokeOptions): Promise<GetAclPoliciesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("nomad:index/getAclPolicies:getAclPolicies", {
        "prefix": args.prefix,
    }, opts);
}

/**
 * A collection of arguments for invoking getAclPolicies.
 */
export interface GetAclPoliciesArgs {
    /**
     * `(string)` An optional string to filter ACL policies based on name prefix. If not provided, all policies are returned.
     */
    prefix?: string;
}

/**
 * A collection of values returned by getAclPolicies.
 */
export interface GetAclPoliciesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * `list of maps` a list of ACL policies.
     */
    readonly policies: outputs.GetAclPoliciesPolicy[];
    readonly prefix?: string;
}
/**
 * Retrieve a list of ACL Policies.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const example = nomad.getAclPolicies({
 *     prefix: "prod",
 * });
 * ```
 */
export function getAclPoliciesOutput(args?: GetAclPoliciesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAclPoliciesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("nomad:index/getAclPolicies:getAclPolicies", {
        "prefix": args.prefix,
    }, opts);
}

/**
 * A collection of arguments for invoking getAclPolicies.
 */
export interface GetAclPoliciesOutputArgs {
    /**
     * `(string)` An optional string to filter ACL policies based on name prefix. If not provided, all policies are returned.
     */
    prefix?: pulumi.Input<string>;
}
