// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nomad

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-nomad/sdk/v2/go/nomad/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Retrieve a list of volumes in Nomad.
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
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := nomad.GetVolumes(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetVolumes(ctx *pulumi.Context, args *GetVolumesArgs, opts ...pulumi.InvokeOption) (*GetVolumesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetVolumesResult
	err := ctx.Invoke("nomad:index/getVolumes:getVolumes", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVolumes.
type GetVolumesArgs struct {
	// `(string: "default")` Nomad namespace.
	Namespace *string `pulumi:"namespace"`
	// `(string: optional)` Volume node filter.
	NodeId *string `pulumi:"nodeId"`
	// `(string: optional)` Plugin ID filter.
	PluginId *string `pulumi:"pluginId"`
	// `(string: "csi")` Volume type (currently only supports `csi`)
	Type *string `pulumi:"type"`
}

// A collection of values returned by getVolumes.
type GetVolumesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// `string` Volume namespace.
	Namespace *string `pulumi:"namespace"`
	NodeId    *string `pulumi:"nodeId"`
	PluginId  *string `pulumi:"pluginId"`
	Type      *string `pulumi:"type"`
	// `list of maps` a list of volumes in the cluster.
	Volumes []map[string]interface{} `pulumi:"volumes"`
}

func GetVolumesOutput(ctx *pulumi.Context, args GetVolumesOutputArgs, opts ...pulumi.InvokeOption) GetVolumesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetVolumesResult, error) {
			args := v.(GetVolumesArgs)
			r, err := GetVolumes(ctx, &args, opts...)
			var s GetVolumesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetVolumesResultOutput)
}

// A collection of arguments for invoking getVolumes.
type GetVolumesOutputArgs struct {
	// `(string: "default")` Nomad namespace.
	Namespace pulumi.StringPtrInput `pulumi:"namespace"`
	// `(string: optional)` Volume node filter.
	NodeId pulumi.StringPtrInput `pulumi:"nodeId"`
	// `(string: optional)` Plugin ID filter.
	PluginId pulumi.StringPtrInput `pulumi:"pluginId"`
	// `(string: "csi")` Volume type (currently only supports `csi`)
	Type pulumi.StringPtrInput `pulumi:"type"`
}

func (GetVolumesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVolumesArgs)(nil)).Elem()
}

// A collection of values returned by getVolumes.
type GetVolumesResultOutput struct{ *pulumi.OutputState }

func (GetVolumesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVolumesResult)(nil)).Elem()
}

func (o GetVolumesResultOutput) ToGetVolumesResultOutput() GetVolumesResultOutput {
	return o
}

func (o GetVolumesResultOutput) ToGetVolumesResultOutputWithContext(ctx context.Context) GetVolumesResultOutput {
	return o
}

func (o GetVolumesResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetVolumesResult] {
	return pulumix.Output[GetVolumesResult]{
		OutputState: o.OutputState,
	}
}

// The provider-assigned unique ID for this managed resource.
func (o GetVolumesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetVolumesResult) string { return v.Id }).(pulumi.StringOutput)
}

// `string` Volume namespace.
func (o GetVolumesResultOutput) Namespace() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVolumesResult) *string { return v.Namespace }).(pulumi.StringPtrOutput)
}

func (o GetVolumesResultOutput) NodeId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVolumesResult) *string { return v.NodeId }).(pulumi.StringPtrOutput)
}

func (o GetVolumesResultOutput) PluginId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVolumesResult) *string { return v.PluginId }).(pulumi.StringPtrOutput)
}

func (o GetVolumesResultOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVolumesResult) *string { return v.Type }).(pulumi.StringPtrOutput)
}

// `list of maps` a list of volumes in the cluster.
func (o GetVolumesResultOutput) Volumes() pulumi.MapArrayOutput {
	return o.ApplyT(func(v GetVolumesResult) []map[string]interface{} { return v.Volumes }).(pulumi.MapArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetVolumesResultOutput{})
}
