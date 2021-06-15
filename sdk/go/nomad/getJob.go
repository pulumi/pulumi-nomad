// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package nomad

import (
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
// 	"github.com/pulumi/pulumi-nomad/sdk/go/nomad"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := nomad.LookupJob(ctx, &nomad.LookupJobArgs{
// 			JobId: "example",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupJob(ctx *pulumi.Context, args *LookupJobArgs, opts ...pulumi.InvokeOption) (*LookupJobResult, error) {
	var rv LookupJobResult
	err := ctx.Invoke("nomad:index/getJob:getJob", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getJob.
type LookupJobArgs struct {
	JobId     string  `pulumi:"jobId"`
	Namespace *string `pulumi:"namespace"`
}

// A collection of values returned by getJob.
type LookupJobResult struct {
	AllAtOnce   bool               `pulumi:"allAtOnce"`
	Constraints []GetJobConstraint `pulumi:"constraints"`
	CreateIndex int                `pulumi:"createIndex"`
	Datacenters []string           `pulumi:"datacenters"`
	// The provider-assigned unique ID for this managed resource.
	Id                string                 `pulumi:"id"`
	JobId             string                 `pulumi:"jobId"`
	JobModifyIndex    int                    `pulumi:"jobModifyIndex"`
	ModifyIndex       int                    `pulumi:"modifyIndex"`
	Name              string                 `pulumi:"name"`
	Namespace         *string                `pulumi:"namespace"`
	ParentId          string                 `pulumi:"parentId"`
	PeriodicConfigs   []GetJobPeriodicConfig `pulumi:"periodicConfigs"`
	Priority          int                    `pulumi:"priority"`
	Region            string                 `pulumi:"region"`
	Stable            bool                   `pulumi:"stable"`
	Status            string                 `pulumi:"status"`
	StatusDescription string                 `pulumi:"statusDescription"`
	Stop              bool                   `pulumi:"stop"`
	SubmitTime        int                    `pulumi:"submitTime"`
	TaskGroups        []GetJobTaskGroup      `pulumi:"taskGroups"`
	Type              string                 `pulumi:"type"`
	Version           int                    `pulumi:"version"`
}