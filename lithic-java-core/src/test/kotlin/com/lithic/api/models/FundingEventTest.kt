// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FundingEventTest {

    @Test
    fun create() {
        val fundingEvent =
            FundingEvent.builder()
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
                .build()

        assertThat(fundingEvent.token()).isEqualTo("b68b7424-aa69-4cbc-a946-30d90181b621")
        assertThat(fundingEvent.collectionResourceType())
            .isEqualTo(FundingEvent.CollectionResourceType.PAYMENT)
        assertThat(fundingEvent.collectionTokens())
            .containsExactly("b68b7424-aa69-4cbc-a946-30d90181b621")
        assertThat(fundingEvent.created()).isEqualTo(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        assertThat(fundingEvent.highWatermark())
            .isEqualTo(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        assertThat(fundingEvent.networkSettlementSummary())
            .containsExactly(
                FundingEvent.FundingEventSettlement.builder()
                    .networkSettlementDate(LocalDate.parse("2024-01-01"))
                    .settledGrossAmount(0L)
                    .build()
            )
        assertThat(fundingEvent.previousHighWatermark())
            .isEqualTo(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        assertThat(fundingEvent.updated()).isEqualTo(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fundingEvent =
            FundingEvent.builder()
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
                .build()

        val roundtrippedFundingEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fundingEvent),
                jacksonTypeRef<FundingEvent>(),
            )

        assertThat(roundtrippedFundingEvent).isEqualTo(fundingEvent)
    }
}
