// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAclPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAclPolicyArgs Empty = new GetAclPolicyArgs();

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    private GetAclPolicyArgs() {}

    private GetAclPolicyArgs(GetAclPolicyArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAclPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAclPolicyArgs $;

        public Builder() {
            $ = new GetAclPolicyArgs();
        }

        public Builder(GetAclPolicyArgs defaults) {
            $ = new GetAclPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetAclPolicyArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
