package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransactionSimulateAuthorizationAdviceResponseTest {

    @Test
    fun createTransactionSimulateAuthorizationAdviceResponse() {
        val transactionSimulateAuthorizationAdviceResponse =
            TransactionSimulateAuthorizationAdviceResponse.builder()
                .debuggingRequestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(transactionSimulateAuthorizationAdviceResponse).isNotNull
        assertThat(transactionSimulateAuthorizationAdviceResponse.debuggingRequestId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(transactionSimulateAuthorizationAdviceResponse.token())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
