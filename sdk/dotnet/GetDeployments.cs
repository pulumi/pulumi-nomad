// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad
{
    public static class GetDeployments
    {
        /// <summary>
        /// Retrieve a list of deployments in Nomad.
        /// 
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
        ///     var example = Nomad.GetDeployments.Invoke();
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetDeploymentsResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDeploymentsResult>("nomad:index/getDeployments:getDeployments", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetDeploymentsResult
    {
        /// <summary>
        /// `list of maps` a list of deployments in the cluster.
        /// </summary>
        public readonly ImmutableArray<ImmutableDictionary<string, object>> Deployments;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetDeploymentsResult(
            ImmutableArray<ImmutableDictionary<string, object>> deployments,

            string id)
        {
            Deployments = deployments;
            Id = id;
        }
    }
}
