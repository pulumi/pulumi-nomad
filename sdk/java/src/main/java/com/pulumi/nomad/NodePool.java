// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.nomad.NodePoolArgs;
import com.pulumi.nomad.Utilities;
import com.pulumi.nomad.inputs.NodePoolState;
import com.pulumi.nomad.outputs.NodePoolSchedulerConfig;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provisions a node pool within a Nomad cluster.
 * 
 * ## Example Usage
 * 
 * Registering a node pool:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.nomad.NodePool;
 * import com.pulumi.nomad.NodePoolArgs;
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
 *         var dev = new NodePool("dev", NodePoolArgs.builder()
 *             .name("dev")
 *             .description("Nodes for the development environment.")
 *             .meta(Map.ofEntries(
 *                 Map.entry("department", "Engineering"),
 *                 Map.entry("env", "dev")
 *             ))
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="nomad:index/nodePool:NodePool")
public class NodePool extends com.pulumi.resources.CustomResource {
    /**
     * `(string)` - The description of the node pool.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return `(string)` - The description of the node pool.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * `(map[string]string)` - Arbitrary KV metadata associated with the
     * node pool.
     * 
     */
    @Export(name="meta", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> meta;

    /**
     * @return `(map[string]string)` - Arbitrary KV metadata associated with the
     * node pool.
     * 
     */
    public Output<Optional<Map<String,String>>> meta() {
        return Codegen.optional(this.meta);
    }
    /**
     * `(string)` - The name of the node pool.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return `(string)` - The name of the node pool.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * `(block)` - Scheduler configuration for the node pool.
     * 
     */
    @Export(name="schedulerConfig", refs={NodePoolSchedulerConfig.class}, tree="[0]")
    private Output</* @Nullable */ NodePoolSchedulerConfig> schedulerConfig;

    /**
     * @return `(block)` - Scheduler configuration for the node pool.
     * 
     */
    public Output<Optional<NodePoolSchedulerConfig>> schedulerConfig() {
        return Codegen.optional(this.schedulerConfig);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NodePool(java.lang.String name) {
        this(name, NodePoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NodePool(java.lang.String name, @Nullable NodePoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NodePool(java.lang.String name, @Nullable NodePoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("nomad:index/nodePool:NodePool", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private NodePool(java.lang.String name, Output<java.lang.String> id, @Nullable NodePoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("nomad:index/nodePool:NodePool", name, state, makeResourceOptions(options, id), false);
    }

    private static NodePoolArgs makeArgs(@Nullable NodePoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? NodePoolArgs.Empty : args;
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
    public static NodePool get(java.lang.String name, Output<java.lang.String> id, @Nullable NodePoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NodePool(name, id, state, options);
    }
}
