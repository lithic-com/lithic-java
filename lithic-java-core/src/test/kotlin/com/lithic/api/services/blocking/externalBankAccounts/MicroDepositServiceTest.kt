// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.externalBankAccounts

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.ExternalBankAccountMicroDepositCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class MicroDepositServiceTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val microDepositService = client.externalBankAccounts().microDeposits()

        val microDeposit =
            microDepositService.create(
                ExternalBankAccountMicroDepositCreateParams.builder()
                    .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addMicroDeposit(0L)
                    .addMicroDeposit(0L)
                    .build()
            )

        microDeposit.validate()
    }
}
