// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionCategoryBalancesTest {

    @Test
    fun create() {
        val transactionCategoryBalances =
            TransactionCategoryBalances.builder()
                .balanceTransfers(
                    CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build()
                )
                .cashAdvances(
                    CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build()
                )
                .purchases(CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build())
                .build()

        assertThat(transactionCategoryBalances.balanceTransfers())
            .isEqualTo(CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build())
        assertThat(transactionCategoryBalances.cashAdvances())
            .isEqualTo(CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build())
        assertThat(transactionCategoryBalances.purchases())
            .isEqualTo(CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionCategoryBalances =
            TransactionCategoryBalances.builder()
                .balanceTransfers(
                    CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build()
                )
                .cashAdvances(
                    CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build()
                )
                .purchases(CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build())
                .build()

        val roundtrippedTransactionCategoryBalances =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionCategoryBalances),
                jacksonTypeRef<TransactionCategoryBalances>(),
            )

        assertThat(roundtrippedTransactionCategoryBalances).isEqualTo(transactionCategoryBalances)
    }
}
