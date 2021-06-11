module github.com/pulumi/pulumi-nomad/provider

go 1.16

replace github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0

require (
	github.com/hashicorp/terraform-plugin-sdk v1.17.2
	github.com/hashicorp/terraform-provider-nomad v1.4.15
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.2.1
	github.com/pulumi/pulumi/sdk/v3 v3.4.0
)
