# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities
from . import outputs

__all__ = [
    'GetAclPoliciesResult',
    'AwaitableGetAclPoliciesResult',
    'get_acl_policies',
    'get_acl_policies_output',
]

@pulumi.output_type
class GetAclPoliciesResult:
    """
    A collection of values returned by getAclPolicies.
    """
    def __init__(__self__, id=None, policies=None, prefix=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if policies and not isinstance(policies, list):
            raise TypeError("Expected argument 'policies' to be a list")
        pulumi.set(__self__, "policies", policies)
        if prefix and not isinstance(prefix, str):
            raise TypeError("Expected argument 'prefix' to be a str")
        pulumi.set(__self__, "prefix", prefix)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def policies(self) -> Sequence['outputs.GetAclPoliciesPolicyResult']:
        """
        `list of maps` a list of ACL policies.
        """
        return pulumi.get(self, "policies")

    @property
    @pulumi.getter
    def prefix(self) -> Optional[str]:
        return pulumi.get(self, "prefix")


class AwaitableGetAclPoliciesResult(GetAclPoliciesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAclPoliciesResult(
            id=self.id,
            policies=self.policies,
            prefix=self.prefix)


def get_acl_policies(prefix: Optional[str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAclPoliciesResult:
    """
    Retrieve a list of ACL Policies.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_nomad as nomad

    example = nomad.get_acl_policies(prefix="prod")
    ```


    :param str prefix: `(string)` An optional string to filter ACL policies based on name prefix. If not provided, all policies are returned.
    """
    __args__ = dict()
    __args__['prefix'] = prefix
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('nomad:index/getAclPolicies:getAclPolicies', __args__, opts=opts, typ=GetAclPoliciesResult).value

    return AwaitableGetAclPoliciesResult(
        id=pulumi.get(__ret__, 'id'),
        policies=pulumi.get(__ret__, 'policies'),
        prefix=pulumi.get(__ret__, 'prefix'))
def get_acl_policies_output(prefix: Optional[pulumi.Input[Optional[str]]] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAclPoliciesResult]:
    """
    Retrieve a list of ACL Policies.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_nomad as nomad

    example = nomad.get_acl_policies(prefix="prod")
    ```


    :param str prefix: `(string)` An optional string to filter ACL policies based on name prefix. If not provided, all policies are returned.
    """
    __args__ = dict()
    __args__['prefix'] = prefix
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('nomad:index/getAclPolicies:getAclPolicies', __args__, opts=opts, typ=GetAclPoliciesResult)
    return __ret__.apply(lambda __response__: GetAclPoliciesResult(
        id=pulumi.get(__response__, 'id'),
        policies=pulumi.get(__response__, 'policies'),
        prefix=pulumi.get(__response__, 'prefix')))
