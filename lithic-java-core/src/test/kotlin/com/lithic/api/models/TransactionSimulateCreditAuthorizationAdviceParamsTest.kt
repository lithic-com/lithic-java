// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionSimulateCreditAuthorizationAdviceParamsTest {

    @Test
    fun create() {
        TransactionSimulateCreditAuthorizationAdviceParams.builder()
            .amount(3831L)
            .descriptor("COFFEE SHOP")
            .pan("4111111289144142")
            .mcc("5812")
            .merchantAcceptorId("XRKGDPOWEWQRRWU")
            .build()
    }

    @Test
    fun body() {
        val params =
            TransactionSimulateCreditAuthorizationAdviceParams.builder()
                .amount(3831L)
                .descriptor("COFFEE SHOP")
                .pan("4111111289144142")
                .mcc("5812")
                .merchantAcceptorId("XRKGDPOWEWQRRWU")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(3831L)
        assertThat(body.descriptor()).isEqualTo("COFFEE SHOP")
        assertThat(body.pan()).isEqualTo("4111111289144142")
        assertThat(body.mcc()).contains("5812")
        assertThat(body.merchantAcceptorId()).contains("XRKGDPOWEWQRRWU")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TransactionSimulateCreditAuthorizationAdviceParams.builder()
                .amount(3831L)
                .descriptor("COFFEE SHOP")
                .pan("4111111289144142")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(3831L)
        assertThat(body.descriptor()).isEqualTo("COFFEE SHOP")
        assertThat(body.pan()).isEqualTo("4111111289144142")
    }
}
