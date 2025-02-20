// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ResponderEndpointCreateParamsTest {

    @Test
    fun create() {
        ResponderEndpointCreateParams.builder()
            .type(ResponderEndpointCreateParams.Type.AUTH_STREAM_ACCESS)
            .url("https://example.com")
            .build()
    }

    @Test
    fun body() {
        val params =
            ResponderEndpointCreateParams.builder()
                .type(ResponderEndpointCreateParams.Type.AUTH_STREAM_ACCESS)
                .url("https://example.com")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.type()).contains(ResponderEndpointCreateParams.Type.AUTH_STREAM_ACCESS)
        assertThat(body.url()).contains("https://example.com")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ResponderEndpointCreateParams.builder().build()

        val body = params._body()

        assertNotNull(body)
    }
}
