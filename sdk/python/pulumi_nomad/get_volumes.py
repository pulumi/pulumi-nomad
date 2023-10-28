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
    'GetVolumesResult',
    'AwaitableGetVolumesResult',
    'get_volumes',
    'get_volumes_output',
]

@pulumi.output_type
class GetVolumesResult:
    """
    A collection of values returned by getVolumes.
    """
    def __init__(__self__, id=None, namespace=None, node_id=None, plugin_id=None, type=None, volumes=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if namespace and not isinstance(namespace, str):
            raise TypeError("Expected argument 'namespace' to be a str")
        pulumi.set(__self__, "namespace", namespace)
        if node_id and not isinstance(node_id, str):
            raise TypeError("Expected argument 'node_id' to be a str")
        pulumi.set(__self__, "node_id", node_id)
        if plugin_id and not isinstance(plugin_id, str):
            raise TypeError("Expected argument 'plugin_id' to be a str")
        pulumi.set(__self__, "plugin_id", plugin_id)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
        if volumes and not isinstance(volumes, list):
            raise TypeError("Expected argument 'volumes' to be a list")
        pulumi.set(__self__, "volumes", volumes)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def namespace(self) -> Optional[str]:
        """
        `string` Volume namespace.
        """
        return pulumi.get(self, "namespace")

    @property
    @pulumi.getter(name="nodeId")
    def node_id(self) -> Optional[str]:
        return pulumi.get(self, "node_id")

    @property
    @pulumi.getter(name="pluginId")
    def plugin_id(self) -> Optional[str]:
        return pulumi.get(self, "plugin_id")

    @property
    @pulumi.getter
    def type(self) -> Optional[str]:
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def volumes(self) -> Sequence[Mapping[str, Any]]:
        """
        `list of maps` a list of volumes in the cluster.
        """
        return pulumi.get(self, "volumes")


class AwaitableGetVolumesResult(GetVolumesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVolumesResult(
            id=self.id,
            namespace=self.namespace,
            node_id=self.node_id,
            plugin_id=self.plugin_id,
            type=self.type,
            volumes=self.volumes)


def get_volumes(namespace: Optional[str] = None,
                node_id: Optional[str] = None,
                plugin_id: Optional[str] = None,
                type: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetVolumesResult:
    """
    Retrieve a list of volumes in Nomad.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_nomad as nomad

    example = nomad.get_volumes()
    ```


    :param str namespace: `(string: "default")` Nomad namespace.
    :param str node_id: `(string: optional)` Volume node filter.
    :param str plugin_id: `(string: optional)` Plugin ID filter.
    :param str type: `(string: "csi")` Volume type (currently only supports `csi`)
    """
    __args__ = dict()
    __args__['namespace'] = namespace
    __args__['nodeId'] = node_id
    __args__['pluginId'] = plugin_id
    __args__['type'] = type
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('nomad:index/getVolumes:getVolumes', __args__, opts=opts, typ=GetVolumesResult).value

    return AwaitableGetVolumesResult(
        id=pulumi.get(__ret__, 'id'),
        namespace=pulumi.get(__ret__, 'namespace'),
        node_id=pulumi.get(__ret__, 'node_id'),
        plugin_id=pulumi.get(__ret__, 'plugin_id'),
        type=pulumi.get(__ret__, 'type'),
        volumes=pulumi.get(__ret__, 'volumes'))


@_utilities.lift_output_func(get_volumes)
def get_volumes_output(namespace: Optional[pulumi.Input[Optional[str]]] = None,
                       node_id: Optional[pulumi.Input[Optional[str]]] = None,
                       plugin_id: Optional[pulumi.Input[Optional[str]]] = None,
                       type: Optional[pulumi.Input[Optional[str]]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetVolumesResult]:
    """
    Retrieve a list of volumes in Nomad.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_nomad as nomad

    example = nomad.get_volumes()
    ```


    :param str namespace: `(string: "default")` Nomad namespace.
    :param str node_id: `(string: optional)` Volume node filter.
    :param str plugin_id: `(string: optional)` Plugin ID filter.
    :param str type: `(string: "csi")` Volume type (currently only supports `csi`)
    """
    ...
