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
    'GetNodePoolResult',
    'AwaitableGetNodePoolResult',
    'get_node_pool',
    'get_node_pool_output',
]

@pulumi.output_type
class GetNodePoolResult:
    """
    A collection of values returned by getNodePool.
    """
    def __init__(__self__, description=None, id=None, meta=None, name=None, scheduler_configs=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if meta and not isinstance(meta, dict):
            raise TypeError("Expected argument 'meta' to be a dict")
        pulumi.set(__self__, "meta", meta)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if scheduler_configs and not isinstance(scheduler_configs, list):
            raise TypeError("Expected argument 'scheduler_configs' to be a list")
        pulumi.set(__self__, "scheduler_configs", scheduler_configs)

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        `(string)` - The description of the node pool.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def meta(self) -> Mapping[str, str]:
        """
        `(map[string]string)` - Arbitrary KV metadata associated with the
        node pool.
        """
        return pulumi.get(self, "meta")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="schedulerConfigs")
    def scheduler_configs(self) -> Sequence['outputs.GetNodePoolSchedulerConfigResult']:
        """
        `(block)` - Scheduler configuration for the node pool.
        """
        return pulumi.get(self, "scheduler_configs")


class AwaitableGetNodePoolResult(GetNodePoolResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNodePoolResult(
            description=self.description,
            id=self.id,
            meta=self.meta,
            name=self.name,
            scheduler_configs=self.scheduler_configs)


def get_node_pool(name: Optional[str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNodePoolResult:
    """
    Get information about a node pool in Nomad.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_nomad as nomad

    dev = nomad.get_node_pool(name="dev")
    ```


    :param str name: `(string)` - The name of the node pool to fetch.
    """
    __args__ = dict()
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('nomad:index/getNodePool:getNodePool', __args__, opts=opts, typ=GetNodePoolResult).value

    return AwaitableGetNodePoolResult(
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        meta=pulumi.get(__ret__, 'meta'),
        name=pulumi.get(__ret__, 'name'),
        scheduler_configs=pulumi.get(__ret__, 'scheduler_configs'))


@_utilities.lift_output_func(get_node_pool)
def get_node_pool_output(name: Optional[pulumi.Input[str]] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetNodePoolResult]:
    """
    Get information about a node pool in Nomad.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_nomad as nomad

    dev = nomad.get_node_pool(name="dev")
    ```


    :param str name: `(string)` - The name of the node pool to fetch.
    """
    ...
