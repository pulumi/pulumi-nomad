// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobParserArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetJobParserArgs Empty = new GetJobParserArgs();

    @Import(name="canonicalize")
    private @Nullable Output<Boolean> canonicalize;

    public Optional<Output<Boolean>> canonicalize() {
        return Optional.ofNullable(this.canonicalize);
    }

    @Import(name="hcl", required=true)
    private Output<String> hcl;

    public Output<String> hcl() {
        return this.hcl;
    }

    private GetJobParserArgs() {}

    private GetJobParserArgs(GetJobParserArgs $) {
        this.canonicalize = $.canonicalize;
        this.hcl = $.hcl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobParserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobParserArgs $;

        public Builder() {
            $ = new GetJobParserArgs();
        }

        public Builder(GetJobParserArgs defaults) {
            $ = new GetJobParserArgs(Objects.requireNonNull(defaults));
        }

        public Builder canonicalize(@Nullable Output<Boolean> canonicalize) {
            $.canonicalize = canonicalize;
            return this;
        }

        public Builder canonicalize(Boolean canonicalize) {
            return canonicalize(Output.of(canonicalize));
        }

        public Builder hcl(Output<String> hcl) {
            $.hcl = hcl;
            return this;
        }

        public Builder hcl(String hcl) {
            return hcl(Output.of(hcl));
        }

        public GetJobParserArgs build() {
            $.hcl = Objects.requireNonNull($.hcl, "expected parameter 'hcl' to be non-null");
            return $;
        }
    }

}