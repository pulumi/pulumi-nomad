// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package nomad

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type Job struct {
	pulumi.CustomResourceState

	// The IDs for allocations associated with this job.
	AllocationIds pulumi.StringArrayOutput `pulumi:"allocationIds"`
	// The target datacenters for the job, as derived from the jobspec.
	Datacenters pulumi.StringArrayOutput `pulumi:"datacenters"`
	// If detach = false, the ID for the deployment associated with the last job create/update, if one exists.
	DeploymentId pulumi.StringOutput `pulumi:"deploymentId"`
	// If detach = false, the status for the deployment associated with the last job create/update, if one exists.
	DeploymentStatus pulumi.StringOutput `pulumi:"deploymentStatus"`
	// If true, the job will be deregistered on destroy.
	DeregisterOnDestroy pulumi.BoolPtrOutput `pulumi:"deregisterOnDestroy"`
	// `(boolean: true)` - Determines if the job will be
	// deregistered if the ID of the job in the jobspec changes.
	DeregisterOnIdChange pulumi.BoolPtrOutput `pulumi:"deregisterOnIdChange"`
	// `(boolean: true)` - If true, the provider will return immediately
	// after creating or updating, instead of monitoring.
	Detach pulumi.BoolPtrOutput `pulumi:"detach"`
	// `(block: optional)` - Options for the HCL2 jobspec parser.
	Hcl2 JobHcl2PtrOutput `pulumi:"hcl2"`
	// `(string: <required>)` - The contents of the jobspec to register.
	Jobspec pulumi.StringOutput `pulumi:"jobspec"`
	// `(boolean: false)` - Set this to `true` if your jobspec is structured with
	// JSON instead of the default HCL.
	Json pulumi.BoolPtrOutput `pulumi:"json"`
	// Integer that increments for each change. Used to detect any changes between plan and apply.
	ModifyIndex pulumi.StringOutput `pulumi:"modifyIndex"`
	// The name of the job, as derived from the jobspec.
	Name pulumi.StringOutput `pulumi:"name"`
	// The namespace of the job, as derived from the jobspec.
	Namespace pulumi.StringOutput `pulumi:"namespace"`
	// `(boolean: false)` - Determines if the job will override any
	// soft-mandatory Sentinel policies and register even if they fail.
	PolicyOverride pulumi.BoolPtrOutput `pulumi:"policyOverride"`
	// `(boolean: false)` - Set this to true if you want the job to
	// be purged when the resource is destroyed.
	PurgeOnDestroy pulumi.BoolPtrOutput `pulumi:"purgeOnDestroy"`
	// The target region for the job, as derived from the jobspec.
	Region     pulumi.StringOutput     `pulumi:"region"`
	TaskGroups JobTaskGroupArrayOutput `pulumi:"taskGroups"`
	// The type of the job, as derived from the jobspec.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewJob registers a new resource with the given unique name, arguments, and options.
func NewJob(ctx *pulumi.Context,
	name string, args *JobArgs, opts ...pulumi.ResourceOption) (*Job, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Jobspec == nil {
		return nil, errors.New("invalid value for required argument 'Jobspec'")
	}
	var resource Job
	err := ctx.RegisterResource("nomad:index/job:Job", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetJob gets an existing Job resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetJob(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *JobState, opts ...pulumi.ResourceOption) (*Job, error) {
	var resource Job
	err := ctx.ReadResource("nomad:index/job:Job", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Job resources.
type jobState struct {
	// The IDs for allocations associated with this job.
	AllocationIds []string `pulumi:"allocationIds"`
	// The target datacenters for the job, as derived from the jobspec.
	Datacenters []string `pulumi:"datacenters"`
	// If detach = false, the ID for the deployment associated with the last job create/update, if one exists.
	DeploymentId *string `pulumi:"deploymentId"`
	// If detach = false, the status for the deployment associated with the last job create/update, if one exists.
	DeploymentStatus *string `pulumi:"deploymentStatus"`
	// If true, the job will be deregistered on destroy.
	DeregisterOnDestroy *bool `pulumi:"deregisterOnDestroy"`
	// `(boolean: true)` - Determines if the job will be
	// deregistered if the ID of the job in the jobspec changes.
	DeregisterOnIdChange *bool `pulumi:"deregisterOnIdChange"`
	// `(boolean: true)` - If true, the provider will return immediately
	// after creating or updating, instead of monitoring.
	Detach *bool `pulumi:"detach"`
	// `(block: optional)` - Options for the HCL2 jobspec parser.
	Hcl2 *JobHcl2 `pulumi:"hcl2"`
	// `(string: <required>)` - The contents of the jobspec to register.
	Jobspec *string `pulumi:"jobspec"`
	// `(boolean: false)` - Set this to `true` if your jobspec is structured with
	// JSON instead of the default HCL.
	Json *bool `pulumi:"json"`
	// Integer that increments for each change. Used to detect any changes between plan and apply.
	ModifyIndex *string `pulumi:"modifyIndex"`
	// The name of the job, as derived from the jobspec.
	Name *string `pulumi:"name"`
	// The namespace of the job, as derived from the jobspec.
	Namespace *string `pulumi:"namespace"`
	// `(boolean: false)` - Determines if the job will override any
	// soft-mandatory Sentinel policies and register even if they fail.
	PolicyOverride *bool `pulumi:"policyOverride"`
	// `(boolean: false)` - Set this to true if you want the job to
	// be purged when the resource is destroyed.
	PurgeOnDestroy *bool `pulumi:"purgeOnDestroy"`
	// The target region for the job, as derived from the jobspec.
	Region     *string        `pulumi:"region"`
	TaskGroups []JobTaskGroup `pulumi:"taskGroups"`
	// The type of the job, as derived from the jobspec.
	Type *string `pulumi:"type"`
}

type JobState struct {
	// The IDs for allocations associated with this job.
	AllocationIds pulumi.StringArrayInput
	// The target datacenters for the job, as derived from the jobspec.
	Datacenters pulumi.StringArrayInput
	// If detach = false, the ID for the deployment associated with the last job create/update, if one exists.
	DeploymentId pulumi.StringPtrInput
	// If detach = false, the status for the deployment associated with the last job create/update, if one exists.
	DeploymentStatus pulumi.StringPtrInput
	// If true, the job will be deregistered on destroy.
	DeregisterOnDestroy pulumi.BoolPtrInput
	// `(boolean: true)` - Determines if the job will be
	// deregistered if the ID of the job in the jobspec changes.
	DeregisterOnIdChange pulumi.BoolPtrInput
	// `(boolean: true)` - If true, the provider will return immediately
	// after creating or updating, instead of monitoring.
	Detach pulumi.BoolPtrInput
	// `(block: optional)` - Options for the HCL2 jobspec parser.
	Hcl2 JobHcl2PtrInput
	// `(string: <required>)` - The contents of the jobspec to register.
	Jobspec pulumi.StringPtrInput
	// `(boolean: false)` - Set this to `true` if your jobspec is structured with
	// JSON instead of the default HCL.
	Json pulumi.BoolPtrInput
	// Integer that increments for each change. Used to detect any changes between plan and apply.
	ModifyIndex pulumi.StringPtrInput
	// The name of the job, as derived from the jobspec.
	Name pulumi.StringPtrInput
	// The namespace of the job, as derived from the jobspec.
	Namespace pulumi.StringPtrInput
	// `(boolean: false)` - Determines if the job will override any
	// soft-mandatory Sentinel policies and register even if they fail.
	PolicyOverride pulumi.BoolPtrInput
	// `(boolean: false)` - Set this to true if you want the job to
	// be purged when the resource is destroyed.
	PurgeOnDestroy pulumi.BoolPtrInput
	// The target region for the job, as derived from the jobspec.
	Region     pulumi.StringPtrInput
	TaskGroups JobTaskGroupArrayInput
	// The type of the job, as derived from the jobspec.
	Type pulumi.StringPtrInput
}

func (JobState) ElementType() reflect.Type {
	return reflect.TypeOf((*jobState)(nil)).Elem()
}

type jobArgs struct {
	// If true, the job will be deregistered on destroy.
	DeregisterOnDestroy *bool `pulumi:"deregisterOnDestroy"`
	// `(boolean: true)` - Determines if the job will be
	// deregistered if the ID of the job in the jobspec changes.
	DeregisterOnIdChange *bool `pulumi:"deregisterOnIdChange"`
	// `(boolean: true)` - If true, the provider will return immediately
	// after creating or updating, instead of monitoring.
	Detach *bool `pulumi:"detach"`
	// `(block: optional)` - Options for the HCL2 jobspec parser.
	Hcl2 *JobHcl2 `pulumi:"hcl2"`
	// `(string: <required>)` - The contents of the jobspec to register.
	Jobspec string `pulumi:"jobspec"`
	// `(boolean: false)` - Set this to `true` if your jobspec is structured with
	// JSON instead of the default HCL.
	Json *bool `pulumi:"json"`
	// `(boolean: false)` - Determines if the job will override any
	// soft-mandatory Sentinel policies and register even if they fail.
	PolicyOverride *bool `pulumi:"policyOverride"`
	// `(boolean: false)` - Set this to true if you want the job to
	// be purged when the resource is destroyed.
	PurgeOnDestroy *bool `pulumi:"purgeOnDestroy"`
}

// The set of arguments for constructing a Job resource.
type JobArgs struct {
	// If true, the job will be deregistered on destroy.
	DeregisterOnDestroy pulumi.BoolPtrInput
	// `(boolean: true)` - Determines if the job will be
	// deregistered if the ID of the job in the jobspec changes.
	DeregisterOnIdChange pulumi.BoolPtrInput
	// `(boolean: true)` - If true, the provider will return immediately
	// after creating or updating, instead of monitoring.
	Detach pulumi.BoolPtrInput
	// `(block: optional)` - Options for the HCL2 jobspec parser.
	Hcl2 JobHcl2PtrInput
	// `(string: <required>)` - The contents of the jobspec to register.
	Jobspec pulumi.StringInput
	// `(boolean: false)` - Set this to `true` if your jobspec is structured with
	// JSON instead of the default HCL.
	Json pulumi.BoolPtrInput
	// `(boolean: false)` - Determines if the job will override any
	// soft-mandatory Sentinel policies and register even if they fail.
	PolicyOverride pulumi.BoolPtrInput
	// `(boolean: false)` - Set this to true if you want the job to
	// be purged when the resource is destroyed.
	PurgeOnDestroy pulumi.BoolPtrInput
}

func (JobArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*jobArgs)(nil)).Elem()
}

type JobInput interface {
	pulumi.Input

	ToJobOutput() JobOutput
	ToJobOutputWithContext(ctx context.Context) JobOutput
}

func (*Job) ElementType() reflect.Type {
	return reflect.TypeOf((**Job)(nil)).Elem()
}

func (i *Job) ToJobOutput() JobOutput {
	return i.ToJobOutputWithContext(context.Background())
}

func (i *Job) ToJobOutputWithContext(ctx context.Context) JobOutput {
	return pulumi.ToOutputWithContext(ctx, i).(JobOutput)
}

// JobArrayInput is an input type that accepts JobArray and JobArrayOutput values.
// You can construct a concrete instance of `JobArrayInput` via:
//
//          JobArray{ JobArgs{...} }
type JobArrayInput interface {
	pulumi.Input

	ToJobArrayOutput() JobArrayOutput
	ToJobArrayOutputWithContext(context.Context) JobArrayOutput
}

type JobArray []JobInput

func (JobArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Job)(nil)).Elem()
}

func (i JobArray) ToJobArrayOutput() JobArrayOutput {
	return i.ToJobArrayOutputWithContext(context.Background())
}

func (i JobArray) ToJobArrayOutputWithContext(ctx context.Context) JobArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(JobArrayOutput)
}

