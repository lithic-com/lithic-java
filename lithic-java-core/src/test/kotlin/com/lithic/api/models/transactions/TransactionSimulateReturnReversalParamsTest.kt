// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.transactions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionSimulateReturnReversalParamsTest {

    @Test
    fun create() {
        TransactionSimulateReturnReversalParams.builder()
            .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
            .build()
    }

    @Test
    fun body() {
        val params =
            TransactionSimulateReturnReversalParams.builder()
                .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
                .build()

        val body = params._body()

        assertThat(body.token()).isEqualTo("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
    }
}
