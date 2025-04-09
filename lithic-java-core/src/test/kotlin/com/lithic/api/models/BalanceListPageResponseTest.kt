// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceListPageResponseTest {

    @Test
    fun create() {
        val balanceListPageResponse =
            BalanceListPageResponse.builder()
                .addData(
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
                .hasMore(true)
                .build()

        assertThat(balanceListPageResponse.data())
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
        assertThat(balanceListPageResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val balanceListPageResponse =
            BalanceListPageResponse.builder()
                .addData(
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
                .hasMore(true)
                .build()

        val roundtrippedBalanceListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(balanceListPageResponse),
                jacksonTypeRef<BalanceListPageResponse>(),
            )

        assertThat(roundtrippedBalanceListPageResponse).isEqualTo(balanceListPageResponse)
    }
}
