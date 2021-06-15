[![Actions Status](https://github.com/pulumi/pulumi-nomad/workflows/master/badge.svg)](https://github.com/pulumi/pulumi-nomad/actions)
[![Slack](http://www.pulumi.com/images/docs/badges/slack.svg)](https://slack.pulumi.com)
[![NPM version](https://badge.fury.io/js/%40pulumi%2Fnomad.svg)](https://www.npmjs.com/package/@pulumi/nomad)
[![Python version](https://badge.fury.io/py/pulumi-nomad.svg)](https://pypi.org/project/pulumi-nomad)
[![NuGet version](https://badge.fury.io/nu/pulumi.nomad.svg)](https://badge.fury.io/nu/pulumi.nomad)
[![PkgGoDev](https://pkg.go.dev/badge/github.com/pulumi/pulumi-nomad/sdk/go)](https://pkg.go.dev/github.com/pulumi/pulumi-nomad/sdk/go)
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

    $ go get github.com/pulumi/pulumi-nomad/sdk/go/...

### .NET

To use from .NET, install using `dotnet add package`:

    $ dotnet add package Pulumi.Nomad

## Configuration

The following configuration points are available:

- `sumologic:accessId` - (Required) This is the Sumo Logic Access ID. It must be provided, but it can also be sourced
  from the `SUMOLOGIC_ACCESSID` environment variable.
- `sumologic:accessKey` - (Required) This is the Sumo Logic Access Key. It must be provided, but it can also be
  sourced from the `SUMOLOGIC_ACCESSKEY` variable.
- `sumologic:accessKey` - (Required) This is the API endpoint to use. See the [Sumo Logic documentation](https://help.sumologic.com/APIs/General_API_Information/Sumo_Logic_Endpoints_and_Firewall_Security) for details on
  which environment you should use. It must be provided, but it can be sourced from the `SUMOLOGIC_ENVIRONMENT` variable.

## Reference

For further information, please visit [the Nomad provider docs](https://www.pulumi.com/docs/intro/cloud-providers/nomad)
or for detailed reference documentation, please visit [the API docs](https://www.pulumi.com/docs/reference/pkg/nomad).
