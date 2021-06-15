// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad
{
    [NomadResourceType("nomad:index/job:Job")]
    public partial class Job : Pulumi.CustomResource
    {
        /// <summary>
        /// The IDs for allocations associated with this job.
        /// </summary>
        [Output("allocationIds")]
        public Output<ImmutableArray<string>> AllocationIds { get; private set; } = null!;

        /// <summary>
        /// The target datacenters for the job, as derived from the jobspec.
        /// </summary>
        [Output("datacenters")]
        public Output<ImmutableArray<string>> Datacenters { get; private set; } = null!;

        /// <summary>
        /// If detach = false, the ID for the deployment associated with the last job create/update, if one exists.
        /// </summary>
        [Output("deploymentId")]
        public Output<string> DeploymentId { get; private set; } = null!;

        /// <summary>
        /// If detach = false, the status for the deployment associated with the last job create/update, if one exists.
        /// </summary>
        [Output("deploymentStatus")]
        public Output<string> DeploymentStatus { get; private set; } = null!;

        /// <summary>
        /// If true, the job will be deregistered on destroy.
        /// </summary>
        [Output("deregisterOnDestroy")]
        public Output<bool?> DeregisterOnDestroy { get; private set; } = null!;

        /// <summary>
        /// `(boolean: true)` - Determines if the job will be
        /// deregistered if the ID of the job in the jobspec changes.
        /// </summary>
        [Output("deregisterOnIdChange")]
        public Output<bool?> DeregisterOnIdChange { get; private set; } = null!;

        /// <summary>
        /// `(boolean: true)` - If true, the provider will return immediately
        /// after creating or updating, instead of monitoring.
        /// </summary>
        [Output("detach")]
        public Output<bool?> Detach { get; private set; } = null!;

        /// <summary>
        /// `(block: optional)` - Options for the HCL2 jobspec parser.
        /// </summary>
        [Output("hcl2")]
        public Output<Outputs.JobHcl2?> Hcl2 { get; private set; } = null!;

        /// <summary>
        /// `(string: &lt;required&gt;)` - The contents of the jobspec to register.
        /// </summary>
        [Output("jobspec")]
        public Output<string> Jobspec { get; private set; } = null!;

        /// <summary>
        /// `(boolean: false)` - Set this to `true` if your jobspec is structured with
        /// JSON instead of the default HCL.
        /// </summary>
        [Output("json")]
        public Output<bool?> Json { get; private set; } = null!;

        /// <summary>
        /// Integer that increments for each change. Used to detect any changes between plan and apply.
        /// </summary>
        [Output("modifyIndex")]
        public Output<string> ModifyIndex { get; private set; } = null!;

        /// <summary>
        /// The name of the job, as derived from the jobspec.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The namespace of the job, as derived from the jobspec.
        /// </summary>
        [Output("namespace")]
        public Output<string> Namespace { get; private set; } = null!;

        /// <summary>
        /// `(boolean: false)` - Determines if the job will override any
        /// soft-mandatory Sentinel policies and register even if they fail.
        /// </summary>
        [Output("policyOverride")]
        public Output<bool?> PolicyOverride { get; private set; } = null!;

        /// <summary>
        /// `(boolean: false)` - Set this to true if you want the job to
        /// be purged when the resource is destroyed.
        /// </summary>
        [Output("purgeOnDestroy")]
        public Output<bool?> PurgeOnDestroy { get; private set; } = null!;

        /// <summary>
        /// The target region for the job, as derived from the jobspec.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        [Output("taskGroups")]
        public Output<ImmutableArray<Outputs.JobTaskGroup>> TaskGroups { get; private set; } = null!;

        /// <summary>
        /// The type of the job, as derived from the jobspec.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a Job resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Job(string name, JobArgs args, CustomResourceOptions? options = null)
            : base("nomad:index/job:Job", name, args ?? new JobArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Job(string name, Input<string> id, JobState? state = null, CustomResourceOptions? options = null)
            : base("nomad:index/job:Job", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Job resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Job Get(string name, Input<string> id, JobState? state = null, CustomResourceOptions? options = null)
        {
            return new Job(name, id, state, options);
        }
    }

    public sealed class JobArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// If true, the job will be deregistered on destroy.
        /// </summary>
        [Input("deregisterOnDestroy")]
        public Input<bool>? DeregisterOnDestroy { get; set; }

        /// <summary>
        /// `(boolean: true)` - Determines if the job will be
        /// deregistered if the ID of the job in the jobspec changes.
        /// </summary>
        [Input("deregisterOnIdChange")]
        public Input<bool>? DeregisterOnIdChange { get; set; }

        /// <summary>
        /// `(boolean: true)` - If true, the provider will return immediately
        /// after creating or updating, instead of monitoring.
        /// </summary>
        [Input("detach")]
        public Input<bool>? Detach { get; set; }

        /// <summary>
        /// `(block: optional)` - Options for the HCL2 jobspec parser.
        /// </summary>
        [Input("hcl2")]
        public Input<Inputs.JobHcl2Args>? Hcl2 { get; set; }

        /// <summary>
        /// `(string: &lt;required&gt;)` - The contents of the jobspec to register.
        /// </summary>
        [Input("jobspec", required: true)]
        public Input<string> Jobspec { get; set; } = null!;

        /// <summary>
        /// `(boolean: false)` - Set this to `true` if your jobspec is structured with
        /// JSON instead of the default HCL.
        /// </summary>
        [Input("json")]
        public Input<bool>? Json { get; set; }

        /// <summary>
        /// `(boolean: false)` - Determines if the job will override any
        /// soft-mandatory Sentinel policies and register even if they fail.
        /// </summary>
        [Input("policyOverride")]
        public Input<bool>? PolicyOverride { get; set; }

        /// <summary>
        /// `(boolean: false)` - Set this to true if you want the job to
        /// be purged when the resource is destroyed.
        /// </summary>
        [Input("purgeOnDestroy")]
        public Input<bool>? PurgeOnDestroy { get; set; }

        public JobArgs()
        {
        }
    }

    public sealed class JobState : Pulumi.ResourceArgs
    {
        [Input("allocationIds")]
        private InputList<string>? _allocationIds;

        /// <summary>
        /// The IDs for allocations associated with this job.
        /// </summary>
        public InputList<string> AllocationIds
        {
            get => _allocationIds ?? (_allocationIds = new InputList<string>());
            set => _allocationIds = value;
        }

        [Input("datacenters")]
        private InputList<string>? _datacenters;

        /// <summary>
        /// The target datacenters for the job, as derived from the jobspec.
        /// </summary>
        public InputList<string> Datacenters
        {
            get => _datacenters ?? (_datacenters = new InputList<string>());
            set => _datacenters = value;
        }

        /// <summary>
        /// If detach = false, the ID for the deployment associated with the last job create/update, if one exists.
        /// </summary>
        [Input("deploymentId")]
        public Input<string>? DeploymentId { get; set; }

        /// <summary>
        /// If detach = false, the status for the deployment associated with the last job create/update, if one exists.
        /// </summary>
        [Input("deploymentStatus")]
        public Input<string>? DeploymentStatus { get; set; }

        /// <summary>
        /// If true, the job will be deregistered on destroy.
        /// </summary>
        [Input("deregisterOnDestroy")]
        public Input<bool>? DeregisterOnDestroy { get; set; }

        /// <summary>
        /// `(boolean: true)` - Determines if the job will be
        /// deregistered if the ID of the job in the jobspec changes.
        /// </summary>
        [Input("deregisterOnIdChange")]
        public Input<bool>? DeregisterOnIdChange { get; set; }

        /// <summary>
        /// `(boolean: true)` - If true, the provider will return immediately
        /// after creating or updating, instead of monitoring.
        /// </summary>
        [Input("detach")]
        public Input<bool>? Detach { get; set; }

        /// <summary>
        /// `(block: optional)` - Options for the HCL2 jobspec parser.
        /// </summary>
        [Input("hcl2")]
        public Input<Inputs.JobHcl2GetArgs>? Hcl2 { get; set; }

        /// <summary>
        /// `(string: &lt;required&gt;)` - The contents of the jobspec to register.
        /// </summary>
        [Input("jobspec")]
        public Input<string>? Jobspec { get; set; }

        /// <summary>
        /// `(boolean: false)` - Set this to `true` if your jobspec is structured with
        /// JSON instead of the default HCL.
        /// </summary>
        [Input("json")]
        public Input<bool>? Json { get; set; }

        /// <summary>
        /// Integer that increments for each change. Used to detect any changes between plan and apply.
        /// </summary>
        [Input("modifyIndex")]
        public Input<string>? ModifyIndex { get; set; }

        /// <summary>
        /// The name of the job, as derived from the jobspec.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The namespace of the job, as derived from the jobspec.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// `(boolean: false)` - Determines if the job will override any
        /// soft-mandatory Sentinel policies and register even if they fail.
        /// </summary>
        [Input("policyOverride")]
        public Input<bool>? PolicyOverride { get; set; }

        /// <summary>
        /// `(boolean: false)` - Set this to true if you want the job to
        /// be purged when the resource is destroyed.
        /// </summary>
        [Input("purgeOnDestroy")]
        public Input<bool>? PurgeOnDestroy { get; set; }

        /// <summary>
        /// The target region for the job, as derived from the jobspec.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("taskGroups")]
        private InputList<Inputs.JobTaskGroupGetArgs>? _taskGroups;
        public InputList<Inputs.JobTaskGroupGetArgs> TaskGroups
        {
            get => _taskGroups ?? (_taskGroups = new InputList<Inputs.JobTaskGroupGetArgs>());
            set => _taskGroups = value;
        }

        /// <summary>
        /// The type of the job, as derived from the jobspec.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public JobState()
        {
        }
    }
}