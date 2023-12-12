// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.nomad.outputs.GetJobConstraint;
import com.pulumi.nomad.outputs.GetJobPeriodicConfig;
import com.pulumi.nomad.outputs.GetJobTaskGroup;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobResult {
    /**
     * @return `(boolean)`  If the scheduler can make partial placements on oversubscribed nodes.
     * 
     */
    private Boolean allAtOnce;
    private List<GetJobConstraint> constraints;
    /**
     * @return `(integer)` Creation Index.
     * 
     */
    private Integer createIndex;
    /**
     * @return `(list of strings)` Datacenters allowed to run the specified job.
     * 
     */
    private List<String> datacenters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String jobId;
    /**
     * @return `(integer)` Job modify index (used for version verification).
     * 
     */
    private Integer jobModifyIndex;
    /**
     * @return `(integer)` Modification Index.
     * 
     */
    private Integer modifyIndex;
    /**
     * @return `(string)` Name of the job.
     * 
     */
    private String name;
    /**
     * @return `(string)` Namespace of the specified job.
     * 
     */
    private @Nullable String namespace;
    /**
     * @return `(string)` Job&#39;s parent ID.
     * 
     */
    private String parentId;
    /**
     * @return `(list of maps)` Job&#39;s periodic configuration (time based scheduling).
     * 
     */
    private List<GetJobPeriodicConfig> periodicConfigs;
    /**
     * @return `(integer)` Used for the prioritization of scheduling and resource access.
     * 
     */
    private Integer priority;
    /**
     * @return `(string)` Region where the Nomad cluster resides.
     * 
     */
    private String region;
    /**
     * @return `(boolean)` Job stability status.
     * 
     */
    private Boolean stable;
    /**
     * @return `(string)` Execution status of the specified job.
     * 
     */
    private String status;
    /**
     * @return `(string)` Status description of the specified job.
     * 
     */
    private String statusDescription;
    /**
     * @return `(boolean)` Job enabled status.
     * 
     */
    private Boolean stop;
    /**
     * @return `(integer)` Job submission date.
     * 
     */
    private Integer submitTime;
    /**
     * @return `(list of maps)` A list of of the job&#39;s task groups.
     * 
     */
    private List<GetJobTaskGroup> taskGroups;
    /**
     * @return `(string)` Scheduler type used during job creation.
     * 
     */
    private String type;
    /**
     * @return `(integer)` Version of the specified job.
     * 
     */
    private Integer version;

    private GetJobResult() {}
    /**
     * @return `(boolean)`  If the scheduler can make partial placements on oversubscribed nodes.
     * 
     */
    public Boolean allAtOnce() {
        return this.allAtOnce;
    }
    public List<GetJobConstraint> constraints() {
        return this.constraints;
    }
    /**
     * @return `(integer)` Creation Index.
     * 
     */
    public Integer createIndex() {
        return this.createIndex;
    }
    /**
     * @return `(list of strings)` Datacenters allowed to run the specified job.
     * 
     */
    public List<String> datacenters() {
        return this.datacenters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String jobId() {
        return this.jobId;
    }
    /**
     * @return `(integer)` Job modify index (used for version verification).
     * 
     */
    public Integer jobModifyIndex() {
        return this.jobModifyIndex;
    }
    /**
     * @return `(integer)` Modification Index.
     * 
     */
    public Integer modifyIndex() {
        return this.modifyIndex;
    }
    /**
     * @return `(string)` Name of the job.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return `(string)` Namespace of the specified job.
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    /**
     * @return `(string)` Job&#39;s parent ID.
     * 
     */
    public String parentId() {
        return this.parentId;
    }
    /**
     * @return `(list of maps)` Job&#39;s periodic configuration (time based scheduling).
     * 
     */
    public List<GetJobPeriodicConfig> periodicConfigs() {
        return this.periodicConfigs;
    }
    /**
     * @return `(integer)` Used for the prioritization of scheduling and resource access.
     * 
     */
    public Integer priority() {
        return this.priority;
    }
    /**
     * @return `(string)` Region where the Nomad cluster resides.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return `(boolean)` Job stability status.
     * 
     */
    public Boolean stable() {
        return this.stable;
    }
    /**
     * @return `(string)` Execution status of the specified job.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return `(string)` Status description of the specified job.
     * 
     */
    public String statusDescription() {
        return this.statusDescription;
    }
    /**
     * @return `(boolean)` Job enabled status.
     * 
     */
    public Boolean stop() {
        return this.stop;
    }
    /**
     * @return `(integer)` Job submission date.
     * 
     */
    public Integer submitTime() {
        return this.submitTime;
    }
    /**
     * @return `(list of maps)` A list of of the job&#39;s task groups.
     * 
     */
    public List<GetJobTaskGroup> taskGroups() {
        return this.taskGroups;
    }
    /**
     * @return `(string)` Scheduler type used during job creation.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return `(integer)` Version of the specified job.
     * 
     */
    public Integer version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean allAtOnce;
        private List<GetJobConstraint> constraints;
        private Integer createIndex;
        private List<String> datacenters;
        private String id;
        private String jobId;
        private Integer jobModifyIndex;
        private Integer modifyIndex;
        private String name;
        private @Nullable String namespace;
        private String parentId;
        private List<GetJobPeriodicConfig> periodicConfigs;
        private Integer priority;
        private String region;
        private Boolean stable;
        private String status;
        private String statusDescription;
        private Boolean stop;
        private Integer submitTime;
        private List<GetJobTaskGroup> taskGroups;
        private String type;
        private Integer version;
        public Builder() {}
        public Builder(GetJobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allAtOnce = defaults.allAtOnce;
    	      this.constraints = defaults.constraints;
    	      this.createIndex = defaults.createIndex;
    	      this.datacenters = defaults.datacenters;
    	      this.id = defaults.id;
    	      this.jobId = defaults.jobId;
    	      this.jobModifyIndex = defaults.jobModifyIndex;
    	      this.modifyIndex = defaults.modifyIndex;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.parentId = defaults.parentId;
    	      this.periodicConfigs = defaults.periodicConfigs;
    	      this.priority = defaults.priority;
    	      this.region = defaults.region;
    	      this.stable = defaults.stable;
    	      this.status = defaults.status;
    	      this.statusDescription = defaults.statusDescription;
    	      this.stop = defaults.stop;
    	      this.submitTime = defaults.submitTime;
    	      this.taskGroups = defaults.taskGroups;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder allAtOnce(Boolean allAtOnce) {
            this.allAtOnce = Objects.requireNonNull(allAtOnce);
            return this;
        }
        @CustomType.Setter
        public Builder constraints(List<GetJobConstraint> constraints) {
            this.constraints = Objects.requireNonNull(constraints);
            return this;
        }
        public Builder constraints(GetJobConstraint... constraints) {
            return constraints(List.of(constraints));
        }
        @CustomType.Setter
        public Builder createIndex(Integer createIndex) {
            this.createIndex = Objects.requireNonNull(createIndex);
            return this;
        }
        @CustomType.Setter
        public Builder datacenters(List<String> datacenters) {
            this.datacenters = Objects.requireNonNull(datacenters);
            return this;
        }
        public Builder datacenters(String... datacenters) {
            return datacenters(List.of(datacenters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder jobId(String jobId) {
            this.jobId = Objects.requireNonNull(jobId);
            return this;
        }
        @CustomType.Setter
        public Builder jobModifyIndex(Integer jobModifyIndex) {
            this.jobModifyIndex = Objects.requireNonNull(jobModifyIndex);
            return this;
        }
        @CustomType.Setter
        public Builder modifyIndex(Integer modifyIndex) {
            this.modifyIndex = Objects.requireNonNull(modifyIndex);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }
        @CustomType.Setter
        public Builder parentId(String parentId) {
            this.parentId = Objects.requireNonNull(parentId);
            return this;
        }
        @CustomType.Setter
        public Builder periodicConfigs(List<GetJobPeriodicConfig> periodicConfigs) {
            this.periodicConfigs = Objects.requireNonNull(periodicConfigs);
            return this;
        }
        public Builder periodicConfigs(GetJobPeriodicConfig... periodicConfigs) {
            return periodicConfigs(List.of(periodicConfigs));
        }
        @CustomType.Setter
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        @CustomType.Setter
        public Builder stable(Boolean stable) {
            this.stable = Objects.requireNonNull(stable);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder statusDescription(String statusDescription) {
            this.statusDescription = Objects.requireNonNull(statusDescription);
            return this;
        }
        @CustomType.Setter
        public Builder stop(Boolean stop) {
            this.stop = Objects.requireNonNull(stop);
            return this;
        }
        @CustomType.Setter
        public Builder submitTime(Integer submitTime) {
            this.submitTime = Objects.requireNonNull(submitTime);
            return this;
        }
        @CustomType.Setter
        public Builder taskGroups(List<GetJobTaskGroup> taskGroups) {
            this.taskGroups = Objects.requireNonNull(taskGroups);
            return this;
        }
        public Builder taskGroups(GetJobTaskGroup... taskGroups) {
            return taskGroups(List.of(taskGroups));
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder version(Integer version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetJobResult build() {
            final var _resultValue = new GetJobResult();
            _resultValue.allAtOnce = allAtOnce;
            _resultValue.constraints = constraints;
            _resultValue.createIndex = createIndex;
            _resultValue.datacenters = datacenters;
            _resultValue.id = id;
            _resultValue.jobId = jobId;
            _resultValue.jobModifyIndex = jobModifyIndex;
            _resultValue.modifyIndex = modifyIndex;
            _resultValue.name = name;
            _resultValue.namespace = namespace;
            _resultValue.parentId = parentId;
            _resultValue.periodicConfigs = periodicConfigs;
            _resultValue.priority = priority;
            _resultValue.region = region;
            _resultValue.stable = stable;
            _resultValue.status = status;
            _resultValue.statusDescription = statusDescription;
            _resultValue.stop = stop;
            _resultValue.submitTime = submitTime;
            _resultValue.taskGroups = taskGroups;
            _resultValue.type = type;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
