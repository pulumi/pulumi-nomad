// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nomad

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-nomad/sdk/v2/go/nomad/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Manages a Sentinel policy registered in Nomad.
//
// > **Enterprise Only!** This API endpoint and functionality only exists in
//
//	Nomad Enterprise. This is not present in the open source version of Nomad.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-nomad/sdk/v2/go/nomad"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := nomad.NewSentinelPolicy(ctx, "exec-only", &nomad.SentinelPolicyArgs{
//				Description:      pulumi.String("Only allow jobs that are based on an exec driver."),
//				EnforcementLevel: pulumi.String("soft-mandatory"),
//				Policy: pulumi.String(fmt.Sprintf(`main = rule { all_drivers_exec }
//
// # all_drivers_exec checks that all the drivers in use are exec
//
//	all_drivers_exec = rule {
//	    all job.task_groups as tg {
//	        all tg.tasks as task {
//	            task.driver is "exec"
//	        }
//	    }
//	}
//
// `)),
//
//				Scope: pulumi.String("submit-job"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type SentinelPolicy struct {
	pulumi.CustomResourceState

	// `(string: "")` - A description of the policy.
	//
	// [scope]: https://www.nomadproject.io/guides/sentinel-policy.html#policy-scope
	// [enforcement-level]: https://www.nomadproject.io/guides/sentinel-policy.html#enforcement-level
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// `(strings: <required>)` - The [enforcement level][enforcement-level]
	// for this policy.
	EnforcementLevel pulumi.StringOutput `pulumi:"enforcementLevel"`
	// `(string: <required>)` - A unique name for the policy.
	Name pulumi.StringOutput `pulumi:"name"`
	// `(string: <required>)` - The contents of the policy to register.
	Policy pulumi.StringOutput `pulumi:"policy"`
	// `(strings: <required>)` - The [scope][scope] for this policy.
	Scope pulumi.StringOutput `pulumi:"scope"`
}

// NewSentinelPolicy registers a new resource with the given unique name, arguments, and options.
func NewSentinelPolicy(ctx *pulumi.Context,
	name string, args *SentinelPolicyArgs, opts ...pulumi.ResourceOption) (*SentinelPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EnforcementLevel == nil {
		return nil, errors.New("invalid value for required argument 'EnforcementLevel'")
	}
	if args.Policy == nil {
		return nil, errors.New("invalid value for required argument 'Policy'")
	}
	if args.Scope == nil {
		return nil, errors.New("invalid value for required argument 'Scope'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SentinelPolicy
	err := ctx.RegisterResource("nomad:index/sentinelPolicy:SentinelPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSentinelPolicy gets an existing SentinelPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSentinelPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SentinelPolicyState, opts ...pulumi.ResourceOption) (*SentinelPolicy, error) {
	var resource SentinelPolicy
	err := ctx.ReadResource("nomad:index/sentinelPolicy:SentinelPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SentinelPolicy resources.
type sentinelPolicyState struct {
	// `(string: "")` - A description of the policy.
	//
	// [scope]: https://www.nomadproject.io/guides/sentinel-policy.html#policy-scope
	// [enforcement-level]: https://www.nomadproject.io/guides/sentinel-policy.html#enforcement-level
	Description *string `pulumi:"description"`
	// `(strings: <required>)` - The [enforcement level][enforcement-level]
	// for this policy.
	EnforcementLevel *string `pulumi:"enforcementLevel"`
	// `(string: <required>)` - A unique name for the policy.
	Name *string `pulumi:"name"`
	// `(string: <required>)` - The contents of the policy to register.
	Policy *string `pulumi:"policy"`
	// `(strings: <required>)` - The [scope][scope] for this policy.
	Scope *string `pulumi:"scope"`
}

type SentinelPolicyState struct {
	// `(string: "")` - A description of the policy.
	//
	// [scope]: https://www.nomadproject.io/guides/sentinel-policy.html#policy-scope
	// [enforcement-level]: https://www.nomadproject.io/guides/sentinel-policy.html#enforcement-level
	Description pulumi.StringPtrInput
	// `(strings: <required>)` - The [enforcement level][enforcement-level]
	// for this policy.
	EnforcementLevel pulumi.StringPtrInput
	// `(string: <required>)` - A unique name for the policy.
	Name pulumi.StringPtrInput
	// `(string: <required>)` - The contents of the policy to register.
	Policy pulumi.StringPtrInput
	// `(strings: <required>)` - The [scope][scope] for this policy.
	Scope pulumi.StringPtrInput
}

func (SentinelPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*sentinelPolicyState)(nil)).Elem()
}

type sentinelPolicyArgs struct {
	// `(string: "")` - A description of the policy.
	//
	// [scope]: https://www.nomadproject.io/guides/sentinel-policy.html#policy-scope
	// [enforcement-level]: https://www.nomadproject.io/guides/sentinel-policy.html#enforcement-level
	Description *string `pulumi:"description"`
	// `(strings: <required>)` - The [enforcement level][enforcement-level]
	// for this policy.
	EnforcementLevel string `pulumi:"enforcementLevel"`
	// `(string: <required>)` - A unique name for the policy.
	Name *string `pulumi:"name"`
	// `(string: <required>)` - The contents of the policy to register.
	Policy string `pulumi:"policy"`
	// `(strings: <required>)` - The [scope][scope] for this policy.
	Scope string `pulumi:"scope"`
}

// The set of arguments for constructing a SentinelPolicy resource.
type SentinelPolicyArgs struct {
	// `(string: "")` - A description of the policy.
	//
	// [scope]: https://www.nomadproject.io/guides/sentinel-policy.html#policy-scope
	// [enforcement-level]: https://www.nomadproject.io/guides/sentinel-policy.html#enforcement-level
	Description pulumi.StringPtrInput
	// `(strings: <required>)` - The [enforcement level][enforcement-level]
	// for this policy.
	EnforcementLevel pulumi.StringInput
	// `(string: <required>)` - A unique name for the policy.
	Name pulumi.StringPtrInput
	// `(string: <required>)` - The contents of the policy to register.
	Policy pulumi.StringInput
	// `(strings: <required>)` - The [scope][scope] for this policy.
	Scope pulumi.StringInput
}

func (SentinelPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sentinelPolicyArgs)(nil)).Elem()
}

type SentinelPolicyInput interface {
	pulumi.Input

	ToSentinelPolicyOutput() SentinelPolicyOutput
	ToSentinelPolicyOutputWithContext(ctx context.Context) SentinelPolicyOutput
}

func (*SentinelPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**SentinelPolicy)(nil)).Elem()
}

