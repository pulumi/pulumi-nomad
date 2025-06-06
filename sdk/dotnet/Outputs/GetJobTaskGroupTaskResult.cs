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
    public sealed class GetJobTaskGroupTaskResult
    {
        public readonly string Driver;
        public readonly ImmutableDictionary<string, string> Meta;
        /// <summary>
        /// `(string)` Name of the job.
        /// </summary>
        public readonly string Name;
        public readonly ImmutableArray<Outputs.GetJobTaskGroupTaskVolumeMountResult> VolumeMounts;

        [OutputConstructor]
        private GetJobTaskGroupTaskResult(
            string driver,

            ImmutableDictionary<string, string> meta,

            string name,

            ImmutableArray<Outputs.GetJobTaskGroupTaskVolumeMountResult> volumeMounts)
        {
            Driver = driver;
            Meta = meta;
            Name = name;
            VolumeMounts = volumeMounts;
        }
    }
}
