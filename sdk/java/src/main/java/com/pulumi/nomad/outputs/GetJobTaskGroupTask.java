// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.nomad.outputs.GetJobTaskGroupTaskVolumeMount;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetJobTaskGroupTask {
    private String driver;
    private Map<String,String> meta;
    /**
     * @return `(string)` Name of the job.
     * 
     */
    private String name;
    private List<GetJobTaskGroupTaskVolumeMount> volumeMounts;

    private GetJobTaskGroupTask() {}
    public String driver() {
        return this.driver;
    }
    public Map<String,String> meta() {
        return this.meta;
    }
    /**
     * @return `(string)` Name of the job.
     * 
     */
    public String name() {
        return this.name;
    }
    public List<GetJobTaskGroupTaskVolumeMount> volumeMounts() {
        return this.volumeMounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobTaskGroupTask defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String driver;
        private Map<String,String> meta;
        private String name;
        private List<GetJobTaskGroupTaskVolumeMount> volumeMounts;
        public Builder() {}
        public Builder(GetJobTaskGroupTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driver = defaults.driver;
    	      this.meta = defaults.meta;
    	      this.name = defaults.name;
    	      this.volumeMounts = defaults.volumeMounts;
        }

        @CustomType.Setter
        public Builder driver(String driver) {
            if (driver == null) {
              throw new MissingRequiredPropertyException("GetJobTaskGroupTask", "driver");
            }
            this.driver = driver;
            return this;
        }
        @CustomType.Setter
        public Builder meta(Map<String,String> meta) {
            if (meta == null) {
              throw new MissingRequiredPropertyException("GetJobTaskGroupTask", "meta");
            }
            this.meta = meta;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetJobTaskGroupTask", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder volumeMounts(List<GetJobTaskGroupTaskVolumeMount> volumeMounts) {
            if (volumeMounts == null) {
              throw new MissingRequiredPropertyException("GetJobTaskGroupTask", "volumeMounts");
            }
            this.volumeMounts = volumeMounts;
            return this;
        }
        public Builder volumeMounts(GetJobTaskGroupTaskVolumeMount... volumeMounts) {
            return volumeMounts(List.of(volumeMounts));
        }
        public GetJobTaskGroupTask build() {
            final var _resultValue = new GetJobTaskGroupTask();
            _resultValue.driver = driver;
            _resultValue.meta = meta;
            _resultValue.name = name;
            _resultValue.volumeMounts = volumeMounts;
            return _resultValue;
        }
    }
}
