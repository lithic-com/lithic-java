// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AggregateBalanceListParamsTest {

    @Test
    fun createAggregateBalanceListParams() {
        AggregateBalanceListParams.builder()
            .financialAccountType(AggregateBalanceListParams.FinancialAccountType.ISSUING)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AggregateBalanceListParams.builder()
                .financialAccountType(AggregateBalanceListParams.FinancialAccountType.ISSUING)
                .build()
        val expected = QueryParams.builder()
        expected.put(
            "financial_account_type",
            AggregateBalanceListParams.FinancialAccountType.ISSUING.toString()
        )
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AggregateBalanceListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
