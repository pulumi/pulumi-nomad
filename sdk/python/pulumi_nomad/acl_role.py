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

__all__ = ['AclRoleArgs', 'AclRole']

@pulumi.input_type
class AclRoleArgs:
    def __init__(__self__, *,
                 policies: pulumi.Input[Sequence[pulumi.Input['AclRolePolicyArgs']]],
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AclRole resource.
        :param pulumi.Input[Sequence[pulumi.Input['AclRolePolicyArgs']]] policies: `(set: <required>)` - A set of policy names to associate with this
               ACL Role. It may be used multiple times.
        :param pulumi.Input[str] description: `(string: "")` - A description of the ACL Role.
        :param pulumi.Input[str] name: `(string: <required>)` - A human-friendly name for this ACL Role.
        """
        AclRoleArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            policies=policies,
            description=description,
            name=name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             policies: pulumi.Input[Sequence[pulumi.Input['AclRolePolicyArgs']]],
             description: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("policies", policies)
        if description is not None:
            _setter("description", description)
        if name is not None:
            _setter("name", name)

    @property
    @pulumi.getter
    def policies(self) -> pulumi.Input[Sequence[pulumi.Input['AclRolePolicyArgs']]]:
        """
        `(set: <required>)` - A set of policy names to associate with this
        ACL Role. It may be used multiple times.
        """
        return pulumi.get(self, "policies")

    @policies.setter
    def policies(self, value: pulumi.Input[Sequence[pulumi.Input['AclRolePolicyArgs']]]):
        pulumi.set(self, "policies", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: "")` - A description of the ACL Role.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: <required>)` - A human-friendly name for this ACL Role.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _AclRoleState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input['AclRolePolicyArgs']]]] = None):
        """
        Input properties used for looking up and filtering AclRole resources.
        :param pulumi.Input[str] description: `(string: "")` - A description of the ACL Role.
        :param pulumi.Input[str] name: `(string: <required>)` - A human-friendly name for this ACL Role.
        :param pulumi.Input[Sequence[pulumi.Input['AclRolePolicyArgs']]] policies: `(set: <required>)` - A set of policy names to associate with this
               ACL Role. It may be used multiple times.
        """
        _AclRoleState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            description=description,
            name=name,
            policies=policies,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             description: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             policies: Optional[pulumi.Input[Sequence[pulumi.Input['AclRolePolicyArgs']]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if description is not None:
            _setter("description", description)
        if name is not None:
            _setter("name", name)
        if policies is not None:
            _setter("policies", policies)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: "")` - A description of the ACL Role.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: <required>)` - A human-friendly name for this ACL Role.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def policies(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AclRolePolicyArgs']]]]:
        """
        `(set: <required>)` - A set of policy names to associate with this
        ACL Role. It may be used multiple times.
        """
        return pulumi.get(self, "policies")

    @policies.setter
    def policies(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AclRolePolicyArgs']]]]):
        pulumi.set(self, "policies", value)


class AclRole(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AclRolePolicyArgs']]]]] = None,
                 __props__=None):
        """
        Create a AclRole resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: `(string: "")` - A description of the ACL Role.
        :param pulumi.Input[str] name: `(string: <required>)` - A human-friendly name for this ACL Role.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AclRolePolicyArgs']]]] policies: `(set: <required>)` - A set of policy names to associate with this
               ACL Role. It may be used multiple times.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AclRoleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a AclRole resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param AclRoleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AclRoleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            AclRoleArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AclRolePolicyArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AclRoleArgs.__new__(AclRoleArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            if policies is None and not opts.urn:
                raise TypeError("Missing required property 'policies'")
            __props__.__dict__["policies"] = policies
        super(AclRole, __self__).__init__(
            'nomad:index/aclRole:AclRole',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            policies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AclRolePolicyArgs']]]]] = None) -> 'AclRole':
        """
        Get an existing AclRole resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: `(string: "")` - A description of the ACL Role.
        :param pulumi.Input[str] name: `(string: <required>)` - A human-friendly name for this ACL Role.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AclRolePolicyArgs']]]] policies: `(set: <required>)` - A set of policy names to associate with this
               ACL Role. It may be used multiple times.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AclRoleState.__new__(_AclRoleState)

        __props__.__dict__["description"] = description
        __props__.__dict__["name"] = name
        __props__.__dict__["policies"] = policies
        return AclRole(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        `(string: "")` - A description of the ACL Role.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        `(string: <required>)` - A human-friendly name for this ACL Role.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def policies(self) -> pulumi.Output[Sequence['outputs.AclRolePolicy']]:
        """
        `(set: <required>)` - A set of policy names to associate with this
        ACL Role. It may be used multiple times.
        """
        return pulumi.get(self, "policies")

