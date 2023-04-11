package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.TransactionSimulateCreditAuthorizationResponse

class TransactionSimulateCreditAuthorizationResponseTest {

    @Test
    fun createTransactionSimulateCreditAuthorizationResponse() {
      val transactionSimulateCreditAuthorizationResponse = TransactionSimulateCreditAuthorizationResponse.builder()
          .debuggingRequestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
      assertThat(transactionSimulateCreditAuthorizationResponse).isNotNull
      assertThat(transactionSimulateCreditAuthorizationResponse.debuggingRequestId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(transactionSimulateCreditAuthorizationResponse.token()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
