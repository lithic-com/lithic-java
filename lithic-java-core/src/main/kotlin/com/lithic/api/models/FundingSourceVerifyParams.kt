package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class FundingSourceVerifyParams
constructor(
    private val fundingSourceToken: String,
    private val accountToken: String?,
    private val microDeposits: List<Long>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun fundingSourceToken(): String = fundingSourceToken

    fun accountToken(): Optional<String> = Optional.ofNullable(accountToken)

    fun microDeposits(): List<Long> = microDeposits

    @JvmSynthetic
    internal fun getBody(): FundingSourceVerifyBody {
        return FundingSourceVerifyBody(
            accountToken,
            microDeposits,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> fundingSourceToken
            else -> ""
        }
    }

    @NoAutoDetect
    class FundingSourceVerifyBody
    internal constructor(
        private val accountToken: String?,
        private val microDeposits: List<Long>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * Only required for multi-account users. Token identifying the account that the bank
         * account will be associated with. Only applicable if using account holder enrollment. See
         * [Managing Your Program](https://docs.lithic.com/docs/managing-your-program) for more
         * information.
         */
        @JsonProperty("account_token") fun accountToken(): String? = accountToken

        /** An array of dollar amounts (in cents) received in two credit transactions. */
        @JsonProperty("micro_deposits") fun microDeposits(): List<Long>? = microDeposits

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FundingSourceVerifyBody &&
                this.accountToken == other.accountToken &&
                this.microDeposits == other.microDeposits &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountToken,
                        microDeposits,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "FundingSourceVerifyBody{accountToken=$accountToken, microDeposits=$microDeposits, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountToken: String? = null
            private var microDeposits: List<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(fundingSourceVerifyBody: FundingSourceVerifyBody) = apply {
                this.accountToken = fundingSourceVerifyBody.accountToken
                this.microDeposits = fundingSourceVerifyBody.microDeposits
                additionalProperties(fundingSourceVerifyBody.additionalProperties)
            }

            /**
             * Only required for multi-account users. Token identifying the account that the bank
             * account will be associated with. Only applicable if using account holder enrollment.
             * See [Managing Your Program](https://docs.lithic.com/docs/managing-your-program) for
             * more information.
             */
            @JsonProperty("account_token")
            fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

            /** An array of dollar amounts (in cents) received in two credit transactions. */
            @JsonProperty("micro_deposits")
            fun microDeposits(microDeposits: List<Long>) = apply {
                this.microDeposits = microDeposits
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

            fun build(): FundingSourceVerifyBody =
                FundingSourceVerifyBody(
                    accountToken,
                    checkNotNull(microDeposits) {
                            "Property `microDeposits` is required but was not set"
                        }
                        .toUnmodifiable(),
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

        return other is FundingSourceVerifyParams &&
            this.fundingSourceToken == other.fundingSourceToken &&
            this.accountToken == other.accountToken &&
            this.microDeposits == other.microDeposits &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            fundingSourceToken,
            accountToken,
            microDeposits,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "FundingSourceVerifyParams{fundingSourceToken=$fundingSourceToken, accountToken=$accountToken, microDeposits=$microDeposits, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var fundingSourceToken: String? = null
        private var accountToken: String? = null
        private var microDeposits: List<Long>? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fundingSourceVerifyParams: FundingSourceVerifyParams) = apply {
            this.fundingSourceToken = fundingSourceVerifyParams.fundingSourceToken
            this.accountToken = fundingSourceVerifyParams.accountToken
            this.microDeposits = fundingSourceVerifyParams.microDeposits
            additionalQueryParams(fundingSourceVerifyParams.additionalQueryParams)
            additionalHeaders(fundingSourceVerifyParams.additionalHeaders)
            additionalBodyProperties(fundingSourceVerifyParams.additionalBodyProperties)
        }

        fun fundingSourceToken(fundingSourceToken: String) = apply {
            this.fundingSourceToken = fundingSourceToken
        }

        /**
         * Only required for multi-account users. Token identifying the account that the bank
         * account will be associated with. Only applicable if using account holder enrollment. See
         * [Managing Your Program](https://docs.lithic.com/docs/managing-your-program) for more
         * information.
         */
        fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

        /** An array of dollar amounts (in cents) received in two credit transactions. */
        fun microDeposits(microDeposits: List<Long>) = apply { this.microDeposits = microDeposits }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(key: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(key) { mutableListOf() }.add(value)
        }

        fun putQueryParam(key: String, value: List<String>) = apply {
            this.additionalQueryParams.getOrPut(key) { mutableListOf() }.addAll(value)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParam)
        }

        fun removeQueryParam(key: String) = apply {
            this.additionalQueryParams.put(key, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, List<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(key: String, value: String) = apply {
            this.additionalHeaders.getOrPut(key) { mutableListOf() }.add(value)
        }

        fun putHeader(key: String, value: List<String>) = apply {
            this.additionalHeaders.getOrPut(key) { mutableListOf() }.addAll(value)
        }

        fun putAllHeaders(additionalHeaders: Map<String, List<String>>) = apply {
            additionalHeaders.forEach(this::putHeader)
        }

        fun removeHeader(key: String) = apply { this.additionalHeaders.put(key, mutableListOf()) }

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

        fun build(): FundingSourceVerifyParams =
            FundingSourceVerifyParams(
                checkNotNull(fundingSourceToken) {
                    "Property `fundingSourceToken` is required but was not set"
                },
                accountToken,
                checkNotNull(microDeposits) {
                        "Property `microDeposits` is required but was not set"
                    }
                    .toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
