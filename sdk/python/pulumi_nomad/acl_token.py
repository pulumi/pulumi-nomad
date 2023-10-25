# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['AclTokenArgs', 'AclToken']

@pulumi.input_type
class AclTokenArgs:
    def __init__(__self__, *,
                 type: pulumi.Input[str],
                 expiration_ttl: Optional[pulumi.Input[str]] = None,
                 global_: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input['AclTokenRoleArgs']]]] = None):
        """
        The set of arguments for constructing a AclToken resource.
        :param pulumi.Input[str] type: `(string: <required>)` - The type of token this is. Use `client`
               for tokens that will have policies associated with them. Use `management`
               for tokens that can perform any action.
        :param pulumi.Input[str] expiration_ttl: `(string: "")` - Provides a TTL for the token in the form of
               a time duration such as `"5m"` or `"1h"`.
               
               In addition to the above arguments, the following attributes are exported and
               can be referenced:
        :param pulumi.Input[bool] global_: `(bool: false)` - Whether the token should be replicated to all
               regions, or if it will only be used in the region it was created in.
        :param pulumi.Input[str] name: `(string: "")` - A human-friendly name for this token.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] policies: `(set: [])` - A set of policy names to associate with this
               token. Must be set on `client`-type tokens, must not be set on
               `management`-type tokens. Policies do not need to exist before being
               used here.
        :param pulumi.Input[Sequence[pulumi.Input['AclTokenRoleArgs']]] roles: `(set: [])` - The list of roles attached to the token. Each entry has
               `name` and `id` attributes. It may be used multiple times.
        """
        AclTokenArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            type=type,
            expiration_ttl=expiration_ttl,
            global_=global_,
            name=name,
            policies=policies,
            roles=roles,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             type: Optional[pulumi.Input[str]] = None,
             expiration_ttl: Optional[pulumi.Input[str]] = None,
             global_: Optional[pulumi.Input[bool]] = None,
             name: Optional[pulumi.Input[str]] = None,
             policies: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             roles: Optional[pulumi.Input[Sequence[pulumi.Input['AclTokenRoleArgs']]]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if type is None:
            raise TypeError("Missing 'type' argument")
        if expiration_ttl is None and 'expirationTtl' in kwargs:
            expiration_ttl = kwargs['expirationTtl']
        if global_ is None and 'global' in kwargs:
            global_ = kwargs['global']

        _setter("type", type)
        if expiration_ttl is not None:
            _setter("expiration_ttl", expiration_ttl)
        if global_ is not None:
            _setter("global_", global_)
        if name is not None:
            _setter("name", name)
        if policies is not None:
            _setter("policies", policies)
        if roles is not None:
            _setter("roles", roles)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        `(string: <required>)` - The type of token this is. Use `client`
        for tokens that will have policies associated with them. Use `management`
        for tokens that can perform any action.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="expirationTtl")
    def expiration_ttl(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: "")` - Provides a TTL for the token in the form of
        a time duration such as `"5m"` or `"1h"`.

        In addition to the above arguments, the following attributes are exported and
        can be referenced:
        """
        return pulumi.get(self, "expiration_ttl")

    @expiration_ttl.setter
    def expiration_ttl(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "expiration_ttl", value)

    @property
    @pulumi.getter(name="global")
    def global_(self) -> Optional[pulumi.Input[bool]]:
        """
        `(bool: false)` - Whether the token should be replicated to all
        regions, or if it will only be used in the region it was created in.
        """
        return pulumi.get(self, "global_")

    @global_.setter
    def global_(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "global_", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: "")` - A human-friendly name for this token.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def policies(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        `(set: [])` - A set of policy names to associate with this
        token. Must be set on `client`-type tokens, must not be set on
        `management`-type tokens. Policies do not need to exist before being
        used here.
        """
        return pulumi.get(self, "policies")

    @policies.setter
    def policies(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "policies", value)

    @property
    @pulumi.getter
    def roles(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AclTokenRoleArgs']]]]:
        """
        `(set: [])` - The list of roles attached to the token. Each entry has
        `name` and `id` attributes. It may be used multiple times.
        """
        return pulumi.get(self, "roles")

    @roles.setter
    def roles(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AclTokenRoleArgs']]]]):
        pulumi.set(self, "roles", value)


@pulumi.input_type
class _AclTokenState:
    def __init__(__self__, *,
                 accessor_id: Optional[pulumi.Input[str]] = None,
                 create_time: Optional[pulumi.Input[str]] = None,
                 expiration_time: Optional[pulumi.Input[str]] = None,
                 expiration_ttl: Optional[pulumi.Input[str]] = None,
                 global_: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input['AclTokenRoleArgs']]]] = None,
                 secret_id: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AclToken resources.
        :param pulumi.Input[str] accessor_id: `(string)` - A non-sensitive identifier for this token that
               can be logged and shared safely without granting any access to the cluster.
        :param pulumi.Input[str] create_time: `(string)` - The timestamp the token was created.
        :param pulumi.Input[str] expiration_time: `(string)` - The timestamp after which the token is
               considered expired and eligible for destruction.
        :param pulumi.Input[str] expiration_ttl: `(string: "")` - Provides a TTL for the token in the form of
               a time duration such as `"5m"` or `"1h"`.
               
               In addition to the above arguments, the following attributes are exported and
               can be referenced:
        :param pulumi.Input[bool] global_: `(bool: false)` - Whether the token should be replicated to all
               regions, or if it will only be used in the region it was created in.
        :param pulumi.Input[str] name: `(string: "")` - A human-friendly name for this token.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] policies: `(set: [])` - A set of policy names to associate with this
               token. Must be set on `client`-type tokens, must not be set on
               `management`-type tokens. Policies do not need to exist before being
               used here.
        :param pulumi.Input[Sequence[pulumi.Input['AclTokenRoleArgs']]] roles: `(set: [])` - The list of roles attached to the token. Each entry has
               `name` and `id` attributes. It may be used multiple times.
        :param pulumi.Input[str] secret_id: `(string)` - The token value itself, which is presented for
               access to the cluster.
        :param pulumi.Input[str] type: `(string: <required>)` - The type of token this is. Use `client`
               for tokens that will have policies associated with them. Use `management`
               for tokens that can perform any action.
        """
        _AclTokenState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            accessor_id=accessor_id,
            create_time=create_time,
            expiration_time=expiration_time,
            expiration_ttl=expiration_ttl,
            global_=global_,
            name=name,
            policies=policies,
            roles=roles,
            secret_id=secret_id,
            type=type,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             accessor_id: Optional[pulumi.Input[str]] = None,
             create_time: Optional[pulumi.Input[str]] = None,
             expiration_time: Optional[pulumi.Input[str]] = None,
             expiration_ttl: Optional[pulumi.Input[str]] = None,
             global_: Optional[pulumi.Input[bool]] = None,
             name: Optional[pulumi.Input[str]] = None,
             policies: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             roles: Optional[pulumi.Input[Sequence[pulumi.Input['AclTokenRoleArgs']]]] = None,
             secret_id: Optional[pulumi.Input[str]] = None,
             type: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if accessor_id is None and 'accessorId' in kwargs:
            accessor_id = kwargs['accessorId']
        if create_time is None and 'createTime' in kwargs:
            create_time = kwargs['createTime']
        if expiration_time is None and 'expirationTime' in kwargs:
            expiration_time = kwargs['expirationTime']
        if expiration_ttl is None and 'expirationTtl' in kwargs:
            expiration_ttl = kwargs['expirationTtl']
        if global_ is None and 'global' in kwargs:
            global_ = kwargs['global']
        if secret_id is None and 'secretId' in kwargs:
            secret_id = kwargs['secretId']

        if accessor_id is not None:
            _setter("accessor_id", accessor_id)
        if create_time is not None:
            _setter("create_time", create_time)
        if expiration_time is not None:
            _setter("expiration_time", expiration_time)
        if expiration_ttl is not None:
            _setter("expiration_ttl", expiration_ttl)
        if global_ is not None:
            _setter("global_", global_)
        if name is not None:
            _setter("name", name)
        if policies is not None:
            _setter("policies", policies)
        if roles is not None:
            _setter("roles", roles)
        if secret_id is not None:
            _setter("secret_id", secret_id)
        if type is not None:
            _setter("type", type)

    @property
    @pulumi.getter(name="accessorId")
    def accessor_id(self) -> Optional[pulumi.Input[str]]:
        """
        `(string)` - A non-sensitive identifier for this token that
        can be logged and shared safely without granting any access to the cluster.
        """
        return pulumi.get(self, "accessor_id")

    @accessor_id.setter
    def accessor_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "accessor_id", value)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[str]]:
        """
        `(string)` - The timestamp the token was created.
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "create_time", value)

    @property
    @pulumi.getter(name="expirationTime")
    def expiration_time(self) -> Optional[pulumi.Input[str]]:
        """
        `(string)` - The timestamp after which the token is
        considered expired and eligible for destruction.
        """
        return pulumi.get(self, "expiration_time")

    @expiration_time.setter
    def expiration_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "expiration_time", value)

    @property
    @pulumi.getter(name="expirationTtl")
    def expiration_ttl(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: "")` - Provides a TTL for the token in the form of
        a time duration such as `"5m"` or `"1h"`.

        In addition to the above arguments, the following attributes are exported and
        can be referenced:
        """
        return pulumi.get(self, "expiration_ttl")

    @expiration_ttl.setter
    def expiration_ttl(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "expiration_ttl", value)

    @property
    @pulumi.getter(name="global")
    def global_(self) -> Optional[pulumi.Input[bool]]:
        """
        `(bool: false)` - Whether the token should be replicated to all
        regions, or if it will only be used in the region it was created in.
        """
        return pulumi.get(self, "global_")

    @global_.setter
    def global_(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "global_", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: "")` - A human-friendly name for this token.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def policies(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        `(set: [])` - A set of policy names to associate with this
        token. Must be set on `client`-type tokens, must not be set on
        `management`-type tokens. Policies do not need to exist before being
        used here.
        """
        return pulumi.get(self, "policies")

    @policies.setter
    def policies(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "policies", value)

    @property
    @pulumi.getter
    def roles(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AclTokenRoleArgs']]]]:
        """
        `(set: [])` - The list of roles attached to the token. Each entry has
        `name` and `id` attributes. It may be used multiple times.
        """
        return pulumi.get(self, "roles")

    @roles.setter
    def roles(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AclTokenRoleArgs']]]]):
        pulumi.set(self, "roles", value)

    @property
    @pulumi.getter(name="secretId")
    def secret_id(self) -> Optional[pulumi.Input[str]]:
        """
        `(string)` - The token value itself, which is presented for
        access to the cluster.
        """
        return pulumi.get(self, "secret_id")

    @secret_id.setter
    def secret_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret_id", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: <required>)` - The type of token this is. Use `client`
        for tokens that will have policies associated with them. Use `management`
        for tokens that can perform any action.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class AclToken(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 expiration_ttl: Optional[pulumi.Input[str]] = None,
                 global_: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AclTokenRoleArgs']]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        Creating a token with limited policies:

        ```python
        import pulumi
        import pulumi_nomad as nomad

        dakota = nomad.AclToken("dakota",
            policies=[
                "dev",
                "qa",
            ],
            type="client")
        ```

        Creating a global token that will be replicated to all regions:

        ```python
        import pulumi
        import pulumi_nomad as nomad

        dakota = nomad.AclToken("dakota",
            global_=True,
            policies=[
                "dev",
                "qa",
            ],
            type="client")
        ```

        Creating a token with full access to the cluster:

        ```python
        import pulumi
        import pulumi_nomad as nomad

        iman = nomad.AclToken("iman", type="management")
        ```

        Accessing the token:

        ```python
        import pulumi
        import pulumi_nomad as nomad

        token = nomad.AclToken("token",
            type="client",
            policies=["dev"])
        pulumi.export("nomadToken", token.secret_id)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] expiration_ttl: `(string: "")` - Provides a TTL for the token in the form of
               a time duration such as `"5m"` or `"1h"`.
               
               In addition to the above arguments, the following attributes are exported and
               can be referenced:
        :param pulumi.Input[bool] global_: `(bool: false)` - Whether the token should be replicated to all
               regions, or if it will only be used in the region it was created in.
        :param pulumi.Input[str] name: `(string: "")` - A human-friendly name for this token.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] policies: `(set: [])` - A set of policy names to associate with this
               token. Must be set on `client`-type tokens, must not be set on
               `management`-type tokens. Policies do not need to exist before being
               used here.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AclTokenRoleArgs']]]] roles: `(set: [])` - The list of roles attached to the token. Each entry has
               `name` and `id` attributes. It may be used multiple times.
        :param pulumi.Input[str] type: `(string: <required>)` - The type of token this is. Use `client`
               for tokens that will have policies associated with them. Use `management`
               for tokens that can perform any action.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AclTokenArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        Creating a token with limited policies:

        ```python
        import pulumi
        import pulumi_nomad as nomad

        dakota = nomad.AclToken("dakota",
            policies=[
                "dev",
                "qa",
            ],
            type="client")
        ```

        Creating a global token that will be replicated to all regions:

        ```python
        import pulumi
        import pulumi_nomad as nomad

        dakota = nomad.AclToken("dakota",
            global_=True,
            policies=[
                "dev",
                "qa",
            ],
            type="client")
        ```

        Creating a token with full access to the cluster:

        ```python
        import pulumi
        import pulumi_nomad as nomad

        iman = nomad.AclToken("iman", type="management")
        ```

        Accessing the token:

        ```python
        import pulumi
        import pulumi_nomad as nomad

        token = nomad.AclToken("token",
            type="client",
            policies=["dev"])
        pulumi.export("nomadToken", token.secret_id)
        ```

        :param str resource_name: The name of the resource.
        :param AclTokenArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AclTokenArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            AclTokenArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 expiration_ttl: Optional[pulumi.Input[str]] = None,
                 global_: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AclTokenRoleArgs']]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AclTokenArgs.__new__(AclTokenArgs)

            __props__.__dict__["expiration_ttl"] = expiration_ttl
            __props__.__dict__["global_"] = global_
            __props__.__dict__["name"] = name
            __props__.__dict__["policies"] = policies
            __props__.__dict__["roles"] = roles
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            __props__.__dict__["accessor_id"] = None
            __props__.__dict__["create_time"] = None
            __props__.__dict__["expiration_time"] = None
            __props__.__dict__["secret_id"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["secretId"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(AclToken, __self__).__init__(
            'nomad:index/aclToken:AclToken',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            accessor_id: Optional[pulumi.Input[str]] = None,
            create_time: Optional[pulumi.Input[str]] = None,
            expiration_time: Optional[pulumi.Input[str]] = None,
            expiration_ttl: Optional[pulumi.Input[str]] = None,
            global_: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            policies: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            roles: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AclTokenRoleArgs']]]]] = None,
            secret_id: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'AclToken':
        """
        Get an existing AclToken resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] accessor_id: `(string)` - A non-sensitive identifier for this token that
               can be logged and shared safely without granting any access to the cluster.
        :param pulumi.Input[str] create_time: `(string)` - The timestamp the token was created.
        :param pulumi.Input[str] expiration_time: `(string)` - The timestamp after which the token is
               considered expired and eligible for destruction.
        :param pulumi.Input[str] expiration_ttl: `(string: "")` - Provides a TTL for the token in the form of
               a time duration such as `"5m"` or `"1h"`.
               
               In addition to the above arguments, the following attributes are exported and
               can be referenced:
        :param pulumi.Input[bool] global_: `(bool: false)` - Whether the token should be replicated to all
               regions, or if it will only be used in the region it was created in.
        :param pulumi.Input[str] name: `(string: "")` - A human-friendly name for this token.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] policies: `(set: [])` - A set of policy names to associate with this
               token. Must be set on `client`-type tokens, must not be set on
               `management`-type tokens. Policies do not need to exist before being
               used here.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AclTokenRoleArgs']]]] roles: `(set: [])` - The list of roles attached to the token. Each entry has
               `name` and `id` attributes. It may be used multiple times.
        :param pulumi.Input[str] secret_id: `(string)` - The token value itself, which is presented for
               access to the cluster.
        :param pulumi.Input[str] type: `(string: <required>)` - The type of token this is. Use `client`
               for tokens that will have policies associated with them. Use `management`
               for tokens that can perform any action.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AclTokenState.__new__(_AclTokenState)

        __props__.__dict__["accessor_id"] = accessor_id
        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["expiration_time"] = expiration_time
        __props__.__dict__["expiration_ttl"] = expiration_ttl
        __props__.__dict__["global_"] = global_
        __props__.__dict__["name"] = name
        __props__.__dict__["policies"] = policies
        __props__.__dict__["roles"] = roles
        __props__.__dict__["secret_id"] = secret_id
        __props__.__dict__["type"] = type
        return AclToken(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accessorId")
    def accessor_id(self) -> pulumi.Output[str]:
        """
        `(string)` - A non-sensitive identifier for this token that
        can be logged and shared safely without granting any access to the cluster.
        """
        return pulumi.get(self, "accessor_id")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        `(string)` - The timestamp the token was created.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="expirationTime")
    def expiration_time(self) -> pulumi.Output[str]:
        """
        `(string)` - The timestamp after which the token is
        considered expired and eligible for destruction.
        """
        return pulumi.get(self, "expiration_time")

    @property
    @pulumi.getter(name="expirationTtl")
    def expiration_ttl(self) -> pulumi.Output[Optional[str]]:
        """
        `(string: "")` - Provides a TTL for the token in the form of
        a time duration such as `"5m"` or `"1h"`.

        In addition to the above arguments, the following attributes are exported and
        can be referenced:
        """
        return pulumi.get(self, "expiration_ttl")

    @property
    @pulumi.getter(name="global")
    def global_(self) -> pulumi.Output[Optional[bool]]:
        """
        `(bool: false)` - Whether the token should be replicated to all
        regions, or if it will only be used in the region it was created in.
        """
        return pulumi.get(self, "global_")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        `(string: "")` - A human-friendly name for this token.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def policies(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        `(set: [])` - A set of policy names to associate with this
        token. Must be set on `client`-type tokens, must not be set on
        `management`-type tokens. Policies do not need to exist before being
        used here.
        """
        return pulumi.get(self, "policies")

    @property
    @pulumi.getter
    def roles(self) -> pulumi.Output[Optional[Sequence['outputs.AclTokenRole']]]:
        """
        `(set: [])` - The list of roles attached to the token. Each entry has
        `name` and `id` attributes. It may be used multiple times.
        """
        return pulumi.get(self, "roles")

    @property
    @pulumi.getter(name="secretId")
    def secret_id(self) -> pulumi.Output[str]:
        """
        `(string)` - The token value itself, which is presented for
        access to the cluster.
        """
        return pulumi.get(self, "secret_id")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        `(string: <required>)` - The type of token this is. Use `client`
        for tokens that will have policies associated with them. Use `management`
        for tokens that can perform any action.
        """
        return pulumi.get(self, "type")

