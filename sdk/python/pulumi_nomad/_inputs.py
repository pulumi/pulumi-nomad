# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'ExternalVolumeCapabilityArgs',
    'ExternalVolumeMountOptionsArgs',
    'JobHcl2Args',
    'JobTaskGroupArgs',
    'JobTaskGroupTaskArgs',
    'JobTaskGroupTaskVolumeMountArgs',
    'JobTaskGroupVolumeArgs',
    'ProviderHeaderArgs',
    'QuoteSpecificationLimitArgs',
    'QuoteSpecificationLimitRegionLimitArgs',
    'VolumeCapabilityArgs',
    'VolumeMountOptionsArgs',
]

@pulumi.input_type
class ExternalVolumeCapabilityArgs:
    def __init__(__self__, *,
                 access_mode: pulumi.Input[str],
                 attachment_mode: pulumi.Input[str]):
        pulumi.set(__self__, "access_mode", access_mode)
        pulumi.set(__self__, "attachment_mode", attachment_mode)

    @property
    @pulumi.getter(name="accessMode")
    def access_mode(self) -> pulumi.Input[str]:
        return pulumi.get(self, "access_mode")

    @access_mode.setter
    def access_mode(self, value: pulumi.Input[str]):
        pulumi.set(self, "access_mode", value)

    @property
    @pulumi.getter(name="attachmentMode")
    def attachment_mode(self) -> pulumi.Input[str]:
        return pulumi.get(self, "attachment_mode")

    @attachment_mode.setter
    def attachment_mode(self, value: pulumi.Input[str]):
        pulumi.set(self, "attachment_mode", value)


@pulumi.input_type
class ExternalVolumeMountOptionsArgs:
    def __init__(__self__, *,
                 fs_type: Optional[pulumi.Input[str]] = None,
                 mount_flags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        if fs_type is not None:
            pulumi.set(__self__, "fs_type", fs_type)
        if mount_flags is not None:
            pulumi.set(__self__, "mount_flags", mount_flags)

    @property
    @pulumi.getter(name="fsType")
    def fs_type(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "fs_type")

    @fs_type.setter
    def fs_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "fs_type", value)

    @property
    @pulumi.getter(name="mountFlags")
    def mount_flags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "mount_flags")

    @mount_flags.setter
    def mount_flags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "mount_flags", value)


@pulumi.input_type
class JobHcl2Args:
    def __init__(__self__, *,
                 allow_fs: Optional[pulumi.Input[bool]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 vars: Optional[pulumi.Input[Mapping[str, Any]]] = None):
        """
        :param pulumi.Input[bool] allow_fs: `(boolean: false)` - Set this to `true` to be able to use
               HCL2 filesystem functions
        :param pulumi.Input[bool] enabled: `(boolean: false)` - Set this to `true` if your jobspec uses the HCL2
               format instead of the default HCL.
        """
        if allow_fs is not None:
            pulumi.set(__self__, "allow_fs", allow_fs)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if vars is not None:
            pulumi.set(__self__, "vars", vars)

    @property
    @pulumi.getter(name="allowFs")
    def allow_fs(self) -> Optional[pulumi.Input[bool]]:
        """
        `(boolean: false)` - Set this to `true` to be able to use
        HCL2 filesystem functions
        """
        return pulumi.get(self, "allow_fs")

    @allow_fs.setter
    def allow_fs(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_fs", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        `(boolean: false)` - Set this to `true` if your jobspec uses the HCL2
        format instead of the default HCL.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def vars(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        return pulumi.get(self, "vars")

    @vars.setter
    def vars(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "vars", value)


@pulumi.input_type
class JobTaskGroupArgs:
    def __init__(__self__, *,
                 count: Optional[pulumi.Input[int]] = None,
                 meta: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tasks: Optional[pulumi.Input[Sequence[pulumi.Input['JobTaskGroupTaskArgs']]]] = None,
                 volumes: Optional[pulumi.Input[Sequence[pulumi.Input['JobTaskGroupVolumeArgs']]]] = None):
        if count is not None:
            pulumi.set(__self__, "count", count)
        if meta is not None:
            pulumi.set(__self__, "meta", meta)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tasks is not None:
            pulumi.set(__self__, "tasks", tasks)
        if volumes is not None:
            pulumi.set(__self__, "volumes", volumes)

    @property
    @pulumi.getter
    def count(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "count")

    @count.setter
    def count(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "count", value)

    @property
    @pulumi.getter
    def meta(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        return pulumi.get(self, "meta")

    @meta.setter
    def meta(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "meta", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tasks(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['JobTaskGroupTaskArgs']]]]:
        return pulumi.get(self, "tasks")

    @tasks.setter
    def tasks(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['JobTaskGroupTaskArgs']]]]):
        pulumi.set(self, "tasks", value)

    @property
    @pulumi.getter
    def volumes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['JobTaskGroupVolumeArgs']]]]:
        return pulumi.get(self, "volumes")

    @volumes.setter
    def volumes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['JobTaskGroupVolumeArgs']]]]):
        pulumi.set(self, "volumes", value)


