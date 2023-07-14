package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FinancialTransactionTest {

    @Test
    fun createFinancialTransaction() {
        val financialTransaction =
            FinancialTransaction.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .category(FinancialTransaction.Category.CARD)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("string")
                .descriptor("string")
                .events(
                    listOf(
                        FinancialTransaction.FinancialEvent.builder()
                            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .amount(123L)
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .result(FinancialTransaction.FinancialEvent.Result.APPROVED)
                            .type(FinancialTransaction.FinancialEvent.Type.ACH_INSUFFICIENT_FUNDS)
                            .build()
                    )
                )
                .pendingAmount(123L)
                .result(FinancialTransaction.Result.APPROVED)
                .settledAmount(123L)
                .status(FinancialTransaction.Status.DECLINED)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(financialTransaction).isNotNull
        assertThat(financialTransaction.token()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(financialTransaction.category()).contains(FinancialTransaction.Category.CARD)
        assertThat(financialTransaction.created())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(financialTransaction.currency()).contains("string")
        assertThat(financialTransaction.descriptor()).contains("string")
        assertThat(financialTransaction.events().get())
            .containsExactly(
                FinancialTransaction.FinancialEvent.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(123L)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .result(FinancialTransaction.FinancialEvent.Result.APPROVED)
                    .type(FinancialTransaction.FinancialEvent.Type.ACH_INSUFFICIENT_FUNDS)
                    .build()
            )
        assertThat(financialTransaction.pendingAmount()).contains(123L)
        assertThat(financialTransaction.result()).contains(FinancialTransaction.Result.APPROVED)
        assertThat(financialTransaction.settledAmount()).contains(123L)
        assertThat(financialTransaction.status()).contains(FinancialTransaction.Status.DECLINED)
        assertThat(financialTransaction.updated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
