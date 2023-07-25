package com.lithic.api.services.blocking.externalBankAccounts

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class MicroDepositServiceTest {

    @Test
    fun callCreate() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .webhookSecret("string")
                .build()
        val microDepositService = client.externalBankAccounts().microDeposits()
        val microDepositCreateResponse =
            microDepositService.create(
                ExternalBankAccountMicroDepositCreateParams.builder()
                    .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .microDeposits(listOf(123L))
                    .build()
            )
        println(microDepositCreateResponse)
        microDepositCreateResponse.validate()
    }
}