func (i *SentinelPolicy) ToSentinelPolicyOutput() SentinelPolicyOutput {
	return i.ToSentinelPolicyOutputWithContext(context.Background())
}

func (i *SentinelPolicy) ToSentinelPolicyOutputWithContext(ctx context.Context) SentinelPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SentinelPolicyOutput)
}

func (i *SentinelPolicy) ToOutput(ctx context.Context) pulumix.Output[*SentinelPolicy] {
	return pulumix.Output[*SentinelPolicy]{
		OutputState: i.ToSentinelPolicyOutputWithContext(ctx).OutputState,
	}
}

// SentinelPolicyArrayInput is an input type that accepts SentinelPolicyArray and SentinelPolicyArrayOutput values.
// You can construct a concrete instance of `SentinelPolicyArrayInput` via:
//
//	SentinelPolicyArray{ SentinelPolicyArgs{...} }
type SentinelPolicyArrayInput interface {
	pulumi.Input

	ToSentinelPolicyArrayOutput() SentinelPolicyArrayOutput
	ToSentinelPolicyArrayOutputWithContext(context.Context) SentinelPolicyArrayOutput
}

type SentinelPolicyArray []SentinelPolicyInput

func (SentinelPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SentinelPolicy)(nil)).Elem()
}

func (i SentinelPolicyArray) ToSentinelPolicyArrayOutput() SentinelPolicyArrayOutput {
	return i.ToSentinelPolicyArrayOutputWithContext(context.Background())
}

func (i SentinelPolicyArray) ToSentinelPolicyArrayOutputWithContext(ctx context.Context) SentinelPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SentinelPolicyArrayOutput)
}

func (i SentinelPolicyArray) ToOutput(ctx context.Context) pulumix.Output[[]*SentinelPolicy] {
	return pulumix.Output[[]*SentinelPolicy]{
		OutputState: i.ToSentinelPolicyArrayOutputWithContext(ctx).OutputState,
	}
}

// SentinelPolicyMapInput is an input type that accepts SentinelPolicyMap and SentinelPolicyMapOutput values.
// You can construct a concrete instance of `SentinelPolicyMapInput` via:
//
//	SentinelPolicyMap{ "key": SentinelPolicyArgs{...} }
type SentinelPolicyMapInput interface {
	pulumi.Input

	ToSentinelPolicyMapOutput() SentinelPolicyMapOutput
	ToSentinelPolicyMapOutputWithContext(context.Context) SentinelPolicyMapOutput
}

type SentinelPolicyMap map[string]SentinelPolicyInput

func (SentinelPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SentinelPolicy)(nil)).Elem()
}

