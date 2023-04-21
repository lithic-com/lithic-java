package com.lithic.api.models

import com.lithic.api.models.*
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
    fun getQueryParams() {
        val params =
            AggregateBalanceListParams.builder()
                .financialAccountType(AggregateBalanceListParams.FinancialAccountType.ISSUING)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put(
            "financial_account_type",
            listOf(AggregateBalanceListParams.FinancialAccountType.ISSUING.toString())
        )
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = AggregateBalanceListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
