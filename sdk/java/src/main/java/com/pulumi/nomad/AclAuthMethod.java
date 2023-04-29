// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.nomad.AclAuthMethodArgs;
import com.pulumi.nomad.Utilities;
import com.pulumi.nomad.inputs.AclAuthMethodState;
import com.pulumi.nomad.outputs.AclAuthMethodConfig;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an ACL Auth Method in Nomad.
 * 
 * ## Example Usage
 * 
 * Creating an ALC Auth Method:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.nomad.AclAuthMethod;
 * import com.pulumi.nomad.AclAuthMethodArgs;
 * import com.pulumi.nomad.inputs.AclAuthMethodConfigArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var myNomadAclAuthMethod = new AclAuthMethod(&#34;myNomadAclAuthMethod&#34;, AclAuthMethodArgs.builder()        
 *             .type(&#34;OIDC&#34;)
 *             .tokenLocality(&#34;global&#34;)
 *             .maxTokenTtl(&#34;10m0s&#34;)
 *             .default_(true)
 *             .config(AclAuthMethodConfigArgs.builder()
 *                 .oidcDiscoveryUrl(&#34;https://uk.auth0.com/&#34;)
 *                 .oidcClientId(&#34;someclientid&#34;)
 *                 .oidcClientSecret(&#34;someclientsecret-t&#34;)
 *                 .boundAudiences(&#34;someclientid&#34;)
 *                 .allowedRedirectUris(                
 *                     &#34;http://localhost:4649/oidc/callback&#34;,
 *                     &#34;http://localhost:4646/ui/settings/tokens&#34;)
 *                 .listClaimMappings(Map.of(&#34;http://nomad.internal/roles&#34;, &#34;roles&#34;))
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="nomad:index/aclAuthMethod:AclAuthMethod")
public class AclAuthMethod extends com.pulumi.resources.CustomResource {
    /**
     * Configuration specific to the auth method provider.
     * 
     */
    @Export(name="config", type=AclAuthMethodConfig.class, parameters={})
    private Output<AclAuthMethodConfig> config;

    /**
     * @return Configuration specific to the auth method provider.
     * 
     */
    public Output<AclAuthMethodConfig> config() {
        return this.config;
    }
    /**
     * `(bool: false)` - Defines whether this ACL Auth Method is to be set
     * as default.
     * 
     */
    @Export(name="default", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> default_;

    /**
     * @return `(bool: false)` - Defines whether this ACL Auth Method is to be set
     * as default.
     * 
     */
    public Output<Optional<Boolean>> default_() {
        return Codegen.optional(this.default_);
    }
    /**
     * `(string: &lt;required&gt;)` - Defines the maximum life of a token
     * created by this method and is specified as a time duration such as &#34;15h&#34;.
     * 
     */
    @Export(name="maxTokenTtl", type=String.class, parameters={})
    private Output<String> maxTokenTtl;

    /**
     * @return `(string: &lt;required&gt;)` - Defines the maximum life of a token
     * created by this method and is specified as a time duration such as &#34;15h&#34;.
     * 
     */
    public Output<String> maxTokenTtl() {
        return this.maxTokenTtl;
    }
    /**
     * `(string: &lt;required&gt;)` - The identifier of the ACL Auth Method.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return `(string: &lt;required&gt;)` - The identifier of the ACL Auth Method.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * `(string: &lt;required&gt;)` - Defines whether the ACL Auth Method
     * creates a local or global token when performing SSO login. This field must be
     * set to either `local` or `global`.
     * 
     */
    @Export(name="tokenLocality", type=String.class, parameters={})
    private Output<String> tokenLocality;

    /**
     * @return `(string: &lt;required&gt;)` - Defines whether the ACL Auth Method
     * creates a local or global token when performing SSO login. This field must be
     * set to either `local` or `global`.
     * 
     */
    public Output<String> tokenLocality() {
        return this.tokenLocality;
    }
    /**
     * `(string: &lt;required&gt;)` - ACL Auth Method SSO workflow type. Currently,
     * the only supported type is `OIDC`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return `(string: &lt;required&gt;)` - ACL Auth Method SSO workflow type. Currently,
     * the only supported type is `OIDC`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AclAuthMethod(String name) {
        this(name, AclAuthMethodArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AclAuthMethod(String name, AclAuthMethodArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AclAuthMethod(String name, AclAuthMethodArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("nomad:index/aclAuthMethod:AclAuthMethod", name, args == null ? AclAuthMethodArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AclAuthMethod(String name, Output<String> id, @Nullable AclAuthMethodState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("nomad:index/aclAuthMethod:AclAuthMethod", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AclAuthMethod get(String name, Output<String> id, @Nullable AclAuthMethodState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AclAuthMethod(name, id, state, options);
    }
}