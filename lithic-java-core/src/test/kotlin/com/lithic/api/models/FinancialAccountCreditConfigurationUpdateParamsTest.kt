// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FinancialAccountCreditConfigurationUpdateParamsTest {

    @Test
    fun create() {
        FinancialAccountCreditConfigurationUpdateParams.builder()
            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .creditLimit(0L)
            .creditProductToken("credit_product_token")
            .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .tier("x")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FinancialAccountCreditConfigurationUpdateParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            FinancialAccountCreditConfigurationUpdateParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .creditLimit(0L)
                .creditProductToken("credit_product_token")
                .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tier("x")
                .build()

        val body = params._body()

        assertThat(body.creditLimit()).contains(0L)
        assertThat(body.creditProductToken()).contains("credit_product_token")
        assertThat(body.externalBankAccountToken()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.tier()).contains("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FinancialAccountCreditConfigurationUpdateParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
