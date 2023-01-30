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
    'GetJobParserResult',
    'AwaitableGetJobParserResult',
    'get_job_parser',
    'get_job_parser_output',
]

@pulumi.output_type
class GetJobParserResult:
    """
    A collection of values returned by getJobParser.
    """
    def __init__(__self__, canonicalize=None, hcl=None, id=None, json=None):
        if canonicalize and not isinstance(canonicalize, bool):
            raise TypeError("Expected argument 'canonicalize' to be a bool")
        pulumi.set(__self__, "canonicalize", canonicalize)
        if hcl and not isinstance(hcl, str):
            raise TypeError("Expected argument 'hcl' to be a str")
        pulumi.set(__self__, "hcl", hcl)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if json and not isinstance(json, str):
            raise TypeError("Expected argument 'json' to be a str")
        pulumi.set(__self__, "json", json)

    @property
    @pulumi.getter
    def canonicalize(self) -> Optional[bool]:
        """
        `(boolean: true)` - flag to enable setting any unset fields to their default values.
        """
        return pulumi.get(self, "canonicalize")

    @property
    @pulumi.getter
    def hcl(self) -> str:
        """
        `(string)` - the HCL definition of the job.
        """
        return pulumi.get(self, "hcl")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def json(self) -> str:
        """
        `(string)` - the parsed job as JSON string.
        """
        return pulumi.get(self, "json")


class AwaitableGetJobParserResult(GetJobParserResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetJobParserResult(
            canonicalize=self.canonicalize,
            hcl=self.hcl,
            id=self.id,
            json=self.json)


def get_job_parser(canonicalize: Optional[bool] = None,
                   hcl: Optional[str] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetJobParserResult:
    """
    Parse a HCL jobspec and produce the equivalent JSON encoded job.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_nomad as nomad

    my_job = nomad.get_job_parser(hcl=(lambda path: open(path).read())(f"{path['module']}/jobspec.hcl"),
        canonicalize=False)
    ```


    :param bool canonicalize: `(boolean: true)` - flag to enable setting any unset fields to their default values.
    :param str hcl: `(string)` - the HCL definition of the job.
    """
    __args__ = dict()
    __args__['canonicalize'] = canonicalize
    __args__['hcl'] = hcl
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('nomad:index/getJobParser:getJobParser', __args__, opts=opts, typ=GetJobParserResult).value

    return AwaitableGetJobParserResult(
        canonicalize=__ret__.canonicalize,
        hcl=__ret__.hcl,
        id=__ret__.id,
        json=__ret__.json)


@_utilities.lift_output_func(get_job_parser)
def get_job_parser_output(canonicalize: Optional[pulumi.Input[Optional[bool]]] = None,
                          hcl: Optional[pulumi.Input[str]] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetJobParserResult]:
    """
    Parse a HCL jobspec and produce the equivalent JSON encoded job.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_nomad as nomad

    my_job = nomad.get_job_parser(hcl=(lambda path: open(path).read())(f"{path['module']}/jobspec.hcl"),
        canonicalize=False)
    ```


    :param bool canonicalize: `(boolean: true)` - flag to enable setting any unset fields to their default values.
    :param str hcl: `(string)` - the HCL definition of the job.
    """
    ...
