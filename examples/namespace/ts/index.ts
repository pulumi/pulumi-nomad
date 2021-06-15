import * as nomad from "@pulumi/nomad";

const ns = new nomad.Namespace("test-ns-ts");

export const namespaceName = ns.name;
