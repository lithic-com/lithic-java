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

@JsonDeserialize(builder = ExtendedCredit.Builder::class)
@NoAutoDetect
class ExtendedCredit
private constructor(
    private val creditExtended: JsonField<Long>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun creditExtended(): Long = creditExtended.getRequired("credit_extended")

    @JsonProperty("credit_extended") @ExcludeMissing fun _creditExtended() = creditExtended

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ExtendedCredit = apply {
        if (!validated) {
            creditExtended()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExtendedCredit &&
            this.creditExtended == other.creditExtended &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = Objects.hash(creditExtended, additionalProperties)
        }
        return hashCode
    }

    override fun toString() =
        "ExtendedCredit{creditExtended=$creditExtended, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var creditExtended: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(extendedCredit: ExtendedCredit) = apply {
            this.creditExtended = extendedCredit.creditExtended
            additionalProperties(extendedCredit.additionalProperties)
        }

        fun creditExtended(creditExtended: Long) = creditExtended(JsonField.of(creditExtended))

        @JsonProperty("credit_extended")
        @ExcludeMissing
        fun creditExtended(creditExtended: JsonField<Long>) = apply {
            this.creditExtended = creditExtended
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

        fun build(): ExtendedCredit =
            ExtendedCredit(creditExtended, additionalProperties.toUnmodifiable())
    }
}
