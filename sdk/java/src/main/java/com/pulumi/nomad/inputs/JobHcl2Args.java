// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobHcl2Args extends com.pulumi.resources.ResourceArgs {

    public static final JobHcl2Args Empty = new JobHcl2Args();

    /**
     * `(boolean: false)` - Set this to `true` to be able to use
     * HCL2 filesystem functions
     * 
     */
    @Import(name="allowFs")
    private @Nullable Output<Boolean> allowFs;

    /**
     * @return `(boolean: false)` - Set this to `true` to be able to use
     * HCL2 filesystem functions
     * 
     */
    public Optional<Output<Boolean>> allowFs() {
        return Optional.ofNullable(this.allowFs);
    }

    /**
     * `(boolean: false)` - **Deprecated** All HCL jobs are parsed as
     * HCL2 by default.
     * 
     * @deprecated
     * Starting with version 2.0.0 of the Nomad provider, jobs are parsed using HCL2 by default, so this field is no longer used and may be safely removed from your configuration files. Set &#39;hcl1 = true&#39; if you must use HCL1 job parsing.
     * 
     */
    @Deprecated /* Starting with version 2.0.0 of the Nomad provider, jobs are parsed using HCL2 by default, so this field is no longer used and may be safely removed from your configuration files. Set 'hcl1 = true' if you must use HCL1 job parsing. */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return `(boolean: false)` - **Deprecated** All HCL jobs are parsed as
     * HCL2 by default.
     * 
     * @deprecated
     * Starting with version 2.0.0 of the Nomad provider, jobs are parsed using HCL2 by default, so this field is no longer used and may be safely removed from your configuration files. Set &#39;hcl1 = true&#39; if you must use HCL1 job parsing.
     * 
     */
    @Deprecated /* Starting with version 2.0.0 of the Nomad provider, jobs are parsed using HCL2 by default, so this field is no longer used and may be safely removed from your configuration files. Set 'hcl1 = true' if you must use HCL1 job parsing. */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Additional variables to use when templating the job with HCL2
     * 
     */
    @Import(name="vars")
    private @Nullable Output<Map<String,String>> vars;

    /**
     * @return Additional variables to use when templating the job with HCL2
     * 
     */
    public Optional<Output<Map<String,String>>> vars() {
        return Optional.ofNullable(this.vars);
    }

    private JobHcl2Args() {}

    private JobHcl2Args(JobHcl2Args $) {
        this.allowFs = $.allowFs;
        this.enabled = $.enabled;
        this.vars = $.vars;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobHcl2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobHcl2Args $;

        public Builder() {
            $ = new JobHcl2Args();
        }

        public Builder(JobHcl2Args defaults) {
            $ = new JobHcl2Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowFs `(boolean: false)` - Set this to `true` to be able to use
         * HCL2 filesystem functions
         * 
         * @return builder
         * 
         */
        public Builder allowFs(@Nullable Output<Boolean> allowFs) {
            $.allowFs = allowFs;
            return this;
        }

        /**
         * @param allowFs `(boolean: false)` - Set this to `true` to be able to use
         * HCL2 filesystem functions
         * 
         * @return builder
         * 
         */
        public Builder allowFs(Boolean allowFs) {
            return allowFs(Output.of(allowFs));
        }

        /**
         * @param enabled `(boolean: false)` - **Deprecated** All HCL jobs are parsed as
         * HCL2 by default.
         * 
         * @return builder
         * 
         * @deprecated
         * Starting with version 2.0.0 of the Nomad provider, jobs are parsed using HCL2 by default, so this field is no longer used and may be safely removed from your configuration files. Set &#39;hcl1 = true&#39; if you must use HCL1 job parsing.
         * 
         */
        @Deprecated /* Starting with version 2.0.0 of the Nomad provider, jobs are parsed using HCL2 by default, so this field is no longer used and may be safely removed from your configuration files. Set 'hcl1 = true' if you must use HCL1 job parsing. */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled `(boolean: false)` - **Deprecated** All HCL jobs are parsed as
         * HCL2 by default.
         * 
         * @return builder
         * 
         * @deprecated
         * Starting with version 2.0.0 of the Nomad provider, jobs are parsed using HCL2 by default, so this field is no longer used and may be safely removed from your configuration files. Set &#39;hcl1 = true&#39; if you must use HCL1 job parsing.
         * 
         */
        @Deprecated /* Starting with version 2.0.0 of the Nomad provider, jobs are parsed using HCL2 by default, so this field is no longer used and may be safely removed from your configuration files. Set 'hcl1 = true' if you must use HCL1 job parsing. */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param vars Additional variables to use when templating the job with HCL2
         * 
         * @return builder
         * 
         */
        public Builder vars(@Nullable Output<Map<String,String>> vars) {
            $.vars = vars;
            return this;
        }

        /**
         * @param vars Additional variables to use when templating the job with HCL2
         * 
         * @return builder
         * 
         */
        public Builder vars(Map<String,String> vars) {
            return vars(Output.of(vars));
        }

        public JobHcl2Args build() {
            return $;
        }
    }

}
