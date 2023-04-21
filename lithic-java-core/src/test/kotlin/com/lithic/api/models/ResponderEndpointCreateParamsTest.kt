package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ResponderEndpointCreateParamsTest {

    @Test
    fun createResponderEndpointCreateParams() {
        ResponderEndpointCreateParams.builder()
            .url("https://example.com")
            .type(ResponderEndpointCreateParams.Type.TOKENIZATION_DECISIONING)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ResponderEndpointCreateParams.builder()
                .url("https://example.com")
                .type(ResponderEndpointCreateParams.Type.TOKENIZATION_DECISIONING)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.url()).isEqualTo("https://example.com")
        assertThat(body.type())
            .isEqualTo(ResponderEndpointCreateParams.Type.TOKENIZATION_DECISIONING)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = ResponderEndpointCreateParams.builder().build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}
