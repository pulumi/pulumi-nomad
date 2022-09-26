// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad
{
    public static class GetAclToken
    {
        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Nomad = Pulumi.Nomad;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var myToken = Nomad.GetAclToken.Invoke(new()
        ///     {
        ///         AccessorId = "aa534e09-6a07-0a45-2295-a7f77063d429",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetAclTokenResult> InvokeAsync(GetAclTokenArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAclTokenResult>("nomad:index/getAclToken:getAclToken", args ?? new GetAclTokenArgs(), options.WithDefaults());

        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Nomad = Pulumi.Nomad;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var myToken = Nomad.GetAclToken.Invoke(new()
        ///     {
        ///         AccessorId = "aa534e09-6a07-0a45-2295-a7f77063d429",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetAclTokenResult> Invoke(GetAclTokenInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAclTokenResult>("nomad:index/getAclToken:getAclToken", args ?? new GetAclTokenInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAclTokenArgs : global::Pulumi.InvokeArgs
    {
        [Input("accessorId", required: true)]
        public string AccessorId { get; set; } = null!;

        public GetAclTokenArgs()
        {
        }
        public static new GetAclTokenArgs Empty => new GetAclTokenArgs();
    }

    public sealed class GetAclTokenInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("accessorId", required: true)]
        public Input<string> AccessorId { get; set; } = null!;

        public GetAclTokenInvokeArgs()
        {
        }
        public static new GetAclTokenInvokeArgs Empty => new GetAclTokenInvokeArgs();
    }


    [OutputType]
    public sealed class GetAclTokenResult
    {
        public readonly string AccessorId;
        public readonly string CreateTime;
        public readonly bool Global;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        public readonly ImmutableArray<string> Policies;
        public readonly string SecretId;
        public readonly string Type;

        [OutputConstructor]
        private GetAclTokenResult(
            string accessorId,

            string createTime,

            bool global,

            string id,

            string name,

            ImmutableArray<string> policies,

            string secretId,

            string type)
        {
            AccessorId = accessorId;
            CreateTime = createTime;
            Global = global;
            Id = id;
            Name = name;
            Policies = policies;
            SecretId = secretId;
            Type = type;
        }
    }
}