@pulumi.input_type
class JobTaskGroupTaskArgs:
    def __init__(__self__, *,
                 driver: Optional[pulumi.Input[str]] = None,
                 meta: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 volume_mounts: Optional[pulumi.Input[Sequence[pulumi.Input['JobTaskGroupTaskVolumeMountArgs']]]] = None):
        if driver is not None:
            pulumi.set(__self__, "driver", driver)
        if meta is not None:
            pulumi.set(__self__, "meta", meta)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if volume_mounts is not None:
            pulumi.set(__self__, "volume_mounts", volume_mounts)

    @property
    @pulumi.getter
    def driver(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "driver")

    @driver.setter
    def driver(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "driver", value)

    @property
    @pulumi.getter
    def meta(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        return pulumi.get(self, "meta")

    @meta.setter
    def meta(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "meta", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="volumeMounts")
    def volume_mounts(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['JobTaskGroupTaskVolumeMountArgs']]]]:
        return pulumi.get(self, "volume_mounts")

    @volume_mounts.setter
    def volume_mounts(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['JobTaskGroupTaskVolumeMountArgs']]]]):
        pulumi.set(self, "volume_mounts", value)


@pulumi.input_type
class JobTaskGroupTaskVolumeMountArgs:
    def __init__(__self__, *,
                 destination: Optional[pulumi.Input[str]] = None,
                 read_only: Optional[pulumi.Input[bool]] = None,
                 volume: Optional[pulumi.Input[str]] = None):
        if destination is not None:
            pulumi.set(__self__, "destination", destination)
        if read_only is not None:
            pulumi.set(__self__, "read_only", read_only)
        if volume is not None:
            pulumi.set(__self__, "volume", volume)

    @property
    @pulumi.getter
    def destination(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "destination")

    @destination.setter
    def destination(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "destination", value)

    @property
    @pulumi.getter(name="readOnly")
    def read_only(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "read_only")

    @read_only.setter
    def read_only(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "read_only", value)

    @property
    @pulumi.getter
    def volume(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "volume")

    @volume.setter
    def volume(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "volume", value)


@pulumi.input_type
class JobTaskGroupVolumeArgs:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[str]] = None,
                 read_only: Optional[pulumi.Input[bool]] = None,
                 source: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        if name is not None:
            pulumi.set(__self__, "name", name)
        if read_only is not None:
            pulumi.set(__self__, "read_only", read_only)
        if source is not None:
            pulumi.set(__self__, "source", source)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="readOnly")
    def read_only(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "read_only")

    @read_only.setter
    def read_only(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "read_only", value)

    @property
    @pulumi.getter
    def source(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "source")

    @source.setter
    def source(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class ProviderHeaderArgs:
    def __init__(__self__, *,
                 name: pulumi.Input[str],
                 value: pulumi.Input[str]):
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def value(self) -> pulumi.Input[str]:
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: pulumi.Input[str]):
        pulumi.set(self, "value", value)


