// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.nomad.inputs.AclTokenRoleArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AclTokenState extends com.pulumi.resources.ResourceArgs {

    public static final AclTokenState Empty = new AclTokenState();

    /**
     * `(string)` - A non-sensitive identifier for this token that
     * can be logged and shared safely without granting any access to the cluster.
     * 
     */
    @Import(name="accessorId")
    private @Nullable Output<String> accessorId;

    /**
     * @return `(string)` - A non-sensitive identifier for this token that
     * can be logged and shared safely without granting any access to the cluster.
     * 
     */
    public Optional<Output<String>> accessorId() {
        return Optional.ofNullable(this.accessorId);
    }

    /**
     * `(string)` - The timestamp the token was created.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return `(string)` - The timestamp the token was created.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * `(string)` - The timestamp after which the token is
     * considered expired and eligible for destruction.
     * 
     */
    @Import(name="expirationTime")
    private @Nullable Output<String> expirationTime;

    /**
     * @return `(string)` - The timestamp after which the token is
     * considered expired and eligible for destruction.
     * 
     */
    public Optional<Output<String>> expirationTime() {
        return Optional.ofNullable(this.expirationTime);
    }

    /**
     * `(string: &#34;&#34;)` - Provides a TTL for the token in the form of
     * a time duration such as `&#34;5m&#34;` or `&#34;1h&#34;`.
     * 
     * In addition to the above arguments, the following attributes are exported and
     * can be referenced:
     * 
     */
    @Import(name="expirationTtl")
    private @Nullable Output<String> expirationTtl;

    /**
     * @return `(string: &#34;&#34;)` - Provides a TTL for the token in the form of
     * a time duration such as `&#34;5m&#34;` or `&#34;1h&#34;`.
     * 
     * In addition to the above arguments, the following attributes are exported and
     * can be referenced:
     * 
     */
    public Optional<Output<String>> expirationTtl() {
        return Optional.ofNullable(this.expirationTtl);
    }

    /**
     * `(bool: false)` - Whether the token should be replicated to all
     * regions, or if it will only be used in the region it was created in.
     * 
     */
    @Import(name="global")
    private @Nullable Output<Boolean> global;

    /**
     * @return `(bool: false)` - Whether the token should be replicated to all
     * regions, or if it will only be used in the region it was created in.
     * 
     */
    public Optional<Output<Boolean>> global() {
        return Optional.ofNullable(this.global);
    }

    /**
     * `(string: &#34;&#34;)` - A human-friendly name for this token.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return `(string: &#34;&#34;)` - A human-friendly name for this token.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * `(set: [])` - A set of policy names to associate with this
     * token. Must be set on `client`-type tokens, must not be set on
     * `management`-type tokens. Policies do not need to exist before being
     * used here.
     * 
     */
    @Import(name="policies")
    private @Nullable Output<List<String>> policies;

    /**
     * @return `(set: [])` - A set of policy names to associate with this
     * token. Must be set on `client`-type tokens, must not be set on
     * `management`-type tokens. Policies do not need to exist before being
     * used here.
     * 
     */
    public Optional<Output<List<String>>> policies() {
        return Optional.ofNullable(this.policies);
    }

    /**
     * `(set: [])` - The list of roles attached to the token. Each entry has
     * `name` and `id` attributes. It may be used multiple times.
     * 
     */
    @Import(name="roles")
    private @Nullable Output<List<AclTokenRoleArgs>> roles;

    /**
     * @return `(set: [])` - The list of roles attached to the token. Each entry has
     * `name` and `id` attributes. It may be used multiple times.
     * 
     */
    public Optional<Output<List<AclTokenRoleArgs>>> roles() {
        return Optional.ofNullable(this.roles);
    }

    /**
     * `(string)` - The token value itself, which is presented for
     * access to the cluster.
     * 
     */
    @Import(name="secretId")
    private @Nullable Output<String> secretId;

    /**
     * @return `(string)` - The token value itself, which is presented for
     * access to the cluster.
     * 
     */
    public Optional<Output<String>> secretId() {
        return Optional.ofNullable(this.secretId);
    }

    /**
     * `(string: &lt;required&gt;)` - The type of token this is. Use `client`
     * for tokens that will have policies associated with them. Use `management`
     * for tokens that can perform any action.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return `(string: &lt;required&gt;)` - The type of token this is. Use `client`
     * for tokens that will have policies associated with them. Use `management`
     * for tokens that can perform any action.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private AclTokenState() {}

    private AclTokenState(AclTokenState $) {
        this.accessorId = $.accessorId;
        this.createTime = $.createTime;
        this.expirationTime = $.expirationTime;
        this.expirationTtl = $.expirationTtl;
        this.global = $.global;
        this.name = $.name;
        this.policies = $.policies;
        this.roles = $.roles;
        this.secretId = $.secretId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AclTokenState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AclTokenState $;

        public Builder() {
            $ = new AclTokenState();
        }

        public Builder(AclTokenState defaults) {
            $ = new AclTokenState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessorId `(string)` - A non-sensitive identifier for this token that
         * can be logged and shared safely without granting any access to the cluster.
         * 
         * @return builder
         * 
         */
        public Builder accessorId(@Nullable Output<String> accessorId) {
            $.accessorId = accessorId;
            return this;
        }

        /**
         * @param accessorId `(string)` - A non-sensitive identifier for this token that
         * can be logged and shared safely without granting any access to the cluster.
         * 
         * @return builder
         * 
         */
        public Builder accessorId(String accessorId) {
            return accessorId(Output.of(accessorId));
        }

        /**
         * @param createTime `(string)` - The timestamp the token was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime `(string)` - The timestamp the token was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param expirationTime `(string)` - The timestamp after which the token is
         * considered expired and eligible for destruction.
         * 
         * @return builder
         * 
         */
        public Builder expirationTime(@Nullable Output<String> expirationTime) {
            $.expirationTime = expirationTime;
            return this;
        }

        /**
         * @param expirationTime `(string)` - The timestamp after which the token is
         * considered expired and eligible for destruction.
         * 
         * @return builder
         * 
         */
        public Builder expirationTime(String expirationTime) {
            return expirationTime(Output.of(expirationTime));
        }

        /**
         * @param expirationTtl `(string: &#34;&#34;)` - Provides a TTL for the token in the form of
         * a time duration such as `&#34;5m&#34;` or `&#34;1h&#34;`.
         * 
         * In addition to the above arguments, the following attributes are exported and
         * can be referenced:
         * 
         * @return builder
         * 
         */
        public Builder expirationTtl(@Nullable Output<String> expirationTtl) {
            $.expirationTtl = expirationTtl;
            return this;
        }

        /**
         * @param expirationTtl `(string: &#34;&#34;)` - Provides a TTL for the token in the form of
         * a time duration such as `&#34;5m&#34;` or `&#34;1h&#34;`.
         * 
         * In addition to the above arguments, the following attributes are exported and
         * can be referenced:
         * 
         * @return builder
         * 
         */
        public Builder expirationTtl(String expirationTtl) {
            return expirationTtl(Output.of(expirationTtl));
        }

        /**
         * @param global `(bool: false)` - Whether the token should be replicated to all
         * regions, or if it will only be used in the region it was created in.
         * 
         * @return builder
         * 
         */
        public Builder global(@Nullable Output<Boolean> global) {
            $.global = global;
            return this;
        }

        /**
         * @param global `(bool: false)` - Whether the token should be replicated to all
         * regions, or if it will only be used in the region it was created in.
         * 
         * @return builder
         * 
         */
        public Builder global(Boolean global) {
            return global(Output.of(global));
        }

        /**
         * @param name `(string: &#34;&#34;)` - A human-friendly name for this token.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name `(string: &#34;&#34;)` - A human-friendly name for this token.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param policies `(set: [])` - A set of policy names to associate with this
         * token. Must be set on `client`-type tokens, must not be set on
         * `management`-type tokens. Policies do not need to exist before being
         * used here.
         * 
         * @return builder
         * 
         */
        public Builder policies(@Nullable Output<List<String>> policies) {
            $.policies = policies;
            return this;
        }

        /**
         * @param policies `(set: [])` - A set of policy names to associate with this
         * token. Must be set on `client`-type tokens, must not be set on
         * `management`-type tokens. Policies do not need to exist before being
         * used here.
         * 
         * @return builder
         * 
         */
        public Builder policies(List<String> policies) {
            return policies(Output.of(policies));
        }

        /**
         * @param policies `(set: [])` - A set of policy names to associate with this
         * token. Must be set on `client`-type tokens, must not be set on
         * `management`-type tokens. Policies do not need to exist before being
         * used here.
         * 
         * @return builder
         * 
         */
        public Builder policies(String... policies) {
            return policies(List.of(policies));
        }

        /**
         * @param roles `(set: [])` - The list of roles attached to the token. Each entry has
         * `name` and `id` attributes. It may be used multiple times.
         * 
         * @return builder
         * 
         */
        public Builder roles(@Nullable Output<List<AclTokenRoleArgs>> roles) {
            $.roles = roles;
            return this;
        }

        /**
         * @param roles `(set: [])` - The list of roles attached to the token. Each entry has
         * `name` and `id` attributes. It may be used multiple times.
         * 
         * @return builder
         * 
         */
        public Builder roles(List<AclTokenRoleArgs> roles) {
            return roles(Output.of(roles));
        }

        /**
         * @param roles `(set: [])` - The list of roles attached to the token. Each entry has
         * `name` and `id` attributes. It may be used multiple times.
         * 
         * @return builder
         * 
         */
        public Builder roles(AclTokenRoleArgs... roles) {
            return roles(List.of(roles));
        }

        /**
         * @param secretId `(string)` - The token value itself, which is presented for
         * access to the cluster.
         * 
         * @return builder
         * 
         */
        public Builder secretId(@Nullable Output<String> secretId) {
            $.secretId = secretId;
            return this;
        }

        /**
         * @param secretId `(string)` - The token value itself, which is presented for
         * access to the cluster.
         * 
         * @return builder
         * 
         */
        public Builder secretId(String secretId) {
            return secretId(Output.of(secretId));
        }

        /**
         * @param type `(string: &lt;required&gt;)` - The type of token this is. Use `client`
         * for tokens that will have policies associated with them. Use `management`
         * for tokens that can perform any action.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type `(string: &lt;required&gt;)` - The type of token this is. Use `client`
         * for tokens that will have policies associated with them. Use `management`
         * for tokens that can perform any action.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AclTokenState build() {
            return $;
        }
    }

}
