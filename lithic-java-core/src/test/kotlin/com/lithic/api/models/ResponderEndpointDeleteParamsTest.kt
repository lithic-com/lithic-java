// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ResponderEndpointDeleteParamsTest {

    @Test
    fun createResponderEndpointDeleteParams() {
        ResponderEndpointDeleteParams.builder()
            .type(ResponderEndpointDeleteParams.Type.AUTH_STREAM_ACCESS)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ResponderEndpointDeleteParams.builder()
                .type(ResponderEndpointDeleteParams.Type.AUTH_STREAM_ACCESS)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put(
            "type",
            listOf(ResponderEndpointDeleteParams.Type.AUTH_STREAM_ACCESS.toString())
        )
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            ResponderEndpointDeleteParams.builder()
                .type(ResponderEndpointDeleteParams.Type.AUTH_STREAM_ACCESS)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put(
            "type",
            listOf(ResponderEndpointDeleteParams.Type.AUTH_STREAM_ACCESS.toString())
        )
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
