// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.financialAccounts

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.FinancialAccountCreditConfigurationUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CreditConfigurationServiceTest {

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val creditConfigurationService = client.financialAccounts().creditConfiguration()

        val financialAccountCreditConfig =
            creditConfigurationService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        financialAccountCreditConfig.validate()
    }

    @Test
    fun update() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val creditConfigurationService = client.financialAccounts().creditConfiguration()

        val financialAccountCreditConfig =
            creditConfigurationService.update(
                FinancialAccountCreditConfigurationUpdateParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .creditLimit(0L)
                    .creditProductToken("credit_product_token")
                    .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tier("x")
                    .build()
            )

        financialAccountCreditConfig.validate()
    }
}