// JobMapInput is an input type that accepts JobMap and JobMapOutput values.
// You can construct a concrete instance of `JobMapInput` via:
//
//          JobMap{ "key": JobArgs{...} }
type JobMapInput interface {
	pulumi.Input

	ToJobMapOutput() JobMapOutput
	ToJobMapOutputWithContext(context.Context) JobMapOutput
}

type JobMap map[string]JobInput

func (JobMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Job)(nil)).Elem()
}

func (i JobMap) ToJobMapOutput() JobMapOutput {
	return i.ToJobMapOutputWithContext(context.Background())
}

func (i JobMap) ToJobMapOutputWithContext(ctx context.Context) JobMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(JobMapOutput)
}

type JobOutput struct{ *pulumi.OutputState }

func (JobOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Job)(nil)).Elem()
}

func (o JobOutput) ToJobOutput() JobOutput {
	return o
}

func (o JobOutput) ToJobOutputWithContext(ctx context.Context) JobOutput {
	return o
}

type JobArrayOutput struct{ *pulumi.OutputState }

func (JobArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Job)(nil)).Elem()
}

func (o JobArrayOutput) ToJobArrayOutput() JobArrayOutput {
	return o
}

func (o JobArrayOutput) ToJobArrayOutputWithContext(ctx context.Context) JobArrayOutput {
	return o
}

func (o JobArrayOutput) Index(i pulumi.IntInput) JobOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Job {
		return vs[0].([]*Job)[vs[1].(int)]
	}).(JobOutput)
}

type JobMapOutput struct{ *pulumi.OutputState }

func (JobMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Job)(nil)).Elem()
}

func (o JobMapOutput) ToJobMapOutput() JobMapOutput {
	return o
}

func (o JobMapOutput) ToJobMapOutputWithContext(ctx context.Context) JobMapOutput {
	return o
}

func (o JobMapOutput) MapIndex(k pulumi.StringInput) JobOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Job {
		return vs[0].(map[string]*Job)[vs[1].(string)]
	}).(JobOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*JobInput)(nil)).Elem(), &Job{})
	pulumi.RegisterInputType(reflect.TypeOf((*JobArrayInput)(nil)).Elem(), JobArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*JobMapInput)(nil)).Elem(), JobMap{})
	pulumi.RegisterOutputType(JobOutput{})
	pulumi.RegisterOutputType(JobArrayOutput{})
	pulumi.RegisterOutputType(JobMapOutput{})
}
