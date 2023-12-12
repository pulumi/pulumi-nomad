// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExternalVolumeMountOptions {
    /**
     * @return `(string: optional)` - The file system type.
     * 
     */
    private @Nullable String fsType;
    /**
     * @return `[]string: optional` - The flags passed to `mount`.
     * 
     */
    private @Nullable List<String> mountFlags;

    private ExternalVolumeMountOptions() {}
    /**
     * @return `(string: optional)` - The file system type.
     * 
     */
    public Optional<String> fsType() {
        return Optional.ofNullable(this.fsType);
    }
    /**
     * @return `[]string: optional` - The flags passed to `mount`.
     * 
     */
    public List<String> mountFlags() {
        return this.mountFlags == null ? List.of() : this.mountFlags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalVolumeMountOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String fsType;
        private @Nullable List<String> mountFlags;
        public Builder() {}
        public Builder(ExternalVolumeMountOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.mountFlags = defaults.mountFlags;
        }

        @CustomType.Setter
        public Builder fsType(@Nullable String fsType) {
            this.fsType = fsType;
            return this;
        }
        @CustomType.Setter
        public Builder mountFlags(@Nullable List<String> mountFlags) {
            this.mountFlags = mountFlags;
            return this;
        }
        public Builder mountFlags(String... mountFlags) {
            return mountFlags(List.of(mountFlags));
        }
        public ExternalVolumeMountOptions build() {
            final var _resultValue = new ExternalVolumeMountOptions();
            _resultValue.fsType = fsType;
            _resultValue.mountFlags = mountFlags;
            return _resultValue;
        }
    }
}
