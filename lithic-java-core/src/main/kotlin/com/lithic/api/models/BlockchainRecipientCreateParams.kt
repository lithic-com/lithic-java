// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.Params
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Register a blockchain address as a withdrawal destination for a financial account
 *
 * The recipient is created with a `PENDING` verification state and cannot receive a payout until
 * screening of the address completes. Registering an address that is already registered to the same
 * financial account returns the existing recipient and its current verification state, rather than
 * creating a second one
 */
class BlockchainRecipientCreateParams
private constructor(
    private val body: BlockchainRecipientRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The financial account the blockchain recipient belongs to
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountToken(): String = body.accountToken()

    /**
     * The blockchain address funds will be withdrawn to
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun address(): String = body.address()

    /**
     * The blockchain network that the address belongs to
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun chain(): String = body.chain()

    /**
     * Legal name of the business or individual who owns the blockchain address
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun owner(): String = body.owner()

    /**
     * Owner Type
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ownerType(): OwnerType = body.ownerType()

    /**
     * An optional tag or memo used by some chains to identify the destination of a transfer within
     * a shared address
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addressTag(): Optional<String> = body.addressTag()

    /**
     * The nickname for this blockchain recipient
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * Returns the raw JSON value of [accountToken].
     *
     * Unlike [accountToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountToken(): JsonField<String> = body._accountToken()

    /**
     * Returns the raw JSON value of [address].
     *
     * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _address(): JsonField<String> = body._address()

    /**
     * Returns the raw JSON value of [chain].
     *
     * Unlike [chain], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _chain(): JsonField<String> = body._chain()

    /**
     * Returns the raw JSON value of [owner].
     *
     * Unlike [owner], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _owner(): JsonField<String> = body._owner()

    /**
     * Returns the raw JSON value of [ownerType].
     *
     * Unlike [ownerType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _ownerType(): JsonField<OwnerType> = body._ownerType()

    /**
     * Returns the raw JSON value of [addressTag].
     *
     * Unlike [addressTag], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _addressTag(): JsonField<String> = body._addressTag()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [BlockchainRecipientCreateParams].
         *
         * The following fields are required:
         * ```java
         * .accountToken()
         * .address()
         * .chain()
         * .owner()
         * .ownerType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BlockchainRecipientCreateParams]. */
    class Builder internal constructor() {

        private var body: BlockchainRecipientRequest.Builder = BlockchainRecipientRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(blockchainRecipientCreateParams: BlockchainRecipientCreateParams) =
            apply {
                body = blockchainRecipientCreateParams.body.toBuilder()
                additionalHeaders = blockchainRecipientCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    blockchainRecipientCreateParams.additionalQueryParams.toBuilder()
            }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [accountToken]
         * - [address]
         * - [chain]
         * - [owner]
         * - [ownerType]
         * - etc.
         */
        fun body(body: BlockchainRecipientRequest) = apply { this.body = body.toBuilder() }

        /** The financial account the blockchain recipient belongs to */
        fun accountToken(accountToken: String) = apply { body.accountToken(accountToken) }

        /**
         * Sets [Builder.accountToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountToken(accountToken: JsonField<String>) = apply {
            body.accountToken(accountToken)
        }

        /** The blockchain address funds will be withdrawn to */
        fun address(address: String) = apply { body.address(address) }

        /**
         * Sets [Builder.address] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun address(address: JsonField<String>) = apply { body.address(address) }

        /** The blockchain network that the address belongs to */
        fun chain(chain: String) = apply { body.chain(chain) }

        /**
         * Sets [Builder.chain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chain] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun chain(chain: JsonField<String>) = apply { body.chain(chain) }

        /** Legal name of the business or individual who owns the blockchain address */
        fun owner(owner: String) = apply { body.owner(owner) }

        /**
         * Sets [Builder.owner] to an arbitrary JSON value.
         *
         * You should usually call [Builder.owner] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun owner(owner: JsonField<String>) = apply { body.owner(owner) }

        /** Owner Type */
        fun ownerType(ownerType: OwnerType) = apply { body.ownerType(ownerType) }

        /**
         * Sets [Builder.ownerType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ownerType] with a well-typed [OwnerType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ownerType(ownerType: JsonField<OwnerType>) = apply { body.ownerType(ownerType) }

        /**
         * An optional tag or memo used by some chains to identify the destination of a transfer
         * within a shared address
         */
        fun addressTag(addressTag: String) = apply { body.addressTag(addressTag) }

        /**
         * Sets [Builder.addressTag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addressTag] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun addressTag(addressTag: JsonField<String>) = apply { body.addressTag(addressTag) }

        /** The nickname for this blockchain recipient */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [BlockchainRecipientCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountToken()
         * .address()
         * .chain()
         * .owner()
         * .ownerType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BlockchainRecipientCreateParams =
            BlockchainRecipientCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): BlockchainRecipientRequest = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class BlockchainRecipientRequest
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountToken: JsonField<String>,
        private val address: JsonField<String>,
        private val chain: JsonField<String>,
        private val owner: JsonField<String>,
        private val ownerType: JsonField<OwnerType>,
        private val addressTag: JsonField<String>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_token")
            @ExcludeMissing
            accountToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("address") @ExcludeMissing address: JsonField<String> = JsonMissing.of(),
            @JsonProperty("chain") @ExcludeMissing chain: JsonField<String> = JsonMissing.of(),
            @JsonProperty("owner") @ExcludeMissing owner: JsonField<String> = JsonMissing.of(),
            @JsonProperty("owner_type")
            @ExcludeMissing
            ownerType: JsonField<OwnerType> = JsonMissing.of(),
            @JsonProperty("address_tag")
            @ExcludeMissing
            addressTag: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(accountToken, address, chain, owner, ownerType, addressTag, name, mutableMapOf())

        /**
         * The financial account the blockchain recipient belongs to
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountToken(): String = accountToken.getRequired("account_token")

        /**
         * The blockchain address funds will be withdrawn to
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun address(): String = address.getRequired("address")

        /**
         * The blockchain network that the address belongs to
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun chain(): String = chain.getRequired("chain")

        /**
         * Legal name of the business or individual who owns the blockchain address
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun owner(): String = owner.getRequired("owner")

        /**
         * Owner Type
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ownerType(): OwnerType = ownerType.getRequired("owner_type")

        /**
         * An optional tag or memo used by some chains to identify the destination of a transfer
         * within a shared address
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun addressTag(): Optional<String> = addressTag.getOptional("address_tag")

        /**
         * The nickname for this blockchain recipient
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [accountToken].
         *
         * Unlike [accountToken], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_token")
        @ExcludeMissing
        fun _accountToken(): JsonField<String> = accountToken

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<String> = address

        /**
         * Returns the raw JSON value of [chain].
         *
         * Unlike [chain], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("chain") @ExcludeMissing fun _chain(): JsonField<String> = chain

        /**
         * Returns the raw JSON value of [owner].
         *
         * Unlike [owner], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("owner") @ExcludeMissing fun _owner(): JsonField<String> = owner

        /**
         * Returns the raw JSON value of [ownerType].
         *
         * Unlike [ownerType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("owner_type")
        @ExcludeMissing
        fun _ownerType(): JsonField<OwnerType> = ownerType

        /**
         * Returns the raw JSON value of [addressTag].
         *
         * Unlike [addressTag], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address_tag")
        @ExcludeMissing
        fun _addressTag(): JsonField<String> = addressTag

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [BlockchainRecipientRequest].
             *
             * The following fields are required:
             * ```java
             * .accountToken()
             * .address()
             * .chain()
             * .owner()
             * .ownerType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BlockchainRecipientRequest]. */
        class Builder internal constructor() {

            private var accountToken: JsonField<String>? = null
            private var address: JsonField<String>? = null
            private var chain: JsonField<String>? = null
            private var owner: JsonField<String>? = null
            private var ownerType: JsonField<OwnerType>? = null
            private var addressTag: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(blockchainRecipientRequest: BlockchainRecipientRequest) = apply {
                accountToken = blockchainRecipientRequest.accountToken
                address = blockchainRecipientRequest.address
                chain = blockchainRecipientRequest.chain
                owner = blockchainRecipientRequest.owner
                ownerType = blockchainRecipientRequest.ownerType
                addressTag = blockchainRecipientRequest.addressTag
                name = blockchainRecipientRequest.name
                additionalProperties =
                    blockchainRecipientRequest.additionalProperties.toMutableMap()
            }

            /** The financial account the blockchain recipient belongs to */
            fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

            /**
             * Sets [Builder.accountToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountToken] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountToken(accountToken: JsonField<String>) = apply {
                this.accountToken = accountToken
            }

            /** The blockchain address funds will be withdrawn to */
            fun address(address: String) = address(JsonField.of(address))

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<String>) = apply { this.address = address }

            /** The blockchain network that the address belongs to */
            fun chain(chain: String) = chain(JsonField.of(chain))

            /**
             * Sets [Builder.chain] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chain] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun chain(chain: JsonField<String>) = apply { this.chain = chain }

            /** Legal name of the business or individual who owns the blockchain address */
            fun owner(owner: String) = owner(JsonField.of(owner))

            /**
             * Sets [Builder.owner] to an arbitrary JSON value.
             *
             * You should usually call [Builder.owner] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun owner(owner: JsonField<String>) = apply { this.owner = owner }

            /** Owner Type */
            fun ownerType(ownerType: OwnerType) = ownerType(JsonField.of(ownerType))

            /**
             * Sets [Builder.ownerType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ownerType] with a well-typed [OwnerType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ownerType(ownerType: JsonField<OwnerType>) = apply { this.ownerType = ownerType }

            /**
             * An optional tag or memo used by some chains to identify the destination of a transfer
             * within a shared address
             */
            fun addressTag(addressTag: String) = addressTag(JsonField.of(addressTag))

            /**
             * Sets [Builder.addressTag] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addressTag] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addressTag(addressTag: JsonField<String>) = apply { this.addressTag = addressTag }

            /** The nickname for this blockchain recipient */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [BlockchainRecipientRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .accountToken()
             * .address()
             * .chain()
             * .owner()
             * .ownerType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): BlockchainRecipientRequest =
                BlockchainRecipientRequest(
                    checkRequired("accountToken", accountToken),
                    checkRequired("address", address),
                    checkRequired("chain", chain),
                    checkRequired("owner", owner),
                    checkRequired("ownerType", ownerType),
                    addressTag,
                    name,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): BlockchainRecipientRequest = apply {
            if (validated) {
                return@apply
            }

            accountToken()
            address()
            chain()
            owner()
            ownerType().validate()
            addressTag()
            name()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (accountToken.asKnown().isPresent) 1 else 0) +
                (if (address.asKnown().isPresent) 1 else 0) +
                (if (chain.asKnown().isPresent) 1 else 0) +
                (if (owner.asKnown().isPresent) 1 else 0) +
                (ownerType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (addressTag.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BlockchainRecipientRequest &&
                accountToken == other.accountToken &&
                address == other.address &&
                chain == other.chain &&
                owner == other.owner &&
                ownerType == other.ownerType &&
                addressTag == other.addressTag &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountToken,
                address,
                chain,
                owner,
                ownerType,
                addressTag,
                name,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BlockchainRecipientRequest{accountToken=$accountToken, address=$address, chain=$chain, owner=$owner, ownerType=$ownerType, addressTag=$addressTag, name=$name, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BlockchainRecipientCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BlockchainRecipientCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
