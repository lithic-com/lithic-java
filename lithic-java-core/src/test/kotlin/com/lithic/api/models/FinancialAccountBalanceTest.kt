// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FinancialAccountBalanceTest {

    @Test
    fun create() {
        val financialAccountBalance =
            FinancialAccountBalance.builder()
                .token("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .availableAmount(0L)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .lastTransactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .lastTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pendingAmount(0L)
                .totalAmount(0L)
                .type(FinancialAccountBalance.Type.ISSUING)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(financialAccountBalance.token())
            .isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(financialAccountBalance.availableAmount()).isEqualTo(0L)
        assertThat(financialAccountBalance.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(financialAccountBalance.currency()).isEqualTo("currency")
        assertThat(financialAccountBalance.lastTransactionEventToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(financialAccountBalance.lastTransactionToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(financialAccountBalance.pendingAmount()).isEqualTo(0L)
        assertThat(financialAccountBalance.totalAmount()).isEqualTo(0L)
        assertThat(financialAccountBalance.type()).isEqualTo(FinancialAccountBalance.Type.ISSUING)
        assertThat(financialAccountBalance.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val financialAccountBalance =
            FinancialAccountBalance.builder()
                .token("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .availableAmount(0L)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .lastTransactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .lastTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pendingAmount(0L)
                .totalAmount(0L)
                .type(FinancialAccountBalance.Type.ISSUING)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedFinancialAccountBalance =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(financialAccountBalance),
                jacksonTypeRef<FinancialAccountBalance>(),
            )

        assertThat(roundtrippedFinancialAccountBalance).isEqualTo(financialAccountBalance)
    }
}
