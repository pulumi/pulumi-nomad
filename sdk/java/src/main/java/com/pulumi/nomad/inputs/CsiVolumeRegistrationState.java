// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.nomad.inputs.CsiVolumeRegistrationCapabilityArgs;
import com.pulumi.nomad.inputs.CsiVolumeRegistrationMountOptionsArgs;
import com.pulumi.nomad.inputs.CsiVolumeRegistrationTopologyArgs;
import com.pulumi.nomad.inputs.CsiVolumeRegistrationTopologyRequestArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CsiVolumeRegistrationState extends com.pulumi.resources.ResourceArgs {

    public static final CsiVolumeRegistrationState Empty = new CsiVolumeRegistrationState();

    /**
     * `(``Capability``: &lt;required&gt;)` - Options for validating the capability of a volume.
     * 
     */
    @Import(name="capabilities")
    private @Nullable Output<List<CsiVolumeRegistrationCapabilityArgs>> capabilities;

    /**
     * @return `(``Capability``: &lt;required&gt;)` - Options for validating the capability of a volume.
     * 
     */
    public Optional<Output<List<CsiVolumeRegistrationCapabilityArgs>>> capabilities() {
        return Optional.ofNullable(this.capabilities);
    }

    @Import(name="capacity")
    private @Nullable Output<Integer> capacity;

    public Optional<Output<Integer>> capacity() {
        return Optional.ofNullable(this.capacity);
    }

    /**
     * `(string: &lt;optional&gt;)` - Option to signal a maximum volume size. This may not be supported by all storage providers.
     * 
     */
    @Import(name="capacityMax")
    private @Nullable Output<String> capacityMax;

    /**
     * @return `(string: &lt;optional&gt;)` - Option to signal a maximum volume size. This may not be supported by all storage providers.
     * 
     */
    public Optional<Output<String>> capacityMax() {
        return Optional.ofNullable(this.capacityMax);
    }

    @Import(name="capacityMaxBytes")
    private @Nullable Output<Integer> capacityMaxBytes;

    public Optional<Output<Integer>> capacityMaxBytes() {
        return Optional.ofNullable(this.capacityMaxBytes);
    }

    /**
     * `(string: &lt;optional&gt;)` - Option to signal a minimum volume size. This may not be supported by all storage providers.
     * 
     */
    @Import(name="capacityMin")
    private @Nullable Output<String> capacityMin;

    /**
     * @return `(string: &lt;optional&gt;)` - Option to signal a minimum volume size. This may not be supported by all storage providers.
     * 
     */
    public Optional<Output<String>> capacityMin() {
        return Optional.ofNullable(this.capacityMin);
    }

    @Import(name="capacityMinBytes")
    private @Nullable Output<Integer> capacityMinBytes;

    public Optional<Output<Integer>> capacityMinBytes() {
        return Optional.ofNullable(this.capacityMinBytes);
    }

    /**
     * `(map[string]string: &lt;optional&gt;)` - An optional key-value map of strings passed directly to the CSI plugin to validate the volume.
     * 
     */
    @Import(name="context")
    private @Nullable Output<Map<String,String>> context;

    /**
     * @return `(map[string]string: &lt;optional&gt;)` - An optional key-value map of strings passed directly to the CSI plugin to validate the volume.
     * 
     */
    public Optional<Output<Map<String,String>>> context() {
        return Optional.ofNullable(this.context);
    }

    /**
     * `(boolean)`
     * 
     */
    @Import(name="controllerRequired")
    private @Nullable Output<Boolean> controllerRequired;

    /**
     * @return `(boolean)`
     * 
     */
    public Optional<Output<Boolean>> controllerRequired() {
        return Optional.ofNullable(this.controllerRequired);
    }

    /**
     * `(integer)`
     * 
     */
    @Import(name="controllersExpected")
    private @Nullable Output<Integer> controllersExpected;

    /**
     * @return `(integer)`
     * 
     */
    public Optional<Output<Integer>> controllersExpected() {
        return Optional.ofNullable(this.controllersExpected);
    }

    /**
     * `(integer)`
     * 
     */
    @Import(name="controllersHealthy")
    private @Nullable Output<Integer> controllersHealthy;

    /**
     * @return `(integer)`
     * 
     */
    public Optional<Output<Integer>> controllersHealthy() {
        return Optional.ofNullable(this.controllersHealthy);
    }

    /**
     * `(boolean: false)` - If true, the volume will be deregistered on destroy.
     * 
     */
    @Import(name="deregisterOnDestroy")
    private @Nullable Output<Boolean> deregisterOnDestroy;

    /**
     * @return `(boolean: false)` - If true, the volume will be deregistered on destroy.
     * 
     */
    public Optional<Output<Boolean>> deregisterOnDestroy() {
        return Optional.ofNullable(this.deregisterOnDestroy);
    }

    /**
     * `(string: &lt;required&gt;)` - The ID of the physical volume from the storage provider.
     * 
     */
    @Import(name="externalId")
    private @Nullable Output<String> externalId;

    /**
     * @return `(string: &lt;required&gt;)` - The ID of the physical volume from the storage provider.
     * 
     */
    public Optional<Output<String>> externalId() {
        return Optional.ofNullable(this.externalId);
    }

    /**
     * `(block: &lt;optional&gt;)` Options for mounting `block-device` volumes without a pre-formatted file system.
     * 
     */
    @Import(name="mountOptions")
    private @Nullable Output<CsiVolumeRegistrationMountOptionsArgs> mountOptions;

    /**
     * @return `(block: &lt;optional&gt;)` Options for mounting `block-device` volumes without a pre-formatted file system.
     * 
     */
    public Optional<Output<CsiVolumeRegistrationMountOptionsArgs>> mountOptions() {
        return Optional.ofNullable(this.mountOptions);
    }

    /**
     * `(string: &lt;required&gt;)` - The display name for the volume.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return `(string: &lt;required&gt;)` - The display name for the volume.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * `(string: &#34;default&#34;)` - The namespace in which to register the volume.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return `(string: &#34;default&#34;)` - The namespace in which to register the volume.
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * `(integer)`
     * 
     */
    @Import(name="nodesExpected")
    private @Nullable Output<Integer> nodesExpected;

    /**
     * @return `(integer)`
     * 
     */
    public Optional<Output<Integer>> nodesExpected() {
        return Optional.ofNullable(this.nodesExpected);
    }

    /**
     * `(integer)`
     * 
     */
    @Import(name="nodesHealthy")
    private @Nullable Output<Integer> nodesHealthy;

    /**
     * @return `(integer)`
     * 
     */
    public Optional<Output<Integer>> nodesHealthy() {
        return Optional.ofNullable(this.nodesHealthy);
    }

    /**
     * `(map[string]string: &lt;optional&gt;)` - An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    /**
     * @return `(map[string]string: &lt;optional&gt;)` - An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
     * 
     */
    public Optional<Output<Map<String,String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * `(string: &lt;required&gt;)` - The ID of the Nomad plugin for registering this volume.
     * 
     */
    @Import(name="pluginId")
    private @Nullable Output<String> pluginId;

    /**
     * @return `(string: &lt;required&gt;)` - The ID of the Nomad plugin for registering this volume.
     * 
     */
    public Optional<Output<String>> pluginId() {
        return Optional.ofNullable(this.pluginId);
    }

    /**
     * `(string)`
     * 
     */
    @Import(name="pluginProvider")
    private @Nullable Output<String> pluginProvider;

    /**
     * @return `(string)`
     * 
     */
    public Optional<Output<String>> pluginProvider() {
        return Optional.ofNullable(this.pluginProvider);
    }

    /**
     * `(string)`
     * 
     */
    @Import(name="pluginProviderVersion")
    private @Nullable Output<String> pluginProviderVersion;

    /**
     * @return `(string)`
     * 
     */
    public Optional<Output<String>> pluginProviderVersion() {
        return Optional.ofNullable(this.pluginProviderVersion);
    }

    /**
     * `(boolean)`
     * 
     */
    @Import(name="schedulable")
    private @Nullable Output<Boolean> schedulable;

    /**
     * @return `(boolean)`
     * 
     */
    public Optional<Output<Boolean>> schedulable() {
        return Optional.ofNullable(this.schedulable);
    }

    /**
     * `(map[string]string: &lt;optional&gt;)` - An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
     * 
     */
    @Import(name="secrets")
    private @Nullable Output<Map<String,String>> secrets;

    /**
     * @return `(map[string]string: &lt;optional&gt;)` - An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
     * 
     */
    public Optional<Output<Map<String,String>>> secrets() {
        return Optional.ofNullable(this.secrets);
    }

    /**
     * `(List of topologies)`
     * 
     */
    @Import(name="topologies")
    private @Nullable Output<List<CsiVolumeRegistrationTopologyArgs>> topologies;

    /**
     * @return `(List of topologies)`
     * 
     */
    public Optional<Output<List<CsiVolumeRegistrationTopologyArgs>>> topologies() {
        return Optional.ofNullable(this.topologies);
    }

    /**
     * `(``TopologyRequest``: &lt;optional&gt;)` - Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
     * 
     */
    @Import(name="topologyRequest")
    private @Nullable Output<CsiVolumeRegistrationTopologyRequestArgs> topologyRequest;

    /**
     * @return `(``TopologyRequest``: &lt;optional&gt;)` - Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
     * 
     */
    public Optional<Output<CsiVolumeRegistrationTopologyRequestArgs>> topologyRequest() {
        return Optional.ofNullable(this.topologyRequest);
    }

    /**
     * `(string: &lt;required&gt;)` - The unique ID of the volume.
     * 
     */
    @Import(name="volumeId")
    private @Nullable Output<String> volumeId;

    /**
     * @return `(string: &lt;required&gt;)` - The unique ID of the volume.
     * 
     */
    public Optional<Output<String>> volumeId() {
        return Optional.ofNullable(this.volumeId);
    }

    private CsiVolumeRegistrationState() {}

    private CsiVolumeRegistrationState(CsiVolumeRegistrationState $) {
        this.capabilities = $.capabilities;
        this.capacity = $.capacity;
        this.capacityMax = $.capacityMax;
        this.capacityMaxBytes = $.capacityMaxBytes;
        this.capacityMin = $.capacityMin;
        this.capacityMinBytes = $.capacityMinBytes;
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
        this.volumeId = $.volumeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CsiVolumeRegistrationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CsiVolumeRegistrationState $;

        public Builder() {
            $ = new CsiVolumeRegistrationState();
        }

        public Builder(CsiVolumeRegistrationState defaults) {
            $ = new CsiVolumeRegistrationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param capabilities `(``Capability``: &lt;required&gt;)` - Options for validating the capability of a volume.
         * 
         * @return builder
         * 
         */
        public Builder capabilities(@Nullable Output<List<CsiVolumeRegistrationCapabilityArgs>> capabilities) {
            $.capabilities = capabilities;
            return this;
        }

        /**
         * @param capabilities `(``Capability``: &lt;required&gt;)` - Options for validating the capability of a volume.
         * 
         * @return builder
         * 
         */
        public Builder capabilities(List<CsiVolumeRegistrationCapabilityArgs> capabilities) {
            return capabilities(Output.of(capabilities));
        }

        /**
         * @param capabilities `(``Capability``: &lt;required&gt;)` - Options for validating the capability of a volume.
         * 
         * @return builder
         * 
         */
        public Builder capabilities(CsiVolumeRegistrationCapabilityArgs... capabilities) {
            return capabilities(List.of(capabilities));
        }

        public Builder capacity(@Nullable Output<Integer> capacity) {
            $.capacity = capacity;
            return this;
        }

        public Builder capacity(Integer capacity) {
            return capacity(Output.of(capacity));
        }

        /**
         * @param capacityMax `(string: &lt;optional&gt;)` - Option to signal a maximum volume size. This may not be supported by all storage providers.
         * 
         * @return builder
         * 
         */
        public Builder capacityMax(@Nullable Output<String> capacityMax) {
            $.capacityMax = capacityMax;
            return this;
        }

        /**
         * @param capacityMax `(string: &lt;optional&gt;)` - Option to signal a maximum volume size. This may not be supported by all storage providers.
         * 
         * @return builder
         * 
         */
        public Builder capacityMax(String capacityMax) {
            return capacityMax(Output.of(capacityMax));
        }

        public Builder capacityMaxBytes(@Nullable Output<Integer> capacityMaxBytes) {
            $.capacityMaxBytes = capacityMaxBytes;
            return this;
        }

        public Builder capacityMaxBytes(Integer capacityMaxBytes) {
            return capacityMaxBytes(Output.of(capacityMaxBytes));
        }

        /**
         * @param capacityMin `(string: &lt;optional&gt;)` - Option to signal a minimum volume size. This may not be supported by all storage providers.
         * 
         * @return builder
         * 
         */
        public Builder capacityMin(@Nullable Output<String> capacityMin) {
            $.capacityMin = capacityMin;
            return this;
        }

        /**
         * @param capacityMin `(string: &lt;optional&gt;)` - Option to signal a minimum volume size. This may not be supported by all storage providers.
         * 
         * @return builder
         * 
         */
        public Builder capacityMin(String capacityMin) {
            return capacityMin(Output.of(capacityMin));
        }

        public Builder capacityMinBytes(@Nullable Output<Integer> capacityMinBytes) {
            $.capacityMinBytes = capacityMinBytes;
            return this;
        }

        public Builder capacityMinBytes(Integer capacityMinBytes) {
            return capacityMinBytes(Output.of(capacityMinBytes));
        }

        /**
         * @param context `(map[string]string: &lt;optional&gt;)` - An optional key-value map of strings passed directly to the CSI plugin to validate the volume.
         * 
         * @return builder
         * 
         */
        public Builder context(@Nullable Output<Map<String,String>> context) {
            $.context = context;
            return this;
        }

        /**
         * @param context `(map[string]string: &lt;optional&gt;)` - An optional key-value map of strings passed directly to the CSI plugin to validate the volume.
         * 
         * @return builder
         * 
         */
        public Builder context(Map<String,String> context) {
            return context(Output.of(context));
        }

        /**
         * @param controllerRequired `(boolean)`
         * 
         * @return builder
         * 
         */
        public Builder controllerRequired(@Nullable Output<Boolean> controllerRequired) {
            $.controllerRequired = controllerRequired;
            return this;
        }

        /**
         * @param controllerRequired `(boolean)`
         * 
         * @return builder
         * 
         */
        public Builder controllerRequired(Boolean controllerRequired) {
            return controllerRequired(Output.of(controllerRequired));
        }

        /**
         * @param controllersExpected `(integer)`
         * 
         * @return builder
         * 
         */
        public Builder controllersExpected(@Nullable Output<Integer> controllersExpected) {
            $.controllersExpected = controllersExpected;
            return this;
        }

        /**
         * @param controllersExpected `(integer)`
         * 
         * @return builder
         * 
         */
        public Builder controllersExpected(Integer controllersExpected) {
            return controllersExpected(Output.of(controllersExpected));
        }

        /**
         * @param controllersHealthy `(integer)`
         * 
         * @return builder
         * 
         */
        public Builder controllersHealthy(@Nullable Output<Integer> controllersHealthy) {
            $.controllersHealthy = controllersHealthy;
            return this;
        }

        /**
         * @param controllersHealthy `(integer)`
         * 
         * @return builder
         * 
         */
        public Builder controllersHealthy(Integer controllersHealthy) {
            return controllersHealthy(Output.of(controllersHealthy));
        }

        /**
         * @param deregisterOnDestroy `(boolean: false)` - If true, the volume will be deregistered on destroy.
         * 
         * @return builder
         * 
         */
        public Builder deregisterOnDestroy(@Nullable Output<Boolean> deregisterOnDestroy) {
            $.deregisterOnDestroy = deregisterOnDestroy;
            return this;
        }

        /**
         * @param deregisterOnDestroy `(boolean: false)` - If true, the volume will be deregistered on destroy.
         * 
         * @return builder
         * 
         */
        public Builder deregisterOnDestroy(Boolean deregisterOnDestroy) {
            return deregisterOnDestroy(Output.of(deregisterOnDestroy));
        }

        /**
         * @param externalId `(string: &lt;required&gt;)` - The ID of the physical volume from the storage provider.
         * 
         * @return builder
         * 
         */
        public Builder externalId(@Nullable Output<String> externalId) {
            $.externalId = externalId;
            return this;
        }

        /**
         * @param externalId `(string: &lt;required&gt;)` - The ID of the physical volume from the storage provider.
         * 
         * @return builder
         * 
         */
        public Builder externalId(String externalId) {
            return externalId(Output.of(externalId));
        }

        /**
         * @param mountOptions `(block: &lt;optional&gt;)` Options for mounting `block-device` volumes without a pre-formatted file system.
         * 
         * @return builder
         * 
         */
        public Builder mountOptions(@Nullable Output<CsiVolumeRegistrationMountOptionsArgs> mountOptions) {
            $.mountOptions = mountOptions;
            return this;
        }

        /**
         * @param mountOptions `(block: &lt;optional&gt;)` Options for mounting `block-device` volumes without a pre-formatted file system.
         * 
         * @return builder
         * 
         */
        public Builder mountOptions(CsiVolumeRegistrationMountOptionsArgs mountOptions) {
            return mountOptions(Output.of(mountOptions));
        }

        /**
         * @param name `(string: &lt;required&gt;)` - The display name for the volume.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name `(string: &lt;required&gt;)` - The display name for the volume.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespace `(string: &#34;default&#34;)` - The namespace in which to register the volume.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace `(string: &#34;default&#34;)` - The namespace in which to register the volume.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param nodesExpected `(integer)`
         * 
         * @return builder
         * 
         */
        public Builder nodesExpected(@Nullable Output<Integer> nodesExpected) {
            $.nodesExpected = nodesExpected;
            return this;
        }

        /**
         * @param nodesExpected `(integer)`
         * 
         * @return builder
         * 
         */
        public Builder nodesExpected(Integer nodesExpected) {
            return nodesExpected(Output.of(nodesExpected));
        }

        /**
         * @param nodesHealthy `(integer)`
         * 
         * @return builder
         * 
         */
        public Builder nodesHealthy(@Nullable Output<Integer> nodesHealthy) {
            $.nodesHealthy = nodesHealthy;
            return this;
        }

        /**
         * @param nodesHealthy `(integer)`
         * 
         * @return builder
         * 
         */
        public Builder nodesHealthy(Integer nodesHealthy) {
            return nodesHealthy(Output.of(nodesHealthy));
        }

        /**
         * @param parameters `(map[string]string: &lt;optional&gt;)` - An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters `(map[string]string: &lt;optional&gt;)` - An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,String> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param pluginId `(string: &lt;required&gt;)` - The ID of the Nomad plugin for registering this volume.
         * 
         * @return builder
         * 
         */
        public Builder pluginId(@Nullable Output<String> pluginId) {
            $.pluginId = pluginId;
            return this;
        }

        /**
         * @param pluginId `(string: &lt;required&gt;)` - The ID of the Nomad plugin for registering this volume.
         * 
         * @return builder
         * 
         */
        public Builder pluginId(String pluginId) {
            return pluginId(Output.of(pluginId));
        }

        /**
         * @param pluginProvider `(string)`
         * 
         * @return builder
         * 
         */
        public Builder pluginProvider(@Nullable Output<String> pluginProvider) {
            $.pluginProvider = pluginProvider;
            return this;
        }

        /**
         * @param pluginProvider `(string)`
         * 
         * @return builder
         * 
         */
        public Builder pluginProvider(String pluginProvider) {
            return pluginProvider(Output.of(pluginProvider));
        }

        /**
         * @param pluginProviderVersion `(string)`
         * 
         * @return builder
         * 
         */
        public Builder pluginProviderVersion(@Nullable Output<String> pluginProviderVersion) {
            $.pluginProviderVersion = pluginProviderVersion;
            return this;
        }

        /**
         * @param pluginProviderVersion `(string)`
         * 
         * @return builder
         * 
         */
        public Builder pluginProviderVersion(String pluginProviderVersion) {
            return pluginProviderVersion(Output.of(pluginProviderVersion));
        }

        /**
         * @param schedulable `(boolean)`
         * 
         * @return builder
         * 
         */
        public Builder schedulable(@Nullable Output<Boolean> schedulable) {
            $.schedulable = schedulable;
            return this;
        }

        /**
         * @param schedulable `(boolean)`
         * 
         * @return builder
         * 
         */
        public Builder schedulable(Boolean schedulable) {
            return schedulable(Output.of(schedulable));
        }

        /**
         * @param secrets `(map[string]string: &lt;optional&gt;)` - An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
         * 
         * @return builder
         * 
         */
        public Builder secrets(@Nullable Output<Map<String,String>> secrets) {
            $.secrets = secrets;
            return this;
        }

        /**
         * @param secrets `(map[string]string: &lt;optional&gt;)` - An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
         * 
         * @return builder
         * 
         */
        public Builder secrets(Map<String,String> secrets) {
            return secrets(Output.of(secrets));
        }

        /**
         * @param topologies `(List of topologies)`
         * 
         * @return builder
         * 
         */
        public Builder topologies(@Nullable Output<List<CsiVolumeRegistrationTopologyArgs>> topologies) {
            $.topologies = topologies;
            return this;
        }

        /**
         * @param topologies `(List of topologies)`
         * 
         * @return builder
         * 
         */
        public Builder topologies(List<CsiVolumeRegistrationTopologyArgs> topologies) {
            return topologies(Output.of(topologies));
        }

        /**
         * @param topologies `(List of topologies)`
         * 
         * @return builder
         * 
         */
        public Builder topologies(CsiVolumeRegistrationTopologyArgs... topologies) {
            return topologies(List.of(topologies));
        }

        /**
         * @param topologyRequest `(``TopologyRequest``: &lt;optional&gt;)` - Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
         * 
         * @return builder
         * 
         */
        public Builder topologyRequest(@Nullable Output<CsiVolumeRegistrationTopologyRequestArgs> topologyRequest) {
            $.topologyRequest = topologyRequest;
            return this;
        }

        /**
         * @param topologyRequest `(``TopologyRequest``: &lt;optional&gt;)` - Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
         * 
         * @return builder
         * 
         */
        public Builder topologyRequest(CsiVolumeRegistrationTopologyRequestArgs topologyRequest) {
            return topologyRequest(Output.of(topologyRequest));
        }

        /**
         * @param volumeId `(string: &lt;required&gt;)` - The unique ID of the volume.
         * 
         * @return builder
         * 
         */
        public Builder volumeId(@Nullable Output<String> volumeId) {
            $.volumeId = volumeId;
            return this;
        }

        /**
         * @param volumeId `(string: &lt;required&gt;)` - The unique ID of the volume.
         * 
         * @return builder
         * 
         */
        public Builder volumeId(String volumeId) {
            return volumeId(Output.of(volumeId));
        }

        public CsiVolumeRegistrationState build() {
            return $;
        }
    }

}
