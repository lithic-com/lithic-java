// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SettlementSummaryDetailsTest {

    @Test
    fun createSettlementSummaryDetails() {
        val settlementSummaryDetails =
            SettlementSummaryDetails.builder()
                .disputesGrossAmount(123L)
                .institution("00001")
                .interchangeGrossAmount(123L)
                .network(SettlementSummaryDetails.Network.INTERLINK)
                .otherFeesGrossAmount(123L)
                .settledNetAmount(123L)
                .transactionsGrossAmount(123L)
                .build()
        assertThat(settlementSummaryDetails).isNotNull
        assertThat(settlementSummaryDetails.disputesGrossAmount()).contains(123L)
        assertThat(settlementSummaryDetails.institution()).contains("00001")
        assertThat(settlementSummaryDetails.interchangeGrossAmount()).contains(123L)
        assertThat(settlementSummaryDetails.network())
            .contains(SettlementSummaryDetails.Network.INTERLINK)
        assertThat(settlementSummaryDetails.otherFeesGrossAmount()).contains(123L)
        assertThat(settlementSummaryDetails.settledNetAmount()).contains(123L)
        assertThat(settlementSummaryDetails.transactionsGrossAmount()).contains(123L)
    }
}
