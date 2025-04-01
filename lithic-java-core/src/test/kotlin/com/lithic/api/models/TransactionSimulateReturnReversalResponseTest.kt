// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionSimulateReturnReversalResponseTest {

    @Test
    fun create() {
        val transactionSimulateReturnReversalResponse =
            TransactionSimulateReturnReversalResponse.builder()
                .debuggingRequestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(transactionSimulateReturnReversalResponse.debuggingRequestId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionSimulateReturnReversalResponse =
            TransactionSimulateReturnReversalResponse.builder()
                .debuggingRequestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedTransactionSimulateReturnReversalResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionSimulateReturnReversalResponse),
                jacksonTypeRef<TransactionSimulateReturnReversalResponse>(),
            )

        assertThat(roundtrippedTransactionSimulateReturnReversalResponse)
            .isEqualTo(transactionSimulateReturnReversalResponse)
    }
}
