// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetScalingPoliciesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetScalingPoliciesPlainArgs Empty = new GetScalingPoliciesPlainArgs();

    /**
     * `(string)` - An optional string to filter scaling policies based on the target job. If not provided, policies for all jobs are returned.
     * 
     */
    @Import(name="jobId")
    private @Nullable String jobId;

    /**
     * @return `(string)` - An optional string to filter scaling policies based on the target job. If not provided, policies for all jobs are returned.
     * 
     */
    public Optional<String> jobId() {
        return Optional.ofNullable(this.jobId);
    }

    /**
     * `(string)` - An optional string to filter scaling policies based on policy type. If not provided, policies of all types are returned.
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    /**
     * @return `(string)` - An optional string to filter scaling policies based on policy type. If not provided, policies of all types are returned.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private GetScalingPoliciesPlainArgs() {}

    private GetScalingPoliciesPlainArgs(GetScalingPoliciesPlainArgs $) {
        this.jobId = $.jobId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetScalingPoliciesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetScalingPoliciesPlainArgs $;

        public Builder() {
            $ = new GetScalingPoliciesPlainArgs();
        }

        public Builder(GetScalingPoliciesPlainArgs defaults) {
            $ = new GetScalingPoliciesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param jobId `(string)` - An optional string to filter scaling policies based on the target job. If not provided, policies for all jobs are returned.
         * 
         * @return builder
         * 
         */
        public Builder jobId(@Nullable String jobId) {
            $.jobId = jobId;
            return this;
        }

        /**
         * @param type `(string)` - An optional string to filter scaling policies based on policy type. If not provided, policies of all types are returned.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public GetScalingPoliciesPlainArgs build() {
            return $;
        }
    }

}
