// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAclPoliciesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAclPoliciesArgs Empty = new GetAclPoliciesArgs();

    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    private GetAclPoliciesArgs() {}

    private GetAclPoliciesArgs(GetAclPoliciesArgs $) {
        this.prefix = $.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAclPoliciesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAclPoliciesArgs $;

        public Builder() {
            $ = new GetAclPoliciesArgs();
        }

        public Builder(GetAclPoliciesArgs defaults) {
            $ = new GetAclPoliciesArgs(Objects.requireNonNull(defaults));
        }

        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        public GetAclPoliciesArgs build() {
            return $;
        }
    }

}
