// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";

export interface AclAuthMethodConfig {
    /**
     * `([]string: <optional>)` - A list of allowed values
     * that can be used for the redirect URI.
     */
    allowedRedirectUris?: string[];
    /**
     * `([]string: <optional>)` - List of auth claims that are
     * valid for login.
     */
    boundAudiences?: string[];
    /**
     * `([]string: <optional>)` - The value against which to match
     * the iss claim in a JWT.
     */
    boundIssuers?: string[];
    /**
     * `(map[string]string: <optional>)` - Mappings of claims (key)
     * that will be copied to a metadata field (value).
     */
    claimMappings?: {[key: string]: string};
    /**
     * Duration of leeway when validating all claims in the form of a time duration such as "5m" or "1h".
     */
    clockSkewLeeway?: string;
    /**
     * `([]string: <optional>)` - PEM encoded CA certs for use
     * by the TLS client used to talk with the OIDC Discovery URL.
     */
    discoveryCaPems?: string[];
    /**
     * `(string: <optional>)` - Duration of leeway when validating
     * expiration of a JWT in the form of a time duration such as "5m" or "1h".
     */
    expirationLeeway?: string;
    /**
     * `(string: <optional>)` - PEM encoded CA cert for use by the
     * TLS client used to talk with the JWKS server.
     */
    jwksCaCert?: string;
    /**
     * `(string: <optional>)` - JSON Web Key Sets url for authenticating
     * signatures.
     */
    jwksUrl?: string;
    /**
     * `([]string: <optional>)` - List of PEM-encoded
     * public keys to use to authenticate signatures locally.
     */
    jwtValidationPubKeys?: string[];
    /**
     * `(map[string]string: <optional>)` - Mappings of list
     * claims (key) that will be copied to a metadata field (value).
     */
    listClaimMappings?: {[key: string]: string};
    /**
     * Duration of leeway when validating not before values of a token in the form of a time duration such as "5m" or "1h".
     */
    notBeforeLeeway?: string;
    /**
     * `(string: <optional>)` - The OAuth Client ID configured
     * with the OIDC provider.
     */
    oidcClientId?: string;
    /**
     * `(string: <optional>)` - The OAuth Client Secret
     * configured with the OIDC provider.
     */
    oidcClientSecret?: string;
    /**
     * `(bool: false)` - When set to `true`, Nomad will
     * not make a request to the identity provider to get OIDC `UserInfo`.
     * You may wish to set this if your identity provider doesn't send any
     * additional claims from the `UserInfo` endpoint.
     */
    oidcDisableUserinfo?: boolean;
    /**
     * `(string: <optional>)` - The OIDC Discovery URL,
     * without any .well-known component (base path).
     */
    oidcDiscoveryUrl?: string;
    /**
     * `([]string: <optional>)` - List of OIDC scopes.
     */
    oidcScopes?: string[];
    /**
     * `([]string: <optional>)` - A list of supported signing
     * algorithms.
     */
    signingAlgs?: string[];
}

export interface AclPolicyJobAcl {
    /**
     * Group
     */
    group?: string;
    /**
     * Job
     */
    jobId: string;
    /**
     * Namespace
     */
    namespace?: string;
    /**
     * Task
     */
    task?: string;
}

export interface AclRolePolicy {
    /**
     * `(string: <required>)` - A human-friendly name for this ACL Role.
     */
    name: string;
}

export interface AclTokenRole {
    /**
     * The ID of the ACL role to link.
     */
    id: string;
    /**
     * `(string: "")` - A human-friendly name for this token.
     */
    name: string;
}

