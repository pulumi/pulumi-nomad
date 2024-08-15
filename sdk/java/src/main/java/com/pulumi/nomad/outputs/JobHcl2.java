// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
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
     * @return `(boolean: false)` - **Deprecated** All HCL jobs are parsed as
     * HCL2 by default.
     * 
     * @deprecated
     * Starting with version 2.0.0 of the Nomad provider, jobs are parsed using HCL2 by default, so this field is no longer used and may be safely removed from your configuration files. Set &#39;hcl1 = true&#39; if you must use HCL1 job parsing.
     * 
     */
    @Deprecated /* Starting with version 2.0.0 of the Nomad provider, jobs are parsed using HCL2 by default, so this field is no longer used and may be safely removed from your configuration files. Set 'hcl1 = true' if you must use HCL1 job parsing. */
    private @Nullable Boolean enabled;
    /**
     * @return Additional variables to use when templating the job with HCL2
     * 
     */
    private @Nullable Map<String,String> vars;

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
     * @return `(boolean: false)` - **Deprecated** All HCL jobs are parsed as
     * HCL2 by default.
     * 
     * @deprecated
     * Starting with version 2.0.0 of the Nomad provider, jobs are parsed using HCL2 by default, so this field is no longer used and may be safely removed from your configuration files. Set &#39;hcl1 = true&#39; if you must use HCL1 job parsing.
     * 
     */
    @Deprecated /* Starting with version 2.0.0 of the Nomad provider, jobs are parsed using HCL2 by default, so this field is no longer used and may be safely removed from your configuration files. Set 'hcl1 = true' if you must use HCL1 job parsing. */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Additional variables to use when templating the job with HCL2
     * 
     */
    public Map<String,String> vars() {
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
        private @Nullable Map<String,String> vars;
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
        public Builder vars(@Nullable Map<String,String> vars) {

            this.vars = vars;
            return this;
        }
        public JobHcl2 build() {
            final var _resultValue = new JobHcl2();
            _resultValue.allowFs = allowFs;
            _resultValue.enabled = enabled;
            _resultValue.vars = vars;
            return _resultValue;
        }
    }
}
