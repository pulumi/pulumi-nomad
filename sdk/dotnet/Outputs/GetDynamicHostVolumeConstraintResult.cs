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
    public sealed class GetDynamicHostVolumeConstraintResult
    {
        /// <summary>
        /// `(string)` - The [node attribute][] to check for the constraint.
        /// </summary>
        public readonly string Attribute;
        /// <summary>
        /// `(string)`- The operator to use in the comparison.
        /// </summary>
        public readonly string Operator;
        /// <summary>
        /// `(string)` - The value of the attribute to compare against.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private GetDynamicHostVolumeConstraintResult(
            string attribute,

            string @operator,

            string value)
        {
            Attribute = attribute;
            Operator = @operator;
            Value = value;
        }
    }
}
