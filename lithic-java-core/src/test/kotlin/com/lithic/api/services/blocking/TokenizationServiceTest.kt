// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.TokenizationCreateParams
import com.lithic.api.models.TokenizationCreatePaymentCredentialsParams
import com.lithic.api.models.TokenizationResendActivationCodeParams
import com.lithic.api.models.TokenizationSelectTfaMethodParams
import com.lithic.api.models.TokenizationSimulateParams
import com.lithic.api.models.TokenizationSubmitTfaParams
import com.lithic.api.models.TokenizationUpdateDigitalCardArtParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TokenizationServiceTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationService = client.tokenizations()

        val tokenization =
            tokenizationService.create(
                TokenizationCreateParams.builder()
                    .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .agentToken("20f418a7-27c2-486c-aeee-3ad2beb87c91")
                    .type(TokenizationCreateParams.Type.AGENT)
                    .build()
            )

        tokenization.validate()
    }

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationService = client.tokenizations()

        val tokenization = tokenizationService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

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

        tokenizationService.activate("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun createPaymentCredentials() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationService = client.tokenizations()

        val response =
            tokenizationService.createPaymentCredentials(
                TokenizationCreatePaymentCredentialsParams.builder()
                    .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .device(
                        TokenizationCreatePaymentCredentialsParams.PaymentCredentialsDevice
                            .builder()
                            .applicationName("Example app")
                            .brand("Example brand")
                            .ipAddress("192.0.2.1")
                            .type("Mobile")
                            .build()
                    )
                    .mandate(
                        TokenizationCreatePaymentCredentialsParams.PaymentCredentialsMandate
                            .builder()
                            .amount(1250L)
                            .expiresAt(OffsetDateTime.parse("2026-10-29T15:00:00Z"))
                            .frequency(
                                TokenizationCreatePaymentCredentialsParams.PaymentCredentialsMandate
                                    .Frequency
                                    .ONE_TIME
                            )
                            .merchant(
                                TokenizationCreatePaymentCredentialsParams.PaymentCredentialsMandate
                                    .Merchant
                                    .builder()
                                    .name("Example merchant")
                                    .url("https://merchant.example")
                                    .build()
                            )
                            .build()
                    )
                    .type(
                        TokenizationCreatePaymentCredentialsParams.PaymentCredentialsType
                            .HUMAN_IN_THE_LOOP
                    )
                    .build()
            )

        response.validate()
    }

    @Test
    fun deactivate() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationService = client.tokenizations()

        tokenizationService.deactivate("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun pause() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationService = client.tokenizations()

        tokenizationService.pause("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                        .TEXT_TO_CARDHOLDER_NUMBER
                )
                .build()
        )
    }

    @Test
    fun selectTfaMethod() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationService = client.tokenizations()

        val response =
            tokenizationService.selectTfaMethod(
                TokenizationSelectTfaMethodParams.builder()
                    .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .method(TokenizationSelectTfaMethodParams.Method.SMS)
                    .build()
            )

        response.validate()
    }

    @Test
    fun simulate() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationService = client.tokenizations()

        val tokenization =
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

        tokenization.validate()
    }

    @Test
    fun submitTfa() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationService = client.tokenizations()

        val response =
            tokenizationService.submitTfa(
                TokenizationSubmitTfaParams.builder()
                    .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .value("01929")
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

        tokenizationService.unpause("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun updateDigitalCardArt() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationService = client.tokenizations()

        val tokenization =
            tokenizationService.updateDigitalCardArt(
                TokenizationUpdateDigitalCardArtParams.builder()
                    .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .digitalCardArtToken("5e9483eb-8103-4e16-9794-2106111b2eca")
                    .build()
            )

        tokenization.validate()
    }
}
