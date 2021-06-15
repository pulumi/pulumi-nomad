// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad.Inputs
{

    public sealed class JobHcl2Args : Pulumi.ResourceArgs
    {
        /// <summary>
        /// `(boolean: false)` - Set this to `true` to be able to use
        /// HCL2 filesystem functions
        /// </summary>
        [Input("allowFs")]
        public Input<bool>? AllowFs { get; set; }

        /// <summary>
        /// `(boolean: false)` - Set this to `true` if your jobspec uses the HCL2
        /// format instead of the default HCL.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("vars")]
        private InputMap<object>? _vars;
        public InputMap<object> Vars
        {
            get => _vars ?? (_vars = new InputMap<object>());
            set => _vars = value;
        }

        public JobHcl2Args()
        {
        }
    }
}