// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FinancialAccountCreditConfigurationUpdateParamsTest {

    @Test
    fun createFinancialAccountCreditConfigurationUpdateParams() {
        FinancialAccountCreditConfigurationUpdateParams.builder()
            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .creditLimit(123L)
            .creditProductToken("credit_product_token")
            .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .tier("x")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            FinancialAccountCreditConfigurationUpdateParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .creditLimit(123L)
                .creditProductToken("credit_product_token")
                .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tier("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.creditLimit()).isEqualTo(123L)
        assertThat(body.creditProductToken()).isEqualTo("credit_product_token")
        assertThat(body.externalBankAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.tier()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            FinancialAccountCreditConfigurationUpdateParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            FinancialAccountCreditConfigurationUpdateParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "financialAccountToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
