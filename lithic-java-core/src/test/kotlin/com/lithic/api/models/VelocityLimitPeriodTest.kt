// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.JsonValue
import com.lithic.api.core.jsonMapper
import com.lithic.api.errors.LithicInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class VelocityLimitPeriodTest {

    @Test
    fun ofTrailingWindowObject() {
        val trailingWindowObject =
            VelocityLimitPeriod.TrailingWindowObject.builder()
                .duration(10L)
                .type(VelocityLimitPeriod.TrailingWindowObject.Type.CUSTOM)
                .build()

        val velocityLimitPeriod = VelocityLimitPeriod.ofTrailingWindowObject(trailingWindowObject)

        assertThat(velocityLimitPeriod.trailingWindowObject()).contains(trailingWindowObject)
        assertThat(velocityLimitPeriod.fixedWindowDay()).isEmpty
        assertThat(velocityLimitPeriod.fixedWindowWeek()).isEmpty
        assertThat(velocityLimitPeriod.fixedWindowMonth()).isEmpty
        assertThat(velocityLimitPeriod.fixedWindowYear()).isEmpty
    }

    @Test
    fun ofTrailingWindowObjectRoundtrip() {
        val jsonMapper = jsonMapper()
        val velocityLimitPeriod =
            VelocityLimitPeriod.ofTrailingWindowObject(
                VelocityLimitPeriod.TrailingWindowObject.builder()
                    .duration(10L)
                    .type(VelocityLimitPeriod.TrailingWindowObject.Type.CUSTOM)
                    .build()
            )

        val roundtrippedVelocityLimitPeriod =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(velocityLimitPeriod),
                jacksonTypeRef<VelocityLimitPeriod>(),
            )

        assertThat(roundtrippedVelocityLimitPeriod).isEqualTo(velocityLimitPeriod)
    }

    @Test
    fun ofFixedWindowDay() {
        val fixedWindowDay =
            VelocityLimitPeriod.FixedWindowDay.builder()
                .type(VelocityLimitPeriod.FixedWindowDay.Type.DAY)
                .build()

        val velocityLimitPeriod = VelocityLimitPeriod.ofFixedWindowDay(fixedWindowDay)

        assertThat(velocityLimitPeriod.trailingWindowObject()).isEmpty
        assertThat(velocityLimitPeriod.fixedWindowDay()).contains(fixedWindowDay)
        assertThat(velocityLimitPeriod.fixedWindowWeek()).isEmpty
        assertThat(velocityLimitPeriod.fixedWindowMonth()).isEmpty
        assertThat(velocityLimitPeriod.fixedWindowYear()).isEmpty
    }

    @Test
    fun ofFixedWindowDayRoundtrip() {
        val jsonMapper = jsonMapper()
        val velocityLimitPeriod =
            VelocityLimitPeriod.ofFixedWindowDay(
                VelocityLimitPeriod.FixedWindowDay.builder()
                    .type(VelocityLimitPeriod.FixedWindowDay.Type.DAY)
                    .build()
            )

        val roundtrippedVelocityLimitPeriod =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(velocityLimitPeriod),
                jacksonTypeRef<VelocityLimitPeriod>(),
            )

        assertThat(roundtrippedVelocityLimitPeriod).isEqualTo(velocityLimitPeriod)
    }

    @Test
    fun ofFixedWindowWeek() {
        val fixedWindowWeek =
            VelocityLimitPeriod.FixedWindowWeek.builder()
                .type(VelocityLimitPeriod.FixedWindowWeek.Type.WEEK)
                .dayOfWeek(1L)
                .build()

        val velocityLimitPeriod = VelocityLimitPeriod.ofFixedWindowWeek(fixedWindowWeek)

        assertThat(velocityLimitPeriod.trailingWindowObject()).isEmpty
        assertThat(velocityLimitPeriod.fixedWindowDay()).isEmpty
        assertThat(velocityLimitPeriod.fixedWindowWeek()).contains(fixedWindowWeek)
        assertThat(velocityLimitPeriod.fixedWindowMonth()).isEmpty
        assertThat(velocityLimitPeriod.fixedWindowYear()).isEmpty
    }

    @Test
    fun ofFixedWindowWeekRoundtrip() {
        val jsonMapper = jsonMapper()
        val velocityLimitPeriod =
            VelocityLimitPeriod.ofFixedWindowWeek(
                VelocityLimitPeriod.FixedWindowWeek.builder()
                    .type(VelocityLimitPeriod.FixedWindowWeek.Type.WEEK)
                    .dayOfWeek(1L)
                    .build()
            )

        val roundtrippedVelocityLimitPeriod =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(velocityLimitPeriod),
                jacksonTypeRef<VelocityLimitPeriod>(),
            )

        assertThat(roundtrippedVelocityLimitPeriod).isEqualTo(velocityLimitPeriod)
    }

    @Test
    fun ofFixedWindowMonth() {
        val fixedWindowMonth =
            VelocityLimitPeriod.FixedWindowMonth.builder()
                .type(VelocityLimitPeriod.FixedWindowMonth.Type.MONTH)
                .dayOfMonth(1L)
                .build()

        val velocityLimitPeriod = VelocityLimitPeriod.ofFixedWindowMonth(fixedWindowMonth)

        assertThat(velocityLimitPeriod.trailingWindowObject()).isEmpty
        assertThat(velocityLimitPeriod.fixedWindowDay()).isEmpty
        assertThat(velocityLimitPeriod.fixedWindowWeek()).isEmpty
        assertThat(velocityLimitPeriod.fixedWindowMonth()).contains(fixedWindowMonth)
        assertThat(velocityLimitPeriod.fixedWindowYear()).isEmpty
    }

    @Test
    fun ofFixedWindowMonthRoundtrip() {
        val jsonMapper = jsonMapper()
        val velocityLimitPeriod =
            VelocityLimitPeriod.ofFixedWindowMonth(
                VelocityLimitPeriod.FixedWindowMonth.builder()
                    .type(VelocityLimitPeriod.FixedWindowMonth.Type.MONTH)
                    .dayOfMonth(1L)
                    .build()
            )

        val roundtrippedVelocityLimitPeriod =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(velocityLimitPeriod),
                jacksonTypeRef<VelocityLimitPeriod>(),
            )

        assertThat(roundtrippedVelocityLimitPeriod).isEqualTo(velocityLimitPeriod)
    }

    @Test
    fun ofFixedWindowYear() {
        val fixedWindowYear =
            VelocityLimitPeriod.FixedWindowYear.builder()
                .type(VelocityLimitPeriod.FixedWindowYear.Type.YEAR)
                .dayOfMonth(1L)
                .month(1L)
                .build()

        val velocityLimitPeriod = VelocityLimitPeriod.ofFixedWindowYear(fixedWindowYear)

        assertThat(velocityLimitPeriod.trailingWindowObject()).isEmpty
        assertThat(velocityLimitPeriod.fixedWindowDay()).isEmpty
        assertThat(velocityLimitPeriod.fixedWindowWeek()).isEmpty
        assertThat(velocityLimitPeriod.fixedWindowMonth()).isEmpty
        assertThat(velocityLimitPeriod.fixedWindowYear()).contains(fixedWindowYear)
    }

    @Test
    fun ofFixedWindowYearRoundtrip() {
        val jsonMapper = jsonMapper()
        val velocityLimitPeriod =
            VelocityLimitPeriod.ofFixedWindowYear(
                VelocityLimitPeriod.FixedWindowYear.builder()
                    .type(VelocityLimitPeriod.FixedWindowYear.Type.YEAR)
                    .dayOfMonth(1L)
                    .month(1L)
                    .build()
            )

        val roundtrippedVelocityLimitPeriod =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(velocityLimitPeriod),
                jacksonTypeRef<VelocityLimitPeriod>(),
            )

        assertThat(roundtrippedVelocityLimitPeriod).isEqualTo(velocityLimitPeriod)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val velocityLimitPeriod =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<VelocityLimitPeriod>())

        val e = assertThrows<LithicInvalidDataException> { velocityLimitPeriod.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
