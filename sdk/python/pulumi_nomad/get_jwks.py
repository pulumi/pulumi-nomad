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
    'GetJwksResult',
    'AwaitableGetJwksResult',
    'get_jwks',
    'get_jwks_output',
]

@pulumi.output_type
class GetJwksResult:
    """
    A collection of values returned by getJwks.
    """
    def __init__(__self__, id=None, keys=None, pem_keys=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if keys and not isinstance(keys, list):
            raise TypeError("Expected argument 'keys' to be a list")
        pulumi.set(__self__, "keys", keys)
        if pem_keys and not isinstance(pem_keys, list):
            raise TypeError("Expected argument 'pem_keys' to be a list")
        pulumi.set(__self__, "pem_keys", pem_keys)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def keys(self) -> Sequence['outputs.GetJwksKeyResult']:
        """
        `list of maps` a list of JWK keys in structured format: see [RFC7517](https://datatracker.ietf.org/doc/html/rfc7517) for the
        JWK field meanings.
        """
        return pulumi.get(self, "keys")

    @property
    @pulumi.getter(name="pemKeys")
    def pem_keys(self) -> Sequence[str]:
        """
        `list of strings` a list JWK keys rendered as PEM-encoded X.509 keys
        """
        return pulumi.get(self, "pem_keys")


class AwaitableGetJwksResult(GetJwksResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetJwksResult(
            id=self.id,
            keys=self.keys,
            pem_keys=self.pem_keys)


def get_jwks(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetJwksResult:
    """
    Retrieve the cluster JWKS public keys.

    The keys are returned both as a list of maps (`keys`), and as a list of PEM-encoded strings
    (`pem_keys`), which may be more convenient for use.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_nomad as nomad

    example = nomad.get_jwks()
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('nomad:index/getJwks:getJwks', __args__, opts=opts, typ=GetJwksResult).value

    return AwaitableGetJwksResult(
        id=pulumi.get(__ret__, 'id'),
        keys=pulumi.get(__ret__, 'keys'),
        pem_keys=pulumi.get(__ret__, 'pem_keys'))
def get_jwks_output(opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetJwksResult]:
    """
    Retrieve the cluster JWKS public keys.

    The keys are returned both as a list of maps (`keys`), and as a list of PEM-encoded strings
    (`pem_keys`), which may be more convenient for use.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_nomad as nomad

    example = nomad.get_jwks()
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('nomad:index/getJwks:getJwks', __args__, opts=opts, typ=GetJwksResult)
    return __ret__.apply(lambda __response__: GetJwksResult(
        id=pulumi.get(__response__, 'id'),
        keys=pulumi.get(__response__, 'keys'),
        pem_keys=pulumi.get(__response__, 'pem_keys')))
