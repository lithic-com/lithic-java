// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FundingEventCreatedWebhookEventTest {

    @Test
    fun create() {
        val fundingEventCreatedWebhookEvent =
            FundingEventCreatedWebhookEvent.builder()
                .token("b68b7424-aa69-4cbc-a946-30d90181b621")
                .collectionResourceType(FundingEvent.CollectionResourceType.PAYMENT)
                .addCollectionToken("b68b7424-aa69-4cbc-a946-30d90181b621")
                .created(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .highWatermark(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .addNetworkSettlementSummary(
                    FundingEvent.FundingEventSettlement.builder()
                        .networkSettlementDate(LocalDate.parse("2024-01-01"))
                        .settledGrossAmount(0L)
                        .build()
                )
                .previousHighWatermark(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .updated(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .eventType(FundingEventCreatedWebhookEvent.EventType.FUNDING_EVENT_CREATED)
                .build()

        assertThat(fundingEventCreatedWebhookEvent.token())
            .isEqualTo("b68b7424-aa69-4cbc-a946-30d90181b621")
        assertThat(fundingEventCreatedWebhookEvent.collectionResourceType())
            .isEqualTo(FundingEvent.CollectionResourceType.PAYMENT)
        assertThat(fundingEventCreatedWebhookEvent.collectionTokens())
            .containsExactly("b68b7424-aa69-4cbc-a946-30d90181b621")
        assertThat(fundingEventCreatedWebhookEvent.created())
            .isEqualTo(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        assertThat(fundingEventCreatedWebhookEvent.highWatermark())
            .isEqualTo(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        assertThat(fundingEventCreatedWebhookEvent.networkSettlementSummary())
            .containsExactly(
                FundingEvent.FundingEventSettlement.builder()
                    .networkSettlementDate(LocalDate.parse("2024-01-01"))
                    .settledGrossAmount(0L)
                    .build()
            )
        assertThat(fundingEventCreatedWebhookEvent.previousHighWatermark())
            .isEqualTo(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        assertThat(fundingEventCreatedWebhookEvent.updated())
            .isEqualTo(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        assertThat(fundingEventCreatedWebhookEvent.eventType())
            .isEqualTo(FundingEventCreatedWebhookEvent.EventType.FUNDING_EVENT_CREATED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fundingEventCreatedWebhookEvent =
            FundingEventCreatedWebhookEvent.builder()
                .token("b68b7424-aa69-4cbc-a946-30d90181b621")
                .collectionResourceType(FundingEvent.CollectionResourceType.PAYMENT)
                .addCollectionToken("b68b7424-aa69-4cbc-a946-30d90181b621")
                .created(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .highWatermark(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .addNetworkSettlementSummary(
                    FundingEvent.FundingEventSettlement.builder()
                        .networkSettlementDate(LocalDate.parse("2024-01-01"))
                        .settledGrossAmount(0L)
                        .build()
                )
                .previousHighWatermark(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .updated(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .eventType(FundingEventCreatedWebhookEvent.EventType.FUNDING_EVENT_CREATED)
                .build()

        val roundtrippedFundingEventCreatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fundingEventCreatedWebhookEvent),
                jacksonTypeRef<FundingEventCreatedWebhookEvent>(),
            )

        assertThat(roundtrippedFundingEventCreatedWebhookEvent)
            .isEqualTo(fundingEventCreatedWebhookEvent)
    }
}
