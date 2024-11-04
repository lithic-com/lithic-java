// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toImmutable
import com.lithic.api.models.*
import java.util.Objects

class ExternalBankAccountMicroDepositCreateParams
constructor(
    private val externalBankAccountToken: String,
    private val microDeposits: List<Long>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun externalBankAccountToken(): String = externalBankAccountToken

    fun microDeposits(): List<Long> = microDeposits

    @JvmSynthetic
    internal fun getBody(): ExternalBankAccountMicroDepositCreateBody {
        return ExternalBankAccountMicroDepositCreateBody(microDeposits, additionalBodyProperties)
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> externalBankAccountToken
            else -> ""
        }
    }

    @JsonDeserialize(builder = ExternalBankAccountMicroDepositCreateBody.Builder::class)
    @NoAutoDetect
    class ExternalBankAccountMicroDepositCreateBody
    internal constructor(
        private val microDeposits: List<Long>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("micro_deposits") fun microDeposits(): List<Long>? = microDeposits

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var microDeposits: List<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                externalBankAccountMicroDepositCreateBody: ExternalBankAccountMicroDepositCreateBody
            ) = apply {
                this.microDeposits = externalBankAccountMicroDepositCreateBody.microDeposits
                additionalProperties(externalBankAccountMicroDepositCreateBody.additionalProperties)
            }

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

            fun build(): ExternalBankAccountMicroDepositCreateBody =
                ExternalBankAccountMicroDepositCreateBody(
                    checkNotNull(microDeposits) { "`microDeposits` is required but was not set" }
                        .toImmutable(),
                    additionalProperties.toImmutable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalBankAccountMicroDepositCreateBody && this.microDeposits == other.microDeposits && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(microDeposits, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ExternalBankAccountMicroDepositCreateBody{microDeposits=$microDeposits, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalBankAccountMicroDepositCreateParams && this.externalBankAccountToken == other.externalBankAccountToken && this.microDeposits == other.microDeposits && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(externalBankAccountToken, microDeposits, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ExternalBankAccountMicroDepositCreateParams{externalBankAccountToken=$externalBankAccountToken, microDeposits=$microDeposits, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var externalBankAccountToken: String? = null
        private var microDeposits: MutableList<Long> = mutableListOf()
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            externalBankAccountMicroDepositCreateParams: ExternalBankAccountMicroDepositCreateParams
        ) = apply {
            this.externalBankAccountToken =
                externalBankAccountMicroDepositCreateParams.externalBankAccountToken
            this.microDeposits(externalBankAccountMicroDepositCreateParams.microDeposits)
            additionalHeaders(externalBankAccountMicroDepositCreateParams.additionalHeaders)
            additionalQueryParams(externalBankAccountMicroDepositCreateParams.additionalQueryParams)
            additionalBodyProperties(
                externalBankAccountMicroDepositCreateParams.additionalBodyProperties
            )
        }

        fun externalBankAccountToken(externalBankAccountToken: String) = apply {
            this.externalBankAccountToken = externalBankAccountToken
        }

        fun microDeposits(microDeposits: List<Long>) = apply {
            this.microDeposits.clear()
            this.microDeposits.addAll(microDeposits)
        }

        fun addMicroDeposit(microDeposit: Long) = apply { this.microDeposits.add(microDeposit) }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun removeAdditionalHeader(name: String) = apply { additionalHeaders.removeAll(name) }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun removeAdditionalQueryParam(key: String) = apply { additionalQueryParams.removeAll(key) }

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

        fun build(): ExternalBankAccountMicroDepositCreateParams =
            ExternalBankAccountMicroDepositCreateParams(
                checkNotNull(externalBankAccountToken) {
                    "`externalBankAccountToken` is required but was not set"
                },
                checkNotNull(microDeposits) { "`microDeposits` is required but was not set" }
                    .toImmutable(),
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
