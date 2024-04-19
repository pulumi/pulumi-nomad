// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Retrieve a list of namespaces available in Nomad.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * export = async () => {
 *     const namespaces = await nomad.getNamespaces({});
 *     const namespace: nomad.AclPolicy[] = [];
 *     for (const range = {value: 0}; range.value < namespaces.namespaces.length; range.value++) {
 *         namespace.push(new nomad.AclPolicy(`namespace-${range.value}`, {
 *             name: `namespace-${namespaces[range.value]}`,
 *             description: `Write to the namespace ${namespaces[range.value]}`,
 *             rulesHcl: `namespace "${namespaces[range.value]}" {
 *   policy = "write"
 * }
 * `,
 *         }));
 *     }
 * }
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getNamespaces(opts?: pulumi.InvokeOptions): Promise<GetNamespacesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("nomad:index/getNamespaces:getNamespaces", {
    }, opts);
}

/**
 * A collection of values returned by getNamespaces.
 */
export interface GetNamespacesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * `(list of strings)` - a list of namespaces available in the cluster.
     */
    readonly namespaces: string[];
}
/**
 * Retrieve a list of namespaces available in Nomad.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * export = async () => {
 *     const namespaces = await nomad.getNamespaces({});
 *     const namespace: nomad.AclPolicy[] = [];
 *     for (const range = {value: 0}; range.value < namespaces.namespaces.length; range.value++) {
 *         namespace.push(new nomad.AclPolicy(`namespace-${range.value}`, {
 *             name: `namespace-${namespaces[range.value]}`,
 *             description: `Write to the namespace ${namespaces[range.value]}`,
 *             rulesHcl: `namespace "${namespaces[range.value]}" {
 *   policy = "write"
 * }
 * `,
 *         }));
 *     }
 * }
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getNamespacesOutput(opts?: pulumi.InvokeOptions): pulumi.Output<GetNamespacesResult> {
    return pulumi.output(getNamespaces(opts))
}
