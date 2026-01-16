// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.JsonValue
import com.lithic.api.core.jsonMapper
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class ConditionalValueTest {

    @Test
    fun ofRegex() {
        val regex = "string"

        val conditionalValue = ConditionalValue.ofRegex(regex)

        assertThat(conditionalValue.regex()).contains(regex)
        assertThat(conditionalValue.number()).isEmpty
        assertThat(conditionalValue.listOfStrings()).isEmpty
        assertThat(conditionalValue.timestamp()).isEmpty
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
        assertThat(conditionalValue.timestamp()).isEmpty
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
        assertThat(conditionalValue.timestamp()).isEmpty
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
    fun ofTimestamp() {
        val timestamp = OffsetDateTime.parse("2019-12-27T18:11:19.117Z")

        val conditionalValue = ConditionalValue.ofTimestamp(timestamp)

        assertThat(conditionalValue.regex()).isEmpty
        assertThat(conditionalValue.number()).isEmpty
        assertThat(conditionalValue.listOfStrings()).isEmpty
        assertThat(conditionalValue.timestamp()).contains(timestamp)
    }

    @Test
    fun ofTimestampRoundtrip() {
        val jsonMapper = jsonMapper()
        val conditionalValue =
            ConditionalValue.ofTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))

        val roundtrippedConditionalValue =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conditionalValue),
                jacksonTypeRef<ConditionalValue>(),
            )

        assertThat(roundtrippedConditionalValue).isEqualTo(conditionalValue)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        FLOAT(JsonValue.from(3.14)),
        OBJECT(JsonValue.from(mapOf("invalid" to "object"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val conditionalValue =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<ConditionalValue>())

        val e = assertThrows<LithicInvalidDataException> { conditionalValue.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
