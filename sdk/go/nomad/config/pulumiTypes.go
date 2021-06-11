// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package config

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type Headers struct {
	Name  string `pulumi:"name"`
	Value string `pulumi:"value"`
}

// HeadersInput is an input type that accepts HeadersArgs and HeadersOutput values.
// You can construct a concrete instance of `HeadersInput` via:
//
//          HeadersArgs{...}
type HeadersInput interface {
	pulumi.Input

	ToHeadersOutput() HeadersOutput
	ToHeadersOutputWithContext(context.Context) HeadersOutput
}

type HeadersArgs struct {
	Name  pulumi.StringInput `pulumi:"name"`
	Value pulumi.StringInput `pulumi:"value"`
}

func (HeadersArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*Headers)(nil)).Elem()
}

func (i HeadersArgs) ToHeadersOutput() HeadersOutput {
	return i.ToHeadersOutputWithContext(context.Background())
}

func (i HeadersArgs) ToHeadersOutputWithContext(ctx context.Context) HeadersOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HeadersOutput)
}

// HeadersArrayInput is an input type that accepts HeadersArray and HeadersArrayOutput values.
// You can construct a concrete instance of `HeadersArrayInput` via:
//
//          HeadersArray{ HeadersArgs{...} }
type HeadersArrayInput interface {
	pulumi.Input

	ToHeadersArrayOutput() HeadersArrayOutput
	ToHeadersArrayOutputWithContext(context.Context) HeadersArrayOutput
}

type HeadersArray []HeadersInput

func (HeadersArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Headers)(nil)).Elem()
}

func (i HeadersArray) ToHeadersArrayOutput() HeadersArrayOutput {
	return i.ToHeadersArrayOutputWithContext(context.Background())
}

func (i HeadersArray) ToHeadersArrayOutputWithContext(ctx context.Context) HeadersArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HeadersArrayOutput)
}

type HeadersOutput struct{ *pulumi.OutputState }

func (HeadersOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Headers)(nil)).Elem()
}

func (o HeadersOutput) ToHeadersOutput() HeadersOutput {
	return o
}

func (o HeadersOutput) ToHeadersOutputWithContext(ctx context.Context) HeadersOutput {
	return o
}

func (o HeadersOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v Headers) string { return v.Name }).(pulumi.StringOutput)
}

func (o HeadersOutput) Value() pulumi.StringOutput {
	return o.ApplyT(func(v Headers) string { return v.Value }).(pulumi.StringOutput)
}

type HeadersArrayOutput struct{ *pulumi.OutputState }

func (HeadersArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Headers)(nil)).Elem()
}

func (o HeadersArrayOutput) ToHeadersArrayOutput() HeadersArrayOutput {
	return o
}

func (o HeadersArrayOutput) ToHeadersArrayOutputWithContext(ctx context.Context) HeadersArrayOutput {
	return o
}

func (o HeadersArrayOutput) Index(i pulumi.IntInput) HeadersOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Headers {
		return vs[0].([]Headers)[vs[1].(int)]
	}).(HeadersOutput)
}

func init() {
	pulumi.RegisterOutputType(HeadersOutput{})
	pulumi.RegisterOutputType(HeadersArrayOutput{})
}
