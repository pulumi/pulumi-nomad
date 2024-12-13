// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nomad

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-nomad/sdk/v2/go/nomad/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get information on a job ID. The aim of this datasource is to enable
// you to act on various settings and states of a particular job.
//
// An error is triggered if zero or more than one result is returned by the query.
//
// ## Example Usage
//
// Get the data about a snapshot:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-nomad/sdk/v2/go/nomad"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := nomad.LookupJob(ctx, &nomad.LookupJobArgs{
//				JobId:     "example",
//				Namespace: pulumi.StringRef("dev"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupJob(ctx *pulumi.Context, args *LookupJobArgs, opts ...pulumi.InvokeOption) (*LookupJobResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupJobResult
	err := ctx.Invoke("nomad:index/getJob:getJob", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getJob.
type LookupJobArgs struct {
	// `(string)` ID of the job.
	JobId string `pulumi:"jobId"`
	// `(string)` Namespace of the specified job.
	Namespace *string `pulumi:"namespace"`
}

// A collection of values returned by getJob.
type LookupJobResult struct {
	// `(boolean)`  If the scheduler can make partial placements on oversubscribed nodes.
	AllAtOnce   bool               `pulumi:"allAtOnce"`
	Constraints []GetJobConstraint `pulumi:"constraints"`
	// `(integer)` Creation Index.
	CreateIndex int `pulumi:"createIndex"`
	// `(list of strings)` Datacenters allowed to run the specified job.
	Datacenters []string `pulumi:"datacenters"`
	// The provider-assigned unique ID for this managed resource.
	Id    string `pulumi:"id"`
	JobId string `pulumi:"jobId"`
	// `(integer)` Job modify index (used for version verification).
	JobModifyIndex int `pulumi:"jobModifyIndex"`
	// `(integer)` Modification Index.
	ModifyIndex int `pulumi:"modifyIndex"`
	// `(string)` Name of the job.
	Name      string  `pulumi:"name"`
	Namespace *string `pulumi:"namespace"`
	// `(string)` Job's parent ID.
	ParentId string `pulumi:"parentId"`
	// `(list of maps)` Job's periodic configuration (time based scheduling).
	PeriodicConfigs []GetJobPeriodicConfig `pulumi:"periodicConfigs"`
	// `(integer)` Used for the prioritization of scheduling and resource access.
	Priority int `pulumi:"priority"`
	// `(string)` Region where the Nomad cluster resides.
	Region string `pulumi:"region"`
	// `(boolean)` Job stability status.
	Stable bool `pulumi:"stable"`
	// `(string)` Execution status of the specified job.
	Status string `pulumi:"status"`
	// `(string)` Status description of the specified job.
	StatusDescription string `pulumi:"statusDescription"`
	// `(boolean)` Job enabled status.
	Stop bool `pulumi:"stop"`
	// `(integer)` Job submission date.
	SubmitTime int `pulumi:"submitTime"`
	// `(list of maps)` A list of of the job's task groups.
	TaskGroups []GetJobTaskGroup `pulumi:"taskGroups"`
	// `(string)` Scheduler type used during job creation.
	Type string `pulumi:"type"`
	// `(integer)` Version of the specified job.
	Version int `pulumi:"version"`
}

func LookupJobOutput(ctx *pulumi.Context, args LookupJobOutputArgs, opts ...pulumi.InvokeOption) LookupJobResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupJobResultOutput, error) {
			args := v.(LookupJobArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("nomad:index/getJob:getJob", args, LookupJobResultOutput{}, options).(LookupJobResultOutput), nil
		}).(LookupJobResultOutput)
}

// A collection of arguments for invoking getJob.
type LookupJobOutputArgs struct {
	// `(string)` ID of the job.
	JobId pulumi.StringInput `pulumi:"jobId"`
	// `(string)` Namespace of the specified job.
	Namespace pulumi.StringPtrInput `pulumi:"namespace"`
}

func (LookupJobOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupJobArgs)(nil)).Elem()
}

// A collection of values returned by getJob.
type LookupJobResultOutput struct{ *pulumi.OutputState }

func (LookupJobResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupJobResult)(nil)).Elem()
}

func (o LookupJobResultOutput) ToLookupJobResultOutput() LookupJobResultOutput {
	return o
}

func (o LookupJobResultOutput) ToLookupJobResultOutputWithContext(ctx context.Context) LookupJobResultOutput {
	return o
}

