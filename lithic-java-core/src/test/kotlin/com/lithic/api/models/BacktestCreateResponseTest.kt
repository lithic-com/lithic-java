// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BacktestCreateResponseTest {

    @Test
    fun createBacktestCreateResponse() {
        val backtestCreateResponse =
            BacktestCreateResponse.builder()
                .backtestToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(backtestCreateResponse).isNotNull
        assertThat(backtestCreateResponse.backtestToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}