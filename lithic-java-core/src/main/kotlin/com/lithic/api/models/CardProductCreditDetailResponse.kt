// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import java.util.Objects

@JsonDeserialize(builder = CardProductCreditDetailResponse.Builder::class)
@NoAutoDetect
class CardProductCreditDetailResponse
private constructor(
    private val creditExtended: JsonField<Long>,
    private val creditLimit: JsonField<Long>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The amount of credit extended within the program */
    fun creditExtended(): Long = creditExtended.getRequired("credit_extended")

    /** The total credit limit of the program */
    fun creditLimit(): Long = creditLimit.getRequired("credit_limit")

    /** The amount of credit extended within the program */
    @JsonProperty("credit_extended") @ExcludeMissing fun _creditExtended() = creditExtended

    /** The total credit limit of the program */
    @JsonProperty("credit_limit") @ExcludeMissing fun _creditLimit() = creditLimit

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CardProductCreditDetailResponse = apply {
        if (!validated) {
            creditExtended()
            creditLimit()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardProductCreditDetailResponse &&
            this.creditExtended == other.creditExtended &&
            this.creditLimit == other.creditLimit &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    creditExtended,
                    creditLimit,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "CardProductCreditDetailResponse{creditExtended=$creditExtended, creditLimit=$creditLimit, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var creditExtended: JsonField<Long> = JsonMissing.of()
        private var creditLimit: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardProductCreditDetailResponse: CardProductCreditDetailResponse) =
            apply {
                this.creditExtended = cardProductCreditDetailResponse.creditExtended
                this.creditLimit = cardProductCreditDetailResponse.creditLimit
                additionalProperties(cardProductCreditDetailResponse.additionalProperties)
            }

        /** The amount of credit extended within the program */
        fun creditExtended(creditExtended: Long) = creditExtended(JsonField.of(creditExtended))

        /** The amount of credit extended within the program */
        @JsonProperty("credit_extended")
        @ExcludeMissing
        fun creditExtended(creditExtended: JsonField<Long>) = apply {
            this.creditExtended = creditExtended
        }

        /** The total credit limit of the program */
        fun creditLimit(creditLimit: Long) = creditLimit(JsonField.of(creditLimit))

        /** The total credit limit of the program */
        @JsonProperty("credit_limit")
        @ExcludeMissing
        fun creditLimit(creditLimit: JsonField<Long>) = apply { this.creditLimit = creditLimit }

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

        fun build(): CardProductCreditDetailResponse =
            CardProductCreditDetailResponse(
                creditExtended,
                creditLimit,
                additionalProperties.toUnmodifiable(),
            )
    }
}
