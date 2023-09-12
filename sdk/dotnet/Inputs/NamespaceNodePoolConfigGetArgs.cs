// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad.Inputs
{

    public sealed class NamespaceNodePoolConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("alloweds")]
        private InputList<string>? _alloweds;

        /// <summary>
        /// `([]string: &lt;optional&gt;)` - The list of node pools that are allowed to be used in this namespace.
        /// </summary>
        public InputList<string> Alloweds
        {
            get => _alloweds ?? (_alloweds = new InputList<string>());
            set => _alloweds = value;
        }

        /// <summary>
        /// `(string: &lt;optional&gt;)` - The default node pool for jobs that don't define one.
        /// </summary>
        [Input("default")]
        public Input<string>? Default { get; set; }

        [Input("denieds")]
        private InputList<string>? _denieds;

        /// <summary>
        /// `([]string: &lt;optional&gt;)` - The list of node pools that are not allowed to be used in this namespace.
        /// </summary>
        public InputList<string> Denieds
        {
            get => _denieds ?? (_denieds = new InputList<string>());
            set => _denieds = value;
        }

        public NamespaceNodePoolConfigGetArgs()
        {
        }
        public static new NamespaceNodePoolConfigGetArgs Empty => new NamespaceNodePoolConfigGetArgs();
    }
}
