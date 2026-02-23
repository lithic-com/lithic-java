// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.JsonValue
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FinancialAccountInterestTierScheduleListPageResponseTest {

    @Test
    fun create() {
        val financialAccountInterestTierScheduleListPageResponse =
            FinancialAccountInterestTierScheduleListPageResponse.builder()
                .addData(
                    InterestTierSchedule.builder()
                        .creditProductToken("credit_product_token")
                        .effectiveDate(LocalDate.parse("2019-12-27"))
                        .tierName("tier_name")
                        .tierRates(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .hasMore(true)
                .build()

        assertThat(financialAccountInterestTierScheduleListPageResponse.data())
            .containsExactly(
                InterestTierSchedule.builder()
                    .creditProductToken("credit_product_token")
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .tierName("tier_name")
                    .tierRates(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(financialAccountInterestTierScheduleListPageResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val financialAccountInterestTierScheduleListPageResponse =
            FinancialAccountInterestTierScheduleListPageResponse.builder()
                .addData(
                    InterestTierSchedule.builder()
                        .creditProductToken("credit_product_token")
                        .effectiveDate(LocalDate.parse("2019-12-27"))
                        .tierName("tier_name")
                        .tierRates(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .hasMore(true)
                .build()

        val roundtrippedFinancialAccountInterestTierScheduleListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(financialAccountInterestTierScheduleListPageResponse),
                jacksonTypeRef<FinancialAccountInterestTierScheduleListPageResponse>(),
            )

        assertThat(roundtrippedFinancialAccountInterestTierScheduleListPageResponse)
            .isEqualTo(financialAccountInterestTierScheduleListPageResponse)
    }
}
