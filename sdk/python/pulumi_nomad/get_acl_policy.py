# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetAclPolicyResult',
    'AwaitableGetAclPolicyResult',
    'get_acl_policy',
    'get_acl_policy_output',
]

@pulumi.output_type
class GetAclPolicyResult:
    """
    A collection of values returned by getAclPolicy.
    """
    def __init__(__self__, description=None, id=None, name=None, rules=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if rules and not isinstance(rules, str):
            raise TypeError("Expected argument 'rules' to be a str")
        pulumi.set(__self__, "rules", rules)

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        `(string)` - the description of the ACL Policy.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        `(string)` - the name of the ACL Policy.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def rules(self) -> str:
        """
        `(string)` - the ACL Policy rules in HCL format.
        """
        return pulumi.get(self, "rules")


class AwaitableGetAclPolicyResult(GetAclPolicyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAclPolicyResult(
            description=self.description,
            id=self.id,
            name=self.name,
            rules=self.rules)


def get_acl_policy(name: Optional[str] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAclPolicyResult:
    """
    Retrieve information on an ACL Policy.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_nomad as nomad

    my_policy = nomad.get_acl_policy(name="my-policy")
    ```


    :param str name: `(string)` - the name of the ACL Policy.
    """
    __args__ = dict()
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('nomad:index/getAclPolicy:getAclPolicy', __args__, opts=opts, typ=GetAclPolicyResult).value

    return AwaitableGetAclPolicyResult(
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        rules=pulumi.get(__ret__, 'rules'))


@_utilities.lift_output_func(get_acl_policy)
def get_acl_policy_output(name: Optional[pulumi.Input[str]] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAclPolicyResult]:
    """
    Retrieve information on an ACL Policy.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_nomad as nomad

    my_policy = nomad.get_acl_policy(name="my-policy")
    ```


    :param str name: `(string)` - the name of the ACL Policy.
    """
    ...
