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

__all__ = ['AclBindingRuleArgs', 'AclBindingRule']

@pulumi.input_type
class AclBindingRuleArgs:
    def __init__(__self__, *,
                 auth_method: pulumi.Input[str],
                 bind_type: pulumi.Input[str],
                 bind_name: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 selector: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AclBindingRule resource.
        :param pulumi.Input[str] auth_method: `(string: <required>)` - Name of the auth method for which this
               rule applies to.
        :param pulumi.Input[str] bind_type: `(string: <required>)` - Adjusts how this binding rule is applied
               at login time. Valid values are `role`, `policy`, and `management`.
        :param pulumi.Input[str] bind_name: `(string: <optional>)` - Target of the binding. If `bind_type` is
               `role` or `policy` then `bind_name` is required. If `bind_type` is
               `management` than `bind_name` must not be defined.
        :param pulumi.Input[str] description: `(string: "")` - Description for this ACL binding rule.
        :param pulumi.Input[str] selector: `(string: "")` - A boolean expression that matches against verified
               identity attributes returned from the auth method during login.
        """
        pulumi.set(__self__, "auth_method", auth_method)
        pulumi.set(__self__, "bind_type", bind_type)
        if bind_name is not None:
            pulumi.set(__self__, "bind_name", bind_name)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if selector is not None:
            pulumi.set(__self__, "selector", selector)

    @property
    @pulumi.getter(name="authMethod")
    def auth_method(self) -> pulumi.Input[str]:
        """
        `(string: <required>)` - Name of the auth method for which this
        rule applies to.
        """
        return pulumi.get(self, "auth_method")

    @auth_method.setter
    def auth_method(self, value: pulumi.Input[str]):
        pulumi.set(self, "auth_method", value)

    @property
    @pulumi.getter(name="bindType")
    def bind_type(self) -> pulumi.Input[str]:
        """
        `(string: <required>)` - Adjusts how this binding rule is applied
        at login time. Valid values are `role`, `policy`, and `management`.
        """
        return pulumi.get(self, "bind_type")

    @bind_type.setter
    def bind_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "bind_type", value)

    @property
    @pulumi.getter(name="bindName")
    def bind_name(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: <optional>)` - Target of the binding. If `bind_type` is
        `role` or `policy` then `bind_name` is required. If `bind_type` is
        `management` than `bind_name` must not be defined.
        """
        return pulumi.get(self, "bind_name")

    @bind_name.setter
    def bind_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bind_name", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: "")` - Description for this ACL binding rule.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def selector(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: "")` - A boolean expression that matches against verified
        identity attributes returned from the auth method during login.
        """
        return pulumi.get(self, "selector")

    @selector.setter
    def selector(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "selector", value)


@pulumi.input_type
class _AclBindingRuleState:
    def __init__(__self__, *,
                 auth_method: Optional[pulumi.Input[str]] = None,
                 bind_name: Optional[pulumi.Input[str]] = None,
                 bind_type: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 selector: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AclBindingRule resources.
        :param pulumi.Input[str] auth_method: `(string: <required>)` - Name of the auth method for which this
               rule applies to.
        :param pulumi.Input[str] bind_name: `(string: <optional>)` - Target of the binding. If `bind_type` is
               `role` or `policy` then `bind_name` is required. If `bind_type` is
               `management` than `bind_name` must not be defined.
        :param pulumi.Input[str] bind_type: `(string: <required>)` - Adjusts how this binding rule is applied
               at login time. Valid values are `role`, `policy`, and `management`.
        :param pulumi.Input[str] description: `(string: "")` - Description for this ACL binding rule.
        :param pulumi.Input[str] selector: `(string: "")` - A boolean expression that matches against verified
               identity attributes returned from the auth method during login.
        """
        if auth_method is not None:
            pulumi.set(__self__, "auth_method", auth_method)
        if bind_name is not None:
            pulumi.set(__self__, "bind_name", bind_name)
        if bind_type is not None:
            pulumi.set(__self__, "bind_type", bind_type)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if selector is not None:
            pulumi.set(__self__, "selector", selector)

    @property
    @pulumi.getter(name="authMethod")
    def auth_method(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: <required>)` - Name of the auth method for which this
        rule applies to.
        """
        return pulumi.get(self, "auth_method")

    @auth_method.setter
    def auth_method(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "auth_method", value)

    @property
    @pulumi.getter(name="bindName")
    def bind_name(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: <optional>)` - Target of the binding. If `bind_type` is
        `role` or `policy` then `bind_name` is required. If `bind_type` is
        `management` than `bind_name` must not be defined.
        """
        return pulumi.get(self, "bind_name")

    @bind_name.setter
    def bind_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bind_name", value)

    @property
    @pulumi.getter(name="bindType")
    def bind_type(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: <required>)` - Adjusts how this binding rule is applied
        at login time. Valid values are `role`, `policy`, and `management`.
        """
        return pulumi.get(self, "bind_type")

    @bind_type.setter
    def bind_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bind_type", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: "")` - Description for this ACL binding rule.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def selector(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: "")` - A boolean expression that matches against verified
        identity attributes returned from the auth method during login.
        """
        return pulumi.get(self, "selector")

    @selector.setter
    def selector(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "selector", value)


class AclBindingRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auth_method: Optional[pulumi.Input[str]] = None,
                 bind_name: Optional[pulumi.Input[str]] = None,
                 bind_type: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 selector: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a AclBindingRule resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] auth_method: `(string: <required>)` - Name of the auth method for which this
               rule applies to.
        :param pulumi.Input[str] bind_name: `(string: <optional>)` - Target of the binding. If `bind_type` is
               `role` or `policy` then `bind_name` is required. If `bind_type` is
               `management` than `bind_name` must not be defined.
        :param pulumi.Input[str] bind_type: `(string: <required>)` - Adjusts how this binding rule is applied
               at login time. Valid values are `role`, `policy`, and `management`.
        :param pulumi.Input[str] description: `(string: "")` - Description for this ACL binding rule.
        :param pulumi.Input[str] selector: `(string: "")` - A boolean expression that matches against verified
               identity attributes returned from the auth method during login.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AclBindingRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a AclBindingRule resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param AclBindingRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AclBindingRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auth_method: Optional[pulumi.Input[str]] = None,
                 bind_name: Optional[pulumi.Input[str]] = None,
                 bind_type: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 selector: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AclBindingRuleArgs.__new__(AclBindingRuleArgs)

            if auth_method is None and not opts.urn:
                raise TypeError("Missing required property 'auth_method'")
            __props__.__dict__["auth_method"] = auth_method
            __props__.__dict__["bind_name"] = bind_name
            if bind_type is None and not opts.urn:
                raise TypeError("Missing required property 'bind_type'")
            __props__.__dict__["bind_type"] = bind_type
            __props__.__dict__["description"] = description
            __props__.__dict__["selector"] = selector
        super(AclBindingRule, __self__).__init__(
            'nomad:index/aclBindingRule:AclBindingRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            auth_method: Optional[pulumi.Input[str]] = None,
            bind_name: Optional[pulumi.Input[str]] = None,
            bind_type: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            selector: Optional[pulumi.Input[str]] = None) -> 'AclBindingRule':
        """
        Get an existing AclBindingRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] auth_method: `(string: <required>)` - Name of the auth method for which this
               rule applies to.
        :param pulumi.Input[str] bind_name: `(string: <optional>)` - Target of the binding. If `bind_type` is
               `role` or `policy` then `bind_name` is required. If `bind_type` is
               `management` than `bind_name` must not be defined.
        :param pulumi.Input[str] bind_type: `(string: <required>)` - Adjusts how this binding rule is applied
               at login time. Valid values are `role`, `policy`, and `management`.
        :param pulumi.Input[str] description: `(string: "")` - Description for this ACL binding rule.
        :param pulumi.Input[str] selector: `(string: "")` - A boolean expression that matches against verified
               identity attributes returned from the auth method during login.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AclBindingRuleState.__new__(_AclBindingRuleState)

        __props__.__dict__["auth_method"] = auth_method
        __props__.__dict__["bind_name"] = bind_name
        __props__.__dict__["bind_type"] = bind_type
        __props__.__dict__["description"] = description
        __props__.__dict__["selector"] = selector
        return AclBindingRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="authMethod")
    def auth_method(self) -> pulumi.Output[str]:
        """
        `(string: <required>)` - Name of the auth method for which this
        rule applies to.
        """
        return pulumi.get(self, "auth_method")

    @property
    @pulumi.getter(name="bindName")
    def bind_name(self) -> pulumi.Output[Optional[str]]:
        """
        `(string: <optional>)` - Target of the binding. If `bind_type` is
        `role` or `policy` then `bind_name` is required. If `bind_type` is
        `management` than `bind_name` must not be defined.
        """
        return pulumi.get(self, "bind_name")

    @property
    @pulumi.getter(name="bindType")
    def bind_type(self) -> pulumi.Output[str]:
        """
        `(string: <required>)` - Adjusts how this binding rule is applied
        at login time. Valid values are `role`, `policy`, and `management`.
        """
        return pulumi.get(self, "bind_type")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        `(string: "")` - Description for this ACL binding rule.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def selector(self) -> pulumi.Output[Optional[str]]:
        """
        `(string: "")` - A boolean expression that matches against verified
        identity attributes returned from the auth method during login.
        """
        return pulumi.get(self, "selector")

