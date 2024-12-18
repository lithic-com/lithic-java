// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.QueryParams
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
        val expected = QueryParams.builder()
        expected.put("type", ResponderEndpointDeleteParams.Type.AUTH_STREAM_ACCESS.toString())
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            ResponderEndpointDeleteParams.builder()
                .type(ResponderEndpointDeleteParams.Type.AUTH_STREAM_ACCESS)
                .build()
        val expected = QueryParams.builder()
        expected.put("type", ResponderEndpointDeleteParams.Type.AUTH_STREAM_ACCESS.toString())
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
