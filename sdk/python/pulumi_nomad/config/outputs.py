# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
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
from .. import _utilities

__all__ = [
    'Headers',
]

@pulumi.output_type
class Headers(dict):
    def __init__(__self__, *,
                 name: builtins.str,
                 value: builtins.str):
        """
        :param builtins.str name: The header name
        :param builtins.str value: The header value
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def name(self) -> builtins.str:
        """
        The header name
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def value(self) -> builtins.str:
        """
        The header value
        """
        return pulumi.get(self, "value")


