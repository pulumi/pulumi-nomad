// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad
{
    public static class GetAclTokens
    {
        /// <summary>
        /// Get a list of ACL tokens.
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
        ///         var tokens = Output.Create(Nomad.GetAclTokens.InvokeAsync(new Nomad.GetAclTokensArgs
        ///         {
        ///             Prefix = "a242",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetAclTokensResult> InvokeAsync(GetAclTokensArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetAclTokensResult>("nomad:index/getAclTokens:getAclTokens", args ?? new GetAclTokensArgs(), options.WithVersion());
    }


    public sealed class GetAclTokensArgs : Pulumi.InvokeArgs
    {
        [Input("prefix")]
        public string? Prefix { get; set; }

        public GetAclTokensArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetAclTokensResult
    {
        public readonly ImmutableArray<Outputs.GetAclTokensAclTokenResult> AclTokens;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? Prefix;

        [OutputConstructor]
        private GetAclTokensResult(
            ImmutableArray<Outputs.GetAclTokensAclTokenResult> aclTokens,

            string id,

            string? prefix)
        {
            AclTokens = aclTokens;
            Id = id;
            Prefix = prefix;
        }
    }
}