func (i SentinelPolicyMap) ToSentinelPolicyMapOutput() SentinelPolicyMapOutput {
	return i.ToSentinelPolicyMapOutputWithContext(context.Background())
}

func (i SentinelPolicyMap) ToSentinelPolicyMapOutputWithContext(ctx context.Context) SentinelPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SentinelPolicyMapOutput)
}

func (i SentinelPolicyMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*SentinelPolicy] {
	return pulumix.Output[map[string]*SentinelPolicy]{
		OutputState: i.ToSentinelPolicyMapOutputWithContext(ctx).OutputState,
	}
}

type SentinelPolicyOutput struct{ *pulumi.OutputState }

func (SentinelPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SentinelPolicy)(nil)).Elem()
}

func (o SentinelPolicyOutput) ToSentinelPolicyOutput() SentinelPolicyOutput {
	return o
}

func (o SentinelPolicyOutput) ToSentinelPolicyOutputWithContext(ctx context.Context) SentinelPolicyOutput {
	return o
}

func (o SentinelPolicyOutput) ToOutput(ctx context.Context) pulumix.Output[*SentinelPolicy] {
	return pulumix.Output[*SentinelPolicy]{
		OutputState: o.OutputState,
	}
}

// `(string: "")` - A description of the policy.
//
// [scope]: https://www.nomadproject.io/guides/sentinel-policy.html#policy-scope
// [enforcement-level]: https://www.nomadproject.io/guides/sentinel-policy.html#enforcement-level
func (o SentinelPolicyOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SentinelPolicy) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// `(strings: <required>)` - The [enforcement level][enforcement-level]
// for this policy.
func (o SentinelPolicyOutput) EnforcementLevel() pulumi.StringOutput {
	return o.ApplyT(func(v *SentinelPolicy) pulumi.StringOutput { return v.EnforcementLevel }).(pulumi.StringOutput)
}

// `(string: <required>)` - A unique name for the policy.
func (o SentinelPolicyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SentinelPolicy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// `(string: <required>)` - The contents of the policy to register.
func (o SentinelPolicyOutput) Policy() pulumi.StringOutput {
	return o.ApplyT(func(v *SentinelPolicy) pulumi.StringOutput { return v.Policy }).(pulumi.StringOutput)
}

// `(strings: <required>)` - The [scope][scope] for this policy.
func (o SentinelPolicyOutput) Scope() pulumi.StringOutput {
	return o.ApplyT(func(v *SentinelPolicy) pulumi.StringOutput { return v.Scope }).(pulumi.StringOutput)
}

type SentinelPolicyArrayOutput struct{ *pulumi.OutputState }

func (SentinelPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SentinelPolicy)(nil)).Elem()
}

func (o SentinelPolicyArrayOutput) ToSentinelPolicyArrayOutput() SentinelPolicyArrayOutput {
	return o
}

func (o SentinelPolicyArrayOutput) ToSentinelPolicyArrayOutputWithContext(ctx context.Context) SentinelPolicyArrayOutput {
	return o
}

func (o SentinelPolicyArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*SentinelPolicy] {
	return pulumix.Output[[]*SentinelPolicy]{
		OutputState: o.OutputState,
	}
}

func (o SentinelPolicyArrayOutput) Index(i pulumi.IntInput) SentinelPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SentinelPolicy {
		return vs[0].([]*SentinelPolicy)[vs[1].(int)]
	}).(SentinelPolicyOutput)
}

type SentinelPolicyMapOutput struct{ *pulumi.OutputState }

func (SentinelPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SentinelPolicy)(nil)).Elem()
}

func (o SentinelPolicyMapOutput) ToSentinelPolicyMapOutput() SentinelPolicyMapOutput {
	return o
}

func (o SentinelPolicyMapOutput) ToSentinelPolicyMapOutputWithContext(ctx context.Context) SentinelPolicyMapOutput {
	return o
}

func (o SentinelPolicyMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*SentinelPolicy] {
	return pulumix.Output[map[string]*SentinelPolicy]{
		OutputState: o.OutputState,
	}
}

func (o SentinelPolicyMapOutput) MapIndex(k pulumi.StringInput) SentinelPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SentinelPolicy {
		return vs[0].(map[string]*SentinelPolicy)[vs[1].(string)]
	}).(SentinelPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SentinelPolicyInput)(nil)).Elem(), &SentinelPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*SentinelPolicyArrayInput)(nil)).Elem(), SentinelPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SentinelPolicyMapInput)(nil)).Elem(), SentinelPolicyMap{})
	pulumi.RegisterOutputType(SentinelPolicyOutput{})
	pulumi.RegisterOutputType(SentinelPolicyArrayOutput{})
	pulumi.RegisterOutputType(SentinelPolicyMapOutput{})
}
