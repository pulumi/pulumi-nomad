"""A Python Pulumi program"""

import pulumi
import pulumi_nomad as nomad

ns = nomad.Namespace("test-ns-py")

pulumi.export("ns_name", ns.name)
