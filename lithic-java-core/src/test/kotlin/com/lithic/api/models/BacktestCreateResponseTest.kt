// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BacktestCreateResponseTest {

    @Test
    fun create() {
        val backtestCreateResponse =
            BacktestCreateResponse.builder()
                .backtestToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(backtestCreateResponse.backtestToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val backtestCreateResponse =
            BacktestCreateResponse.builder()
                .backtestToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedBacktestCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(backtestCreateResponse),
                jacksonTypeRef<BacktestCreateResponse>(),
            )

        assertThat(roundtrippedBacktestCreateResponse).isEqualTo(backtestCreateResponse)
    }
}
