// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AclPolicyJobAcl {
    /**
     * @return `(string: &lt;optional&gt;` - The group to attach the policy. Required if
     * `task` is set.
     * 
     */
    private @Nullable String group;
    /**
     * @return `(string: &lt;optional&gt;` - The job to attach the policy. Required if
     * `group` is set.
     * 
     */
    private String jobId;
    /**
     * @return `(string: &#34;default&#34;)` - The namespace to attach the policy.
     * Required if `job_id` is set.
     * 
     */
    private @Nullable String namespace;
    /**
     * @return `(string: &lt;optional&gt;` - The task to attach the policy.
     * 
     * [nomad_docs_wi]: https://www.nomadproject.io/docs/concepts/workload-identity#workload-associated-acl-policies
     * 
     */
    private @Nullable String task;

    private AclPolicyJobAcl() {}
    /**
     * @return `(string: &lt;optional&gt;` - The group to attach the policy. Required if
     * `task` is set.
     * 
     */
    public Optional<String> group() {
        return Optional.ofNullable(this.group);
    }
    /**
     * @return `(string: &lt;optional&gt;` - The job to attach the policy. Required if
     * `group` is set.
     * 
     */
    public String jobId() {
        return this.jobId;
    }
    /**
     * @return `(string: &#34;default&#34;)` - The namespace to attach the policy.
     * Required if `job_id` is set.
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    /**
     * @return `(string: &lt;optional&gt;` - The task to attach the policy.
     * 
     * [nomad_docs_wi]: https://www.nomadproject.io/docs/concepts/workload-identity#workload-associated-acl-policies
     * 
     */
    public Optional<String> task() {
        return Optional.ofNullable(this.task);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AclPolicyJobAcl defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String group;
        private String jobId;
        private @Nullable String namespace;
        private @Nullable String task;
        public Builder() {}
        public Builder(AclPolicyJobAcl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.group = defaults.group;
    	      this.jobId = defaults.jobId;
    	      this.namespace = defaults.namespace;
    	      this.task = defaults.task;
        }

        @CustomType.Setter
        public Builder group(@Nullable String group) {
            this.group = group;
            return this;
        }
        @CustomType.Setter
        public Builder jobId(String jobId) {
            this.jobId = Objects.requireNonNull(jobId);
            return this;
        }
        @CustomType.Setter
        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }
        @CustomType.Setter
        public Builder task(@Nullable String task) {
            this.task = task;
            return this;
        }
        public AclPolicyJobAcl build() {
            final var o = new AclPolicyJobAcl();
            o.group = group;
            o.jobId = jobId;
            o.namespace = namespace;
            o.task = task;
            return o;
        }
    }
}