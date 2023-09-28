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
 * ```java
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
 *         var dev = new NodePool(&#34;dev&#34;, NodePoolArgs.builder()        
 *             .description(&#34;Nodes for the development environment.&#34;)
 *             .meta(Map.ofEntries(
 *                 Map.entry(&#34;department&#34;, &#34;Engineering&#34;),
 *                 Map.entry(&#34;env&#34;, &#34;dev&#34;)
 *             ))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="nomad:index/nodePool:NodePool")
public class NodePool extends com.pulumi.resources.CustomResource {
    /**
     * `(string)` - The description of the node pool.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
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
    @Export(name="meta", type=Map.class, parameters={String.class, String.class})
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
    @Export(name="name", type=String.class, parameters={})
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
    @Export(name="schedulerConfig", type=NodePoolSchedulerConfig.class, parameters={})
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
    public NodePool(String name) {
        this(name, NodePoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NodePool(String name, @Nullable NodePoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NodePool(String name, @Nullable NodePoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("nomad:index/nodePool:NodePool", name, args == null ? NodePoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NodePool(String name, Output<String> id, @Nullable NodePoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("nomad:index/nodePool:NodePool", name, state, makeResourceOptions(options, id));
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
    public static NodePool get(String name, Output<String> id, @Nullable NodePoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NodePool(name, id, state, options);
    }
}