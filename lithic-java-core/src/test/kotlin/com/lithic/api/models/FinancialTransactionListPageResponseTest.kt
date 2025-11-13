// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FinancialTransactionListPageResponseTest {

    @Test
    fun create() {
        val financialTransactionListPageResponse =
            FinancialTransactionListPageResponse.builder()
                .addData(
                    FinancialTransaction.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .category(FinancialTransaction.Category.ACH)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .descriptor("descriptor")
                        .addEvent(
                            FinancialEvent.builder()
                                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .amount(0L)
                                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .result(FinancialEvent.Result.APPROVED)
                                .type(FinancialEvent.FinancialEventType.ACH_ORIGINATION_CANCELLED)
                                .build()
                        )
                        .pendingAmount(0L)
                        .result(FinancialTransaction.Result.APPROVED)
                        .settledAmount(0L)
                        .status(FinancialTransaction.Status.DECLINED)
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .hasMore(true)
                .build()

        assertThat(financialTransactionListPageResponse.data())
            .containsExactly(
                FinancialTransaction.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .category(FinancialTransaction.Category.ACH)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency("currency")
                    .descriptor("descriptor")
                    .addEvent(
                        FinancialEvent.builder()
                            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .amount(0L)
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .result(FinancialEvent.Result.APPROVED)
                            .type(FinancialEvent.FinancialEventType.ACH_ORIGINATION_CANCELLED)
                            .build()
                    )
                    .pendingAmount(0L)
                    .result(FinancialTransaction.Result.APPROVED)
                    .settledAmount(0L)
                    .status(FinancialTransaction.Status.DECLINED)
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(financialTransactionListPageResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val financialTransactionListPageResponse =
            FinancialTransactionListPageResponse.builder()
                .addData(
                    FinancialTransaction.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .category(FinancialTransaction.Category.ACH)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .descriptor("descriptor")
                        .addEvent(
                            FinancialEvent.builder()
                                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .amount(0L)
                                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .result(FinancialEvent.Result.APPROVED)
                                .type(FinancialEvent.FinancialEventType.ACH_ORIGINATION_CANCELLED)
                                .build()
                        )
                        .pendingAmount(0L)
                        .result(FinancialTransaction.Result.APPROVED)
                        .settledAmount(0L)
                        .status(FinancialTransaction.Status.DECLINED)
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .hasMore(true)
                .build()

        val roundtrippedFinancialTransactionListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(financialTransactionListPageResponse),
                jacksonTypeRef<FinancialTransactionListPageResponse>(),
            )

        assertThat(roundtrippedFinancialTransactionListPageResponse)
            .isEqualTo(financialTransactionListPageResponse)
    }
}
