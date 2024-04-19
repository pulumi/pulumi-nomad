// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad
{
    public static class GetDatacenters
    {
        /// <summary>
        /// Retrieve a list of datacenters.
        /// 
        /// ## Example Usage
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Nomad = Pulumi.Nomad;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var datacenters = Nomad.GetDatacenters.Invoke(new()
        ///     {
        ///         Prefix = "prod",
        ///         IgnoreDownNodes = true,
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetDatacentersResult> InvokeAsync(GetDatacentersArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDatacentersResult>("nomad:index/getDatacenters:getDatacenters", args ?? new GetDatacentersArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieve a list of datacenters.
        /// 
        /// ## Example Usage
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Nomad = Pulumi.Nomad;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var datacenters = Nomad.GetDatacenters.Invoke(new()
        ///     {
        ///         Prefix = "prod",
        ///         IgnoreDownNodes = true,
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetDatacentersResult> Invoke(GetDatacentersInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDatacentersResult>("nomad:index/getDatacenters:getDatacenters", args ?? new GetDatacentersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDatacentersArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// `(bool: false)`: An optional flag that, if set to `true` will ignore down nodes when compiling the list of datacenters.
        /// </summary>
        [Input("ignoreDownNodes")]
        public bool? IgnoreDownNodes { get; set; }

        /// <summary>
        /// `(string)`: An optional string to filter datacenters based on name prefix. If not provided, all datacenters are returned.
        /// </summary>
        [Input("prefix")]
        public string? Prefix { get; set; }

        public GetDatacentersArgs()
        {
        }
        public static new GetDatacentersArgs Empty => new GetDatacentersArgs();
    }

    public sealed class GetDatacentersInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// `(bool: false)`: An optional flag that, if set to `true` will ignore down nodes when compiling the list of datacenters.
        /// </summary>
        [Input("ignoreDownNodes")]
        public Input<bool>? IgnoreDownNodes { get; set; }

        /// <summary>
        /// `(string)`: An optional string to filter datacenters based on name prefix. If not provided, all datacenters are returned.
        /// </summary>
        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

        public GetDatacentersInvokeArgs()
        {
        }
        public static new GetDatacentersInvokeArgs Empty => new GetDatacentersInvokeArgs();
    }


    [OutputType]
    public sealed class GetDatacentersResult
    {
        /// <summary>
        /// `list(string)` a list of datacenters.
        /// </summary>
        public readonly ImmutableArray<string> Datacenters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly bool? IgnoreDownNodes;
        public readonly string? Prefix;

        [OutputConstructor]
        private GetDatacentersResult(
            ImmutableArray<string> datacenters,

            string id,

            bool? ignoreDownNodes,

            string? prefix)
        {
            Datacenters = datacenters;
            Id = id;
            IgnoreDownNodes = ignoreDownNodes;
            Prefix = prefix;
        }
    }
}
