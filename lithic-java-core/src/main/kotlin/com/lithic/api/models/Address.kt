package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.google.common.collect.Multimaps
import java.util.Objects
import java.util.Optional
import com.lithic.api.core.BaseDeserializer
import com.lithic.api.core.BaseSerializer
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.JsonField
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.errors.LithicInvalidDataException

@JsonDeserialize(builder = Address.Builder::class)
@NoAutoDetect
class Address private constructor(private val address1: JsonField<String>,private val address2: JsonField<String>,private val city: JsonField<String>,private val country: JsonField<String>,private val postalCode: JsonField<String>,private val state: JsonField<String>,private val additionalProperties: Map<String, JsonValue>,) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Valid deliverable address (no PO boxes). */
    fun address1(): String = address1.getRequired("address1")

    /** Unit or apartment number (if applicable). */
    fun address2(): Optional<String> = Optional.ofNullable(address2.getNullable("address2"))

    /** Name of city. */
    fun city(): String = city.getRequired("city")

    /**
     * Valid country code. Only USA is currently supported, entered in uppercase ISO
     * 3166-1 alpha-3 three-character format.
     */
    fun country(): String = country.getRequired("country")

    /**
     * Valid postal code. Only USA ZIP codes are currently supported, entered as a
     * five-digit ZIP or nine-digit ZIP+4.
     */
    fun postalCode(): String = postalCode.getRequired("postal_code")

    /**
     * Valid state code. Only USA state codes are currently supported, entered in
     * uppercase ISO 3166-2 two-character format.
     */
    fun state(): String = state.getRequired("state")

    /** Valid deliverable address (no PO boxes). */
    @JsonProperty("address1")
    @ExcludeMissing
    fun _address1() = address1

    /** Unit or apartment number (if applicable). */
    @JsonProperty("address2")
    @ExcludeMissing
    fun _address2() = address2

    /** Name of city. */
    @JsonProperty("city")
    @ExcludeMissing
    fun _city() = city

    /**
     * Valid country code. Only USA is currently supported, entered in uppercase ISO
     * 3166-1 alpha-3 three-character format.
     */
    @JsonProperty("country")
    @ExcludeMissing
    fun _country() = country

    /**
     * Valid postal code. Only USA ZIP codes are currently supported, entered as a
     * five-digit ZIP or nine-digit ZIP+4.
     */
    @JsonProperty("postal_code")
    @ExcludeMissing
    fun _postalCode() = postalCode

    /**
     * Valid state code. Only USA state codes are currently supported, entered in
     * uppercase ISO 3166-2 two-character format.
     */
    @JsonProperty("state")
    @ExcludeMissing
    fun _state() = state

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
          address1()
          address2()
          city()
          country()
          postalCode()
          state()
          validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is Address &&
          address1 == other.address1 &&
          address2 == other.address2 &&
          city == other.city &&
          country == other.country &&
          postalCode == other.postalCode &&
          state == other.state &&
          additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
      if (hashCode == 0) {
        hashCode = Objects.hash(
            address1,
            address2,
            city,
            country,
            postalCode,
            state,
            additionalProperties,
        )
      }
      return hashCode
    }

    override fun toString() = "Address{address1=$address1, address2=$address2, city=$city, country=$country, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    class Builder {

        private var address1: JsonField<String> = JsonMissing.of()
        private var address2: JsonField<String> = JsonMissing.of()
        private var city: JsonField<String> = JsonMissing.of()
        private var country: JsonField<String> = JsonMissing.of()
        private var postalCode: JsonField<String> = JsonMissing.of()
        private var state: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(address: Address) = apply {
            this.address1 = address.address1
            this.address2 = address.address2
            this.city = address.city
            this.country = address.country
            this.postalCode = address.postalCode
            this.state = address.state
            additionalProperties(address.additionalProperties)
        }

        /** Valid deliverable address (no PO boxes). */
        fun address1(address1: String) = address1(JsonField.of(address1))

        /** Valid deliverable address (no PO boxes). */
        @JsonProperty("address1")
        @ExcludeMissing
        fun address1(address1: JsonField<String>) = apply {
            this.address1 = address1
        }

        /** Unit or apartment number (if applicable). */
        fun address2(address2: String) = address2(JsonField.of(address2))

        /** Unit or apartment number (if applicable). */
        @JsonProperty("address2")
        @ExcludeMissing
        fun address2(address2: JsonField<String>) = apply {
            this.address2 = address2
        }

        /** Name of city. */
        fun city(city: String) = city(JsonField.of(city))

        /** Name of city. */
        @JsonProperty("city")
        @ExcludeMissing
        fun city(city: JsonField<String>) = apply {
            this.city = city
        }

        /**
         * Valid country code. Only USA is currently supported, entered in uppercase ISO
         * 3166-1 alpha-3 three-character format.
         */
        fun country(country: String) = country(JsonField.of(country))

        /**
         * Valid country code. Only USA is currently supported, entered in uppercase ISO
         * 3166-1 alpha-3 three-character format.
         */
        @JsonProperty("country")
        @ExcludeMissing
        fun country(country: JsonField<String>) = apply {
            this.country = country
        }

        /**
         * Valid postal code. Only USA ZIP codes are currently supported, entered as a
         * five-digit ZIP or nine-digit ZIP+4.
         */
        fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

        /**
         * Valid postal code. Only USA ZIP codes are currently supported, entered as a
         * five-digit ZIP or nine-digit ZIP+4.
         */
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun postalCode(postalCode: JsonField<String>) = apply {
            this.postalCode = postalCode
        }

        /**
         * Valid state code. Only USA state codes are currently supported, entered in
         * uppercase ISO 3166-2 two-character format.
         */
        fun state(state: String) = state(JsonField.of(state))

        /**
         * Valid state code. Only USA state codes are currently supported, entered in
         * uppercase ISO 3166-2 two-character format.
         */
        @JsonProperty("state")
        @ExcludeMissing
        fun state(state: JsonField<String>) = apply {
            this.state = state
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

        fun build(): Address = Address(
            address1,
            address2,
            city,
            country,
            postalCode,
            state,
            additionalProperties.toUnmodifiable(),
        )
    }
}
