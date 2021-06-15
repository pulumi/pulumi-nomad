// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

// Export members:
export * from "./aclPolicy";
export * from "./aclToken";
export * from "./externalVolume";
export * from "./getAclPolicies";
export * from "./getAclPolicy";
export * from "./getAclToken";
export * from "./getAclTokens";
export * from "./getDatacenters";
export * from "./getDeployments";
export * from "./getJob";
export * from "./getJobParser";
export * from "./getNamespace";
export * from "./getNamespaces";
export * from "./getPlugin";
export * from "./getPlugins";
export * from "./getRegions";
export * from "./getScalingPolicies";
export * from "./getScalingPolicy";
export * from "./getSchedulerPolicy";
export * from "./getVolumes";
export * from "./job";
export * from "./namespace";
export * from "./provider";
export * from "./quoteSpecification";
export * from "./schedulerConfig";
export * from "./sentinelPolicy";
export * from "./volume";

// Export sub-modules:
import * as config from "./config";
import * as types from "./types";

export {
    config,
    types,
};

// Import resources to register:
import { AclPolicy } from "./aclPolicy";
import { AclToken } from "./aclToken";
import { ExternalVolume } from "./externalVolume";
import { Job } from "./job";
import { Namespace } from "./namespace";
import { QuoteSpecification } from "./quoteSpecification";
import { SchedulerConfig } from "./schedulerConfig";
import { SentinelPolicy } from "./sentinelPolicy";
import { Volume } from "./volume";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "nomad:index/aclPolicy:AclPolicy":
                return new AclPolicy(name, <any>undefined, { urn })
            case "nomad:index/aclToken:AclToken":
                return new AclToken(name, <any>undefined, { urn })
            case "nomad:index/externalVolume:ExternalVolume":
                return new ExternalVolume(name, <any>undefined, { urn })
            case "nomad:index/job:Job":
                return new Job(name, <any>undefined, { urn })
            case "nomad:index/namespace:Namespace":
                return new Namespace(name, <any>undefined, { urn })
            case "nomad:index/quoteSpecification:QuoteSpecification":
                return new QuoteSpecification(name, <any>undefined, { urn })
            case "nomad:index/schedulerConfig:SchedulerConfig":
                return new SchedulerConfig(name, <any>undefined, { urn })
            case "nomad:index/sentinelPolicy:SentinelPolicy":
                return new SentinelPolicy(name, <any>undefined, { urn })
            case "nomad:index/volume:Volume":
                return new Volume(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("nomad", "index/aclPolicy", _module)
pulumi.runtime.registerResourceModule("nomad", "index/aclToken", _module)
pulumi.runtime.registerResourceModule("nomad", "index/externalVolume", _module)
pulumi.runtime.registerResourceModule("nomad", "index/job", _module)
pulumi.runtime.registerResourceModule("nomad", "index/namespace", _module)
pulumi.runtime.registerResourceModule("nomad", "index/quoteSpecification", _module)
pulumi.runtime.registerResourceModule("nomad", "index/schedulerConfig", _module)
pulumi.runtime.registerResourceModule("nomad", "index/sentinelPolicy", _module)
pulumi.runtime.registerResourceModule("nomad", "index/volume", _module)

import { Provider } from "./provider";

pulumi.runtime.registerResourcePackage("nomad", {
    version: utilities.getVersion(),
    constructProvider: (name: string, type: string, urn: string): pulumi.ProviderResource => {
        if (type !== "pulumi:providers:nomad") {
            throw new Error(`unknown provider type ${type}`);
        }
        return new Provider(name, <any>undefined, { urn });
    },
});