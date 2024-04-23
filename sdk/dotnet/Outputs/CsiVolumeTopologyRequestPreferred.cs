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
    public sealed class CsiVolumeTopologyRequestPreferred
    {
        /// <summary>
        /// Defines the location for the volume.
        /// </summary>
        public readonly ImmutableArray<Outputs.CsiVolumeTopologyRequestPreferredTopology> Topologies;

        [OutputConstructor]
        private CsiVolumeTopologyRequestPreferred(ImmutableArray<Outputs.CsiVolumeTopologyRequestPreferredTopology> topologies)
        {
            Topologies = topologies;
        }
    }
}
