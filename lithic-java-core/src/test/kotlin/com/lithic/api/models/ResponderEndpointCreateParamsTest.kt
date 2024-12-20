// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ResponderEndpointCreateParamsTest {

    @Test
    fun createResponderEndpointCreateParams() {
        ResponderEndpointCreateParams.builder()
            .type(ResponderEndpointCreateParams.Type.AUTH_STREAM_ACCESS)
            .url("https://example.com")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ResponderEndpointCreateParams.builder()
                .type(ResponderEndpointCreateParams.Type.AUTH_STREAM_ACCESS)
                .url("https://example.com")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.type()).contains(ResponderEndpointCreateParams.Type.AUTH_STREAM_ACCESS)
        assertThat(body.url()).contains("https://example.com")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = ResponderEndpointCreateParams.builder().build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}
