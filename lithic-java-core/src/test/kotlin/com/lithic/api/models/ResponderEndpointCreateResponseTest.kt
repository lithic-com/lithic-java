// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResponderEndpointCreateResponseTest {

    @Test
    fun create() {
        val responderEndpointCreateResponse =
            ResponderEndpointCreateResponse.builder().enrolled(true).build()

        assertThat(responderEndpointCreateResponse.enrolled()).contains(true)
    }
}
