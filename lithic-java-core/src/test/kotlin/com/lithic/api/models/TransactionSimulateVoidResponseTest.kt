package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.TransactionSimulateVoidResponse

class TransactionSimulateVoidResponseTest {

    @Test
    fun createTransactionSimulateVoidResponse() {
      val transactionSimulateVoidResponse = TransactionSimulateVoidResponse.builder()
          .debuggingRequestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
      assertThat(transactionSimulateVoidResponse).isNotNull
      assertThat(transactionSimulateVoidResponse.debuggingRequestId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
