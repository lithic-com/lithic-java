package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ResponderEndpointDeleteParamsTest {

    @Test
    fun createResponderEndpointDeleteParams() {
        ResponderEndpointDeleteParams.builder()
            .type(ResponderEndpointDeleteParams.Type.TOKENIZATION_DECISIONING)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ResponderEndpointDeleteParams.builder()
                .type(ResponderEndpointDeleteParams.Type.TOKENIZATION_DECISIONING)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put(
            "type",
            listOf(ResponderEndpointDeleteParams.Type.TOKENIZATION_DECISIONING.toString())
        )
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            ResponderEndpointDeleteParams.builder()
                .type(ResponderEndpointDeleteParams.Type.TOKENIZATION_DECISIONING)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put(
            "type",
            listOf(ResponderEndpointDeleteParams.Type.TOKENIZATION_DECISIONING.toString())
        )
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
