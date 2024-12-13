// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nomad

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-nomad/sdk/v2/go/nomad/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieve a list of regions available in Nomad.
//
// ## Example Usage
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
//	func notImplemented(message string) pulumi.AnyOutput {
//		panic(message)
//	}
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			myRegions, err := nomad.GetRegions(ctx, map[string]interface{}{}, nil)
//			if err != nil {
//				return err
//			}
//			jobs := notImplemented("The template_file data resource is not yet supported.")
//			var app []*nomad.Job
//			for index := 0; index < int(len(myRegions.Regions)); index++ {
//				key0 := index
//				val0 := index
//				__res, err := nomad.NewJob(ctx, fmt.Sprintf("app-%v", key0), &nomad.JobArgs{
//					Jobspec: jobs[val0].Rendered,
//				})
//				if err != nil {
//					return err
//				}
//				app = append(app, __res)
//			}
//			return nil
//		})
//	}
//
// ```
func GetRegions(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetRegionsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetRegionsResult
	err := ctx.Invoke("nomad:index/getRegions:getRegions", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getRegions.
type GetRegionsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// `(list of strings)` - a list of regions available in the cluster.
	Regions []string `pulumi:"regions"`
}

func GetRegionsOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetRegionsResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetRegionsResultOutput, error) {
		options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
		return ctx.InvokeOutput("nomad:index/getRegions:getRegions", nil, GetRegionsResultOutput{}, options).(GetRegionsResultOutput), nil
	}).(GetRegionsResultOutput)
}

// A collection of values returned by getRegions.
type GetRegionsResultOutput struct{ *pulumi.OutputState }

func (GetRegionsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRegionsResult)(nil)).Elem()
}

func (o GetRegionsResultOutput) ToGetRegionsResultOutput() GetRegionsResultOutput {
	return o
}

func (o GetRegionsResultOutput) ToGetRegionsResultOutputWithContext(ctx context.Context) GetRegionsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetRegionsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetRegionsResult) string { return v.Id }).(pulumi.StringOutput)
}

// `(list of strings)` - a list of regions available in the cluster.
func (o GetRegionsResultOutput) Regions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetRegionsResult) []string { return v.Regions }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetRegionsResultOutput{})
}
