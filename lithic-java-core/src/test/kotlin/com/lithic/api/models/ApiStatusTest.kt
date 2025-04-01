// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiStatusTest {

    @Test
    fun create() {
        val apiStatus = ApiStatus.builder().message("message").build()

        assertThat(apiStatus.message()).contains("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiStatus = ApiStatus.builder().message("message").build()

        val roundtrippedApiStatus =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiStatus),
                jacksonTypeRef<ApiStatus>(),
            )

        assertThat(roundtrippedApiStatus).isEqualTo(apiStatus)
    }
}
