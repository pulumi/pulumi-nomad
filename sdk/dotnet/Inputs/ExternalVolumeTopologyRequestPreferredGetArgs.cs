// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad.Inputs
{

    public sealed class ExternalVolumeTopologyRequestPreferredGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("topologies", required: true)]
        private InputList<Inputs.ExternalVolumeTopologyRequestPreferredTopologyGetArgs>? _topologies;

        /// <summary>
        /// Defines the location for the volume.
        /// </summary>
        public InputList<Inputs.ExternalVolumeTopologyRequestPreferredTopologyGetArgs> Topologies
        {
            get => _topologies ?? (_topologies = new InputList<Inputs.ExternalVolumeTopologyRequestPreferredTopologyGetArgs>());
            set => _topologies = value;
        }

        public ExternalVolumeTopologyRequestPreferredGetArgs()
        {
        }
        public static new ExternalVolumeTopologyRequestPreferredGetArgs Empty => new ExternalVolumeTopologyRequestPreferredGetArgs();
    }
}
