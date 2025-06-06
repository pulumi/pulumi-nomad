// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * Creating a volume:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * // It can sometimes be helpful to wait for a particular plugin to be available
 * const ebs = nomad.getPlugin({
 *     pluginId: "aws-ebs0",
 *     waitForHealthy: true,
 * });
 * const mysqlVolume = new nomad.ExternalVolume("mysql_volume", {
 *     type: "csi",
 *     pluginId: "aws-ebs0",
 *     volumeId: "mysql_volume",
 *     name: "mysql_volume",
 *     capacityMin: "10GiB",
 *     capacityMax: "20GiB",
 *     capabilities: [{
 *         accessMode: "single-node-writer",
 *         attachmentMode: "file-system",
 *     }],
 *     mountOptions: {
 *         fsType: "ext4",
 *     },
 *     topologyRequest: {
 *         required: {
 *             topologies: [
 *                 {
 *                     segments: {
 *                         rack: "R1",
 *                         zone: "us-east-1a",
 *                     },
 *                 },
 *                 {
 *                     segments: {
 *                         rack: "R2",
 *                     },
 *                 },
 *             ],
 *         },
 *     },
 * }, {
 *     dependsOn: [ebs],
 * });
 * ```
 */
export class ExternalVolume extends pulumi.CustomResource {
    /**
     * Get an existing ExternalVolume resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ExternalVolumeState, opts?: pulumi.CustomResourceOptions): ExternalVolume {
        return new ExternalVolume(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'nomad:index/externalVolume:ExternalVolume';

    /**
     * Returns true if the given object is an instance of ExternalVolume.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ExternalVolume {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ExternalVolume.__pulumiType;
    }

    /**
     * `(``Capability``: <required>)` - Options for validating the capability of a volume.
     */
    public readonly capabilities!: pulumi.Output<outputs.ExternalVolumeCapability[]>;
    /**
     * `(string: <optional>)` - Option to signal a maximum volume size. This may not be supported by all storage providers.
     */
    public readonly capacityMax!: pulumi.Output<string | undefined>;
    /**
     * `(string: <optional>)` - Option to signal a minimum volume size. This may not be supported by all storage providers.
     */
    public readonly capacityMin!: pulumi.Output<string | undefined>;
    /**
     * `(string: <optional>)` - The external ID of an existing volume to restore. If ommited, the volume will be created from scratch. Conflicts with `snapshotId`.
     */
    public readonly cloneId!: pulumi.Output<string | undefined>;
    public /*out*/ readonly controllerRequired!: pulumi.Output<boolean>;
    public /*out*/ readonly controllersExpected!: pulumi.Output<number>;
    public /*out*/ readonly controllersHealthy!: pulumi.Output<number>;
    /**
     * `(block: optional)` Options for mounting `block-device` volumes without a pre-formatted file system.
     */
    public readonly mountOptions!: pulumi.Output<outputs.ExternalVolumeMountOptions | undefined>;
    /**
     * `(string: <required>)` - The display name for the volume.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * `(string: "default")` - The namespace in which to register the volume.
     */
    public readonly namespace!: pulumi.Output<string | undefined>;
    public /*out*/ readonly nodesExpected!: pulumi.Output<number>;
    public /*out*/ readonly nodesHealthy!: pulumi.Output<number>;
    /**
     * `(map[string]string: optional)` An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
     */
    public readonly parameters!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * `(string: <required>)` - The ID of the Nomad plugin for registering this volume.
     */
    public readonly pluginId!: pulumi.Output<string>;
    public /*out*/ readonly pluginProvider!: pulumi.Output<string>;
    public /*out*/ readonly pluginProviderVersion!: pulumi.Output<string>;
    public /*out*/ readonly schedulable!: pulumi.Output<boolean>;
    /**
     * `(map[string]string: optional)` An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
     */
    public readonly secrets!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * `(string: <optional>)` - The external ID of a snapshot to restore. If ommited, the volume will be created from scratch. Conflicts with `cloneId`.
     */
    public readonly snapshotId!: pulumi.Output<string | undefined>;
    public /*out*/ readonly topologies!: pulumi.Output<outputs.ExternalVolumeTopology[]>;
    /**
     * `(``TopologyRequest``: <optional>)` - Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
     */
    public readonly topologyRequest!: pulumi.Output<outputs.ExternalVolumeTopologyRequest | undefined>;
    /**
     * `(string: <required>)` - The type of the volume. Currently, only `csi` is supported.
     */
    public readonly type!: pulumi.Output<string | undefined>;
    /**
     * `(string: <required>)` - The unique ID of the volume.
     */
    public readonly volumeId!: pulumi.Output<string>;

    /**
     * Create a ExternalVolume resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ExternalVolumeArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ExternalVolumeArgs | ExternalVolumeState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ExternalVolumeState | undefined;
            resourceInputs["capabilities"] = state ? state.capabilities : undefined;
            resourceInputs["capacityMax"] = state ? state.capacityMax : undefined;
            resourceInputs["capacityMin"] = state ? state.capacityMin : undefined;
            resourceInputs["cloneId"] = state ? state.cloneId : undefined;
            resourceInputs["controllerRequired"] = state ? state.controllerRequired : undefined;
            resourceInputs["controllersExpected"] = state ? state.controllersExpected : undefined;
            resourceInputs["controllersHealthy"] = state ? state.controllersHealthy : undefined;
            resourceInputs["mountOptions"] = state ? state.mountOptions : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["namespace"] = state ? state.namespace : undefined;
            resourceInputs["nodesExpected"] = state ? state.nodesExpected : undefined;
            resourceInputs["nodesHealthy"] = state ? state.nodesHealthy : undefined;
            resourceInputs["parameters"] = state ? state.parameters : undefined;
            resourceInputs["pluginId"] = state ? state.pluginId : undefined;
            resourceInputs["pluginProvider"] = state ? state.pluginProvider : undefined;
            resourceInputs["pluginProviderVersion"] = state ? state.pluginProviderVersion : undefined;
            resourceInputs["schedulable"] = state ? state.schedulable : undefined;
            resourceInputs["secrets"] = state ? state.secrets : undefined;
            resourceInputs["snapshotId"] = state ? state.snapshotId : undefined;
            resourceInputs["topologies"] = state ? state.topologies : undefined;
            resourceInputs["topologyRequest"] = state ? state.topologyRequest : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["volumeId"] = state ? state.volumeId : undefined;
        } else {
            const args = argsOrState as ExternalVolumeArgs | undefined;
            if ((!args || args.capabilities === undefined) && !opts.urn) {
                throw new Error("Missing required property 'capabilities'");
            }
            if ((!args || args.pluginId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'pluginId'");
            }
            if ((!args || args.volumeId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'volumeId'");
            }
            resourceInputs["capabilities"] = args ? args.capabilities : undefined;
            resourceInputs["capacityMax"] = args ? args.capacityMax : undefined;
            resourceInputs["capacityMin"] = args ? args.capacityMin : undefined;
            resourceInputs["cloneId"] = args ? args.cloneId : undefined;
            resourceInputs["mountOptions"] = args ? args.mountOptions : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["namespace"] = args ? args.namespace : undefined;
            resourceInputs["parameters"] = args ? args.parameters : undefined;
            resourceInputs["pluginId"] = args ? args.pluginId : undefined;
            resourceInputs["secrets"] = args?.secrets ? pulumi.secret(args.secrets) : undefined;
            resourceInputs["snapshotId"] = args ? args.snapshotId : undefined;
            resourceInputs["topologyRequest"] = args ? args.topologyRequest : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["volumeId"] = args ? args.volumeId : undefined;
            resourceInputs["controllerRequired"] = undefined /*out*/;
            resourceInputs["controllersExpected"] = undefined /*out*/;
            resourceInputs["controllersHealthy"] = undefined /*out*/;
            resourceInputs["nodesExpected"] = undefined /*out*/;
            resourceInputs["nodesHealthy"] = undefined /*out*/;
            resourceInputs["pluginProvider"] = undefined /*out*/;
            resourceInputs["pluginProviderVersion"] = undefined /*out*/;
            resourceInputs["schedulable"] = undefined /*out*/;
            resourceInputs["topologies"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["secrets"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(ExternalVolume.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ExternalVolume resources.
 */
export interface ExternalVolumeState {
    /**
     * `(``Capability``: <required>)` - Options for validating the capability of a volume.
     */
    capabilities?: pulumi.Input<pulumi.Input<inputs.ExternalVolumeCapability>[]>;
    /**
     * `(string: <optional>)` - Option to signal a maximum volume size. This may not be supported by all storage providers.
     */
    capacityMax?: pulumi.Input<string>;
    /**
     * `(string: <optional>)` - Option to signal a minimum volume size. This may not be supported by all storage providers.
     */
    capacityMin?: pulumi.Input<string>;
    /**
     * `(string: <optional>)` - The external ID of an existing volume to restore. If ommited, the volume will be created from scratch. Conflicts with `snapshotId`.
     */
    cloneId?: pulumi.Input<string>;
    controllerRequired?: pulumi.Input<boolean>;
    controllersExpected?: pulumi.Input<number>;
    controllersHealthy?: pulumi.Input<number>;
    /**
     * `(block: optional)` Options for mounting `block-device` volumes without a pre-formatted file system.
     */
    mountOptions?: pulumi.Input<inputs.ExternalVolumeMountOptions>;
    /**
     * `(string: <required>)` - The display name for the volume.
     */
    name?: pulumi.Input<string>;
    /**
     * `(string: "default")` - The namespace in which to register the volume.
     */
    namespace?: pulumi.Input<string>;
    nodesExpected?: pulumi.Input<number>;
    nodesHealthy?: pulumi.Input<number>;
    /**
     * `(map[string]string: optional)` An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
     */
    parameters?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * `(string: <required>)` - The ID of the Nomad plugin for registering this volume.
     */
    pluginId?: pulumi.Input<string>;
    pluginProvider?: pulumi.Input<string>;
    pluginProviderVersion?: pulumi.Input<string>;
    schedulable?: pulumi.Input<boolean>;
    /**
     * `(map[string]string: optional)` An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
     */
    secrets?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * `(string: <optional>)` - The external ID of a snapshot to restore. If ommited, the volume will be created from scratch. Conflicts with `cloneId`.
     */
    snapshotId?: pulumi.Input<string>;
    topologies?: pulumi.Input<pulumi.Input<inputs.ExternalVolumeTopology>[]>;
    /**
     * `(``TopologyRequest``: <optional>)` - Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
     */
    topologyRequest?: pulumi.Input<inputs.ExternalVolumeTopologyRequest>;
    /**
     * `(string: <required>)` - The type of the volume. Currently, only `csi` is supported.
     */
    type?: pulumi.Input<string>;
    /**
     * `(string: <required>)` - The unique ID of the volume.
     */
    volumeId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ExternalVolume resource.
 */
export interface ExternalVolumeArgs {
    /**
     * `(``Capability``: <required>)` - Options for validating the capability of a volume.
     */
    capabilities: pulumi.Input<pulumi.Input<inputs.ExternalVolumeCapability>[]>;
    /**
     * `(string: <optional>)` - Option to signal a maximum volume size. This may not be supported by all storage providers.
     */
    capacityMax?: pulumi.Input<string>;
    /**
     * `(string: <optional>)` - Option to signal a minimum volume size. This may not be supported by all storage providers.
     */
    capacityMin?: pulumi.Input<string>;
    /**
     * `(string: <optional>)` - The external ID of an existing volume to restore. If ommited, the volume will be created from scratch. Conflicts with `snapshotId`.
     */
    cloneId?: pulumi.Input<string>;
    /**
     * `(block: optional)` Options for mounting `block-device` volumes without a pre-formatted file system.
     */
    mountOptions?: pulumi.Input<inputs.ExternalVolumeMountOptions>;
    /**
     * `(string: <required>)` - The display name for the volume.
     */
    name?: pulumi.Input<string>;
    /**
     * `(string: "default")` - The namespace in which to register the volume.
     */
    namespace?: pulumi.Input<string>;
    /**
     * `(map[string]string: optional)` An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
     */
    parameters?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * `(string: <required>)` - The ID of the Nomad plugin for registering this volume.
     */
    pluginId: pulumi.Input<string>;
    /**
     * `(map[string]string: optional)` An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
     */
    secrets?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * `(string: <optional>)` - The external ID of a snapshot to restore. If ommited, the volume will be created from scratch. Conflicts with `cloneId`.
     */
    snapshotId?: pulumi.Input<string>;
    /**
     * `(``TopologyRequest``: <optional>)` - Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
     */
    topologyRequest?: pulumi.Input<inputs.ExternalVolumeTopologyRequest>;
    /**
     * `(string: <required>)` - The type of the volume. Currently, only `csi` is supported.
     */
    type?: pulumi.Input<string>;
    /**
     * `(string: <required>)` - The unique ID of the volume.
     */
    volumeId: pulumi.Input<string>;
}
