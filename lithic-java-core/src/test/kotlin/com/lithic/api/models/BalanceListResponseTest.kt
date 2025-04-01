// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceListResponseTest {

    @Test
    fun create() {
        val balanceListResponse =
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

        assertThat(balanceListResponse.token()).isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(balanceListResponse.availableAmount()).isEqualTo(0L)
        assertThat(balanceListResponse.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceListResponse.currency()).isEqualTo("currency")
        assertThat(balanceListResponse.lastTransactionEventToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(balanceListResponse.lastTransactionToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(balanceListResponse.pendingAmount()).isEqualTo(0L)
        assertThat(balanceListResponse.totalAmount()).isEqualTo(0L)
        assertThat(balanceListResponse.type()).isEqualTo(BalanceListResponse.Type.ISSUING)
        assertThat(balanceListResponse.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val balanceListResponse =
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

        val roundtrippedBalanceListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(balanceListResponse),
                jacksonTypeRef<BalanceListResponse>(),
            )

        assertThat(roundtrippedBalanceListResponse).isEqualTo(balanceListResponse)
    }
}
