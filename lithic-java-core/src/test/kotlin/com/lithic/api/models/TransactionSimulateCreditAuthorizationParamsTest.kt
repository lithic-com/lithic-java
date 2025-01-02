// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransactionSimulateCreditAuthorizationParamsTest {

    @Test
    fun createTransactionSimulateCreditAuthorizationParams() {
        TransactionSimulateCreditAuthorizationParams.builder()
            .amount(0L)
            .descriptor("COFFEE SHOP")
            .pan("4111111289144142")
            .mcc("5812")
            .merchantAcceptorId("XRKGDPOWEWQRRWU")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            TransactionSimulateCreditAuthorizationParams.builder()
                .amount(0L)
                .descriptor("COFFEE SHOP")
                .pan("4111111289144142")
                .mcc("5812")
                .merchantAcceptorId("XRKGDPOWEWQRRWU")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.descriptor()).isEqualTo("COFFEE SHOP")
        assertThat(body.pan()).isEqualTo("4111111289144142")
        assertThat(body.mcc()).contains("5812")
        assertThat(body.merchantAcceptorId()).contains("XRKGDPOWEWQRRWU")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            TransactionSimulateCreditAuthorizationParams.builder()
                .amount(0L)
                .descriptor("COFFEE SHOP")
                .pan("4111111289144142")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.descriptor()).isEqualTo("COFFEE SHOP")
        assertThat(body.pan()).isEqualTo("4111111289144142")
    }
}
