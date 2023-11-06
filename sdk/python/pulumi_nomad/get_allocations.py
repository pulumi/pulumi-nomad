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

__all__ = [
    'GetAllocationsResult',
    'AwaitableGetAllocationsResult',
    'get_allocations',
    'get_allocations_output',
]

@pulumi.output_type
class GetAllocationsResult:
    """
    A collection of values returned by getAllocations.
    """
    def __init__(__self__, allocations=None, filter=None, id=None, prefix=None):
        if allocations and not isinstance(allocations, list):
            raise TypeError("Expected argument 'allocations' to be a list")
        pulumi.set(__self__, "allocations", allocations)
        if filter and not isinstance(filter, str):
            raise TypeError("Expected argument 'filter' to be a str")
        pulumi.set(__self__, "filter", filter)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if prefix and not isinstance(prefix, str):
            raise TypeError("Expected argument 'prefix' to be a str")
        pulumi.set(__self__, "prefix", prefix)

    @property
    @pulumi.getter
    def allocations(self) -> Sequence['outputs.GetAllocationsAllocationResult']:
        """
        `(list of allocations)` - A list of allocations matching the
        search criteria.
        """
        return pulumi.get(self, "allocations")

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
    @pulumi.getter
    def prefix(self) -> Optional[str]:
        return pulumi.get(self, "prefix")


class AwaitableGetAllocationsResult(GetAllocationsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAllocationsResult(
            allocations=self.allocations,
            filter=self.filter,
            id=self.id,
            prefix=self.prefix)


def get_allocations(filter: Optional[str] = None,
                    prefix: Optional[str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAllocationsResult:
    """
    Retrieve a list of allocations from Nomad.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_nomad as nomad

    example = nomad.get_allocations(filter="JobID == \\"example\\"")
    ```


    :param str filter: `(string: <optional>)` - Specifies the
           [expression][nomad_api_filter] used to filter the results.
    :param str prefix: `(string: <optional>)` - Specifies a string to filter allocations
           based on an ID prefix.
    """
    __args__ = dict()
    __args__['filter'] = filter
    __args__['prefix'] = prefix
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('nomad:index/getAllocations:getAllocations', __args__, opts=opts, typ=GetAllocationsResult).value

    return AwaitableGetAllocationsResult(
        allocations=pulumi.get(__ret__, 'allocations'),
        filter=pulumi.get(__ret__, 'filter'),
        id=pulumi.get(__ret__, 'id'),
        prefix=pulumi.get(__ret__, 'prefix'))


@_utilities.lift_output_func(get_allocations)
def get_allocations_output(filter: Optional[pulumi.Input[Optional[str]]] = None,
                           prefix: Optional[pulumi.Input[Optional[str]]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAllocationsResult]:
    """
    Retrieve a list of allocations from Nomad.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_nomad as nomad

    example = nomad.get_allocations(filter="JobID == \\"example\\"")
    ```


    :param str filter: `(string: <optional>)` - Specifies the
           [expression][nomad_api_filter] used to filter the results.
    :param str prefix: `(string: <optional>)` - Specifies a string to filter allocations
           based on an ID prefix.
    """
    ...
