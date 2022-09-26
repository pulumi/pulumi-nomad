// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad.Inputs
{

    public sealed class QuoteSpecificationLimitRegionLimitGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// `(int: 0)` - The amount of CPU to limit allocations to. A value of zero
        /// is treated as unlimited, and a negative value is treated as fully disallowed.
        /// </summary>
        [Input("cpu")]
        public Input<int>? Cpu { get; set; }

        /// <summary>
        /// `(int: 0)` - The amount of memory (in megabytes) to limit
        /// allocations to. A value of zero is treated as unlimited, and a negative value
        /// is treated as fully disallowed.
        /// </summary>
        [Input("memoryMb")]
        public Input<int>? MemoryMb { get; set; }

        public QuoteSpecificationLimitRegionLimitGetArgs()
        {
        }
        public static new QuoteSpecificationLimitRegionLimitGetArgs Empty => new QuoteSpecificationLimitRegionLimitGetArgs();
    }
}
