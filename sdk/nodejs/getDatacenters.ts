// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Retrieve a list of datacenters.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const datacenters = pulumi.output(nomad.getDatacenters({
 *     ignoreDownNodes: true,
 *     prefix: "prod",
 * }));
 * ```
 */
export function getDatacenters(args?: GetDatacentersArgs, opts?: pulumi.InvokeOptions): Promise<GetDatacentersResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("nomad:index/getDatacenters:getDatacenters", {
        "ignoreDownNodes": args.ignoreDownNodes,
        "prefix": args.prefix,
    }, opts);
}

/**
 * A collection of arguments for invoking getDatacenters.
 */
export interface GetDatacentersArgs {
    /**
     * `(bool: false)`: An optional flag that, if set to `true` will ignore down nodes when compiling the list of datacenters.
     */
    ignoreDownNodes?: boolean;
    /**
     * `(string)`: An optional string to filter datacenters based on name prefix. If not provided, all datacenters are returned.
     */
    prefix?: string;
}

/**
 * A collection of values returned by getDatacenters.
 */
export interface GetDatacentersResult {
    readonly datacenters: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ignoreDownNodes?: boolean;
    readonly prefix?: string;
}

export function getDatacentersOutput(args?: GetDatacentersOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDatacentersResult> {
    return pulumi.output(args).apply(a => getDatacenters(a, opts))
}

/**
 * A collection of arguments for invoking getDatacenters.
 */
export interface GetDatacentersOutputArgs {
    /**
     * `(bool: false)`: An optional flag that, if set to `true` will ignore down nodes when compiling the list of datacenters.
     */
    ignoreDownNodes?: pulumi.Input<boolean>;
    /**
     * `(string)`: An optional string to filter datacenters based on name prefix. If not provided, all datacenters are returned.
     */
    prefix?: pulumi.Input<string>;
}
