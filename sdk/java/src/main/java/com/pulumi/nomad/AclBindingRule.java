// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.nomad.AclBindingRuleArgs;
import com.pulumi.nomad.Utilities;
import com.pulumi.nomad.inputs.AclBindingRuleState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="nomad:index/aclBindingRule:AclBindingRule")
public class AclBindingRule extends com.pulumi.resources.CustomResource {
    /**
     * `(string: &lt;required&gt;)` - Name of the auth method for which this
     * rule applies to.
     * 
     */
    @Export(name="authMethod", refs={String.class}, tree="[0]")
    private Output<String> authMethod;

    /**
     * @return `(string: &lt;required&gt;)` - Name of the auth method for which this
     * rule applies to.
     * 
     */
    public Output<String> authMethod() {
        return this.authMethod;
    }
    /**
     * `(string: &lt;optional&gt;)` - Target of the binding. If `bind_type` is
     * `role` or `policy` then `bind_name` is required. If `bind_type` is
     * `management` than `bind_name` must not be defined.
     * 
     */
    @Export(name="bindName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> bindName;

    /**
     * @return `(string: &lt;optional&gt;)` - Target of the binding. If `bind_type` is
     * `role` or `policy` then `bind_name` is required. If `bind_type` is
     * `management` than `bind_name` must not be defined.
     * 
     */
    public Output<Optional<String>> bindName() {
        return Codegen.optional(this.bindName);
    }
    /**
     * `(string: &lt;required&gt;)` - Adjusts how this binding rule is applied
     * at login time. Valid values are `role`, `policy`, and `management`.
     * 
     */
    @Export(name="bindType", refs={String.class}, tree="[0]")
    private Output<String> bindType;

    /**
     * @return `(string: &lt;required&gt;)` - Adjusts how this binding rule is applied
     * at login time. Valid values are `role`, `policy`, and `management`.
     * 
     */
    public Output<String> bindType() {
        return this.bindType;
    }
    /**
     * `(string: &#34;&#34;)` - Description for this ACL binding rule.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return `(string: &#34;&#34;)` - Description for this ACL binding rule.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * `(string: &#34;&#34;)` - A boolean expression that matches against verified
     * identity attributes returned from the auth method during login.
     * 
     */
    @Export(name="selector", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> selector;

    /**
     * @return `(string: &#34;&#34;)` - A boolean expression that matches against verified
     * identity attributes returned from the auth method during login.
     * 
     */
    public Output<Optional<String>> selector() {
        return Codegen.optional(this.selector);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AclBindingRule(java.lang.String name) {
        this(name, AclBindingRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AclBindingRule(java.lang.String name, AclBindingRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AclBindingRule(java.lang.String name, AclBindingRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("nomad:index/aclBindingRule:AclBindingRule", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AclBindingRule(java.lang.String name, Output<java.lang.String> id, @Nullable AclBindingRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("nomad:index/aclBindingRule:AclBindingRule", name, state, makeResourceOptions(options, id), false);
    }

    private static AclBindingRuleArgs makeArgs(AclBindingRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AclBindingRuleArgs.Empty : args;
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
    public static AclBindingRule get(java.lang.String name, Output<java.lang.String> id, @Nullable AclBindingRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AclBindingRule(name, id, state, options);
    }
}
