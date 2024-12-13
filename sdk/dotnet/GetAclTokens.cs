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
        ///     var tokens = Nomad.GetAclTokens.Invoke(new()
        ///     {
        ///         Prefix = "a242",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetAclTokensResult> InvokeAsync(GetAclTokensArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAclTokensResult>("nomad:index/getAclTokens:getAclTokens", args ?? new GetAclTokensArgs(), options.WithDefaults());

        /// <summary>
        /// Get a list of ACL tokens.
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
        ///     var tokens = Nomad.GetAclTokens.Invoke(new()
        ///     {
        ///         Prefix = "a242",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAclTokensResult> Invoke(GetAclTokensInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAclTokensResult>("nomad:index/getAclTokens:getAclTokens", args ?? new GetAclTokensInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Get a list of ACL tokens.
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
        ///     var tokens = Nomad.GetAclTokens.Invoke(new()
        ///     {
        ///         Prefix = "a242",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAclTokensResult> Invoke(GetAclTokensInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetAclTokensResult>("nomad:index/getAclTokens:getAclTokens", args ?? new GetAclTokensInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAclTokensArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// `(string)` Optional prefix to filter the tokens.
        /// </summary>
        [Input("prefix")]
        public string? Prefix { get; set; }

        public GetAclTokensArgs()
        {
        }
        public static new GetAclTokensArgs Empty => new GetAclTokensArgs();
    }

    public sealed class GetAclTokensInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// `(string)` Optional prefix to filter the tokens.
        /// </summary>
        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

        public GetAclTokensInvokeArgs()
        {
        }
        public static new GetAclTokensInvokeArgs Empty => new GetAclTokensInvokeArgs();
    }


    [OutputType]
    public sealed class GetAclTokensResult
    {
        /// <summary>
        /// `(list of objects)` The list of tokens found in the given prefix.
        /// </summary>
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
