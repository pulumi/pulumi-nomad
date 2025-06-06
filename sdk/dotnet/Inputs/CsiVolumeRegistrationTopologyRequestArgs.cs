// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad.Inputs
{

    public sealed class CsiVolumeRegistrationTopologyRequestArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// `(``Topology``: &lt;optional&gt;)` - Required topologies indicate that the volume must be created in a location accessible from all the listed topologies.
        /// </summary>
        [Input("required")]
        public Input<Inputs.CsiVolumeRegistrationTopologyRequestRequiredArgs>? Required { get; set; }

        public CsiVolumeRegistrationTopologyRequestArgs()
        {
        }
        public static new CsiVolumeRegistrationTopologyRequestArgs Empty => new CsiVolumeRegistrationTopologyRequestArgs();
    }
}
