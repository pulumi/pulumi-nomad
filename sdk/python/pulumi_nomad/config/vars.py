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
from .. import _utilities
from . import outputs

import types

__config__ = pulumi.Config('nomad')


class _ExportableConfig(types.ModuleType):
    @property
    def address(self) -> Optional[str]:
        """
        URL of the root of the target Nomad agent.
        """
        return __config__.get('address')

    @property
    def ca_file(self) -> Optional[str]:
        """
        A path to a PEM-encoded certificate authority used to verify the remote agent's certificate.
        """
        return __config__.get('caFile')

    @property
    def ca_pem(self) -> Optional[str]:
        """
        PEM-encoded certificate authority used to verify the remote agent's certificate.
        """
        return __config__.get('caPem')

    @property
    def cert_file(self) -> Optional[str]:
        """
        A path to a PEM-encoded certificate provided to the remote agent; requires use of key_file or key_pem.
        """
        return __config__.get('certFile')

    @property
    def cert_pem(self) -> Optional[str]:
        """
        PEM-encoded certificate provided to the remote agent; requires use of key_file or key_pem.
        """
        return __config__.get('certPem')

    @property
    def consul_token(self) -> Optional[str]:
        """
        Consul token to validate Consul Connect Service Identity policies specified in the job file.
        """
        return __config__.get('consulToken')

    @property
    def headers(self) -> Optional[str]:
        """
        The headers to send with each Nomad request.
        """
        return __config__.get('headers')

    @property
    def http_auth(self) -> Optional[str]:
        """
        HTTP basic auth configuration.
        """
        return __config__.get('httpAuth')

    @property
    def ignore_env_vars(self) -> Optional[str]:
        """
        A set of environment variables that are ignored by the provider when configuring the Nomad API client.
        """
        return __config__.get('ignoreEnvVars')

    @property
    def key_file(self) -> Optional[str]:
        """
        A path to a PEM-encoded private key, required if cert_file or cert_pem is specified.
        """
        return __config__.get('keyFile')

    @property
    def key_pem(self) -> Optional[str]:
        """
        PEM-encoded private key, required if cert_file or cert_pem is specified.
        """
        return __config__.get('keyPem')

    @property
    def region(self) -> Optional[str]:
        """
        Region of the target Nomad agent.
        """
        return __config__.get('region')

    @property
    def secret_id(self) -> Optional[str]:
        """
        ACL token secret for API requests.
        """
        return __config__.get('secretId')

    @property
    def skip_verify(self) -> Optional[bool]:
        """
        Skip TLS verification on client side.
        """
        return __config__.get_bool('skipVerify')

    @property
    def vault_token(self) -> Optional[str]:
        """
        Vault token if policies are specified in the job file.
        """
        return __config__.get('vaultToken')

