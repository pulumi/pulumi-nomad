// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad.Inputs
{

    public sealed class JobTaskGroupTaskVolumeMountGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("destination")]
        public Input<string>? Destination { get; set; }

        [Input("readOnly")]
        public Input<bool>? ReadOnly { get; set; }

        [Input("volume")]
        public Input<string>? Volume { get; set; }

        public JobTaskGroupTaskVolumeMountGetArgs()
        {
        }
        public static new JobTaskGroupTaskVolumeMountGetArgs Empty => new JobTaskGroupTaskVolumeMountGetArgs();
    }
}
