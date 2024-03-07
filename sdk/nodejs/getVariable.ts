// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const example = new nomad.Variable("example", {path: "path/of/existing/variable"});
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getVariable(args: GetVariableArgs, opts?: pulumi.InvokeOptions): Promise<GetVariableResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("nomad:index/getVariable:getVariable", {
        "namespace": args.namespace,
        "path": args.path,
    }, opts);
}

/**
 * A collection of arguments for invoking getVariable.
 */
export interface GetVariableArgs {
    /**
     * `(string: "default")` - The namepsace in which the variable exists.
     */
    namespace?: string;
    /**
     * `(string)` - Path to the existing variable.
     */
    path: string;
}

/**
 * A collection of values returned by getVariable.
 */
export interface GetVariableResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * `(map[string]string)` - Map of items in the variable.
     */
    readonly items: {[key: string]: any};
    /**
     * `(string)` - The namespace in which the variable exists.
     */
    readonly namespace?: string;
    /**
     * `(string)` - The path at which the variable exists.
     */
    readonly path: string;
}
/**
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const example = new nomad.Variable("example", {path: "path/of/existing/variable"});
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getVariableOutput(args: GetVariableOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetVariableResult> {
    return pulumi.output(args).apply((a: any) => getVariable(a, opts))
}

/**
 * A collection of arguments for invoking getVariable.
 */
export interface GetVariableOutputArgs {
    /**
     * `(string: "default")` - The namepsace in which the variable exists.
     */
    namespace?: pulumi.Input<string>;
    /**
     * `(string)` - Path to the existing variable.
     */
    path: pulumi.Input<string>;
}
