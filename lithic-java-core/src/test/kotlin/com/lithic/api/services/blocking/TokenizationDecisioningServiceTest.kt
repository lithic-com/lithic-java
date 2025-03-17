// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TokenizationDecisioningServiceTest {

    @Test
    fun retrieveSecret() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationDecisioningService = client.tokenizationDecisioning()

        val tokenizationSecret = tokenizationDecisioningService.retrieveSecret()

        tokenizationSecret.validate()
    }

    @Test
    fun rotateSecret() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationDecisioningService = client.tokenizationDecisioning()

        val response = tokenizationDecisioningService.rotateSecret()

        response.validate()
    }
}
