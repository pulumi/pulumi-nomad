// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad
{
    public static class GetNamespaces
    {
        /// <summary>
        /// Retrieve a list of namespaces available in Nomad.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using System.Threading.Tasks;
        /// using Pulumi;
        /// using Nomad = Pulumi.Nomad;
        /// 
        /// return await Deployment.RunAsync(async() =&gt; 
        /// {
        ///     var namespaces = await Nomad.GetNamespaces.InvokeAsync();
        /// 
        ///     var @namespace = new List&lt;Nomad.AclPolicy&gt;();
        ///     for (var rangeIndex = 0; rangeIndex &lt; namespaces.Namespaces.Length; rangeIndex++)
        ///     {
        ///         var range = new { Value = rangeIndex };
        ///         @namespace.Add(new Nomad.AclPolicy($"namespace-{range.Value}", new()
        ///         {
        ///             Description = $"Write to the namespace {namespaces[range.Value]}",
        ///             RulesHcl = @$"namespace ""{namespaces[range.Value]}"" {{
        ///   policy = ""write""
        /// }}
        /// ",
        ///         }));
        ///     }
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetNamespacesResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNamespacesResult>("nomad:index/getNamespaces:getNamespaces", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// Retrieve a list of namespaces available in Nomad.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using System.Threading.Tasks;
        /// using Pulumi;
        /// using Nomad = Pulumi.Nomad;
        /// 
        /// return await Deployment.RunAsync(async() =&gt; 
        /// {
        ///     var namespaces = await Nomad.GetNamespaces.InvokeAsync();
        /// 
        ///     var @namespace = new List&lt;Nomad.AclPolicy&gt;();
        ///     for (var rangeIndex = 0; rangeIndex &lt; namespaces.Namespaces.Length; rangeIndex++)
        ///     {
        ///         var range = new { Value = rangeIndex };
        ///         @namespace.Add(new Nomad.AclPolicy($"namespace-{range.Value}", new()
        ///         {
        ///             Description = $"Write to the namespace {namespaces[range.Value]}",
        ///             RulesHcl = @$"namespace ""{namespaces[range.Value]}"" {{
        ///   policy = ""write""
        /// }}
        /// ",
        ///         }));
        ///     }
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetNamespacesResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNamespacesResult>("nomad:index/getNamespaces:getNamespaces", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetNamespacesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// `(list of strings)` - a list of namespaces available in the cluster.
        /// </summary>
        public readonly ImmutableArray<string> Namespaces;

        [OutputConstructor]
        private GetNamespacesResult(
            string id,

            ImmutableArray<string> namespaces)
        {
            Id = id;
            Namespaces = namespaces;
        }
    }
}
