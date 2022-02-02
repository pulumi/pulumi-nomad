// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package nomad

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The provider type for the nomad package. By default, resources use package-wide configuration
// settings, however an explicit `Provider` instance may be created and passed during resource
// construction to achieve fine-grained programmatic control over provider settings. See the
// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
type Provider struct {
	pulumi.ProviderResourceState

	// URL of the root of the target Nomad agent.
	Address pulumi.StringOutput `pulumi:"address"`
	// A path to a PEM-encoded certificate authority used to verify the remote agent's certificate.
	CaFile pulumi.StringPtrOutput `pulumi:"caFile"`
	// PEM-encoded certificate authority used to verify the remote agent's certificate.
	CaPem pulumi.StringPtrOutput `pulumi:"caPem"`
	// A path to a PEM-encoded certificate provided to the remote agent; requires use of key_file or key_pem.
	CertFile pulumi.StringPtrOutput `pulumi:"certFile"`
	// PEM-encoded certificate provided to the remote agent; requires use of key_file or key_pem.
	CertPem pulumi.StringPtrOutput `pulumi:"certPem"`
	// Consul token to validate Consul Connect Service Identity policies specified in the job file.
	ConsulToken pulumi.StringPtrOutput `pulumi:"consulToken"`
	// HTTP basic auth configuration.
	HttpAuth pulumi.StringPtrOutput `pulumi:"httpAuth"`
	// A path to a PEM-encoded private key, required if cert_file or cert_pem is specified.
	KeyFile pulumi.StringPtrOutput `pulumi:"keyFile"`
	// PEM-encoded private key, required if cert_file or cert_pem is specified.
	KeyPem pulumi.StringPtrOutput `pulumi:"keyPem"`
	// Region of the target Nomad agent.
	Region pulumi.StringPtrOutput `pulumi:"region"`
	// ACL token secret for API requests.
	SecretId pulumi.StringPtrOutput `pulumi:"secretId"`
	// Vault token if policies are specified in the job file.
	VaultToken pulumi.StringPtrOutput `pulumi:"vaultToken"`
}

// NewProvider registers a new resource with the given unique name, arguments, and options.
func NewProvider(ctx *pulumi.Context,
	name string, args *ProviderArgs, opts ...pulumi.ResourceOption) (*Provider, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Address == nil {
		return nil, errors.New("invalid value for required argument 'Address'")
	}
	var resource Provider
	err := ctx.RegisterResource("pulumi:providers:nomad", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type providerArgs struct {
	// URL of the root of the target Nomad agent.
	Address string `pulumi:"address"`
	// A path to a PEM-encoded certificate authority used to verify the remote agent's certificate.
	CaFile *string `pulumi:"caFile"`
	// PEM-encoded certificate authority used to verify the remote agent's certificate.
	CaPem *string `pulumi:"caPem"`
	// A path to a PEM-encoded certificate provided to the remote agent; requires use of key_file or key_pem.
	CertFile *string `pulumi:"certFile"`
	// PEM-encoded certificate provided to the remote agent; requires use of key_file or key_pem.
	CertPem *string `pulumi:"certPem"`
	// Consul token to validate Consul Connect Service Identity policies specified in the job file.
	ConsulToken *string `pulumi:"consulToken"`
	// The headers to send with each Nomad request.
	Headers []ProviderHeader `pulumi:"headers"`
	// HTTP basic auth configuration.
	HttpAuth *string `pulumi:"httpAuth"`
	// A path to a PEM-encoded private key, required if cert_file or cert_pem is specified.
	KeyFile *string `pulumi:"keyFile"`
	// PEM-encoded private key, required if cert_file or cert_pem is specified.
	KeyPem *string `pulumi:"keyPem"`
	// Region of the target Nomad agent.
	Region *string `pulumi:"region"`
	// ACL token secret for API requests.
	SecretId *string `pulumi:"secretId"`
	// Vault token if policies are specified in the job file.
	VaultToken *string `pulumi:"vaultToken"`
}

// The set of arguments for constructing a Provider resource.
type ProviderArgs struct {
	// URL of the root of the target Nomad agent.
	Address pulumi.StringInput
	// A path to a PEM-encoded certificate authority used to verify the remote agent's certificate.
	CaFile pulumi.StringPtrInput
	// PEM-encoded certificate authority used to verify the remote agent's certificate.
	CaPem pulumi.StringPtrInput
	// A path to a PEM-encoded certificate provided to the remote agent; requires use of key_file or key_pem.
	CertFile pulumi.StringPtrInput
	// PEM-encoded certificate provided to the remote agent; requires use of key_file or key_pem.
	CertPem pulumi.StringPtrInput
	// Consul token to validate Consul Connect Service Identity policies specified in the job file.
	ConsulToken pulumi.StringPtrInput
	// The headers to send with each Nomad request.
	Headers ProviderHeaderArrayInput
	// HTTP basic auth configuration.
	HttpAuth pulumi.StringPtrInput
	// A path to a PEM-encoded private key, required if cert_file or cert_pem is specified.
	KeyFile pulumi.StringPtrInput
	// PEM-encoded private key, required if cert_file or cert_pem is specified.
	KeyPem pulumi.StringPtrInput
	// Region of the target Nomad agent.
	Region pulumi.StringPtrInput
	// ACL token secret for API requests.
	SecretId pulumi.StringPtrInput
	// Vault token if policies are specified in the job file.
	VaultToken pulumi.StringPtrInput
}

func (ProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*providerArgs)(nil)).Elem()
}

type ProviderInput interface {
	pulumi.Input

	ToProviderOutput() ProviderOutput
	ToProviderOutputWithContext(ctx context.Context) ProviderOutput
}

func (*Provider) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (i *Provider) ToProviderOutput() ProviderOutput {
	return i.ToProviderOutputWithContext(context.Background())
}

func (i *Provider) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderOutput)
}

type ProviderOutput struct{ *pulumi.OutputState }

func (ProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (o ProviderOutput) ToProviderOutput() ProviderOutput {
	return o
}

func (o ProviderOutput) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return o
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderInput)(nil)).Elem(), &Provider{})
	pulumi.RegisterOutputType(ProviderOutput{})
}
