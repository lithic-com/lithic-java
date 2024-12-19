// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransactionSimulateReturnReversalParamsTest {

    @Test
    fun createTransactionSimulateReturnReversalParams() {
        TransactionSimulateReturnReversalParams.builder()
            .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            TransactionSimulateReturnReversalParams.builder()
                .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.token()).isEqualTo("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            TransactionSimulateReturnReversalParams.builder()
                .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.token()).isEqualTo("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
    }
}
