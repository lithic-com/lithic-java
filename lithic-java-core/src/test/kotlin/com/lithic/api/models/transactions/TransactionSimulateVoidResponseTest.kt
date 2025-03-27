// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.transactions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionSimulateVoidResponseTest {

    @Test
    fun create() {
        val transactionSimulateVoidResponse =
            TransactionSimulateVoidResponse.builder()
                .debuggingRequestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(transactionSimulateVoidResponse.debuggingRequestId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