@pulumi.input_type
class QuoteSpecificationLimitArgs:
    def __init__(__self__, *,
                 region: pulumi.Input[str],
                 region_limit: pulumi.Input['QuoteSpecificationLimitRegionLimitArgs']):
        """
        :param pulumi.Input[str] region: `(string: <required>)` - The region these limits should apply to.
        :param pulumi.Input['QuoteSpecificationLimitRegionLimitArgs'] region_limit: `(block: <required>)` - The limits to enforce. This block
               may only be specified once in the `limits` block. Its structure is
               documented below.
        """
        pulumi.set(__self__, "region", region)
        pulumi.set(__self__, "region_limit", region_limit)

    @property
    @pulumi.getter
    def region(self) -> pulumi.Input[str]:
        """
        `(string: <required>)` - The region these limits should apply to.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: pulumi.Input[str]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter(name="regionLimit")
    def region_limit(self) -> pulumi.Input['QuoteSpecificationLimitRegionLimitArgs']:
        """
        `(block: <required>)` - The limits to enforce. This block
        may only be specified once in the `limits` block. Its structure is
        documented below.
        """
        return pulumi.get(self, "region_limit")

    @region_limit.setter
    def region_limit(self, value: pulumi.Input['QuoteSpecificationLimitRegionLimitArgs']):
        pulumi.set(self, "region_limit", value)


@pulumi.input_type
class QuoteSpecificationLimitRegionLimitArgs:
    def __init__(__self__, *,
                 cpu: Optional[pulumi.Input[int]] = None,
                 memory_mb: Optional[pulumi.Input[int]] = None):
        """
        :param pulumi.Input[int] cpu: `(int: 0)` - The amount of CPU to limit allocations to. A value of zero
               is treated as unlimited, and a negative value is treated as fully disallowed.
        :param pulumi.Input[int] memory_mb: `(int: 0)` - The amount of memory (in megabytes) to limit
               allocations to. A value of zero is treated as unlimited, and a negative value
               is treated as fully disallowed.
        """
        if cpu is not None:
            pulumi.set(__self__, "cpu", cpu)
        if memory_mb is not None:
            pulumi.set(__self__, "memory_mb", memory_mb)

    @property
    @pulumi.getter
    def cpu(self) -> Optional[pulumi.Input[int]]:
        """
        `(int: 0)` - The amount of CPU to limit allocations to. A value of zero
        is treated as unlimited, and a negative value is treated as fully disallowed.
        """
        return pulumi.get(self, "cpu")

    @cpu.setter
    def cpu(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "cpu", value)

    @property
    @pulumi.getter(name="memoryMb")
    def memory_mb(self) -> Optional[pulumi.Input[int]]:
        """
        `(int: 0)` - The amount of memory (in megabytes) to limit
        allocations to. A value of zero is treated as unlimited, and a negative value
        is treated as fully disallowed.
        """
        return pulumi.get(self, "memory_mb")

    @memory_mb.setter
    def memory_mb(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "memory_mb", value)


@pulumi.input_type
class VolumeCapabilityArgs:
    def __init__(__self__, *,
                 access_mode: pulumi.Input[str],
                 attachment_mode: pulumi.Input[str]):
        pulumi.set(__self__, "access_mode", access_mode)
        pulumi.set(__self__, "attachment_mode", attachment_mode)

    @property
    @pulumi.getter(name="accessMode")
    def access_mode(self) -> pulumi.Input[str]:
        return pulumi.get(self, "access_mode")

    @access_mode.setter
    def access_mode(self, value: pulumi.Input[str]):
        pulumi.set(self, "access_mode", value)

    @property
    @pulumi.getter(name="attachmentMode")
    def attachment_mode(self) -> pulumi.Input[str]:
        return pulumi.get(self, "attachment_mode")

    @attachment_mode.setter
    def attachment_mode(self, value: pulumi.Input[str]):
        pulumi.set(self, "attachment_mode", value)


@pulumi.input_type
class VolumeMountOptionsArgs:
    def __init__(__self__, *,
                 fs_type: Optional[pulumi.Input[str]] = None,
                 mount_flags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        if fs_type is not None:
            pulumi.set(__self__, "fs_type", fs_type)
        if mount_flags is not None:
            pulumi.set(__self__, "mount_flags", mount_flags)

    @property
    @pulumi.getter(name="fsType")
    def fs_type(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "fs_type")

    @fs_type.setter
    def fs_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "fs_type", value)

    @property
    @pulumi.getter(name="mountFlags")
    def mount_flags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "mount_flags")

    @mount_flags.setter
    def mount_flags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "mount_flags", value)

