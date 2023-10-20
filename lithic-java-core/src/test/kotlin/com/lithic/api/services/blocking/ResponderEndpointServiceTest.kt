// File generated from our OpenAPI spec by Stainless.

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
                .apiKey("My Lithic API Key")
                .build()
        val responderEndpointService = client.responderEndpoints()
        val responderEndpointCreateResponse =
            responderEndpointService.create(
                ResponderEndpointCreateParams.builder()
                    .type(ResponderEndpointCreateParams.Type.AUTH_STREAM_ACCESS)
                    .url("https://example.com")
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
    fun callCheckStatus() {
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
        println(responderEndpointStatus)
        responderEndpointStatus.validate()
    }
}
