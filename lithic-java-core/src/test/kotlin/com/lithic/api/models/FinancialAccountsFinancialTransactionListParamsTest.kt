package com.lithic.api.models

import com.lithic.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FinancialAccountsFinancialTransactionListParamsTest {

    @Test
    fun createFinancialAccountsFinancialTransactionListParams() {
        FinancialAccountsFinancialTransactionListParams.builder()
            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .category(FinancialAccountsFinancialTransactionListParams.Category.ACH)
            .status(FinancialAccountsFinancialTransactionListParams.Status.DECLINED)
            .result(FinancialAccountsFinancialTransactionListParams.Result.APPROVED)
            .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .startingAfter("string")
            .endingBefore("string")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            FinancialAccountsFinancialTransactionListParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .category(FinancialAccountsFinancialTransactionListParams.Category.ACH)
                .status(FinancialAccountsFinancialTransactionListParams.Status.DECLINED)
                .result(FinancialAccountsFinancialTransactionListParams.Result.APPROVED)
                .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingAfter("string")
                .endingBefore("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put(
            "category",
            listOf(FinancialAccountsFinancialTransactionListParams.Category.ACH.toString())
        )
        expected.put(
            "status",
            listOf(FinancialAccountsFinancialTransactionListParams.Status.DECLINED.toString())
        )
        expected.put(
            "result",
            listOf(FinancialAccountsFinancialTransactionListParams.Result.APPROVED.toString())
        )
        expected.put("begin", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("end", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("starting_after", listOf("string"))
        expected.put("ending_before", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            FinancialAccountsFinancialTransactionListParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params =
            FinancialAccountsFinancialTransactionListParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "financialAccountToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
