// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.TokenizationResendActivationCodeParams
import com.lithic.api.models.TokenizationSimulateParams
import com.lithic.api.models.TokenizationUpdateDigitalCardArtParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TokenizationServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationServiceAsync = client.tokenizations()

        val tokenizationFuture =
            tokenizationServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val tokenization = tokenizationFuture.get()
        tokenization.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationServiceAsync = client.tokenizations()

        val pageFuture = tokenizationServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun activate() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationServiceAsync = client.tokenizations()

        val future = tokenizationServiceAsync.activate("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = future.get()
    }

    @Test
    fun deactivate() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationServiceAsync = client.tokenizations()

        val future = tokenizationServiceAsync.deactivate("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = future.get()
    }

    @Test
    fun pause() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationServiceAsync = client.tokenizations()

        val future = tokenizationServiceAsync.pause("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = future.get()
    }

    @Test
    fun resendActivationCode() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationServiceAsync = client.tokenizations()

        val future =
            tokenizationServiceAsync.resendActivationCode(
                TokenizationResendActivationCodeParams.builder()
                    .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .activationMethodType(
                        TokenizationResendActivationCodeParams.ActivationMethodType
                            .TEXT_TO_CARDHOLDER_NUMBER
                    )
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun simulate() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationServiceAsync = client.tokenizations()

        val responseFuture =
            tokenizationServiceAsync.simulate(
                TokenizationSimulateParams.builder()
                    .cvv("776")
                    .expirationDate("08/29")
                    .pan("4111111289144142")
                    .tokenizationSource(TokenizationSimulateParams.TokenizationSource.APPLE_PAY)
                    .accountScore(5L)
                    .deviceScore(5L)
                    .entity("entity")
                    .walletRecommendedDecision(
                        TokenizationSimulateParams.WalletRecommendedDecision.APPROVED
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun unpause() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationServiceAsync = client.tokenizations()

        val future = tokenizationServiceAsync.unpause("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = future.get()
    }

    @Test
    fun updateDigitalCardArt() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationServiceAsync = client.tokenizations()

        val responseFuture =
            tokenizationServiceAsync.updateDigitalCardArt(
                TokenizationUpdateDigitalCardArtParams.builder()
                    .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
