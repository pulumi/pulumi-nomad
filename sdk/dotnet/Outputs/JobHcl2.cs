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
    public sealed class JobHcl2
    {
        /// <summary>
        /// `(boolean: false)` - Set this to `true` to be able to use
        /// HCL2 filesystem functions
        /// </summary>
        public readonly bool? AllowFs;
        /// <summary>
        /// `(boolean: false)` - **Deprecated** All HCL jobs are parsed as
        /// HCL2 by default.
        /// </summary>
        public readonly bool? Enabled;
        public readonly ImmutableDictionary<string, object>? Vars;

        [OutputConstructor]
        private JobHcl2(
            bool? allowFs,

            bool? enabled,

            ImmutableDictionary<string, object>? vars)
        {
            AllowFs = allowFs;
            Enabled = enabled;
            Vars = vars;
        }
    }
}
