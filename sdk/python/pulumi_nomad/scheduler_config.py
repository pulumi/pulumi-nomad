# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
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

__all__ = ['SchedulerConfigArgs', 'SchedulerConfig']

@pulumi.input_type
class SchedulerConfigArgs:
    def __init__(__self__, *,
                 memory_oversubscription_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 preemption_config: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.bool]]]] = None,
                 scheduler_algorithm: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a SchedulerConfig resource.
        :param pulumi.Input[_builtins.bool] memory_oversubscription_enabled: `(bool: false)` - When `true`, tasks may exceed their reserved memory limit.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.bool]]] preemption_config: `(map[string]bool)` - Options to enable preemption for various schedulers.
        :param pulumi.Input[_builtins.str] scheduler_algorithm: `(string: "binpack")` - Specifies whether scheduler binpacks or spreads allocations on available nodes. Possible values are `binpack` and `spread`.
        """
        if memory_oversubscription_enabled is not None:
            pulumi.set(__self__, "memory_oversubscription_enabled", memory_oversubscription_enabled)
        if preemption_config is not None:
            pulumi.set(__self__, "preemption_config", preemption_config)
        if scheduler_algorithm is not None:
            pulumi.set(__self__, "scheduler_algorithm", scheduler_algorithm)

    @_builtins.property
    @pulumi.getter(name="memoryOversubscriptionEnabled")
    def memory_oversubscription_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        `(bool: false)` - When `true`, tasks may exceed their reserved memory limit.
        """
        return pulumi.get(self, "memory_oversubscription_enabled")

    @memory_oversubscription_enabled.setter
    def memory_oversubscription_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "memory_oversubscription_enabled", value)

    @_builtins.property
    @pulumi.getter(name="preemptionConfig")
    def preemption_config(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.bool]]]]:
        """
        `(map[string]bool)` - Options to enable preemption for various schedulers.
        """
        return pulumi.get(self, "preemption_config")

    @preemption_config.setter
    def preemption_config(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.bool]]]]):
        pulumi.set(self, "preemption_config", value)

    @_builtins.property
    @pulumi.getter(name="schedulerAlgorithm")
    def scheduler_algorithm(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        `(string: "binpack")` - Specifies whether scheduler binpacks or spreads allocations on available nodes. Possible values are `binpack` and `spread`.
        """
        return pulumi.get(self, "scheduler_algorithm")

    @scheduler_algorithm.setter
    def scheduler_algorithm(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "scheduler_algorithm", value)


@pulumi.input_type
class _SchedulerConfigState:
    def __init__(__self__, *,
                 memory_oversubscription_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 preemption_config: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.bool]]]] = None,
                 scheduler_algorithm: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering SchedulerConfig resources.
        :param pulumi.Input[_builtins.bool] memory_oversubscription_enabled: `(bool: false)` - When `true`, tasks may exceed their reserved memory limit.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.bool]]] preemption_config: `(map[string]bool)` - Options to enable preemption for various schedulers.
        :param pulumi.Input[_builtins.str] scheduler_algorithm: `(string: "binpack")` - Specifies whether scheduler binpacks or spreads allocations on available nodes. Possible values are `binpack` and `spread`.
        """
        if memory_oversubscription_enabled is not None:
            pulumi.set(__self__, "memory_oversubscription_enabled", memory_oversubscription_enabled)
        if preemption_config is not None:
            pulumi.set(__self__, "preemption_config", preemption_config)
        if scheduler_algorithm is not None:
            pulumi.set(__self__, "scheduler_algorithm", scheduler_algorithm)

    @_builtins.property
    @pulumi.getter(name="memoryOversubscriptionEnabled")
    def memory_oversubscription_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        `(bool: false)` - When `true`, tasks may exceed their reserved memory limit.
        """
        return pulumi.get(self, "memory_oversubscription_enabled")

    @memory_oversubscription_enabled.setter
    def memory_oversubscription_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "memory_oversubscription_enabled", value)

    @_builtins.property
    @pulumi.getter(name="preemptionConfig")
    def preemption_config(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.bool]]]]:
        """
        `(map[string]bool)` - Options to enable preemption for various schedulers.
        """
        return pulumi.get(self, "preemption_config")

    @preemption_config.setter
    def preemption_config(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.bool]]]]):
        pulumi.set(self, "preemption_config", value)

    @_builtins.property
    @pulumi.getter(name="schedulerAlgorithm")
    def scheduler_algorithm(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        `(string: "binpack")` - Specifies whether scheduler binpacks or spreads allocations on available nodes. Possible values are `binpack` and `spread`.
        """
        return pulumi.get(self, "scheduler_algorithm")

    @scheduler_algorithm.setter
    def scheduler_algorithm(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "scheduler_algorithm", value)


@pulumi.type_token("nomad:index/schedulerConfig:SchedulerConfig")
class SchedulerConfig(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 memory_oversubscription_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 preemption_config: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.bool]]]] = None,
                 scheduler_algorithm: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages scheduler configuration of the Nomad cluster.

        > **Warning:** destroying this resource will not have any effect in the
        cluster configuration, since there's no clear definition of what a destroy
        action should do. The cluster will be left as-is and only the state reference
        will be removed.

        ## Example Usage

        Set cluster scheduler configuration:

        ```python
        import pulumi
        import pulumi_nomad as nomad

        config = nomad.SchedulerConfig("config",
            scheduler_algorithm="spread",
            memory_oversubscription_enabled=True,
            preemption_config={
                "system_scheduler_enabled": True,
                "batch_scheduler_enabled": True,
                "service_scheduler_enabled": True,
                "sysbatch_scheduler_enabled": True,
            })
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] memory_oversubscription_enabled: `(bool: false)` - When `true`, tasks may exceed their reserved memory limit.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.bool]]] preemption_config: `(map[string]bool)` - Options to enable preemption for various schedulers.
        :param pulumi.Input[_builtins.str] scheduler_algorithm: `(string: "binpack")` - Specifies whether scheduler binpacks or spreads allocations on available nodes. Possible values are `binpack` and `spread`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[SchedulerConfigArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages scheduler configuration of the Nomad cluster.

        > **Warning:** destroying this resource will not have any effect in the
        cluster configuration, since there's no clear definition of what a destroy
        action should do. The cluster will be left as-is and only the state reference
        will be removed.

        ## Example Usage

        Set cluster scheduler configuration:

        ```python
        import pulumi
        import pulumi_nomad as nomad

        config = nomad.SchedulerConfig("config",
            scheduler_algorithm="spread",
            memory_oversubscription_enabled=True,
            preemption_config={
                "system_scheduler_enabled": True,
                "batch_scheduler_enabled": True,
                "service_scheduler_enabled": True,
                "sysbatch_scheduler_enabled": True,
            })
        ```

        :param str resource_name: The name of the resource.
        :param SchedulerConfigArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SchedulerConfigArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 memory_oversubscription_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 preemption_config: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.bool]]]] = None,
                 scheduler_algorithm: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SchedulerConfigArgs.__new__(SchedulerConfigArgs)

            __props__.__dict__["memory_oversubscription_enabled"] = memory_oversubscription_enabled
            __props__.__dict__["preemption_config"] = preemption_config
            __props__.__dict__["scheduler_algorithm"] = scheduler_algorithm
        super(SchedulerConfig, __self__).__init__(
            'nomad:index/schedulerConfig:SchedulerConfig',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            memory_oversubscription_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
            preemption_config: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.bool]]]] = None,
            scheduler_algorithm: Optional[pulumi.Input[_builtins.str]] = None) -> 'SchedulerConfig':
        """
        Get an existing SchedulerConfig resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] memory_oversubscription_enabled: `(bool: false)` - When `true`, tasks may exceed their reserved memory limit.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.bool]]] preemption_config: `(map[string]bool)` - Options to enable preemption for various schedulers.
        :param pulumi.Input[_builtins.str] scheduler_algorithm: `(string: "binpack")` - Specifies whether scheduler binpacks or spreads allocations on available nodes. Possible values are `binpack` and `spread`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SchedulerConfigState.__new__(_SchedulerConfigState)

        __props__.__dict__["memory_oversubscription_enabled"] = memory_oversubscription_enabled
        __props__.__dict__["preemption_config"] = preemption_config
        __props__.__dict__["scheduler_algorithm"] = scheduler_algorithm
        return SchedulerConfig(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="memoryOversubscriptionEnabled")
    def memory_oversubscription_enabled(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        `(bool: false)` - When `true`, tasks may exceed their reserved memory limit.
        """
        return pulumi.get(self, "memory_oversubscription_enabled")

    @_builtins.property
    @pulumi.getter(name="preemptionConfig")
    def preemption_config(self) -> pulumi.Output[Optional[Mapping[str, _builtins.bool]]]:
        """
        `(map[string]bool)` - Options to enable preemption for various schedulers.
        """
        return pulumi.get(self, "preemption_config")

    @_builtins.property
    @pulumi.getter(name="schedulerAlgorithm")
    def scheduler_algorithm(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        `(string: "binpack")` - Specifies whether scheduler binpacks or spreads allocations on available nodes. Possible values are `binpack` and `spread`.
        """
        return pulumi.get(self, "scheduler_algorithm")

