// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.nomad.inputs.CsiVolumeRegistrationCapabilityArgs;
import com.pulumi.nomad.inputs.CsiVolumeRegistrationMountOptionsArgs;
import com.pulumi.nomad.inputs.CsiVolumeRegistrationTopologyRequestArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CsiVolumeRegistrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final CsiVolumeRegistrationArgs Empty = new CsiVolumeRegistrationArgs();

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
    @Import(name="externalId", required=true)
    private Output<String> externalId;

    /**
     * @return `(string: &lt;required&gt;)` - The ID of the physical volume from the storage provider.
     * 
     */
    public Output<String> externalId() {
        return this.externalId;
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
    @Import(name="pluginId", required=true)
    private Output<String> pluginId;

    /**
     * @return `(string: &lt;required&gt;)` - The ID of the Nomad plugin for registering this volume.
     * 
     */
    public Output<String> pluginId() {
        return this.pluginId;
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
    @Import(name="volumeId", required=true)
    private Output<String> volumeId;

    /**
     * @return `(string: &lt;required&gt;)` - The unique ID of the volume.
     * 
     */
    public Output<String> volumeId() {
        return this.volumeId;
    }

    private CsiVolumeRegistrationArgs() {}

    private CsiVolumeRegistrationArgs(CsiVolumeRegistrationArgs $) {
        this.capabilities = $.capabilities;
        this.context = $.context;
        this.deregisterOnDestroy = $.deregisterOnDestroy;
        this.externalId = $.externalId;
        this.mountOptions = $.mountOptions;
        this.name = $.name;
        this.namespace = $.namespace;
        this.parameters = $.parameters;
        this.pluginId = $.pluginId;
        this.secrets = $.secrets;
        this.topologyRequest = $.topologyRequest;
        this.volumeId = $.volumeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CsiVolumeRegistrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CsiVolumeRegistrationArgs $;

        public Builder() {
            $ = new CsiVolumeRegistrationArgs();
        }

        public Builder(CsiVolumeRegistrationArgs defaults) {
            $ = new CsiVolumeRegistrationArgs(Objects.requireNonNull(defaults));
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
        public Builder externalId(Output<String> externalId) {
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
        public Builder pluginId(Output<String> pluginId) {
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
        public Builder volumeId(Output<String> volumeId) {
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

        public CsiVolumeRegistrationArgs build() {
            $.externalId = Objects.requireNonNull($.externalId, "expected parameter 'externalId' to be non-null");
            $.pluginId = Objects.requireNonNull($.pluginId, "expected parameter 'pluginId' to be non-null");
            $.volumeId = Objects.requireNonNull($.volumeId, "expected parameter 'volumeId' to be non-null");
            return $;
        }
    }

}