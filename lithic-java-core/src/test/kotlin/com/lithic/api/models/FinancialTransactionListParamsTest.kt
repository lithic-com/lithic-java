// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FinancialTransactionListParamsTest {

    @Test
    fun createFinancialTransactionListParams() {
        FinancialTransactionListParams.builder()
            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .category(FinancialTransactionListParams.Category.ACH)
            .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .endingBefore("ending_before")
            .result(FinancialTransactionListParams.Result.APPROVED)
            .startingAfter("starting_after")
            .status(FinancialTransactionListParams.Status.DECLINED)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            FinancialTransactionListParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .category(FinancialTransactionListParams.Category.ACH)
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endingBefore("ending_before")
                .result(FinancialTransactionListParams.Result.APPROVED)
                .startingAfter("starting_after")
                .status(FinancialTransactionListParams.Status.DECLINED)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("begin", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("category", listOf(FinancialTransactionListParams.Category.ACH.toString()))
        expected.put("end", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("ending_before", listOf("ending_before"))
        expected.put("result", listOf(FinancialTransactionListParams.Result.APPROVED.toString()))
        expected.put("starting_after", listOf("starting_after"))
        expected.put("status", listOf(FinancialTransactionListParams.Status.DECLINED.toString()))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            FinancialTransactionListParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params =
            FinancialTransactionListParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "financialAccountToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
