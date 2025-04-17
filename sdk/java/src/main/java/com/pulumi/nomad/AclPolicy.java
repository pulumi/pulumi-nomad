// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.nomad.AclPolicyArgs;
import com.pulumi.nomad.Utilities;
import com.pulumi.nomad.inputs.AclPolicyState;
import com.pulumi.nomad.outputs.AclPolicyJobAcl;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an ACL policy registered in Nomad.
 * 
 */
@ResourceType(type="nomad:index/aclPolicy:AclPolicy")
public class AclPolicy extends com.pulumi.resources.CustomResource {
    /**
     * `(string: &#34;&#34;)` - A description of the policy.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return `(string: &#34;&#34;)` - A description of the policy.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * `(``JobACL``: &lt;optional&gt;)` - Options for assigning the
     * ACL rules to a job, group, or task.
     * 
     */
    @Export(name="jobAcl", refs={AclPolicyJobAcl.class}, tree="[0]")
    private Output</* @Nullable */ AclPolicyJobAcl> jobAcl;

    /**
     * @return `(``JobACL``: &lt;optional&gt;)` - Options for assigning the
     * ACL rules to a job, group, or task.
     * 
     */
    public Output<Optional<AclPolicyJobAcl>> jobAcl() {
        return Codegen.optional(this.jobAcl);
    }
    /**
     * `(string: &lt;required&gt;)` - A unique name for the policy.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return `(string: &lt;required&gt;)` - A unique name for the policy.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * `(string: &lt;required&gt;)` - The contents of the policy to register,
     * as HCL or JSON.
     * 
     */
    @Export(name="rulesHcl", refs={String.class}, tree="[0]")
    private Output<String> rulesHcl;

    /**
     * @return `(string: &lt;required&gt;)` - The contents of the policy to register,
     * as HCL or JSON.
     * 
     */
    public Output<String> rulesHcl() {
        return this.rulesHcl;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AclPolicy(java.lang.String name) {
        this(name, AclPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AclPolicy(java.lang.String name, AclPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AclPolicy(java.lang.String name, AclPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("nomad:index/aclPolicy:AclPolicy", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AclPolicy(java.lang.String name, Output<java.lang.String> id, @Nullable AclPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("nomad:index/aclPolicy:AclPolicy", name, state, makeResourceOptions(options, id), false);
    }

    private static AclPolicyArgs makeArgs(AclPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AclPolicyArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static AclPolicy get(java.lang.String name, Output<java.lang.String> id, @Nullable AclPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AclPolicy(name, id, state, options);
    }
}
