// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiStatusTest {

    @Test
    fun create() {
        val apiStatus = ApiStatus.builder().message("message").build()

        assertThat(apiStatus.message()).contains("message")
    }
}
