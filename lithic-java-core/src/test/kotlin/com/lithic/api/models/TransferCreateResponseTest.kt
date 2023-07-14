package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransferCreateResponseTest {

    @Test
    fun createTransferCreateResponse() {
        val transferCreateResponse =
            TransferCreateResponse.builder()
                .data(
                    Transfer.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .category(Transfer.Category.TRANSFER)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("string")
                        .descriptor("string")
                        .events(
                            listOf(
                                Transfer.FinancialEvent.builder()
                                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .amount(123L)
                                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .result(Transfer.FinancialEvent.Result.APPROVED)
                                    .type(Transfer.FinancialEvent.Type.ACH_INSUFFICIENT_FUNDS)
                                    .build()
                            )
                        )
                        .fromBalance(
                            listOf(
                                Balance.builder()
                                    .token("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                                    .availableAmount(123L)
                                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .currency("string")
                                    .lastTransactionEventToken(
                                        "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"
                                    )
                                    .lastTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .pendingAmount(123L)
                                    .totalAmount(123L)
                                    .type(Balance.Type.ISSUING)
                                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                        )
                        .pendingAmount(123L)
                        .result(Transfer.Result.APPROVED)
                        .settledAmount(123L)
                        .status(Transfer.Status.DECLINED)
                        .toBalance(
                            listOf(
                                Balance.builder()
                                    .token("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                                    .availableAmount(123L)
                                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .currency("string")
                                    .lastTransactionEventToken(
                                        "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"
                                    )
                                    .lastTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .pendingAmount(123L)
                                    .totalAmount(123L)
                                    .type(Balance.Type.ISSUING)
                                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                        )
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()
        assertThat(transferCreateResponse).isNotNull
        assertThat(transferCreateResponse.data())
            .contains(
                Transfer.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .category(Transfer.Category.TRANSFER)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency("string")
                    .descriptor("string")
                    .events(
                        listOf(
                            Transfer.FinancialEvent.builder()
                                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .amount(123L)
                                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .result(Transfer.FinancialEvent.Result.APPROVED)
                                .type(Transfer.FinancialEvent.Type.ACH_INSUFFICIENT_FUNDS)
                                .build()
                        )
                    )
                    .fromBalance(
                        listOf(
                            Balance.builder()
                                .token("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                                .availableAmount(123L)
                                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .currency("string")
                                .lastTransactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .lastTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .pendingAmount(123L)
                                .totalAmount(123L)
                                .type(Balance.Type.ISSUING)
                                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                    )
                    .pendingAmount(123L)
                    .result(Transfer.Result.APPROVED)
                    .settledAmount(123L)
                    .status(Transfer.Status.DECLINED)
                    .toBalance(
                        listOf(
                            Balance.builder()
                                .token("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                                .availableAmount(123L)
                                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .currency("string")
                                .lastTransactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .lastTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .pendingAmount(123L)
                                .totalAmount(123L)
                                .type(Balance.Type.ISSUING)
                                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                    )
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }
}
