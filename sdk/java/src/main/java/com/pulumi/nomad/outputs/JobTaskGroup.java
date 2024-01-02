// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.nomad.outputs.JobTaskGroupTask;
import com.pulumi.nomad.outputs.JobTaskGroupVolume;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTaskGroup {
    private @Nullable Integer count;
    private @Nullable Map<String,Object> meta;
    private @Nullable String name;
    private @Nullable List<JobTaskGroupTask> tasks;
    private @Nullable List<JobTaskGroupVolume> volumes;

    private JobTaskGroup() {}
    public Optional<Integer> count() {
        return Optional.ofNullable(this.count);
    }
    public Map<String,Object> meta() {
        return this.meta == null ? Map.of() : this.meta;
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public List<JobTaskGroupTask> tasks() {
        return this.tasks == null ? List.of() : this.tasks;
    }
    public List<JobTaskGroupVolume> volumes() {
        return this.volumes == null ? List.of() : this.volumes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer count;
        private @Nullable Map<String,Object> meta;
        private @Nullable String name;
        private @Nullable List<JobTaskGroupTask> tasks;
        private @Nullable List<JobTaskGroupVolume> volumes;
        public Builder() {}
        public Builder(JobTaskGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.meta = defaults.meta;
    	      this.name = defaults.name;
    	      this.tasks = defaults.tasks;
    	      this.volumes = defaults.volumes;
        }

        @CustomType.Setter
        public Builder count(@Nullable Integer count) {

            this.count = count;
            return this;
        }
        @CustomType.Setter
        public Builder meta(@Nullable Map<String,Object> meta) {

            this.meta = meta;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder tasks(@Nullable List<JobTaskGroupTask> tasks) {

            this.tasks = tasks;
            return this;
        }
        public Builder tasks(JobTaskGroupTask... tasks) {
            return tasks(List.of(tasks));
        }
        @CustomType.Setter
        public Builder volumes(@Nullable List<JobTaskGroupVolume> volumes) {

            this.volumes = volumes;
            return this;
        }
        public Builder volumes(JobTaskGroupVolume... volumes) {
            return volumes(List.of(volumes));
        }
        public JobTaskGroup build() {
            final var _resultValue = new JobTaskGroup();
            _resultValue.count = count;
            _resultValue.meta = meta;
            _resultValue.name = name;
            _resultValue.tasks = tasks;
            _resultValue.volumes = volumes;
            return _resultValue;
        }
    }
}
