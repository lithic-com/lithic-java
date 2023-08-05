package com.lithic.api.services.blocking.threeDS

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DecisioningServiceTest {

    @Test
    fun callRetrieveSecret() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
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
                .apiKey("test-api-key")
                .build()
        val decisioningService = client.threeDS().decisioning()
        decisioningService.rotateSecret(ThreeDSDecisioningRotateSecretParams.builder().build())
    }
}
