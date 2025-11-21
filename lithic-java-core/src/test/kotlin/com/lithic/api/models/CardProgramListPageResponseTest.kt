// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardProgramListPageResponseTest {

    @Test
    fun create() {
        val cardProgramListPageResponse =
            CardProgramListPageResponse.builder()
                .addData(
                    CardProgram.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .accountLevelManagementEnabled(true)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("My Prepaid Program")
                        .panRangeEnd("52304803")
                        .panRangeStart("52304803")
                        .cardholderCurrency("USD")
                        .addSettlementCurrency("USD")
                        .addSettlementCurrency("CAD")
                        .build()
                )
                .hasMore(true)
                .build()

        assertThat(cardProgramListPageResponse.data())
            .containsExactly(
                CardProgram.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountLevelManagementEnabled(true)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("My Prepaid Program")
                    .panRangeEnd("52304803")
                    .panRangeStart("52304803")
                    .cardholderCurrency("USD")
                    .addSettlementCurrency("USD")
                    .addSettlementCurrency("CAD")
                    .build()
            )
        assertThat(cardProgramListPageResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardProgramListPageResponse =
            CardProgramListPageResponse.builder()
                .addData(
                    CardProgram.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .accountLevelManagementEnabled(true)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("My Prepaid Program")
                        .panRangeEnd("52304803")
                        .panRangeStart("52304803")
                        .cardholderCurrency("USD")
                        .addSettlementCurrency("USD")
                        .addSettlementCurrency("CAD")
                        .build()
                )
                .hasMore(true)
                .build()

        val roundtrippedCardProgramListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardProgramListPageResponse),
                jacksonTypeRef<CardProgramListPageResponse>(),
            )

        assertThat(roundtrippedCardProgramListPageResponse).isEqualTo(cardProgramListPageResponse)
    }
}
