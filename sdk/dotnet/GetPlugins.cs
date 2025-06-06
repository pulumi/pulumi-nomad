// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad
{
    public static class GetPlugins
    {
        /// <summary>
        /// Retrieve a list of dynamic plugins in Nomad.
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
        ///     var example = Nomad.GetPlugins.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetPluginsResult> InvokeAsync(GetPluginsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPluginsResult>("nomad:index/getPlugins:getPlugins", args ?? new GetPluginsArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieve a list of dynamic plugins in Nomad.
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
        ///     var example = Nomad.GetPlugins.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetPluginsResult> Invoke(GetPluginsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPluginsResult>("nomad:index/getPlugins:getPlugins", args ?? new GetPluginsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieve a list of dynamic plugins in Nomad.
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
        ///     var example = Nomad.GetPlugins.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetPluginsResult> Invoke(GetPluginsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetPluginsResult>("nomad:index/getPlugins:getPlugins", args ?? new GetPluginsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPluginsArgs : global::Pulumi.InvokeArgs
    {
        [Input("type")]
        public string? Type { get; set; }

        public GetPluginsArgs()
        {
        }
        public static new GetPluginsArgs Empty => new GetPluginsArgs();
    }

    public sealed class GetPluginsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("type")]
        public Input<string>? Type { get; set; }

        public GetPluginsInvokeArgs()
        {
        }
        public static new GetPluginsInvokeArgs Empty => new GetPluginsInvokeArgs();
    }


    [OutputType]
    public sealed class GetPluginsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// `(list of maps)` a list of dynamic plugins registered in the cluster.
        /// </summary>
        public readonly ImmutableArray<ImmutableDictionary<string, string>> Plugins;
        public readonly string? Type;

        [OutputConstructor]
        private GetPluginsResult(
            string id,

            ImmutableArray<ImmutableDictionary<string, string>> plugins,

            string? type)
        {
            Id = id;
            Plugins = plugins;
            Type = type;
        }
    }
}
