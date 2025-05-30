// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SettlementReportTest {

    @Test
    fun create() {
        val settlementReport =
            SettlementReport.builder()
                .created(OffsetDateTime.parse("2023-06-01T00:00:00Z"))
                .currency("USD")
                .addDetail(
                    SettlementSummaryDetails.builder()
                        .currency("USD")
                        .disputesGrossAmount(0L)
                        .institution("00001")
                        .interchangeGrossAmount(-7L)
                        .network(SettlementSummaryDetails.Network.MASTERCARD)
                        .otherFeesGrossAmount(0L)
                        .settledNetAmount(1893L)
                        .transactionsGrossAmount(1900L)
                        .build()
                )
                .disputesGrossAmount(0L)
                .interchangeGrossAmount(-7L)
                .isComplete(true)
                .otherFeesGrossAmount(0L)
                .reportDate("2023-06-01")
                .settledNetAmount(1893L)
                .transactionsGrossAmount(1900L)
                .updated(OffsetDateTime.parse("2023-06-01T00:00:00Z"))
                .build()

        assertThat(settlementReport.created())
            .isEqualTo(OffsetDateTime.parse("2023-06-01T00:00:00Z"))
        assertThat(settlementReport.currency()).isEqualTo("USD")
        assertThat(settlementReport.details())
            .containsExactly(
                SettlementSummaryDetails.builder()
                    .currency("USD")
                    .disputesGrossAmount(0L)
                    .institution("00001")
                    .interchangeGrossAmount(-7L)
                    .network(SettlementSummaryDetails.Network.MASTERCARD)
                    .otherFeesGrossAmount(0L)
                    .settledNetAmount(1893L)
                    .transactionsGrossAmount(1900L)
                    .build()
            )
        assertThat(settlementReport.disputesGrossAmount()).isEqualTo(0L)
        assertThat(settlementReport.interchangeGrossAmount()).isEqualTo(-7L)
        assertThat(settlementReport.isComplete()).isEqualTo(true)
        assertThat(settlementReport.otherFeesGrossAmount()).isEqualTo(0L)
        assertThat(settlementReport.reportDate()).isEqualTo("2023-06-01")
        assertThat(settlementReport.settledNetAmount()).isEqualTo(1893L)
        assertThat(settlementReport.transactionsGrossAmount()).isEqualTo(1900L)
        assertThat(settlementReport.updated())
            .isEqualTo(OffsetDateTime.parse("2023-06-01T00:00:00Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val settlementReport =
            SettlementReport.builder()
                .created(OffsetDateTime.parse("2023-06-01T00:00:00Z"))
                .currency("USD")
                .addDetail(
                    SettlementSummaryDetails.builder()
                        .currency("USD")
                        .disputesGrossAmount(0L)
                        .institution("00001")
                        .interchangeGrossAmount(-7L)
                        .network(SettlementSummaryDetails.Network.MASTERCARD)
                        .otherFeesGrossAmount(0L)
                        .settledNetAmount(1893L)
                        .transactionsGrossAmount(1900L)
                        .build()
                )
                .disputesGrossAmount(0L)
                .interchangeGrossAmount(-7L)
                .isComplete(true)
                .otherFeesGrossAmount(0L)
                .reportDate("2023-06-01")
                .settledNetAmount(1893L)
                .transactionsGrossAmount(1900L)
                .updated(OffsetDateTime.parse("2023-06-01T00:00:00Z"))
                .build()

        val roundtrippedSettlementReport =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(settlementReport),
                jacksonTypeRef<SettlementReport>(),
            )

        assertThat(roundtrippedSettlementReport).isEqualTo(settlementReport)
    }
}
