// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FinancialAccountRegisterAccountNumberParamsTest {

    @Test
    fun create() {
        FinancialAccountRegisterAccountNumberParams.builder()
            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .accountNumber("account_number")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FinancialAccountRegisterAccountNumberParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountNumber("account_number")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            FinancialAccountRegisterAccountNumberParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountNumber("account_number")
                .build()

        val body = params._body()

        assertThat(body.accountNumber()).isEqualTo("account_number")
    }
}
