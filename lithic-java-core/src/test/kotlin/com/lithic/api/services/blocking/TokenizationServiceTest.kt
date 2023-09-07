package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TokenizationServiceTest {

    @Test
    fun callSimulate() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val tokenizationService = client.tokenizations()
        val tokenizationSimulateResponse =
            tokenizationService.simulate(
                TokenizationSimulateParams.builder()
                    .cvv("776")
                    .expirationDate("xxxxx")
                    .pan("4111111289144142")
                    .tokenizationSource(TokenizationSimulateParams.TokenizationSource.APPLE_PAY)
                    .accountScore(123L)
                    .deviceScore(123L)
                    .walletRecommendedDecision(
                        TokenizationSimulateParams.WalletRecommendedDecision.APPROVED
                    )
                    .build()
            )
        println(tokenizationSimulateResponse)
        tokenizationSimulateResponse.validate()
    }
}
