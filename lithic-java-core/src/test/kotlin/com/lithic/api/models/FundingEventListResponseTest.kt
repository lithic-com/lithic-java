// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FundingEventListResponseTest {

    @Test
    fun create() {
        val fundingEventListResponse =
            FundingEventListResponse.builder()
                .token("b68b7424-aa69-4cbc-a946-30d90181b621")
                .collectionResourceType(FundingEventListResponse.CollectionResourceType.PAYMENT)
                .addCollectionToken("b68b7424-aa69-4cbc-a946-30d90181b621")
                .created(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .highWatermark(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .addNetworkSettlementSummary(
                    FundingEventListResponse.FundingEventSettlement.builder()
                        .networkSettlementDate(LocalDate.parse("2024-01-01"))
                        .settledGrossAmount(0L)
                        .build()
                )
                .previousHighWatermark(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .updated(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .build()

        assertThat(fundingEventListResponse.token())
            .isEqualTo("b68b7424-aa69-4cbc-a946-30d90181b621")
        assertThat(fundingEventListResponse.collectionResourceType())
            .isEqualTo(FundingEventListResponse.CollectionResourceType.PAYMENT)
        assertThat(fundingEventListResponse.collectionTokens())
            .containsExactly("b68b7424-aa69-4cbc-a946-30d90181b621")
        assertThat(fundingEventListResponse.created())
            .isEqualTo(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        assertThat(fundingEventListResponse.highWatermark())
            .isEqualTo(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        assertThat(fundingEventListResponse.networkSettlementSummary())
            .containsExactly(
                FundingEventListResponse.FundingEventSettlement.builder()
                    .networkSettlementDate(LocalDate.parse("2024-01-01"))
                    .settledGrossAmount(0L)
                    .build()
            )
        assertThat(fundingEventListResponse.previousHighWatermark())
            .isEqualTo(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        assertThat(fundingEventListResponse.updated())
            .isEqualTo(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fundingEventListResponse =
            FundingEventListResponse.builder()
                .token("b68b7424-aa69-4cbc-a946-30d90181b621")
                .collectionResourceType(FundingEventListResponse.CollectionResourceType.PAYMENT)
                .addCollectionToken("b68b7424-aa69-4cbc-a946-30d90181b621")
                .created(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .highWatermark(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .addNetworkSettlementSummary(
                    FundingEventListResponse.FundingEventSettlement.builder()
                        .networkSettlementDate(LocalDate.parse("2024-01-01"))
                        .settledGrossAmount(0L)
                        .build()
                )
                .previousHighWatermark(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .updated(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .build()

        val roundtrippedFundingEventListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fundingEventListResponse),
                jacksonTypeRef<FundingEventListResponse>(),
            )

        assertThat(roundtrippedFundingEventListResponse).isEqualTo(fundingEventListResponse)
    }
}
