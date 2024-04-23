// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nomad

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-nomad/sdk/v2/go/nomad/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Lookup a plugin by ID. The aim of this datasource is to determine whether
// a particular plugin exists on the cluster, to find information on the health
// and availability of the plugin, and to optionally wait for the plugin
// before performing actions the require an available plugin controller.
//
// If a plugin with the specified ID does not exist and the datasource is not
// configured to wait, it will result in an error. For simple existence checks,
// use the `getPlugins` listing datasource.
//
// ## Example Usage
//
// Check for the existence of a plugin:
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
//			_, err := nomad.GetPlugin(ctx, &nomad.GetPluginArgs{
//				PluginId:       "aws-ebs0",
//				WaitForHealthy: pulumi.BoolRef(true),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// This will check for a plugin with the ID `aws-ebs0`, waiting until the plugin
// is healthy before returning.
func GetPlugin(ctx *pulumi.Context, args *GetPluginArgs, opts ...pulumi.InvokeOption) (*GetPluginResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetPluginResult
	err := ctx.Invoke("nomad:index/getPlugin:getPlugin", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPlugin.
type GetPluginArgs struct {
	// `(string)` ID of the plugin.
	PluginId string `pulumi:"pluginId"`
	// `(boolean)` retry until the plugin exists and all controllers are healthy
	WaitForHealthy *bool `pulumi:"waitForHealthy"`
	// `(boolean)` if the plugin doesn't exist, retry until it does
	WaitForRegistration *bool `pulumi:"waitForRegistration"`
}

// A collection of values returned by getPlugin.
type GetPluginResult struct {
	// `(boolean)` Whether a controller is required.
	ControllerRequired bool `pulumi:"controllerRequired"`
	// `(integer)` The number of registered controllers.
	ControllersExpected int `pulumi:"controllersExpected"`
	// `(integer)` The number of healthy controllers.
	ControllersHealthy int `pulumi:"controllersHealthy"`
	// The provider-assigned unique ID for this managed resource.
	Id    string          `pulumi:"id"`
	Nodes []GetPluginNode `pulumi:"nodes"`
	// `(integer)` The number of registered nodes.
	NodesExpected int `pulumi:"nodesExpected"`
	// `(integer)` The number of healthy nodes.
	NodesHealthy int `pulumi:"nodesHealthy"`
	// `(string)` ID of the plugin
	PluginId string `pulumi:"pluginId"`
	// `(string)` Plugin provider name
	PluginProvider string `pulumi:"pluginProvider"`
	// `(string)` Plugin provider version
	PluginProviderVersion string `pulumi:"pluginProviderVersion"`
	WaitForHealthy        *bool  `pulumi:"waitForHealthy"`
	WaitForRegistration   *bool  `pulumi:"waitForRegistration"`
}

func GetPluginOutput(ctx *pulumi.Context, args GetPluginOutputArgs, opts ...pulumi.InvokeOption) GetPluginResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetPluginResult, error) {
			args := v.(GetPluginArgs)
			r, err := GetPlugin(ctx, &args, opts...)
			var s GetPluginResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetPluginResultOutput)
}

// A collection of arguments for invoking getPlugin.
type GetPluginOutputArgs struct {
	// `(string)` ID of the plugin.
	PluginId pulumi.StringInput `pulumi:"pluginId"`
	// `(boolean)` retry until the plugin exists and all controllers are healthy
	WaitForHealthy pulumi.BoolPtrInput `pulumi:"waitForHealthy"`
	// `(boolean)` if the plugin doesn't exist, retry until it does
	WaitForRegistration pulumi.BoolPtrInput `pulumi:"waitForRegistration"`
}

func (GetPluginOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPluginArgs)(nil)).Elem()
}

// A collection of values returned by getPlugin.
type GetPluginResultOutput struct{ *pulumi.OutputState }

func (GetPluginResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPluginResult)(nil)).Elem()
}

func (o GetPluginResultOutput) ToGetPluginResultOutput() GetPluginResultOutput {
	return o
}

func (o GetPluginResultOutput) ToGetPluginResultOutputWithContext(ctx context.Context) GetPluginResultOutput {
	return o
}

// `(boolean)` Whether a controller is required.
func (o GetPluginResultOutput) ControllerRequired() pulumi.BoolOutput {
	return o.ApplyT(func(v GetPluginResult) bool { return v.ControllerRequired }).(pulumi.BoolOutput)
}

// `(integer)` The number of registered controllers.
func (o GetPluginResultOutput) ControllersExpected() pulumi.IntOutput {
	return o.ApplyT(func(v GetPluginResult) int { return v.ControllersExpected }).(pulumi.IntOutput)
}

// `(integer)` The number of healthy controllers.
func (o GetPluginResultOutput) ControllersHealthy() pulumi.IntOutput {
	return o.ApplyT(func(v GetPluginResult) int { return v.ControllersHealthy }).(pulumi.IntOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetPluginResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetPluginResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetPluginResultOutput) Nodes() GetPluginNodeArrayOutput {
	return o.ApplyT(func(v GetPluginResult) []GetPluginNode { return v.Nodes }).(GetPluginNodeArrayOutput)
}

// `(integer)` The number of registered nodes.
func (o GetPluginResultOutput) NodesExpected() pulumi.IntOutput {
	return o.ApplyT(func(v GetPluginResult) int { return v.NodesExpected }).(pulumi.IntOutput)
}

// `(integer)` The number of healthy nodes.
func (o GetPluginResultOutput) NodesHealthy() pulumi.IntOutput {
	return o.ApplyT(func(v GetPluginResult) int { return v.NodesHealthy }).(pulumi.IntOutput)
}

// `(string)` ID of the plugin
func (o GetPluginResultOutput) PluginId() pulumi.StringOutput {
	return o.ApplyT(func(v GetPluginResult) string { return v.PluginId }).(pulumi.StringOutput)
}

// `(string)` Plugin provider name
func (o GetPluginResultOutput) PluginProvider() pulumi.StringOutput {
	return o.ApplyT(func(v GetPluginResult) string { return v.PluginProvider }).(pulumi.StringOutput)
}

// `(string)` Plugin provider version
func (o GetPluginResultOutput) PluginProviderVersion() pulumi.StringOutput {
	return o.ApplyT(func(v GetPluginResult) string { return v.PluginProviderVersion }).(pulumi.StringOutput)
}

func (o GetPluginResultOutput) WaitForHealthy() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetPluginResult) *bool { return v.WaitForHealthy }).(pulumi.BoolPtrOutput)
}

func (o GetPluginResultOutput) WaitForRegistration() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetPluginResult) *bool { return v.WaitForRegistration }).(pulumi.BoolPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetPluginResultOutput{})
}