export interface CsiVolumeCapability {
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

export interface CsiVolumeMountOptions {
    /**
     * `(string: optional)` - The file system type.
     */
    fsType?: string;
    /**
     * `[]string: optional` - The flags passed to `mount`.
     */
    mountFlags?: string[];
}

export interface CsiVolumeRegistrationCapability {
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

export interface CsiVolumeRegistrationMountOptions {
    /**
     * `(string: <optional>)` - The file system type.
     */
    fsType?: string;
    /**
     * `([]string: <optional>)` - The flags passed to `mount`.
     */
    mountFlags?: string[];
}

export interface CsiVolumeRegistrationTopology {
    /**
     * `(map[string]string)` - Define the attributes for the topology request.
     *
     * In addition to the above arguments, the following attributes are exported and
     * can be referenced:
     */
    segments: {[key: string]: string};
}

export interface CsiVolumeRegistrationTopologyRequest {
    /**
     * `(``Topology``: <optional>)` - Required topologies indicate that the volume must be created in a location accessible from all the listed topologies.
     */
    required?: outputs.CsiVolumeRegistrationTopologyRequestRequired;
}

export interface CsiVolumeRegistrationTopologyRequestRequired {
    /**
     * Defines the location for the volume.
     */
    topologies: outputs.CsiVolumeRegistrationTopologyRequestRequiredTopology[];
}

export interface CsiVolumeRegistrationTopologyRequestRequiredTopology {
    /**
     * Define attributes for the topology request.
     */
    segments: {[key: string]: string};
}

export interface CsiVolumeTopology {
    /**
     * `(map[string]string)` - Define the attributes for the topology request.
     *
     * In addition to the above arguments, the following attributes are exported and
     * can be referenced:
     */
    segments: {[key: string]: string};
}

export interface CsiVolumeTopologyRequest {
    /**
     * `(``Topology``: <optional>)` - Preferred topologies indicate that the volume should be created in a location accessible from some of the listed topologies.
     */
    preferred?: outputs.CsiVolumeTopologyRequestPreferred;
    /**
     * `(``Topology``: <optional>)` - Required topologies indicate that the volume must be created in a location accessible from all the listed topologies.
     */
    required?: outputs.CsiVolumeTopologyRequestRequired;
}

export interface CsiVolumeTopologyRequestPreferred {
    /**
     * Defines the location for the volume.
     */
    topologies: outputs.CsiVolumeTopologyRequestPreferredTopology[];
}

export interface CsiVolumeTopologyRequestPreferredTopology {
    /**
     * Define the attributes for the topology request.
     */
    segments: {[key: string]: string};
}

export interface CsiVolumeTopologyRequestRequired {
    /**
     * Defines the location for the volume.
     */
    topologies: outputs.CsiVolumeTopologyRequestRequiredTopology[];
}

export interface CsiVolumeTopologyRequestRequiredTopology {
    /**
     * Define the attributes for the topology request.
     */
    segments: {[key: string]: string};
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
    /**
     * Defines the location for the volume.
     */
    topologies: outputs.ExternalVolumeTopologyRequestPreferredTopology[];
}

export interface ExternalVolumeTopologyRequestPreferredTopology {
    /**
     * Define the attributes for the topology request.
     */
    segments: {[key: string]: string};
}

export interface ExternalVolumeTopologyRequestRequired {
    /**
     * Defines the location for the volume.
     */
    topologies: outputs.ExternalVolumeTopologyRequestRequiredTopology[];
}

export interface ExternalVolumeTopologyRequestRequiredTopology {
    /**
     * Define the attributes for the topology request.
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
    /**
     * The ID of the ACL role.
     */
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
    /**
     * The ID of the ACL role.
     */
    id: string;
    /**
     * `(TypeString)` The name of the token.
     */
    name: string;
}

export interface GetAllocationsAllocation {
    /**
     * `(string)` - The current client status of the allocation.
     */
    clientStatus: string;
    /**
     * `(int)` - The Raft index in which the allocation was created.
     */
    createIndex: number;
    /**
     * `(int)` - The timestamp of when the allocation was created.
     */
    createTime: number;
    /**
     * `(string)` - The current desired status of the allocation.
     */
    desiredStatus: string;
    /**
     * `(string)` - The ID of the evaluation that generated the allocation.
     */
    evalId: string;
    /**
     * `(string)` - The ID of the evaluation that succeeds the allocation evaluation.
     */
    followupEvalId: string;
    /**
     * `(string)` - The ID of the allocation.
     */
    id: string;
    /**
     * `(string)` - The ID of the job related to the allocation.
     */
    jobId: string;
    /**
     * `(string)` - The type of the job related to the allocation.
     */
    jobType: string;
    /**
     * `(int)` - The version of the job that generated the allocation.
     */
    jobVersion: number;
    /**
     * `(int)` - The Raft index in which the allocation was last modified.
     */
    modifyIndex: number;
    /**
     * `(int)` - The timestamp of when the allocation was last modified.
     */
    modifyTime: number;
    /**
     * `(string)` - The name of the allocation.
     */
    name: string;
    /**
     * `(string: <optional>)` - Specifies the namespace to search for
     * allocations in.
     */
    namespace: string;
    /**
     * `(string)` - The ID of the allocation that succeeds the allocation.
     */
    nextAllocation: string;
    /**
     * `(string)` - The ID of the node to which the allocation was scheduled.
     */
    nodeId: string;
    /**
     * `(string)` - The ID of the node to which the allocation was scheduled.
     */
    nodeName: string;
    /**
     * `(string)` - The ID of the allocation that preempted the allocation.
     */
    preemptedByAllocation: string;
    /**
     * `(string)` - The job task group related to the allocation.
     */
    taskGroup: string;
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
    meta: {[key: string]: string};
    /**
     * `(string)` Name of the job.
     */
    name: string;
    tasks: outputs.GetJobTaskGroupTask[];
    volumes: outputs.GetJobTaskGroupVolume[];
}

export interface GetJobTaskGroupTask {
    driver: string;
    meta: {[key: string]: string};
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

export interface GetJwksKey {
    /**
     * `(string)` - JWK field `alg`
     */
    algorithm: string;
    /**
     * `(string)` - JWK field `e`
     */
    exponent: string;
    /**
     * `(string)` - JWK field `kid`
     */
    keyId: string;
    /**
     * `(string)` - JWK field `kty`
     */
    keyType: string;
    /**
     * `(string)` - JWK field `use`
     */
    keyUse: string;
    /**
     * `(string)` - JWK field `n`
     */
    modulus: string;
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

export interface GetNamespaceNodePoolConfig {
    alloweds: string[];
    default: string;
    denieds: string[];
}

export interface GetNodePoolSchedulerConfig {
    /**
     * `(string)` - Whether or not memory
     * oversubscription is enabled in the node pool. If empty or not defined the
     * global cluster configuration is used.
     */
    memoryOversubscription: string;
    /**
     * `(string)` - The scheduler algorithm used in the node
     * pool. If empty or not defined the global cluster configuration is used.
     */
    schedulerAlgorithm: string;
}

export interface GetNodePoolsNodePool {
    /**
     * `(string)` - The description of the node pool.
     */
    description: string;
    /**
     * `(map[string]string)` - Arbitrary KV metadata associated with the
     * node pool.
     */
    meta: {[key: string]: string};
    /**
     * `(string)` - The name of the node pool.
     */
    name: string;
    /**
     * `(block)` - Scheduler configuration for the node pool.
     */
    schedulerConfigs: outputs.GetNodePoolsNodePoolSchedulerConfig[];
}

export interface GetNodePoolsNodePoolSchedulerConfig {
    /**
     * `(string)` - Whether or not memory
     * oversubscription is enabled in the node pool. If empty or not defined the
     * global cluster configuration is used.
     */
    memoryOversubscription: string;
    /**
     * `(string)` - The scheduler algorithm used in the node
     * pool. If empty or not defined the global cluster configuration is used.
     */
    schedulerAlgorithm: string;
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
    target: {[key: string]: string};
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
     * `(boolean: false)` - **Deprecated** All HCL jobs are parsed as
     * HCL2 by default.
     *
     * @deprecated Starting with version 2.0.0 of the Nomad provider, jobs are parsed using HCL2 by default, so this field is no longer used and may be safely removed from your configuration files. Set 'hcl1 = true' if you must use HCL1 job parsing.
     */
    enabled?: boolean;
    /**
     * Additional variables to use when templating the job with HCL2
     */
    vars?: {[key: string]: string};
}

export interface JobTaskGroup {
    count: number;
    meta: {[key: string]: string};
    name: string;
    tasks: outputs.JobTaskGroupTask[];
    volumes: outputs.JobTaskGroupVolume[];
}

export interface JobTaskGroupTask {
    driver: string;
    meta: {[key: string]: string};
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

export interface NamespaceNodePoolConfig {
    /**
     * `([]string: <optional>)` - The list of node pools that are allowed to be used in this namespace.
     */
    alloweds?: string[];
    /**
     * `(string: <optional>)` - The default node pool for jobs that don't define one.
     */
    default: string;
    /**
     * `([]string: <optional>)` - The list of node pools that are not allowed to be used in this namespace.
     */
    denieds?: string[];
}

export interface NodePoolSchedulerConfig {
    /**
     * `(string)` - Whether or not memory
     * oversubscription is enabled in the node pool. Possible values are
     * `"enabled"` or `"disabled"`. If not defined the global cluster
     * configuration is used.
     *
     * > This option differs from Nomad, where it's represented as a boolean, to
     * allow distinguishing between memory oversubscription being disabled in the
     * node pool and this property not being set.
     */
    memoryOversubscription?: string;
    /**
     * `(string)` - The scheduler algorithm used in the node
     * pool. Possible values are `binpack` or `spread`. If not defined the global
     * cluster configuration is used.
     */
    schedulerAlgorithm?: string;
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
    /**
     * Defines the location for the volume.
     */
    topologies: outputs.VolumeTopologyRequestRequiredTopology[];
}

export interface VolumeTopologyRequestRequiredTopology {
    /**
     * Define attributes for the topology request.
     */
    segments: {[key: string]: string};
}

export namespace config {
    export interface Headers {
        /**
         * The header name
         */
        name: string;
        /**
         * The header value
         */
        value: string;
    }

}
