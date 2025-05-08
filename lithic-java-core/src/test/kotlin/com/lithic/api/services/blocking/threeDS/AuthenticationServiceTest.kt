// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.threeDS

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.ThreeDSAuthenticationSimulateOtpEntryParams
import com.lithic.api.models.ThreeDSAuthenticationSimulateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AuthenticationServiceTest {

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val authenticationService = client.threeDS().authentication()

        val authentication = authenticationService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        authentication.validate()
    }

    @Test
    fun simulate() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val authenticationService = client.threeDS().authentication()

        val response =
            authenticationService.simulate(
                ThreeDSAuthenticationSimulateParams.builder()
                    .merchant(
                        ThreeDSAuthenticationSimulateParams.Merchant.builder()
                            .id("OODKZAPJVN4YS7O")
                            .country("USA")
                            .mcc("5812")
                            .name("COFFEE SHOP")
                            .build()
                    )
                    .pan("4111111289144142")
                    .transaction(
                        ThreeDSAuthenticationSimulateParams.Transaction.builder()
                            .amount(100L)
                            .currency("USD")
                            .build()
                    )
                    .cardExpiryCheck(ThreeDSAuthenticationSimulateParams.CardExpiryCheck.MATCH)
                    .build()
            )

        response.validate()
    }

    @Test
    fun simulateOtpEntry() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val authenticationService = client.threeDS().authentication()

        authenticationService.simulateOtpEntry(
            ThreeDSAuthenticationSimulateOtpEntryParams.builder()
                .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
                .otp("123456")
                .build()
        )
    }
}
