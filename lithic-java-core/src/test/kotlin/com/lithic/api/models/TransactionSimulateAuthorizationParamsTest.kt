package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransactionSimulateAuthorizationParamsTest {

    @Test
    fun createTransactionSimulateAuthorizationParams() {
        TransactionSimulateAuthorizationParams.builder()
            .amount(123L)
            .descriptor("COFFEE SHOP")
            .pan("4111111289144142")
            .status(TransactionSimulateAuthorizationParams.Status.AUTHORIZATION)
            .merchantCurrency("GBP")
            .merchantAmount(123L)
            .partialApprovalCapable(true)
            .build()
    }

    @Test
    fun toBody() {
        val params =
            TransactionSimulateAuthorizationParams.builder()
                .amount(123L)
                .descriptor("COFFEE SHOP")
                .pan("4111111289144142")
                .status(TransactionSimulateAuthorizationParams.Status.AUTHORIZATION)
                .merchantCurrency("GBP")
                .merchantAmount(123L)
                .partialApprovalCapable(true)
                .build()
        val body = params.toBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.descriptor()).isEqualTo("COFFEE SHOP")
        assertThat(body.pan()).isEqualTo("4111111289144142")
        assertThat(body.status())
            .isEqualTo(TransactionSimulateAuthorizationParams.Status.AUTHORIZATION)
        assertThat(body.merchantCurrency()).isEqualTo("GBP")
        assertThat(body.merchantAmount()).isEqualTo(123L)
        assertThat(body.partialApprovalCapable()).isEqualTo(true)
    }

    @Test
    fun toBodyWithoutOptionalFields() {
        val params =
            TransactionSimulateAuthorizationParams.builder()
                .amount(123L)
                .descriptor("COFFEE SHOP")
                .pan("4111111289144142")
                .build()
        val body = params.toBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.descriptor()).isEqualTo("COFFEE SHOP")
        assertThat(body.pan()).isEqualTo("4111111289144142")
    }
}
