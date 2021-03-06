# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetAclTokenResult',
    'AwaitableGetAclTokenResult',
    'get_acl_token',
    'get_acl_token_output',
]

@pulumi.output_type
class GetAclTokenResult:
    """
    A collection of values returned by getAclToken.
    """
    def __init__(__self__, accessor_id=None, create_time=None, global_=None, id=None, name=None, policies=None, secret_id=None, type=None):
        if accessor_id and not isinstance(accessor_id, str):
            raise TypeError("Expected argument 'accessor_id' to be a str")
        pulumi.set(__self__, "accessor_id", accessor_id)
        if create_time and not isinstance(create_time, str):
            raise TypeError("Expected argument 'create_time' to be a str")
        pulumi.set(__self__, "create_time", create_time)
        if global_ and not isinstance(global_, bool):
            raise TypeError("Expected argument 'global_' to be a bool")
        pulumi.set(__self__, "global_", global_)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if policies and not isinstance(policies, list):
            raise TypeError("Expected argument 'policies' to be a list")
        pulumi.set(__self__, "policies", policies)
        if secret_id and not isinstance(secret_id, str):
            raise TypeError("Expected argument 'secret_id' to be a str")
        pulumi.set(__self__, "secret_id", secret_id)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="accessorId")
    def accessor_id(self) -> str:
        return pulumi.get(self, "accessor_id")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> str:
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="global")
    def global_(self) -> bool:
        return pulumi.get(self, "global_")

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
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def policies(self) -> Sequence[str]:
        return pulumi.get(self, "policies")

    @property
    @pulumi.getter(name="secretId")
    def secret_id(self) -> str:
        return pulumi.get(self, "secret_id")

    @property
    @pulumi.getter
    def type(self) -> str:
        return pulumi.get(self, "type")


class AwaitableGetAclTokenResult(GetAclTokenResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAclTokenResult(
            accessor_id=self.accessor_id,
            create_time=self.create_time,
            global_=self.global_,
            id=self.id,
            name=self.name,
            policies=self.policies,
            secret_id=self.secret_id,
            type=self.type)


def get_acl_token(accessor_id: Optional[str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAclTokenResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_nomad as nomad

    my_token = nomad.get_acl_token(accessor_id="aa534e09-6a07-0a45-2295-a7f77063d429")
    ```
    """
    __args__ = dict()
    __args__['accessorId'] = accessor_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('nomad:index/getAclToken:getAclToken', __args__, opts=opts, typ=GetAclTokenResult).value

    return AwaitableGetAclTokenResult(
        accessor_id=__ret__.accessor_id,
        create_time=__ret__.create_time,
        global_=__ret__.global_,
        id=__ret__.id,
        name=__ret__.name,
        policies=__ret__.policies,
        secret_id=__ret__.secret_id,
        type=__ret__.type)


@_utilities.lift_output_func(get_acl_token)
def get_acl_token_output(accessor_id: Optional[pulumi.Input[str]] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAclTokenResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_nomad as nomad

    my_token = nomad.get_acl_token(accessor_id="aa534e09-6a07-0a45-2295-a7f77063d429")
    ```
    """
    ...
