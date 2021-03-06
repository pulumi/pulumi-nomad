// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad
{
    public static class GetJob
    {
        /// <summary>
        /// Get information on a job ID. The aim of this datasource is to enable
        /// you to act on various settings and states of a particular job.
        /// 
        /// An error is triggered if zero or more than one result is returned by the query.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Get the data about a snapshot:
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Nomad = Pulumi.Nomad;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(Nomad.GetJob.InvokeAsync(new Nomad.GetJobArgs
        ///         {
        ///             JobId = "example",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetJobResult> InvokeAsync(GetJobArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetJobResult>("nomad:index/getJob:getJob", args ?? new GetJobArgs(), options.WithDefaults());

        /// <summary>
        /// Get information on a job ID. The aim of this datasource is to enable
        /// you to act on various settings and states of a particular job.
        /// 
        /// An error is triggered if zero or more than one result is returned by the query.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Get the data about a snapshot:
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Nomad = Pulumi.Nomad;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(Nomad.GetJob.InvokeAsync(new Nomad.GetJobArgs
        ///         {
        ///             JobId = "example",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetJobResult> Invoke(GetJobInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetJobResult>("nomad:index/getJob:getJob", args ?? new GetJobInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetJobArgs : Pulumi.InvokeArgs
    {
        [Input("jobId", required: true)]
        public string JobId { get; set; } = null!;

        [Input("namespace")]
        public string? Namespace { get; set; }

        public GetJobArgs()
        {
        }
    }

    public sealed class GetJobInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("jobId", required: true)]
        public Input<string> JobId { get; set; } = null!;

        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        public GetJobInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetJobResult
    {
        public readonly bool AllAtOnce;
        public readonly ImmutableArray<Outputs.GetJobConstraintResult> Constraints;
        public readonly int CreateIndex;
        public readonly ImmutableArray<string> Datacenters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string JobId;
        public readonly int JobModifyIndex;
        public readonly int ModifyIndex;
        public readonly string Name;
        public readonly string? Namespace;
        public readonly string ParentId;
        public readonly ImmutableArray<Outputs.GetJobPeriodicConfigResult> PeriodicConfigs;
        public readonly int Priority;
        public readonly string Region;
        public readonly bool Stable;
        public readonly string Status;
        public readonly string StatusDescription;
        public readonly bool Stop;
        public readonly int SubmitTime;
        public readonly ImmutableArray<Outputs.GetJobTaskGroupResult> TaskGroups;
        public readonly string Type;
        public readonly int Version;

        [OutputConstructor]
        private GetJobResult(
            bool allAtOnce,

            ImmutableArray<Outputs.GetJobConstraintResult> constraints,

            int createIndex,

            ImmutableArray<string> datacenters,

            string id,

            string jobId,

            int jobModifyIndex,

            int modifyIndex,

            string name,

            string? @namespace,

            string parentId,

            ImmutableArray<Outputs.GetJobPeriodicConfigResult> periodicConfigs,

            int priority,

            string region,

            bool stable,

            string status,

            string statusDescription,

            bool stop,

            int submitTime,

            ImmutableArray<Outputs.GetJobTaskGroupResult> taskGroups,

            string type,

            int version)
        {
            AllAtOnce = allAtOnce;
            Constraints = constraints;
            CreateIndex = createIndex;
            Datacenters = datacenters;
            Id = id;
            JobId = jobId;
            JobModifyIndex = jobModifyIndex;
            ModifyIndex = modifyIndex;
            Name = name;
            Namespace = @namespace;
            ParentId = parentId;
            PeriodicConfigs = periodicConfigs;
            Priority = priority;
            Region = region;
            Stable = stable;
            Status = status;
            StatusDescription = statusDescription;
            Stop = stop;
            SubmitTime = submitTime;
            TaskGroups = taskGroups;
            Type = type;
            Version = version;
        }
    }
}
