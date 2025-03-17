// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceTest {

    @Test
    fun createBalance() {
        val balance =
            Balance.builder()
                .availableAmount(0L)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .financialAccountToken("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .financialAccountType(Balance.FinancialAccountType.ISSUING)
                .lastTransactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .lastTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pendingAmount(0L)
                .totalAmount(0L)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(balance).isNotNull
        assertThat(balance.availableAmount()).isEqualTo(0L)
        assertThat(balance.created()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balance.currency()).isEqualTo("currency")
        assertThat(balance.financialAccountToken())
            .isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(balance.financialAccountType()).isEqualTo(Balance.FinancialAccountType.ISSUING)
        assertThat(balance.lastTransactionEventToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(balance.lastTransactionToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(balance.pendingAmount()).isEqualTo(0L)
        assertThat(balance.totalAmount()).isEqualTo(0L)
        assertThat(balance.updated()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
