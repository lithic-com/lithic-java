// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FinancialAccountStatementListParamsTest {

    @Test
    fun createFinancialAccountStatementListParams() {
        FinancialAccountStatementListParams.builder()
            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .begin(LocalDate.parse("2019-12-27"))
            .end(LocalDate.parse("2019-12-27"))
            .endingBefore("ending_before")
            .includeInitialStatements(true)
            .pageSize(100L)
            .startingAfter("starting_after")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            FinancialAccountStatementListParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .begin(LocalDate.parse("2019-12-27"))
                .end(LocalDate.parse("2019-12-27"))
                .endingBefore("ending_before")
                .includeInitialStatements(true)
                .pageSize(100L)
                .startingAfter("starting_after")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("begin", listOf("2019-12-27"))
        expected.put("end", listOf("2019-12-27"))
        expected.put("ending_before", listOf("ending_before"))
        expected.put("include_initial_statements", listOf("true"))
        expected.put("page_size", listOf("100"))
        expected.put("starting_after", listOf("starting_after"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            FinancialAccountStatementListParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params =
            FinancialAccountStatementListParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "financialAccountToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
