// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad
{
    public static class GetSchedulerPolicy
    {
        /// <summary>
        /// Retrieve the cluster's [scheduler configuration](https://www.nomadproject.io/api-docs/operator#sample-response-3).
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Nomad = Pulumi.Nomad;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @global = Nomad.GetSchedulerPolicy.Invoke();
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetSchedulerPolicyResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSchedulerPolicyResult>("nomad:index/getSchedulerPolicy:getSchedulerPolicy", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetSchedulerPolicyResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// `(bool: false)` - When `true`, tasks may exceed their reserved memory limit.
        /// </summary>
        public readonly bool MemoryOversubscriptionEnabled;
        /// <summary>
        /// `(map[string]bool)` - Options to enable preemption for various schedulers.
        /// </summary>
        public readonly ImmutableDictionary<string, bool> PreemptionConfig;
        /// <summary>
        /// `(string)` - Specifies whether scheduler binpacks or spreads allocations on available nodes.
        /// </summary>
        public readonly string SchedulerAlgorithm;

        [OutputConstructor]
        private GetSchedulerPolicyResult(
            string id,

            bool memoryOversubscriptionEnabled,

            ImmutableDictionary<string, bool> preemptionConfig,

            string schedulerAlgorithm)
        {
            Id = id;
            MemoryOversubscriptionEnabled = memoryOversubscriptionEnabled;
            PreemptionConfig = preemptionConfig;
            SchedulerAlgorithm = schedulerAlgorithm;
        }
    }
}
