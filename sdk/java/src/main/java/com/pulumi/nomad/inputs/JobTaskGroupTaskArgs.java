// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.nomad.inputs.JobTaskGroupTaskVolumeMountArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTaskGroupTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTaskGroupTaskArgs Empty = new JobTaskGroupTaskArgs();

    @Import(name="driver")
    private @Nullable Output<String> driver;

    public Optional<Output<String>> driver() {
        return Optional.ofNullable(this.driver);
    }

    @Import(name="meta")
    private @Nullable Output<Map<String,String>> meta;

    public Optional<Output<Map<String,String>>> meta() {
        return Optional.ofNullable(this.meta);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="volumeMounts")
    private @Nullable Output<List<JobTaskGroupTaskVolumeMountArgs>> volumeMounts;

    public Optional<Output<List<JobTaskGroupTaskVolumeMountArgs>>> volumeMounts() {
        return Optional.ofNullable(this.volumeMounts);
    }

    private JobTaskGroupTaskArgs() {}

    private JobTaskGroupTaskArgs(JobTaskGroupTaskArgs $) {
        this.driver = $.driver;
        this.meta = $.meta;
        this.name = $.name;
        this.volumeMounts = $.volumeMounts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTaskGroupTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTaskGroupTaskArgs $;

        public Builder() {
            $ = new JobTaskGroupTaskArgs();
        }

        public Builder(JobTaskGroupTaskArgs defaults) {
            $ = new JobTaskGroupTaskArgs(Objects.requireNonNull(defaults));
        }

        public Builder driver(@Nullable Output<String> driver) {
            $.driver = driver;
            return this;
        }

        public Builder driver(String driver) {
            return driver(Output.of(driver));
        }

        public Builder meta(@Nullable Output<Map<String,String>> meta) {
            $.meta = meta;
            return this;
        }

        public Builder meta(Map<String,String> meta) {
            return meta(Output.of(meta));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder volumeMounts(@Nullable Output<List<JobTaskGroupTaskVolumeMountArgs>> volumeMounts) {
            $.volumeMounts = volumeMounts;
            return this;
        }

        public Builder volumeMounts(List<JobTaskGroupTaskVolumeMountArgs> volumeMounts) {
            return volumeMounts(Output.of(volumeMounts));
        }

        public Builder volumeMounts(JobTaskGroupTaskVolumeMountArgs... volumeMounts) {
            return volumeMounts(List.of(volumeMounts));
        }

        public JobTaskGroupTaskArgs build() {
            return $;
        }
    }

}
