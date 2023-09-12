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
    'GetNodePoolsResult',
    'AwaitableGetNodePoolsResult',
    'get_node_pools',
    'get_node_pools_output',
]

@pulumi.output_type
class GetNodePoolsResult:
    """
    A collection of values returned by getNodePools.
    """
    def __init__(__self__, filter=None, id=None, node_pools=None, prefix=None):
        if filter and not isinstance(filter, str):
            raise TypeError("Expected argument 'filter' to be a str")
        pulumi.set(__self__, "filter", filter)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if node_pools and not isinstance(node_pools, list):
            raise TypeError("Expected argument 'node_pools' to be a list")
        pulumi.set(__self__, "node_pools", node_pools)
        if prefix and not isinstance(prefix, str):
            raise TypeError("Expected argument 'prefix' to be a str")
        pulumi.set(__self__, "prefix", prefix)

    @property
    @pulumi.getter
    def filter(self) -> Optional[str]:
        return pulumi.get(self, "filter")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="nodePools")
    def node_pools(self) -> Sequence['outputs.GetNodePoolsNodePoolResult']:
        """
        `(list of node pools)` - A list of node pools matching the
        search criteria.
        """
        return pulumi.get(self, "node_pools")

    @property
    @pulumi.getter
    def prefix(self) -> Optional[str]:
        return pulumi.get(self, "prefix")


class AwaitableGetNodePoolsResult(GetNodePoolsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNodePoolsResult(
            filter=self.filter,
            id=self.id,
            node_pools=self.node_pools,
            prefix=self.prefix)


def get_node_pools(filter: Optional[str] = None,
                   prefix: Optional[str] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNodePoolsResult:
    """
    Retrieve a list of node pools available in Nomad.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_nomad as nomad

    prod = nomad.get_node_pools(filter="Meta.env == \\"prod\\"")
    ```


    :param str filter: `(string)` - Specifies the [expression][nomad_api_filter] used to
           filter the results.
    :param str prefix: `(string)` - Specifies a string to filter node pools based on a name
           prefix.
    """
    __args__ = dict()
    __args__['filter'] = filter
    __args__['prefix'] = prefix
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('nomad:index/getNodePools:getNodePools', __args__, opts=opts, typ=GetNodePoolsResult).value

    return AwaitableGetNodePoolsResult(
        filter=pulumi.get(__ret__, 'filter'),
        id=pulumi.get(__ret__, 'id'),
        node_pools=pulumi.get(__ret__, 'node_pools'),
        prefix=pulumi.get(__ret__, 'prefix'))


@_utilities.lift_output_func(get_node_pools)
def get_node_pools_output(filter: Optional[pulumi.Input[Optional[str]]] = None,
                          prefix: Optional[pulumi.Input[Optional[str]]] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetNodePoolsResult]:
    """
    Retrieve a list of node pools available in Nomad.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_nomad as nomad

    prod = nomad.get_node_pools(filter="Meta.env == \\"prod\\"")
    ```


    :param str filter: `(string)` - Specifies the [expression][nomad_api_filter] used to
           filter the results.
    :param str prefix: `(string)` - Specifies a string to filter node pools based on a name
           prefix.
    """
    ...
