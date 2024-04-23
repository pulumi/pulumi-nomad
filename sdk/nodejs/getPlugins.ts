// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Retrieve a list of dynamic plugins in Nomad.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const example = nomad.getPlugins({});
 * ```
 */
export function getPlugins(args?: GetPluginsArgs, opts?: pulumi.InvokeOptions): Promise<GetPluginsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("nomad:index/getPlugins:getPlugins", {
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getPlugins.
 */
export interface GetPluginsArgs {
    type?: string;
}

/**
 * A collection of values returned by getPlugins.
 */
export interface GetPluginsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * `(list of maps)` a list of dynamic plugins registered in the cluster.
     */
    readonly plugins: {[key: string]: any}[];
    readonly type?: string;
}
/**
 * Retrieve a list of dynamic plugins in Nomad.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const example = nomad.getPlugins({});
 * ```
 */
export function getPluginsOutput(args?: GetPluginsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPluginsResult> {
    return pulumi.output(args).apply((a: any) => getPlugins(a, opts))
}

/**
 * A collection of arguments for invoking getPlugins.
 */
export interface GetPluginsOutputArgs {
    type?: pulumi.Input<string>;
}
