package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ResponderEndpointStatusTest {

    @Test
    fun createResponderEndpointStatus() {
        val responderEndpointStatus =
            ResponderEndpointStatus.builder().enrolled(true).url("https://example.com").build()
        assertThat(responderEndpointStatus).isNotNull
        assertThat(responderEndpointStatus.enrolled()).contains(true)
        assertThat(responderEndpointStatus.url()).contains("https://example.com")
    }
}
