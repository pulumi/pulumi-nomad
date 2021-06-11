// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad.Inputs
{

    public sealed class JobTaskGroupGetArgs : Pulumi.ResourceArgs
    {
        [Input("count")]
        public Input<int>? Count { get; set; }

        [Input("meta")]
        private InputMap<object>? _meta;
        public InputMap<object> Meta
        {
            get => _meta ?? (_meta = new InputMap<object>());
            set => _meta = value;
        }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tasks")]
        private InputList<Inputs.JobTaskGroupTaskGetArgs>? _tasks;
        public InputList<Inputs.JobTaskGroupTaskGetArgs> Tasks
        {
            get => _tasks ?? (_tasks = new InputList<Inputs.JobTaskGroupTaskGetArgs>());
            set => _tasks = value;
        }

        [Input("volumes")]
        private InputList<Inputs.JobTaskGroupVolumeGetArgs>? _volumes;
        public InputList<Inputs.JobTaskGroupVolumeGetArgs> Volumes
        {
            get => _volumes ?? (_volumes = new InputList<Inputs.JobTaskGroupVolumeGetArgs>());
            set => _volumes = value;
        }

        public JobTaskGroupGetArgs()
        {
        }
    }
}
