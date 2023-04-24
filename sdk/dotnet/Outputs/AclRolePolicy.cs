// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad.Outputs
{

    [OutputType]
    public sealed class AclRolePolicy
    {
        /// <summary>
        /// `(string: &lt;required&gt;)` - A human-friendly name for this ACL Role.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private AclRolePolicy(string name)
        {
            Name = name;
        }
    }
}