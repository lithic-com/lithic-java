// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.threeds

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.threeds.authentication.AuthenticationRetrieveParams
import com.lithic.api.models.threeds.authentication.AuthenticationSimulateParams
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

        val authentication =
            authenticationService.retrieve(
                AuthenticationRetrieveParams.builder()
                    .threeDSAuthenticationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

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
                AuthenticationSimulateParams.builder()
                    .merchant(
                        AuthenticationSimulateParams.Merchant.builder()
                            .id("OODKZAPJVN4YS7O")
                            .country("USA")
                            .mcc("5812")
                            .name("COFFEE SHOP")
                            .build()
                    )
                    .pan("4111111289144142")
                    .transaction(
                        AuthenticationSimulateParams.Transaction.builder()
                            .amount(100L)
                            .currency("USD")
                            .build()
                    )
                    .cardExpiryCheck(AuthenticationSimulateParams.CardExpiryCheck.MATCH)
                    .build()
            )

        response.validate()
    }
}
