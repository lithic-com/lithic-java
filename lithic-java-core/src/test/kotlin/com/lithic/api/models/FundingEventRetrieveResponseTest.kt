// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FundingEventRetrieveResponseTest {

    @Test
    fun create() {
        val fundingEventRetrieveResponse =
            FundingEventRetrieveResponse.builder()
                .token("b68b7424-aa69-4cbc-a946-30d90181b621")
                .collectionResourceType(FundingEventRetrieveResponse.CollectionResourceType.PAYMENT)
                .addCollectionToken("b68b7424-aa69-4cbc-a946-30d90181b621")
                .created(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .highWatermark(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .previousHighWatermark(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .addSettlementBreakdown(
                    FundingEventRetrieveResponse.FundingEventSettlement.builder()
                        .amount(0L)
                        .settlementDate(LocalDate.parse("2024-01-01"))
                        .build()
                )
                .updated(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .build()

        assertThat(fundingEventRetrieveResponse.token())
            .isEqualTo("b68b7424-aa69-4cbc-a946-30d90181b621")
        assertThat(fundingEventRetrieveResponse.collectionResourceType())
            .isEqualTo(FundingEventRetrieveResponse.CollectionResourceType.PAYMENT)
        assertThat(fundingEventRetrieveResponse.collectionTokens())
            .containsExactly("b68b7424-aa69-4cbc-a946-30d90181b621")
        assertThat(fundingEventRetrieveResponse.created())
            .isEqualTo(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        assertThat(fundingEventRetrieveResponse.highWatermark())
            .isEqualTo(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        assertThat(fundingEventRetrieveResponse.previousHighWatermark())
            .isEqualTo(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        assertThat(fundingEventRetrieveResponse.settlementBreakdowns())
            .containsExactly(
                FundingEventRetrieveResponse.FundingEventSettlement.builder()
                    .amount(0L)
                    .settlementDate(LocalDate.parse("2024-01-01"))
                    .build()
            )
        assertThat(fundingEventRetrieveResponse.updated())
            .isEqualTo(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fundingEventRetrieveResponse =
            FundingEventRetrieveResponse.builder()
                .token("b68b7424-aa69-4cbc-a946-30d90181b621")
                .collectionResourceType(FundingEventRetrieveResponse.CollectionResourceType.PAYMENT)
                .addCollectionToken("b68b7424-aa69-4cbc-a946-30d90181b621")
                .created(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .highWatermark(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .previousHighWatermark(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .addSettlementBreakdown(
                    FundingEventRetrieveResponse.FundingEventSettlement.builder()
                        .amount(0L)
                        .settlementDate(LocalDate.parse("2024-01-01"))
                        .build()
                )
                .updated(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .build()

        val roundtrippedFundingEventRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fundingEventRetrieveResponse),
                jacksonTypeRef<FundingEventRetrieveResponse>(),
            )

        assertThat(roundtrippedFundingEventRetrieveResponse).isEqualTo(fundingEventRetrieveResponse)
    }
}
