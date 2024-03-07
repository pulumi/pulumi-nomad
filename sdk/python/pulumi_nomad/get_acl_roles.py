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
    'GetAclRolesResult',
    'AwaitableGetAclRolesResult',
    'get_acl_roles',
    'get_acl_roles_output',
]

@pulumi.output_type
class GetAclRolesResult:
    """
    A collection of values returned by getAclRoles.
    """
    def __init__(__self__, acl_roles=None, id=None, prefix=None):
        if acl_roles and not isinstance(acl_roles, list):
            raise TypeError("Expected argument 'acl_roles' to be a list")
        pulumi.set(__self__, "acl_roles", acl_roles)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if prefix and not isinstance(prefix, str):
            raise TypeError("Expected argument 'prefix' to be a str")
        pulumi.set(__self__, "prefix", prefix)

    @property
    @pulumi.getter(name="aclRoles")
    def acl_roles(self) -> Sequence['outputs.GetAclRolesAclRoleResult']:
        return pulumi.get(self, "acl_roles")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def prefix(self) -> Optional[str]:
        return pulumi.get(self, "prefix")


class AwaitableGetAclRolesResult(GetAclRolesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAclRolesResult(
            acl_roles=self.acl_roles,
            id=self.id,
            prefix=self.prefix)


def get_acl_roles(prefix: Optional[str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAclRolesResult:
    """
    Retrieve a list of ACL Roles.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_nomad as nomad

    example = nomad.get_acl_roles(prefix="a242")
    ```
    <!--End PulumiCodeChooser -->


    :param str prefix: `(string)` An optional string to filter ACL Roles based on ID
           prefix. If not provided, all policies are returned.
    """
    __args__ = dict()
    __args__['prefix'] = prefix
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('nomad:index/getAclRoles:getAclRoles', __args__, opts=opts, typ=GetAclRolesResult).value

    return AwaitableGetAclRolesResult(
        acl_roles=pulumi.get(__ret__, 'acl_roles'),
        id=pulumi.get(__ret__, 'id'),
        prefix=pulumi.get(__ret__, 'prefix'))


@_utilities.lift_output_func(get_acl_roles)
def get_acl_roles_output(prefix: Optional[pulumi.Input[Optional[str]]] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAclRolesResult]:
    """
    Retrieve a list of ACL Roles.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_nomad as nomad

    example = nomad.get_acl_roles(prefix="a242")
    ```
    <!--End PulumiCodeChooser -->


    :param str prefix: `(string)` An optional string to filter ACL Roles based on ID
           prefix. If not provided, all policies are returned.
    """
    ...
