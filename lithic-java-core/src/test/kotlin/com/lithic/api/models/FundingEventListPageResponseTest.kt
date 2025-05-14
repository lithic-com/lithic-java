// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FundingEventListPageResponseTest {

    @Test
    fun create() {
        val fundingEventListPageResponse =
            FundingEventListPageResponse.builder()
                .addData(
                    FundingEventListResponse.builder()
                        .token("b68b7424-aa69-4cbc-a946-30d90181b621")
                        .collectionResourceType(
                            FundingEventListResponse.CollectionResourceType.PAYMENT
                        )
                        .addCollectionToken("b68b7424-aa69-4cbc-a946-30d90181b621")
                        .created(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .highWatermark(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .previousHighWatermark(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .addSettlementBreakdown(
                            FundingEventListResponse.FundingEventSettlement.builder()
                                .amount(0L)
                                .settlementDate(LocalDate.parse("2024-01-01"))
                                .build()
                        )
                        .updated(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .build()
                )
                .hasMore(true)
                .build()

        assertThat(fundingEventListPageResponse.data())
            .containsExactly(
                FundingEventListResponse.builder()
                    .token("b68b7424-aa69-4cbc-a946-30d90181b621")
                    .collectionResourceType(FundingEventListResponse.CollectionResourceType.PAYMENT)
                    .addCollectionToken("b68b7424-aa69-4cbc-a946-30d90181b621")
                    .created(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                    .highWatermark(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                    .previousHighWatermark(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                    .addSettlementBreakdown(
                        FundingEventListResponse.FundingEventSettlement.builder()
                            .amount(0L)
                            .settlementDate(LocalDate.parse("2024-01-01"))
                            .build()
                    )
                    .updated(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                    .build()
            )
        assertThat(fundingEventListPageResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fundingEventListPageResponse =
            FundingEventListPageResponse.builder()
                .addData(
                    FundingEventListResponse.builder()
                        .token("b68b7424-aa69-4cbc-a946-30d90181b621")
                        .collectionResourceType(
                            FundingEventListResponse.CollectionResourceType.PAYMENT
                        )
                        .addCollectionToken("b68b7424-aa69-4cbc-a946-30d90181b621")
                        .created(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .highWatermark(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .previousHighWatermark(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .addSettlementBreakdown(
                            FundingEventListResponse.FundingEventSettlement.builder()
                                .amount(0L)
                                .settlementDate(LocalDate.parse("2024-01-01"))
                                .build()
                        )
                        .updated(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .build()
                )
                .hasMore(true)
                .build()

        val roundtrippedFundingEventListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fundingEventListPageResponse),
                jacksonTypeRef<FundingEventListPageResponse>(),
            )

        assertThat(roundtrippedFundingEventListPageResponse).isEqualTo(fundingEventListPageResponse)
    }
}
