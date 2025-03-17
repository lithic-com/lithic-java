// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AggregateBalanceListParamsTest {

    @Test
    fun create() {
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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("financial_account_type", "ISSUING").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AggregateBalanceListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
