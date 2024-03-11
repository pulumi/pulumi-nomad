# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['VariableArgs', 'Variable']

@pulumi.input_type
class VariableArgs:
    def __init__(__self__, *,
                 items: pulumi.Input[Mapping[str, Any]],
                 path: pulumi.Input[str],
                 namespace: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Variable resource.
        :param pulumi.Input[Mapping[str, Any]] items: `(map[string]string: <required>)` - An arbitrary map of items to create in the variable.
        :param pulumi.Input[str] path: `(string: <required>)` - A unique path to create the variable at.
        :param pulumi.Input[str] namespace: `(string: "default")` - The namepsace to create the variable in.
        """
        pulumi.set(__self__, "items", items)
        pulumi.set(__self__, "path", path)
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)

    @property
    @pulumi.getter
    def items(self) -> pulumi.Input[Mapping[str, Any]]:
        """
        `(map[string]string: <required>)` - An arbitrary map of items to create in the variable.
        """
        return pulumi.get(self, "items")

    @items.setter
    def items(self, value: pulumi.Input[Mapping[str, Any]]):
        pulumi.set(self, "items", value)

    @property
    @pulumi.getter
    def path(self) -> pulumi.Input[str]:
        """
        `(string: <required>)` - A unique path to create the variable at.
        """
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: pulumi.Input[str]):
        pulumi.set(self, "path", value)

    @property
    @pulumi.getter
    def namespace(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: "default")` - The namepsace to create the variable in.
        """
        return pulumi.get(self, "namespace")

    @namespace.setter
    def namespace(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "namespace", value)


@pulumi.input_type
class _VariableState:
    def __init__(__self__, *,
                 items: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Variable resources.
        :param pulumi.Input[Mapping[str, Any]] items: `(map[string]string: <required>)` - An arbitrary map of items to create in the variable.
        :param pulumi.Input[str] namespace: `(string: "default")` - The namepsace to create the variable in.
        :param pulumi.Input[str] path: `(string: <required>)` - A unique path to create the variable at.
        """
        if items is not None:
            pulumi.set(__self__, "items", items)
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)
        if path is not None:
            pulumi.set(__self__, "path", path)

    @property
    @pulumi.getter
    def items(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        `(map[string]string: <required>)` - An arbitrary map of items to create in the variable.
        """
        return pulumi.get(self, "items")

    @items.setter
    def items(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "items", value)

    @property
    @pulumi.getter
    def namespace(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: "default")` - The namepsace to create the variable in.
        """
        return pulumi.get(self, "namespace")

    @namespace.setter
    def namespace(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "namespace", value)

    @property
    @pulumi.getter
    def path(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: <required>)` - A unique path to create the variable at.
        """
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "path", value)


class Variable(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 items: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        Creating a variable in the default namespace:

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_nomad as nomad

        example = nomad.Variable("example",
            items={
                "example_key": "example_value",
            },
            path="some/path/of/your/choosing")
        ```
        <!--End PulumiCodeChooser -->

        Creating a variable in a custom namespace:

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_nomad as nomad

        example_namespace = nomad.Namespace("exampleNamespace", description="Example namespace.")
        example_variable = nomad.Variable("exampleVariable",
            path="some/path/of/your/choosing",
            namespace=example_namespace.name,
            items={
                "example_key": "example_value",
            })
        ```
        <!--End PulumiCodeChooser -->

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] items: `(map[string]string: <required>)` - An arbitrary map of items to create in the variable.
        :param pulumi.Input[str] namespace: `(string: "default")` - The namepsace to create the variable in.
        :param pulumi.Input[str] path: `(string: <required>)` - A unique path to create the variable at.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VariableArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        Creating a variable in the default namespace:

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_nomad as nomad

        example = nomad.Variable("example",
            items={
                "example_key": "example_value",
            },
            path="some/path/of/your/choosing")
        ```
        <!--End PulumiCodeChooser -->

        Creating a variable in a custom namespace:

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_nomad as nomad

        example_namespace = nomad.Namespace("exampleNamespace", description="Example namespace.")
        example_variable = nomad.Variable("exampleVariable",
            path="some/path/of/your/choosing",
            namespace=example_namespace.name,
            items={
                "example_key": "example_value",
            })
        ```
        <!--End PulumiCodeChooser -->

        :param str resource_name: The name of the resource.
        :param VariableArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VariableArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 items: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VariableArgs.__new__(VariableArgs)

            if items is None and not opts.urn:
                raise TypeError("Missing required property 'items'")
            __props__.__dict__["items"] = None if items is None else pulumi.Output.secret(items)
            __props__.__dict__["namespace"] = namespace
            if path is None and not opts.urn:
                raise TypeError("Missing required property 'path'")
            __props__.__dict__["path"] = path
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["items"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Variable, __self__).__init__(
            'nomad:index/variable:Variable',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            items: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            namespace: Optional[pulumi.Input[str]] = None,
            path: Optional[pulumi.Input[str]] = None) -> 'Variable':
        """
        Get an existing Variable resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] items: `(map[string]string: <required>)` - An arbitrary map of items to create in the variable.
        :param pulumi.Input[str] namespace: `(string: "default")` - The namepsace to create the variable in.
        :param pulumi.Input[str] path: `(string: <required>)` - A unique path to create the variable at.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VariableState.__new__(_VariableState)

        __props__.__dict__["items"] = items
        __props__.__dict__["namespace"] = namespace
        __props__.__dict__["path"] = path
        return Variable(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def items(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        `(map[string]string: <required>)` - An arbitrary map of items to create in the variable.
        """
        return pulumi.get(self, "items")

    @property
    @pulumi.getter
    def namespace(self) -> pulumi.Output[Optional[str]]:
        """
        `(string: "default")` - The namepsace to create the variable in.
        """
        return pulumi.get(self, "namespace")

    @property
    @pulumi.getter
    def path(self) -> pulumi.Output[str]:
        """
        `(string: <required>)` - A unique path to create the variable at.
        """
        return pulumi.get(self, "path")

