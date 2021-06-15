#!/bin/bash

set -e

nomad agent -dev -acl-enabled > /tmp/nomad.log 2>&1 &
NOMAD_PID=$!
echo $NOMAD_PID > /tmp/nomad-test.pid

# Give some time for the process to initialize
sleep 10

http --ignore-stdin POST http://localhost:4646/v1/acl/bootstrap | jq -r '.SecretID' > /tmp/nomad-test.token
NOMAD_TOKEN=$(cat /tmp/nomad-test.token)
echo "NOMAD_TOKEN=$(echo $NOMAD_TOKEN)" >> $GITHUB_ENV
