// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionMonitoringCaseListTransactionsPageResponseTest {

    @Test
    fun create() {
        val transactionMonitoringCaseListTransactionsPageResponse =
            TransactionMonitoringCaseListTransactionsPageResponse.builder()
                .addData(
                    CaseTransaction.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .transactionCreatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .hasMore(true)
                .build()

        assertThat(transactionMonitoringCaseListTransactionsPageResponse.data())
            .containsExactly(
                CaseTransaction.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .transactionCreatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(transactionMonitoringCaseListTransactionsPageResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionMonitoringCaseListTransactionsPageResponse =
            TransactionMonitoringCaseListTransactionsPageResponse.builder()
                .addData(
                    CaseTransaction.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .transactionCreatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .hasMore(true)
                .build()

        val roundtrippedTransactionMonitoringCaseListTransactionsPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    transactionMonitoringCaseListTransactionsPageResponse
                ),
                jacksonTypeRef<TransactionMonitoringCaseListTransactionsPageResponse>(),
            )

        assertThat(roundtrippedTransactionMonitoringCaseListTransactionsPageResponse)
            .isEqualTo(transactionMonitoringCaseListTransactionsPageResponse)
    }
}
