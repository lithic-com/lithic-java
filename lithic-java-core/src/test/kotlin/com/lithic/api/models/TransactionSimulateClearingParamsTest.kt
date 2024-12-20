// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransactionSimulateClearingParamsTest {

    @Test
    fun createTransactionSimulateClearingParams() {
        TransactionSimulateClearingParams.builder()
            .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
            .amount(0L)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            TransactionSimulateClearingParams.builder()
                .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
                .amount(0L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.token()).isEqualTo("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
        assertThat(body.amount()).contains(0L)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            TransactionSimulateClearingParams.builder()
                .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.token()).isEqualTo("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
    }
}
