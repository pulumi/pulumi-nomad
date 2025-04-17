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
    public sealed class GetDynamicHostVolumeCapabilityResult
    {
        /// <summary>
        /// `(string)` - How the volume can be mounted by
        /// allocations. Refer to the [`access_mode`][] documentation for details.
        /// </summary>
        public readonly string AccessMode;
        /// <summary>
        /// `(string)` - The storage API that will be used by the
        /// volume. Refer to the [`attachment_mode`][] documentation.
        /// </summary>
        public readonly string AttachmentMode;

        [OutputConstructor]
        private GetDynamicHostVolumeCapabilityResult(
            string accessMode,

            string attachmentMode)
        {
            AccessMode = accessMode;
            AttachmentMode = attachmentMode;
        }
    }
}
