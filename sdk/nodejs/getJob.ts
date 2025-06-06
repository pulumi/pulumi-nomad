// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
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
 * const example = nomad.getJob({
 *     jobId: "example",
 *     namespace: "dev",
 * });
 * ```
 */
export function getJob(args: GetJobArgs, opts?: pulumi.InvokeOptions): Promise<GetJobResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("nomad:index/getJob:getJob", {
        "jobId": args.jobId,
        "namespace": args.namespace,
    }, opts);
}

/**
 * A collection of arguments for invoking getJob.
 */
export interface GetJobArgs {
    /**
     * `(string)` ID of the job.
     */
    jobId: string;
    /**
     * `(string)` Namespace of the specified job.
     */
    namespace?: string;
}

/**
 * A collection of values returned by getJob.
 */
export interface GetJobResult {
    /**
     * `(boolean)`  If the scheduler can make partial placements on oversubscribed nodes.
     */
    readonly allAtOnce: boolean;
    readonly constraints: outputs.GetJobConstraint[];
    /**
     * `(integer)` Creation Index.
     */
    readonly createIndex: number;
    /**
     * `(list of strings)` Datacenters allowed to run the specified job.
     */
    readonly datacenters: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly jobId: string;
    /**
     * `(integer)` Job modify index (used for version verification).
     */
    readonly jobModifyIndex: number;
    /**
     * `(integer)` Modification Index.
     */
    readonly modifyIndex: number;
    /**
     * `(string)` Name of the job.
     */
    readonly name: string;
    readonly namespace?: string;
    /**
     * `(string)` Job's parent ID.
     */
    readonly parentId: string;
    /**
     * `(list of maps)` Job's periodic configuration (time based scheduling).
     */
    readonly periodicConfigs: outputs.GetJobPeriodicConfig[];
    /**
     * `(integer)` Used for the prioritization of scheduling and resource access.
     */
    readonly priority: number;
    /**
     * `(string)` Region where the Nomad cluster resides.
     */
    readonly region: string;
    /**
     * `(boolean)` Job stability status.
     */
    readonly stable: boolean;
    /**
     * `(string)` Execution status of the specified job.
     */
    readonly status: string;
    /**
     * `(string)` Status description of the specified job.
     */
    readonly statusDescription: string;
    /**
     * `(boolean)` Job enabled status.
     */
    readonly stop: boolean;
    /**
     * `(integer)` Job submission date.
     */
    readonly submitTime: number;
    /**
     * `(list of maps)` A list of of the job's task groups.
     */
    readonly taskGroups: outputs.GetJobTaskGroup[];
    /**
     * `(string)` Scheduler type used during job creation.
     */
    readonly type: string;
    /**
     * `(integer)` Version of the specified job.
     */
    readonly version: number;
}
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
 * const example = nomad.getJob({
 *     jobId: "example",
 *     namespace: "dev",
 * });
 * ```
 */
export function getJobOutput(args: GetJobOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetJobResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("nomad:index/getJob:getJob", {
        "jobId": args.jobId,
        "namespace": args.namespace,
    }, opts);
}

/**
 * A collection of arguments for invoking getJob.
 */
export interface GetJobOutputArgs {
    /**
     * `(string)` ID of the job.
     */
    jobId: pulumi.Input<string>;
    /**
     * `(string)` Namespace of the specified job.
     */
    namespace?: pulumi.Input<string>;
}
