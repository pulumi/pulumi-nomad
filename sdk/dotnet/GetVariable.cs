// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad
{
    public static class GetVariable
    {
        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Nomad = Pulumi.Nomad;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = new Nomad.Variable("example", new()
        ///     {
        ///         Path = "path/of/existing/variable",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetVariableResult> InvokeAsync(GetVariableArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVariableResult>("nomad:index/getVariable:getVariable", args ?? new GetVariableArgs(), options.WithDefaults());

        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Nomad = Pulumi.Nomad;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = new Nomad.Variable("example", new()
        ///     {
        ///         Path = "path/of/existing/variable",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetVariableResult> Invoke(GetVariableInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVariableResult>("nomad:index/getVariable:getVariable", args ?? new GetVariableInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVariableArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// `(string: "default")` - The namepsace in which the variable exists.
        /// </summary>
        [Input("namespace")]
        public string? Namespace { get; set; }

        /// <summary>
        /// `(string)` - Path to the existing variable.
        /// </summary>
        [Input("path", required: true)]
        public string Path { get; set; } = null!;

        public GetVariableArgs()
        {
        }
        public static new GetVariableArgs Empty => new GetVariableArgs();
    }

    public sealed class GetVariableInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// `(string: "default")` - The namepsace in which the variable exists.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// `(string)` - Path to the existing variable.
        /// </summary>
        [Input("path", required: true)]
        public Input<string> Path { get; set; } = null!;

        public GetVariableInvokeArgs()
        {
        }
        public static new GetVariableInvokeArgs Empty => new GetVariableInvokeArgs();
    }


    [OutputType]
    public sealed class GetVariableResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// `(map[string]string)` - Map of items in the variable.
        /// </summary>
        public readonly ImmutableDictionary<string, object> Items;
        /// <summary>
        /// `(string)` - The namespace in which the variable exists.
        /// </summary>
        public readonly string? Namespace;
        /// <summary>
        /// `(string)` - The path at which the variable exists.
        /// </summary>
        public readonly string Path;

        [OutputConstructor]
        private GetVariableResult(
            string id,

            ImmutableDictionary<string, object> items,

            string? @namespace,

            string path)
        {
            Id = id;
            Items = items;
            Namespace = @namespace;
            Path = path;
        }
    }
}
