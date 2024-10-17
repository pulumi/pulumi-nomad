// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.nomad.inputs.JobHcl2Args;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobArgs Empty = new JobArgs();

    /**
     * `(string: &lt;optional&gt;)` - Consul token used when registering this job.
     * Will fallback to the value declared in Nomad provider configuration, if any.
     * 
     */
    @Import(name="consulToken")
    private @Nullable Output<String> consulToken;

    /**
     * @return `(string: &lt;optional&gt;)` - Consul token used when registering this job.
     * Will fallback to the value declared in Nomad provider configuration, if any.
     * 
     */
    public Optional<Output<String>> consulToken() {
        return Optional.ofNullable(this.consulToken);
    }

    /**
     * If true, the job will be deregistered on destroy.
     * 
     */
    @Import(name="deregisterOnDestroy")
    private @Nullable Output<Boolean> deregisterOnDestroy;

    /**
     * @return If true, the job will be deregistered on destroy.
     * 
     */
    public Optional<Output<Boolean>> deregisterOnDestroy() {
        return Optional.ofNullable(this.deregisterOnDestroy);
    }

    /**
     * `(boolean: true)` - Determines if the job will be
     * deregistered if the ID of the job in the jobspec changes.
     * 
     */
    @Import(name="deregisterOnIdChange")
    private @Nullable Output<Boolean> deregisterOnIdChange;

    /**
     * @return `(boolean: true)` - Determines if the job will be
     * deregistered if the ID of the job in the jobspec changes.
     * 
     */
    public Optional<Output<Boolean>> deregisterOnIdChange() {
        return Optional.ofNullable(this.deregisterOnIdChange);
    }

    /**
     * `(boolean: true)` - If true, the provider will return immediately
     * after creating or updating, instead of monitoring.
     * 
     */
    @Import(name="detach")
    private @Nullable Output<Boolean> detach;

    /**
     * @return `(boolean: true)` - If true, the provider will return immediately
     * after creating or updating, instead of monitoring.
     * 
     */
    public Optional<Output<Boolean>> detach() {
        return Optional.ofNullable(this.detach);
    }

    /**
     * `(block: optional)` - Options for the HCL2 jobspec parser.
     * 
     */
    @Import(name="hcl2")
    private @Nullable Output<JobHcl2Args> hcl2;

    /**
     * @return `(block: optional)` - Options for the HCL2 jobspec parser.
     * 
     */
    public Optional<Output<JobHcl2Args>> hcl2() {
        return Optional.ofNullable(this.hcl2);
    }

    /**
     * `(string: &lt;required&gt;)` - The contents of the jobspec to register.
     * 
     */
    @Import(name="jobspec", required=true)
    private Output<String> jobspec;

    /**
     * @return `(string: &lt;required&gt;)` - The contents of the jobspec to register.
     * 
     */
    public Output<String> jobspec() {
        return this.jobspec;
    }

    /**
     * `(boolean: false)` - Set this to `true` if your jobspec is structured with
     * JSON instead of the default HCL.
     * 
     */
    @Import(name="json")
    private @Nullable Output<Boolean> json;

    /**
     * @return `(boolean: false)` - Set this to `true` if your jobspec is structured with
     * JSON instead of the default HCL.
     * 
     */
    public Optional<Output<Boolean>> json() {
        return Optional.ofNullable(this.json);
    }

    /**
     * `(boolean: false)` - Determines if the job will override any
     * soft-mandatory Sentinel policies and register even if they fail.
     * 
     */
    @Import(name="policyOverride")
    private @Nullable Output<Boolean> policyOverride;

    /**
     * @return `(boolean: false)` - Determines if the job will override any
     * soft-mandatory Sentinel policies and register even if they fail.
     * 
     */
    public Optional<Output<Boolean>> policyOverride() {
        return Optional.ofNullable(this.policyOverride);
    }

    /**
     * `(boolean: false)` - Set this to true if you want the job to
     * be purged when the resource is destroyed.
     * 
     */
    @Import(name="purgeOnDestroy")
    private @Nullable Output<Boolean> purgeOnDestroy;

    /**
     * @return `(boolean: false)` - Set this to true if you want the job to
     * be purged when the resource is destroyed.
     * 
     */
    public Optional<Output<Boolean>> purgeOnDestroy() {
        return Optional.ofNullable(this.purgeOnDestroy);
    }

    /**
     * @deprecated
     * Retrieving allocation IDs from the job resource is deprecated and will be removed in a future release. Use the nomad.getAllocations data source instead.
     * 
     */
    @Deprecated /* Retrieving allocation IDs from the job resource is deprecated and will be removed in a future release. Use the nomad.getAllocations data source instead. */
    @Import(name="readAllocationIds")
    private @Nullable Output<Boolean> readAllocationIds;

    /**
     * @deprecated
     * Retrieving allocation IDs from the job resource is deprecated and will be removed in a future release. Use the nomad.getAllocations data source instead.
     * 
     */
    @Deprecated /* Retrieving allocation IDs from the job resource is deprecated and will be removed in a future release. Use the nomad.getAllocations data source instead. */
    public Optional<Output<Boolean>> readAllocationIds() {
        return Optional.ofNullable(this.readAllocationIds);
    }

    /**
     * `(boolean: false)` - Set this to true to force the job to run
     * again if its status is `dead`.
     * 
     */
    @Import(name="rerunIfDead")
    private @Nullable Output<Boolean> rerunIfDead;

    /**
     * @return `(boolean: false)` - Set this to true to force the job to run
     * again if its status is `dead`.
     * 
     */
    public Optional<Output<Boolean>> rerunIfDead() {
        return Optional.ofNullable(this.rerunIfDead);
    }

    /**
     * `(string: &lt;optional&gt;)` - Vault token used when registering this job.
     * Will fallback to the value declared in Nomad provider configuration, if any.
     * 
     */
    @Import(name="vaultToken")
    private @Nullable Output<String> vaultToken;

    /**
     * @return `(string: &lt;optional&gt;)` - Vault token used when registering this job.
     * Will fallback to the value declared in Nomad provider configuration, if any.
     * 
     */
    public Optional<Output<String>> vaultToken() {
        return Optional.ofNullable(this.vaultToken);
    }

    private JobArgs() {}

    private JobArgs(JobArgs $) {
        this.consulToken = $.consulToken;
        this.deregisterOnDestroy = $.deregisterOnDestroy;
        this.deregisterOnIdChange = $.deregisterOnIdChange;
        this.detach = $.detach;
        this.hcl2 = $.hcl2;
        this.jobspec = $.jobspec;
        this.json = $.json;
        this.policyOverride = $.policyOverride;
        this.purgeOnDestroy = $.purgeOnDestroy;
        this.readAllocationIds = $.readAllocationIds;
        this.rerunIfDead = $.rerunIfDead;
        this.vaultToken = $.vaultToken;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobArgs $;

        public Builder() {
            $ = new JobArgs();
        }

        public Builder(JobArgs defaults) {
            $ = new JobArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param consulToken `(string: &lt;optional&gt;)` - Consul token used when registering this job.
         * Will fallback to the value declared in Nomad provider configuration, if any.
         * 
         * @return builder
         * 
         */
        public Builder consulToken(@Nullable Output<String> consulToken) {
            $.consulToken = consulToken;
            return this;
        }

        /**
         * @param consulToken `(string: &lt;optional&gt;)` - Consul token used when registering this job.
         * Will fallback to the value declared in Nomad provider configuration, if any.
         * 
         * @return builder
         * 
         */
        public Builder consulToken(String consulToken) {
            return consulToken(Output.of(consulToken));
        }

        /**
         * @param deregisterOnDestroy If true, the job will be deregistered on destroy.
         * 
         * @return builder
         * 
         */
        public Builder deregisterOnDestroy(@Nullable Output<Boolean> deregisterOnDestroy) {
            $.deregisterOnDestroy = deregisterOnDestroy;
            return this;
        }

        /**
         * @param deregisterOnDestroy If true, the job will be deregistered on destroy.
         * 
         * @return builder
         * 
         */
        public Builder deregisterOnDestroy(Boolean deregisterOnDestroy) {
            return deregisterOnDestroy(Output.of(deregisterOnDestroy));
        }

        /**
         * @param deregisterOnIdChange `(boolean: true)` - Determines if the job will be
         * deregistered if the ID of the job in the jobspec changes.
         * 
         * @return builder
         * 
         */
        public Builder deregisterOnIdChange(@Nullable Output<Boolean> deregisterOnIdChange) {
            $.deregisterOnIdChange = deregisterOnIdChange;
            return this;
        }

        /**
         * @param deregisterOnIdChange `(boolean: true)` - Determines if the job will be
         * deregistered if the ID of the job in the jobspec changes.
         * 
         * @return builder
         * 
         */
        public Builder deregisterOnIdChange(Boolean deregisterOnIdChange) {
            return deregisterOnIdChange(Output.of(deregisterOnIdChange));
        }

        /**
         * @param detach `(boolean: true)` - If true, the provider will return immediately
         * after creating or updating, instead of monitoring.
         * 
         * @return builder
         * 
         */
        public Builder detach(@Nullable Output<Boolean> detach) {
            $.detach = detach;
            return this;
        }

        /**
         * @param detach `(boolean: true)` - If true, the provider will return immediately
         * after creating or updating, instead of monitoring.
         * 
         * @return builder
         * 
         */
        public Builder detach(Boolean detach) {
            return detach(Output.of(detach));
        }

        /**
         * @param hcl2 `(block: optional)` - Options for the HCL2 jobspec parser.
         * 
         * @return builder
         * 
         */
        public Builder hcl2(@Nullable Output<JobHcl2Args> hcl2) {
            $.hcl2 = hcl2;
            return this;
        }

        /**
         * @param hcl2 `(block: optional)` - Options for the HCL2 jobspec parser.
         * 
         * @return builder
         * 
         */
        public Builder hcl2(JobHcl2Args hcl2) {
            return hcl2(Output.of(hcl2));
        }

        /**
         * @param jobspec `(string: &lt;required&gt;)` - The contents of the jobspec to register.
         * 
         * @return builder
         * 
         */
        public Builder jobspec(Output<String> jobspec) {
            $.jobspec = jobspec;
            return this;
        }

        /**
         * @param jobspec `(string: &lt;required&gt;)` - The contents of the jobspec to register.
         * 
         * @return builder
         * 
         */
        public Builder jobspec(String jobspec) {
            return jobspec(Output.of(jobspec));
        }

        /**
         * @param json `(boolean: false)` - Set this to `true` if your jobspec is structured with
         * JSON instead of the default HCL.
         * 
         * @return builder
         * 
         */
        public Builder json(@Nullable Output<Boolean> json) {
            $.json = json;
            return this;
        }

        /**
         * @param json `(boolean: false)` - Set this to `true` if your jobspec is structured with
         * JSON instead of the default HCL.
         * 
         * @return builder
         * 
         */
        public Builder json(Boolean json) {
            return json(Output.of(json));
        }

        /**
         * @param policyOverride `(boolean: false)` - Determines if the job will override any
         * soft-mandatory Sentinel policies and register even if they fail.
         * 
         * @return builder
         * 
         */
        public Builder policyOverride(@Nullable Output<Boolean> policyOverride) {
            $.policyOverride = policyOverride;
            return this;
        }

        /**
         * @param policyOverride `(boolean: false)` - Determines if the job will override any
         * soft-mandatory Sentinel policies and register even if they fail.
         * 
         * @return builder
         * 
         */
        public Builder policyOverride(Boolean policyOverride) {
            return policyOverride(Output.of(policyOverride));
        }

        /**
         * @param purgeOnDestroy `(boolean: false)` - Set this to true if you want the job to
         * be purged when the resource is destroyed.
         * 
         * @return builder
         * 
         */
        public Builder purgeOnDestroy(@Nullable Output<Boolean> purgeOnDestroy) {
            $.purgeOnDestroy = purgeOnDestroy;
            return this;
        }

        /**
         * @param purgeOnDestroy `(boolean: false)` - Set this to true if you want the job to
         * be purged when the resource is destroyed.
         * 
         * @return builder
         * 
         */
        public Builder purgeOnDestroy(Boolean purgeOnDestroy) {
            return purgeOnDestroy(Output.of(purgeOnDestroy));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Retrieving allocation IDs from the job resource is deprecated and will be removed in a future release. Use the nomad.getAllocations data source instead.
         * 
         */
        @Deprecated /* Retrieving allocation IDs from the job resource is deprecated and will be removed in a future release. Use the nomad.getAllocations data source instead. */
        public Builder readAllocationIds(@Nullable Output<Boolean> readAllocationIds) {
            $.readAllocationIds = readAllocationIds;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Retrieving allocation IDs from the job resource is deprecated and will be removed in a future release. Use the nomad.getAllocations data source instead.
         * 
         */
        @Deprecated /* Retrieving allocation IDs from the job resource is deprecated and will be removed in a future release. Use the nomad.getAllocations data source instead. */
        public Builder readAllocationIds(Boolean readAllocationIds) {
            return readAllocationIds(Output.of(readAllocationIds));
        }

        /**
         * @param rerunIfDead `(boolean: false)` - Set this to true to force the job to run
         * again if its status is `dead`.
         * 
         * @return builder
         * 
         */
        public Builder rerunIfDead(@Nullable Output<Boolean> rerunIfDead) {
            $.rerunIfDead = rerunIfDead;
            return this;
        }

        /**
         * @param rerunIfDead `(boolean: false)` - Set this to true to force the job to run
         * again if its status is `dead`.
         * 
         * @return builder
         * 
         */
        public Builder rerunIfDead(Boolean rerunIfDead) {
            return rerunIfDead(Output.of(rerunIfDead));
        }

        /**
         * @param vaultToken `(string: &lt;optional&gt;)` - Vault token used when registering this job.
         * Will fallback to the value declared in Nomad provider configuration, if any.
         * 
         * @return builder
         * 
         */
        public Builder vaultToken(@Nullable Output<String> vaultToken) {
            $.vaultToken = vaultToken;
            return this;
        }

        /**
         * @param vaultToken `(string: &lt;optional&gt;)` - Vault token used when registering this job.
         * Will fallback to the value declared in Nomad provider configuration, if any.
         * 
         * @return builder
         * 
         */
        public Builder vaultToken(String vaultToken) {
            return vaultToken(Output.of(vaultToken));
        }

        public JobArgs build() {
            if ($.jobspec == null) {
                throw new MissingRequiredPropertyException("JobArgs", "jobspec");
            }
            return $;
        }
    }

}
