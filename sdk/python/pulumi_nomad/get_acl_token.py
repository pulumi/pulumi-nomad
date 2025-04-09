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
    def __init__(__self__, accessor_id=None, create_time=None, expiration_time=None, expiration_ttl=None, global_=None, id=None, name=None, policies=None, roles=None, secret_id=None, type=None):
        if accessor_id and not isinstance(accessor_id, str):
            raise TypeError("Expected argument 'accessor_id' to be a str")
        pulumi.set(__self__, "accessor_id", accessor_id)
        if create_time and not isinstance(create_time, str):
            raise TypeError("Expected argument 'create_time' to be a str")
        pulumi.set(__self__, "create_time", create_time)
        if expiration_time and not isinstance(expiration_time, str):
            raise TypeError("Expected argument 'expiration_time' to be a str")
        pulumi.set(__self__, "expiration_time", expiration_time)
        if expiration_ttl and not isinstance(expiration_ttl, str):
            raise TypeError("Expected argument 'expiration_ttl' to be a str")
        pulumi.set(__self__, "expiration_ttl", expiration_ttl)
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
        if roles and not isinstance(roles, list):
            raise TypeError("Expected argument 'roles' to be a list")
        pulumi.set(__self__, "roles", roles)
        if secret_id and not isinstance(secret_id, str):
            raise TypeError("Expected argument 'secret_id' to be a str")
        pulumi.set(__self__, "secret_id", secret_id)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="accessorId")
    def accessor_id(self) -> builtins.str:
        """
        `(string)` Non-sensitive identifier for this token.
        """
        return pulumi.get(self, "accessor_id")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> builtins.str:
        """
        `(string)` Date and time the token was created.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="expirationTime")
    def expiration_time(self) -> builtins.str:
        """
        `(string)` - The timestamp after which the token is
        considered expired and eligible for destruction.
        """
        return pulumi.get(self, "expiration_time")

    @property
    @pulumi.getter(name="expirationTtl")
    def expiration_ttl(self) -> builtins.str:
        """
        `(string)` The expiration TTL for the token.
        """
        return pulumi.get(self, "expiration_ttl")

    @property
    @pulumi.getter(name="global")
    def global_(self) -> builtins.bool:
        """
        `(bool)` Whether the token is replicated to all regions, or if it 
        will only be used in the region it was created.
        """
        return pulumi.get(self, "global_")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> builtins.str:
        """
        `(string)` Non-sensitive identifier for this token.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def policies(self) -> Sequence[builtins.str]:
        """
        `(list of strings)` List of policy names associated with this token.
        """
        return pulumi.get(self, "policies")

    @property
    @pulumi.getter
    def roles(self) -> Sequence['outputs.GetAclTokenRoleResult']:
        """
        `(set: [])` - The list of roles attached to the token. Each entry has
        `name` and `id` attributes.
        """
        return pulumi.get(self, "roles")

    @property
    @pulumi.getter(name="secretId")
    def secret_id(self) -> builtins.str:
        """
        `(string)` The token value itself.
        """
        return pulumi.get(self, "secret_id")

    @property
    @pulumi.getter
    def type(self) -> builtins.str:
        """
        `(string)` The type of the token.
        """
        return pulumi.get(self, "type")


class AwaitableGetAclTokenResult(GetAclTokenResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAclTokenResult(
            accessor_id=self.accessor_id,
            create_time=self.create_time,
            expiration_time=self.expiration_time,
            expiration_ttl=self.expiration_ttl,
            global_=self.global_,
            id=self.id,
            name=self.name,
            policies=self.policies,
            roles=self.roles,
            secret_id=self.secret_id,
            type=self.type)


def get_acl_token(accessor_id: Optional[builtins.str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAclTokenResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_nomad as nomad

    my_token = nomad.get_acl_token(accessor_id="aa534e09-6a07-0a45-2295-a7f77063d429")
    ```


    :param builtins.str accessor_id: `(string)` Non-sensitive identifier for this token.
    """
    __args__ = dict()
    __args__['accessorId'] = accessor_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('nomad:index/getAclToken:getAclToken', __args__, opts=opts, typ=GetAclTokenResult).value

    return AwaitableGetAclTokenResult(
        accessor_id=pulumi.get(__ret__, 'accessor_id'),
        create_time=pulumi.get(__ret__, 'create_time'),
        expiration_time=pulumi.get(__ret__, 'expiration_time'),
        expiration_ttl=pulumi.get(__ret__, 'expiration_ttl'),
        global_=pulumi.get(__ret__, 'global_'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        policies=pulumi.get(__ret__, 'policies'),
        roles=pulumi.get(__ret__, 'roles'),
        secret_id=pulumi.get(__ret__, 'secret_id'),
        type=pulumi.get(__ret__, 'type'))
def get_acl_token_output(accessor_id: Optional[pulumi.Input[builtins.str]] = None,
                         opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetAclTokenResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_nomad as nomad

    my_token = nomad.get_acl_token(accessor_id="aa534e09-6a07-0a45-2295-a7f77063d429")
    ```


    :param builtins.str accessor_id: `(string)` Non-sensitive identifier for this token.
    """
    __args__ = dict()
    __args__['accessorId'] = accessor_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('nomad:index/getAclToken:getAclToken', __args__, opts=opts, typ=GetAclTokenResult)
    return __ret__.apply(lambda __response__: GetAclTokenResult(
        accessor_id=pulumi.get(__response__, 'accessor_id'),
        create_time=pulumi.get(__response__, 'create_time'),
        expiration_time=pulumi.get(__response__, 'expiration_time'),
        expiration_ttl=pulumi.get(__response__, 'expiration_ttl'),
        global_=pulumi.get(__response__, 'global_'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        policies=pulumi.get(__response__, 'policies'),
        roles=pulumi.get(__response__, 'roles'),
        secret_id=pulumi.get(__response__, 'secret_id'),
        type=pulumi.get(__response__, 'type')))
