// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nomad

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-nomad/sdk/v2/go/nomad/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

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
//			_, err := nomad.NewVariable(ctx, "example", &nomad.VariableArgs{
//				Path: pulumi.String("path/of/existing/variable"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupVariable(ctx *pulumi.Context, args *LookupVariableArgs, opts ...pulumi.InvokeOption) (*LookupVariableResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupVariableResult
	err := ctx.Invoke("nomad:index/getVariable:getVariable", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVariable.
type LookupVariableArgs struct {
	// `(string: "default")` - The namepsace in which the variable exists.
	Namespace *string `pulumi:"namespace"`
	// `(string)` - Path to the existing variable.
	Path string `pulumi:"path"`
}

// A collection of values returned by getVariable.
type LookupVariableResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// `(map[string]string)` - Map of items in the variable.
	Items map[string]string `pulumi:"items"`
	// `(string)` - The namespace in which the variable exists.
	Namespace *string `pulumi:"namespace"`
	// `(string)` - The path at which the variable exists.
	Path string `pulumi:"path"`
}

func LookupVariableOutput(ctx *pulumi.Context, args LookupVariableOutputArgs, opts ...pulumi.InvokeOption) LookupVariableResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupVariableResultOutput, error) {
			args := v.(LookupVariableArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("nomad:index/getVariable:getVariable", args, LookupVariableResultOutput{}, options).(LookupVariableResultOutput), nil
		}).(LookupVariableResultOutput)
}

// A collection of arguments for invoking getVariable.
type LookupVariableOutputArgs struct {
	// `(string: "default")` - The namepsace in which the variable exists.
	Namespace pulumi.StringPtrInput `pulumi:"namespace"`
	// `(string)` - Path to the existing variable.
	Path pulumi.StringInput `pulumi:"path"`
}

func (LookupVariableOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupVariableArgs)(nil)).Elem()
}

// A collection of values returned by getVariable.
type LookupVariableResultOutput struct{ *pulumi.OutputState }

func (LookupVariableResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupVariableResult)(nil)).Elem()
}

func (o LookupVariableResultOutput) ToLookupVariableResultOutput() LookupVariableResultOutput {
	return o
}

func (o LookupVariableResultOutput) ToLookupVariableResultOutputWithContext(ctx context.Context) LookupVariableResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupVariableResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVariableResult) string { return v.Id }).(pulumi.StringOutput)
}

// `(map[string]string)` - Map of items in the variable.
func (o LookupVariableResultOutput) Items() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupVariableResult) map[string]string { return v.Items }).(pulumi.StringMapOutput)
}

// `(string)` - The namespace in which the variable exists.
func (o LookupVariableResultOutput) Namespace() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupVariableResult) *string { return v.Namespace }).(pulumi.StringPtrOutput)
}

// `(string)` - The path at which the variable exists.
func (o LookupVariableResultOutput) Path() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVariableResult) string { return v.Path }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupVariableResultOutput{})
}
