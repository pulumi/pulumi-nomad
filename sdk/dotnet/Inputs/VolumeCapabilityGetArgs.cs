// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad.Inputs
{

    public sealed class VolumeCapabilityGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// `(string: &lt;required&gt;)` - Defines whether a volume should be available concurrently. Possible values are:
        /// </summary>
        [Input("accessMode", required: true)]
        public Input<string> AccessMode { get; set; } = null!;

        /// <summary>
        /// `(string)`
        /// </summary>
        [Input("attachmentMode", required: true)]
        public Input<string> AttachmentMode { get; set; } = null!;

        public VolumeCapabilityGetArgs()
        {
        }
        public static new VolumeCapabilityGetArgs Empty => new VolumeCapabilityGetArgs();
    }
}
