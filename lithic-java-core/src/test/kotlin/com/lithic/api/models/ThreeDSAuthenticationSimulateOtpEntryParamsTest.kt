// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ThreeDSAuthenticationSimulateOtpEntryParamsTest {

    @Test
    fun create() {
        ThreeDSAuthenticationSimulateOtpEntryParams.builder()
            .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
            .otp("123456")
            .build()
    }

    @Test
    fun body() {
        val params =
            ThreeDSAuthenticationSimulateOtpEntryParams.builder()
                .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
                .otp("123456")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.token()).isEqualTo("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
        assertThat(body.otp()).isEqualTo("123456")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ThreeDSAuthenticationSimulateOtpEntryParams.builder()
                .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
                .otp("123456")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.token()).isEqualTo("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
        assertThat(body.otp()).isEqualTo("123456")
    }
}
