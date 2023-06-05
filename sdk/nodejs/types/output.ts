// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";

export interface AclAuthMethodConfig {
    allowedRedirectUris: string[];
    boundAudiences?: string[];
    claimMappings?: {[key: string]: string};
    discoveryCaPems?: string[];
    listClaimMappings?: {[key: string]: string};
    oidcClientId: string;
    oidcClientSecret: string;
    oidcDiscoveryUrl: string;
    oidcScopes?: string[];
    signingAlgs?: string[];
}

export interface AclRolePolicy {
    /**
     * `(string: <required>)` - A human-friendly name for this ACL Role.
     */
    name: string;
}

export interface AclTokenRole {
    id: string;
    /**
     * `(string: "")` - A human-friendly name for this token.
     */
    name: string;
}

export interface ExternalVolumeCapability {
    /**
     * `(string: <required>)` - Defines whether a volume should be available concurrently. Possible values are:
     * - `single-node-reader-only`
     * - `single-node-writer`
     * - `multi-node-reader-only`
     * - `multi-node-single-writer`
     * - `multi-node-multi-writer`
     */
    accessMode: string;
    /**
     * `(string: <required>)` - The storage API that will be used by the volume. Possible values are:
     * - `block-device`
     * - `file-system`
     */
    attachmentMode: string;
}

export interface ExternalVolumeMountOptions {
    /**
     * `(string: optional)` - The file system type.
     */
    fsType?: string;
    /**
     * `[]string: optional` - The flags passed to `mount`.
     */
    mountFlags?: string[];
}

export interface ExternalVolumeTopology {
    /**
     * `(map[string]string)` - Define the attributes for the topology request.
     *
     * In addition to the above arguments, the following attributes are exported and
     * can be referenced:
     */
    segments: {[key: string]: string};
}

export interface ExternalVolumeTopologyRequest {
    /**
     * `(``Topology``: <optional>)` - Preferred topologies indicate that the volume should be created in a location accessible from some of the listed topologies.
     */
    preferred?: outputs.ExternalVolumeTopologyRequestPreferred;
    /**
     * `(``Topology``: <optional>)` - Required topologies indicate that the volume must be created in a location accessible from all the listed topologies.
     */
    required?: outputs.ExternalVolumeTopologyRequestRequired;
}

export interface ExternalVolumeTopologyRequestPreferred {
    topologies: outputs.ExternalVolumeTopologyRequestPreferredTopology[];
}

export interface ExternalVolumeTopologyRequestPreferredTopology {
    /**
     * `(map[string]string)` - Define the attributes for the topology request.
     *
     * In addition to the above arguments, the following attributes are exported and
     * can be referenced:
     */
    segments: {[key: string]: string};
}

export interface ExternalVolumeTopologyRequestRequired {
    topologies: outputs.ExternalVolumeTopologyRequestRequiredTopology[];
}

export interface ExternalVolumeTopologyRequestRequiredTopology {
    /**
     * `(map[string]string)` - Define the attributes for the topology request.
     *
     * In addition to the above arguments, the following attributes are exported and
     * can be referenced:
     */
    segments: {[key: string]: string};
}

export interface GetAclPoliciesPolicy {
    /**
     * `(string)` - the description of the ACL Policy.
     */
    description: string;
    /**
     * `(string)` - the name of the ACL Policy.
     */
    name: string;
}

export interface GetAclRolePolicy {
    /**
     * `(string)` - Unique name of the ACL role.
     */
    name: string;
}

export interface GetAclRolesAclRole {
    /**
     * `(string)` - The description of the ACL Role.
     */
    description: string;
    /**
     * `(string)` - The ACL Role unique identifier.
     */
    id: string;
    /**
     * `(string)` - Unique name of the ACL role.
     */
    name: string;
    /**
     * `(set)` - The policies applied to the role.
     */
    policies: outputs.GetAclRolesAclRolePolicy[];
}

