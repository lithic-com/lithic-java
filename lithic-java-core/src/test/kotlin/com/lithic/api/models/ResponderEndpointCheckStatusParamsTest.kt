// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResponderEndpointCheckStatusParamsTest {

    @Test
    fun create() {
        ResponderEndpointCheckStatusParams.builder()
            .type(ResponderEndpointCheckStatusParams.Type.AUTH_STREAM_ACCESS)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ResponderEndpointCheckStatusParams.builder()
                .type(ResponderEndpointCheckStatusParams.Type.AUTH_STREAM_ACCESS)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("type", "AUTH_STREAM_ACCESS").build())
    }
}
