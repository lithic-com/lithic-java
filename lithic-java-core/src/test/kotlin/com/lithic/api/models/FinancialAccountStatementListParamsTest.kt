// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FinancialAccountStatementListParamsTest {

    @Test
    fun create() {
        FinancialAccountStatementListParams.builder()
            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .begin(LocalDate.parse("2019-12-27"))
            .end(LocalDate.parse("2019-12-27"))
            .endingBefore("ending_before")
            .includeInitialStatements(true)
            .pageSize(1L)
            .startingAfter("starting_after")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            FinancialAccountStatementListParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .begin(LocalDate.parse("2019-12-27"))
                .end(LocalDate.parse("2019-12-27"))
                .endingBefore("ending_before")
                .includeInitialStatements(true)
                .pageSize(1L)
                .startingAfter("starting_after")
                .build()
        val expected = QueryParams.builder()
        expected.put("begin", "2019-12-27")
        expected.put("end", "2019-12-27")
        expected.put("ending_before", "ending_before")
        expected.put("include_initial_statements", "true")
        expected.put("page_size", "1")
        expected.put("starting_after", "starting_after")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            FinancialAccountStatementListParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
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
