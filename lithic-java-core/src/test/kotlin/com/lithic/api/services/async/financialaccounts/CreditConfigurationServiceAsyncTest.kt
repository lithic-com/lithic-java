// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialaccounts

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.financialaccounts.creditconfiguration.CreditConfigurationRetrieveParams
import com.lithic.api.models.financialaccounts.creditconfiguration.CreditConfigurationUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CreditConfigurationServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val creditConfigurationServiceAsync = client.financialAccounts().creditConfiguration()

        val financialAccountCreditConfigFuture =
            creditConfigurationServiceAsync.retrieve(
                CreditConfigurationRetrieveParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val financialAccountCreditConfig = financialAccountCreditConfigFuture.get()
        financialAccountCreditConfig.validate()
    }

    @Test
    fun update() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val creditConfigurationServiceAsync = client.financialAccounts().creditConfiguration()

        val financialAccountCreditConfigFuture =
            creditConfigurationServiceAsync.update(
                CreditConfigurationUpdateParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .creditLimit(0L)
                    .creditProductToken("credit_product_token")
                    .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tier("x")
                    .build()
            )

        val financialAccountCreditConfig = financialAccountCreditConfigFuture.get()
        financialAccountCreditConfig.validate()
    }
}
