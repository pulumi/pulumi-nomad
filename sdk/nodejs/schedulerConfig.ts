// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Manages scheduler configuration of the Nomad cluster.
 *
 * > **Warning:** destroying this resource will not have any effect in the
 * cluster configuration, since there's no clear definition of what a destroy
 * action should do. The cluster will be left as-is and only the state reference
 * will be removed.
 *
 * ## Example Usage
 *
 * Set cluster scheduler configuration:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const config = new nomad.SchedulerConfig("config", {
 *     preemptionConfig: {
 *         batch_scheduler_enabled: true,
 *         service_scheduler_enabled: true,
 *         system_scheduler_enabled: true,
 *     },
 *     schedulerAlgorithm: "spread",
 * });
 * ```
 */
export class SchedulerConfig extends pulumi.CustomResource {
    /**
     * Get an existing SchedulerConfig resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SchedulerConfigState, opts?: pulumi.CustomResourceOptions): SchedulerConfig {
        return new SchedulerConfig(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'nomad:index/schedulerConfig:SchedulerConfig';

    /**
     * Returns true if the given object is an instance of SchedulerConfig.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SchedulerConfig {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SchedulerConfig.__pulumiType;
    }

    /**
     * `(bool: false)` - When `true`, tasks may exceed their reserved memory limit.
     */
    public readonly memoryOversubscriptionEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * `(map[string]bool)` - Options to enable preemption for various schedulers.
     */
    public readonly preemptionConfig!: pulumi.Output<{[key: string]: boolean} | undefined>;
    /**
     * `(string: "binpack")` - Specifies whether scheduler binpacks or spreads allocations on available nodes. Possible values are `binpack` and `spread`.
     */
    public readonly schedulerAlgorithm!: pulumi.Output<string | undefined>;

    /**
     * Create a SchedulerConfig resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: SchedulerConfigArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SchedulerConfigArgs | SchedulerConfigState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SchedulerConfigState | undefined;
            inputs["memoryOversubscriptionEnabled"] = state ? state.memoryOversubscriptionEnabled : undefined;
            inputs["preemptionConfig"] = state ? state.preemptionConfig : undefined;
            inputs["schedulerAlgorithm"] = state ? state.schedulerAlgorithm : undefined;
        } else {
            const args = argsOrState as SchedulerConfigArgs | undefined;
            inputs["memoryOversubscriptionEnabled"] = args ? args.memoryOversubscriptionEnabled : undefined;
            inputs["preemptionConfig"] = args ? args.preemptionConfig : undefined;
            inputs["schedulerAlgorithm"] = args ? args.schedulerAlgorithm : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(SchedulerConfig.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SchedulerConfig resources.
 */
export interface SchedulerConfigState {
    /**
     * `(bool: false)` - When `true`, tasks may exceed their reserved memory limit.
     */
    memoryOversubscriptionEnabled?: pulumi.Input<boolean>;
    /**
     * `(map[string]bool)` - Options to enable preemption for various schedulers.
     */
    preemptionConfig?: pulumi.Input<{[key: string]: pulumi.Input<boolean>}>;
    /**
     * `(string: "binpack")` - Specifies whether scheduler binpacks or spreads allocations on available nodes. Possible values are `binpack` and `spread`.
     */
    schedulerAlgorithm?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SchedulerConfig resource.
 */
export interface SchedulerConfigArgs {
    /**
     * `(bool: false)` - When `true`, tasks may exceed their reserved memory limit.
     */
    memoryOversubscriptionEnabled?: pulumi.Input<boolean>;
    /**
     * `(map[string]bool)` - Options to enable preemption for various schedulers.
     */
    preemptionConfig?: pulumi.Input<{[key: string]: pulumi.Input<boolean>}>;
    /**
     * `(string: "binpack")` - Specifies whether scheduler binpacks or spreads allocations on available nodes. Possible values are `binpack` and `spread`.
     */
    schedulerAlgorithm?: pulumi.Input<string>;
}