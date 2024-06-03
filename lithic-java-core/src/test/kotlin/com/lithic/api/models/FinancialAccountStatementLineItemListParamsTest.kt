// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FinancialAccountStatementLineItemListParamsTest {

    @Test
    fun createFinancialAccountStatementLineItemListParams() {
        FinancialAccountStatementLineItemListParams.builder()
            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .statementToken("string")
            .endingBefore("string")
            .pageSize(100L)
            .startingAfter("string")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            FinancialAccountStatementLineItemListParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .statementToken("string")
                .endingBefore("string")
                .pageSize(100L)
                .startingAfter("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("ending_before", listOf("string"))
        expected.put("page_size", listOf("100"))
        expected.put("starting_after", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            FinancialAccountStatementLineItemListParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .statementToken("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params =
            FinancialAccountStatementLineItemListParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .statementToken("string")
                .build()
        assertThat(params).isNotNull
        // path param "financialAccountToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // path param "statementToken"
        assertThat(params.getPathParam(1)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
