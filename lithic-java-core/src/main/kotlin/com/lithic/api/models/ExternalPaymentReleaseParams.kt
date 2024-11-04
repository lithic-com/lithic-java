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
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

class ExternalPaymentReleaseParams
constructor(
    private val externalPaymentToken: String,
    private val effectiveDate: LocalDate,
    private val memo: String?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun externalPaymentToken(): String = externalPaymentToken

    fun effectiveDate(): LocalDate = effectiveDate

    fun memo(): Optional<String> = Optional.ofNullable(memo)

    @JvmSynthetic
    internal fun getBody(): ExternalPaymentReleaseBody {
        return ExternalPaymentReleaseBody(
            effectiveDate,
            memo,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> externalPaymentToken
            else -> ""
        }
    }

    @JsonDeserialize(builder = ExternalPaymentReleaseBody.Builder::class)
    @NoAutoDetect
    class ExternalPaymentReleaseBody
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
            internal fun from(externalPaymentReleaseBody: ExternalPaymentReleaseBody) = apply {
                this.effectiveDate = externalPaymentReleaseBody.effectiveDate
                this.memo = externalPaymentReleaseBody.memo
                additionalProperties(externalPaymentReleaseBody.additionalProperties)
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

            fun build(): ExternalPaymentReleaseBody =
                ExternalPaymentReleaseBody(
                    checkNotNull(effectiveDate) { "`effectiveDate` is required but was not set" },
                    memo,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalPaymentReleaseBody && this.effectiveDate == other.effectiveDate && this.memo == other.memo && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(effectiveDate, memo, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ExternalPaymentReleaseBody{effectiveDate=$effectiveDate, memo=$memo, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalPaymentReleaseParams && this.externalPaymentToken == other.externalPaymentToken && this.effectiveDate == other.effectiveDate && this.memo == other.memo && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(externalPaymentToken, effectiveDate, memo, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ExternalPaymentReleaseParams{externalPaymentToken=$externalPaymentToken, effectiveDate=$effectiveDate, memo=$memo, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var externalPaymentToken: String? = null
        private var effectiveDate: LocalDate? = null
        private var memo: String? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalPaymentReleaseParams: ExternalPaymentReleaseParams) = apply {
            this.externalPaymentToken = externalPaymentReleaseParams.externalPaymentToken
            this.effectiveDate = externalPaymentReleaseParams.effectiveDate
            this.memo = externalPaymentReleaseParams.memo
            additionalHeaders(externalPaymentReleaseParams.additionalHeaders)
            additionalQueryParams(externalPaymentReleaseParams.additionalQueryParams)
            additionalBodyProperties(externalPaymentReleaseParams.additionalBodyProperties)
        }

        fun externalPaymentToken(externalPaymentToken: String) = apply {
            this.externalPaymentToken = externalPaymentToken
        }

        fun effectiveDate(effectiveDate: LocalDate) = apply { this.effectiveDate = effectiveDate }

        fun memo(memo: String) = apply { this.memo = memo }

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

        fun build(): ExternalPaymentReleaseParams =
            ExternalPaymentReleaseParams(
                checkNotNull(externalPaymentToken) {
                    "`externalPaymentToken` is required but was not set"
                },
                checkNotNull(effectiveDate) { "`effectiveDate` is required but was not set" },
                memo,
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
