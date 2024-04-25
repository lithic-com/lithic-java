// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BalanceListResponseTest {

    @Test
    fun createBalanceListResponse() {
        val balanceListResponse =
            BalanceListResponse.builder()
                .token("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .availableAmount(123L)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("string")
                .lastTransactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .lastTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pendingAmount(123L)
                .totalAmount(123L)
                .type(BalanceListResponse.Type.ISSUING)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(balanceListResponse).isNotNull
        assertThat(balanceListResponse.token()).isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(balanceListResponse.availableAmount()).isEqualTo(123L)
        assertThat(balanceListResponse.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceListResponse.currency()).isEqualTo("string")
        assertThat(balanceListResponse.lastTransactionEventToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(balanceListResponse.lastTransactionToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(balanceListResponse.pendingAmount()).isEqualTo(123L)
        assertThat(balanceListResponse.totalAmount()).isEqualTo(123L)
        assertThat(balanceListResponse.type()).isEqualTo(BalanceListResponse.Type.ISSUING)
        assertThat(balanceListResponse.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
