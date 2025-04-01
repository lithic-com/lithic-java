// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionSimulateAuthorizationResponseTest {

    @Test
    fun create() {
        val transactionSimulateAuthorizationResponse =
            TransactionSimulateAuthorizationResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .debuggingRequestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(transactionSimulateAuthorizationResponse.token())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(transactionSimulateAuthorizationResponse.debuggingRequestId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionSimulateAuthorizationResponse =
            TransactionSimulateAuthorizationResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .debuggingRequestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedTransactionSimulateAuthorizationResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionSimulateAuthorizationResponse),
                jacksonTypeRef<TransactionSimulateAuthorizationResponse>(),
            )

        assertThat(roundtrippedTransactionSimulateAuthorizationResponse)
            .isEqualTo(transactionSimulateAuthorizationResponse)
    }
}
