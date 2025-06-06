// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad.Outputs
{

    [OutputType]
    public sealed class GetNodePoolsNodePoolResult
    {
        /// <summary>
        /// `(string)` - The description of the node pool.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// `(map[string]string)` - Arbitrary KV metadata associated with the
        /// node pool.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Meta;
        /// <summary>
        /// `(string)` - The name of the node pool.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// `(block)` - Scheduler configuration for the node pool.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNodePoolsNodePoolSchedulerConfigResult> SchedulerConfigs;

        [OutputConstructor]
        private GetNodePoolsNodePoolResult(
            string description,

            ImmutableDictionary<string, string> meta,

            string name,

            ImmutableArray<Outputs.GetNodePoolsNodePoolSchedulerConfigResult> schedulerConfigs)
        {
            Description = description;
            Meta = meta;
            Name = name;
            SchedulerConfigs = schedulerConfigs;
        }
    }
}
