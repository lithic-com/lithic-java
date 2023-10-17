// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.accounts

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CreditConfigurationServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val creditConfigurationService = client.accounts().creditConfigurations()
        val businessAccount =
            creditConfigurationService.retrieve(
                AccountCreditConfigurationRetrieveParams.builder()
                    .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(businessAccount)
        businessAccount.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val creditConfigurationService = client.accounts().creditConfigurations()
        val businessAccount =
            creditConfigurationService.update(
                AccountCreditConfigurationUpdateParams.builder()
                    .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .billingPeriod(123L)
                    .creditLimit(123L)
                    .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .paymentPeriod(123L)
                    .build()
            )
        println(businessAccount)
        businessAccount.validate()
    }
}
