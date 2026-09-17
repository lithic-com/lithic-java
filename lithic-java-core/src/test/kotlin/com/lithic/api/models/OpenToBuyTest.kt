// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OpenToBuyTest {

    @Test
    fun create() {
        val openToBuy =
            OpenToBuy.builder()
                .openToBuy(350000L)
                .summary(
                    OpenToBuySummary.builder()
                        .security(300000L)
                        .settledFunds(300000L)
                        .totalOutstandingSpend(-250000L)
                        .build()
                )
                .build()

        assertThat(openToBuy.openToBuy()).isEqualTo(350000L)
        assertThat(openToBuy.summary())
            .isEqualTo(
                OpenToBuySummary.builder()
                    .security(300000L)
                    .settledFunds(300000L)
                    .totalOutstandingSpend(-250000L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val openToBuy =
            OpenToBuy.builder()
                .openToBuy(350000L)
                .summary(
                    OpenToBuySummary.builder()
                        .security(300000L)
                        .settledFunds(300000L)
                        .totalOutstandingSpend(-250000L)
                        .build()
                )
                .build()

        val roundtrippedOpenToBuy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(openToBuy),
                jacksonTypeRef<OpenToBuy>(),
            )

        assertThat(roundtrippedOpenToBuy).isEqualTo(openToBuy)
    }
}
