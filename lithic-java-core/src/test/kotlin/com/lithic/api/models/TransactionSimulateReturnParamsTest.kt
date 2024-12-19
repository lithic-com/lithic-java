// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransactionSimulateReturnParamsTest {

    @Test
    fun createTransactionSimulateReturnParams() {
        TransactionSimulateReturnParams.builder()
            .amount(0L)
            .descriptor("COFFEE SHOP")
            .pan("4111111289144142")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            TransactionSimulateReturnParams.builder()
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

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            TransactionSimulateReturnParams.builder()
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
