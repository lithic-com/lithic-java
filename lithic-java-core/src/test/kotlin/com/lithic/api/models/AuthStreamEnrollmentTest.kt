// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuthStreamEnrollmentTest {

    @Test
    fun createAuthStreamEnrollment() {
        val authStreamEnrollment = AuthStreamEnrollment.builder().enrolled(true).build()
        assertThat(authStreamEnrollment).isNotNull
        assertThat(authStreamEnrollment.enrolled()).contains(true)
    }
}
