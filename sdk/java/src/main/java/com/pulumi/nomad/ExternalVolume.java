// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.nomad.ExternalVolumeArgs;
import com.pulumi.nomad.Utilities;
import com.pulumi.nomad.inputs.ExternalVolumeState;
import com.pulumi.nomad.outputs.ExternalVolumeCapability;
import com.pulumi.nomad.outputs.ExternalVolumeMountOptions;
import com.pulumi.nomad.outputs.ExternalVolumeTopology;
import com.pulumi.nomad.outputs.ExternalVolumeTopologyRequest;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * Creating a volume:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.nomad.NomadFunctions;
 * import com.pulumi.nomad.inputs.GetPluginArgs;
 * import com.pulumi.nomad.ExternalVolume;
 * import com.pulumi.nomad.ExternalVolumeArgs;
 * import com.pulumi.nomad.inputs.ExternalVolumeCapabilityArgs;
 * import com.pulumi.nomad.inputs.ExternalVolumeMountOptionsArgs;
 * import com.pulumi.nomad.inputs.ExternalVolumeTopologyRequestArgs;
 * import com.pulumi.nomad.inputs.ExternalVolumeTopologyRequestRequiredArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         final var ebs = NomadFunctions.getPlugin(GetPluginArgs.builder()
 *             .pluginId(&#34;aws-ebs0&#34;)
 *             .waitForHealthy(true)
 *             .build());
 * 
 *         var mysqlVolume = new ExternalVolume(&#34;mysqlVolume&#34;, ExternalVolumeArgs.builder()        
 *             .type(&#34;csi&#34;)
 *             .pluginId(&#34;aws-ebs0&#34;)
 *             .volumeId(&#34;mysql_volume&#34;)
 *             .capacityMin(&#34;10GiB&#34;)
 *             .capacityMax(&#34;20GiB&#34;)
 *             .capabilities(ExternalVolumeCapabilityArgs.builder()
 *                 .accessMode(&#34;single-node-writer&#34;)
 *                 .attachmentMode(&#34;file-system&#34;)
 *                 .build())
 *             .mountOptions(ExternalVolumeMountOptionsArgs.builder()
 *                 .fsType(&#34;ext4&#34;)
 *                 .build())
 *             .topologyRequest(ExternalVolumeTopologyRequestArgs.builder()
 *                 .required(ExternalVolumeTopologyRequestRequiredArgs.builder()
 *                     .topologies(                    
 *                         ExternalVolumeTopologyRequestRequiredTopologyArgs.builder()
 *                             .segments(Map.ofEntries(
 *                                 Map.entry(&#34;rack&#34;, &#34;R1&#34;),
 *                                 Map.entry(&#34;zone&#34;, &#34;us-east-1a&#34;)
 *                             ))
 *                             .build(),
 *                         ExternalVolumeTopologyRequestRequiredTopologyArgs.builder()
 *                             .segments(Map.of(&#34;rack&#34;, &#34;R2&#34;))
 *                             .build())
 *                     .build())
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(ebs.applyValue(getPluginResult -&gt; getPluginResult))
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="nomad:index/externalVolume:ExternalVolume")
public class ExternalVolume extends com.pulumi.resources.CustomResource {
    /**
     * `(``Capability``: &lt;required&gt;)` - Options for validating the capability of a volume.
     * 
     */
    @Export(name="capabilities", type=List.class, parameters={ExternalVolumeCapability.class})
    private Output<List<ExternalVolumeCapability>> capabilities;

    /**
     * @return `(``Capability``: &lt;required&gt;)` - Options for validating the capability of a volume.
     * 
     */
    public Output<List<ExternalVolumeCapability>> capabilities() {
        return this.capabilities;
    }
    /**
     * `(string: &lt;optional&gt;)` - Option to signal a maximum volume size. This may not be supported by all storage providers.
     * 
     */
    @Export(name="capacityMax", type=String.class, parameters={})
    private Output</* @Nullable */ String> capacityMax;

    /**
     * @return `(string: &lt;optional&gt;)` - Option to signal a maximum volume size. This may not be supported by all storage providers.
     * 
     */
    public Output<Optional<String>> capacityMax() {
        return Codegen.optional(this.capacityMax);
    }
    /**
     * `(string: &lt;optional&gt;)` - Option to signal a minimum volume size. This may not be supported by all storage providers.
     * 
     */
    @Export(name="capacityMin", type=String.class, parameters={})
    private Output</* @Nullable */ String> capacityMin;

    /**
     * @return `(string: &lt;optional&gt;)` - Option to signal a minimum volume size. This may not be supported by all storage providers.
     * 
     */
    public Output<Optional<String>> capacityMin() {
        return Codegen.optional(this.capacityMin);
    }
    /**
     * `(string: &lt;optional&gt;)` - The external ID of an existing volume to restore. If ommited, the volume will be created from scratch. Conflicts with `snapshot_id`.
     * 
     */
    @Export(name="cloneId", type=String.class, parameters={})
    private Output</* @Nullable */ String> cloneId;

    /**
     * @return `(string: &lt;optional&gt;)` - The external ID of an existing volume to restore. If ommited, the volume will be created from scratch. Conflicts with `snapshot_id`.
     * 
     */
    public Output<Optional<String>> cloneId() {
        return Codegen.optional(this.cloneId);
    }
    /**
     * `(boolean)`
     * 
     */
    @Export(name="controllerRequired", type=Boolean.class, parameters={})
    private Output<Boolean> controllerRequired;

    /**
     * @return `(boolean)`
     * 
     */
    public Output<Boolean> controllerRequired() {
        return this.controllerRequired;
    }
    /**
     * `(integer)`
     * 
     */
    @Export(name="controllersExpected", type=Integer.class, parameters={})
    private Output<Integer> controllersExpected;

    /**
     * @return `(integer)`
     * 
     */
    public Output<Integer> controllersExpected() {
        return this.controllersExpected;
    }
    /**
     * `(integer)`
     * 
     */
    @Export(name="controllersHealthy", type=Integer.class, parameters={})
    private Output<Integer> controllersHealthy;

    /**
     * @return `(integer)`
     * 
     */
    public Output<Integer> controllersHealthy() {
        return this.controllersHealthy;
    }
    /**
     * `(block: optional)` Options for mounting `block-device` volumes without a pre-formatted file system.
     * 
     */
    @Export(name="mountOptions", type=ExternalVolumeMountOptions.class, parameters={})
    private Output</* @Nullable */ ExternalVolumeMountOptions> mountOptions;

    /**
     * @return `(block: optional)` Options for mounting `block-device` volumes without a pre-formatted file system.
     * 
     */
    public Output<Optional<ExternalVolumeMountOptions>> mountOptions() {
        return Codegen.optional(this.mountOptions);
    }
    /**
     * `(string: &lt;required&gt;)` - The display name for the volume.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return `(string: &lt;required&gt;)` - The display name for the volume.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * `(string: &#34;default&#34;)` - The namespace in which to register the volume.
     * 
     */
    @Export(name="namespace", type=String.class, parameters={})
    private Output</* @Nullable */ String> namespace;

    /**
     * @return `(string: &#34;default&#34;)` - The namespace in which to register the volume.
     * 
     */
    public Output<Optional<String>> namespace() {
        return Codegen.optional(this.namespace);
    }
    /**
     * `(integer)`
     * 
     */
    @Export(name="nodesExpected", type=Integer.class, parameters={})
    private Output<Integer> nodesExpected;

    /**
     * @return `(integer)`
     * 
     */
    public Output<Integer> nodesExpected() {
        return this.nodesExpected;
    }
    /**
     * `(integer)`
     * 
     */
    @Export(name="nodesHealthy", type=Integer.class, parameters={})
    private Output<Integer> nodesHealthy;

    /**
     * @return `(integer)`
     * 
     */
    public Output<Integer> nodesHealthy() {
        return this.nodesHealthy;
    }
    /**
     * `(map[string]string: optional)` An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
     * 
     */
    @Export(name="parameters", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> parameters;

    /**
     * @return `(map[string]string: optional)` An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
     * 
     */
    public Output<Optional<Map<String,String>>> parameters() {
        return Codegen.optional(this.parameters);
    }
    /**
     * `(string: &lt;required&gt;)` - The ID of the Nomad plugin for registering this volume.
     * 
     */
    @Export(name="pluginId", type=String.class, parameters={})
    private Output<String> pluginId;

    /**
     * @return `(string: &lt;required&gt;)` - The ID of the Nomad plugin for registering this volume.
     * 
     */
    public Output<String> pluginId() {
        return this.pluginId;
    }
    /**
     * `(string)`
     * 
     */
    @Export(name="pluginProvider", type=String.class, parameters={})
    private Output<String> pluginProvider;

    /**
     * @return `(string)`
     * 
     */
    public Output<String> pluginProvider() {
        return this.pluginProvider;
    }
    /**
     * `(string)`
     * 
     */
    @Export(name="pluginProviderVersion", type=String.class, parameters={})
    private Output<String> pluginProviderVersion;

    /**
     * @return `(string)`
     * 
     */
    public Output<String> pluginProviderVersion() {
        return this.pluginProviderVersion;
    }
    /**
     * `(boolean)`
     * 
     */
    @Export(name="schedulable", type=Boolean.class, parameters={})
    private Output<Boolean> schedulable;

    /**
     * @return `(boolean)`
     * 
     */
    public Output<Boolean> schedulable() {
        return this.schedulable;
    }
    /**
     * `(map[string]string: optional)` An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
     * 
     */
    @Export(name="secrets", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> secrets;

    /**
     * @return `(map[string]string: optional)` An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
     * 
     */
    public Output<Optional<Map<String,String>>> secrets() {
        return Codegen.optional(this.secrets);
    }
    /**
     * `(string: &lt;optional&gt;)` - The external ID of a snapshot to restore. If ommited, the volume will be created from scratch. Conflicts with `clone_id`.
     * 
     */
    @Export(name="snapshotId", type=String.class, parameters={})
    private Output</* @Nullable */ String> snapshotId;

    /**
     * @return `(string: &lt;optional&gt;)` - The external ID of a snapshot to restore. If ommited, the volume will be created from scratch. Conflicts with `clone_id`.
     * 
     */
    public Output<Optional<String>> snapshotId() {
        return Codegen.optional(this.snapshotId);
    }
    /**
     * `(List of topologies)`
     * 
     */
    @Export(name="topologies", type=List.class, parameters={ExternalVolumeTopology.class})
    private Output<List<ExternalVolumeTopology>> topologies;

    /**
     * @return `(List of topologies)`
     * 
     */
    public Output<List<ExternalVolumeTopology>> topologies() {
        return this.topologies;
    }
    /**
     * `(``TopologyRequest``: &lt;optional&gt;)` - Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
     * 
     */
    @Export(name="topologyRequest", type=ExternalVolumeTopologyRequest.class, parameters={})
    private Output</* @Nullable */ ExternalVolumeTopologyRequest> topologyRequest;

    /**
     * @return `(``TopologyRequest``: &lt;optional&gt;)` - Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
     * 
     */
    public Output<Optional<ExternalVolumeTopologyRequest>> topologyRequest() {
        return Codegen.optional(this.topologyRequest);
    }
    /**
     * `(string: &lt;required&gt;)` - The type of the volume. Currently, only `csi` is supported.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return `(string: &lt;required&gt;)` - The type of the volume. Currently, only `csi` is supported.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }
    /**
     * `(string: &lt;required&gt;)` - The unique ID of the volume.
     * 
     */
    @Export(name="volumeId", type=String.class, parameters={})
    private Output<String> volumeId;

    /**
     * @return `(string: &lt;required&gt;)` - The unique ID of the volume.
     * 
     */
    public Output<String> volumeId() {
        return this.volumeId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ExternalVolume(String name) {
        this(name, ExternalVolumeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ExternalVolume(String name, ExternalVolumeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ExternalVolume(String name, ExternalVolumeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("nomad:index/externalVolume:ExternalVolume", name, args == null ? ExternalVolumeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ExternalVolume(String name, Output<String> id, @Nullable ExternalVolumeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("nomad:index/externalVolume:ExternalVolume", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "secrets"
            ))
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
    public static ExternalVolume get(String name, Output<String> id, @Nullable ExternalVolumeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ExternalVolume(name, id, state, options);
    }
}
