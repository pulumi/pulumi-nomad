// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Retrieve a list of volumes in Nomad.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const example = nomad.getVolumes({});
 * ```
 */
export function getVolumes(args?: GetVolumesArgs, opts?: pulumi.InvokeOptions): Promise<GetVolumesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("nomad:index/getVolumes:getVolumes", {
        "namespace": args.namespace,
        "nodeId": args.nodeId,
        "pluginId": args.pluginId,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getVolumes.
 */
export interface GetVolumesArgs {
    /**
     * `(string: "default")` Nomad namespace.
     */
    namespace?: string;
    /**
     * `(string: optional)` Volume node filter.
     */
    nodeId?: string;
    /**
     * `(string: optional)` Plugin ID filter.
     */
    pluginId?: string;
    /**
     * `(string: "csi")` Volume type (one of `csi` or `host`)
     */
    type?: string;
}

/**
 * A collection of values returned by getVolumes.
 */
export interface GetVolumesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * `string` Volume namespace.
     */
    readonly namespace?: string;
    readonly nodeId?: string;
    readonly pluginId?: string;
    readonly type?: string;
    /**
     * `list of maps` a list of volumes in the cluster.
     */
    readonly volumes: {[key: string]: string}[];
}
/**
 * Retrieve a list of volumes in Nomad.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const example = nomad.getVolumes({});
 * ```
 */
export function getVolumesOutput(args?: GetVolumesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetVolumesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("nomad:index/getVolumes:getVolumes", {
        "namespace": args.namespace,
        "nodeId": args.nodeId,
        "pluginId": args.pluginId,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getVolumes.
 */
export interface GetVolumesOutputArgs {
    /**
     * `(string: "default")` Nomad namespace.
     */
    namespace?: pulumi.Input<string>;
    /**
     * `(string: optional)` Volume node filter.
     */
    nodeId?: pulumi.Input<string>;
    /**
     * `(string: optional)` Plugin ID filter.
     */
    pluginId?: pulumi.Input<string>;
    /**
     * `(string: "csi")` Volume type (one of `csi` or `host`)
     */
    type?: pulumi.Input<string>;
}
