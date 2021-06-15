package examples

import (
	"os"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

func getBaseOptions(t *testing.T) integration.ProgramTestOptions {
	checkNomadToken(t)
	return integration.ProgramTestOptions{
		ExpectRefreshChanges: true,
	}
}

func checkNomadToken(t *testing.T) {
	token := os.Getenv("NOMAD_TOKEN")
	if token == "" {
		t.Skipf("Skipping test due to missing NOMAD_TOKEN environment variable")
	}
}

func getCwd(t *testing.T) string {
	cwd, err := os.Getwd()
	if err != nil {
		t.FailNow()
	}

	return cwd
}
