// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResponderEndpointStatusTest {

    @Test
    fun create() {
        val responderEndpointStatus =
            ResponderEndpointStatus.builder().enrolled(true).url("https://example.com").build()

        assertThat(responderEndpointStatus.enrolled()).contains(true)
        assertThat(responderEndpointStatus.url()).contains("https://example.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val responderEndpointStatus =
            ResponderEndpointStatus.builder().enrolled(true).url("https://example.com").build()

        val roundtrippedResponderEndpointStatus =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responderEndpointStatus),
                jacksonTypeRef<ResponderEndpointStatus>(),
            )

        assertThat(roundtrippedResponderEndpointStatus).isEqualTo(responderEndpointStatus)
    }
}
