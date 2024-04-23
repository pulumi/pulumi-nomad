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
        ///     var myPolicy = Nomad.GetAclPolicy.Invoke(new()
        ///     {
        ///         Name = "my-policy",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetAclPolicyResult> InvokeAsync(GetAclPolicyArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAclPolicyResult>("nomad:index/getAclPolicy:getAclPolicy", args ?? new GetAclPolicyArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieve information on an ACL Policy.
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
        ///     var myPolicy = Nomad.GetAclPolicy.Invoke(new()
        ///     {
        ///         Name = "my-policy",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAclPolicyResult> Invoke(GetAclPolicyInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAclPolicyResult>("nomad:index/getAclPolicy:getAclPolicy", args ?? new GetAclPolicyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAclPolicyArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// `(string)` - the name of the ACL Policy.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetAclPolicyArgs()
        {
        }
        public static new GetAclPolicyArgs Empty => new GetAclPolicyArgs();
    }

    public sealed class GetAclPolicyInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// `(string)` - the name of the ACL Policy.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetAclPolicyInvokeArgs()
        {
        }
        public static new GetAclPolicyInvokeArgs Empty => new GetAclPolicyInvokeArgs();
    }


    [OutputType]
    public sealed class GetAclPolicyResult
    {
        /// <summary>
        /// `(string)` - the description of the ACL Policy.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// `(string)` - the name of the ACL Policy.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// `(string)` - the ACL Policy rules in HCL format.
        /// </summary>
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
