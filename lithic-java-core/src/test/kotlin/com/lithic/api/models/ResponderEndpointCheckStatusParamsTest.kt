// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.QueryParams
import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ResponderEndpointCheckStatusParamsTest {

    @Test
    fun createResponderEndpointCheckStatusParams() {
        ResponderEndpointCheckStatusParams.builder()
            .type(ResponderEndpointCheckStatusParams.Type.AUTH_STREAM_ACCESS)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ResponderEndpointCheckStatusParams.builder()
                .type(ResponderEndpointCheckStatusParams.Type.AUTH_STREAM_ACCESS)
                .build()
        val expected = QueryParams.builder()
        expected.put("type", ResponderEndpointCheckStatusParams.Type.AUTH_STREAM_ACCESS.toString())
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            ResponderEndpointCheckStatusParams.builder()
                .type(ResponderEndpointCheckStatusParams.Type.AUTH_STREAM_ACCESS)
                .build()
        val expected = QueryParams.builder()
        expected.put("type", ResponderEndpointCheckStatusParams.Type.AUTH_STREAM_ACCESS.toString())
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
