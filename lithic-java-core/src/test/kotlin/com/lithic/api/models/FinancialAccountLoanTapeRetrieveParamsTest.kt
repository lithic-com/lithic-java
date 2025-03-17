// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FinancialAccountLoanTapeRetrieveParamsTest {

    @Test
    fun create() {
        FinancialAccountLoanTapeRetrieveParams.builder()
            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .loanTapeToken("loan_tape_token")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            FinancialAccountLoanTapeRetrieveParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .loanTapeToken("loan_tape_token")
                .build()
        assertThat(params).isNotNull
        // path param "financialAccountToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // path param "loanTapeToken"
        assertThat(params.getPathParam(1)).isEqualTo("loan_tape_token")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
