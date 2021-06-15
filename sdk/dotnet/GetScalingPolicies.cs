// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad
{
    public static class GetScalingPolicies
    {
        /// <summary>
        /// Retrieve a list of Scaling Policies.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Nomad = Pulumi.Nomad;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(Nomad.GetScalingPolicies.InvokeAsync(new Nomad.GetScalingPoliciesArgs
        ///         {
        ///             JobId = "webapp",
        ///             Type = "horizontal",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetScalingPoliciesResult> InvokeAsync(GetScalingPoliciesArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetScalingPoliciesResult>("nomad:index/getScalingPolicies:getScalingPolicies", args ?? new GetScalingPoliciesArgs(), options.WithVersion());
    }


    public sealed class GetScalingPoliciesArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// `(string)` - An optional string to filter scaling policies based on the target job. If not provided, policies for all jobs are returned.
        /// </summary>
        [Input("jobId")]
        public string? JobId { get; set; }

        /// <summary>
        /// `(string)` - An optional string to filter scaling policies based on policy type. If not provided, policies of all types are returned.
        /// </summary>
        [Input("type")]
        public string? Type { get; set; }

        public GetScalingPoliciesArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetScalingPoliciesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? JobId;
        public readonly ImmutableArray<Outputs.GetScalingPoliciesPolicyResult> Policies;
        public readonly string? Type;

        [OutputConstructor]
        private GetScalingPoliciesResult(
            string id,

            string? jobId,

            ImmutableArray<Outputs.GetScalingPoliciesPolicyResult> policies,

            string? type)
        {
            Id = id;
            JobId = jobId;
            Policies = policies;
            Type = type;
        }
    }
}