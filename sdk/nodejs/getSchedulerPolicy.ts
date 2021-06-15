// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Retrieve the cluster's [scheduler configuration](https://www.nomadproject.io/api-docs/operator#sample-response-3).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const global = pulumi.output(nomad.getSchedulerPolicy());
 * ```
 */
export function getSchedulerPolicy(opts?: pulumi.InvokeOptions): Promise<GetSchedulerPolicyResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("nomad:index/getSchedulerPolicy:getSchedulerPolicy", {
    }, opts);
}

/**
 * A collection of values returned by getSchedulerPolicy.
 */
export interface GetSchedulerPolicyResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly memoryOversubscriptionEnabled: boolean;
    readonly preemptionConfig: {[key: string]: boolean};
    readonly schedulerAlgorithm: string;
}