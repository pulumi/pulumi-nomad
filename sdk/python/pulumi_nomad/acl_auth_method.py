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
from ._inputs import *

__all__ = ['AclAuthMethodArgs', 'AclAuthMethod']

@pulumi.input_type
class AclAuthMethodArgs:
    def __init__(__self__, *,
                 config: pulumi.Input['AclAuthMethodConfigArgs'],
                 max_token_ttl: pulumi.Input[str],
                 token_locality: pulumi.Input[str],
                 type: pulumi.Input[str],
                 default: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 token_name_format: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AclAuthMethod resource.
        :param pulumi.Input['AclAuthMethodConfigArgs'] config: `(block: <required>)` - Configuration specific to the auth method
               provider.
        :param pulumi.Input[str] max_token_ttl: `(string: <required>)` - Defines the maximum life of a token
               created by this method and is specified as a time duration such as "15h".
        :param pulumi.Input[str] token_locality: `(string: <required>)` - Defines whether the ACL Auth Method
               creates a local or global token when performing SSO login. This field must be
               set to either `local` or `global`.
        :param pulumi.Input[str] type: `(string: <required>)` - ACL Auth Method SSO workflow type. Valid values,
               are `OIDC` and `JWT`.
        :param pulumi.Input[bool] default: `(bool: false)` - Defines whether this ACL Auth Method is to be set
               as default.
        :param pulumi.Input[str] name: `(string: <required>)` - The identifier of the ACL Auth Method.
        :param pulumi.Input[str] token_name_format: `(string: "${auth_method_type}-${auth_method_name}")` -
               Defines the token name format for the generated tokens This can be lightly
               templated using HIL '${foo}' syntax.
        """
        pulumi.set(__self__, "config", config)
        pulumi.set(__self__, "max_token_ttl", max_token_ttl)
        pulumi.set(__self__, "token_locality", token_locality)
        pulumi.set(__self__, "type", type)
        if default is not None:
            pulumi.set(__self__, "default", default)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if token_name_format is not None:
            pulumi.set(__self__, "token_name_format", token_name_format)

    @property
    @pulumi.getter
    def config(self) -> pulumi.Input['AclAuthMethodConfigArgs']:
        """
        `(block: <required>)` - Configuration specific to the auth method
        provider.
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: pulumi.Input['AclAuthMethodConfigArgs']):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter(name="maxTokenTtl")
    def max_token_ttl(self) -> pulumi.Input[str]:
        """
        `(string: <required>)` - Defines the maximum life of a token
        created by this method and is specified as a time duration such as "15h".
        """
        return pulumi.get(self, "max_token_ttl")

    @max_token_ttl.setter
    def max_token_ttl(self, value: pulumi.Input[str]):
        pulumi.set(self, "max_token_ttl", value)

    @property
    @pulumi.getter(name="tokenLocality")
    def token_locality(self) -> pulumi.Input[str]:
        """
        `(string: <required>)` - Defines whether the ACL Auth Method
        creates a local or global token when performing SSO login. This field must be
        set to either `local` or `global`.
        """
        return pulumi.get(self, "token_locality")

    @token_locality.setter
    def token_locality(self, value: pulumi.Input[str]):
        pulumi.set(self, "token_locality", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        `(string: <required>)` - ACL Auth Method SSO workflow type. Valid values,
        are `OIDC` and `JWT`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def default(self) -> Optional[pulumi.Input[bool]]:
        """
        `(bool: false)` - Defines whether this ACL Auth Method is to be set
        as default.
        """
        return pulumi.get(self, "default")

    @default.setter
    def default(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "default", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: <required>)` - The identifier of the ACL Auth Method.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="tokenNameFormat")
    def token_name_format(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: "${auth_method_type}-${auth_method_name}")` -
        Defines the token name format for the generated tokens This can be lightly
        templated using HIL '${foo}' syntax.
        """
        return pulumi.get(self, "token_name_format")

    @token_name_format.setter
    def token_name_format(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "token_name_format", value)


@pulumi.input_type
class _AclAuthMethodState:
    def __init__(__self__, *,
                 config: Optional[pulumi.Input['AclAuthMethodConfigArgs']] = None,
                 default: Optional[pulumi.Input[bool]] = None,
                 max_token_ttl: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 token_locality: Optional[pulumi.Input[str]] = None,
                 token_name_format: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AclAuthMethod resources.
        :param pulumi.Input['AclAuthMethodConfigArgs'] config: `(block: <required>)` - Configuration specific to the auth method
               provider.
        :param pulumi.Input[bool] default: `(bool: false)` - Defines whether this ACL Auth Method is to be set
               as default.
        :param pulumi.Input[str] max_token_ttl: `(string: <required>)` - Defines the maximum life of a token
               created by this method and is specified as a time duration such as "15h".
        :param pulumi.Input[str] name: `(string: <required>)` - The identifier of the ACL Auth Method.
        :param pulumi.Input[str] token_locality: `(string: <required>)` - Defines whether the ACL Auth Method
               creates a local or global token when performing SSO login. This field must be
               set to either `local` or `global`.
        :param pulumi.Input[str] token_name_format: `(string: "${auth_method_type}-${auth_method_name}")` -
               Defines the token name format for the generated tokens This can be lightly
               templated using HIL '${foo}' syntax.
        :param pulumi.Input[str] type: `(string: <required>)` - ACL Auth Method SSO workflow type. Valid values,
               are `OIDC` and `JWT`.
        """
        if config is not None:
            pulumi.set(__self__, "config", config)
        if default is not None:
            pulumi.set(__self__, "default", default)
        if max_token_ttl is not None:
            pulumi.set(__self__, "max_token_ttl", max_token_ttl)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if token_locality is not None:
            pulumi.set(__self__, "token_locality", token_locality)
        if token_name_format is not None:
            pulumi.set(__self__, "token_name_format", token_name_format)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def config(self) -> Optional[pulumi.Input['AclAuthMethodConfigArgs']]:
        """
        `(block: <required>)` - Configuration specific to the auth method
        provider.
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: Optional[pulumi.Input['AclAuthMethodConfigArgs']]):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter
    def default(self) -> Optional[pulumi.Input[bool]]:
        """
        `(bool: false)` - Defines whether this ACL Auth Method is to be set
        as default.
        """
        return pulumi.get(self, "default")

    @default.setter
    def default(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "default", value)

    @property
    @pulumi.getter(name="maxTokenTtl")
    def max_token_ttl(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: <required>)` - Defines the maximum life of a token
        created by this method and is specified as a time duration such as "15h".
        """
        return pulumi.get(self, "max_token_ttl")

    @max_token_ttl.setter
    def max_token_ttl(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "max_token_ttl", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: <required>)` - The identifier of the ACL Auth Method.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="tokenLocality")
    def token_locality(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: <required>)` - Defines whether the ACL Auth Method
        creates a local or global token when performing SSO login. This field must be
        set to either `local` or `global`.
        """
        return pulumi.get(self, "token_locality")

    @token_locality.setter
    def token_locality(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "token_locality", value)

    @property
    @pulumi.getter(name="tokenNameFormat")
    def token_name_format(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: "${auth_method_type}-${auth_method_name}")` -
        Defines the token name format for the generated tokens This can be lightly
        templated using HIL '${foo}' syntax.
        """
        return pulumi.get(self, "token_name_format")

    @token_name_format.setter
    def token_name_format(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "token_name_format", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: <required>)` - ACL Auth Method SSO workflow type. Valid values,
        are `OIDC` and `JWT`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class AclAuthMethod(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config: Optional[pulumi.Input[Union['AclAuthMethodConfigArgs', 'AclAuthMethodConfigArgsDict']]] = None,
                 default: Optional[pulumi.Input[bool]] = None,
                 max_token_ttl: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 token_locality: Optional[pulumi.Input[str]] = None,
                 token_name_format: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages an ACL Auth Method in Nomad.

        ## Example Usage

        Creating an ALC Auth Method:

        ```python
        import pulumi
        import pulumi_nomad as nomad

        my_nomad_acl_auth_method = nomad.AclAuthMethod("my_nomad_acl_auth_method",
            name="my-nomad-acl-auth-method",
            type="OIDC",
            token_locality="global",
            max_token_ttl="10m0s",
            token_name_format="${auth_method_type}-${value.user}",
            default=True,
            config={
                "oidc_discovery_url": "https://uk.auth0.com/",
                "oidc_client_id": "someclientid",
                "oidc_client_secret": "someclientsecret-t",
                "bound_audiences": ["someclientid"],
                "allowed_redirect_uris": [
                    "http://localhost:4649/oidc/callback",
                    "http://localhost:4646/ui/settings/tokens",
                ],
                "list_claim_mappings": {
                    "http___nomad_internal_roles": "roles",
                },
            })
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['AclAuthMethodConfigArgs', 'AclAuthMethodConfigArgsDict']] config: `(block: <required>)` - Configuration specific to the auth method
               provider.
        :param pulumi.Input[bool] default: `(bool: false)` - Defines whether this ACL Auth Method is to be set
               as default.
        :param pulumi.Input[str] max_token_ttl: `(string: <required>)` - Defines the maximum life of a token
               created by this method and is specified as a time duration such as "15h".
        :param pulumi.Input[str] name: `(string: <required>)` - The identifier of the ACL Auth Method.
        :param pulumi.Input[str] token_locality: `(string: <required>)` - Defines whether the ACL Auth Method
               creates a local or global token when performing SSO login. This field must be
               set to either `local` or `global`.
        :param pulumi.Input[str] token_name_format: `(string: "${auth_method_type}-${auth_method_name}")` -
               Defines the token name format for the generated tokens This can be lightly
               templated using HIL '${foo}' syntax.
        :param pulumi.Input[str] type: `(string: <required>)` - ACL Auth Method SSO workflow type. Valid values,
               are `OIDC` and `JWT`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AclAuthMethodArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an ACL Auth Method in Nomad.

        ## Example Usage

        Creating an ALC Auth Method:

        ```python
        import pulumi
        import pulumi_nomad as nomad

        my_nomad_acl_auth_method = nomad.AclAuthMethod("my_nomad_acl_auth_method",
            name="my-nomad-acl-auth-method",
            type="OIDC",
            token_locality="global",
            max_token_ttl="10m0s",
            token_name_format="${auth_method_type}-${value.user}",
            default=True,
            config={
                "oidc_discovery_url": "https://uk.auth0.com/",
                "oidc_client_id": "someclientid",
                "oidc_client_secret": "someclientsecret-t",
                "bound_audiences": ["someclientid"],
                "allowed_redirect_uris": [
                    "http://localhost:4649/oidc/callback",
                    "http://localhost:4646/ui/settings/tokens",
                ],
                "list_claim_mappings": {
                    "http___nomad_internal_roles": "roles",
                },
            })
        ```

        :param str resource_name: The name of the resource.
        :param AclAuthMethodArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AclAuthMethodArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config: Optional[pulumi.Input[Union['AclAuthMethodConfigArgs', 'AclAuthMethodConfigArgsDict']]] = None,
                 default: Optional[pulumi.Input[bool]] = None,
                 max_token_ttl: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 token_locality: Optional[pulumi.Input[str]] = None,
                 token_name_format: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AclAuthMethodArgs.__new__(AclAuthMethodArgs)

            if config is None and not opts.urn:
                raise TypeError("Missing required property 'config'")
            __props__.__dict__["config"] = config
            __props__.__dict__["default"] = default
            if max_token_ttl is None and not opts.urn:
                raise TypeError("Missing required property 'max_token_ttl'")
            __props__.__dict__["max_token_ttl"] = max_token_ttl
            __props__.__dict__["name"] = name
            if token_locality is None and not opts.urn:
                raise TypeError("Missing required property 'token_locality'")
            __props__.__dict__["token_locality"] = token_locality
            __props__.__dict__["token_name_format"] = token_name_format
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
        super(AclAuthMethod, __self__).__init__(
            'nomad:index/aclAuthMethod:AclAuthMethod',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            config: Optional[pulumi.Input[Union['AclAuthMethodConfigArgs', 'AclAuthMethodConfigArgsDict']]] = None,
            default: Optional[pulumi.Input[bool]] = None,
            max_token_ttl: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            token_locality: Optional[pulumi.Input[str]] = None,
            token_name_format: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'AclAuthMethod':
        """
        Get an existing AclAuthMethod resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['AclAuthMethodConfigArgs', 'AclAuthMethodConfigArgsDict']] config: `(block: <required>)` - Configuration specific to the auth method
               provider.
        :param pulumi.Input[bool] default: `(bool: false)` - Defines whether this ACL Auth Method is to be set
               as default.
        :param pulumi.Input[str] max_token_ttl: `(string: <required>)` - Defines the maximum life of a token
               created by this method and is specified as a time duration such as "15h".
        :param pulumi.Input[str] name: `(string: <required>)` - The identifier of the ACL Auth Method.
        :param pulumi.Input[str] token_locality: `(string: <required>)` - Defines whether the ACL Auth Method
               creates a local or global token when performing SSO login. This field must be
               set to either `local` or `global`.
        :param pulumi.Input[str] token_name_format: `(string: "${auth_method_type}-${auth_method_name}")` -
               Defines the token name format for the generated tokens This can be lightly
               templated using HIL '${foo}' syntax.
        :param pulumi.Input[str] type: `(string: <required>)` - ACL Auth Method SSO workflow type. Valid values,
               are `OIDC` and `JWT`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AclAuthMethodState.__new__(_AclAuthMethodState)

        __props__.__dict__["config"] = config
        __props__.__dict__["default"] = default
        __props__.__dict__["max_token_ttl"] = max_token_ttl
        __props__.__dict__["name"] = name
        __props__.__dict__["token_locality"] = token_locality
        __props__.__dict__["token_name_format"] = token_name_format
        __props__.__dict__["type"] = type
        return AclAuthMethod(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def config(self) -> pulumi.Output['outputs.AclAuthMethodConfig']:
        """
        `(block: <required>)` - Configuration specific to the auth method
        provider.
        """
        return pulumi.get(self, "config")

    @property
    @pulumi.getter
    def default(self) -> pulumi.Output[Optional[bool]]:
        """
        `(bool: false)` - Defines whether this ACL Auth Method is to be set
        as default.
        """
        return pulumi.get(self, "default")

    @property
    @pulumi.getter(name="maxTokenTtl")
    def max_token_ttl(self) -> pulumi.Output[str]:
        """
        `(string: <required>)` - Defines the maximum life of a token
        created by this method and is specified as a time duration such as "15h".
        """
        return pulumi.get(self, "max_token_ttl")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        `(string: <required>)` - The identifier of the ACL Auth Method.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="tokenLocality")
    def token_locality(self) -> pulumi.Output[str]:
        """
        `(string: <required>)` - Defines whether the ACL Auth Method
        creates a local or global token when performing SSO login. This field must be
        set to either `local` or `global`.
        """
        return pulumi.get(self, "token_locality")

    @property
    @pulumi.getter(name="tokenNameFormat")
    def token_name_format(self) -> pulumi.Output[Optional[str]]:
        """
        `(string: "${auth_method_type}-${auth_method_name}")` -
        Defines the token name format for the generated tokens This can be lightly
        templated using HIL '${foo}' syntax.
        """
        return pulumi.get(self, "token_name_format")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        `(string: <required>)` - ACL Auth Method SSO workflow type. Valid values,
        are `OIDC` and `JWT`.
        """
        return pulumi.get(self, "type")

