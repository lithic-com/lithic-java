// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FinancialAccountStatementRetrieveParamsTest {

    @Test
    fun create() {
        FinancialAccountStatementRetrieveParams.builder()
            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .statementToken("statement_token")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            FinancialAccountStatementRetrieveParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .statementToken("statement_token")
                .build()
        assertThat(params).isNotNull
        // path param "financialAccountToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // path param "statementToken"
        assertThat(params.getPathParam(1)).isEqualTo("statement_token")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
