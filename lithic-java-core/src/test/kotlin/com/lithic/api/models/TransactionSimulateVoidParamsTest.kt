package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransactionSimulateVoidParamsTest {
    @Test
    fun createTransactionSimulateVoidParams() {
        TransactionSimulateVoidParams.builder()
            .amount(123L)
            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .type(TransactionSimulateVoidParams.Type.AUTHORIZATION_EXPIRY)
            .build()
    }

    @Test
    fun toBody() {
        val params =
            TransactionSimulateVoidParams.builder()
                .amount(123L)
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(TransactionSimulateVoidParams.Type.AUTHORIZATION_EXPIRY)
                .build()
        val body = params.toBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.type()).isEqualTo(TransactionSimulateVoidParams.Type.AUTHORIZATION_EXPIRY)
    }

    @Test
    fun toBodyWithoutOptionalFields() {
        val params =
            TransactionSimulateVoidParams.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.toBody()
        assertThat(body).isNotNull
        assertThat(body.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
