[![Actions Status](https://github.com/pulumi/pulumi-nomad/workflows/master/badge.svg)](https://github.com/pulumi/pulumi-nomad/actions)
[![Slack](http://www.pulumi.com/images/docs/badges/slack.svg)](https://slack.pulumi.com)
[![NPM version](https://badge.fury.io/js/%40pulumi%2Fnomad.svg)](https://www.npmjs.com/package/@pulumi/nomad)
[![Python version](https://badge.fury.io/py/pulumi-nomad.svg)](https://pypi.org/project/pulumi-nomad)
[![NuGet version](https://badge.fury.io/nu/pulumi.nomad.svg)](https://badge.fury.io/nu/pulumi.nomad)
[![PkgGoDev](https://pkg.go.dev/badge/github.com/pulumi/pulumi-nomad/sdk/v2/go)](https://pkg.go.dev/github.com/pulumi/pulumi-nomad/sdk/v2/go)
[![License](https://img.shields.io/npm/l/%40pulumi%2Fpulumi.svg)](https://github.com/pulumi/pulumi-nomad/blob/master/LICENSE)

# HashiCorp Nomad Resource Provider

The HashiCorp Nomad Resource Provider lets you manage Nomad resources.

## Installing

This package is available in many languages in the standard packaging formats.

### Node.js (Java/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

    $ npm install @pulumi/nomad

or `yarn`:

    $ yarn add @pulumi/nomad

### Python

To use from Python, install using `pip`:

    $ pip install pulumi_nomad

### Go

To use from Go, use `go get` to grab the latest version of the library

    $ go get github.com/pulumi/pulumi-nomad/sdk/v2

### .NET

To use from .NET, install using `dotnet add package`:

    $ dotnet add package Pulumi.Nomad

## Configuration

The following configuration points are available:

- `nomad:address` - The HTTP(S) API address of the Nomad agent. This must include the leading protocol (e.g. https://). 
  This can also be specified as the `NOMAD_ADDR` environment variable.
- `nomad:region` - The Nomad region to target. This can also be specified as the `NOMAD_REGION` environment variable.
- `nomad:httpAuth` - HTTP Basic Authentication credentials to be used when communicating with Nomad, in the format of 
  either `user` or `user:pass`. This can also be specified using the `NOMAD_HTTP_AUTH` environment variable.
- `nomad:caFile` - A local file path to a PEM-encoded certificate authority used to verify the remote agent's 
  certificate. This can also be specified as the `NOMAD_CACERT` environment variable.
- `nomad:caPerm` - PEM-encoded certificate authority used to verify the remote agent's certificate.
- `nomad:certFile` - A local file path to a PEM-encoded certificate provided to the remote agent. If this is specified,
  key_file or key_pem is also required. This can also be specified as the `NOMAD_CLIENT_CERT` environment variable.
- `nomad:certPem` - PEM-encoded certificate provided to the remote agent. If this is specified, `keyFile` or `keyPem` is also required.
- `nomad:keyFile` - A local file path to a PEM-encoded private key. This is required if `certFile` or `certPem` is 
  specified. This can also be specified via the `NOMAD_CLIENT_KEY` environment variable.
- `nomad:keyPem` - PEM-encoded private key. This is required if `certFile` or `certPem` is specified.
- `nomad:headers` - A configuration block, described below, that provides headers to be sent along with all 
  requests to Nomad. This block can be specified multiple times.
- `nomad:vaultToken` - A Vault token used when submitting the job. This can also be specified as the `VAULT_TOKEN` 
  environment variable or using a Vault token helper (see Vault's documentation for more details).
- `nomad:consulToken` - A Consul token used when submitting the job. This can also be specified as the 
  `CONSUL_HTTP_TOKEN` environment variable. See below for strategies when multiple Consul tokens are required.
- `nomad:secretId` - The Secret ID of an ACL token to make requests with, for ACL-enabled clusters. This can also be 
  specified via the `NOMAD_TOKEN` environment variable.

The `nomad:headers` configuration block accepts the following arguments:

- `name` - The name of the header.
- `value` - The value of the header.

## Reference

For further information, please visit [the Nomad provider docs](https://www.pulumi.com/docs/intro/cloud-providers/nomad)
or for detailed reference documentation, please visit [the API docs](https://www.pulumi.com/docs/reference/pkg/nomad).