// `(boolean)`  If the scheduler can make partial placements on oversubscribed nodes.
func (o LookupJobResultOutput) AllAtOnce() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupJobResult) bool { return v.AllAtOnce }).(pulumi.BoolOutput)
}

func (o LookupJobResultOutput) Constraints() GetJobConstraintArrayOutput {
	return o.ApplyT(func(v LookupJobResult) []GetJobConstraint { return v.Constraints }).(GetJobConstraintArrayOutput)
}

// `(integer)` Creation Index.
func (o LookupJobResultOutput) CreateIndex() pulumi.IntOutput {
	return o.ApplyT(func(v LookupJobResult) int { return v.CreateIndex }).(pulumi.IntOutput)
}

// `(list of strings)` Datacenters allowed to run the specified job.
func (o LookupJobResultOutput) Datacenters() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupJobResult) []string { return v.Datacenters }).(pulumi.StringArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupJobResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupJobResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupJobResultOutput) JobId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupJobResult) string { return v.JobId }).(pulumi.StringOutput)
}

// `(integer)` Job modify index (used for version verification).
func (o LookupJobResultOutput) JobModifyIndex() pulumi.IntOutput {
	return o.ApplyT(func(v LookupJobResult) int { return v.JobModifyIndex }).(pulumi.IntOutput)
}

// `(integer)` Modification Index.
func (o LookupJobResultOutput) ModifyIndex() pulumi.IntOutput {
	return o.ApplyT(func(v LookupJobResult) int { return v.ModifyIndex }).(pulumi.IntOutput)
}

// `(string)` Name of the job.
func (o LookupJobResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupJobResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupJobResultOutput) Namespace() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupJobResult) *string { return v.Namespace }).(pulumi.StringPtrOutput)
}

// `(string)` Job's parent ID.
func (o LookupJobResultOutput) ParentId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupJobResult) string { return v.ParentId }).(pulumi.StringOutput)
}

// `(list of maps)` Job's periodic configuration (time based scheduling).
func (o LookupJobResultOutput) PeriodicConfigs() GetJobPeriodicConfigArrayOutput {
	return o.ApplyT(func(v LookupJobResult) []GetJobPeriodicConfig { return v.PeriodicConfigs }).(GetJobPeriodicConfigArrayOutput)
}

// `(integer)` Used for the prioritization of scheduling and resource access.
func (o LookupJobResultOutput) Priority() pulumi.IntOutput {
	return o.ApplyT(func(v LookupJobResult) int { return v.Priority }).(pulumi.IntOutput)
}

// `(string)` Region where the Nomad cluster resides.
func (o LookupJobResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v LookupJobResult) string { return v.Region }).(pulumi.StringOutput)
}

// `(boolean)` Job stability status.
func (o LookupJobResultOutput) Stable() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupJobResult) bool { return v.Stable }).(pulumi.BoolOutput)
}

// `(string)` Execution status of the specified job.
func (o LookupJobResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupJobResult) string { return v.Status }).(pulumi.StringOutput)
}

// `(string)` Status description of the specified job.
func (o LookupJobResultOutput) StatusDescription() pulumi.StringOutput {
	return o.ApplyT(func(v LookupJobResult) string { return v.StatusDescription }).(pulumi.StringOutput)
}

// `(boolean)` Job enabled status.
func (o LookupJobResultOutput) Stop() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupJobResult) bool { return v.Stop }).(pulumi.BoolOutput)
}

// `(integer)` Job submission date.
func (o LookupJobResultOutput) SubmitTime() pulumi.IntOutput {
	return o.ApplyT(func(v LookupJobResult) int { return v.SubmitTime }).(pulumi.IntOutput)
}

// `(list of maps)` A list of of the job's task groups.
func (o LookupJobResultOutput) TaskGroups() GetJobTaskGroupArrayOutput {
	return o.ApplyT(func(v LookupJobResult) []GetJobTaskGroup { return v.TaskGroups }).(GetJobTaskGroupArrayOutput)
}

// `(string)` Scheduler type used during job creation.
func (o LookupJobResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupJobResult) string { return v.Type }).(pulumi.StringOutput)
}

// `(integer)` Version of the specified job.
func (o LookupJobResultOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v LookupJobResult) int { return v.Version }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupJobResultOutput{})
}
