// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.ResponderEndpointCheckStatusParams
import com.lithic.api.models.ResponderEndpointCreateParams
import com.lithic.api.models.ResponderEndpointDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ResponderEndpointServiceAsyncTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val responderEndpointServiceAsync = client.responderEndpoints()

        val responderEndpointFuture =
            responderEndpointServiceAsync.create(
                ResponderEndpointCreateParams.builder()
                    .type(ResponderEndpointCreateParams.Type.AUTH_STREAM_ACCESS)
                    .url("https://example.com")
                    .build()
            )

        val responderEndpoint = responderEndpointFuture.get()
        responderEndpoint.validate()
    }

    @Disabled("Prism errors when accept header set but no request body is defined")
    @Test
    fun delete() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val responderEndpointServiceAsync = client.responderEndpoints()

        val future =
            responderEndpointServiceAsync.delete(
                ResponderEndpointDeleteParams.builder()
                    .type(ResponderEndpointDeleteParams.Type.AUTH_STREAM_ACCESS)
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun checkStatus() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val responderEndpointServiceAsync = client.responderEndpoints()

        val responderEndpointStatusFuture =
            responderEndpointServiceAsync.checkStatus(
                ResponderEndpointCheckStatusParams.builder()
                    .type(ResponderEndpointCheckStatusParams.Type.AUTH_STREAM_ACCESS)
                    .build()
            )

        val responderEndpointStatus = responderEndpointStatusFuture.get()
        responderEndpointStatus.validate()
    }
}
