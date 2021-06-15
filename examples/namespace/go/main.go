package main

import (
	"github.com/pulumi/pulumi-nomad/sdk/go/nomad"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {

		ns, err := nomad.NewNamespace(ctx, "test-ns-go", nil)
		if err != nil {
			return err
		}

		ctx.Export("namespaceName", ns.Name)

		return nil
	})
}
