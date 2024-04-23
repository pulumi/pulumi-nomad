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
    'GetScalingPoliciesResult',
    'AwaitableGetScalingPoliciesResult',
    'get_scaling_policies',
    'get_scaling_policies_output',
]

@pulumi.output_type
class GetScalingPoliciesResult:
    """
    A collection of values returned by getScalingPolicies.
    """
    def __init__(__self__, id=None, job_id=None, policies=None, type=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if job_id and not isinstance(job_id, str):
            raise TypeError("Expected argument 'job_id' to be a str")
        pulumi.set(__self__, "job_id", job_id)
        if policies and not isinstance(policies, list):
            raise TypeError("Expected argument 'policies' to be a list")
        pulumi.set(__self__, "policies", policies)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="jobId")
    def job_id(self) -> Optional[str]:
        return pulumi.get(self, "job_id")

    @property
    @pulumi.getter
    def policies(self) -> Sequence['outputs.GetScalingPoliciesPolicyResult']:
        """
        `list of maps` - A list of scaling policies.
        """
        return pulumi.get(self, "policies")

    @property
    @pulumi.getter
    def type(self) -> Optional[str]:
        """
        `(string)` - The scaling policy type.
        """
        return pulumi.get(self, "type")


class AwaitableGetScalingPoliciesResult(GetScalingPoliciesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetScalingPoliciesResult(
            id=self.id,
            job_id=self.job_id,
            policies=self.policies,
            type=self.type)


def get_scaling_policies(job_id: Optional[str] = None,
                         type: Optional[str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetScalingPoliciesResult:
    """
    Retrieve a list of Scaling Policies.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_nomad as nomad

    example = nomad.get_scaling_policies(job_id="webapp",
        type="horizontal")
    ```


    :param str job_id: `(string)` - An optional string to filter scaling policies based on the target job. If not provided, policies for all jobs are returned.
    :param str type: `(string)` - An optional string to filter scaling policies based on policy type. If not provided, policies of all types are returned.
    """
    __args__ = dict()
    __args__['jobId'] = job_id
    __args__['type'] = type
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('nomad:index/getScalingPolicies:getScalingPolicies', __args__, opts=opts, typ=GetScalingPoliciesResult).value

    return AwaitableGetScalingPoliciesResult(
        id=pulumi.get(__ret__, 'id'),
        job_id=pulumi.get(__ret__, 'job_id'),
        policies=pulumi.get(__ret__, 'policies'),
        type=pulumi.get(__ret__, 'type'))


@_utilities.lift_output_func(get_scaling_policies)
def get_scaling_policies_output(job_id: Optional[pulumi.Input[Optional[str]]] = None,
                                type: Optional[pulumi.Input[Optional[str]]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetScalingPoliciesResult]:
    """
    Retrieve a list of Scaling Policies.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_nomad as nomad

    example = nomad.get_scaling_policies(job_id="webapp",
        type="horizontal")
    ```


    :param str job_id: `(string)` - An optional string to filter scaling policies based on the target job. If not provided, policies for all jobs are returned.
    :param str type: `(string)` - An optional string to filter scaling policies based on policy type. If not provided, policies of all types are returned.
    """
    ...
