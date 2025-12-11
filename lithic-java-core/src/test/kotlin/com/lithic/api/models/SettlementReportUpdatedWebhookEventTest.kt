// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SettlementReportUpdatedWebhookEventTest {

    @Test
    fun create() {
        val settlementReportUpdatedWebhookEvent =
            SettlementReportUpdatedWebhookEvent.builder()
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventType(SettlementReportUpdatedWebhookEvent.EventType.SETTLEMENT_REPORT_UPDATED)
                .build()

        assertThat(settlementReportUpdatedWebhookEvent.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(settlementReportUpdatedWebhookEvent.currency()).isEqualTo("USD")
        assertThat(settlementReportUpdatedWebhookEvent.details())
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
        assertThat(settlementReportUpdatedWebhookEvent.disputesGrossAmount()).isEqualTo(0L)
        assertThat(settlementReportUpdatedWebhookEvent.interchangeGrossAmount()).isEqualTo(-7L)
        assertThat(settlementReportUpdatedWebhookEvent.isComplete()).isEqualTo(true)
        assertThat(settlementReportUpdatedWebhookEvent.otherFeesGrossAmount()).isEqualTo(0L)
        assertThat(settlementReportUpdatedWebhookEvent.reportDate()).isEqualTo("2023-06-01")
        assertThat(settlementReportUpdatedWebhookEvent.settledNetAmount()).isEqualTo(1893L)
        assertThat(settlementReportUpdatedWebhookEvent.transactionsGrossAmount()).isEqualTo(1900L)
        assertThat(settlementReportUpdatedWebhookEvent.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(settlementReportUpdatedWebhookEvent.eventType())
            .isEqualTo(SettlementReportUpdatedWebhookEvent.EventType.SETTLEMENT_REPORT_UPDATED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val settlementReportUpdatedWebhookEvent =
            SettlementReportUpdatedWebhookEvent.builder()
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventType(SettlementReportUpdatedWebhookEvent.EventType.SETTLEMENT_REPORT_UPDATED)
                .build()

        val roundtrippedSettlementReportUpdatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(settlementReportUpdatedWebhookEvent),
                jacksonTypeRef<SettlementReportUpdatedWebhookEvent>(),
            )

        assertThat(roundtrippedSettlementReportUpdatedWebhookEvent)
            .isEqualTo(settlementReportUpdatedWebhookEvent)
    }
}
