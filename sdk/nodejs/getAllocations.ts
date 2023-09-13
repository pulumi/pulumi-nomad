// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Retrieve a list of allocations from Nomad.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const example = nomad.getAllocations({
 *     filter: "JobID == \"example\"",
 * });
 * ```
 */
export function getAllocations(args?: GetAllocationsArgs, opts?: pulumi.InvokeOptions): Promise<GetAllocationsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("nomad:index/getAllocations:getAllocations", {
        "filter": args.filter,
        "prefix": args.prefix,
    }, opts);
}

/**
 * A collection of arguments for invoking getAllocations.
 */
export interface GetAllocationsArgs {
    /**
     * `(string: <optional>)` - Specifies the
     * [expression][nomadApiFilter] used to filter the results.
     */
    filter?: string;
    /**
     * `(string: <optional>)` - Specifies a string to filter allocations
     * based on an ID prefix.
     */
    prefix?: string;
}

/**
 * A collection of values returned by getAllocations.
 */
export interface GetAllocationsResult {
    /**
     * `(list of allocations)` - A list of allocations matching the
     * search criteria.
     */
    readonly allocations: outputs.GetAllocationsAllocation[];
    readonly filter?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly prefix?: string;
}
/**
 * Retrieve a list of allocations from Nomad.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const example = nomad.getAllocations({
 *     filter: "JobID == \"example\"",
 * });
 * ```
 */
export function getAllocationsOutput(args?: GetAllocationsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAllocationsResult> {
    return pulumi.output(args).apply((a: any) => getAllocations(a, opts))
}

/**
 * A collection of arguments for invoking getAllocations.
 */
export interface GetAllocationsOutputArgs {
    /**
     * `(string: <optional>)` - Specifies the
     * [expression][nomadApiFilter] used to filter the results.
     */
    filter?: pulumi.Input<string>;
    /**
     * `(string: <optional>)` - Specifies a string to filter allocations
     * based on an ID prefix.
     */
    prefix?: pulumi.Input<string>;
}
