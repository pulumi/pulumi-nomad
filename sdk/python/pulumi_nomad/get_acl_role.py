# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
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
    def description(self) -> str:
        """
        `(string)` - The description of the ACL Role.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        `(string)` - The ACL Role unique identifier.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
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


def get_acl_role(id: Optional[str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAclRoleResult:
    """
    layout: "nomad"
    page_title: "Nomad: AclRole"
    sidebar_current: "docs-nomad-datasource-acl-role"
    description: |-
    Get information on an ACL Role.
    <!-- yaml: line 6: could not find expected ':' -->

    # AclRole

    Get information on an ACL Role.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_nomad as nomad

    example = nomad.get_acl_role(id="aa534e09-6a07-0a45-2295-a7f77063d429")
    ```


    :param str id: `(string)` The unique identifier of the ACL Role.
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


@_utilities.lift_output_func(get_acl_role)
def get_acl_role_output(id: Optional[pulumi.Input[str]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAclRoleResult]:
    """
    layout: "nomad"
    page_title: "Nomad: AclRole"
    sidebar_current: "docs-nomad-datasource-acl-role"
    description: |-
    Get information on an ACL Role.
    <!-- yaml: line 6: could not find expected ':' -->

    # AclRole

    Get information on an ACL Role.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_nomad as nomad

    example = nomad.get_acl_role(id="aa534e09-6a07-0a45-2295-a7f77063d429")
    ```


    :param str id: `(string)` The unique identifier of the ACL Role.
    """
    ...
