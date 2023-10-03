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

__all__ = ['QuoteSpecificationArgs', 'QuoteSpecification']

@pulumi.input_type
class QuoteSpecificationArgs:
    def __init__(__self__, *,
                 limits: pulumi.Input[Sequence[pulumi.Input['QuoteSpecificationLimitArgs']]],
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a QuoteSpecification resource.
        :param pulumi.Input[Sequence[pulumi.Input['QuoteSpecificationLimitArgs']]] limits: `(block: <required>)` - A block of quota limits to enforce. Can
               be repeated. See below for the structure of this block.
        :param pulumi.Input[str] description: `(string: "")` - A description of the quota specification.
        :param pulumi.Input[str] name: `(string: <required>)` - A unique name for the quota specification.
        """
        QuoteSpecificationArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            limits=limits,
            description=description,
            name=name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             limits: pulumi.Input[Sequence[pulumi.Input['QuoteSpecificationLimitArgs']]],
             description: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("limits", limits)
        if description is not None:
            _setter("description", description)
        if name is not None:
            _setter("name", name)

    @property
    @pulumi.getter
    def limits(self) -> pulumi.Input[Sequence[pulumi.Input['QuoteSpecificationLimitArgs']]]:
        """
        `(block: <required>)` - A block of quota limits to enforce. Can
        be repeated. See below for the structure of this block.
        """
        return pulumi.get(self, "limits")

    @limits.setter
    def limits(self, value: pulumi.Input[Sequence[pulumi.Input['QuoteSpecificationLimitArgs']]]):
        pulumi.set(self, "limits", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: "")` - A description of the quota specification.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: <required>)` - A unique name for the quota specification.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _QuoteSpecificationState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 limits: Optional[pulumi.Input[Sequence[pulumi.Input['QuoteSpecificationLimitArgs']]]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering QuoteSpecification resources.
        :param pulumi.Input[str] description: `(string: "")` - A description of the quota specification.
        :param pulumi.Input[Sequence[pulumi.Input['QuoteSpecificationLimitArgs']]] limits: `(block: <required>)` - A block of quota limits to enforce. Can
               be repeated. See below for the structure of this block.
        :param pulumi.Input[str] name: `(string: <required>)` - A unique name for the quota specification.
        """
        _QuoteSpecificationState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            description=description,
            limits=limits,
            name=name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             description: Optional[pulumi.Input[str]] = None,
             limits: Optional[pulumi.Input[Sequence[pulumi.Input['QuoteSpecificationLimitArgs']]]] = None,
             name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if description is not None:
            _setter("description", description)
        if limits is not None:
            _setter("limits", limits)
        if name is not None:
            _setter("name", name)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: "")` - A description of the quota specification.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def limits(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['QuoteSpecificationLimitArgs']]]]:
        """
        `(block: <required>)` - A block of quota limits to enforce. Can
        be repeated. See below for the structure of this block.
        """
        return pulumi.get(self, "limits")

    @limits.setter
    def limits(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['QuoteSpecificationLimitArgs']]]]):
        pulumi.set(self, "limits", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: <required>)` - A unique name for the quota specification.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class QuoteSpecification(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 limits: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['QuoteSpecificationLimitArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a quota specification in a Nomad cluster.

        ## Example Usage

        Registering a quota specification:

        ```python
        import pulumi
        import pulumi_nomad as nomad

        prod_api = nomad.QuoteSpecification("prodApi",
            description="Production instances of backend API servers",
            limits=[nomad.QuoteSpecificationLimitArgs(
                region="global",
                region_limit=nomad.QuoteSpecificationLimitRegionLimitArgs(
                    cpu=2400,
                    memory_mb=1200,
                ),
            )])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: `(string: "")` - A description of the quota specification.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['QuoteSpecificationLimitArgs']]]] limits: `(block: <required>)` - A block of quota limits to enforce. Can
               be repeated. See below for the structure of this block.
        :param pulumi.Input[str] name: `(string: <required>)` - A unique name for the quota specification.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: QuoteSpecificationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a quota specification in a Nomad cluster.

        ## Example Usage

        Registering a quota specification:

        ```python
        import pulumi
        import pulumi_nomad as nomad

        prod_api = nomad.QuoteSpecification("prodApi",
            description="Production instances of backend API servers",
            limits=[nomad.QuoteSpecificationLimitArgs(
                region="global",
                region_limit=nomad.QuoteSpecificationLimitRegionLimitArgs(
                    cpu=2400,
                    memory_mb=1200,
                ),
            )])
        ```

        :param str resource_name: The name of the resource.
        :param QuoteSpecificationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(QuoteSpecificationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            QuoteSpecificationArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 limits: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['QuoteSpecificationLimitArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = QuoteSpecificationArgs.__new__(QuoteSpecificationArgs)

            __props__.__dict__["description"] = description
            if limits is None and not opts.urn:
                raise TypeError("Missing required property 'limits'")
            __props__.__dict__["limits"] = limits
            __props__.__dict__["name"] = name
        super(QuoteSpecification, __self__).__init__(
            'nomad:index/quoteSpecification:QuoteSpecification',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            limits: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['QuoteSpecificationLimitArgs']]]]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'QuoteSpecification':
        """
        Get an existing QuoteSpecification resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: `(string: "")` - A description of the quota specification.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['QuoteSpecificationLimitArgs']]]] limits: `(block: <required>)` - A block of quota limits to enforce. Can
               be repeated. See below for the structure of this block.
        :param pulumi.Input[str] name: `(string: <required>)` - A unique name for the quota specification.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _QuoteSpecificationState.__new__(_QuoteSpecificationState)

        __props__.__dict__["description"] = description
        __props__.__dict__["limits"] = limits
        __props__.__dict__["name"] = name
        return QuoteSpecification(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        `(string: "")` - A description of the quota specification.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def limits(self) -> pulumi.Output[Sequence['outputs.QuoteSpecificationLimit']]:
        """
        `(block: <required>)` - A block of quota limits to enforce. Can
        be repeated. See below for the structure of this block.
        """
        return pulumi.get(self, "limits")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        `(string: <required>)` - A unique name for the quota specification.
        """
        return pulumi.get(self, "name")

