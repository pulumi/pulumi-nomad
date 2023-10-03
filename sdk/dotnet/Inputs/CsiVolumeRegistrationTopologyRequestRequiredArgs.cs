// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad.Inputs
{

    public sealed class CsiVolumeRegistrationTopologyRequestRequiredArgs : global::Pulumi.ResourceArgs
    {
        [Input("topologies", required: true)]
        private InputList<Inputs.CsiVolumeRegistrationTopologyRequestRequiredTopologyArgs>? _topologies;

        /// <summary>
        /// `(List of segments: &lt;required&gt;)` - Defines the location for the volume.
        /// </summary>
        public InputList<Inputs.CsiVolumeRegistrationTopologyRequestRequiredTopologyArgs> Topologies
        {
            get => _topologies ?? (_topologies = new InputList<Inputs.CsiVolumeRegistrationTopologyRequestRequiredTopologyArgs>());
            set => _topologies = value;
        }

        public CsiVolumeRegistrationTopologyRequestRequiredArgs()
        {
        }
        public static new CsiVolumeRegistrationTopologyRequestRequiredArgs Empty => new CsiVolumeRegistrationTopologyRequestRequiredArgs();
    }
}
