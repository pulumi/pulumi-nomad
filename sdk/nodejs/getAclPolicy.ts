// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Retrieve information on an ACL Policy.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const myPolicy = pulumi.output(nomad.getAclPolicy({
 *     name: "my-policy",
 * }));
 * ```
 */
export function getAclPolicy(args: GetAclPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetAclPolicyResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("nomad:index/getAclPolicy:getAclPolicy", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getAclPolicy.
 */
export interface GetAclPolicyArgs {
    name: string;
}

/**
 * A collection of values returned by getAclPolicy.
 */
export interface GetAclPolicyResult {
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    readonly rules: string;
}

export function getAclPolicyOutput(args: GetAclPolicyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAclPolicyResult> {
    return pulumi.output(args).apply(a => getAclPolicy(a, opts))
}

/**
 * A collection of arguments for invoking getAclPolicy.
 */
export interface GetAclPolicyOutputArgs {
    name: pulumi.Input<string>;
}
