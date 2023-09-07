package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
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
    private val walletRecommendedDecision: WalletRecommendedDecision?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun cvv(): String = cvv

    fun expirationDate(): String = expirationDate

    fun pan(): String = pan

    fun tokenizationSource(): TokenizationSource = tokenizationSource

    fun accountScore(): Optional<Long> = Optional.ofNullable(accountScore)

    fun deviceScore(): Optional<Long> = Optional.ofNullable(deviceScore)

    fun walletRecommendedDecision(): Optional<WalletRecommendedDecision> =
        Optional.ofNullable(walletRecommendedDecision)

    @JvmSynthetic
    internal fun getBody(): TokenizationSimulateBody {
        return TokenizationSimulateBody(
            cvv,
            expirationDate,
            pan,
            tokenizationSource,
            accountScore,
            deviceScore,
            walletRecommendedDecision,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

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
        private val walletRecommendedDecision: WalletRecommendedDecision?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

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

        /** The decision that the Digital Wallet's recommend */
        @JsonProperty("wallet_recommended_decision")
        fun walletRecommendedDecision(): WalletRecommendedDecision? = walletRecommendedDecision

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TokenizationSimulateBody &&
                this.cvv == other.cvv &&
                this.expirationDate == other.expirationDate &&
                this.pan == other.pan &&
                this.tokenizationSource == other.tokenizationSource &&
                this.accountScore == other.accountScore &&
                this.deviceScore == other.deviceScore &&
                this.walletRecommendedDecision == other.walletRecommendedDecision &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        cvv,
                        expirationDate,
                        pan,
                        tokenizationSource,
                        accountScore,
                        deviceScore,
                        walletRecommendedDecision,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "TokenizationSimulateBody{cvv=$cvv, expirationDate=$expirationDate, pan=$pan, tokenizationSource=$tokenizationSource, accountScore=$accountScore, deviceScore=$deviceScore, walletRecommendedDecision=$walletRecommendedDecision, additionalProperties=$additionalProperties}"

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
                    walletRecommendedDecision,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TokenizationSimulateParams &&
            this.cvv == other.cvv &&
            this.expirationDate == other.expirationDate &&
            this.pan == other.pan &&
            this.tokenizationSource == other.tokenizationSource &&
            this.accountScore == other.accountScore &&
            this.deviceScore == other.deviceScore &&
            this.walletRecommendedDecision == other.walletRecommendedDecision &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            cvv,
            expirationDate,
            pan,
            tokenizationSource,
            accountScore,
            deviceScore,
            walletRecommendedDecision,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "TokenizationSimulateParams{cvv=$cvv, expirationDate=$expirationDate, pan=$pan, tokenizationSource=$tokenizationSource, accountScore=$accountScore, deviceScore=$deviceScore, walletRecommendedDecision=$walletRecommendedDecision, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

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
        private var walletRecommendedDecision: WalletRecommendedDecision? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tokenizationSimulateParams: TokenizationSimulateParams) = apply {
            this.cvv = tokenizationSimulateParams.cvv
            this.expirationDate = tokenizationSimulateParams.expirationDate
            this.pan = tokenizationSimulateParams.pan
            this.tokenizationSource = tokenizationSimulateParams.tokenizationSource
            this.accountScore = tokenizationSimulateParams.accountScore
            this.deviceScore = tokenizationSimulateParams.deviceScore
            this.walletRecommendedDecision = tokenizationSimulateParams.walletRecommendedDecision
            additionalQueryParams(tokenizationSimulateParams.additionalQueryParams)
            additionalHeaders(tokenizationSimulateParams.additionalHeaders)
            additionalBodyProperties(tokenizationSimulateParams.additionalBodyProperties)
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

        /** The decision that the Digital Wallet's recommend */
        fun walletRecommendedDecision(walletRecommendedDecision: WalletRecommendedDecision) =
            apply {
                this.walletRecommendedDecision = walletRecommendedDecision
            }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
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
                walletRecommendedDecision,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class TokenizationSource
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TokenizationSource && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val APPLE_PAY = TokenizationSource(JsonField.of("APPLE_PAY"))

            @JvmField val GOOGLE = TokenizationSource(JsonField.of("GOOGLE"))

            @JvmField val SAMSUNG_PAY = TokenizationSource(JsonField.of("SAMSUNG_PAY"))

            @JvmStatic fun of(value: String) = TokenizationSource(JsonField.of(value))
        }

        enum class Known {
            APPLE_PAY,
            GOOGLE,
            SAMSUNG_PAY,
        }

        enum class Value {
            APPLE_PAY,
            GOOGLE,
            SAMSUNG_PAY,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                APPLE_PAY -> Value.APPLE_PAY
                GOOGLE -> Value.GOOGLE
                SAMSUNG_PAY -> Value.SAMSUNG_PAY
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                APPLE_PAY -> Known.APPLE_PAY
                GOOGLE -> Known.GOOGLE
                SAMSUNG_PAY -> Known.SAMSUNG_PAY
                else -> throw LithicInvalidDataException("Unknown TokenizationSource: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class WalletRecommendedDecision
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is WalletRecommendedDecision && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val APPROVED = WalletRecommendedDecision(JsonField.of("APPROVED"))

            @JvmField val DECLINED = WalletRecommendedDecision(JsonField.of("DECLINED"))

            @JvmField
            val REQUIRE_ADDITIONAL_AUTHENTICATION =
                WalletRecommendedDecision(JsonField.of("REQUIRE_ADDITIONAL_AUTHENTICATION"))

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
}
