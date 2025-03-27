// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.externalbankaccounts

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.externalbankaccounts.microdeposits.MicroDepositCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MicroDepositServiceAsyncTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val microDepositServiceAsync = client.externalBankAccounts().microDeposits()

        val microDepositFuture =
            microDepositServiceAsync.create(
                MicroDepositCreateParams.builder()
                    .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addMicroDeposit(0L)
                    .addMicroDeposit(0L)
                    .build()
            )

        val microDeposit = microDepositFuture.get()
        microDeposit.validate()
    }
}
