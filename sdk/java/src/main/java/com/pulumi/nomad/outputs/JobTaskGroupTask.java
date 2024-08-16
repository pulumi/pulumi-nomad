// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.nomad.outputs.JobTaskGroupTaskVolumeMount;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTaskGroupTask {
    private @Nullable String driver;
    private @Nullable Map<String,String> meta;
    private @Nullable String name;
    private @Nullable List<JobTaskGroupTaskVolumeMount> volumeMounts;

    private JobTaskGroupTask() {}
    public Optional<String> driver() {
        return Optional.ofNullable(this.driver);
    }
    public Map<String,String> meta() {
        return this.meta == null ? Map.of() : this.meta;
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public List<JobTaskGroupTaskVolumeMount> volumeMounts() {
        return this.volumeMounts == null ? List.of() : this.volumeMounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskGroupTask defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String driver;
        private @Nullable Map<String,String> meta;
        private @Nullable String name;
        private @Nullable List<JobTaskGroupTaskVolumeMount> volumeMounts;
        public Builder() {}
        public Builder(JobTaskGroupTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driver = defaults.driver;
    	      this.meta = defaults.meta;
    	      this.name = defaults.name;
    	      this.volumeMounts = defaults.volumeMounts;
        }

        @CustomType.Setter
        public Builder driver(@Nullable String driver) {

            this.driver = driver;
            return this;
        }
        @CustomType.Setter
        public Builder meta(@Nullable Map<String,String> meta) {

            this.meta = meta;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder volumeMounts(@Nullable List<JobTaskGroupTaskVolumeMount> volumeMounts) {

            this.volumeMounts = volumeMounts;
            return this;
        }
        public Builder volumeMounts(JobTaskGroupTaskVolumeMount... volumeMounts) {
            return volumeMounts(List.of(volumeMounts));
        }
        public JobTaskGroupTask build() {
            final var _resultValue = new JobTaskGroupTask();
            _resultValue.driver = driver;
            _resultValue.meta = meta;
            _resultValue.name = name;
            _resultValue.volumeMounts = volumeMounts;
            return _resultValue;
        }
    }
}
