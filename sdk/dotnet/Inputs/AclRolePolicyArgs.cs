// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad.Inputs
{

    public sealed class AclRolePolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// `(string: &lt;required&gt;)` - A human-friendly name for this ACL Role.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public AclRolePolicyArgs()
        {
        }
        public static new AclRolePolicyArgs Empty => new AclRolePolicyArgs();
    }
}
