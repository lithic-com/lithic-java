// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.JsonValue
import com.lithic.api.core.jsonMapper
import com.lithic.api.errors.LithicInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class ConditionalValueTest {

    @Test
    fun ofRegex() {
        val regex = "string"

        val conditionalValue = ConditionalValue.ofRegex(regex)

        assertThat(conditionalValue.regex()).contains(regex)
        assertThat(conditionalValue.number()).isEmpty
        assertThat(conditionalValue.listOfStrings()).isEmpty
    }

    @Test
    fun ofRegexRoundtrip() {
        val jsonMapper = jsonMapper()
        val conditionalValue = ConditionalValue.ofRegex("string")

        val roundtrippedConditionalValue =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conditionalValue),
                jacksonTypeRef<ConditionalValue>(),
            )

        assertThat(roundtrippedConditionalValue).isEqualTo(conditionalValue)
    }

    @Test
    fun ofNumber() {
        val number = 0L

        val conditionalValue = ConditionalValue.ofNumber(number)

        assertThat(conditionalValue.regex()).isEmpty
        assertThat(conditionalValue.number()).contains(number)
        assertThat(conditionalValue.listOfStrings()).isEmpty
    }

    @Test
    fun ofNumberRoundtrip() {
        val jsonMapper = jsonMapper()
        val conditionalValue = ConditionalValue.ofNumber(0L)

        val roundtrippedConditionalValue =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conditionalValue),
                jacksonTypeRef<ConditionalValue>(),
            )

        assertThat(roundtrippedConditionalValue).isEqualTo(conditionalValue)
    }

    @Test
    fun ofListOfStrings() {
        val listOfStrings = listOf("string")

        val conditionalValue = ConditionalValue.ofListOfStrings(listOfStrings)

        assertThat(conditionalValue.regex()).isEmpty
        assertThat(conditionalValue.number()).isEmpty
        assertThat(conditionalValue.listOfStrings()).contains(listOfStrings)
    }

    @Test
    fun ofListOfStringsRoundtrip() {
        val jsonMapper = jsonMapper()
        val conditionalValue = ConditionalValue.ofListOfStrings(listOf("string"))

        val roundtrippedConditionalValue =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conditionalValue),
                jacksonTypeRef<ConditionalValue>(),
            )

        assertThat(roundtrippedConditionalValue).isEqualTo(conditionalValue)
    }

    @Test
    fun incompatibleJsonShapeDeserializesToUnknown() {
        val value = JsonValue.from(mapOf("invalid" to "object"))
        val conditionalValue = jsonMapper().convertValue(value, jacksonTypeRef<ConditionalValue>())

        val e = assertThrows<LithicInvalidDataException> { conditionalValue.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
