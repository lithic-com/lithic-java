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
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class ExternalBankAccountAddress
@JsonCreator
private constructor(
    @JsonProperty("address1")
    @ExcludeMissing
    private val address1: JsonField<String> = JsonMissing.of(),
    @JsonProperty("city") @ExcludeMissing private val city: JsonField<String> = JsonMissing.of(),
    @JsonProperty("country")
    @ExcludeMissing
    private val country: JsonField<String> = JsonMissing.of(),
    @JsonProperty("postal_code")
    @ExcludeMissing
    private val postalCode: JsonField<String> = JsonMissing.of(),
    @JsonProperty("state") @ExcludeMissing private val state: JsonField<String> = JsonMissing.of(),
    @JsonProperty("address2")
    @ExcludeMissing
    private val address2: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun address1(): String = address1.getRequired("address1")

    fun city(): String = city.getRequired("city")

    fun country(): String = country.getRequired("country")

    fun postalCode(): String = postalCode.getRequired("postal_code")

    fun state(): String = state.getRequired("state")

    fun address2(): Optional<String> = Optional.ofNullable(address2.getNullable("address2"))

    @JsonProperty("address1") @ExcludeMissing fun _address1(): JsonField<String> = address1

    @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

    @JsonProperty("postal_code") @ExcludeMissing fun _postalCode(): JsonField<String> = postalCode

    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

    @JsonProperty("address2") @ExcludeMissing fun _address2(): JsonField<String> = address2

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ExternalBankAccountAddress = apply {
        if (validated) {
            return@apply
        }

        address1()
        city()
        country()
        postalCode()
        state()
        address2()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder internal constructor() {

        private var address1: JsonField<String>? = null
        private var city: JsonField<String>? = null
        private var country: JsonField<String>? = null
        private var postalCode: JsonField<String>? = null
        private var state: JsonField<String>? = null
        private var address2: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalBankAccountAddress: ExternalBankAccountAddress) = apply {
            address1 = externalBankAccountAddress.address1
            city = externalBankAccountAddress.city
            country = externalBankAccountAddress.country
            postalCode = externalBankAccountAddress.postalCode
            state = externalBankAccountAddress.state
            address2 = externalBankAccountAddress.address2
            additionalProperties = externalBankAccountAddress.additionalProperties.toMutableMap()
        }

        fun address1(address1: String) = address1(JsonField.of(address1))

        fun address1(address1: JsonField<String>) = apply { this.address1 = address1 }

        fun city(city: String) = city(JsonField.of(city))

        fun city(city: JsonField<String>) = apply { this.city = city }

        fun country(country: String) = country(JsonField.of(country))

        fun country(country: JsonField<String>) = apply { this.country = country }

        fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

        fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

        fun state(state: String) = state(JsonField.of(state))

        fun state(state: JsonField<String>) = apply { this.state = state }

        fun address2(address2: String) = address2(JsonField.of(address2))

        fun address2(address2: JsonField<String>) = apply { this.address2 = address2 }

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

        fun build(): ExternalBankAccountAddress =
            ExternalBankAccountAddress(
                checkRequired("address1", address1),
                checkRequired("city", city),
                checkRequired("country", country),
                checkRequired("postalCode", postalCode),
                checkRequired("state", state),
                address2,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalBankAccountAddress && address1 == other.address1 && city == other.city && country == other.country && postalCode == other.postalCode && state == other.state && address2 == other.address2 && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(address1, city, country, postalCode, state, address2, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalBankAccountAddress{address1=$address1, city=$city, country=$country, postalCode=$postalCode, state=$state, address2=$address2, additionalProperties=$additionalProperties}"
}
