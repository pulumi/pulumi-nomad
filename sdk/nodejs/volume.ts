// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * Registering a volume:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const ebs = nomad.getPlugin({
 *     pluginId: "aws-ebs0",
 *     waitForHealthy: true,
 * });
 * const mysqlVolume = new nomad.Volume("mysqlVolume", {
 *     type: "csi",
 *     pluginId: "aws-ebs0",
 *     volumeId: "mysql_volume",
 *     externalId: module.hashistack.ebs_test_volume_id,
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
export class Volume extends pulumi.CustomResource {
    /**
     * Get an existing Volume resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VolumeState, opts?: pulumi.CustomResourceOptions): Volume {
        return new Volume(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'nomad:index/volume:Volume';

    /**
     * Returns true if the given object is an instance of Volume.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Volume {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Volume.__pulumiType;
    }

    /**
     * Defines whether a volume should be available concurrently.
     *
     * @deprecated use capability instead
     */
    public readonly accessMode!: pulumi.Output<string | undefined>;
    /**
     * The storage API that will be used by the volume.
     *
     * @deprecated use capability instead
     */
    public readonly attachmentMode!: pulumi.Output<string | undefined>;
    /**
     * Capabilities intended to be used in a job. At least one capability must be provided.
     */
    public readonly capabilities!: pulumi.Output<outputs.VolumeCapability[] | undefined>;
    /**
     * An optional key-value map of strings passed directly to the CSI plugin to validate the volume.
     */
    public readonly context!: pulumi.Output<{[key: string]: string} | undefined>;
    public /*out*/ readonly controllerRequired!: pulumi.Output<boolean>;
    public /*out*/ readonly controllersExpected!: pulumi.Output<number>;
    public /*out*/ readonly controllersHealthy!: pulumi.Output<number>;
    /**
     * If true, the volume will be deregistered on destroy.
     */
    public readonly deregisterOnDestroy!: pulumi.Output<boolean | undefined>;
    /**
     * The ID of the physical volume from the storage provider.
     */
    public readonly externalId!: pulumi.Output<string>;
    /**
     * Options for mounting 'block-device' volumes without a pre-formatted file system.
     */
    public readonly mountOptions!: pulumi.Output<outputs.VolumeMountOptions | undefined>;
    /**
     * The display name of the volume.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The namespace in which to create the volume.
     */
    public readonly namespace!: pulumi.Output<string | undefined>;
    public /*out*/ readonly nodesExpected!: pulumi.Output<number>;
    public /*out*/ readonly nodesHealthy!: pulumi.Output<number>;
    /**
     * An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
     */
    public readonly parameters!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The ID of the CSI plugin that manages this volume.
     */
    public readonly pluginId!: pulumi.Output<string>;
    public /*out*/ readonly pluginProvider!: pulumi.Output<string>;
    public /*out*/ readonly pluginProviderVersion!: pulumi.Output<string>;
    public /*out*/ readonly schedulable!: pulumi.Output<boolean>;
    /**
     * An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
     */
    public readonly secrets!: pulumi.Output<{[key: string]: string} | undefined>;
    public /*out*/ readonly topologies!: pulumi.Output<outputs.VolumeTopology[]>;
    /**
     * Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
     */
    public readonly topologyRequest!: pulumi.Output<outputs.VolumeTopologyRequest | undefined>;
    /**
     * The type of the volume. Currently, only 'csi' is supported.
     */
    public readonly type!: pulumi.Output<string | undefined>;
    /**
     * The unique ID of the volume, how jobs will refer to the volume.
     */
    public readonly volumeId!: pulumi.Output<string>;

    /**
     * Create a Volume resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VolumeArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VolumeArgs | VolumeState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VolumeState | undefined;
            resourceInputs["accessMode"] = state ? state.accessMode : undefined;
            resourceInputs["attachmentMode"] = state ? state.attachmentMode : undefined;
            resourceInputs["capabilities"] = state ? state.capabilities : undefined;
            resourceInputs["context"] = state ? state.context : undefined;
            resourceInputs["controllerRequired"] = state ? state.controllerRequired : undefined;
            resourceInputs["controllersExpected"] = state ? state.controllersExpected : undefined;
            resourceInputs["controllersHealthy"] = state ? state.controllersHealthy : undefined;
            resourceInputs["deregisterOnDestroy"] = state ? state.deregisterOnDestroy : undefined;
            resourceInputs["externalId"] = state ? state.externalId : undefined;
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
            resourceInputs["topologies"] = state ? state.topologies : undefined;
            resourceInputs["topologyRequest"] = state ? state.topologyRequest : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["volumeId"] = state ? state.volumeId : undefined;
        } else {
            const args = argsOrState as VolumeArgs | undefined;
            if ((!args || args.externalId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'externalId'");
            }
            if ((!args || args.pluginId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'pluginId'");
            }
            if ((!args || args.volumeId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'volumeId'");
            }
            resourceInputs["accessMode"] = args ? args.accessMode : undefined;
            resourceInputs["attachmentMode"] = args ? args.attachmentMode : undefined;
            resourceInputs["capabilities"] = args ? args.capabilities : undefined;
            resourceInputs["context"] = args ? args.context : undefined;
            resourceInputs["deregisterOnDestroy"] = args ? args.deregisterOnDestroy : undefined;
            resourceInputs["externalId"] = args ? args.externalId : undefined;
            resourceInputs["mountOptions"] = args ? args.mountOptions : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["namespace"] = args ? args.namespace : undefined;
            resourceInputs["parameters"] = args ? args.parameters : undefined;
            resourceInputs["pluginId"] = args ? args.pluginId : undefined;
            resourceInputs["secrets"] = args ? args.secrets : undefined;
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
        super(Volume.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Volume resources.
 */
export interface VolumeState {
    /**
     * Defines whether a volume should be available concurrently.
     *
     * @deprecated use capability instead
     */
    accessMode?: pulumi.Input<string>;
    /**
     * The storage API that will be used by the volume.
     *
     * @deprecated use capability instead
     */
    attachmentMode?: pulumi.Input<string>;
    /**
     * Capabilities intended to be used in a job. At least one capability must be provided.
     */
    capabilities?: pulumi.Input<pulumi.Input<inputs.VolumeCapability>[]>;
    /**
     * An optional key-value map of strings passed directly to the CSI plugin to validate the volume.
     */
    context?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    controllerRequired?: pulumi.Input<boolean>;
    controllersExpected?: pulumi.Input<number>;
    controllersHealthy?: pulumi.Input<number>;
    /**
     * If true, the volume will be deregistered on destroy.
     */
    deregisterOnDestroy?: pulumi.Input<boolean>;
    /**
     * The ID of the physical volume from the storage provider.
     */
    externalId?: pulumi.Input<string>;
    /**
     * Options for mounting 'block-device' volumes without a pre-formatted file system.
     */
    mountOptions?: pulumi.Input<inputs.VolumeMountOptions>;
    /**
     * The display name of the volume.
     */
    name?: pulumi.Input<string>;
    /**
     * The namespace in which to create the volume.
     */
    namespace?: pulumi.Input<string>;
    nodesExpected?: pulumi.Input<number>;
    nodesHealthy?: pulumi.Input<number>;
    /**
     * An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
     */
    parameters?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The ID of the CSI plugin that manages this volume.
     */
    pluginId?: pulumi.Input<string>;
    pluginProvider?: pulumi.Input<string>;
    pluginProviderVersion?: pulumi.Input<string>;
    schedulable?: pulumi.Input<boolean>;
    /**
     * An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
     */
    secrets?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    topologies?: pulumi.Input<pulumi.Input<inputs.VolumeTopology>[]>;
    /**
     * Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
     */
    topologyRequest?: pulumi.Input<inputs.VolumeTopologyRequest>;
    /**
     * The type of the volume. Currently, only 'csi' is supported.
     */
    type?: pulumi.Input<string>;
    /**
     * The unique ID of the volume, how jobs will refer to the volume.
     */
    volumeId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Volume resource.
 */
export interface VolumeArgs {
    /**
     * Defines whether a volume should be available concurrently.
     *
     * @deprecated use capability instead
     */
    accessMode?: pulumi.Input<string>;
    /**
     * The storage API that will be used by the volume.
     *
     * @deprecated use capability instead
     */
    attachmentMode?: pulumi.Input<string>;
    /**
     * Capabilities intended to be used in a job. At least one capability must be provided.
     */
    capabilities?: pulumi.Input<pulumi.Input<inputs.VolumeCapability>[]>;
    /**
     * An optional key-value map of strings passed directly to the CSI plugin to validate the volume.
     */
    context?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * If true, the volume will be deregistered on destroy.
     */
    deregisterOnDestroy?: pulumi.Input<boolean>;
    /**
     * The ID of the physical volume from the storage provider.
     */
    externalId: pulumi.Input<string>;
    /**
     * Options for mounting 'block-device' volumes without a pre-formatted file system.
     */
    mountOptions?: pulumi.Input<inputs.VolumeMountOptions>;
    /**
     * The display name of the volume.
     */
    name?: pulumi.Input<string>;
    /**
     * The namespace in which to create the volume.
     */
    namespace?: pulumi.Input<string>;
    /**
     * An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
     */
    parameters?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The ID of the CSI plugin that manages this volume.
     */
    pluginId: pulumi.Input<string>;
    /**
     * An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
     */
    secrets?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
     */
    topologyRequest?: pulumi.Input<inputs.VolumeTopologyRequest>;
    /**
     * The type of the volume. Currently, only 'csi' is supported.
     */
    type?: pulumi.Input<string>;
    /**
     * The unique ID of the volume, how jobs will refer to the volume.
     */
    volumeId: pulumi.Input<string>;
}
