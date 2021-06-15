// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad
{
    public static class GetVolumes
    {
        /// <summary>
        /// Retrieve a list of volumes in Nomad.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Nomad = Pulumi.Nomad;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(Nomad.GetVolumes.InvokeAsync());
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetVolumesResult> InvokeAsync(GetVolumesArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetVolumesResult>("nomad:index/getVolumes:getVolumes", args ?? new GetVolumesArgs(), options.WithVersion());
    }


    public sealed class GetVolumesArgs : Pulumi.InvokeArgs
    {
        [Input("namespace")]
        public string? Namespace { get; set; }

        [Input("nodeId")]
        public string? NodeId { get; set; }

        [Input("pluginId")]
        public string? PluginId { get; set; }

        [Input("type")]
        public string? Type { get; set; }

        public GetVolumesArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetVolumesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? Namespace;
        public readonly string? NodeId;
        public readonly string? PluginId;
        public readonly string? Type;
        public readonly ImmutableArray<ImmutableDictionary<string, object>> Volumes;

        [OutputConstructor]
        private GetVolumesResult(
            string id,

            string? @namespace,

            string? nodeId,

            string? pluginId,

            string? type,

            ImmutableArray<ImmutableDictionary<string, object>> volumes)
        {
            Id = id;
            Namespace = @namespace;
            NodeId = nodeId;
            PluginId = pluginId;
            Type = type;
            Volumes = volumes;
        }
    }
}