// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nomad

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Parse a HCL jobspec and produce the equivalent JSON encoded job.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//	"os"
//
//	"github.com/pulumi/pulumi-nomad/sdk/go/nomad"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func readFileOrPanic(path string) pulumi.StringPtrInput {
//		data, err := os.ReadFile(path)
//		if err != nil {
//			panic(err.Error())
//		}
//		return pulumi.String(string(data))
//	}
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := nomad.GetJobParser(ctx, &nomad.GetJobParserArgs{
//				Hcl:          readFileOrPanic(fmt.Sprintf("%v/jobspec.hcl", path.Module)),
//				Canonicalize: pulumi.BoolRef(false),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetJobParser(ctx *pulumi.Context, args *GetJobParserArgs, opts ...pulumi.InvokeOption) (*GetJobParserResult, error) {
	var rv GetJobParserResult
	err := ctx.Invoke("nomad:index/getJobParser:getJobParser", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getJobParser.
type GetJobParserArgs struct {
	// `(boolean: true)` - flag to enable setting any unset fields to their default values.
	Canonicalize *bool `pulumi:"canonicalize"`
	// `(string)` - the HCL definition of the job.
	Hcl string `pulumi:"hcl"`
}

// A collection of values returned by getJobParser.
type GetJobParserResult struct {
	// `(boolean: true)` - flag to enable setting any unset fields to their default values.
	Canonicalize *bool `pulumi:"canonicalize"`
	// `(string)` - the HCL definition of the job.
	Hcl string `pulumi:"hcl"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// `(string)` - the parsed job as JSON string.
	Json string `pulumi:"json"`
}

func GetJobParserOutput(ctx *pulumi.Context, args GetJobParserOutputArgs, opts ...pulumi.InvokeOption) GetJobParserResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetJobParserResult, error) {
			args := v.(GetJobParserArgs)
			r, err := GetJobParser(ctx, &args, opts...)
			var s GetJobParserResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetJobParserResultOutput)
}

// A collection of arguments for invoking getJobParser.
type GetJobParserOutputArgs struct {
	// `(boolean: true)` - flag to enable setting any unset fields to their default values.
	Canonicalize pulumi.BoolPtrInput `pulumi:"canonicalize"`
	// `(string)` - the HCL definition of the job.
	Hcl pulumi.StringInput `pulumi:"hcl"`
}

func (GetJobParserOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetJobParserArgs)(nil)).Elem()
}

// A collection of values returned by getJobParser.
type GetJobParserResultOutput struct{ *pulumi.OutputState }

func (GetJobParserResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetJobParserResult)(nil)).Elem()
}

func (o GetJobParserResultOutput) ToGetJobParserResultOutput() GetJobParserResultOutput {
	return o
}

func (o GetJobParserResultOutput) ToGetJobParserResultOutputWithContext(ctx context.Context) GetJobParserResultOutput {
	return o
}

// `(boolean: true)` - flag to enable setting any unset fields to their default values.
func (o GetJobParserResultOutput) Canonicalize() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetJobParserResult) *bool { return v.Canonicalize }).(pulumi.BoolPtrOutput)
}

// `(string)` - the HCL definition of the job.
func (o GetJobParserResultOutput) Hcl() pulumi.StringOutput {
	return o.ApplyT(func(v GetJobParserResult) string { return v.Hcl }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetJobParserResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetJobParserResult) string { return v.Id }).(pulumi.StringOutput)
}

// `(string)` - the parsed job as JSON string.
func (o GetJobParserResultOutput) Json() pulumi.StringOutput {
	return o.ApplyT(func(v GetJobParserResult) string { return v.Json }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetJobParserResultOutput{})
}
