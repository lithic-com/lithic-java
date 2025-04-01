// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AggregateBalanceListResponseTest {

    @Test
    fun create() {
        val aggregateBalanceListResponse =
            AggregateBalanceListResponse.builder()
                .availableAmount(0L)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .lastCardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .lastTransactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .lastTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pendingAmount(0L)
                .totalAmount(0L)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(aggregateBalanceListResponse.availableAmount()).isEqualTo(0L)
        assertThat(aggregateBalanceListResponse.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(aggregateBalanceListResponse.currency()).isEqualTo("currency")
        assertThat(aggregateBalanceListResponse.lastCardToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(aggregateBalanceListResponse.lastTransactionEventToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(aggregateBalanceListResponse.lastTransactionToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(aggregateBalanceListResponse.pendingAmount()).isEqualTo(0L)
        assertThat(aggregateBalanceListResponse.totalAmount()).isEqualTo(0L)
        assertThat(aggregateBalanceListResponse.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val aggregateBalanceListResponse =
            AggregateBalanceListResponse.builder()
                .availableAmount(0L)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .lastCardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .lastTransactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .lastTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pendingAmount(0L)
                .totalAmount(0L)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedAggregateBalanceListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(aggregateBalanceListResponse),
                jacksonTypeRef<AggregateBalanceListResponse>(),
            )

        assertThat(roundtrippedAggregateBalanceListResponse).isEqualTo(aggregateBalanceListResponse)
    }
}
