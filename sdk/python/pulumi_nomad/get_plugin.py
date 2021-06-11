# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetPluginResult',
    'AwaitableGetPluginResult',
    'get_plugin',
]

@pulumi.output_type
class GetPluginResult:
    """
    A collection of values returned by getPlugin.
    """
    def __init__(__self__, controller_required=None, controllers_expected=None, controllers_healthy=None, id=None, nodes=None, nodes_expected=None, nodes_healthy=None, plugin_id=None, plugin_provider=None, plugin_provider_version=None, wait_for_healthy=None, wait_for_registration=None):
        if controller_required and not isinstance(controller_required, bool):
            raise TypeError("Expected argument 'controller_required' to be a bool")
        pulumi.set(__self__, "controller_required", controller_required)
        if controllers_expected and not isinstance(controllers_expected, int):
            raise TypeError("Expected argument 'controllers_expected' to be a int")
        pulumi.set(__self__, "controllers_expected", controllers_expected)
        if controllers_healthy and not isinstance(controllers_healthy, int):
            raise TypeError("Expected argument 'controllers_healthy' to be a int")
        pulumi.set(__self__, "controllers_healthy", controllers_healthy)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if nodes and not isinstance(nodes, list):
            raise TypeError("Expected argument 'nodes' to be a list")
        pulumi.set(__self__, "nodes", nodes)
        if nodes_expected and not isinstance(nodes_expected, int):
            raise TypeError("Expected argument 'nodes_expected' to be a int")
        pulumi.set(__self__, "nodes_expected", nodes_expected)
        if nodes_healthy and not isinstance(nodes_healthy, int):
            raise TypeError("Expected argument 'nodes_healthy' to be a int")
        pulumi.set(__self__, "nodes_healthy", nodes_healthy)
        if plugin_id and not isinstance(plugin_id, str):
            raise TypeError("Expected argument 'plugin_id' to be a str")
        pulumi.set(__self__, "plugin_id", plugin_id)
        if plugin_provider and not isinstance(plugin_provider, str):
            raise TypeError("Expected argument 'plugin_provider' to be a str")
        pulumi.set(__self__, "plugin_provider", plugin_provider)
        if plugin_provider_version and not isinstance(plugin_provider_version, str):
            raise TypeError("Expected argument 'plugin_provider_version' to be a str")
        pulumi.set(__self__, "plugin_provider_version", plugin_provider_version)
        if wait_for_healthy and not isinstance(wait_for_healthy, bool):
            raise TypeError("Expected argument 'wait_for_healthy' to be a bool")
        pulumi.set(__self__, "wait_for_healthy", wait_for_healthy)
        if wait_for_registration and not isinstance(wait_for_registration, bool):
            raise TypeError("Expected argument 'wait_for_registration' to be a bool")
        pulumi.set(__self__, "wait_for_registration", wait_for_registration)

    @property
    @pulumi.getter(name="controllerRequired")
    def controller_required(self) -> bool:
        return pulumi.get(self, "controller_required")

    @property
    @pulumi.getter(name="controllersExpected")
    def controllers_expected(self) -> int:
        return pulumi.get(self, "controllers_expected")

    @property
    @pulumi.getter(name="controllersHealthy")
    def controllers_healthy(self) -> int:
        return pulumi.get(self, "controllers_healthy")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def nodes(self) -> Sequence['outputs.GetPluginNodeResult']:
        return pulumi.get(self, "nodes")

    @property
    @pulumi.getter(name="nodesExpected")
    def nodes_expected(self) -> int:
        return pulumi.get(self, "nodes_expected")

    @property
    @pulumi.getter(name="nodesHealthy")
    def nodes_healthy(self) -> int:
        return pulumi.get(self, "nodes_healthy")

    @property
    @pulumi.getter(name="pluginId")
    def plugin_id(self) -> str:
        return pulumi.get(self, "plugin_id")

    @property
    @pulumi.getter(name="pluginProvider")
    def plugin_provider(self) -> str:
        return pulumi.get(self, "plugin_provider")

    @property
    @pulumi.getter(name="pluginProviderVersion")
    def plugin_provider_version(self) -> str:
        return pulumi.get(self, "plugin_provider_version")

    @property
    @pulumi.getter(name="waitForHealthy")
    def wait_for_healthy(self) -> Optional[bool]:
        return pulumi.get(self, "wait_for_healthy")

    @property
    @pulumi.getter(name="waitForRegistration")
    def wait_for_registration(self) -> Optional[bool]:
        return pulumi.get(self, "wait_for_registration")


class AwaitableGetPluginResult(GetPluginResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPluginResult(
            controller_required=self.controller_required,
            controllers_expected=self.controllers_expected,
            controllers_healthy=self.controllers_healthy,
            id=self.id,
            nodes=self.nodes,
            nodes_expected=self.nodes_expected,
            nodes_healthy=self.nodes_healthy,
            plugin_id=self.plugin_id,
            plugin_provider=self.plugin_provider,
            plugin_provider_version=self.plugin_provider_version,
            wait_for_healthy=self.wait_for_healthy,
            wait_for_registration=self.wait_for_registration)


def get_plugin(plugin_id: Optional[str] = None,
               wait_for_healthy: Optional[bool] = None,
               wait_for_registration: Optional[bool] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPluginResult:
    """
    Lookup a plugin by ID. The aim of this datasource is to determine whether
    a particular plugin exists on the cluster, to find information on the health
    and availability of the plugin, and to optionally wait for the plugin
    before performing actions the require an available plugin controller.

    If a plugin with the specified ID does not exist and the datasource is not
    configured to wait, it will result in an error. For simple existence checks,
    use the `getPlugins` listing datasource.

    ## Example Usage

    Check for the existence of a plugin:

    ```python
    import pulumi
    import pulumi_nomad as nomad

    ebs = nomad.get_plugin(plugin_id="aws-ebs0",
        wait_for_healthy=True)
    ```

    This will check for a plugin with the ID `aws-ebs0`, waiting until the plugin
    is healthy before returning.
    """
    __args__ = dict()
    __args__['pluginId'] = plugin_id
    __args__['waitForHealthy'] = wait_for_healthy
    __args__['waitForRegistration'] = wait_for_registration
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('nomad:index/getPlugin:getPlugin', __args__, opts=opts, typ=GetPluginResult).value

    return AwaitableGetPluginResult(
        controller_required=__ret__.controller_required,
        controllers_expected=__ret__.controllers_expected,
        controllers_healthy=__ret__.controllers_healthy,
        id=__ret__.id,
        nodes=__ret__.nodes,
        nodes_expected=__ret__.nodes_expected,
        nodes_healthy=__ret__.nodes_healthy,
        plugin_id=__ret__.plugin_id,
        plugin_provider=__ret__.plugin_provider,
        plugin_provider_version=__ret__.plugin_provider_version,
        wait_for_healthy=__ret__.wait_for_healthy,
        wait_for_registration=__ret__.wait_for_registration)
