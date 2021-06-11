// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provisions a namespace within a Nomad cluster.
 *
 * Nomad auto-generates a default namespace called `default`. This namespace
 * cannot be removed, so destroying a `nomad.Namespace` resource where
 * `name = "default"` will cause the namespace to be reset to its default
 * configuration.
 *
 * ## Example Usage
 *
 * Registering a namespace:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const dev = new nomad.Namespace("dev", {
 *     description: "Shared development environment.",
 *     quota: "dev",
 * });
 * ```
 *
 * Registering a namespace with a quota:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const webTeam = new nomad.QuoteSpecification("webTeam", {
 *     description: "web team quota",
 *     limits: [{
 *         region: "global",
 *         regionLimit: {
 *             cpu: 1000,
 *             memoryMb: 256,
 *         },
 *     }],
 * });
 * const web = new nomad.Namespace("web", {
 *     description: "Web team production environment.",
 *     quota: webTeam.name,
 * });
 * ```
 */
export class Namespace extends pulumi.CustomResource {
    /**
     * Get an existing Namespace resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NamespaceState, opts?: pulumi.CustomResourceOptions): Namespace {
        return new Namespace(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'nomad:index/namespace:Namespace';

    /**
     * Returns true if the given object is an instance of Namespace.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Namespace {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Namespace.__pulumiType;
    }

    /**
     * `(string: "")` - A description of the namespace.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * `(string: <required>)` - A unique name for the namespace.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * `(string: "")` - A resource quota to attach to the namespace.
     */
    public readonly quota!: pulumi.Output<string | undefined>;

    /**
     * Create a Namespace resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: NamespaceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NamespaceArgs | NamespaceState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NamespaceState | undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["quota"] = state ? state.quota : undefined;
        } else {
            const args = argsOrState as NamespaceArgs | undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["quota"] = args ? args.quota : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Namespace.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Namespace resources.
 */
export interface NamespaceState {
    /**
     * `(string: "")` - A description of the namespace.
     */
    description?: pulumi.Input<string>;
    /**
     * `(string: <required>)` - A unique name for the namespace.
     */
    name?: pulumi.Input<string>;
    /**
     * `(string: "")` - A resource quota to attach to the namespace.
     */
    quota?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Namespace resource.
 */
export interface NamespaceArgs {
    /**
     * `(string: "")` - A description of the namespace.
     */
    description?: pulumi.Input<string>;
    /**
     * `(string: <required>)` - A unique name for the namespace.
     */
    name?: pulumi.Input<string>;
    /**
     * `(string: "")` - A resource quota to attach to the namespace.
     */
    quota?: pulumi.Input<string>;
}
