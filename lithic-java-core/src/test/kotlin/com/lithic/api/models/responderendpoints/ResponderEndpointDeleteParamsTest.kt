// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.responderendpoints

import com.lithic.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResponderEndpointDeleteParamsTest {

    @Test
    fun create() {
        ResponderEndpointDeleteParams.builder()
            .type(ResponderEndpointDeleteParams.Type.AUTH_STREAM_ACCESS)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ResponderEndpointDeleteParams.builder()
                .type(ResponderEndpointDeleteParams.Type.AUTH_STREAM_ACCESS)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("type", "AUTH_STREAM_ACCESS").build())
    }
}