export interface GetAclRolesAclRolePolicy {
    /**
     * `(string)` - Unique name of the ACL role.
     */
    name: string;
}

export interface GetAclTokenRole {
    id: string;
    /**
     * `(string)` Non-sensitive identifier for this token.
     */
    name: string;
}

export interface GetAclTokensAclToken {
    /**
     * `(TypeString)` Non-sensitive identifier for the token.
     */
    accessorId: string;
    /**
     * `(string)` Date and time the token was created at.
     */
    createTime: string;
    /**
     * `(string)` - The timestamp after which the token is
     * considered expired and eligible for destruction.
     */
    expirationTime: string;
    /**
     * `(bool)` Whether the token is replicated to all regions.
     */
    global: boolean;
    /**
     * `(TypeString)` The name of the token.
     */
    name: string;
    /**
     * `(list of strings)` The list of policies attached to the token.
     */
    policies: string[];
    /**
     * `(set: [])` - The list of roles attached to the token. Each entry has
     * `name` and `id` attributes.
     */
    roles: outputs.GetAclTokensAclTokenRole[];
    /**
     * `(TypeString)` The type of the token.
     */
    type: string;
}

export interface GetAclTokensAclTokenRole {
    id: string;
    /**
     * `(TypeString)` The name of the token.
     */
    name: string;
}

export interface GetJobConstraint {
    /**
     * `(string)` Attribute being constrained.
     */
    ltarget: string;
    /**
     * `(string)` Operator used to compare the attribute to the constraint.
     */
    operand: string;
    /**
     * `(string)` Constraint value.
     */
    rtarget: string;
}

export interface GetJobPeriodicConfig {
    /**
     * `(boolean)` If periodic scheduling is enabled for the specified job.
     */
    enabled: boolean;
    /**
     * `(boolean)`  If the specified job should wait until previous instances of the job have completed.
     */
    prohibitOverlap: boolean;
    /**
     * `(string)`
     */
    spec: string;
    /**
     * `(string)`
     */
    specType: string;
    /**
     * `(string)` Time zone to evaluate the next launch interval against.
     */
    timezone: string;
}

export interface GetJobTaskGroup {
    count: number;
    meta: {[key: string]: any};
    /**
     * `(string)` Name of the job.
     */
    name: string;
    tasks: outputs.GetJobTaskGroupTask[];
    volumes: outputs.GetJobTaskGroupVolume[];
}

export interface GetJobTaskGroupTask {
    driver: string;
    meta: {[key: string]: any};
    /**
     * `(string)` Name of the job.
     */
    name: string;
    volumeMounts: outputs.GetJobTaskGroupTaskVolumeMount[];
}

export interface GetJobTaskGroupTaskVolumeMount {
    destination: string;
    readOnly: boolean;
    volume: string;
}

export interface GetJobTaskGroupVolume {
    /**
     * `(string)` Name of the job.
     */
    name: string;
    readOnly: boolean;
    source: string;
    /**
     * `(string)` Scheduler type used during job creation.
     */
    type: string;
}

export interface GetNamespaceCapability {
    /**
     * `([]string)` - Task drivers disabled for the namespace.
     */
    disabledTaskDrivers?: string[];
    /**
     * `([]string)` - Task drivers enabled for the namespace.
     */
    enabledTaskDrivers?: string[];
}

export interface GetPluginNode {
    healthy: boolean;
    healthyDescription: string;
    name: string;
}

export interface GetScalingPoliciesPolicy {
    /**
     * `(boolean)` - Whether or not the scaling policy is enabled.
     */
    enabled: boolean;
    /**
     * `(string)` - The scaling policy ID.
     */
    id: string;
    /**
     * `(map[string]string)` - The scaling policy target.
     */
    target: {[key: string]: any};
    /**
     * `(string)` - An optional string to filter scaling policies based on policy type. If not provided, policies of all types are returned.
     */
    type: string;
}

