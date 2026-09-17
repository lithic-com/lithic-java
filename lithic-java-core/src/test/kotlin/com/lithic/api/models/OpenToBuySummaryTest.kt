// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OpenToBuySummaryTest {

    @Test
    fun create() {
        val openToBuySummary =
            OpenToBuySummary.builder()
                .security(300000L)
                .settledFunds(300000L)
                .totalOutstandingSpend(-250000L)
                .build()

        assertThat(openToBuySummary.security()).isEqualTo(300000L)
        assertThat(openToBuySummary.settledFunds()).contains(300000L)
        assertThat(openToBuySummary.totalOutstandingSpend()).isEqualTo(-250000L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val openToBuySummary =
            OpenToBuySummary.builder()
                .security(300000L)
                .settledFunds(300000L)
                .totalOutstandingSpend(-250000L)
                .build()

        val roundtrippedOpenToBuySummary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(openToBuySummary),
                jacksonTypeRef<OpenToBuySummary>(),
            )

        assertThat(roundtrippedOpenToBuySummary).isEqualTo(openToBuySummary)
    }
}
