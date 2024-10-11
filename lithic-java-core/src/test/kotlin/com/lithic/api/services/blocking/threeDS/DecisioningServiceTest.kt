// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.threeDS

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DecisioningServiceTest {

    @Test
    fun callChallengeResponse() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val decisioningService = client.threeDS().decisioning()
        decisioningService.challengeResponse(
            ThreeDSDecisioningChallengeResponseParams.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .challengeResponse(ChallengeResult.APPROVE)
                .build()
        )
    }

    @Test
    fun callRetrieveSecret() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val decisioningService = client.threeDS().decisioning()
        val decisioningRetrieveSecretResponse =
            decisioningService.retrieveSecret(
                ThreeDSDecisioningRetrieveSecretParams.builder().build()
            )
        println(decisioningRetrieveSecretResponse)
        decisioningRetrieveSecretResponse.validate()
    }

    @Test
    fun callRotateSecret() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val decisioningService = client.threeDS().decisioning()
        decisioningService.rotateSecret(ThreeDSDecisioningRotateSecretParams.builder().build())
    }

    @Test
    fun callSimulateChallenge() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val decisioningService = client.threeDS().decisioning()
        val decisioningSimulateChallengeResponse =
            decisioningService.simulateChallenge(
                ThreeDSDecisioningSimulateChallengeParams.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(decisioningSimulateChallengeResponse)
        decisioningSimulateChallengeResponse.validate()
    }

    @Test
    fun callSimulateChallengeResponse() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val decisioningService = client.threeDS().decisioning()
        decisioningService.simulateChallengeResponse(
            ThreeDSDecisioningSimulateChallengeResponseParams.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .challengeResponse(ChallengeResult.APPROVE)
                .build()
        )
    }
}
