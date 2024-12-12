// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransactionSimulateVoidParamsTest {

    @Test
    fun createTransactionSimulateVoidParams() {
        TransactionSimulateVoidParams.builder()
            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .amount(0L)
            .type(TransactionSimulateVoidParams.Type.AUTHORIZATION_EXPIRY)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            TransactionSimulateVoidParams.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0L)
                .type(TransactionSimulateVoidParams.Type.AUTHORIZATION_EXPIRY)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.type()).isEqualTo(TransactionSimulateVoidParams.Type.AUTHORIZATION_EXPIRY)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            TransactionSimulateVoidParams.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
