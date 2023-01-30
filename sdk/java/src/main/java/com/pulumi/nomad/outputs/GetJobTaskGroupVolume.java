// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetJobTaskGroupVolume {
    /**
     * @return `(string)` Name of the job.
     * 
     */
    private String name;
    private Boolean readOnly;
    private String source;
    /**
     * @return `(string)` Scheduler type used during job creation.
     * 
     */
    private String type;

    private GetJobTaskGroupVolume() {}
    /**
     * @return `(string)` Name of the job.
     * 
     */
    public String name() {
        return this.name;
    }
    public Boolean readOnly() {
        return this.readOnly;
    }
    public String source() {
        return this.source;
    }
    /**
     * @return `(string)` Scheduler type used during job creation.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobTaskGroupVolume defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private Boolean readOnly;
        private String source;
        private String type;
        public Builder() {}
        public Builder(GetJobTaskGroupVolume defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.readOnly = defaults.readOnly;
    	      this.source = defaults.source;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder readOnly(Boolean readOnly) {
            this.readOnly = Objects.requireNonNull(readOnly);
            return this;
        }
        @CustomType.Setter
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetJobTaskGroupVolume build() {
            final var o = new GetJobTaskGroupVolume();
            o.name = name;
            o.readOnly = readOnly;
            o.source = source;
            o.type = type;
            return o;
        }
    }
}
