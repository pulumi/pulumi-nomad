// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Lookup a plugin by ID. The aim of this datasource is to determine whether
 * a particular plugin exists on the cluster, to find information on the health
 * and availability of the plugin, and to optionally wait for the plugin
 * before performing actions the require an available plugin controller.
 *
 * If a plugin with the specified ID does not exist and the datasource is not
 * configured to wait, it will result in an error. For simple existence checks,
 * use the `nomad.getPlugins` listing datasource.
 *
 * ## Example Usage
 *
 * Check for the existence of a plugin:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const ebs = nomad.getPlugin({
 *     pluginId: "aws-ebs0",
 *     waitForHealthy: true,
 * });
 * ```
 *
 * This will check for a plugin with the ID `aws-ebs0`, waiting until the plugin
 * is healthy before returning.
 */
export function getPlugin(args: GetPluginArgs, opts?: pulumi.InvokeOptions): Promise<GetPluginResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("nomad:index/getPlugin:getPlugin", {
        "pluginId": args.pluginId,
        "waitForHealthy": args.waitForHealthy,
        "waitForRegistration": args.waitForRegistration,
    }, opts);
}

/**
 * A collection of arguments for invoking getPlugin.
 */
export interface GetPluginArgs {
    /**
     * `(string)` ID of the plugin.
     */
    pluginId: string;
    /**
     * `(boolean)` retry until the plugin exists and all controllers are healthy
     */
    waitForHealthy?: boolean;
    /**
     * `(boolean)` if the plugin doesn't exist, retry until it does
     */
    waitForRegistration?: boolean;
}

/**
 * A collection of values returned by getPlugin.
 */
export interface GetPluginResult {
    /**
     * `(boolean)` Whether a controller is required.
     */
    readonly controllerRequired: boolean;
    /**
     * `(integer)` The number of registered controllers.
     */
    readonly controllersExpected: number;
    /**
     * `(integer)` The number of healthy controllers.
     */
    readonly controllersHealthy: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly nodes: outputs.GetPluginNode[];
    /**
     * `(integer)` The number of registered nodes.
     */
    readonly nodesExpected: number;
    /**
     * `(integer)` The number of healthy nodes.
     */
    readonly nodesHealthy: number;
    /**
     * `(string)` ID of the plugin
     */
    readonly pluginId: string;
    /**
     * `(string)` Plugin provider name
     */
    readonly pluginProvider: string;
    /**
     * `(string)` Plugin provider version
     */
    readonly pluginProviderVersion: string;
    readonly waitForHealthy?: boolean;
    readonly waitForRegistration?: boolean;
}
/**
 * Lookup a plugin by ID. The aim of this datasource is to determine whether
 * a particular plugin exists on the cluster, to find information on the health
 * and availability of the plugin, and to optionally wait for the plugin
 * before performing actions the require an available plugin controller.
 *
 * If a plugin with the specified ID does not exist and the datasource is not
 * configured to wait, it will result in an error. For simple existence checks,
 * use the `nomad.getPlugins` listing datasource.
 *
 * ## Example Usage
 *
 * Check for the existence of a plugin:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as nomad from "@pulumi/nomad";
 *
 * const ebs = nomad.getPlugin({
 *     pluginId: "aws-ebs0",
 *     waitForHealthy: true,
 * });
 * ```
 *
 * This will check for a plugin with the ID `aws-ebs0`, waiting until the plugin
 * is healthy before returning.
 */
export function getPluginOutput(args: GetPluginOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPluginResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("nomad:index/getPlugin:getPlugin", {
        "pluginId": args.pluginId,
        "waitForHealthy": args.waitForHealthy,
        "waitForRegistration": args.waitForRegistration,
    }, opts);
}

/**
 * A collection of arguments for invoking getPlugin.
 */
export interface GetPluginOutputArgs {
    /**
     * `(string)` ID of the plugin.
     */
    pluginId: pulumi.Input<string>;
    /**
     * `(boolean)` retry until the plugin exists and all controllers are healthy
     */
    waitForHealthy?: pulumi.Input<boolean>;
    /**
     * `(boolean)` if the plugin doesn't exist, retry until it does
     */
    waitForRegistration?: pulumi.Input<boolean>;
}
