// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad
{
    public static class GetRegions
    {
        /// <summary>
        /// Retrieve a list of regions available in Nomad.
        /// </summary>
        public static Task<GetRegionsResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRegionsResult>("nomad:index/getRegions:getRegions", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetRegionsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// `(list of strings)` - a list of regions available in the cluster.
        /// </summary>
        public readonly ImmutableArray<string> Regions;

        [OutputConstructor]
        private GetRegionsResult(
            string id,

            ImmutableArray<string> regions)
        {
            Id = id;
            Regions = regions;
        }
    }
}
