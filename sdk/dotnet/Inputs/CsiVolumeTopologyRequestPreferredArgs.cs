// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad.Inputs
{

    public sealed class CsiVolumeTopologyRequestPreferredArgs : global::Pulumi.ResourceArgs
    {
        [Input("topologies", required: true)]
        private InputList<Inputs.CsiVolumeTopologyRequestPreferredTopologyArgs>? _topologies;

        /// <summary>
        /// Defines the location for the volume.
        /// </summary>
        public InputList<Inputs.CsiVolumeTopologyRequestPreferredTopologyArgs> Topologies
        {
            get => _topologies ?? (_topologies = new InputList<Inputs.CsiVolumeTopologyRequestPreferredTopologyArgs>());
            set => _topologies = value;
        }

        public CsiVolumeTopologyRequestPreferredArgs()
        {
        }
        public static new CsiVolumeTopologyRequestPreferredArgs Empty => new CsiVolumeTopologyRequestPreferredArgs();
    }
}