export interface JobHcl2 {
    /**
     * `(boolean: false)` - Set this to `true` to be able to use
     * HCL2 filesystem functions
     */
    allowFs?: boolean;
    /**
     * `(boolean: false)` - Set this to `true` if your jobspec uses the HCL2
     * format instead of the default HCL.
     */
    enabled?: boolean;
    vars?: {[key: string]: any};
}

export interface JobTaskGroup {
    count: number;
    meta: {[key: string]: any};
    name: string;
    tasks: outputs.JobTaskGroupTask[];
    volumes: outputs.JobTaskGroupVolume[];
}

export interface JobTaskGroupTask {
    driver: string;
    meta: {[key: string]: any};
    name: string;
    volumeMounts: outputs.JobTaskGroupTaskVolumeMount[];
}

export interface JobTaskGroupTaskVolumeMount {
    destination: string;
    readOnly: boolean;
    volume: string;
}

export interface JobTaskGroupVolume {
    name: string;
    readOnly: boolean;
    source: string;
    type: string;
}

export interface NamespaceCapabilities {
    /**
     * `([]string: <optional>)` - Task drivers disabled for the namespace.
     */
    disabledTaskDrivers?: string[];
    /**
     * `([]string: <optional>)` - Task drivers enabled for the namespace.
     */
    enabledTaskDrivers?: string[];
}

export interface QuoteSpecificationLimit {
    /**
     * `(string: <required>)` - The region these limits should apply to.
     */
    region: string;
    /**
     * `(block: <required>)` - The limits to enforce. This block
     * may only be specified once in the `limits` block. Its structure is
     * documented below.
     */
    regionLimit: outputs.QuoteSpecificationLimitRegionLimit;
}

export interface QuoteSpecificationLimitRegionLimit {
    /**
     * `(int: 0)` - The amount of CPU to limit allocations to. A value of zero
     * is treated as unlimited, and a negative value is treated as fully disallowed.
     */
    cpu?: number;
    /**
     * `(int: 0)` - The amount of memory (in megabytes) to limit
     * allocations to. A value of zero is treated as unlimited, and a negative value
     * is treated as fully disallowed.
     */
    memoryMb?: number;
}

export interface VolumeCapability {
    /**
     * `(string: <required>)` - Defines whether a volume should be available concurrently. Possible values are:
     * - `single-node-reader-only`
     * - `single-node-writer`
     * - `multi-node-reader-only`
     * - `multi-node-single-writer`
     * - `multi-node-multi-writer`
     */
    accessMode: string;
    /**
     * `(string: <required>)` - The storage API that will be used by the volume. Possible values are:
     * - `block-device`
     * - `file-system`
     */
    attachmentMode: string;
}

export interface VolumeMountOptions {
    /**
     * `(string: <optional>)` - The file system type.
     */
    fsType?: string;
    /**
     * `([]string: <optional>)` - The flags passed to `mount`.
     */
    mountFlags?: string[];
}

export interface VolumeTopology {
    /**
     * `(map[string]string)` - Define the attributes for the topology request.
     *
     * In addition to the above arguments, the following attributes are exported and
     * can be referenced:
     */
    segments: {[key: string]: string};
}

export interface VolumeTopologyRequest {
    /**
     * `(``Topology``: <optional>)` - Required topologies indicate that the volume must be created in a location accessible from all the listed topologies.
     */
    required?: outputs.VolumeTopologyRequestRequired;
}

export interface VolumeTopologyRequestRequired {
    topologies: outputs.VolumeTopologyRequestRequiredTopology[];
}

export interface VolumeTopologyRequestRequiredTopology {
    /**
     * `(map[string]string)` - Define the attributes for the topology request.
     *
     * In addition to the above arguments, the following attributes are exported and
     * can be referenced:
     */
    segments: {[key: string]: string};
}

export namespace config {
    export interface Headers {
        name: string;
        value: string;
    }

}
