// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobHcl2 {
    /**
     * @return `(boolean: false)` - Set this to `true` to be able to use
     * HCL2 filesystem functions
     * 
     */
    private @Nullable Boolean allowFs;
    /**
     * @return `(boolean: false)` - Set this to `true` if your jobspec uses the HCL2
     * format instead of the default HCL.
     * 
     */
    private @Nullable Boolean enabled;
    private @Nullable Map<String,Object> vars;

    private JobHcl2() {}
    /**
     * @return `(boolean: false)` - Set this to `true` to be able to use
     * HCL2 filesystem functions
     * 
     */
    public Optional<Boolean> allowFs() {
        return Optional.ofNullable(this.allowFs);
    }
    /**
     * @return `(boolean: false)` - Set this to `true` if your jobspec uses the HCL2
     * format instead of the default HCL.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Map<String,Object> vars() {
        return this.vars == null ? Map.of() : this.vars;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobHcl2 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allowFs;
        private @Nullable Boolean enabled;
        private @Nullable Map<String,Object> vars;
        public Builder() {}
        public Builder(JobHcl2 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowFs = defaults.allowFs;
    	      this.enabled = defaults.enabled;
    	      this.vars = defaults.vars;
        }

        @CustomType.Setter
        public Builder allowFs(@Nullable Boolean allowFs) {
            this.allowFs = allowFs;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder vars(@Nullable Map<String,Object> vars) {
            this.vars = vars;
            return this;
        }
        public JobHcl2 build() {
            final var o = new JobHcl2();
            o.allowFs = allowFs;
            o.enabled = enabled;
            o.vars = vars;
            return o;
        }
    }
}