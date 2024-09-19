// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Retrieve a list of ACL Roles.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const example = nomad.getAclRoles({
 *     prefix: "a242",
 * });
 * ```
 */
export function getAclRoles(args?: GetAclRolesArgs, opts?: pulumi.InvokeOptions): Promise<GetAclRolesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("nomad:index/getAclRoles:getAclRoles", {
        "prefix": args.prefix,
    }, opts);
}

/**
 * A collection of arguments for invoking getAclRoles.
 */
export interface GetAclRolesArgs {
    /**
     * `(string)` An optional string to filter ACL Roles based on ID
     * prefix. If not provided, all policies are returned.
     */
    prefix?: string;
}

/**
 * A collection of values returned by getAclRoles.
 */
export interface GetAclRolesResult {
    readonly aclRoles: outputs.GetAclRolesAclRole[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly prefix?: string;
}
/**
 * Retrieve a list of ACL Roles.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const example = nomad.getAclRoles({
 *     prefix: "a242",
 * });
 * ```
 */
export function getAclRolesOutput(args?: GetAclRolesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAclRolesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("nomad:index/getAclRoles:getAclRoles", {
        "prefix": args.prefix,
    }, opts);
}

/**
 * A collection of arguments for invoking getAclRoles.
 */
export interface GetAclRolesOutputArgs {
    /**
     * `(string)` An optional string to filter ACL Roles based on ID
     * prefix. If not provided, all policies are returned.
     */
    prefix?: pulumi.Input<string>;
}
