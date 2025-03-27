// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.transactions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionSimulateVoidParamsTest {

    @Test
    fun create() {
        TransactionSimulateVoidParams.builder()
            .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
            .amount(100L)
            .type(TransactionSimulateVoidParams.Type.AUTHORIZATION_EXPIRY)
            .build()
    }

    @Test
    fun body() {
        val params =
            TransactionSimulateVoidParams.builder()
                .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
                .amount(100L)
                .type(TransactionSimulateVoidParams.Type.AUTHORIZATION_EXPIRY)
                .build()

        val body = params._body()

        assertThat(body.token()).isEqualTo("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
        assertThat(body.amount()).contains(100L)
        assertThat(body.type()).contains(TransactionSimulateVoidParams.Type.AUTHORIZATION_EXPIRY)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TransactionSimulateVoidParams.builder()
                .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
                .build()

        val body = params._body()

        assertThat(body.token()).isEqualTo("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
    }
}
