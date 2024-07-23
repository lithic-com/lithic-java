// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FinancialAccountCreditConfigTest {

    @Test
    fun createFinancialAccountCreditConfig() {
        val financialAccountCreditConfig =
            FinancialAccountCreditConfig.builder()
                .accountToken("b68b7424-aa69-4cbc-a946-30d90181b621")
                .creditLimit(123L)
                .creditProductToken("credit_product_token")
                .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(financialAccountCreditConfig).isNotNull
        assertThat(financialAccountCreditConfig.accountToken())
            .isEqualTo("b68b7424-aa69-4cbc-a946-30d90181b621")
        assertThat(financialAccountCreditConfig.creditLimit()).contains(123L)
        assertThat(financialAccountCreditConfig.creditProductToken())
            .contains("credit_product_token")
        assertThat(financialAccountCreditConfig.externalBankAccountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
