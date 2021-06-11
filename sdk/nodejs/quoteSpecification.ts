// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Manages a quota specification in a Nomad cluster.
 *
 * ## Example Usage
 *
 * Registering a quota specification:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const prodApi = new nomad.QuoteSpecification("prod_api", {
 *     description: "Production instances of backend API servers",
 *     limits: [{
 *         region: "global",
 *         regionLimit: {
 *             cpu: 2400,
 *             memoryMb: 1200,
 *         },
 *     }],
 * });
 * ```
 */
export class QuoteSpecification extends pulumi.CustomResource {
    /**
     * Get an existing QuoteSpecification resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: QuoteSpecificationState, opts?: pulumi.CustomResourceOptions): QuoteSpecification {
        return new QuoteSpecification(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'nomad:index/quoteSpecification:QuoteSpecification';

    /**
     * Returns true if the given object is an instance of QuoteSpecification.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is QuoteSpecification {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === QuoteSpecification.__pulumiType;
    }

    /**
     * `(string: "")` - A description of the quota specification.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * `(block: <required>)` - A block of quota limits to enforce. Can
     * be repeated. See below for the structure of this block.
     */
    public readonly limits!: pulumi.Output<outputs.QuoteSpecificationLimit[]>;
    /**
     * `(string: <required>)` - A unique name for the quota specification.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a QuoteSpecification resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: QuoteSpecificationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: QuoteSpecificationArgs | QuoteSpecificationState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as QuoteSpecificationState | undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["limits"] = state ? state.limits : undefined;
            inputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as QuoteSpecificationArgs | undefined;
            if ((!args || args.limits === undefined) && !opts.urn) {
                throw new Error("Missing required property 'limits'");
            }
            inputs["description"] = args ? args.description : undefined;
            inputs["limits"] = args ? args.limits : undefined;
            inputs["name"] = args ? args.name : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(QuoteSpecification.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering QuoteSpecification resources.
 */
export interface QuoteSpecificationState {
    /**
     * `(string: "")` - A description of the quota specification.
     */
    description?: pulumi.Input<string>;
    /**
     * `(block: <required>)` - A block of quota limits to enforce. Can
     * be repeated. See below for the structure of this block.
     */
    limits?: pulumi.Input<pulumi.Input<inputs.QuoteSpecificationLimit>[]>;
    /**
     * `(string: <required>)` - A unique name for the quota specification.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a QuoteSpecification resource.
 */
export interface QuoteSpecificationArgs {
    /**
     * `(string: "")` - A description of the quota specification.
     */
    description?: pulumi.Input<string>;
    /**
     * `(block: <required>)` - A block of quota limits to enforce. Can
     * be repeated. See below for the structure of this block.
     */
    limits: pulumi.Input<pulumi.Input<inputs.QuoteSpecificationLimit>[]>;
    /**
     * `(string: <required>)` - A unique name for the quota specification.
     */
    name?: pulumi.Input<string>;
}
