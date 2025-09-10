// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionSimulateCreditAuthorizationAdviceResponseTest {

    @Test
    fun create() {
        val transactionSimulateCreditAuthorizationAdviceResponse =
            TransactionSimulateCreditAuthorizationAdviceResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .debuggingRequestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(transactionSimulateCreditAuthorizationAdviceResponse.token())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(transactionSimulateCreditAuthorizationAdviceResponse.debuggingRequestId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionSimulateCreditAuthorizationAdviceResponse =
            TransactionSimulateCreditAuthorizationAdviceResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .debuggingRequestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedTransactionSimulateCreditAuthorizationAdviceResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionSimulateCreditAuthorizationAdviceResponse),
                jacksonTypeRef<TransactionSimulateCreditAuthorizationAdviceResponse>(),
            )

        assertThat(roundtrippedTransactionSimulateCreditAuthorizationAdviceResponse)
            .isEqualTo(transactionSimulateCreditAuthorizationAdviceResponse)
    }
}
