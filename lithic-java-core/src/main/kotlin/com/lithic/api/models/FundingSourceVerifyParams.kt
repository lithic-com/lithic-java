package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
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
    private val additionalQueryParams: ListMultimap<String, String>,
    private val additionalHeaders: ListMultimap<String, String>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun fundingSourceToken(): String = fundingSourceToken

    fun accountToken(): Optional<String> = Optional.ofNullable(accountToken)

    fun microDeposits(): List<Long> = microDeposits

    @JvmSynthetic
    internal fun toBody(): FundingSourceVerifyBody =
        FundingSourceVerifyBody(accountToken, microDeposits, additionalBodyProperties)

    @JvmSynthetic internal fun toQueryParams(): ListMultimap<String, String> = additionalQueryParams

    @JvmSynthetic internal fun toHeaders(): ListMultimap<String, String> = additionalHeaders

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
                accountToken == other.accountToken &&
                microDeposits == other.microDeposits &&
                additionalProperties == other.additionalProperties
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
                    microDeposits!!.toUnmodifiable(),
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): ListMultimap<String, String> = additionalQueryParams

    fun _additionalHeaders(): ListMultimap<String, String> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FundingSourceVerifyParams &&
            fundingSourceToken == other.fundingSourceToken &&
            accountToken == other.accountToken &&
            microDeposits == other.microDeposits &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalHeaders == other.additionalHeaders &&
            additionalBodyProperties == other.additionalBodyProperties
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
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
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

        fun additionalQueryParams(additionalQueryParams: ListMultimap<String, String>) = apply {
            this.additionalQueryParams.clear()
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAdditionalQueryParams(key: String, value: String) = apply {
            this.additionalQueryParams.put(key, value)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: ListMultimap<String, String>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun additionalHeaders(additionalHeaders: ListMultimap<String, String>) = apply {
            this.additionalHeaders.clear()
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAdditionalHeaders(key: String, value: String) = apply {
            this.additionalHeaders.put(key, value)
        }

        fun putAllAdditionalHeaders(additionalHeaders: ListMultimap<String, String>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperties(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): FundingSourceVerifyParams =
            FundingSourceVerifyParams(
                fundingSourceToken!!,
                accountToken,
                microDeposits!!.toUnmodifiable(),
                additionalQueryParams.toUnmodifiable(),
                additionalHeaders.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
