// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad.Inputs
{

    public sealed class VolumeTopologyRequestGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("required")]
        public Input<Inputs.VolumeTopologyRequestRequiredGetArgs>? Required { get; set; }

        public VolumeTopologyRequestGetArgs()
        {
        }
        public static new VolumeTopologyRequestGetArgs Empty => new VolumeTopologyRequestGetArgs();
    }
}
