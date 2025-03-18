// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SettlementSummaryDetailsTest {

    @Test
    fun create() {
        val settlementSummaryDetails =
            SettlementSummaryDetails.builder()
                .currency("USD")
                .disputesGrossAmount(0L)
                .institution("00001")
                .interchangeGrossAmount(-7L)
                .network(SettlementSummaryDetails.Network.INTERLINK)
                .otherFeesGrossAmount(0L)
                .settledNetAmount(1893L)
                .transactionsGrossAmount(1900L)
                .build()

        assertThat(settlementSummaryDetails.currency()).contains("USD")
        assertThat(settlementSummaryDetails.disputesGrossAmount()).contains(0L)
        assertThat(settlementSummaryDetails.institution()).contains("00001")
        assertThat(settlementSummaryDetails.interchangeGrossAmount()).contains(-7L)
        assertThat(settlementSummaryDetails.network())
            .contains(SettlementSummaryDetails.Network.INTERLINK)
        assertThat(settlementSummaryDetails.otherFeesGrossAmount()).contains(0L)
        assertThat(settlementSummaryDetails.settledNetAmount()).contains(1893L)
        assertThat(settlementSummaryDetails.transactionsGrossAmount()).contains(1900L)
    }
}
