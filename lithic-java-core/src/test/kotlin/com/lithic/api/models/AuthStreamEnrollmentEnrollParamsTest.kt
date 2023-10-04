// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuthStreamEnrollmentEnrollParamsTest {

    @Test
    fun createAuthStreamEnrollmentEnrollParams() {
        AuthStreamEnrollmentEnrollParams.builder().webhookUrl("https://example.com").build()
    }

    @Test
    fun getBody() {
        val params =
            AuthStreamEnrollmentEnrollParams.builder().webhookUrl("https://example.com").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.webhookUrl()).isEqualTo("https://example.com")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = AuthStreamEnrollmentEnrollParams.builder().build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}
