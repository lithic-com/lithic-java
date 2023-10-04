// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ResponderEndpointCreateParamsTest {

    @Test
    fun createResponderEndpointCreateParams() {
        ResponderEndpointCreateParams.builder()
            .type(ResponderEndpointCreateParams.Type.TOKENIZATION_DECISIONING)
            .url("https://example.com")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ResponderEndpointCreateParams.builder()
                .type(ResponderEndpointCreateParams.Type.TOKENIZATION_DECISIONING)
                .url("https://example.com")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.type())
            .isEqualTo(ResponderEndpointCreateParams.Type.TOKENIZATION_DECISIONING)
        assertThat(body.url()).isEqualTo("https://example.com")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = ResponderEndpointCreateParams.builder().build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}
