// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.Enum
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
 * This endpoint is used to simulate a card's tokenization in the Digital Wallet and merchant
 * tokenization ecosystem.
 */
class TokenizationSimulateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The three digit cvv for the card.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cvv(): String = body.cvv()

    /**
     * The expiration date of the card in 'MM/YY' format.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expirationDate(): String = body.expirationDate()

    /**
     * The sixteen digit card number.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pan(): String = body.pan()

    /**
     * The source of the tokenization request.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tokenizationSource(): TokenizationSource = body.tokenizationSource()

    /**
     * The account score (1-5) that represents how the Digital Wallet's view on how reputable an end
     * user's account is.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountScore(): Optional<Long> = body.accountScore()

    /**
     * The device score (1-5) that represents how the Digital Wallet's view on how reputable an end
     * user's device is.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deviceScore(): Optional<Long> = body.deviceScore()

    /**
     * Optional field to specify the token requestor name for a merchant token simulation. Ignored
     * when tokenization_source is not MERCHANT.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun entity(): Optional<String> = body.entity()

    /**
     * The decision that the Digital Wallet's recommend
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun walletRecommendedDecision(): Optional<WalletRecommendedDecision> =
        body.walletRecommendedDecision()

    /**
     * Returns the raw JSON value of [cvv].
     *
     * Unlike [cvv], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cvv(): JsonField<String> = body._cvv()

    /**
     * Returns the raw JSON value of [expirationDate].
     *
     * Unlike [expirationDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _expirationDate(): JsonField<String> = body._expirationDate()

    /**
     * Returns the raw JSON value of [pan].
     *
     * Unlike [pan], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pan(): JsonField<String> = body._pan()

    /**
     * Returns the raw JSON value of [tokenizationSource].
     *
     * Unlike [tokenizationSource], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _tokenizationSource(): JsonField<TokenizationSource> = body._tokenizationSource()

    /**
     * Returns the raw JSON value of [accountScore].
     *
     * Unlike [accountScore], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountScore(): JsonField<Long> = body._accountScore()

    /**
     * Returns the raw JSON value of [deviceScore].
     *
     * Unlike [deviceScore], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _deviceScore(): JsonField<Long> = body._deviceScore()

    /**
     * Returns the raw JSON value of [entity].
     *
     * Unlike [entity], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _entity(): JsonField<String> = body._entity()

    /**
     * Returns the raw JSON value of [walletRecommendedDecision].
     *
     * Unlike [walletRecommendedDecision], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _walletRecommendedDecision(): JsonField<WalletRecommendedDecision> =
        body._walletRecommendedDecision()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TokenizationSimulateParams].
         *
         * The following fields are required:
         * ```java
         * .cvv()
         * .expirationDate()
         * .pan()
         * .tokenizationSource()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TokenizationSimulateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(tokenizationSimulateParams: TokenizationSimulateParams) = apply {
            body = tokenizationSimulateParams.body.toBuilder()
            additionalHeaders = tokenizationSimulateParams.additionalHeaders.toBuilder()
            additionalQueryParams = tokenizationSimulateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [cvv]
         * - [expirationDate]
         * - [pan]
         * - [tokenizationSource]
         * - [accountScore]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The three digit cvv for the card. */
        fun cvv(cvv: String) = apply { body.cvv(cvv) }

        /**
         * Sets [Builder.cvv] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cvv] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cvv(cvv: JsonField<String>) = apply { body.cvv(cvv) }

        /** The expiration date of the card in 'MM/YY' format. */
        fun expirationDate(expirationDate: String) = apply { body.expirationDate(expirationDate) }

        /**
         * Sets [Builder.expirationDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expirationDate] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expirationDate(expirationDate: JsonField<String>) = apply {
            body.expirationDate(expirationDate)
        }

        /** The sixteen digit card number. */
        fun pan(pan: String) = apply { body.pan(pan) }

        /**
         * Sets [Builder.pan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pan] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pan(pan: JsonField<String>) = apply { body.pan(pan) }

        /** The source of the tokenization request. */
        fun tokenizationSource(tokenizationSource: TokenizationSource) = apply {
            body.tokenizationSource(tokenizationSource)
        }

        /**
         * Sets [Builder.tokenizationSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenizationSource] with a well-typed
         * [TokenizationSource] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun tokenizationSource(tokenizationSource: JsonField<TokenizationSource>) = apply {
            body.tokenizationSource(tokenizationSource)
        }

        /**
         * The account score (1-5) that represents how the Digital Wallet's view on how reputable an
         * end user's account is.
         */
        fun accountScore(accountScore: Long) = apply { body.accountScore(accountScore) }

        /**
         * Sets [Builder.accountScore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountScore] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountScore(accountScore: JsonField<Long>) = apply { body.accountScore(accountScore) }

        /**
         * The device score (1-5) that represents how the Digital Wallet's view on how reputable an
         * end user's device is.
         */
        fun deviceScore(deviceScore: Long) = apply { body.deviceScore(deviceScore) }

        /**
         * Sets [Builder.deviceScore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deviceScore] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun deviceScore(deviceScore: JsonField<Long>) = apply { body.deviceScore(deviceScore) }

        /**
         * Optional field to specify the token requestor name for a merchant token simulation.
         * Ignored when tokenization_source is not MERCHANT.
         */
        fun entity(entity: String) = apply { body.entity(entity) }

        /**
         * Sets [Builder.entity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entity] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun entity(entity: JsonField<String>) = apply { body.entity(entity) }

        /** The decision that the Digital Wallet's recommend */
        fun walletRecommendedDecision(walletRecommendedDecision: WalletRecommendedDecision) =
            apply {
                body.walletRecommendedDecision(walletRecommendedDecision)
            }

        /**
         * Sets [Builder.walletRecommendedDecision] to an arbitrary JSON value.
         *
         * You should usually call [Builder.walletRecommendedDecision] with a well-typed
         * [WalletRecommendedDecision] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun walletRecommendedDecision(
            walletRecommendedDecision: JsonField<WalletRecommendedDecision>
        ) = apply { body.walletRecommendedDecision(walletRecommendedDecision) }

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
         * Returns an immutable instance of [TokenizationSimulateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .cvv()
         * .expirationDate()
         * .pan()
         * .tokenizationSource()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TokenizationSimulateParams =
            TokenizationSimulateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val cvv: JsonField<String>,
        private val expirationDate: JsonField<String>,
        private val pan: JsonField<String>,
        private val tokenizationSource: JsonField<TokenizationSource>,
        private val accountScore: JsonField<Long>,
        private val deviceScore: JsonField<Long>,
        private val entity: JsonField<String>,
        private val walletRecommendedDecision: JsonField<WalletRecommendedDecision>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cvv") @ExcludeMissing cvv: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expiration_date")
            @ExcludeMissing
            expirationDate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pan") @ExcludeMissing pan: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tokenization_source")
            @ExcludeMissing
            tokenizationSource: JsonField<TokenizationSource> = JsonMissing.of(),
            @JsonProperty("account_score")
            @ExcludeMissing
            accountScore: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("device_score")
            @ExcludeMissing
            deviceScore: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("entity") @ExcludeMissing entity: JsonField<String> = JsonMissing.of(),
            @JsonProperty("wallet_recommended_decision")
            @ExcludeMissing
            walletRecommendedDecision: JsonField<WalletRecommendedDecision> = JsonMissing.of(),
        ) : this(
            cvv,
            expirationDate,
            pan,
            tokenizationSource,
            accountScore,
            deviceScore,
            entity,
            walletRecommendedDecision,
            mutableMapOf(),
        )

        /**
         * The three digit cvv for the card.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cvv(): String = cvv.getRequired("cvv")

        /**
         * The expiration date of the card in 'MM/YY' format.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun expirationDate(): String = expirationDate.getRequired("expiration_date")

        /**
         * The sixteen digit card number.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pan(): String = pan.getRequired("pan")

        /**
         * The source of the tokenization request.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun tokenizationSource(): TokenizationSource =
            tokenizationSource.getRequired("tokenization_source")

        /**
         * The account score (1-5) that represents how the Digital Wallet's view on how reputable an
         * end user's account is.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accountScore(): Optional<Long> = accountScore.getOptional("account_score")

        /**
         * The device score (1-5) that represents how the Digital Wallet's view on how reputable an
         * end user's device is.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun deviceScore(): Optional<Long> = deviceScore.getOptional("device_score")

        /**
         * Optional field to specify the token requestor name for a merchant token simulation.
         * Ignored when tokenization_source is not MERCHANT.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun entity(): Optional<String> = entity.getOptional("entity")

        /**
         * The decision that the Digital Wallet's recommend
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun walletRecommendedDecision(): Optional<WalletRecommendedDecision> =
            walletRecommendedDecision.getOptional("wallet_recommended_decision")

        /**
         * Returns the raw JSON value of [cvv].
         *
         * Unlike [cvv], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cvv") @ExcludeMissing fun _cvv(): JsonField<String> = cvv

        /**
         * Returns the raw JSON value of [expirationDate].
         *
         * Unlike [expirationDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("expiration_date")
        @ExcludeMissing
        fun _expirationDate(): JsonField<String> = expirationDate

        /**
         * Returns the raw JSON value of [pan].
         *
         * Unlike [pan], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pan") @ExcludeMissing fun _pan(): JsonField<String> = pan

        /**
         * Returns the raw JSON value of [tokenizationSource].
         *
         * Unlike [tokenizationSource], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("tokenization_source")
        @ExcludeMissing
        fun _tokenizationSource(): JsonField<TokenizationSource> = tokenizationSource

        /**
         * Returns the raw JSON value of [accountScore].
         *
         * Unlike [accountScore], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_score")
        @ExcludeMissing
        fun _accountScore(): JsonField<Long> = accountScore

        /**
         * Returns the raw JSON value of [deviceScore].
         *
         * Unlike [deviceScore], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("device_score")
        @ExcludeMissing
        fun _deviceScore(): JsonField<Long> = deviceScore

        /**
         * Returns the raw JSON value of [entity].
         *
         * Unlike [entity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entity") @ExcludeMissing fun _entity(): JsonField<String> = entity

        /**
         * Returns the raw JSON value of [walletRecommendedDecision].
         *
         * Unlike [walletRecommendedDecision], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("wallet_recommended_decision")
        @ExcludeMissing
        fun _walletRecommendedDecision(): JsonField<WalletRecommendedDecision> =
            walletRecommendedDecision

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .cvv()
             * .expirationDate()
             * .pan()
             * .tokenizationSource()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var cvv: JsonField<String>? = null
            private var expirationDate: JsonField<String>? = null
            private var pan: JsonField<String>? = null
            private var tokenizationSource: JsonField<TokenizationSource>? = null
            private var accountScore: JsonField<Long> = JsonMissing.of()
            private var deviceScore: JsonField<Long> = JsonMissing.of()
            private var entity: JsonField<String> = JsonMissing.of()
            private var walletRecommendedDecision: JsonField<WalletRecommendedDecision> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                cvv = body.cvv
                expirationDate = body.expirationDate
                pan = body.pan
                tokenizationSource = body.tokenizationSource
                accountScore = body.accountScore
                deviceScore = body.deviceScore
                entity = body.entity
                walletRecommendedDecision = body.walletRecommendedDecision
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The three digit cvv for the card. */
            fun cvv(cvv: String) = cvv(JsonField.of(cvv))

            /**
             * Sets [Builder.cvv] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cvv] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun cvv(cvv: JsonField<String>) = apply { this.cvv = cvv }

            /** The expiration date of the card in 'MM/YY' format. */
            fun expirationDate(expirationDate: String) =
                expirationDate(JsonField.of(expirationDate))

            /**
             * Sets [Builder.expirationDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expirationDate] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expirationDate(expirationDate: JsonField<String>) = apply {
                this.expirationDate = expirationDate
            }

            /** The sixteen digit card number. */
            fun pan(pan: String) = pan(JsonField.of(pan))

            /**
             * Sets [Builder.pan] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pan] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun pan(pan: JsonField<String>) = apply { this.pan = pan }

            /** The source of the tokenization request. */
            fun tokenizationSource(tokenizationSource: TokenizationSource) =
                tokenizationSource(JsonField.of(tokenizationSource))

            /**
             * Sets [Builder.tokenizationSource] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tokenizationSource] with a well-typed
             * [TokenizationSource] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun tokenizationSource(tokenizationSource: JsonField<TokenizationSource>) = apply {
                this.tokenizationSource = tokenizationSource
            }

            /**
             * The account score (1-5) that represents how the Digital Wallet's view on how
             * reputable an end user's account is.
             */
            fun accountScore(accountScore: Long) = accountScore(JsonField.of(accountScore))

            /**
             * Sets [Builder.accountScore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountScore] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountScore(accountScore: JsonField<Long>) = apply {
                this.accountScore = accountScore
            }

            /**
             * The device score (1-5) that represents how the Digital Wallet's view on how reputable
             * an end user's device is.
             */
            fun deviceScore(deviceScore: Long) = deviceScore(JsonField.of(deviceScore))

            /**
             * Sets [Builder.deviceScore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deviceScore] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deviceScore(deviceScore: JsonField<Long>) = apply { this.deviceScore = deviceScore }

            /**
             * Optional field to specify the token requestor name for a merchant token simulation.
             * Ignored when tokenization_source is not MERCHANT.
             */
            fun entity(entity: String) = entity(JsonField.of(entity))

            /**
             * Sets [Builder.entity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entity] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entity(entity: JsonField<String>) = apply { this.entity = entity }

            /** The decision that the Digital Wallet's recommend */
            fun walletRecommendedDecision(walletRecommendedDecision: WalletRecommendedDecision) =
                walletRecommendedDecision(JsonField.of(walletRecommendedDecision))

            /**
             * Sets [Builder.walletRecommendedDecision] to an arbitrary JSON value.
             *
             * You should usually call [Builder.walletRecommendedDecision] with a well-typed
             * [WalletRecommendedDecision] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun walletRecommendedDecision(
                walletRecommendedDecision: JsonField<WalletRecommendedDecision>
            ) = apply { this.walletRecommendedDecision = walletRecommendedDecision }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .cvv()
             * .expirationDate()
             * .pan()
             * .tokenizationSource()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("cvv", cvv),
                    checkRequired("expirationDate", expirationDate),
                    checkRequired("pan", pan),
                    checkRequired("tokenizationSource", tokenizationSource),
                    accountScore,
                    deviceScore,
                    entity,
                    walletRecommendedDecision,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            cvv()
            expirationDate()
            pan()
            tokenizationSource().validate()
            accountScore()
            deviceScore()
            entity()
            walletRecommendedDecision().ifPresent { it.validate() }
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
            (if (cvv.asKnown().isPresent) 1 else 0) +
                (if (expirationDate.asKnown().isPresent) 1 else 0) +
                (if (pan.asKnown().isPresent) 1 else 0) +
                (tokenizationSource.asKnown().getOrNull()?.validity() ?: 0) +
                (if (accountScore.asKnown().isPresent) 1 else 0) +
                (if (deviceScore.asKnown().isPresent) 1 else 0) +
                (if (entity.asKnown().isPresent) 1 else 0) +
                (walletRecommendedDecision.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                cvv == other.cvv &&
                expirationDate == other.expirationDate &&
                pan == other.pan &&
                tokenizationSource == other.tokenizationSource &&
                accountScore == other.accountScore &&
                deviceScore == other.deviceScore &&
                entity == other.entity &&
                walletRecommendedDecision == other.walletRecommendedDecision &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                cvv,
                expirationDate,
                pan,
                tokenizationSource,
                accountScore,
                deviceScore,
                entity,
                walletRecommendedDecision,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{cvv=$cvv, expirationDate=$expirationDate, pan=$pan, tokenizationSource=$tokenizationSource, accountScore=$accountScore, deviceScore=$deviceScore, entity=$entity, walletRecommendedDecision=$walletRecommendedDecision, additionalProperties=$additionalProperties}"
    }

    /** The source of the tokenization request. */
    class TokenizationSource
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val APPLE_PAY = of("APPLE_PAY")

            @JvmField val GOOGLE = of("GOOGLE")

            @JvmField val SAMSUNG_PAY = of("SAMSUNG_PAY")

            @JvmField val MERCHANT = of("MERCHANT")

            @JvmStatic fun of(value: String) = TokenizationSource(JsonField.of(value))
        }

        /** An enum containing [TokenizationSource]'s known values. */
        enum class Known {
            APPLE_PAY,
            GOOGLE,
            SAMSUNG_PAY,
            MERCHANT,
        }

        /**
         * An enum containing [TokenizationSource]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TokenizationSource] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            APPLE_PAY,
            GOOGLE,
            SAMSUNG_PAY,
            MERCHANT,
            /**
             * An enum member indicating that [TokenizationSource] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                APPLE_PAY -> Value.APPLE_PAY
                GOOGLE -> Value.GOOGLE
                SAMSUNG_PAY -> Value.SAMSUNG_PAY
                MERCHANT -> Value.MERCHANT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LithicInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                APPLE_PAY -> Known.APPLE_PAY
                GOOGLE -> Known.GOOGLE
                SAMSUNG_PAY -> Known.SAMSUNG_PAY
                MERCHANT -> Known.MERCHANT
                else -> throw LithicInvalidDataException("Unknown TokenizationSource: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LithicInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { LithicInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): TokenizationSource = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TokenizationSource && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The decision that the Digital Wallet's recommend */
    class WalletRecommendedDecision
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val APPROVED = of("APPROVED")

            @JvmField val DECLINED = of("DECLINED")

            @JvmField
            val REQUIRE_ADDITIONAL_AUTHENTICATION = of("REQUIRE_ADDITIONAL_AUTHENTICATION")

            @JvmStatic fun of(value: String) = WalletRecommendedDecision(JsonField.of(value))
        }

        /** An enum containing [WalletRecommendedDecision]'s known values. */
        enum class Known {
            APPROVED,
            DECLINED,
            REQUIRE_ADDITIONAL_AUTHENTICATION,
        }

        /**
         * An enum containing [WalletRecommendedDecision]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [WalletRecommendedDecision] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            APPROVED,
            DECLINED,
            REQUIRE_ADDITIONAL_AUTHENTICATION,
            /**
             * An enum member indicating that [WalletRecommendedDecision] was instantiated with an
             * unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                APPROVED -> Value.APPROVED
                DECLINED -> Value.DECLINED
                REQUIRE_ADDITIONAL_AUTHENTICATION -> Value.REQUIRE_ADDITIONAL_AUTHENTICATION
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LithicInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                APPROVED -> Known.APPROVED
                DECLINED -> Known.DECLINED
                REQUIRE_ADDITIONAL_AUTHENTICATION -> Known.REQUIRE_ADDITIONAL_AUTHENTICATION
                else ->
                    throw LithicInvalidDataException("Unknown WalletRecommendedDecision: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LithicInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { LithicInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): WalletRecommendedDecision = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is WalletRecommendedDecision && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TokenizationSimulateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TokenizationSimulateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
