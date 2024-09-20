// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Get information about a namespace in Nomad.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const namespaces = nomad.getNamespace({
 *     name: "default",
 * });
 * ```
 */
export function getNamespace(args: GetNamespaceArgs, opts?: pulumi.InvokeOptions): Promise<GetNamespaceResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("nomad:index/getNamespace:getNamespace", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getNamespace.
 */
export interface GetNamespaceArgs {
    /**
     * `(string)` - The name of the namespace.
     */
    name: string;
}

/**
 * A collection of values returned by getNamespace.
 */
export interface GetNamespaceResult {
    /**
     * `(block)` - Capabilities of the namespace
     */
    readonly capabilities: outputs.GetNamespaceCapability[];
    /**
     * `(string)` - The description of the namespace.
     */
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * `(map[string]string)` -  Arbitrary KV metadata associated with the namespace.
     */
    readonly meta: {[key: string]: string};
    readonly name: string;
    readonly nodePoolConfigs: outputs.GetNamespaceNodePoolConfig[];
    /**
     * `(string)` - The quota associated with the namespace.
     */
    readonly quota: string;
}
/**
 * Get information about a namespace in Nomad.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const namespaces = nomad.getNamespace({
 *     name: "default",
 * });
 * ```
 */
export function getNamespaceOutput(args: GetNamespaceOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetNamespaceResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("nomad:index/getNamespace:getNamespace", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getNamespace.
 */
export interface GetNamespaceOutputArgs {
    /**
     * `(string)` - The name of the namespace.
     */
    name: pulumi.Input<string>;
}
