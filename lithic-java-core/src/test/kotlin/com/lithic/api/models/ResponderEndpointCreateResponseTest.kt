// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResponderEndpointCreateResponseTest {

    @Test
    fun create() {
        val responderEndpointCreateResponse =
            ResponderEndpointCreateResponse.builder().enrolled(true).build()

        assertThat(responderEndpointCreateResponse.enrolled()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val responderEndpointCreateResponse =
            ResponderEndpointCreateResponse.builder().enrolled(true).build()

        val roundtrippedResponderEndpointCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responderEndpointCreateResponse),
                jacksonTypeRef<ResponderEndpointCreateResponse>(),
            )

        assertThat(roundtrippedResponderEndpointCreateResponse)
            .isEqualTo(responderEndpointCreateResponse)
    }
}
