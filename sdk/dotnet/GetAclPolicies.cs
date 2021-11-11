// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi.Utilities;

namespace Pulumi.Nomad
{
    public static class GetAclPolicies
    {
        /// <summary>
        /// Retrieve a list of ACL Policies.
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
        ///         var example = Output.Create(Nomad.GetAclPolicies.InvokeAsync(new Nomad.GetAclPoliciesArgs
        ///         {
        ///             Prefix = "prod",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetAclPoliciesResult> InvokeAsync(GetAclPoliciesArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetAclPoliciesResult>("nomad:index/getAclPolicies:getAclPolicies", args ?? new GetAclPoliciesArgs(), options.WithVersion());

        /// <summary>
        /// Retrieve a list of ACL Policies.
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
        ///         var example = Output.Create(Nomad.GetAclPolicies.InvokeAsync(new Nomad.GetAclPoliciesArgs
        ///         {
        ///             Prefix = "prod",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetAclPoliciesResult> Invoke(GetAclPoliciesInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetAclPoliciesResult>("nomad:index/getAclPolicies:getAclPolicies", args ?? new GetAclPoliciesInvokeArgs(), options.WithVersion());
    }


    public sealed class GetAclPoliciesArgs : Pulumi.InvokeArgs
    {
        [Input("prefix")]
        public string? Prefix { get; set; }

        public GetAclPoliciesArgs()
        {
        }
    }

    public sealed class GetAclPoliciesInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

        public GetAclPoliciesInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetAclPoliciesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetAclPoliciesPolicyResult> Policies;
        public readonly string? Prefix;

        [OutputConstructor]
        private GetAclPoliciesResult(
            string id,

            ImmutableArray<Outputs.GetAclPoliciesPolicyResult> policies,

            string? prefix)
        {
            Id = id;
            Policies = policies;
            Prefix = prefix;
        }
    }
}
