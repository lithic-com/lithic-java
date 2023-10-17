// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AggregateBalanceListResponseTest {

    @Test
    fun createAggregateBalanceListResponse() {
        val aggregateBalanceListResponse =
            AggregateBalanceListResponse.builder()
                .availableAmount(123L)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("string")
                .lastCardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .lastTransactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .lastTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pendingAmount(123L)
                .totalAmount(123L)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(aggregateBalanceListResponse).isNotNull
        assertThat(aggregateBalanceListResponse.availableAmount()).isEqualTo(123L)
        assertThat(aggregateBalanceListResponse.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(aggregateBalanceListResponse.currency()).isEqualTo("string")
        assertThat(aggregateBalanceListResponse.lastCardToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(aggregateBalanceListResponse.lastTransactionEventToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(aggregateBalanceListResponse.lastTransactionToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(aggregateBalanceListResponse.pendingAmount()).isEqualTo(123L)
        assertThat(aggregateBalanceListResponse.totalAmount()).isEqualTo(123L)
        assertThat(aggregateBalanceListResponse.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
