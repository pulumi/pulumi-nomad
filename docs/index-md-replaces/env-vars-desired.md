- `ignore_env_vars` `(map[string]bool: {})` - A map of environment variables
  that are ignored by the provider when configuring the Nomad API client.
  Supported keys are: `NOMAD_NAMESPACE` and `NOMAD_REGION`.

The `headers` nested type accepts the following arguments:
* `name` - (Required) The name of the header.
* `value` - (Required) The value of the header.