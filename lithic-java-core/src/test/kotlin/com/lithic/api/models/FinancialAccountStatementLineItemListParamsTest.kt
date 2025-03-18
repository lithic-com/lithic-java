// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FinancialAccountStatementLineItemListParamsTest {

    @Test
    fun create() {
        FinancialAccountStatementLineItemListParams.builder()
            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .statementToken("statement_token")
            .endingBefore("ending_before")
            .pageSize(1L)
            .startingAfter("starting_after")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FinancialAccountStatementLineItemListParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .statementToken("statement_token")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("statement_token")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            FinancialAccountStatementLineItemListParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .statementToken("statement_token")
                .endingBefore("ending_before")
                .pageSize(1L)
                .startingAfter("starting_after")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("ending_before", "ending_before")
                    .put("page_size", "1")
                    .put("starting_after", "starting_after")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            FinancialAccountStatementLineItemListParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .statementToken("statement_token")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
