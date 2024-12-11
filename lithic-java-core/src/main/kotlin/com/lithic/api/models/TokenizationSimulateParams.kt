// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class TokenizationSimulateParams
constructor(
    private val cvv: String,
    private val expirationDate: String,
    private val pan: String,
    private val tokenizationSource: TokenizationSource,
    private val accountScore: Long?,
    private val deviceScore: Long?,
    private val entity: String?,
    private val walletRecommendedDecision: WalletRecommendedDecision?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun cvv(): String = cvv

    fun expirationDate(): String = expirationDate

    fun pan(): String = pan

    fun tokenizationSource(): TokenizationSource = tokenizationSource

    fun accountScore(): Optional<Long> = Optional.ofNullable(accountScore)

    fun deviceScore(): Optional<Long> = Optional.ofNullable(deviceScore)

    fun entity(): Optional<String> = Optional.ofNullable(entity)

    fun walletRecommendedDecision(): Optional<WalletRecommendedDecision> =
        Optional.ofNullable(walletRecommendedDecision)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): TokenizationSimulateBody {
        return TokenizationSimulateBody(
            cvv,
            expirationDate,
            pan,
            tokenizationSource,
            accountScore,
            deviceScore,
            entity,
            walletRecommendedDecision,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = TokenizationSimulateBody.Builder::class)
    @NoAutoDetect
    class TokenizationSimulateBody
    internal constructor(
        private val cvv: String?,
        private val expirationDate: String?,
        private val pan: String?,
        private val tokenizationSource: TokenizationSource?,
        private val accountScore: Long?,
        private val deviceScore: Long?,
        private val entity: String?,
        private val walletRecommendedDecision: WalletRecommendedDecision?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The three digit cvv for the card. */
        @JsonProperty("cvv") fun cvv(): String? = cvv

        /** The expiration date of the card in 'MM/YY' format. */
        @JsonProperty("expiration_date") fun expirationDate(): String? = expirationDate

        /** The sixteen digit card number. */
        @JsonProperty("pan") fun pan(): String? = pan

        /** The source of the tokenization request. */
        @JsonProperty("tokenization_source")
        fun tokenizationSource(): TokenizationSource? = tokenizationSource

        /**
         * The account score (1-5) that represents how the Digital Wallet's view on how reputable an
         * end user's account is.
         */
        @JsonProperty("account_score") fun accountScore(): Long? = accountScore

        /**
         * The device score (1-5) that represents how the Digital Wallet's view on how reputable an
         * end user's device is.
         */
        @JsonProperty("device_score") fun deviceScore(): Long? = deviceScore

        /**
         * Optional field to specify the token requestor name for a merchant token simulation.
         * Ignored when tokenization_source is not MERCHANT.
         */
        @JsonProperty("entity") fun entity(): String? = entity

        /** The decision that the Digital Wallet's recommend */
        @JsonProperty("wallet_recommended_decision")
        fun walletRecommendedDecision(): WalletRecommendedDecision? = walletRecommendedDecision

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var cvv: String? = null
            private var expirationDate: String? = null
            private var pan: String? = null
            private var tokenizationSource: TokenizationSource? = null
            private var accountScore: Long? = null
            private var deviceScore: Long? = null
            private var entity: String? = null
            private var walletRecommendedDecision: WalletRecommendedDecision? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(tokenizationSimulateBody: TokenizationSimulateBody) = apply {
                this.cvv = tokenizationSimulateBody.cvv
                this.expirationDate = tokenizationSimulateBody.expirationDate
                this.pan = tokenizationSimulateBody.pan
                this.tokenizationSource = tokenizationSimulateBody.tokenizationSource
                this.accountScore = tokenizationSimulateBody.accountScore
                this.deviceScore = tokenizationSimulateBody.deviceScore
                this.entity = tokenizationSimulateBody.entity
                this.walletRecommendedDecision = tokenizationSimulateBody.walletRecommendedDecision
                additionalProperties(tokenizationSimulateBody.additionalProperties)
            }

            /** The three digit cvv for the card. */
            @JsonProperty("cvv") fun cvv(cvv: String) = apply { this.cvv = cvv }

            /** The expiration date of the card in 'MM/YY' format. */
            @JsonProperty("expiration_date")
            fun expirationDate(expirationDate: String) = apply {
                this.expirationDate = expirationDate
            }

            /** The sixteen digit card number. */
            @JsonProperty("pan") fun pan(pan: String) = apply { this.pan = pan }

            /** The source of the tokenization request. */
            @JsonProperty("tokenization_source")
            fun tokenizationSource(tokenizationSource: TokenizationSource) = apply {
                this.tokenizationSource = tokenizationSource
            }

            /**
             * The account score (1-5) that represents how the Digital Wallet's view on how
             * reputable an end user's account is.
             */
            @JsonProperty("account_score")
            fun accountScore(accountScore: Long) = apply { this.accountScore = accountScore }

            /**
             * The device score (1-5) that represents how the Digital Wallet's view on how reputable
             * an end user's device is.
             */
            @JsonProperty("device_score")
            fun deviceScore(deviceScore: Long) = apply { this.deviceScore = deviceScore }

            /**
             * Optional field to specify the token requestor name for a merchant token simulation.
             * Ignored when tokenization_source is not MERCHANT.
             */
            @JsonProperty("entity") fun entity(entity: String) = apply { this.entity = entity }

            /** The decision that the Digital Wallet's recommend */
            @JsonProperty("wallet_recommended_decision")
            fun walletRecommendedDecision(walletRecommendedDecision: WalletRecommendedDecision) =
                apply {
                    this.walletRecommendedDecision = walletRecommendedDecision
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): TokenizationSimulateBody =
                TokenizationSimulateBody(
                    checkNotNull(cvv) { "`cvv` is required but was not set" },
                    checkNotNull(expirationDate) { "`expirationDate` is required but was not set" },
                    checkNotNull(pan) { "`pan` is required but was not set" },
                    checkNotNull(tokenizationSource) {
                        "`tokenizationSource` is required but was not set"
                    },
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

        private var cvv: String? = null
        private var expirationDate: String? = null
        private var pan: String? = null
        private var tokenizationSource: TokenizationSource? = null
        private var accountScore: Long? = null
        private var deviceScore: Long? = null
        private var entity: String? = null
        private var walletRecommendedDecision: WalletRecommendedDecision? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tokenizationSimulateParams: TokenizationSimulateParams) = apply {
            cvv = tokenizationSimulateParams.cvv
            expirationDate = tokenizationSimulateParams.expirationDate
            pan = tokenizationSimulateParams.pan
            tokenizationSource = tokenizationSimulateParams.tokenizationSource
            accountScore = tokenizationSimulateParams.accountScore
            deviceScore = tokenizationSimulateParams.deviceScore
            entity = tokenizationSimulateParams.entity
            walletRecommendedDecision = tokenizationSimulateParams.walletRecommendedDecision
            additionalHeaders = tokenizationSimulateParams.additionalHeaders.toBuilder()
            additionalQueryParams = tokenizationSimulateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                tokenizationSimulateParams.additionalBodyProperties.toMutableMap()
        }

        /** The three digit cvv for the card. */
        fun cvv(cvv: String) = apply { this.cvv = cvv }

        /** The expiration date of the card in 'MM/YY' format. */
        fun expirationDate(expirationDate: String) = apply { this.expirationDate = expirationDate }

        /** The sixteen digit card number. */
        fun pan(pan: String) = apply { this.pan = pan }

        /** The source of the tokenization request. */
        fun tokenizationSource(tokenizationSource: TokenizationSource) = apply {
            this.tokenizationSource = tokenizationSource
        }

        /**
         * The account score (1-5) that represents how the Digital Wallet's view on how reputable an
         * end user's account is.
         */
        fun accountScore(accountScore: Long) = apply { this.accountScore = accountScore }

        /**
         * The device score (1-5) that represents how the Digital Wallet's view on how reputable an
         * end user's device is.
         */
        fun deviceScore(deviceScore: Long) = apply { this.deviceScore = deviceScore }

        /**
         * Optional field to specify the token requestor name for a merchant token simulation.
         * Ignored when tokenization_source is not MERCHANT.
         */
        fun entity(entity: String) = apply { this.entity = entity }

        /** The decision that the Digital Wallet's recommend */
        fun walletRecommendedDecision(walletRecommendedDecision: WalletRecommendedDecision) =
            apply {
                this.walletRecommendedDecision = walletRecommendedDecision
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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): TokenizationSimulateParams =
            TokenizationSimulateParams(
                checkNotNull(cvv) { "`cvv` is required but was not set" },
                checkNotNull(expirationDate) { "`expirationDate` is required but was not set" },
                checkNotNull(pan) { "`pan` is required but was not set" },
                checkNotNull(tokenizationSource) {
                    "`tokenizationSource` is required but was not set"
                },
                accountScore,
                deviceScore,
                entity,
                walletRecommendedDecision,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class TokenizationSource
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TokenizationSource && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

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
    }

    class WalletRecommendedDecision
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is WalletRecommendedDecision && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

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
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TokenizationSimulateParams && cvv == other.cvv && expirationDate == other.expirationDate && pan == other.pan && tokenizationSource == other.tokenizationSource && accountScore == other.accountScore && deviceScore == other.deviceScore && entity == other.entity && walletRecommendedDecision == other.walletRecommendedDecision && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(cvv, expirationDate, pan, tokenizationSource, accountScore, deviceScore, entity, walletRecommendedDecision, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "TokenizationSimulateParams{cvv=$cvv, expirationDate=$expirationDate, pan=$pan, tokenizationSource=$tokenizationSource, accountScore=$accountScore, deviceScore=$deviceScore, entity=$entity, walletRecommendedDecision=$walletRecommendedDecision, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
