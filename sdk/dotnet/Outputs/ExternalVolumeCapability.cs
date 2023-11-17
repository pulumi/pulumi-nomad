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
    public sealed class ExternalVolumeCapability
    {
        /// <summary>
        /// `(string: &lt;required&gt;)` - Defines whether a volume should be available concurrently. Possible values are:
        /// </summary>
        public readonly string AccessMode;
        /// <summary>
        /// `(string)`
        /// </summary>
        public readonly string AttachmentMode;

        [OutputConstructor]
        private ExternalVolumeCapability(
            string accessMode,

            string attachmentMode)
        {
            AccessMode = accessMode;
            AttachmentMode = attachmentMode;
        }
    }
}
