// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransferTest {

    @Test
    fun createTransfer() {
        val transfer =
            Transfer.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .category(Transfer.Category.TRANSFER)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .descriptor("descriptor")
                .events(
                    listOf(
                        Transfer.FinancialEvent.builder()
                            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .amount(0L)
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .result(Transfer.FinancialEvent.Result.APPROVED)
                            .type(
                                Transfer.FinancialEvent.FinancialEventType.ACH_ORIGINATION_CANCELLED
                            )
                            .build()
                    )
                )
                .fromBalance(
                    listOf(
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
                    )
                )
                .pendingAmount(0L)
                .result(Transfer.Result.APPROVED)
                .settledAmount(0L)
                .status(Transfer.Status.DECLINED)
                .toBalance(
                    listOf(
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
                    )
                )
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(transfer).isNotNull
        assertThat(transfer.token()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(transfer.category()).contains(Transfer.Category.TRANSFER)
        assertThat(transfer.created()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transfer.currency()).contains("currency")
        assertThat(transfer.descriptor()).contains("descriptor")
        assertThat(transfer.events().get())
            .containsExactly(
                Transfer.FinancialEvent.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(0L)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .result(Transfer.FinancialEvent.Result.APPROVED)
                    .type(Transfer.FinancialEvent.FinancialEventType.ACH_ORIGINATION_CANCELLED)
                    .build()
            )
        assertThat(transfer.fromBalance().get())
            .containsExactly(
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
            )
        assertThat(transfer.pendingAmount()).contains(0L)
        assertThat(transfer.result()).contains(Transfer.Result.APPROVED)
        assertThat(transfer.settledAmount()).contains(0L)
        assertThat(transfer.status()).contains(Transfer.Status.DECLINED)
        assertThat(transfer.toBalance().get())
            .containsExactly(
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
            )
        assertThat(transfer.updated()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
