// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BalanceListParamsTest {

    @Test
    fun createBalanceListParams() {
        BalanceListParams.builder()
            .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .balanceDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .financialAccountType(BalanceListParams.FinancialAccountType.ISSUING)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            BalanceListParams.builder()
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .balanceDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .financialAccountType(BalanceListParams.FinancialAccountType.ISSUING)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("account_token", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        expected.put("balance_date", listOf("2019-12-27T18:11:19.117Z"))
        expected.put(
            "financial_account_type",
            listOf(BalanceListParams.FinancialAccountType.ISSUING.toString())
        )
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = BalanceListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
