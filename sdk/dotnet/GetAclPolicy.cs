// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad
{
    public static class GetAclPolicy
    {
        /// <summary>
        /// Retrieve information on an ACL Policy.
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
        ///         var myPolicy = Output.Create(Nomad.GetAclPolicy.InvokeAsync(new Nomad.GetAclPolicyArgs
        ///         {
        ///             Name = "my-policy",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetAclPolicyResult> InvokeAsync(GetAclPolicyArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetAclPolicyResult>("nomad:index/getAclPolicy:getAclPolicy", args ?? new GetAclPolicyArgs(), options.WithVersion());
    }


    public sealed class GetAclPolicyArgs : Pulumi.InvokeArgs
    {
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetAclPolicyArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetAclPolicyResult
    {
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        public readonly string Rules;

        [OutputConstructor]
        private GetAclPolicyResult(
            string description,

            string id,

            string name,

            string rules)
        {
            Description = description;
            Id = id;
            Name = name;
            Rules = rules;
        }
    }
}
