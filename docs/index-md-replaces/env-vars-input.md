- `ignore_env_vars` `(map[string]bool: {})` - A map of environment variables
  that are ignored by the provider when configuring the Nomad API client.
  Supported keys are: `NOMAD_NAMESPACE` and `NOMAD_REGION`. When using the
  provider within Terraform Cloud, the default value is set to
    ```
    {
      NOMAD_NAMESPACE: true,
      NOMAD_REGION:    true,
    }
    ```.
  Set these values to `false` if you need to load these environment variables.

- `auth_jwt` `(block)` - Authenticates to Nomad using a JWT authentication method, described below.
  This block can only be specified one time.

The `headers` configuration block accepts the following arguments:
* `name` - (Required) The name of the header.
* `value` - (Required) The value of the header.

An example using the `headers` configuration block with repeated blocks and
headers:
```hcl
provider "nomad" {
  headers {
    name = "Test-Header-1"
    value = "a"
  }
  headers {
    name = "Test-header-1"
    value = "b"
  }
  headers {
    name = "test-header-2"
    value = "c"
  }
}
```