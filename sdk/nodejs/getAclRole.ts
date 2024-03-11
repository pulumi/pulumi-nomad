// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Get information on an ACL Role.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const example = nomad.getAclRole({
 *     id: "aa534e09-6a07-0a45-2295-a7f77063d429",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getAclRole(args: GetAclRoleArgs, opts?: pulumi.InvokeOptions): Promise<GetAclRoleResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("nomad:index/getAclRole:getAclRole", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getAclRole.
 */
export interface GetAclRoleArgs {
    /**
     * `(string)` The unique identifier of the ACL Role.
     */
    id: string;
}

/**
 * A collection of values returned by getAclRole.
 */
export interface GetAclRoleResult {
    /**
     * `(string)` - The description of the ACL Role.
     */
    readonly description: string;
    /**
     * `(string)` - The ACL Role unique identifier.
     */
    readonly id: string;
    /**
     * `(string)` - Unique name of the ACL role.
     */
    readonly name: string;
    /**
     * `(set)` - The policies applied to the role.
     */
    readonly policies: outputs.GetAclRolePolicy[];
}
/**
 * Get information on an ACL Role.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const example = nomad.getAclRole({
 *     id: "aa534e09-6a07-0a45-2295-a7f77063d429",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getAclRoleOutput(args: GetAclRoleOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAclRoleResult> {
    return pulumi.output(args).apply((a: any) => getAclRole(a, opts))
}

/**
 * A collection of arguments for invoking getAclRole.
 */
export interface GetAclRoleOutputArgs {
    /**
     * `(string)` The unique identifier of the ACL Role.
     */
    id: pulumi.Input<string>;
}
