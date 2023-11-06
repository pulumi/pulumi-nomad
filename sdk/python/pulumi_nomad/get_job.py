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
    'GetJobResult',
    'AwaitableGetJobResult',
    'get_job',
    'get_job_output',
]

@pulumi.output_type
class GetJobResult:
    """
    A collection of values returned by getJob.
    """
    def __init__(__self__, all_at_once=None, constraints=None, create_index=None, datacenters=None, id=None, job_id=None, job_modify_index=None, modify_index=None, name=None, namespace=None, parent_id=None, periodic_configs=None, priority=None, region=None, stable=None, status=None, status_description=None, stop=None, submit_time=None, task_groups=None, type=None, version=None):
        if all_at_once and not isinstance(all_at_once, bool):
            raise TypeError("Expected argument 'all_at_once' to be a bool")
        pulumi.set(__self__, "all_at_once", all_at_once)
        if constraints and not isinstance(constraints, list):
            raise TypeError("Expected argument 'constraints' to be a list")
        pulumi.set(__self__, "constraints", constraints)
        if create_index and not isinstance(create_index, int):
            raise TypeError("Expected argument 'create_index' to be a int")
        pulumi.set(__self__, "create_index", create_index)
        if datacenters and not isinstance(datacenters, list):
            raise TypeError("Expected argument 'datacenters' to be a list")
        pulumi.set(__self__, "datacenters", datacenters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if job_id and not isinstance(job_id, str):
            raise TypeError("Expected argument 'job_id' to be a str")
        pulumi.set(__self__, "job_id", job_id)
        if job_modify_index and not isinstance(job_modify_index, int):
            raise TypeError("Expected argument 'job_modify_index' to be a int")
        pulumi.set(__self__, "job_modify_index", job_modify_index)
        if modify_index and not isinstance(modify_index, int):
            raise TypeError("Expected argument 'modify_index' to be a int")
        pulumi.set(__self__, "modify_index", modify_index)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if namespace and not isinstance(namespace, str):
            raise TypeError("Expected argument 'namespace' to be a str")
        pulumi.set(__self__, "namespace", namespace)
        if parent_id and not isinstance(parent_id, str):
            raise TypeError("Expected argument 'parent_id' to be a str")
        pulumi.set(__self__, "parent_id", parent_id)
        if periodic_configs and not isinstance(periodic_configs, list):
            raise TypeError("Expected argument 'periodic_configs' to be a list")
        pulumi.set(__self__, "periodic_configs", periodic_configs)
        if priority and not isinstance(priority, int):
            raise TypeError("Expected argument 'priority' to be a int")
        pulumi.set(__self__, "priority", priority)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if stable and not isinstance(stable, bool):
            raise TypeError("Expected argument 'stable' to be a bool")
        pulumi.set(__self__, "stable", stable)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if status_description and not isinstance(status_description, str):
            raise TypeError("Expected argument 'status_description' to be a str")
        pulumi.set(__self__, "status_description", status_description)
        if stop and not isinstance(stop, bool):
            raise TypeError("Expected argument 'stop' to be a bool")
        pulumi.set(__self__, "stop", stop)
        if submit_time and not isinstance(submit_time, int):
            raise TypeError("Expected argument 'submit_time' to be a int")
        pulumi.set(__self__, "submit_time", submit_time)
        if task_groups and not isinstance(task_groups, list):
            raise TypeError("Expected argument 'task_groups' to be a list")
        pulumi.set(__self__, "task_groups", task_groups)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
        if version and not isinstance(version, int):
            raise TypeError("Expected argument 'version' to be a int")
        pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter(name="allAtOnce")
    def all_at_once(self) -> bool:
        """
        `(boolean)`  If the scheduler can make partial placements on oversubscribed nodes.
        """
        return pulumi.get(self, "all_at_once")

    @property
    @pulumi.getter
    def constraints(self) -> Sequence['outputs.GetJobConstraintResult']:
        return pulumi.get(self, "constraints")

    @property
    @pulumi.getter(name="createIndex")
    def create_index(self) -> int:
        """
        `(integer)` Creation Index.
        """
        return pulumi.get(self, "create_index")

    @property
    @pulumi.getter
    def datacenters(self) -> Sequence[str]:
        """
        `(list of strings)` Datacenters allowed to run the specified job.
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
    @pulumi.getter(name="jobId")
    def job_id(self) -> str:
        return pulumi.get(self, "job_id")

    @property
    @pulumi.getter(name="jobModifyIndex")
    def job_modify_index(self) -> int:
        """
        `(integer)` Job modify index (used for version verification).
        """
        return pulumi.get(self, "job_modify_index")

    @property
    @pulumi.getter(name="modifyIndex")
    def modify_index(self) -> int:
        """
        `(integer)` Modification Index.
        """
        return pulumi.get(self, "modify_index")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        `(string)` Name of the job.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def namespace(self) -> Optional[str]:
        """
        `(string)` Namespace of the specified job.
        """
        return pulumi.get(self, "namespace")

    @property
    @pulumi.getter(name="parentId")
    def parent_id(self) -> str:
        """
        `(string)` Job's parent ID.
        """
        return pulumi.get(self, "parent_id")

    @property
    @pulumi.getter(name="periodicConfigs")
    def periodic_configs(self) -> Sequence['outputs.GetJobPeriodicConfigResult']:
        """
        `(list of maps)` Job's periodic configuration (time based scheduling).
        """
        return pulumi.get(self, "periodic_configs")

    @property
    @pulumi.getter
    def priority(self) -> int:
        """
        `(integer)` Used for the prioritization of scheduling and resource access.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter
    def region(self) -> str:
        """
        `(string)` Region where the Nomad cluster resides.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def stable(self) -> bool:
        """
        `(boolean)` Job stability status.
        """
        return pulumi.get(self, "stable")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        `(string)` Execution status of the specified job.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="statusDescription")
    def status_description(self) -> str:
        """
        `(string)` Status description of the specified job.
        """
        return pulumi.get(self, "status_description")

    @property
    @pulumi.getter
    def stop(self) -> bool:
        """
        `(boolean)` Job enabled status.
        """
        return pulumi.get(self, "stop")

    @property
    @pulumi.getter(name="submitTime")
    def submit_time(self) -> int:
        """
        `(integer)` Job submission date.
        """
        return pulumi.get(self, "submit_time")

    @property
    @pulumi.getter(name="taskGroups")
    def task_groups(self) -> Sequence['outputs.GetJobTaskGroupResult']:
        """
        `(list of maps)` A list of of the job's task groups.
        """
        return pulumi.get(self, "task_groups")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        `(string)` Scheduler type used during job creation.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def version(self) -> int:
        """
        `(integer)` Version of the specified job.
        """
        return pulumi.get(self, "version")


class AwaitableGetJobResult(GetJobResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetJobResult(
            all_at_once=self.all_at_once,
            constraints=self.constraints,
            create_index=self.create_index,
            datacenters=self.datacenters,
            id=self.id,
            job_id=self.job_id,
            job_modify_index=self.job_modify_index,
            modify_index=self.modify_index,
            name=self.name,
            namespace=self.namespace,
            parent_id=self.parent_id,
            periodic_configs=self.periodic_configs,
            priority=self.priority,
            region=self.region,
            stable=self.stable,
            status=self.status,
            status_description=self.status_description,
            stop=self.stop,
            submit_time=self.submit_time,
            task_groups=self.task_groups,
            type=self.type,
            version=self.version)


def get_job(job_id: Optional[str] = None,
            namespace: Optional[str] = None,
            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetJobResult:
    """
    Get information on a job ID. The aim of this datasource is to enable
    you to act on various settings and states of a particular job.

    An error is triggered if zero or more than one result is returned by the query.

    ## Example Usage

    Get the data about a snapshot:

    ```python
    import pulumi
    import pulumi_nomad as nomad

    example = nomad.get_job(job_id="example")
    ```


    :param str job_id: `(string)` ID of the job.
    :param str namespace: `(string)` Namespace of the specified job.
    """
    __args__ = dict()
    __args__['jobId'] = job_id
    __args__['namespace'] = namespace
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('nomad:index/getJob:getJob', __args__, opts=opts, typ=GetJobResult).value

    return AwaitableGetJobResult(
        all_at_once=pulumi.get(__ret__, 'all_at_once'),
        constraints=pulumi.get(__ret__, 'constraints'),
        create_index=pulumi.get(__ret__, 'create_index'),
        datacenters=pulumi.get(__ret__, 'datacenters'),
        id=pulumi.get(__ret__, 'id'),
        job_id=pulumi.get(__ret__, 'job_id'),
        job_modify_index=pulumi.get(__ret__, 'job_modify_index'),
        modify_index=pulumi.get(__ret__, 'modify_index'),
        name=pulumi.get(__ret__, 'name'),
        namespace=pulumi.get(__ret__, 'namespace'),
        parent_id=pulumi.get(__ret__, 'parent_id'),
        periodic_configs=pulumi.get(__ret__, 'periodic_configs'),
        priority=pulumi.get(__ret__, 'priority'),
        region=pulumi.get(__ret__, 'region'),
        stable=pulumi.get(__ret__, 'stable'),
        status=pulumi.get(__ret__, 'status'),
        status_description=pulumi.get(__ret__, 'status_description'),
        stop=pulumi.get(__ret__, 'stop'),
        submit_time=pulumi.get(__ret__, 'submit_time'),
        task_groups=pulumi.get(__ret__, 'task_groups'),
        type=pulumi.get(__ret__, 'type'),
        version=pulumi.get(__ret__, 'version'))


@_utilities.lift_output_func(get_job)
def get_job_output(job_id: Optional[pulumi.Input[str]] = None,
                   namespace: Optional[pulumi.Input[Optional[str]]] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetJobResult]:
    """
    Get information on a job ID. The aim of this datasource is to enable
    you to act on various settings and states of a particular job.

    An error is triggered if zero or more than one result is returned by the query.

    ## Example Usage

    Get the data about a snapshot:

    ```python
    import pulumi
    import pulumi_nomad as nomad

    example = nomad.get_job(job_id="example")
    ```


    :param str job_id: `(string)` ID of the job.
    :param str namespace: `(string)` Namespace of the specified job.
    """
    ...
