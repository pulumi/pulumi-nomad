// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.nomad.SchedulerConfigArgs;
import com.pulumi.nomad.Utilities;
import com.pulumi.nomad.inputs.SchedulerConfigState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages scheduler configuration of the Nomad cluster.
 * 
 * &gt; **Warning:** destroying this resource will not have any effect in the
 * cluster configuration, since there&#39;s no clear definition of what a destroy
 * action should do. The cluster will be left as-is and only the state reference
 * will be removed.
 * 
 * ## Example Usage
 * 
 * Set cluster scheduler configuration:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.nomad.SchedulerConfig;
 * import com.pulumi.nomad.SchedulerConfigArgs;
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
 *         var config = new SchedulerConfig("config", SchedulerConfigArgs.builder()
 *             .schedulerAlgorithm("spread")
 *             .memoryOversubscriptionEnabled(true)
 *             .preemptionConfig(Map.ofEntries(
 *                 Map.entry("system_scheduler_enabled", true),
 *                 Map.entry("batch_scheduler_enabled", true),
 *                 Map.entry("service_scheduler_enabled", true),
 *                 Map.entry("sysbatch_scheduler_enabled", true)
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
@ResourceType(type="nomad:index/schedulerConfig:SchedulerConfig")
public class SchedulerConfig extends com.pulumi.resources.CustomResource {
    /**
     * `(bool: false)` - When `true`, tasks may exceed their reserved memory limit.
     * 
     */
    @Export(name="memoryOversubscriptionEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> memoryOversubscriptionEnabled;

    /**
     * @return `(bool: false)` - When `true`, tasks may exceed their reserved memory limit.
     * 
     */
    public Output<Optional<Boolean>> memoryOversubscriptionEnabled() {
        return Codegen.optional(this.memoryOversubscriptionEnabled);
    }
    /**
     * `(map[string]bool)` - Options to enable preemption for various schedulers.
     * 
     */
    @Export(name="preemptionConfig", refs={Map.class,String.class,Boolean.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Boolean>> preemptionConfig;

    /**
     * @return `(map[string]bool)` - Options to enable preemption for various schedulers.
     * 
     */
    public Output<Optional<Map<String,Boolean>>> preemptionConfig() {
        return Codegen.optional(this.preemptionConfig);
    }
    /**
     * `(string: &#34;binpack&#34;)` - Specifies whether scheduler binpacks or spreads allocations on available nodes. Possible values are `binpack` and `spread`.
     * 
     */
    @Export(name="schedulerAlgorithm", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> schedulerAlgorithm;

    /**
     * @return `(string: &#34;binpack&#34;)` - Specifies whether scheduler binpacks or spreads allocations on available nodes. Possible values are `binpack` and `spread`.
     * 
     */
    public Output<Optional<String>> schedulerAlgorithm() {
        return Codegen.optional(this.schedulerAlgorithm);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SchedulerConfig(String name) {
        this(name, SchedulerConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SchedulerConfig(String name, @Nullable SchedulerConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SchedulerConfig(String name, @Nullable SchedulerConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("nomad:index/schedulerConfig:SchedulerConfig", name, args == null ? SchedulerConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SchedulerConfig(String name, Output<String> id, @Nullable SchedulerConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("nomad:index/schedulerConfig:SchedulerConfig", name, state, makeResourceOptions(options, id));
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
    public static SchedulerConfig get(String name, Output<String> id, @Nullable SchedulerConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SchedulerConfig(name, id, state, options);
    }
}
