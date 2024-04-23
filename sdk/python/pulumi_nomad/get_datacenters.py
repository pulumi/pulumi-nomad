# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetDatacentersResult',
    'AwaitableGetDatacentersResult',
    'get_datacenters',
    'get_datacenters_output',
]

@pulumi.output_type
class GetDatacentersResult:
    """
    A collection of values returned by getDatacenters.
    """
    def __init__(__self__, datacenters=None, id=None, ignore_down_nodes=None, prefix=None):
        if datacenters and not isinstance(datacenters, list):
            raise TypeError("Expected argument 'datacenters' to be a list")
        pulumi.set(__self__, "datacenters", datacenters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ignore_down_nodes and not isinstance(ignore_down_nodes, bool):
            raise TypeError("Expected argument 'ignore_down_nodes' to be a bool")
        pulumi.set(__self__, "ignore_down_nodes", ignore_down_nodes)
        if prefix and not isinstance(prefix, str):
            raise TypeError("Expected argument 'prefix' to be a str")
        pulumi.set(__self__, "prefix", prefix)

    @property
    @pulumi.getter
    def datacenters(self) -> Sequence[str]:
        """
        `list(string)` a list of datacenters.
        """
        return pulumi.get(self, "datacenters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="ignoreDownNodes")
    def ignore_down_nodes(self) -> Optional[bool]:
        return pulumi.get(self, "ignore_down_nodes")

    @property
    @pulumi.getter
    def prefix(self) -> Optional[str]:
        return pulumi.get(self, "prefix")


class AwaitableGetDatacentersResult(GetDatacentersResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDatacentersResult(
            datacenters=self.datacenters,
            id=self.id,
            ignore_down_nodes=self.ignore_down_nodes,
            prefix=self.prefix)


def get_datacenters(ignore_down_nodes: Optional[bool] = None,
                    prefix: Optional[str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDatacentersResult:
    """
    Retrieve a list of datacenters.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_nomad as nomad

    datacenters = nomad.get_datacenters(prefix="prod",
        ignore_down_nodes=True)
    ```


    :param bool ignore_down_nodes: `(bool: false)`: An optional flag that, if set to `true` will ignore down nodes when compiling the list of datacenters.
    :param str prefix: `(string)`: An optional string to filter datacenters based on name prefix. If not provided, all datacenters are returned.
    """
    __args__ = dict()
    __args__['ignoreDownNodes'] = ignore_down_nodes
    __args__['prefix'] = prefix
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('nomad:index/getDatacenters:getDatacenters', __args__, opts=opts, typ=GetDatacentersResult).value

    return AwaitableGetDatacentersResult(
        datacenters=pulumi.get(__ret__, 'datacenters'),
        id=pulumi.get(__ret__, 'id'),
        ignore_down_nodes=pulumi.get(__ret__, 'ignore_down_nodes'),
        prefix=pulumi.get(__ret__, 'prefix'))


@_utilities.lift_output_func(get_datacenters)
def get_datacenters_output(ignore_down_nodes: Optional[pulumi.Input[Optional[bool]]] = None,
                           prefix: Optional[pulumi.Input[Optional[str]]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDatacentersResult]:
    """
    Retrieve a list of datacenters.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_nomad as nomad

    datacenters = nomad.get_datacenters(prefix="prod",
        ignore_down_nodes=True)
    ```


    :param bool ignore_down_nodes: `(bool: false)`: An optional flag that, if set to `true` will ignore down nodes when compiling the list of datacenters.
    :param str prefix: `(string)`: An optional string to filter datacenters based on name prefix. If not provided, all datacenters are returned.
    """
    ...
