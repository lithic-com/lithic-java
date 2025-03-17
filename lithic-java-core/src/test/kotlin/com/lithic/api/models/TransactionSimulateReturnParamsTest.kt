// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionSimulateReturnParamsTest {

    @Test
    fun create() {
        TransactionSimulateReturnParams.builder()
            .amount(3831L)
            .descriptor("COFFEE SHOP")
            .pan("4111111289144142")
            .build()
    }

    @Test
    fun body() {
        val params =
            TransactionSimulateReturnParams.builder()
                .amount(3831L)
                .descriptor("COFFEE SHOP")
                .pan("4111111289144142")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.amount()).isEqualTo(3831L)
        assertThat(body.descriptor()).isEqualTo("COFFEE SHOP")
        assertThat(body.pan()).isEqualTo("4111111289144142")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TransactionSimulateReturnParams.builder()
                .amount(3831L)
                .descriptor("COFFEE SHOP")
                .pan("4111111289144142")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.amount()).isEqualTo(3831L)
        assertThat(body.descriptor()).isEqualTo("COFFEE SHOP")
        assertThat(body.pan()).isEqualTo("4111111289144142")
    }
}
