// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Retrieve information on an ACL Policy.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const myPolicy = nomad.getAclPolicy({
 *     name: "my-policy",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getAclPolicy(args: GetAclPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetAclPolicyResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("nomad:index/getAclPolicy:getAclPolicy", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getAclPolicy.
 */
export interface GetAclPolicyArgs {
    /**
     * `(string)` - the name of the ACL Policy.
     */
    name: string;
}

/**
 * A collection of values returned by getAclPolicy.
 */
export interface GetAclPolicyResult {
    /**
     * `(string)` - the description of the ACL Policy.
     */
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * `(string)` - the name of the ACL Policy.
     */
    readonly name: string;
    /**
     * `(string)` - the ACL Policy rules in HCL format.
     */
    readonly rules: string;
}
/**
 * Retrieve information on an ACL Policy.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const myPolicy = nomad.getAclPolicy({
 *     name: "my-policy",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getAclPolicyOutput(args: GetAclPolicyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAclPolicyResult> {
    return pulumi.output(args).apply((a: any) => getAclPolicy(a, opts))
}

/**
 * A collection of arguments for invoking getAclPolicy.
 */
export interface GetAclPolicyOutputArgs {
    /**
     * `(string)` - the name of the ACL Policy.
     */
    name: pulumi.Input<string>;
}
