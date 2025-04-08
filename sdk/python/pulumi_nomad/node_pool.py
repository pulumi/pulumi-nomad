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
from ._inputs import *

__all__ = ['NodePoolArgs', 'NodePool']

@pulumi.input_type
class NodePoolArgs:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 meta: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 scheduler_config: Optional[pulumi.Input['NodePoolSchedulerConfigArgs']] = None):
        """
        The set of arguments for constructing a NodePool resource.
        :param pulumi.Input[builtins.str] description: `(string)` - The description of the node pool.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] meta: `(map[string]string)` - Arbitrary KV metadata associated with the
               node pool.
        :param pulumi.Input[builtins.str] name: `(string)` - The name of the node pool.
        :param pulumi.Input['NodePoolSchedulerConfigArgs'] scheduler_config: `(block)` - Scheduler configuration for the node pool.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if meta is not None:
            pulumi.set(__self__, "meta", meta)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if scheduler_config is not None:
            pulumi.set(__self__, "scheduler_config", scheduler_config)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        `(string)` - The description of the node pool.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def meta(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]:
        """
        `(map[string]string)` - Arbitrary KV metadata associated with the
        node pool.
        """
        return pulumi.get(self, "meta")

    @meta.setter
    def meta(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "meta", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        `(string)` - The name of the node pool.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="schedulerConfig")
    def scheduler_config(self) -> Optional[pulumi.Input['NodePoolSchedulerConfigArgs']]:
        """
        `(block)` - Scheduler configuration for the node pool.
        """
        return pulumi.get(self, "scheduler_config")

    @scheduler_config.setter
    def scheduler_config(self, value: Optional[pulumi.Input['NodePoolSchedulerConfigArgs']]):
        pulumi.set(self, "scheduler_config", value)


@pulumi.input_type
class _NodePoolState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 meta: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 scheduler_config: Optional[pulumi.Input['NodePoolSchedulerConfigArgs']] = None):
        """
        Input properties used for looking up and filtering NodePool resources.
        :param pulumi.Input[builtins.str] description: `(string)` - The description of the node pool.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] meta: `(map[string]string)` - Arbitrary KV metadata associated with the
               node pool.
        :param pulumi.Input[builtins.str] name: `(string)` - The name of the node pool.
        :param pulumi.Input['NodePoolSchedulerConfigArgs'] scheduler_config: `(block)` - Scheduler configuration for the node pool.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if meta is not None:
            pulumi.set(__self__, "meta", meta)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if scheduler_config is not None:
            pulumi.set(__self__, "scheduler_config", scheduler_config)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        `(string)` - The description of the node pool.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def meta(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]:
        """
        `(map[string]string)` - Arbitrary KV metadata associated with the
        node pool.
        """
        return pulumi.get(self, "meta")

    @meta.setter
    def meta(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "meta", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        `(string)` - The name of the node pool.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="schedulerConfig")
    def scheduler_config(self) -> Optional[pulumi.Input['NodePoolSchedulerConfigArgs']]:
        """
        `(block)` - Scheduler configuration for the node pool.
        """
        return pulumi.get(self, "scheduler_config")

    @scheduler_config.setter
    def scheduler_config(self, value: Optional[pulumi.Input['NodePoolSchedulerConfigArgs']]):
        pulumi.set(self, "scheduler_config", value)


class NodePool(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 meta: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 scheduler_config: Optional[pulumi.Input[Union['NodePoolSchedulerConfigArgs', 'NodePoolSchedulerConfigArgsDict']]] = None,
                 __props__=None):
        """
        Provisions a node pool within a Nomad cluster.

        ## Example Usage

        Registering a node pool:

        ```python
        import pulumi
        import pulumi_nomad as nomad

        dev = nomad.NodePool("dev",
            name="dev",
            description="Nodes for the development environment.",
            meta={
                "department": "Engineering",
                "env": "dev",
            })
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] description: `(string)` - The description of the node pool.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] meta: `(map[string]string)` - Arbitrary KV metadata associated with the
               node pool.
        :param pulumi.Input[builtins.str] name: `(string)` - The name of the node pool.
        :param pulumi.Input[Union['NodePoolSchedulerConfigArgs', 'NodePoolSchedulerConfigArgsDict']] scheduler_config: `(block)` - Scheduler configuration for the node pool.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[NodePoolArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provisions a node pool within a Nomad cluster.

        ## Example Usage

        Registering a node pool:

        ```python
        import pulumi
        import pulumi_nomad as nomad

        dev = nomad.NodePool("dev",
            name="dev",
            description="Nodes for the development environment.",
            meta={
                "department": "Engineering",
                "env": "dev",
            })
        ```

        :param str resource_name: The name of the resource.
        :param NodePoolArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NodePoolArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 meta: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 scheduler_config: Optional[pulumi.Input[Union['NodePoolSchedulerConfigArgs', 'NodePoolSchedulerConfigArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NodePoolArgs.__new__(NodePoolArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["meta"] = meta
            __props__.__dict__["name"] = name
            __props__.__dict__["scheduler_config"] = scheduler_config
        super(NodePool, __self__).__init__(
            'nomad:index/nodePool:NodePool',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[builtins.str]] = None,
            meta: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            scheduler_config: Optional[pulumi.Input[Union['NodePoolSchedulerConfigArgs', 'NodePoolSchedulerConfigArgsDict']]] = None) -> 'NodePool':
        """
        Get an existing NodePool resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] description: `(string)` - The description of the node pool.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] meta: `(map[string]string)` - Arbitrary KV metadata associated with the
               node pool.
        :param pulumi.Input[builtins.str] name: `(string)` - The name of the node pool.
        :param pulumi.Input[Union['NodePoolSchedulerConfigArgs', 'NodePoolSchedulerConfigArgsDict']] scheduler_config: `(block)` - Scheduler configuration for the node pool.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NodePoolState.__new__(_NodePoolState)

        __props__.__dict__["description"] = description
        __props__.__dict__["meta"] = meta
        __props__.__dict__["name"] = name
        __props__.__dict__["scheduler_config"] = scheduler_config
        return NodePool(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        `(string)` - The description of the node pool.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def meta(self) -> pulumi.Output[Optional[Mapping[str, builtins.str]]]:
        """
        `(map[string]string)` - Arbitrary KV metadata associated with the
        node pool.
        """
        return pulumi.get(self, "meta")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        `(string)` - The name of the node pool.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="schedulerConfig")
    def scheduler_config(self) -> pulumi.Output[Optional['outputs.NodePoolSchedulerConfig']]:
        """
        `(block)` - Scheduler configuration for the node pool.
        """
        return pulumi.get(self, "scheduler_config")

