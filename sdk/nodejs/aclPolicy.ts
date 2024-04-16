// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Manages an ACL policy registered in Nomad.
 */
export class AclPolicy extends pulumi.CustomResource {
    /**
     * Get an existing AclPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AclPolicyState, opts?: pulumi.CustomResourceOptions): AclPolicy {
        return new AclPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'nomad:index/aclPolicy:AclPolicy';

    /**
     * Returns true if the given object is an instance of AclPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AclPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AclPolicy.__pulumiType;
    }

    /**
     * `(string: "")` - A description of the policy.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * `(``JobACL``: <optional>)` - Options for assigning the ACL rules to a job, group, or task.
     */
    public readonly jobAcl!: pulumi.Output<outputs.AclPolicyJobAcl | undefined>;
    /**
     * `(string: <required>)` - A unique name for the policy.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * `(string: <required>)` - The contents of the policy to register,
     * as HCL or JSON.
     */
    public readonly rulesHcl!: pulumi.Output<string>;

    /**
     * Create a AclPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AclPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AclPolicyArgs | AclPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AclPolicyState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["jobAcl"] = state ? state.jobAcl : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["rulesHcl"] = state ? state.rulesHcl : undefined;
        } else {
            const args = argsOrState as AclPolicyArgs | undefined;
            if ((!args || args.rulesHcl === undefined) && !opts.urn) {
                throw new Error("Missing required property 'rulesHcl'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["jobAcl"] = args ? args.jobAcl : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["rulesHcl"] = args ? args.rulesHcl : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AclPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AclPolicy resources.
 */
export interface AclPolicyState {
    /**
     * `(string: "")` - A description of the policy.
     */
    description?: pulumi.Input<string>;
    /**
     * `(``JobACL``: <optional>)` - Options for assigning the ACL rules to a job, group, or task.
     */
    jobAcl?: pulumi.Input<inputs.AclPolicyJobAcl>;
    /**
     * `(string: <required>)` - A unique name for the policy.
     */
    name?: pulumi.Input<string>;
    /**
     * `(string: <required>)` - The contents of the policy to register,
     * as HCL or JSON.
     */
    rulesHcl?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AclPolicy resource.
 */
export interface AclPolicyArgs {
    /**
     * `(string: "")` - A description of the policy.
     */
    description?: pulumi.Input<string>;
    /**
     * `(``JobACL``: <optional>)` - Options for assigning the ACL rules to a job, group, or task.
     */
    jobAcl?: pulumi.Input<inputs.AclPolicyJobAcl>;
    /**
     * `(string: <required>)` - A unique name for the policy.
     */
    name?: pulumi.Input<string>;
    /**
     * `(string: <required>)` - The contents of the policy to register,
     * as HCL or JSON.
     */
    rulesHcl: pulumi.Input<string>;
}
