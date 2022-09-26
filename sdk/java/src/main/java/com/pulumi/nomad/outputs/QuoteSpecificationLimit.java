// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.nomad.outputs.QuoteSpecificationLimitRegionLimit;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class QuoteSpecificationLimit {
    /**
     * @return `(string: &lt;required&gt;)` - The region these limits should apply to.
     * 
     */
    private String region;
    /**
     * @return `(block: &lt;required&gt;)` - The limits to enforce. This block
     * may only be specified once in the `limits` block. Its structure is
     * documented below.
     * 
     */
    private QuoteSpecificationLimitRegionLimit regionLimit;

    private QuoteSpecificationLimit() {}
    /**
     * @return `(string: &lt;required&gt;)` - The region these limits should apply to.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return `(block: &lt;required&gt;)` - The limits to enforce. This block
     * may only be specified once in the `limits` block. Its structure is
     * documented below.
     * 
     */
    public QuoteSpecificationLimitRegionLimit regionLimit() {
        return this.regionLimit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuoteSpecificationLimit defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String region;
        private QuoteSpecificationLimitRegionLimit regionLimit;
        public Builder() {}
        public Builder(QuoteSpecificationLimit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.region = defaults.region;
    	      this.regionLimit = defaults.regionLimit;
        }

        @CustomType.Setter
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        @CustomType.Setter
        public Builder regionLimit(QuoteSpecificationLimitRegionLimit regionLimit) {
            this.regionLimit = Objects.requireNonNull(regionLimit);
            return this;
        }
        public QuoteSpecificationLimit build() {
            final var o = new QuoteSpecificationLimit();
            o.region = region;
            o.regionLimit = regionLimit;
            return o;
        }
    }
}
