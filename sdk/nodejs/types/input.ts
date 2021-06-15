// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";

export interface ExternalVolumeCapability {
    accessMode: pulumi.Input<string>;
    attachmentMode: pulumi.Input<string>;
}

export interface ExternalVolumeMountOptions {
    fsType?: pulumi.Input<string>;
    mountFlags?: pulumi.Input<pulumi.Input<string>[]>;
}

export interface JobHcl2 {
    /**
     * `(boolean: false)` - Set this to `true` to be able to use
     * HCL2 filesystem functions
     */
    allowFs?: pulumi.Input<boolean>;
    /**
     * `(boolean: false)` - Set this to `true` if your jobspec uses the HCL2
     * format instead of the default HCL.
     */
    enabled?: pulumi.Input<boolean>;
    vars?: pulumi.Input<{[key: string]: any}>;
}

export interface JobTaskGroup {
    count?: pulumi.Input<number>;
    meta?: pulumi.Input<{[key: string]: any}>;
    name?: pulumi.Input<string>;
    tasks?: pulumi.Input<pulumi.Input<inputs.JobTaskGroupTask>[]>;
    volumes?: pulumi.Input<pulumi.Input<inputs.JobTaskGroupVolume>[]>;
}

export interface JobTaskGroupTask {
    driver?: pulumi.Input<string>;
    meta?: pulumi.Input<{[key: string]: any}>;
    name?: pulumi.Input<string>;
    volumeMounts?: pulumi.Input<pulumi.Input<inputs.JobTaskGroupTaskVolumeMount>[]>;
}

export interface JobTaskGroupTaskVolumeMount {
    destination?: pulumi.Input<string>;
    readOnly?: pulumi.Input<boolean>;
    volume?: pulumi.Input<string>;
}

export interface JobTaskGroupVolume {
    name?: pulumi.Input<string>;
    readOnly?: pulumi.Input<boolean>;
    source?: pulumi.Input<string>;
    type?: pulumi.Input<string>;
}

export interface ProviderHeader {
    name: pulumi.Input<string>;
    value: pulumi.Input<string>;
}

export interface QuoteSpecificationLimit {
    /**
     * `(string: <required>)` - The region these limits should apply to.
     */
    region: pulumi.Input<string>;
    /**
     * `(block: <required>)` - The limits to enforce. This block
     * may only be specified once in the `limits` block. Its structure is
     * documented below.
     */
    regionLimit: pulumi.Input<inputs.QuoteSpecificationLimitRegionLimit>;
}

export interface QuoteSpecificationLimitRegionLimit {
    /**
     * `(int: 0)` - The amount of CPU to limit allocations to. A value of zero
     * is treated as unlimited, and a negative value is treated as fully disallowed.
     */
    cpu?: pulumi.Input<number>;
    /**
     * `(int: 0)` - The amount of memory (in megabytes) to limit
     * allocations to. A value of zero is treated as unlimited, and a negative value
     * is treated as fully disallowed.
     */
    memoryMb?: pulumi.Input<number>;
}

export interface VolumeCapability {
    accessMode: pulumi.Input<string>;
    attachmentMode: pulumi.Input<string>;
}

export interface VolumeMountOptions {
    fsType?: pulumi.Input<string>;
    mountFlags?: pulumi.Input<pulumi.Input<string>[]>;
}
export namespace config {
}