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
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects
import java.util.Optional

/**
 * This endpoint is used to simulate a card's tokenization in the Digital Wallet and merchant
 * tokenization ecosystem.
 */
class TokenizationSimulateParams
constructor(
    private val body: TokenizationSimulateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The three digit cvv for the card. */
    fun cvv(): String = body.cvv()

    /** The expiration date of the card in 'MM/YY' format. */
    fun expirationDate(): String = body.expirationDate()

    /** The sixteen digit card number. */
    fun pan(): String = body.pan()

    /** The source of the tokenization request. */
    fun tokenizationSource(): TokenizationSource = body.tokenizationSource()

    /**
     * The account score (1-5) that represents how the Digital Wallet's view on how reputable an end
     * user's account is.
     */
    fun accountScore(): Optional<Long> = body.accountScore()

    /**
     * The device score (1-5) that represents how the Digital Wallet's view on how reputable an end
     * user's device is.
     */
    fun deviceScore(): Optional<Long> = body.deviceScore()

    /**
     * Optional field to specify the token requestor name for a merchant token simulation. Ignored
     * when tokenization_source is not MERCHANT.
     */
    fun entity(): Optional<String> = body.entity()

    /** The decision that the Digital Wallet's recommend */
    fun walletRecommendedDecision(): Optional<WalletRecommendedDecision> =
        body.walletRecommendedDecision()

    /** The three digit cvv for the card. */
    fun _cvv(): JsonField<String> = body._cvv()

    /** The expiration date of the card in 'MM/YY' format. */
    fun _expirationDate(): JsonField<String> = body._expirationDate()

    /** The sixteen digit card number. */
    fun _pan(): JsonField<String> = body._pan()

    /** The source of the tokenization request. */
    fun _tokenizationSource(): JsonField<TokenizationSource> = body._tokenizationSource()

    /**
     * The account score (1-5) that represents how the Digital Wallet's view on how reputable an end
     * user's account is.
     */
    fun _accountScore(): JsonField<Long> = body._accountScore()

    /**
     * The device score (1-5) that represents how the Digital Wallet's view on how reputable an end
     * user's device is.
     */
    fun _deviceScore(): JsonField<Long> = body._deviceScore()

    /**
     * Optional field to specify the token requestor name for a merchant token simulation. Ignored
     * when tokenization_source is not MERCHANT.
     */
    fun _entity(): JsonField<String> = body._entity()

    /** The decision that the Digital Wallet's recommend */
    fun _walletRecommendedDecision(): JsonField<WalletRecommendedDecision> =
        body._walletRecommendedDecision()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): TokenizationSimulateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class TokenizationSimulateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("cvv") @ExcludeMissing private val cvv: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expiration_date")
        @ExcludeMissing
        private val expirationDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pan") @ExcludeMissing private val pan: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tokenization_source")
        @ExcludeMissing
        private val tokenizationSource: JsonField<TokenizationSource> = JsonMissing.of(),
        @JsonProperty("account_score")
        @ExcludeMissing
        private val accountScore: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("device_score")
        @ExcludeMissing
        private val deviceScore: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("entity")
        @ExcludeMissing
        private val entity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("wallet_recommended_decision")
        @ExcludeMissing
        private val walletRecommendedDecision: JsonField<WalletRecommendedDecision> =
            JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The three digit cvv for the card. */
        fun cvv(): String = cvv.getRequired("cvv")

        /** The expiration date of the card in 'MM/YY' format. */
        fun expirationDate(): String = expirationDate.getRequired("expiration_date")

        /** The sixteen digit card number. */
        fun pan(): String = pan.getRequired("pan")

        /** The source of the tokenization request. */
        fun tokenizationSource(): TokenizationSource =
            tokenizationSource.getRequired("tokenization_source")

        /**
         * The account score (1-5) that represents how the Digital Wallet's view on how reputable an
         * end user's account is.
         */
        fun accountScore(): Optional<Long> =
            Optional.ofNullable(accountScore.getNullable("account_score"))

        /**
         * The device score (1-5) that represents how the Digital Wallet's view on how reputable an
         * end user's device is.
         */
        fun deviceScore(): Optional<Long> =
            Optional.ofNullable(deviceScore.getNullable("device_score"))

        /**
         * Optional field to specify the token requestor name for a merchant token simulation.
         * Ignored when tokenization_source is not MERCHANT.
         */
        fun entity(): Optional<String> = Optional.ofNullable(entity.getNullable("entity"))

        /** The decision that the Digital Wallet's recommend */
        fun walletRecommendedDecision(): Optional<WalletRecommendedDecision> =
            Optional.ofNullable(
                walletRecommendedDecision.getNullable("wallet_recommended_decision")
            )

        /** The three digit cvv for the card. */
        @JsonProperty("cvv") @ExcludeMissing fun _cvv(): JsonField<String> = cvv

        /** The expiration date of the card in 'MM/YY' format. */
        @JsonProperty("expiration_date")
        @ExcludeMissing
        fun _expirationDate(): JsonField<String> = expirationDate

        /** The sixteen digit card number. */
        @JsonProperty("pan") @ExcludeMissing fun _pan(): JsonField<String> = pan

        /** The source of the tokenization request. */
        @JsonProperty("tokenization_source")
        @ExcludeMissing
        fun _tokenizationSource(): JsonField<TokenizationSource> = tokenizationSource

        /**
         * The account score (1-5) that represents how the Digital Wallet's view on how reputable an
         * end user's account is.
         */
        @JsonProperty("account_score")
        @ExcludeMissing
        fun _accountScore(): JsonField<Long> = accountScore

        /**
         * The device score (1-5) that represents how the Digital Wallet's view on how reputable an
         * end user's device is.
         */
        @JsonProperty("device_score")
        @ExcludeMissing
        fun _deviceScore(): JsonField<Long> = deviceScore

        /**
         * Optional field to specify the token requestor name for a merchant token simulation.
         * Ignored when tokenization_source is not MERCHANT.
         */
        @JsonProperty("entity") @ExcludeMissing fun _entity(): JsonField<String> = entity

        /** The decision that the Digital Wallet's recommend */
        @JsonProperty("wallet_recommended_decision")
        @ExcludeMissing
        fun _walletRecommendedDecision(): JsonField<WalletRecommendedDecision> =
            walletRecommendedDecision

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): TokenizationSimulateBody = apply {
            if (validated) {
                return@apply
            }

            cvv()
            expirationDate()
            pan()
            tokenizationSource()
            accountScore()
            deviceScore()
            entity()
            walletRecommendedDecision()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

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
            internal fun from(tokenizationSimulateBody: TokenizationSimulateBody) = apply {
                cvv = tokenizationSimulateBody.cvv
                expirationDate = tokenizationSimulateBody.expirationDate
                pan = tokenizationSimulateBody.pan
                tokenizationSource = tokenizationSimulateBody.tokenizationSource
                accountScore = tokenizationSimulateBody.accountScore
                deviceScore = tokenizationSimulateBody.deviceScore
                entity = tokenizationSimulateBody.entity
                walletRecommendedDecision = tokenizationSimulateBody.walletRecommendedDecision
                additionalProperties = tokenizationSimulateBody.additionalProperties.toMutableMap()
            }

            /** The three digit cvv for the card. */
            fun cvv(cvv: String) = cvv(JsonField.of(cvv))

            /** The three digit cvv for the card. */
            fun cvv(cvv: JsonField<String>) = apply { this.cvv = cvv }

            /** The expiration date of the card in 'MM/YY' format. */
            fun expirationDate(expirationDate: String) =
                expirationDate(JsonField.of(expirationDate))

            /** The expiration date of the card in 'MM/YY' format. */
            fun expirationDate(expirationDate: JsonField<String>) = apply {
                this.expirationDate = expirationDate
            }

            /** The sixteen digit card number. */
            fun pan(pan: String) = pan(JsonField.of(pan))

            /** The sixteen digit card number. */
            fun pan(pan: JsonField<String>) = apply { this.pan = pan }

            /** The source of the tokenization request. */
            fun tokenizationSource(tokenizationSource: TokenizationSource) =
                tokenizationSource(JsonField.of(tokenizationSource))

            /** The source of the tokenization request. */
            fun tokenizationSource(tokenizationSource: JsonField<TokenizationSource>) = apply {
                this.tokenizationSource = tokenizationSource
            }

            /**
             * The account score (1-5) that represents how the Digital Wallet's view on how
             * reputable an end user's account is.
             */
            fun accountScore(accountScore: Long) = accountScore(JsonField.of(accountScore))

            /**
             * The account score (1-5) that represents how the Digital Wallet's view on how
             * reputable an end user's account is.
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
             * The device score (1-5) that represents how the Digital Wallet's view on how reputable
             * an end user's device is.
             */
            fun deviceScore(deviceScore: JsonField<Long>) = apply { this.deviceScore = deviceScore }

            /**
             * Optional field to specify the token requestor name for a merchant token simulation.
             * Ignored when tokenization_source is not MERCHANT.
             */
            fun entity(entity: String) = entity(JsonField.of(entity))

            /**
             * Optional field to specify the token requestor name for a merchant token simulation.
             * Ignored when tokenization_source is not MERCHANT.
             */
            fun entity(entity: JsonField<String>) = apply { this.entity = entity }

            /** The decision that the Digital Wallet's recommend */
            fun walletRecommendedDecision(walletRecommendedDecision: WalletRecommendedDecision) =
                walletRecommendedDecision(JsonField.of(walletRecommendedDecision))

            /** The decision that the Digital Wallet's recommend */
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

            fun build(): TokenizationSimulateBody =
                TokenizationSimulateBody(
                    checkRequired("cvv", cvv),
                    checkRequired("expirationDate", expirationDate),
                    checkRequired("pan", pan),
                    checkRequired("tokenizationSource", tokenizationSource),
                    accountScore,
                    deviceScore,
                    entity,
                    walletRecommendedDecision,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TokenizationSimulateBody && cvv == other.cvv && expirationDate == other.expirationDate && pan == other.pan && tokenizationSource == other.tokenizationSource && accountScore == other.accountScore && deviceScore == other.deviceScore && entity == other.entity && walletRecommendedDecision == other.walletRecommendedDecision && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cvv, expirationDate, pan, tokenizationSource, accountScore, deviceScore, entity, walletRecommendedDecision, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TokenizationSimulateBody{cvv=$cvv, expirationDate=$expirationDate, pan=$pan, tokenizationSource=$tokenizationSource, accountScore=$accountScore, deviceScore=$deviceScore, entity=$entity, walletRecommendedDecision=$walletRecommendedDecision, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: TokenizationSimulateBody.Builder = TokenizationSimulateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(tokenizationSimulateParams: TokenizationSimulateParams) = apply {
            body = tokenizationSimulateParams.body.toBuilder()
            additionalHeaders = tokenizationSimulateParams.additionalHeaders.toBuilder()
            additionalQueryParams = tokenizationSimulateParams.additionalQueryParams.toBuilder()
        }

        /** The three digit cvv for the card. */
        fun cvv(cvv: String) = apply { body.cvv(cvv) }

        /** The three digit cvv for the card. */
        fun cvv(cvv: JsonField<String>) = apply { body.cvv(cvv) }

        /** The expiration date of the card in 'MM/YY' format. */
        fun expirationDate(expirationDate: String) = apply { body.expirationDate(expirationDate) }

        /** The expiration date of the card in 'MM/YY' format. */
        fun expirationDate(expirationDate: JsonField<String>) = apply {
            body.expirationDate(expirationDate)
        }

        /** The sixteen digit card number. */
        fun pan(pan: String) = apply { body.pan(pan) }

        /** The sixteen digit card number. */
        fun pan(pan: JsonField<String>) = apply { body.pan(pan) }

        /** The source of the tokenization request. */
        fun tokenizationSource(tokenizationSource: TokenizationSource) = apply {
            body.tokenizationSource(tokenizationSource)
        }

        /** The source of the tokenization request. */
        fun tokenizationSource(tokenizationSource: JsonField<TokenizationSource>) = apply {
            body.tokenizationSource(tokenizationSource)
        }

        /**
         * The account score (1-5) that represents how the Digital Wallet's view on how reputable an
         * end user's account is.
         */
        fun accountScore(accountScore: Long) = apply { body.accountScore(accountScore) }

        /**
         * The account score (1-5) that represents how the Digital Wallet's view on how reputable an
         * end user's account is.
         */
        fun accountScore(accountScore: JsonField<Long>) = apply { body.accountScore(accountScore) }

        /**
         * The device score (1-5) that represents how the Digital Wallet's view on how reputable an
         * end user's device is.
         */
        fun deviceScore(deviceScore: Long) = apply { body.deviceScore(deviceScore) }

        /**
         * The device score (1-5) that represents how the Digital Wallet's view on how reputable an
         * end user's device is.
         */
        fun deviceScore(deviceScore: JsonField<Long>) = apply { body.deviceScore(deviceScore) }

        /**
         * Optional field to specify the token requestor name for a merchant token simulation.
         * Ignored when tokenization_source is not MERCHANT.
         */
        fun entity(entity: String) = apply { body.entity(entity) }

        /**
         * Optional field to specify the token requestor name for a merchant token simulation.
         * Ignored when tokenization_source is not MERCHANT.
         */
        fun entity(entity: JsonField<String>) = apply { body.entity(entity) }

        /** The decision that the Digital Wallet's recommend */
        fun walletRecommendedDecision(walletRecommendedDecision: WalletRecommendedDecision) =
            apply {
                body.walletRecommendedDecision(walletRecommendedDecision)
            }

        /** The decision that the Digital Wallet's recommend */
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

        fun build(): TokenizationSimulateParams =
            TokenizationSimulateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** The source of the tokenization request. */
    class TokenizationSource
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val APPLE_PAY = of("APPLE_PAY")

            @JvmField val GOOGLE = of("GOOGLE")

            @JvmField val SAMSUNG_PAY = of("SAMSUNG_PAY")

            @JvmField val MERCHANT = of("MERCHANT")

            @JvmStatic fun of(value: String) = TokenizationSource(JsonField.of(value))
        }

        enum class Known {
            APPLE_PAY,
            GOOGLE,
            SAMSUNG_PAY,
            MERCHANT,
        }

        enum class Value {
            APPLE_PAY,
            GOOGLE,
            SAMSUNG_PAY,
            MERCHANT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                APPLE_PAY -> Value.APPLE_PAY
                GOOGLE -> Value.GOOGLE
                SAMSUNG_PAY -> Value.SAMSUNG_PAY
                MERCHANT -> Value.MERCHANT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                APPLE_PAY -> Known.APPLE_PAY
                GOOGLE -> Known.GOOGLE
                SAMSUNG_PAY -> Known.SAMSUNG_PAY
                MERCHANT -> Known.MERCHANT
                else -> throw LithicInvalidDataException("Unknown TokenizationSource: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TokenizationSource && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The decision that the Digital Wallet's recommend */
    class WalletRecommendedDecision
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val APPROVED = of("APPROVED")

            @JvmField val DECLINED = of("DECLINED")

            @JvmField
            val REQUIRE_ADDITIONAL_AUTHENTICATION = of("REQUIRE_ADDITIONAL_AUTHENTICATION")

            @JvmStatic fun of(value: String) = WalletRecommendedDecision(JsonField.of(value))
        }

        enum class Known {
            APPROVED,
            DECLINED,
            REQUIRE_ADDITIONAL_AUTHENTICATION,
        }

        enum class Value {
            APPROVED,
            DECLINED,
            REQUIRE_ADDITIONAL_AUTHENTICATION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                APPROVED -> Value.APPROVED
                DECLINED -> Value.DECLINED
                REQUIRE_ADDITIONAL_AUTHENTICATION -> Value.REQUIRE_ADDITIONAL_AUTHENTICATION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                APPROVED -> Known.APPROVED
                DECLINED -> Known.DECLINED
                REQUIRE_ADDITIONAL_AUTHENTICATION -> Known.REQUIRE_ADDITIONAL_AUTHENTICATION
                else ->
                    throw LithicInvalidDataException("Unknown WalletRecommendedDecision: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is WalletRecommendedDecision && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TokenizationSimulateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TokenizationSimulateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
