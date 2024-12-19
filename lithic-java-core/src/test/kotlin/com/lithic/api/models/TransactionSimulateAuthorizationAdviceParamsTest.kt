// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransactionSimulateAuthorizationAdviceParamsTest {

    @Test
    fun createTransactionSimulateAuthorizationAdviceParams() {
        TransactionSimulateAuthorizationAdviceParams.builder()
            .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
            .amount(3831L)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            TransactionSimulateAuthorizationAdviceParams.builder()
                .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
                .amount(3831L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.token()).isEqualTo("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
        assertThat(body.amount()).isEqualTo(3831L)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            TransactionSimulateAuthorizationAdviceParams.builder()
                .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
                .amount(3831L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.token()).isEqualTo("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
        assertThat(body.amount()).isEqualTo(3831L)
    }
}
