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
    public sealed class CsiVolumeTopologyRequestRequired
    {
        /// <summary>
        /// Defines the location for the volume.
        /// </summary>
        public readonly ImmutableArray<Outputs.CsiVolumeTopologyRequestRequiredTopology> Topologies;

        [OutputConstructor]
        private CsiVolumeTopologyRequestRequired(ImmutableArray<Outputs.CsiVolumeTopologyRequestRequiredTopology> topologies)
        {
            Topologies = topologies;
        }
    }
}
