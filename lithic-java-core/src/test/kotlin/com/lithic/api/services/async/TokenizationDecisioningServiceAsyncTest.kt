// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TokenizationDecisioningServiceAsyncTest {

    @Test
    fun retrieveSecret() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationDecisioningServiceAsync = client.tokenizationDecisioning()

        val tokenizationSecretFuture = tokenizationDecisioningServiceAsync.retrieveSecret()

        val tokenizationSecret = tokenizationSecretFuture.get()
        tokenizationSecret.validate()
    }

    @Test
    fun rotateSecret() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationDecisioningServiceAsync = client.tokenizationDecisioning()

        val responseFuture = tokenizationDecisioningServiceAsync.rotateSecret()

        val response = responseFuture.get()
        response.validate()
    }
}
