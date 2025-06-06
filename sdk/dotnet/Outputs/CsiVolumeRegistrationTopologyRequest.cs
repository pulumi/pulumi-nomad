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
    public sealed class CsiVolumeRegistrationTopologyRequest
    {
        /// <summary>
        /// `(``Topology``: &lt;optional&gt;)` - Required topologies indicate that the volume must be created in a location accessible from all the listed topologies.
        /// </summary>
        public readonly Outputs.CsiVolumeRegistrationTopologyRequestRequired? Required;

        [OutputConstructor]
        private CsiVolumeRegistrationTopologyRequest(Outputs.CsiVolumeRegistrationTopologyRequestRequired? required)
        {
            Required = required;
        }
    }
}
