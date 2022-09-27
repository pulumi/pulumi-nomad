// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.nomad.inputs.VolumeCapabilityArgs;
import com.pulumi.nomad.inputs.VolumeMountOptionsArgs;
import com.pulumi.nomad.inputs.VolumeTopologyArgs;
import com.pulumi.nomad.inputs.VolumeTopologyRequestArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VolumeState extends com.pulumi.resources.ResourceArgs {

    public static final VolumeState Empty = new VolumeState();

    /**
     * Defines whether a volume should be available concurrently.
     * 
     * @deprecated
     * use capability instead
     * 
     */
    @Deprecated /* use capability instead */
    @Import(name="accessMode")
    private @Nullable Output<String> accessMode;

    /**
     * @return Defines whether a volume should be available concurrently.
     * 
     * @deprecated
     * use capability instead
     * 
     */
    @Deprecated /* use capability instead */
    public Optional<Output<String>> accessMode() {
        return Optional.ofNullable(this.accessMode);
    }

    /**
     * The storage API that will be used by the volume.
     * 
     * @deprecated
     * use capability instead
     * 
     */
    @Deprecated /* use capability instead */
    @Import(name="attachmentMode")
    private @Nullable Output<String> attachmentMode;

    /**
     * @return The storage API that will be used by the volume.
     * 
     * @deprecated
     * use capability instead
     * 
     */
    @Deprecated /* use capability instead */
    public Optional<Output<String>> attachmentMode() {
        return Optional.ofNullable(this.attachmentMode);
    }

    /**
     * Capabilities intended to be used in a job. At least one capability must be provided.
     * 
     */
    @Import(name="capabilities")
    private @Nullable Output<List<VolumeCapabilityArgs>> capabilities;

    /**
     * @return Capabilities intended to be used in a job. At least one capability must be provided.
     * 
     */
    public Optional<Output<List<VolumeCapabilityArgs>>> capabilities() {
        return Optional.ofNullable(this.capabilities);
    }

    /**
     * An optional key-value map of strings passed directly to the CSI plugin to validate the volume.
     * 
     */
    @Import(name="context")
    private @Nullable Output<Map<String,String>> context;

    /**
     * @return An optional key-value map of strings passed directly to the CSI plugin to validate the volume.
     * 
     */
    public Optional<Output<Map<String,String>>> context() {
        return Optional.ofNullable(this.context);
    }

    @Import(name="controllerRequired")
    private @Nullable Output<Boolean> controllerRequired;

    public Optional<Output<Boolean>> controllerRequired() {
        return Optional.ofNullable(this.controllerRequired);
    }

    @Import(name="controllersExpected")
    private @Nullable Output<Integer> controllersExpected;

    public Optional<Output<Integer>> controllersExpected() {
        return Optional.ofNullable(this.controllersExpected);
    }

    @Import(name="controllersHealthy")
    private @Nullable Output<Integer> controllersHealthy;

    public Optional<Output<Integer>> controllersHealthy() {
        return Optional.ofNullable(this.controllersHealthy);
    }

    /**
     * If true, the volume will be deregistered on destroy.
     * 
     */
    @Import(name="deregisterOnDestroy")
    private @Nullable Output<Boolean> deregisterOnDestroy;

    /**
     * @return If true, the volume will be deregistered on destroy.
     * 
     */
    public Optional<Output<Boolean>> deregisterOnDestroy() {
        return Optional.ofNullable(this.deregisterOnDestroy);
    }

    /**
     * The ID of the physical volume from the storage provider.
     * 
     */
    @Import(name="externalId")
    private @Nullable Output<String> externalId;

    /**
     * @return The ID of the physical volume from the storage provider.
     * 
     */
    public Optional<Output<String>> externalId() {
        return Optional.ofNullable(this.externalId);
    }

    /**
     * Options for mounting &#39;block-device&#39; volumes without a pre-formatted file system.
     * 
     */
    @Import(name="mountOptions")
    private @Nullable Output<VolumeMountOptionsArgs> mountOptions;

    /**
     * @return Options for mounting &#39;block-device&#39; volumes without a pre-formatted file system.
     * 
     */
    public Optional<Output<VolumeMountOptionsArgs>> mountOptions() {
        return Optional.ofNullable(this.mountOptions);
    }

    /**
     * The display name of the volume.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The display name of the volume.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The namespace in which to create the volume.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return The namespace in which to create the volume.
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    @Import(name="nodesExpected")
    private @Nullable Output<Integer> nodesExpected;

    public Optional<Output<Integer>> nodesExpected() {
        return Optional.ofNullable(this.nodesExpected);
    }

    @Import(name="nodesHealthy")
    private @Nullable Output<Integer> nodesHealthy;

    public Optional<Output<Integer>> nodesHealthy() {
        return Optional.ofNullable(this.nodesHealthy);
    }

    /**
     * An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    /**
     * @return An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
     * 
     */
    public Optional<Output<Map<String,String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The ID of the CSI plugin that manages this volume.
     * 
     */
    @Import(name="pluginId")
    private @Nullable Output<String> pluginId;

    /**
     * @return The ID of the CSI plugin that manages this volume.
     * 
     */
    public Optional<Output<String>> pluginId() {
        return Optional.ofNullable(this.pluginId);
    }

    @Import(name="pluginProvider")
    private @Nullable Output<String> pluginProvider;

    public Optional<Output<String>> pluginProvider() {
        return Optional.ofNullable(this.pluginProvider);
    }

    @Import(name="pluginProviderVersion")
    private @Nullable Output<String> pluginProviderVersion;

    public Optional<Output<String>> pluginProviderVersion() {
        return Optional.ofNullable(this.pluginProviderVersion);
    }

    @Import(name="schedulable")
    private @Nullable Output<Boolean> schedulable;

    public Optional<Output<Boolean>> schedulable() {
        return Optional.ofNullable(this.schedulable);
    }

    /**
     * An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
     * 
     */
    @Import(name="secrets")
    private @Nullable Output<Map<String,String>> secrets;

    /**
     * @return An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
     * 
     */
    public Optional<Output<Map<String,String>>> secrets() {
        return Optional.ofNullable(this.secrets);
    }

    @Import(name="topologies")
    private @Nullable Output<List<VolumeTopologyArgs>> topologies;

    public Optional<Output<List<VolumeTopologyArgs>>> topologies() {
        return Optional.ofNullable(this.topologies);
    }

    /**
     * Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
     * 
     */
    @Import(name="topologyRequest")
    private @Nullable Output<VolumeTopologyRequestArgs> topologyRequest;

    /**
     * @return Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
     * 
     */
    public Optional<Output<VolumeTopologyRequestArgs>> topologyRequest() {
        return Optional.ofNullable(this.topologyRequest);
    }

    /**
     * The type of the volume. Currently, only &#39;csi&#39; is supported.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the volume. Currently, only &#39;csi&#39; is supported.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The unique ID of the volume, how jobs will refer to the volume.
     * 
     */
    @Import(name="volumeId")
    private @Nullable Output<String> volumeId;

    /**
     * @return The unique ID of the volume, how jobs will refer to the volume.
     * 
     */
    public Optional<Output<String>> volumeId() {
        return Optional.ofNullable(this.volumeId);
    }

    private VolumeState() {}

    private VolumeState(VolumeState $) {
        this.accessMode = $.accessMode;
        this.attachmentMode = $.attachmentMode;
        this.capabilities = $.capabilities;
        this.context = $.context;
        this.controllerRequired = $.controllerRequired;
        this.controllersExpected = $.controllersExpected;
        this.controllersHealthy = $.controllersHealthy;
        this.deregisterOnDestroy = $.deregisterOnDestroy;
        this.externalId = $.externalId;
        this.mountOptions = $.mountOptions;
        this.name = $.name;
        this.namespace = $.namespace;
        this.nodesExpected = $.nodesExpected;
        this.nodesHealthy = $.nodesHealthy;
        this.parameters = $.parameters;
        this.pluginId = $.pluginId;
        this.pluginProvider = $.pluginProvider;
        this.pluginProviderVersion = $.pluginProviderVersion;
        this.schedulable = $.schedulable;
        this.secrets = $.secrets;
        this.topologies = $.topologies;
        this.topologyRequest = $.topologyRequest;
        this.type = $.type;
        this.volumeId = $.volumeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumeState $;

        public Builder() {
            $ = new VolumeState();
        }

        public Builder(VolumeState defaults) {
            $ = new VolumeState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessMode Defines whether a volume should be available concurrently.
         * 
         * @return builder
         * 
         * @deprecated
         * use capability instead
         * 
         */
        @Deprecated /* use capability instead */
        public Builder accessMode(@Nullable Output<String> accessMode) {
            $.accessMode = accessMode;
            return this;
        }

        /**
         * @param accessMode Defines whether a volume should be available concurrently.
         * 
         * @return builder
         * 
         * @deprecated
         * use capability instead
         * 
         */
        @Deprecated /* use capability instead */
        public Builder accessMode(String accessMode) {
            return accessMode(Output.of(accessMode));
        }

        /**
         * @param attachmentMode The storage API that will be used by the volume.
         * 
         * @return builder
         * 
         * @deprecated
         * use capability instead
         * 
         */
        @Deprecated /* use capability instead */
        public Builder attachmentMode(@Nullable Output<String> attachmentMode) {
            $.attachmentMode = attachmentMode;
            return this;
        }

        /**
         * @param attachmentMode The storage API that will be used by the volume.
         * 
         * @return builder
         * 
         * @deprecated
         * use capability instead
         * 
         */
        @Deprecated /* use capability instead */
        public Builder attachmentMode(String attachmentMode) {
            return attachmentMode(Output.of(attachmentMode));
        }

        /**
         * @param capabilities Capabilities intended to be used in a job. At least one capability must be provided.
         * 
         * @return builder
         * 
         */
        public Builder capabilities(@Nullable Output<List<VolumeCapabilityArgs>> capabilities) {
            $.capabilities = capabilities;
            return this;
        }

        /**
         * @param capabilities Capabilities intended to be used in a job. At least one capability must be provided.
         * 
         * @return builder
         * 
         */
        public Builder capabilities(List<VolumeCapabilityArgs> capabilities) {
            return capabilities(Output.of(capabilities));
        }

        /**
         * @param capabilities Capabilities intended to be used in a job. At least one capability must be provided.
         * 
         * @return builder
         * 
         */
        public Builder capabilities(VolumeCapabilityArgs... capabilities) {
            return capabilities(List.of(capabilities));
        }

        /**
         * @param context An optional key-value map of strings passed directly to the CSI plugin to validate the volume.
         * 
         * @return builder
         * 
         */
        public Builder context(@Nullable Output<Map<String,String>> context) {
            $.context = context;
            return this;
        }

        /**
         * @param context An optional key-value map of strings passed directly to the CSI plugin to validate the volume.
         * 
         * @return builder
         * 
         */
        public Builder context(Map<String,String> context) {
            return context(Output.of(context));
        }

        public Builder controllerRequired(@Nullable Output<Boolean> controllerRequired) {
            $.controllerRequired = controllerRequired;
            return this;
        }

        public Builder controllerRequired(Boolean controllerRequired) {
            return controllerRequired(Output.of(controllerRequired));
        }

        public Builder controllersExpected(@Nullable Output<Integer> controllersExpected) {
            $.controllersExpected = controllersExpected;
            return this;
        }

        public Builder controllersExpected(Integer controllersExpected) {
            return controllersExpected(Output.of(controllersExpected));
        }

        public Builder controllersHealthy(@Nullable Output<Integer> controllersHealthy) {
            $.controllersHealthy = controllersHealthy;
            return this;
        }

        public Builder controllersHealthy(Integer controllersHealthy) {
            return controllersHealthy(Output.of(controllersHealthy));
        }

        /**
         * @param deregisterOnDestroy If true, the volume will be deregistered on destroy.
         * 
         * @return builder
         * 
         */
        public Builder deregisterOnDestroy(@Nullable Output<Boolean> deregisterOnDestroy) {
            $.deregisterOnDestroy = deregisterOnDestroy;
            return this;
        }

        /**
         * @param deregisterOnDestroy If true, the volume will be deregistered on destroy.
         * 
         * @return builder
         * 
         */
        public Builder deregisterOnDestroy(Boolean deregisterOnDestroy) {
            return deregisterOnDestroy(Output.of(deregisterOnDestroy));
        }

        /**
         * @param externalId The ID of the physical volume from the storage provider.
         * 
         * @return builder
         * 
         */
        public Builder externalId(@Nullable Output<String> externalId) {
            $.externalId = externalId;
            return this;
        }

        /**
         * @param externalId The ID of the physical volume from the storage provider.
         * 
         * @return builder
         * 
         */
        public Builder externalId(String externalId) {
            return externalId(Output.of(externalId));
        }

        /**
         * @param mountOptions Options for mounting &#39;block-device&#39; volumes without a pre-formatted file system.
         * 
         * @return builder
         * 
         */
        public Builder mountOptions(@Nullable Output<VolumeMountOptionsArgs> mountOptions) {
            $.mountOptions = mountOptions;
            return this;
        }

        /**
         * @param mountOptions Options for mounting &#39;block-device&#39; volumes without a pre-formatted file system.
         * 
         * @return builder
         * 
         */
        public Builder mountOptions(VolumeMountOptionsArgs mountOptions) {
            return mountOptions(Output.of(mountOptions));
        }

        /**
         * @param name The display name of the volume.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The display name of the volume.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespace The namespace in which to create the volume.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace The namespace in which to create the volume.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public Builder nodesExpected(@Nullable Output<Integer> nodesExpected) {
            $.nodesExpected = nodesExpected;
            return this;
        }

        public Builder nodesExpected(Integer nodesExpected) {
            return nodesExpected(Output.of(nodesExpected));
        }

        public Builder nodesHealthy(@Nullable Output<Integer> nodesHealthy) {
            $.nodesHealthy = nodesHealthy;
            return this;
        }

        public Builder nodesHealthy(Integer nodesHealthy) {
            return nodesHealthy(Output.of(nodesHealthy));
        }

        /**
         * @param parameters An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,String> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param pluginId The ID of the CSI plugin that manages this volume.
         * 
         * @return builder
         * 
         */
        public Builder pluginId(@Nullable Output<String> pluginId) {
            $.pluginId = pluginId;
            return this;
        }

        /**
         * @param pluginId The ID of the CSI plugin that manages this volume.
         * 
         * @return builder
         * 
         */
        public Builder pluginId(String pluginId) {
            return pluginId(Output.of(pluginId));
        }

        public Builder pluginProvider(@Nullable Output<String> pluginProvider) {
            $.pluginProvider = pluginProvider;
            return this;
        }

        public Builder pluginProvider(String pluginProvider) {
            return pluginProvider(Output.of(pluginProvider));
        }

        public Builder pluginProviderVersion(@Nullable Output<String> pluginProviderVersion) {
            $.pluginProviderVersion = pluginProviderVersion;
            return this;
        }

        public Builder pluginProviderVersion(String pluginProviderVersion) {
            return pluginProviderVersion(Output.of(pluginProviderVersion));
        }

        public Builder schedulable(@Nullable Output<Boolean> schedulable) {
            $.schedulable = schedulable;
            return this;
        }

        public Builder schedulable(Boolean schedulable) {
            return schedulable(Output.of(schedulable));
        }

        /**
         * @param secrets An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
         * 
         * @return builder
         * 
         */
        public Builder secrets(@Nullable Output<Map<String,String>> secrets) {
            $.secrets = secrets;
            return this;
        }

        /**
         * @param secrets An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
         * 
         * @return builder
         * 
         */
        public Builder secrets(Map<String,String> secrets) {
            return secrets(Output.of(secrets));
        }

        public Builder topologies(@Nullable Output<List<VolumeTopologyArgs>> topologies) {
            $.topologies = topologies;
            return this;
        }

        public Builder topologies(List<VolumeTopologyArgs> topologies) {
            return topologies(Output.of(topologies));
        }

        public Builder topologies(VolumeTopologyArgs... topologies) {
            return topologies(List.of(topologies));
        }

        /**
         * @param topologyRequest Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
         * 
         * @return builder
         * 
         */
        public Builder topologyRequest(@Nullable Output<VolumeTopologyRequestArgs> topologyRequest) {
            $.topologyRequest = topologyRequest;
            return this;
        }

        /**
         * @param topologyRequest Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
         * 
         * @return builder
         * 
         */
        public Builder topologyRequest(VolumeTopologyRequestArgs topologyRequest) {
            return topologyRequest(Output.of(topologyRequest));
        }

        /**
         * @param type The type of the volume. Currently, only &#39;csi&#39; is supported.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the volume. Currently, only &#39;csi&#39; is supported.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param volumeId The unique ID of the volume, how jobs will refer to the volume.
         * 
         * @return builder
         * 
         */
        public Builder volumeId(@Nullable Output<String> volumeId) {
            $.volumeId = volumeId;
            return this;
        }

        /**
         * @param volumeId The unique ID of the volume, how jobs will refer to the volume.
         * 
         * @return builder
         * 
         */
        public Builder volumeId(String volumeId) {
            return volumeId(Output.of(volumeId));
        }

        public VolumeState build() {
            return $;
        }
    }

}
