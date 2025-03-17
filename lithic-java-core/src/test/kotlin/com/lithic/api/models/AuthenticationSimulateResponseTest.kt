// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthenticationSimulateResponseTest {

    @Test
    fun createAuthenticationSimulateResponse() {
        val authenticationSimulateResponse =
            AuthenticationSimulateResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(authenticationSimulateResponse).isNotNull
        assertThat(authenticationSimulateResponse.token())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
