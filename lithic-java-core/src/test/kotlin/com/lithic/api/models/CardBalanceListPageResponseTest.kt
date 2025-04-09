// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardBalanceListPageResponseTest {

    @Test
    fun create() {
        val cardBalanceListPageResponse =
            CardBalanceListPageResponse.builder()
                .addData(
                    BalanceListResponse.builder()
                        .token("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .availableAmount(0L)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .lastTransactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .lastTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .pendingAmount(0L)
                        .totalAmount(0L)
                        .type(BalanceListResponse.Type.ISSUING)
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .hasMore(true)
                .build()

        assertThat(cardBalanceListPageResponse.data())
            .containsExactly(
                BalanceListResponse.builder()
                    .token("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .availableAmount(0L)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency("currency")
                    .lastTransactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .lastTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .pendingAmount(0L)
                    .totalAmount(0L)
                    .type(BalanceListResponse.Type.ISSUING)
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(cardBalanceListPageResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardBalanceListPageResponse =
            CardBalanceListPageResponse.builder()
                .addData(
                    BalanceListResponse.builder()
                        .token("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .availableAmount(0L)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .lastTransactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .lastTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .pendingAmount(0L)
                        .totalAmount(0L)
                        .type(BalanceListResponse.Type.ISSUING)
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .hasMore(true)
                .build()

        val roundtrippedCardBalanceListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardBalanceListPageResponse),
                jacksonTypeRef<CardBalanceListPageResponse>(),
            )

        assertThat(roundtrippedCardBalanceListPageResponse).isEqualTo(cardBalanceListPageResponse)
    }
}
