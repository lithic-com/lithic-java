// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionSimulateReturnResponseTest {

    @Test
    fun create() {
        val transactionSimulateReturnResponse =
            TransactionSimulateReturnResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .debuggingRequestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(transactionSimulateReturnResponse.token())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(transactionSimulateReturnResponse.debuggingRequestId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionSimulateReturnResponse =
            TransactionSimulateReturnResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .debuggingRequestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedTransactionSimulateReturnResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionSimulateReturnResponse),
                jacksonTypeRef<TransactionSimulateReturnResponse>(),
            )

        assertThat(roundtrippedTransactionSimulateReturnResponse)
            .isEqualTo(transactionSimulateReturnResponse)
    }
}
