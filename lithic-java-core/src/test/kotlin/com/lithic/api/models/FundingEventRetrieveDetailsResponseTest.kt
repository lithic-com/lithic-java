// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FundingEventRetrieveDetailsResponseTest {

    @Test
    fun create() {
        val fundingEventRetrieveDetailsResponse =
            FundingEventRetrieveDetailsResponse.builder()
                .token("b68b7424-aa69-4cbc-a946-30d90181b621")
                .settlementDetailsUrl("https://example.com")
                .settlementSummaryUrl("https://example.com")
                .build()

        assertThat(fundingEventRetrieveDetailsResponse.token())
            .isEqualTo("b68b7424-aa69-4cbc-a946-30d90181b621")
        assertThat(fundingEventRetrieveDetailsResponse.settlementDetailsUrl())
            .isEqualTo("https://example.com")
        assertThat(fundingEventRetrieveDetailsResponse.settlementSummaryUrl())
            .isEqualTo("https://example.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fundingEventRetrieveDetailsResponse =
            FundingEventRetrieveDetailsResponse.builder()
                .token("b68b7424-aa69-4cbc-a946-30d90181b621")
                .settlementDetailsUrl("https://example.com")
                .settlementSummaryUrl("https://example.com")
                .build()

        val roundtrippedFundingEventRetrieveDetailsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fundingEventRetrieveDetailsResponse),
                jacksonTypeRef<FundingEventRetrieveDetailsResponse>(),
            )

        assertThat(roundtrippedFundingEventRetrieveDetailsResponse)
            .isEqualTo(fundingEventRetrieveDetailsResponse)
    }
}
