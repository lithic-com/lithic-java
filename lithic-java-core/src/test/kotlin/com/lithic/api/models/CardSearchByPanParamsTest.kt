// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardSearchByPanParamsTest {

    @Test
    fun createCardSearchByPanParams() {
        CardSearchByPanParams.builder().pan("4111111289144142").build()
    }

    @Test
    fun body() {
        val params = CardSearchByPanParams.builder().pan("4111111289144142").build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.pan()).isEqualTo("4111111289144142")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CardSearchByPanParams.builder().pan("4111111289144142").build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.pan()).isEqualTo("4111111289144142")
    }
}
