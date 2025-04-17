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
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Nomad = Pulumi.Nomad;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Nomad.GetVolumes.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetVolumesResult> InvokeAsync(GetVolumesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVolumesResult>("nomad:index/getVolumes:getVolumes", args ?? new GetVolumesArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieve a list of volumes in Nomad.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Nomad = Pulumi.Nomad;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Nomad.GetVolumes.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetVolumesResult> Invoke(GetVolumesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVolumesResult>("nomad:index/getVolumes:getVolumes", args ?? new GetVolumesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieve a list of volumes in Nomad.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Nomad = Pulumi.Nomad;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Nomad.GetVolumes.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetVolumesResult> Invoke(GetVolumesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetVolumesResult>("nomad:index/getVolumes:getVolumes", args ?? new GetVolumesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVolumesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// `(string: "default")` Nomad namespace.
        /// </summary>
        [Input("namespace")]
        public string? Namespace { get; set; }

        /// <summary>
        /// `(string: optional)` Volume node filter.
        /// </summary>
        [Input("nodeId")]
        public string? NodeId { get; set; }

        /// <summary>
        /// `(string: optional)` Plugin ID filter.
        /// </summary>
        [Input("pluginId")]
        public string? PluginId { get; set; }

        /// <summary>
        /// `(string: "csi")` Volume type (one of `csi` or `host`)
        /// </summary>
        [Input("type")]
        public string? Type { get; set; }

        public GetVolumesArgs()
        {
        }
        public static new GetVolumesArgs Empty => new GetVolumesArgs();
    }

    public sealed class GetVolumesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// `(string: "default")` Nomad namespace.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// `(string: optional)` Volume node filter.
        /// </summary>
        [Input("nodeId")]
        public Input<string>? NodeId { get; set; }

        /// <summary>
        /// `(string: optional)` Plugin ID filter.
        /// </summary>
        [Input("pluginId")]
        public Input<string>? PluginId { get; set; }

        /// <summary>
        /// `(string: "csi")` Volume type (one of `csi` or `host`)
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public GetVolumesInvokeArgs()
        {
        }
        public static new GetVolumesInvokeArgs Empty => new GetVolumesInvokeArgs();
    }


    [OutputType]
    public sealed class GetVolumesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// `string` Volume namespace.
        /// </summary>
        public readonly string? Namespace;
        public readonly string? NodeId;
        public readonly string? PluginId;
        public readonly string? Type;
        /// <summary>
        /// `list of maps` a list of volumes in the cluster.
        /// </summary>
        public readonly ImmutableArray<ImmutableDictionary<string, string>> Volumes;

        [OutputConstructor]
        private GetVolumesResult(
            string id,

            string? @namespace,

            string? nodeId,

            string? pluginId,

            string? type,

            ImmutableArray<ImmutableDictionary<string, string>> volumes)
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
