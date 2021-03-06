// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const myToken = pulumi.output(nomad.getAclToken({
 *     accessorId: "aa534e09-6a07-0a45-2295-a7f77063d429",
 * }));
 * ```
 */
export function getAclToken(args: GetAclTokenArgs, opts?: pulumi.InvokeOptions): Promise<GetAclTokenResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("nomad:index/getAclToken:getAclToken", {
        "accessorId": args.accessorId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAclToken.
 */
export interface GetAclTokenArgs {
    accessorId: string;
}

/**
 * A collection of values returned by getAclToken.
 */
export interface GetAclTokenResult {
    readonly accessorId: string;
    readonly createTime: string;
    readonly global: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    readonly policies: string[];
    readonly secretId: string;
    readonly type: string;
}

export function getAclTokenOutput(args: GetAclTokenOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAclTokenResult> {
    return pulumi.output(args).apply(a => getAclToken(a, opts))
}

/**
 * A collection of arguments for invoking getAclToken.
 */
export interface GetAclTokenOutputArgs {
    accessorId: pulumi.Input<string>;
}
