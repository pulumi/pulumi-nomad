// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Get information on a job ID. The aim of this datasource is to enable
 * you to act on various settings and states of a particular job.
 *
 * An error is triggered if zero or more than one result is returned by the query.
 *
 * ## Example Usage
 *
 * Get the data about a snapshot:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const example = pulumi.output(nomad.getJob({
 *     jobId: "example",
 * }));
 * ```
 */
export function getJob(args: GetJobArgs, opts?: pulumi.InvokeOptions): Promise<GetJobResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("nomad:index/getJob:getJob", {
        "jobId": args.jobId,
        "namespace": args.namespace,
    }, opts);
}

/**
 * A collection of arguments for invoking getJob.
 */
export interface GetJobArgs {
    jobId: string;
    namespace?: string;
}

/**
 * A collection of values returned by getJob.
 */
export interface GetJobResult {
    readonly allAtOnce: boolean;
    readonly constraints: outputs.GetJobConstraint[];
    readonly createIndex: number;
    readonly datacenters: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly jobId: string;
    readonly jobModifyIndex: number;
    readonly modifyIndex: number;
    readonly name: string;
    readonly namespace?: string;
    readonly parentId: string;
    readonly periodicConfigs: outputs.GetJobPeriodicConfig[];
    readonly priority: number;
    readonly region: string;
    readonly stable: boolean;
    readonly status: string;
    readonly statusDescription: string;
    readonly stop: boolean;
    readonly submitTime: number;
    readonly taskGroups: outputs.GetJobTaskGroup[];
    readonly type: string;
    readonly version: number;
}

export function getJobOutput(args: GetJobOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetJobResult> {
    return pulumi.output(args).apply(a => getJob(a, opts))
}

/**
 * A collection of arguments for invoking getJob.
 */
export interface GetJobOutputArgs {
    jobId: pulumi.Input<string>;
    namespace?: pulumi.Input<string>;
}
