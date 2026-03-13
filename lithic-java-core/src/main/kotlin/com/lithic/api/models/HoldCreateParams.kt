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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Create a hold on a financial account. Holds reserve funds by moving them from available to
 * pending balance. They can be resolved via settlement (linked to a payment or book transfer),
 * voiding, or expiration.
 */
class HoldCreateParams
private constructor(
    private val financialAccountToken: String?,
    private val body: CreateHoldRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun financialAccountToken(): Optional<String> = Optional.ofNullable(financialAccountToken)

    /**
     * Amount to hold in cents
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = body.amount()

    /**
     * Customer-provided token for idempotency. Becomes the hold token.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun token(): Optional<String> = body.token()

    /**
     * When the hold should auto-expire
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expirationDatetime(): Optional<OffsetDateTime> = body.expirationDatetime()

    /**
     * Reason for the hold
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun memo(): Optional<String> = body.memo()

    /**
     * User-provided identifier for the hold
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userDefinedId(): Optional<String> = body.userDefinedId()

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amount(): JsonField<Long> = body._amount()

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _token(): JsonField<String> = body._token()

    /**
     * Returns the raw JSON value of [expirationDatetime].
     *
     * Unlike [expirationDatetime], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _expirationDatetime(): JsonField<OffsetDateTime> = body._expirationDatetime()

    /**
     * Returns the raw JSON value of [memo].
     *
     * Unlike [memo], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _memo(): JsonField<String> = body._memo()

    /**
     * Returns the raw JSON value of [userDefinedId].
     *
     * Unlike [userDefinedId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _userDefinedId(): JsonField<String> = body._userDefinedId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [HoldCreateParams].
         *
         * The following fields are required:
         * ```java
         * .amount()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HoldCreateParams]. */
    class Builder internal constructor() {

        private var financialAccountToken: String? = null
        private var body: CreateHoldRequest.Builder = CreateHoldRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(holdCreateParams: HoldCreateParams) = apply {
            financialAccountToken = holdCreateParams.financialAccountToken
            body = holdCreateParams.body.toBuilder()
            additionalHeaders = holdCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = holdCreateParams.additionalQueryParams.toBuilder()
        }

        fun financialAccountToken(financialAccountToken: String?) = apply {
            this.financialAccountToken = financialAccountToken
        }

        /**
         * Alias for calling [Builder.financialAccountToken] with
         * `financialAccountToken.orElse(null)`.
         */
        fun financialAccountToken(financialAccountToken: Optional<String>) =
            financialAccountToken(financialAccountToken.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [amount]
         * - [token]
         * - [expirationDatetime]
         * - [memo]
         * - [userDefinedId]
         * - etc.
         */
        fun body(body: CreateHoldRequest) = apply { this.body = body.toBuilder() }

        /** Amount to hold in cents */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /** Customer-provided token for idempotency. Becomes the hold token. */
        fun token(token: String) = apply { body.token(token) }

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { body.token(token) }

        /** When the hold should auto-expire */
        fun expirationDatetime(expirationDatetime: OffsetDateTime) = apply {
            body.expirationDatetime(expirationDatetime)
        }

        /**
         * Sets [Builder.expirationDatetime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expirationDatetime] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun expirationDatetime(expirationDatetime: JsonField<OffsetDateTime>) = apply {
            body.expirationDatetime(expirationDatetime)
        }

        /** Reason for the hold */
        fun memo(memo: String?) = apply { body.memo(memo) }

        /** Alias for calling [Builder.memo] with `memo.orElse(null)`. */
        fun memo(memo: Optional<String>) = memo(memo.getOrNull())

        /**
         * Sets [Builder.memo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun memo(memo: JsonField<String>) = apply { body.memo(memo) }

        /** User-provided identifier for the hold */
        fun userDefinedId(userDefinedId: String) = apply { body.userDefinedId(userDefinedId) }

        /**
         * Sets [Builder.userDefinedId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userDefinedId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun userDefinedId(userDefinedId: JsonField<String>) = apply {
            body.userDefinedId(userDefinedId)
        }

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
         * Returns an immutable instance of [HoldCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .amount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): HoldCreateParams =
            HoldCreateParams(
                financialAccountToken,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): CreateHoldRequest = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> financialAccountToken ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Request to create a new hold on a financial account */
    class CreateHoldRequest
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amount: JsonField<Long>,
        private val token: JsonField<String>,
        private val expirationDatetime: JsonField<OffsetDateTime>,
        private val memo: JsonField<String>,
        private val userDefinedId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expiration_datetime")
            @ExcludeMissing
            expirationDatetime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("memo") @ExcludeMissing memo: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user_defined_id")
            @ExcludeMissing
            userDefinedId: JsonField<String> = JsonMissing.of(),
        ) : this(amount, token, expirationDatetime, memo, userDefinedId, mutableMapOf())

        /**
         * Amount to hold in cents
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * Customer-provided token for idempotency. Becomes the hold token.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun token(): Optional<String> = token.getOptional("token")

        /**
         * When the hold should auto-expire
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun expirationDatetime(): Optional<OffsetDateTime> =
            expirationDatetime.getOptional("expiration_datetime")

        /**
         * Reason for the hold
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun memo(): Optional<String> = memo.getOptional("memo")

        /**
         * User-provided identifier for the hold
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun userDefinedId(): Optional<String> = userDefinedId.getOptional("user_defined_id")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [token].
         *
         * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /**
         * Returns the raw JSON value of [expirationDatetime].
         *
         * Unlike [expirationDatetime], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("expiration_datetime")
        @ExcludeMissing
        fun _expirationDatetime(): JsonField<OffsetDateTime> = expirationDatetime

        /**
         * Returns the raw JSON value of [memo].
         *
         * Unlike [memo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

        /**
         * Returns the raw JSON value of [userDefinedId].
         *
         * Unlike [userDefinedId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("user_defined_id")
        @ExcludeMissing
        fun _userDefinedId(): JsonField<String> = userDefinedId

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
             * Returns a mutable builder for constructing an instance of [CreateHoldRequest].
             *
             * The following fields are required:
             * ```java
             * .amount()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CreateHoldRequest]. */
        class Builder internal constructor() {

            private var amount: JsonField<Long>? = null
            private var token: JsonField<String> = JsonMissing.of()
            private var expirationDatetime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var memo: JsonField<String> = JsonMissing.of()
            private var userDefinedId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(createHoldRequest: CreateHoldRequest) = apply {
                amount = createHoldRequest.amount
                token = createHoldRequest.token
                expirationDatetime = createHoldRequest.expirationDatetime
                memo = createHoldRequest.memo
                userDefinedId = createHoldRequest.userDefinedId
                additionalProperties = createHoldRequest.additionalProperties.toMutableMap()
            }

            /** Amount to hold in cents */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** Customer-provided token for idempotency. Becomes the hold token. */
            fun token(token: String) = token(JsonField.of(token))

            /**
             * Sets [Builder.token] to an arbitrary JSON value.
             *
             * You should usually call [Builder.token] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun token(token: JsonField<String>) = apply { this.token = token }

            /** When the hold should auto-expire */
            fun expirationDatetime(expirationDatetime: OffsetDateTime) =
                expirationDatetime(JsonField.of(expirationDatetime))

            /**
             * Sets [Builder.expirationDatetime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expirationDatetime] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun expirationDatetime(expirationDatetime: JsonField<OffsetDateTime>) = apply {
                this.expirationDatetime = expirationDatetime
            }

            /** Reason for the hold */
            fun memo(memo: String?) = memo(JsonField.ofNullable(memo))

            /** Alias for calling [Builder.memo] with `memo.orElse(null)`. */
            fun memo(memo: Optional<String>) = memo(memo.getOrNull())

            /**
             * Sets [Builder.memo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.memo] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun memo(memo: JsonField<String>) = apply { this.memo = memo }

            /** User-provided identifier for the hold */
            fun userDefinedId(userDefinedId: String) = userDefinedId(JsonField.of(userDefinedId))

            /**
             * Sets [Builder.userDefinedId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userDefinedId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userDefinedId(userDefinedId: JsonField<String>) = apply {
                this.userDefinedId = userDefinedId
            }

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
             * Returns an immutable instance of [CreateHoldRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .amount()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CreateHoldRequest =
                CreateHoldRequest(
                    checkRequired("amount", amount),
                    token,
                    expirationDatetime,
                    memo,
                    userDefinedId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CreateHoldRequest = apply {
            if (validated) {
                return@apply
            }

            amount()
            token()
            expirationDatetime()
            memo()
            userDefinedId()
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
            (if (amount.asKnown().isPresent) 1 else 0) +
                (if (token.asKnown().isPresent) 1 else 0) +
                (if (expirationDatetime.asKnown().isPresent) 1 else 0) +
                (if (memo.asKnown().isPresent) 1 else 0) +
                (if (userDefinedId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreateHoldRequest &&
                amount == other.amount &&
                token == other.token &&
                expirationDatetime == other.expirationDatetime &&
                memo == other.memo &&
                userDefinedId == other.userDefinedId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                amount,
                token,
                expirationDatetime,
                memo,
                userDefinedId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreateHoldRequest{amount=$amount, token=$token, expirationDatetime=$expirationDatetime, memo=$memo, userDefinedId=$userDefinedId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HoldCreateParams &&
            financialAccountToken == other.financialAccountToken &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(financialAccountToken, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "HoldCreateParams{financialAccountToken=$financialAccountToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
