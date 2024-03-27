// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SettlementReportTest {

    @Test
    fun createSettlementReport() {
        val settlementReport =
            SettlementReport.builder()
                .created(OffsetDateTime.parse("2023-06-01T00:00:00Z"))
                .currency("USD")
                .details(
                    listOf(
                        SettlementSummaryDetails.builder()
                            .disputesGrossAmount(123L)
                            .institution("00001")
                            .interchangeGrossAmount(123L)
                            .network(SettlementSummaryDetails.Network.INTERLINK)
                            .otherFeesGrossAmount(123L)
                            .settledNetAmount(123L)
                            .transactionsGrossAmount(123L)
                            .build()
                    )
                )
                .disputesGrossAmount(123L)
                .interchangeGrossAmount(123L)
                .otherFeesGrossAmount(123L)
                .reportDate("2023-06-01")
                .settledNetAmount(123L)
                .transactionsGrossAmount(123L)
                .updated(OffsetDateTime.parse("2023-06-01T00:00:00Z"))
                .build()
        assertThat(settlementReport).isNotNull
        assertThat(settlementReport.created())
            .isEqualTo(OffsetDateTime.parse("2023-06-01T00:00:00Z"))
        assertThat(settlementReport.currency()).isEqualTo("USD")
        assertThat(settlementReport.details())
            .containsExactly(
                SettlementSummaryDetails.builder()
                    .disputesGrossAmount(123L)
                    .institution("00001")
                    .interchangeGrossAmount(123L)
                    .network(SettlementSummaryDetails.Network.INTERLINK)
                    .otherFeesGrossAmount(123L)
                    .settledNetAmount(123L)
                    .transactionsGrossAmount(123L)
                    .build()
            )
        assertThat(settlementReport.disputesGrossAmount()).isEqualTo(123L)
        assertThat(settlementReport.interchangeGrossAmount()).isEqualTo(123L)
        assertThat(settlementReport.otherFeesGrossAmount()).isEqualTo(123L)
        assertThat(settlementReport.reportDate()).isEqualTo("2023-06-01")
        assertThat(settlementReport.settledNetAmount()).isEqualTo(123L)
        assertThat(settlementReport.transactionsGrossAmount()).isEqualTo(123L)
        assertThat(settlementReport.updated())
            .isEqualTo(OffsetDateTime.parse("2023-06-01T00:00:00Z"))
    }
}
