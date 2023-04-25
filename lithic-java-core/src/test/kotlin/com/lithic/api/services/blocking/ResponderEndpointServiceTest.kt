package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ResponderEndpointServiceTest {

    @Test
    fun callCreate() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .webhookSecret("string")
                .build()
        val responderEndpointService = client.responderEndpoints()
        val responderEndpointCreateResponse =
            responderEndpointService.create(
                ResponderEndpointCreateParams.builder()
                    .url("https://example.com")
                    .type(ResponderEndpointCreateParams.Type.TOKENIZATION_DECISIONING)
                    .build()
            )
        println(responderEndpointCreateResponse)
        responderEndpointCreateResponse.validate()
    }

    @Disabled("Prism errors when accept header set but no request body is defined")
    @Test
    fun callDelete() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .webhookSecret("string")
                .build()
        val responderEndpointService = client.responderEndpoints()
        responderEndpointService.delete(
            ResponderEndpointDeleteParams.builder()
                .type(ResponderEndpointDeleteParams.Type.TOKENIZATION_DECISIONING)
                .build()
        )
    }

    @Test
    fun callCheckStatus() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .webhookSecret("string")
                .build()
        val responderEndpointService = client.responderEndpoints()
        val responderEndpointStatus =
            responderEndpointService.checkStatus(
                ResponderEndpointCheckStatusParams.builder()
                    .type(ResponderEndpointCheckStatusParams.Type.TOKENIZATION_DECISIONING)
                    .build()
            )
        println(responderEndpointStatus)
        responderEndpointStatus.validate()
    }
}