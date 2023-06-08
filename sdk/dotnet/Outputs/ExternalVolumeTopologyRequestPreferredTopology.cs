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
    public sealed class ExternalVolumeTopologyRequestPreferredTopology
    {
        /// <summary>
        /// `(map[string]string)` - Define the attributes for the topology request.
        /// 
        /// In addition to the above arguments, the following attributes are exported and
        /// can be referenced:
        /// </summary>
        public readonly ImmutableDictionary<string, string> Segments;

        [OutputConstructor]
        private ExternalVolumeTopologyRequestPreferredTopology(ImmutableDictionary<string, string> segments)
        {
            Segments = segments;
        }
    }
}
