package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransactionSimulateCreditAuthorizationParamsTest {

    @Test
    fun createTransactionSimulateCreditAuthorizationParams() {
        TransactionSimulateCreditAuthorizationParams.builder()
            .amount(123L)
            .descriptor("COFFEE SHOP")
            .pan("4111111289144142")
            .merchantAcceptorId("XRKGDPOWEWQRRWU")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            TransactionSimulateCreditAuthorizationParams.builder()
                .amount(123L)
                .descriptor("COFFEE SHOP")
                .pan("4111111289144142")
                .merchantAcceptorId("XRKGDPOWEWQRRWU")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.descriptor()).isEqualTo("COFFEE SHOP")
        assertThat(body.pan()).isEqualTo("4111111289144142")
        assertThat(body.merchantAcceptorId()).isEqualTo("XRKGDPOWEWQRRWU")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            TransactionSimulateCreditAuthorizationParams.builder()
                .amount(123L)
                .descriptor("COFFEE SHOP")
                .pan("4111111289144142")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.descriptor()).isEqualTo("COFFEE SHOP")
        assertThat(body.pan()).isEqualTo("4111111289144142")
    }
}
