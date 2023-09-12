// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad.Outputs
{

    [OutputType]
    public sealed class GetNodePoolSchedulerConfigResult
    {
        /// <summary>
        /// `(string)` - Whether or not memory
        /// oversubscription is enabled in the node pool. If empty or not defined the
        /// global cluster configuration is used.
        /// </summary>
        public readonly string MemoryOversubscription;
        /// <summary>
        /// `(string)` - The scheduler algorithm used in the node
        /// pool. If empty or not defined the global cluster configuration is used.
        /// </summary>
        public readonly string SchedulerAlgorithm;

        [OutputConstructor]
        private GetNodePoolSchedulerConfigResult(
            string memoryOversubscription,

            string schedulerAlgorithm)
        {
            MemoryOversubscription = memoryOversubscription;
            SchedulerAlgorithm = schedulerAlgorithm;
        }
    }
}
