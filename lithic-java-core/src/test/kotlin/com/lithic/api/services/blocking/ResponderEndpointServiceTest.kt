// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.ResponderEndpointCheckStatusParams
import com.lithic.api.models.ResponderEndpointCreateParams
import com.lithic.api.models.ResponderEndpointDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ResponderEndpointServiceTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val responderEndpointService = client.responderEndpoints()

        val responderEndpoint =
            responderEndpointService.create(
                ResponderEndpointCreateParams.builder()
                    .type(ResponderEndpointCreateParams.Type.AUTH_STREAM_ACCESS)
                    .url("https://example.com")
                    .build()
            )

        responderEndpoint.validate()
    }

    @Disabled("Prism errors when accept header set but no request body is defined")
    @Test
    fun delete() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val responderEndpointService = client.responderEndpoints()

        responderEndpointService.delete(
            ResponderEndpointDeleteParams.builder()
                .type(ResponderEndpointDeleteParams.Type.AUTH_STREAM_ACCESS)
                .build()
        )
    }

    @Test
    fun checkStatus() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val responderEndpointService = client.responderEndpoints()

        val responderEndpointStatus =
            responderEndpointService.checkStatus(
                ResponderEndpointCheckStatusParams.builder()
                    .type(ResponderEndpointCheckStatusParams.Type.AUTH_STREAM_ACCESS)
                    .build()
            )

        responderEndpointStatus.validate()
    }
}
