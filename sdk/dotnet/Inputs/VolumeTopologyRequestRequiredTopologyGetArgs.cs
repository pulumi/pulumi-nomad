// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad.Inputs
{

    public sealed class VolumeTopologyRequestRequiredTopologyGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("segments", required: true)]
        private InputMap<string>? _segments;

        /// <summary>
        /// Define attributes for the topology request.
        /// </summary>
        public InputMap<string> Segments
        {
            get => _segments ?? (_segments = new InputMap<string>());
            set => _segments = value;
        }

        public VolumeTopologyRequestRequiredTopologyGetArgs()
        {
        }
        public static new VolumeTopologyRequestRequiredTopologyGetArgs Empty => new VolumeTopologyRequestRequiredTopologyGetArgs();
    }
}
