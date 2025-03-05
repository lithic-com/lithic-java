// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.threeDS

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.ThreeDSAuthenticationRetrieveParams
import com.lithic.api.models.ThreeDSAuthenticationSimulateOtpEntryParams
import com.lithic.api.models.ThreeDSAuthenticationSimulateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AuthenticationServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val authenticationServiceAsync = client.threeDS().authentication()

        val authenticationFuture =
            authenticationServiceAsync.retrieve(
                ThreeDSAuthenticationRetrieveParams.builder()
                    .threeDSAuthenticationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val authentication = authenticationFuture.get()
        authentication.validate()
    }

    @Test
    fun simulate() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val authenticationServiceAsync = client.threeDS().authentication()

        val responseFuture =
            authenticationServiceAsync.simulate(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun simulateOtpEntry() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val authenticationServiceAsync = client.threeDS().authentication()

        val future =
            authenticationServiceAsync.simulateOtpEntry(
                ThreeDSAuthenticationSimulateOtpEntryParams.builder()
                    .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
                    .otp("123456")
                    .build()
            )

        val response = future.get()
    }
}
