# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['AclTokenArgs', 'AclToken']

@pulumi.input_type
class AclTokenArgs:
    def __init__(__self__, *,
                 type: pulumi.Input[str],
                 global_: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a AclToken resource.
        :param pulumi.Input[str] type: `(string: <required>)` - The type of token this is. Use `client`
               for tokens that will have policies associated with them. Use `management`
               for tokens that can perform any action.
        :param pulumi.Input[bool] global_: `(bool: false)` - Whether the token should be replicated to all
               regions, or if it will only be used in the region it was created in.
        :param pulumi.Input[str] name: `(string: "")` - A human-friendly name for this token.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] policies: `(set: [])` - A set of policy names to associate with this
               token. Must be set on `client`-type tokens, must not be set on
               `management`-type tokens. Policies do not need to exist before being
               used here.
        """
        pulumi.set(__self__, "type", type)
        if global_ is not None:
            pulumi.set(__self__, "global_", global_)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if policies is not None:
            pulumi.set(__self__, "policies", policies)

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


@pulumi.input_type
class _AclTokenState:
    def __init__(__self__, *,
                 accessor_id: Optional[pulumi.Input[str]] = None,
                 create_time: Optional[pulumi.Input[str]] = None,
                 global_: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 secret_id: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AclToken resources.
        :param pulumi.Input[str] accessor_id: `(string)` - A non-sensitive identifier for this token that
               can be logged and shared safely without granting any access to the cluster.
        :param pulumi.Input[str] create_time: `(string)` - The timestamp the token was created.
        :param pulumi.Input[bool] global_: `(bool: false)` - Whether the token should be replicated to all
               regions, or if it will only be used in the region it was created in.
        :param pulumi.Input[str] name: `(string: "")` - A human-friendly name for this token.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] policies: `(set: [])` - A set of policy names to associate with this
               token. Must be set on `client`-type tokens, must not be set on
               `management`-type tokens. Policies do not need to exist before being
               used here.
        :param pulumi.Input[str] secret_id: `(string)` - The token value itself, which is presented for
               access to the cluster.
        :param pulumi.Input[str] type: `(string: <required>)` - The type of token this is. Use `client`
               for tokens that will have policies associated with them. Use `management`
               for tokens that can perform any action.
        """
        if accessor_id is not None:
            pulumi.set(__self__, "accessor_id", accessor_id)
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if global_ is not None:
            pulumi.set(__self__, "global_", global_)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if policies is not None:
            pulumi.set(__self__, "policies", policies)
        if secret_id is not None:
            pulumi.set(__self__, "secret_id", secret_id)
        if type is not None:
            pulumi.set(__self__, "type", type)

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
                 global_: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a AclToken resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] global_: `(bool: false)` - Whether the token should be replicated to all
               regions, or if it will only be used in the region it was created in.
        :param pulumi.Input[str] name: `(string: "")` - A human-friendly name for this token.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] policies: `(set: [])` - A set of policy names to associate with this
               token. Must be set on `client`-type tokens, must not be set on
               `management`-type tokens. Policies do not need to exist before being
               used here.
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
        Create a AclToken resource with the given unique name, props, and options.
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
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 global_: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AclTokenArgs.__new__(AclTokenArgs)

            __props__.__dict__["global_"] = global_
            __props__.__dict__["name"] = name
            __props__.__dict__["policies"] = policies
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            __props__.__dict__["accessor_id"] = None
            __props__.__dict__["create_time"] = None
            __props__.__dict__["secret_id"] = None
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
            global_: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            policies: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
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
        :param pulumi.Input[bool] global_: `(bool: false)` - Whether the token should be replicated to all
               regions, or if it will only be used in the region it was created in.
        :param pulumi.Input[str] name: `(string: "")` - A human-friendly name for this token.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] policies: `(set: [])` - A set of policy names to associate with this
               token. Must be set on `client`-type tokens, must not be set on
               `management`-type tokens. Policies do not need to exist before being
               used here.
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
        __props__.__dict__["global_"] = global_
        __props__.__dict__["name"] = name
        __props__.__dict__["policies"] = policies
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

