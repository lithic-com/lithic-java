// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.models.*
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

class ExternalPaymentCancelParams
constructor(
    private val externalPaymentToken: String,
    private val effectiveDate: LocalDate,
    private val memo: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun externalPaymentToken(): String = externalPaymentToken

    fun effectiveDate(): LocalDate = effectiveDate

    fun memo(): Optional<String> = Optional.ofNullable(memo)

    @JvmSynthetic
    internal fun getBody(): ExternalPaymentCancelBody {
        return ExternalPaymentCancelBody(
            effectiveDate,
            memo,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> externalPaymentToken
            else -> ""
        }
    }

    @JsonDeserialize(builder = ExternalPaymentCancelBody.Builder::class)
    @NoAutoDetect
    class ExternalPaymentCancelBody
    internal constructor(
        private val effectiveDate: LocalDate?,
        private val memo: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("effective_date") fun effectiveDate(): LocalDate? = effectiveDate

        @JsonProperty("memo") fun memo(): String? = memo

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var effectiveDate: LocalDate? = null
            private var memo: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(externalPaymentCancelBody: ExternalPaymentCancelBody) = apply {
                this.effectiveDate = externalPaymentCancelBody.effectiveDate
                this.memo = externalPaymentCancelBody.memo
                additionalProperties(externalPaymentCancelBody.additionalProperties)
            }

            @JsonProperty("effective_date")
            fun effectiveDate(effectiveDate: LocalDate) = apply {
                this.effectiveDate = effectiveDate
            }

            @JsonProperty("memo") fun memo(memo: String) = apply { this.memo = memo }

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

            fun build(): ExternalPaymentCancelBody =
                ExternalPaymentCancelBody(
                    checkNotNull(effectiveDate) { "`effectiveDate` is required but was not set" },
                    memo,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalPaymentCancelBody && this.effectiveDate == other.effectiveDate && this.memo == other.memo && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(effectiveDate, memo, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ExternalPaymentCancelBody{effectiveDate=$effectiveDate, memo=$memo, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalPaymentCancelParams && this.externalPaymentToken == other.externalPaymentToken && this.effectiveDate == other.effectiveDate && this.memo == other.memo && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(externalPaymentToken, effectiveDate, memo, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ExternalPaymentCancelParams{externalPaymentToken=$externalPaymentToken, effectiveDate=$effectiveDate, memo=$memo, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var externalPaymentToken: String? = null
        private var effectiveDate: LocalDate? = null
        private var memo: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalPaymentCancelParams: ExternalPaymentCancelParams) = apply {
            this.externalPaymentToken = externalPaymentCancelParams.externalPaymentToken
            this.effectiveDate = externalPaymentCancelParams.effectiveDate
            this.memo = externalPaymentCancelParams.memo
            additionalQueryParams(externalPaymentCancelParams.additionalQueryParams)
            additionalHeaders(externalPaymentCancelParams.additionalHeaders)
            additionalBodyProperties(externalPaymentCancelParams.additionalBodyProperties)
        }

        fun externalPaymentToken(externalPaymentToken: String) = apply {
            this.externalPaymentToken = externalPaymentToken
        }

        fun effectiveDate(effectiveDate: LocalDate) = apply { this.effectiveDate = effectiveDate }

        fun memo(memo: String) = apply { this.memo = memo }

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

        fun build(): ExternalPaymentCancelParams =
            ExternalPaymentCancelParams(
                checkNotNull(externalPaymentToken) {
                    "`externalPaymentToken` is required but was not set"
                },
                checkNotNull(effectiveDate) { "`effectiveDate` is required but was not set" },
                memo,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
