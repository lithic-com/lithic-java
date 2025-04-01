// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionSimulateAuthorizationAdviceResponseTest {

    @Test
    fun create() {
        val transactionSimulateAuthorizationAdviceResponse =
            TransactionSimulateAuthorizationAdviceResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .debuggingRequestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(transactionSimulateAuthorizationAdviceResponse.token())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(transactionSimulateAuthorizationAdviceResponse.debuggingRequestId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionSimulateAuthorizationAdviceResponse =
            TransactionSimulateAuthorizationAdviceResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .debuggingRequestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedTransactionSimulateAuthorizationAdviceResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionSimulateAuthorizationAdviceResponse),
                jacksonTypeRef<TransactionSimulateAuthorizationAdviceResponse>(),
            )

        assertThat(roundtrippedTransactionSimulateAuthorizationAdviceResponse)
            .isEqualTo(transactionSimulateAuthorizationAdviceResponse)
    }
}
