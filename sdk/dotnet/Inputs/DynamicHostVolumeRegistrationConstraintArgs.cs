// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad.Inputs
{

    public sealed class DynamicHostVolumeRegistrationConstraintArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An attribute to check to constrain volume placement
        /// </summary>
        [Input("attribute", required: true)]
        public Input<string> Attribute { get; set; } = null!;

        /// <summary>
        /// The operator to use for comparison
        /// </summary>
        [Input("operator")]
        public Input<string>? Operator { get; set; }

        /// <summary>
        /// The requested value of the attribute
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public DynamicHostVolumeRegistrationConstraintArgs()
        {
        }
        public static new DynamicHostVolumeRegistrationConstraintArgs Empty => new DynamicHostVolumeRegistrationConstraintArgs();
    }
}
