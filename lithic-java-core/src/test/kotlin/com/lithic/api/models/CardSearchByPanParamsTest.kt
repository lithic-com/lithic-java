// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardSearchByPanParamsTest {

    @Test
    fun create() {
        CardSearchByPanParams.builder().pan("4111111289144142").build()
    }

    @Test
    fun body() {
        val params = CardSearchByPanParams.builder().pan("4111111289144142").build()

        val body = params._body()

        assertThat(body.pan()).isEqualTo("4111111289144142")
    }
}
