// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionSimulateCreditAuthorizationParamsTest {

    @Test
    fun create() {
        TransactionSimulateCreditAuthorizationParams.builder()
            .amount(3831L)
            .descriptor("COFFEE SHOP")
            .pan("4111111289144142")
            .mcc("5812")
            .merchantAcceptorCity("SEATTLE")
            .merchantAcceptorCountry("USA")
            .merchantAcceptorId("XRKGDPOWEWQRRWU")
            .merchantAcceptorState("WA")
            .build()
    }

    @Test
    fun body() {
        val params =
            TransactionSimulateCreditAuthorizationParams.builder()
                .amount(3831L)
                .descriptor("COFFEE SHOP")
                .pan("4111111289144142")
                .mcc("5812")
                .merchantAcceptorCity("SEATTLE")
                .merchantAcceptorCountry("USA")
                .merchantAcceptorId("XRKGDPOWEWQRRWU")
                .merchantAcceptorState("WA")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(3831L)
        assertThat(body.descriptor()).isEqualTo("COFFEE SHOP")
        assertThat(body.pan()).isEqualTo("4111111289144142")
        assertThat(body.mcc()).contains("5812")
        assertThat(body.merchantAcceptorCity()).contains("SEATTLE")
        assertThat(body.merchantAcceptorCountry()).contains("USA")
        assertThat(body.merchantAcceptorId()).contains("XRKGDPOWEWQRRWU")
        assertThat(body.merchantAcceptorState()).contains("WA")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TransactionSimulateCreditAuthorizationParams.builder()
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
