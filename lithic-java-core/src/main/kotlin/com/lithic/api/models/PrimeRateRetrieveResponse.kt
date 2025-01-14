// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.checkRequired
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import java.time.LocalDate
import java.util.Objects

@NoAutoDetect
class PrimeRateRetrieveResponse
@JsonCreator
private constructor(
    @JsonProperty("data")
    @ExcludeMissing
    private val data: JsonField<List<InterestRate>> = JsonMissing.of(),
    @JsonProperty("has_more")
    @ExcludeMissing
    private val hasMore: JsonField<Boolean> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** List of prime rates */
    fun data(): List<InterestRate> = data.getRequired("data")

    /** Whether there are more prime rates */
    fun hasMore(): Boolean = hasMore.getRequired("has_more")

    /** List of prime rates */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<InterestRate>> = data

    /** Whether there are more prime rates */
    @JsonProperty("has_more") @ExcludeMissing fun _hasMore(): JsonField<Boolean> = hasMore

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PrimeRateRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        hasMore()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var data: JsonField<MutableList<InterestRate>>? = null
        private var hasMore: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(primeRateRetrieveResponse: PrimeRateRetrieveResponse) = apply {
            data = primeRateRetrieveResponse.data.map { it.toMutableList() }
            hasMore = primeRateRetrieveResponse.hasMore
            additionalProperties = primeRateRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** List of prime rates */
        fun data(data: List<InterestRate>) = data(JsonField.of(data))

        /** List of prime rates */
        fun data(data: JsonField<List<InterestRate>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /** List of prime rates */
        fun addData(data: InterestRate) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(data)
                }
        }

        /** Whether there are more prime rates */
        fun hasMore(hasMore: Boolean) = hasMore(JsonField.of(hasMore))

        /** Whether there are more prime rates */
        fun hasMore(hasMore: JsonField<Boolean>) = apply { this.hasMore = hasMore }

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

        fun build(): PrimeRateRetrieveResponse =
            PrimeRateRetrieveResponse(
                checkRequired("data", data).map { it.toImmutable() },
                checkRequired("hasMore", hasMore),
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class InterestRate
    @JsonCreator
    private constructor(
        @JsonProperty("effective_date")
        @ExcludeMissing
        private val effectiveDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("rate")
        @ExcludeMissing
        private val rate: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Date the rate goes into effect */
        fun effectiveDate(): LocalDate = effectiveDate.getRequired("effective_date")

        /** The rate in decimal format */
        fun rate(): String = rate.getRequired("rate")

        /** Date the rate goes into effect */
        @JsonProperty("effective_date")
        @ExcludeMissing
        fun _effectiveDate(): JsonField<LocalDate> = effectiveDate

        /** The rate in decimal format */
        @JsonProperty("rate") @ExcludeMissing fun _rate(): JsonField<String> = rate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): InterestRate = apply {
            if (validated) {
                return@apply
            }

            effectiveDate()
            rate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var effectiveDate: JsonField<LocalDate>? = null
            private var rate: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(interestRate: InterestRate) = apply {
                effectiveDate = interestRate.effectiveDate
                rate = interestRate.rate
                additionalProperties = interestRate.additionalProperties.toMutableMap()
            }

            /** Date the rate goes into effect */
            fun effectiveDate(effectiveDate: LocalDate) = effectiveDate(JsonField.of(effectiveDate))

            /** Date the rate goes into effect */
            fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
                this.effectiveDate = effectiveDate
            }

            /** The rate in decimal format */
            fun rate(rate: String) = rate(JsonField.of(rate))

            /** The rate in decimal format */
            fun rate(rate: JsonField<String>) = apply { this.rate = rate }

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

            fun build(): InterestRate =
                InterestRate(
                    checkRequired("effectiveDate", effectiveDate),
                    checkRequired("rate", rate),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InterestRate && effectiveDate == other.effectiveDate && rate == other.rate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(effectiveDate, rate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InterestRate{effectiveDate=$effectiveDate, rate=$rate, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PrimeRateRetrieveResponse && data == other.data && hasMore == other.hasMore && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, hasMore, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PrimeRateRetrieveResponse{data=$data, hasMore=$hasMore, additionalProperties=$additionalProperties}"
}
