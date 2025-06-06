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
    public sealed class JobTaskGroupTaskVolumeMount
    {
        public readonly string? Destination;
        public readonly bool? ReadOnly;
        public readonly string? Volume;

        [OutputConstructor]
        private JobTaskGroupTaskVolumeMount(
            string? destination,

            bool? readOnly,

            string? volume)
        {
            Destination = destination;
            ReadOnly = readOnly;
            Volume = volume;
        }
    }
}
