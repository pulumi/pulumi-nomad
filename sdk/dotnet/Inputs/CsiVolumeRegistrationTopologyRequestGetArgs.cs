// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad.Inputs
{

    public sealed class CsiVolumeRegistrationTopologyRequestGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// `(``Topology``: &lt;optional&gt;)` - Required topologies indicate that the volume must be created in a location accessible from all the listed topologies.
        /// </summary>
        [Input("required")]
        public Input<Inputs.CsiVolumeRegistrationTopologyRequestRequiredGetArgs>? Required { get; set; }

        public CsiVolumeRegistrationTopologyRequestGetArgs()
        {
        }
        public static new CsiVolumeRegistrationTopologyRequestGetArgs Empty => new CsiVolumeRegistrationTopologyRequestGetArgs();
    }
}
