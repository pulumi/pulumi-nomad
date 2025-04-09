# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
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
    'GetAclRoleResult',
    'AwaitableGetAclRoleResult',
    'get_acl_role',
    'get_acl_role_output',
]

@pulumi.output_type
class GetAclRoleResult:
    """
    A collection of values returned by getAclRole.
    """
    def __init__(__self__, description=None, id=None, name=None, policies=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if policies and not isinstance(policies, list):
            raise TypeError("Expected argument 'policies' to be a list")
        pulumi.set(__self__, "policies", policies)

    @property
    @pulumi.getter
    def description(self) -> builtins.str:
        """
        `(string)` - The description of the ACL Role.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        `(string)` - The ACL Role unique identifier.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> builtins.str:
        """
        `(string)` - Unique name of the ACL role.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def policies(self) -> Sequence['outputs.GetAclRolePolicyResult']:
        """
        `(set)` - The policies applied to the role.
        """
        return pulumi.get(self, "policies")


class AwaitableGetAclRoleResult(GetAclRoleResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAclRoleResult(
            description=self.description,
            id=self.id,
            name=self.name,
            policies=self.policies)


def get_acl_role(id: Optional[builtins.str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAclRoleResult:
    """
    Get information on an ACL Role.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_nomad as nomad

    example = nomad.get_acl_role(id="aa534e09-6a07-0a45-2295-a7f77063d429")
    ```


    :param builtins.str id: `(string)` The unique identifier of the ACL Role.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('nomad:index/getAclRole:getAclRole', __args__, opts=opts, typ=GetAclRoleResult).value

    return AwaitableGetAclRoleResult(
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        policies=pulumi.get(__ret__, 'policies'))
def get_acl_role_output(id: Optional[pulumi.Input[builtins.str]] = None,
                        opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetAclRoleResult]:
    """
    Get information on an ACL Role.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_nomad as nomad

    example = nomad.get_acl_role(id="aa534e09-6a07-0a45-2295-a7f77063d429")
    ```


    :param builtins.str id: `(string)` The unique identifier of the ACL Role.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('nomad:index/getAclRole:getAclRole', __args__, opts=opts, typ=GetAclRoleResult)
    return __ret__.apply(lambda __response__: GetAclRoleResult(
        description=pulumi.get(__response__, 'description'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        policies=pulumi.get(__response__, 'policies')))
