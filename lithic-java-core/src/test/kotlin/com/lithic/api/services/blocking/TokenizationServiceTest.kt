// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.TokenizationActivateParams
import com.lithic.api.models.TokenizationDeactivateParams
import com.lithic.api.models.TokenizationPauseParams
import com.lithic.api.models.TokenizationResendActivationCodeParams
import com.lithic.api.models.TokenizationRetrieveParams
import com.lithic.api.models.TokenizationSimulateParams
import com.lithic.api.models.TokenizationUnpauseParams
import com.lithic.api.models.TokenizationUpdateDigitalCardArtParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TokenizationServiceTest {

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationService = client.tokenizations()

        val tokenization =
            tokenizationService.retrieve(
                TokenizationRetrieveParams.builder()
                    .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        tokenization.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationService = client.tokenizations()

        val page = tokenizationService.list()

        page.response().validate()
    }

    @Test
    fun activate() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationService = client.tokenizations()

        tokenizationService.activate(
            TokenizationActivateParams.builder()
                .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }

    @Test
    fun deactivate() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationService = client.tokenizations()

        tokenizationService.deactivate(
            TokenizationDeactivateParams.builder()
                .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }

    @Test
    fun pause() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationService = client.tokenizations()

        tokenizationService.pause(
            TokenizationPauseParams.builder()
                .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }

    @Test
    fun resendActivationCode() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationService = client.tokenizations()

        tokenizationService.resendActivationCode(
            TokenizationResendActivationCodeParams.builder()
                .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .activationMethodType(
                    TokenizationResendActivationCodeParams.ActivationMethodType
                        .EMAIL_TO_CARDHOLDER_ADDRESS
                )
                .build()
        )
    }

    @Test
    fun simulate() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationService = client.tokenizations()

        val response =
            tokenizationService.simulate(
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

        response.validate()
    }

    @Test
    fun unpause() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationService = client.tokenizations()

        tokenizationService.unpause(
            TokenizationUnpauseParams.builder()
                .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }

    @Test
    fun updateDigitalCardArt() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationService = client.tokenizations()

        val response =
            tokenizationService.updateDigitalCardArt(
                TokenizationUpdateDigitalCardArtParams.builder()
                    .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .digitalCardArtToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }
}
