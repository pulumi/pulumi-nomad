// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.nomad.QuoteSpecificationArgs;
import com.pulumi.nomad.Utilities;
import com.pulumi.nomad.inputs.QuoteSpecificationState;
import com.pulumi.nomad.outputs.QuoteSpecificationLimit;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a quota specification in a Nomad cluster.
 * 
 * ## Example Usage
 * 
 * Registering a quota specification:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.nomad.QuoteSpecification;
 * import com.pulumi.nomad.QuoteSpecificationArgs;
 * import com.pulumi.nomad.inputs.QuoteSpecificationLimitArgs;
 * import com.pulumi.nomad.inputs.QuoteSpecificationLimitRegionLimitArgs;
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
 *         var prodApi = new QuoteSpecification(&#34;prodApi&#34;, QuoteSpecificationArgs.builder()        
 *             .description(&#34;Production instances of backend API servers&#34;)
 *             .limits(QuoteSpecificationLimitArgs.builder()
 *                 .region(&#34;global&#34;)
 *                 .regionLimit(QuoteSpecificationLimitRegionLimitArgs.builder()
 *                     .cpu(2400)
 *                     .memoryMb(1200)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="nomad:index/quoteSpecification:QuoteSpecification")
public class QuoteSpecification extends com.pulumi.resources.CustomResource {
    /**
     * `(string: &#34;&#34;)` - A description of the quota specification.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return `(string: &#34;&#34;)` - A description of the quota specification.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * `(block: &lt;required&gt;)` - A block of quota limits to enforce. Can
     * be repeated. See below for the structure of this block.
     * 
     */
    @Export(name="limits", type=List.class, parameters={QuoteSpecificationLimit.class})
    private Output<List<QuoteSpecificationLimit>> limits;

    /**
     * @return `(block: &lt;required&gt;)` - A block of quota limits to enforce. Can
     * be repeated. See below for the structure of this block.
     * 
     */
    public Output<List<QuoteSpecificationLimit>> limits() {
        return this.limits;
    }
    /**
     * `(string: &lt;required&gt;)` - A unique name for the quota specification.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return `(string: &lt;required&gt;)` - A unique name for the quota specification.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public QuoteSpecification(String name) {
        this(name, QuoteSpecificationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public QuoteSpecification(String name, QuoteSpecificationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public QuoteSpecification(String name, QuoteSpecificationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("nomad:index/quoteSpecification:QuoteSpecification", name, args == null ? QuoteSpecificationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private QuoteSpecification(String name, Output<String> id, @Nullable QuoteSpecificationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("nomad:index/quoteSpecification:QuoteSpecification", name, state, makeResourceOptions(options, id));
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
    public static QuoteSpecification get(String name, Output<String> id, @Nullable QuoteSpecificationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new QuoteSpecification(name, id, state, options);
    }
}
