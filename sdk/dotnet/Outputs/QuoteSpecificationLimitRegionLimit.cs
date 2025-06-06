// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad.Outputs
{

    [OutputType]
    public sealed class QuoteSpecificationLimitRegionLimit
    {
        /// <summary>
        /// `(int: 0)` - The amount of CPU to limit allocations to. A value of zero
        /// is treated as unlimited, and a negative value is treated as fully disallowed.
        /// </summary>
        public readonly int? Cpu;
        /// <summary>
        /// `(int: 0)` - The amount of memory (in megabytes) to limit
        /// allocations to. A value of zero is treated as unlimited, and a negative value
        /// is treated as fully disallowed.
        /// </summary>
        public readonly int? MemoryMb;

        [OutputConstructor]
        private QuoteSpecificationLimitRegionLimit(
            int? cpu,

            int? memoryMb)
        {
            Cpu = cpu;
            MemoryMb = memoryMb;
        }
    }
}
