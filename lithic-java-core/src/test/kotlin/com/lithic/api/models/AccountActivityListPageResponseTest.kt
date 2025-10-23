// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountActivityListPageResponseTest {

    @Test
    fun create() {
        val accountActivityListPageResponse =
            AccountActivityListPageResponse.builder()
                .addData(
                    AccountActivityListResponse.FinancialTransaction.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .category(
                            AccountActivityListResponse.FinancialTransaction.TransactionCategory.ACH
                        )
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("USD")
                        .descriptor("descriptor")
                        .addEvent(
                            AccountActivityListResponse.FinancialTransaction.FinancialEvent
                                .builder()
                                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .amount(0L)
                                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .result(
                                    AccountActivityListResponse.FinancialTransaction.FinancialEvent
                                        .Result
                                        .APPROVED
                                )
                                .type(
                                    AccountActivityListResponse.FinancialTransaction.FinancialEvent
                                        .FinancialEventType
                                        .ACH_ORIGINATION_CANCELLED
                                )
                                .build()
                        )
                        .family(AccountActivityListResponse.FinancialTransaction.Family.INTERNAL)
                        .financialAccountToken("0cc87075-57cf-4607-8722-f42e2cb2c0cd")
                        .pendingAmount(500L)
                        .result(
                            AccountActivityListResponse.FinancialTransaction.TransactionResult
                                .APPROVED
                        )
                        .settledAmount(200L)
                        .status(
                            AccountActivityListResponse.FinancialTransaction.TransactionStatus
                                .PENDING
                        )
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .hasMore(true)
                .build()

        assertThat(accountActivityListPageResponse.data().getOrNull())
            .containsExactly(
                AccountActivityListResponse.ofInternal(
                    AccountActivityListResponse.FinancialTransaction.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .category(
                            AccountActivityListResponse.FinancialTransaction.TransactionCategory.ACH
                        )
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("USD")
                        .descriptor("descriptor")
                        .addEvent(
                            AccountActivityListResponse.FinancialTransaction.FinancialEvent
                                .builder()
                                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .amount(0L)
                                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .result(
                                    AccountActivityListResponse.FinancialTransaction.FinancialEvent
                                        .Result
                                        .APPROVED
                                )
                                .type(
                                    AccountActivityListResponse.FinancialTransaction.FinancialEvent
                                        .FinancialEventType
                                        .ACH_ORIGINATION_CANCELLED
                                )
                                .build()
                        )
                        .family(AccountActivityListResponse.FinancialTransaction.Family.INTERNAL)
                        .financialAccountToken("0cc87075-57cf-4607-8722-f42e2cb2c0cd")
                        .pendingAmount(500L)
                        .result(
                            AccountActivityListResponse.FinancialTransaction.TransactionResult
                                .APPROVED
                        )
                        .settledAmount(200L)
                        .status(
                            AccountActivityListResponse.FinancialTransaction.TransactionStatus
                                .PENDING
                        )
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
            )
        assertThat(accountActivityListPageResponse.hasMore()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountActivityListPageResponse =
            AccountActivityListPageResponse.builder()
                .addData(
                    AccountActivityListResponse.FinancialTransaction.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .category(
                            AccountActivityListResponse.FinancialTransaction.TransactionCategory.ACH
                        )
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("USD")
                        .descriptor("descriptor")
                        .addEvent(
                            AccountActivityListResponse.FinancialTransaction.FinancialEvent
                                .builder()
                                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .amount(0L)
                                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .result(
                                    AccountActivityListResponse.FinancialTransaction.FinancialEvent
                                        .Result
                                        .APPROVED
                                )
                                .type(
                                    AccountActivityListResponse.FinancialTransaction.FinancialEvent
                                        .FinancialEventType
                                        .ACH_ORIGINATION_CANCELLED
                                )
                                .build()
                        )
                        .family(AccountActivityListResponse.FinancialTransaction.Family.INTERNAL)
                        .financialAccountToken("0cc87075-57cf-4607-8722-f42e2cb2c0cd")
                        .pendingAmount(500L)
                        .result(
                            AccountActivityListResponse.FinancialTransaction.TransactionResult
                                .APPROVED
                        )
                        .settledAmount(200L)
                        .status(
                            AccountActivityListResponse.FinancialTransaction.TransactionStatus
                                .PENDING
                        )
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .hasMore(true)
                .build()

        val roundtrippedAccountActivityListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountActivityListPageResponse),
                jacksonTypeRef<AccountActivityListPageResponse>(),
            )

        assertThat(roundtrippedAccountActivityListPageResponse)
            .isEqualTo(accountActivityListPageResponse)
    }
}
