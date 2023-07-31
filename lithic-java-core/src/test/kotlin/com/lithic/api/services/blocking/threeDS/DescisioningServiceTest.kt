package com.lithic.api.services.blocking.threeDS

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DescisioningServiceTest {

    @Test
    fun callRetrieveSecret() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .webhookSecret("string")
                .build()
        val descisioningService = client.threeDS().descisioning()
        val descisioningRetrieveSecretResponse =
            descisioningService.retrieveSecret(
                ThreeDDescisioningRetrieveSecretParams.builder().build()
            )
        println(descisioningRetrieveSecretResponse)
        descisioningRetrieveSecretResponse.validate()
    }

    @Test
    fun callRotateSecret() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .webhookSecret("string")
                .build()
        val descisioningService = client.threeDS().descisioning()
        descisioningService.rotateSecret(ThreeDDescisioningRotateSecretParams.builder().build())
    }
}
