// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.threeDS

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.ChallengeResponse
import com.lithic.api.models.ChallengeResult
import com.lithic.api.models.ThreeDSDecisioningChallengeResponseParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DecisioningServiceTest {

    @Test
    fun challengeResponse() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val decisioningService = client.threeDS().decisioning()

        decisioningService.challengeResponse(
            ThreeDSDecisioningChallengeResponseParams.builder()
                .challengeResponse(
                    ChallengeResponse.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .challengeResponse(ChallengeResult.APPROVE)
                        .build()
                )
                .build()
        )
    }

    @Test
    fun retrieveSecret() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val decisioningService = client.threeDS().decisioning()

        val response = decisioningService.retrieveSecret()

        response.validate()
    }

    @Test
    fun rotateSecret() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val decisioningService = client.threeDS().decisioning()

        decisioningService.rotateSecret()
    }
}
