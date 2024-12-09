# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

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
from . import outputs

__all__ = [
    'GetAclTokensResult',
    'AwaitableGetAclTokensResult',
    'get_acl_tokens',
    'get_acl_tokens_output',
]

@pulumi.output_type
class GetAclTokensResult:
    """
    A collection of values returned by getAclTokens.
    """
    def __init__(__self__, acl_tokens=None, id=None, prefix=None):
        if acl_tokens and not isinstance(acl_tokens, list):
            raise TypeError("Expected argument 'acl_tokens' to be a list")
        pulumi.set(__self__, "acl_tokens", acl_tokens)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if prefix and not isinstance(prefix, str):
            raise TypeError("Expected argument 'prefix' to be a str")
        pulumi.set(__self__, "prefix", prefix)

    @property
    @pulumi.getter(name="aclTokens")
    def acl_tokens(self) -> Sequence['outputs.GetAclTokensAclTokenResult']:
        """
        `(list of objects)` The list of tokens found in the given prefix.
        """
        return pulumi.get(self, "acl_tokens")

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


class AwaitableGetAclTokensResult(GetAclTokensResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAclTokensResult(
            acl_tokens=self.acl_tokens,
            id=self.id,
            prefix=self.prefix)


def get_acl_tokens(prefix: Optional[str] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAclTokensResult:
    """
    Get a list of ACL tokens.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_nomad as nomad

    tokens = nomad.get_acl_tokens(prefix="a242")
    ```


    :param str prefix: `(string)` Optional prefix to filter the tokens.
    """
    __args__ = dict()
    __args__['prefix'] = prefix
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('nomad:index/getAclTokens:getAclTokens', __args__, opts=opts, typ=GetAclTokensResult).value

    return AwaitableGetAclTokensResult(
        acl_tokens=pulumi.get(__ret__, 'acl_tokens'),
        id=pulumi.get(__ret__, 'id'),
        prefix=pulumi.get(__ret__, 'prefix'))
def get_acl_tokens_output(prefix: Optional[pulumi.Input[Optional[str]]] = None,
                          opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetAclTokensResult]:
    """
    Get a list of ACL tokens.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_nomad as nomad

    tokens = nomad.get_acl_tokens(prefix="a242")
    ```


    :param str prefix: `(string)` Optional prefix to filter the tokens.
    """
    __args__ = dict()
    __args__['prefix'] = prefix
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('nomad:index/getAclTokens:getAclTokens', __args__, opts=opts, typ=GetAclTokensResult)
    return __ret__.apply(lambda __response__: GetAclTokensResult(
        acl_tokens=pulumi.get(__response__, 'acl_tokens'),
        id=pulumi.get(__response__, 'id'),
        prefix=pulumi.get(__response__, 'prefix')))
