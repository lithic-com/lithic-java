// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.JsonValue
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InterestTierScheduleTest {

    @Test
    fun create() {
        val interestTierSchedule =
            InterestTierSchedule.builder()
                .creditProductToken("credit_product_token")
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .tierName("tier_name")
                .tierRates(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(interestTierSchedule.creditProductToken()).isEqualTo("credit_product_token")
        assertThat(interestTierSchedule.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(interestTierSchedule.tierName()).contains("tier_name")
        assertThat(interestTierSchedule._tierRates())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val interestTierSchedule =
            InterestTierSchedule.builder()
                .creditProductToken("credit_product_token")
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .tierName("tier_name")
                .tierRates(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedInterestTierSchedule =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(interestTierSchedule),
                jacksonTypeRef<InterestTierSchedule>(),
            )

        assertThat(roundtrippedInterestTierSchedule).isEqualTo(interestTierSchedule)
    }
}
