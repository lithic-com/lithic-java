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

class ManagementOperationReverseParams
constructor(
    private val managementOperationToken: String,
    private val effectiveDate: LocalDate,
    private val memo: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun managementOperationToken(): String = managementOperationToken

    fun effectiveDate(): LocalDate = effectiveDate

    fun memo(): Optional<String> = Optional.ofNullable(memo)

    @JvmSynthetic
    internal fun getBody(): ManagementOperationReverseBody {
        return ManagementOperationReverseBody(
            effectiveDate,
            memo,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> managementOperationToken
            else -> ""
        }
    }

    @JsonDeserialize(builder = ManagementOperationReverseBody.Builder::class)
    @NoAutoDetect
    class ManagementOperationReverseBody
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
            internal fun from(managementOperationReverseBody: ManagementOperationReverseBody) =
                apply {
                    this.effectiveDate = managementOperationReverseBody.effectiveDate
                    this.memo = managementOperationReverseBody.memo
                    additionalProperties(managementOperationReverseBody.additionalProperties)
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

            fun build(): ManagementOperationReverseBody =
                ManagementOperationReverseBody(
                    checkNotNull(effectiveDate) { "`effectiveDate` is required but was not set" },
                    memo,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ManagementOperationReverseBody &&
                this.effectiveDate == other.effectiveDate &&
                this.memo == other.memo &&
                this.additionalProperties == other.additionalProperties
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        effectiveDate,
                        memo,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ManagementOperationReverseBody{effectiveDate=$effectiveDate, memo=$memo, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ManagementOperationReverseParams &&
            this.managementOperationToken == other.managementOperationToken &&
            this.effectiveDate == other.effectiveDate &&
            this.memo == other.memo &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            managementOperationToken,
            effectiveDate,
            memo,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "ManagementOperationReverseParams{managementOperationToken=$managementOperationToken, effectiveDate=$effectiveDate, memo=$memo, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var managementOperationToken: String? = null
        private var effectiveDate: LocalDate? = null
        private var memo: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(managementOperationReverseParams: ManagementOperationReverseParams) =
            apply {
                this.managementOperationToken =
                    managementOperationReverseParams.managementOperationToken
                this.effectiveDate = managementOperationReverseParams.effectiveDate
                this.memo = managementOperationReverseParams.memo
                additionalQueryParams(managementOperationReverseParams.additionalQueryParams)
                additionalHeaders(managementOperationReverseParams.additionalHeaders)
                additionalBodyProperties(managementOperationReverseParams.additionalBodyProperties)
            }

        fun managementOperationToken(managementOperationToken: String) = apply {
            this.managementOperationToken = managementOperationToken
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

        fun build(): ManagementOperationReverseParams =
            ManagementOperationReverseParams(
                checkNotNull(managementOperationToken) {
                    "`managementOperationToken` is required but was not set"
                },
                checkNotNull(effectiveDate) { "`effectiveDate` is required but was not set" },
                memo,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
