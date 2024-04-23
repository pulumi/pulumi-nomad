// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad
{
    public static class GetAclPolicies
    {
        /// <summary>
        /// Retrieve a list of ACL Policies.
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
        ///     var example = Nomad.GetAclPolicies.Invoke(new()
        ///     {
        ///         Prefix = "prod",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetAclPoliciesResult> InvokeAsync(GetAclPoliciesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAclPoliciesResult>("nomad:index/getAclPolicies:getAclPolicies", args ?? new GetAclPoliciesArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieve a list of ACL Policies.
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
        ///     var example = Nomad.GetAclPolicies.Invoke(new()
        ///     {
        ///         Prefix = "prod",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAclPoliciesResult> Invoke(GetAclPoliciesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAclPoliciesResult>("nomad:index/getAclPolicies:getAclPolicies", args ?? new GetAclPoliciesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAclPoliciesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// `(string)` An optional string to filter ACL policies based on name prefix. If not provided, all policies are returned.
        /// </summary>
        [Input("prefix")]
        public string? Prefix { get; set; }

        public GetAclPoliciesArgs()
        {
        }
        public static new GetAclPoliciesArgs Empty => new GetAclPoliciesArgs();
    }

    public sealed class GetAclPoliciesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// `(string)` An optional string to filter ACL policies based on name prefix. If not provided, all policies are returned.
        /// </summary>
        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

        public GetAclPoliciesInvokeArgs()
        {
        }
        public static new GetAclPoliciesInvokeArgs Empty => new GetAclPoliciesInvokeArgs();
    }


    [OutputType]
    public sealed class GetAclPoliciesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// `list of maps` a list of ACL policies.
        /// </summary>
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
