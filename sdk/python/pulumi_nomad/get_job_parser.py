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
    def canonicalize(self) -> Optional[builtins.bool]:
        """
        `(boolean: true)` - flag to enable setting any unset fields to their default values.
        """
        return pulumi.get(self, "canonicalize")

    @property
    @pulumi.getter
    def hcl(self) -> builtins.str:
        """
        `(string)` - the HCL definition of the job.
        """
        return pulumi.get(self, "hcl")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def json(self) -> builtins.str:
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


def get_job_parser(canonicalize: Optional[builtins.bool] = None,
                   hcl: Optional[builtins.str] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetJobParserResult:
    """
    Parse a HCL jobspec and produce the equivalent JSON encoded job.


    :param builtins.bool canonicalize: `(boolean: true)` - flag to enable setting any unset fields to their default values.
    :param builtins.str hcl: `(string)` - the HCL definition of the job.
    """
    __args__ = dict()
    __args__['canonicalize'] = canonicalize
    __args__['hcl'] = hcl
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('nomad:index/getJobParser:getJobParser', __args__, opts=opts, typ=GetJobParserResult).value

    return AwaitableGetJobParserResult(
        canonicalize=pulumi.get(__ret__, 'canonicalize'),
        hcl=pulumi.get(__ret__, 'hcl'),
        id=pulumi.get(__ret__, 'id'),
        json=pulumi.get(__ret__, 'json'))
def get_job_parser_output(canonicalize: Optional[pulumi.Input[Optional[builtins.bool]]] = None,
                          hcl: Optional[pulumi.Input[builtins.str]] = None,
                          opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetJobParserResult]:
    """
    Parse a HCL jobspec and produce the equivalent JSON encoded job.


    :param builtins.bool canonicalize: `(boolean: true)` - flag to enable setting any unset fields to their default values.
    :param builtins.str hcl: `(string)` - the HCL definition of the job.
    """
    __args__ = dict()
    __args__['canonicalize'] = canonicalize
    __args__['hcl'] = hcl
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('nomad:index/getJobParser:getJobParser', __args__, opts=opts, typ=GetJobParserResult)
    return __ret__.apply(lambda __response__: GetJobParserResult(
        canonicalize=pulumi.get(__response__, 'canonicalize'),
        hcl=pulumi.get(__response__, 'hcl'),
        id=pulumi.get(__response__, 'id'),
        json=pulumi.get(__response__, 'json')))
