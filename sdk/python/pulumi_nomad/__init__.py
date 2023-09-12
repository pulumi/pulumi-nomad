# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

from . import _utilities
import typing
# Export this package's modules as members:
from .acl_auth_method import *
from .acl_binding_rule import *
from .acl_policy import *
from .acl_role import *
from .acl_token import *
from .csi_volume import *
from .csi_volume_registration import *
from .external_volume import *
from .get_acl_policies import *
from .get_acl_policy import *
from .get_acl_role import *
from .get_acl_roles import *
from .get_acl_token import *
from .get_acl_tokens import *
from .get_allocations import *
from .get_datacenters import *
from .get_deployments import *
from .get_job import *
from .get_job_parser import *
from .get_namespace import *
from .get_namespaces import *
from .get_node_pool import *
from .get_node_pools import *
from .get_plugin import *
from .get_plugins import *
from .get_regions import *
from .get_scaling_policies import *
from .get_scaling_policy import *
from .get_scheduler_policy import *
from .get_variable import *
from .get_volumes import *
from .job import *
from .namespace import *
from .node_pool import *
from .provider import *
from .quote_specification import *
from .scheduler_config import *
from .sentinel_policy import *
from .variable import *
from .volume import *
from ._inputs import *
from . import outputs

# Make subpackages available:
if typing.TYPE_CHECKING:
    import pulumi_nomad.config as __config
    config = __config
else:
    config = _utilities.lazy_import('pulumi_nomad.config')

_utilities.register(
    resource_modules="""
[
 {
  "pkg": "nomad",
  "mod": "index/aclAuthMethod",
  "fqn": "pulumi_nomad",
  "classes": {
   "nomad:index/aclAuthMethod:AclAuthMethod": "AclAuthMethod"
  }
 },
 {
  "pkg": "nomad",
  "mod": "index/aclBindingRule",
  "fqn": "pulumi_nomad",
  "classes": {
   "nomad:index/aclBindingRule:AclBindingRule": "AclBindingRule"
  }
 },
 {
  "pkg": "nomad",
  "mod": "index/aclPolicy",
  "fqn": "pulumi_nomad",
  "classes": {
   "nomad:index/aclPolicy:AclPolicy": "AclPolicy"
  }
 },
 {
  "pkg": "nomad",
  "mod": "index/aclRole",
  "fqn": "pulumi_nomad",
  "classes": {
   "nomad:index/aclRole:AclRole": "AclRole"
  }
 },
 {
  "pkg": "nomad",
  "mod": "index/aclToken",
  "fqn": "pulumi_nomad",
  "classes": {
   "nomad:index/aclToken:AclToken": "AclToken"
  }
 },
 {
  "pkg": "nomad",
  "mod": "index/csiVolume",
  "fqn": "pulumi_nomad",
  "classes": {
   "nomad:index/csiVolume:CsiVolume": "CsiVolume"
  }
 },
 {
  "pkg": "nomad",
  "mod": "index/csiVolumeRegistration",
  "fqn": "pulumi_nomad",
  "classes": {
   "nomad:index/csiVolumeRegistration:CsiVolumeRegistration": "CsiVolumeRegistration"
  }
 },
 {
  "pkg": "nomad",
  "mod": "index/externalVolume",
  "fqn": "pulumi_nomad",
  "classes": {
   "nomad:index/externalVolume:ExternalVolume": "ExternalVolume"
  }
 },
 {
  "pkg": "nomad",
  "mod": "index/job",
  "fqn": "pulumi_nomad",
  "classes": {
   "nomad:index/job:Job": "Job"
  }
 },
 {
  "pkg": "nomad",
  "mod": "index/namespace",
  "fqn": "pulumi_nomad",
  "classes": {
   "nomad:index/namespace:Namespace": "Namespace"
  }
 },
 {
  "pkg": "nomad",
  "mod": "index/nodePool",
  "fqn": "pulumi_nomad",
  "classes": {
   "nomad:index/nodePool:NodePool": "NodePool"
  }
 },
 {
  "pkg": "nomad",
  "mod": "index/quoteSpecification",
  "fqn": "pulumi_nomad",
  "classes": {
   "nomad:index/quoteSpecification:QuoteSpecification": "QuoteSpecification"
  }
 },
 {
  "pkg": "nomad",
  "mod": "index/schedulerConfig",
  "fqn": "pulumi_nomad",
  "classes": {
   "nomad:index/schedulerConfig:SchedulerConfig": "SchedulerConfig"
  }
 },
 {
  "pkg": "nomad",
  "mod": "index/sentinelPolicy",
  "fqn": "pulumi_nomad",
  "classes": {
   "nomad:index/sentinelPolicy:SentinelPolicy": "SentinelPolicy"
  }
 },
 {
  "pkg": "nomad",
  "mod": "index/variable",
  "fqn": "pulumi_nomad",
  "classes": {
   "nomad:index/variable:Variable": "Variable"
  }
 },
 {
  "pkg": "nomad",
  "mod": "index/volume",
  "fqn": "pulumi_nomad",
  "classes": {
   "nomad:index/volume:Volume": "Volume"
  }
 }
]
""",
    resource_packages="""
[
 {
  "pkg": "nomad",
  "token": "pulumi:providers:nomad",
  "fqn": "pulumi_nomad",
  "class": "Provider"
 }
]
"""
)
