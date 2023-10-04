// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ResponderEndpointCreateResponseTest {

    @Test
    fun createResponderEndpointCreateResponse() {
        val responderEndpointCreateResponse =
            ResponderEndpointCreateResponse.builder().enrolled(true).build()
        assertThat(responderEndpointCreateResponse).isNotNull
        assertThat(responderEndpointCreateResponse.enrolled()).contains(true)
    }
}
