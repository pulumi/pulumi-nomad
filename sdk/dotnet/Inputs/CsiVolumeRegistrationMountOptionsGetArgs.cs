// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad.Inputs
{

    public sealed class CsiVolumeRegistrationMountOptionsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// `(string: &lt;optional&gt;)` - The file system type.
        /// </summary>
        [Input("fsType")]
        public Input<string>? FsType { get; set; }

        [Input("mountFlags")]
        private InputList<string>? _mountFlags;

        /// <summary>
        /// `([]string: &lt;optional&gt;)` - The flags passed to `mount`.
        /// </summary>
        public InputList<string> MountFlags
        {
            get => _mountFlags ?? (_mountFlags = new InputList<string>());
            set => _mountFlags = value;
        }

        public CsiVolumeRegistrationMountOptionsGetArgs()
        {
        }
        public static new CsiVolumeRegistrationMountOptionsGetArgs Empty => new CsiVolumeRegistrationMountOptionsGetArgs();
    }
}
