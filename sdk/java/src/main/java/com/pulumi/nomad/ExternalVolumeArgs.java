// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.nomad.inputs.ExternalVolumeCapabilityArgs;
import com.pulumi.nomad.inputs.ExternalVolumeMountOptionsArgs;
import com.pulumi.nomad.inputs.ExternalVolumeTopologyRequestArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExternalVolumeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExternalVolumeArgs Empty = new ExternalVolumeArgs();

    /**
     * `(``Capability``: &lt;required&gt;)` - Options for validating the capability of a volume.
     * 
     */
    @Import(name="capabilities", required=true)
    private Output<List<ExternalVolumeCapabilityArgs>> capabilities;

    /**
     * @return `(``Capability``: &lt;required&gt;)` - Options for validating the capability of a volume.
     * 
     */
    public Output<List<ExternalVolumeCapabilityArgs>> capabilities() {
        return this.capabilities;
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

    /**
     * `(string: &lt;optional&gt;)` - The external ID of an existing volume to restore. If ommited, the volume will be created from scratch. Conflicts with `snapshot_id`.
     * 
     */
    @Import(name="cloneId")
    private @Nullable Output<String> cloneId;

    /**
     * @return `(string: &lt;optional&gt;)` - The external ID of an existing volume to restore. If ommited, the volume will be created from scratch. Conflicts with `snapshot_id`.
     * 
     */
    public Optional<Output<String>> cloneId() {
        return Optional.ofNullable(this.cloneId);
    }

    /**
     * `(block: optional)` Options for mounting `block-device` volumes without a pre-formatted file system.
     * 
     */
    @Import(name="mountOptions")
    private @Nullable Output<ExternalVolumeMountOptionsArgs> mountOptions;

    /**
     * @return `(block: optional)` Options for mounting `block-device` volumes without a pre-formatted file system.
     * 
     */
    public Optional<Output<ExternalVolumeMountOptionsArgs>> mountOptions() {
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
     * `(map[string]string: optional)` An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    /**
     * @return `(map[string]string: optional)` An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
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
     * `(map[string]string: optional)` An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
     * 
     */
    @Import(name="secrets")
    private @Nullable Output<Map<String,String>> secrets;

    /**
     * @return `(map[string]string: optional)` An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
     * 
     */
    public Optional<Output<Map<String,String>>> secrets() {
        return Optional.ofNullable(this.secrets);
    }

    /**
     * `(string: &lt;optional&gt;)` - The external ID of a snapshot to restore. If ommited, the volume will be created from scratch. Conflicts with `clone_id`.
     * 
     */
    @Import(name="snapshotId")
    private @Nullable Output<String> snapshotId;

    /**
     * @return `(string: &lt;optional&gt;)` - The external ID of a snapshot to restore. If ommited, the volume will be created from scratch. Conflicts with `clone_id`.
     * 
     */
    public Optional<Output<String>> snapshotId() {
        return Optional.ofNullable(this.snapshotId);
    }

    /**
     * `(``TopologyRequest``: &lt;optional&gt;)` - Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
     * 
     */
    @Import(name="topologyRequest")
    private @Nullable Output<ExternalVolumeTopologyRequestArgs> topologyRequest;

    /**
     * @return `(``TopologyRequest``: &lt;optional&gt;)` - Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
     * 
     */
    public Optional<Output<ExternalVolumeTopologyRequestArgs>> topologyRequest() {
        return Optional.ofNullable(this.topologyRequest);
    }

    /**
     * `(string: &lt;required&gt;)` - The type of the volume. Currently, only `csi` is supported.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return `(string: &lt;required&gt;)` - The type of the volume. Currently, only `csi` is supported.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
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

    private ExternalVolumeArgs() {}

    private ExternalVolumeArgs(ExternalVolumeArgs $) {
        this.capabilities = $.capabilities;
        this.capacityMax = $.capacityMax;
        this.capacityMin = $.capacityMin;
        this.cloneId = $.cloneId;
        this.mountOptions = $.mountOptions;
        this.name = $.name;
        this.namespace = $.namespace;
        this.parameters = $.parameters;
        this.pluginId = $.pluginId;
        this.secrets = $.secrets;
        this.snapshotId = $.snapshotId;
        this.topologyRequest = $.topologyRequest;
        this.type = $.type;
        this.volumeId = $.volumeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExternalVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExternalVolumeArgs $;

        public Builder() {
            $ = new ExternalVolumeArgs();
        }

        public Builder(ExternalVolumeArgs defaults) {
            $ = new ExternalVolumeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param capabilities `(``Capability``: &lt;required&gt;)` - Options for validating the capability of a volume.
         * 
         * @return builder
         * 
         */
        public Builder capabilities(Output<List<ExternalVolumeCapabilityArgs>> capabilities) {
            $.capabilities = capabilities;
            return this;
        }

        /**
         * @param capabilities `(``Capability``: &lt;required&gt;)` - Options for validating the capability of a volume.
         * 
         * @return builder
         * 
         */
        public Builder capabilities(List<ExternalVolumeCapabilityArgs> capabilities) {
            return capabilities(Output.of(capabilities));
        }

        /**
         * @param capabilities `(``Capability``: &lt;required&gt;)` - Options for validating the capability of a volume.
         * 
         * @return builder
         * 
         */
        public Builder capabilities(ExternalVolumeCapabilityArgs... capabilities) {
            return capabilities(List.of(capabilities));
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

        /**
         * @param cloneId `(string: &lt;optional&gt;)` - The external ID of an existing volume to restore. If ommited, the volume will be created from scratch. Conflicts with `snapshot_id`.
         * 
         * @return builder
         * 
         */
        public Builder cloneId(@Nullable Output<String> cloneId) {
            $.cloneId = cloneId;
            return this;
        }

        /**
         * @param cloneId `(string: &lt;optional&gt;)` - The external ID of an existing volume to restore. If ommited, the volume will be created from scratch. Conflicts with `snapshot_id`.
         * 
         * @return builder
         * 
         */
        public Builder cloneId(String cloneId) {
            return cloneId(Output.of(cloneId));
        }

        /**
         * @param mountOptions `(block: optional)` Options for mounting `block-device` volumes without a pre-formatted file system.
         * 
         * @return builder
         * 
         */
        public Builder mountOptions(@Nullable Output<ExternalVolumeMountOptionsArgs> mountOptions) {
            $.mountOptions = mountOptions;
            return this;
        }

        /**
         * @param mountOptions `(block: optional)` Options for mounting `block-device` volumes without a pre-formatted file system.
         * 
         * @return builder
         * 
         */
        public Builder mountOptions(ExternalVolumeMountOptionsArgs mountOptions) {
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
         * @param parameters `(map[string]string: optional)` An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters `(map[string]string: optional)` An optional key-value map of strings passed directly to the CSI plugin to configure the volume.
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
         * @param secrets `(map[string]string: optional)` An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
         * 
         * @return builder
         * 
         */
        public Builder secrets(@Nullable Output<Map<String,String>> secrets) {
            $.secrets = secrets;
            return this;
        }

        /**
         * @param secrets `(map[string]string: optional)` An optional key-value map of strings used as credentials for publishing and unpublishing volumes.
         * 
         * @return builder
         * 
         */
        public Builder secrets(Map<String,String> secrets) {
            return secrets(Output.of(secrets));
        }

        /**
         * @param snapshotId `(string: &lt;optional&gt;)` - The external ID of a snapshot to restore. If ommited, the volume will be created from scratch. Conflicts with `clone_id`.
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(@Nullable Output<String> snapshotId) {
            $.snapshotId = snapshotId;
            return this;
        }

        /**
         * @param snapshotId `(string: &lt;optional&gt;)` - The external ID of a snapshot to restore. If ommited, the volume will be created from scratch. Conflicts with `clone_id`.
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(String snapshotId) {
            return snapshotId(Output.of(snapshotId));
        }

        /**
         * @param topologyRequest `(``TopologyRequest``: &lt;optional&gt;)` - Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
         * 
         * @return builder
         * 
         */
        public Builder topologyRequest(@Nullable Output<ExternalVolumeTopologyRequestArgs> topologyRequest) {
            $.topologyRequest = topologyRequest;
            return this;
        }

        /**
         * @param topologyRequest `(``TopologyRequest``: &lt;optional&gt;)` - Specify locations (region, zone, rack, etc.) where the provisioned volume is accessible from.
         * 
         * @return builder
         * 
         */
        public Builder topologyRequest(ExternalVolumeTopologyRequestArgs topologyRequest) {
            return topologyRequest(Output.of(topologyRequest));
        }

        /**
         * @param type `(string: &lt;required&gt;)` - The type of the volume. Currently, only `csi` is supported.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type `(string: &lt;required&gt;)` - The type of the volume. Currently, only `csi` is supported.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
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

        public ExternalVolumeArgs build() {
            if ($.capabilities == null) {
                throw new MissingRequiredPropertyException("ExternalVolumeArgs", "capabilities");
            }
            if ($.pluginId == null) {
                throw new MissingRequiredPropertyException("ExternalVolumeArgs", "pluginId");
            }
            if ($.volumeId == null) {
                throw new MissingRequiredPropertyException("ExternalVolumeArgs", "volumeId");
            }
            return $;
        }
    }

}
