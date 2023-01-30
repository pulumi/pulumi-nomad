// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Retrieve a list of deployments in Nomad.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const example = nomad.getDeployments({});
 * ```
 */
export function getDeployments(opts?: pulumi.InvokeOptions): Promise<GetDeploymentsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("nomad:index/getDeployments:getDeployments", {
    }, opts);
}

/**
 * A collection of values returned by getDeployments.
 */
export interface GetDeploymentsResult {
    /**
     * `list of maps` a list of deployments in the cluster.
     */
    readonly deployments: {[key: string]: any}[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
