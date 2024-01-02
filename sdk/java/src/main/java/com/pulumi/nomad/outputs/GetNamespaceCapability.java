// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetNamespaceCapability {
    /**
     * @return `([]string)` - Task drivers disabled for the namespace.
     * 
     */
    private @Nullable List<String> disabledTaskDrivers;
    /**
     * @return `([]string)` - Task drivers enabled for the namespace.
     * 
     */
    private @Nullable List<String> enabledTaskDrivers;

    private GetNamespaceCapability() {}
    /**
     * @return `([]string)` - Task drivers disabled for the namespace.
     * 
     */
    public List<String> disabledTaskDrivers() {
        return this.disabledTaskDrivers == null ? List.of() : this.disabledTaskDrivers;
    }
    /**
     * @return `([]string)` - Task drivers enabled for the namespace.
     * 
     */
    public List<String> enabledTaskDrivers() {
        return this.enabledTaskDrivers == null ? List.of() : this.enabledTaskDrivers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNamespaceCapability defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> disabledTaskDrivers;
        private @Nullable List<String> enabledTaskDrivers;
        public Builder() {}
        public Builder(GetNamespaceCapability defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabledTaskDrivers = defaults.disabledTaskDrivers;
    	      this.enabledTaskDrivers = defaults.enabledTaskDrivers;
        }

        @CustomType.Setter
        public Builder disabledTaskDrivers(@Nullable List<String> disabledTaskDrivers) {

            this.disabledTaskDrivers = disabledTaskDrivers;
            return this;
        }
        public Builder disabledTaskDrivers(String... disabledTaskDrivers) {
            return disabledTaskDrivers(List.of(disabledTaskDrivers));
        }
        @CustomType.Setter
        public Builder enabledTaskDrivers(@Nullable List<String> enabledTaskDrivers) {

            this.enabledTaskDrivers = enabledTaskDrivers;
            return this;
        }
        public Builder enabledTaskDrivers(String... enabledTaskDrivers) {
            return enabledTaskDrivers(List.of(enabledTaskDrivers));
        }
        public GetNamespaceCapability build() {
            final var _resultValue = new GetNamespaceCapability();
            _resultValue.disabledTaskDrivers = disabledTaskDrivers;
            _resultValue.enabledTaskDrivers = enabledTaskDrivers;
            return _resultValue;
        }
    }
}
