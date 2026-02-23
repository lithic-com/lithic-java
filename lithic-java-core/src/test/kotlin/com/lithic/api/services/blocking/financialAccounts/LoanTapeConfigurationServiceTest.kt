// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.financialAccounts

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LoanTapeConfigurationServiceTest {

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val loanTapeConfigurationService = client.financialAccounts().loanTapeConfiguration()

        val loanTapeConfiguration =
            loanTapeConfigurationService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        loanTapeConfiguration.validate()
    }
}
