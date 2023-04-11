package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.DisputeInitiateEvidenceUploadResponse

class DisputeInitiateEvidenceUploadResponseTest {

    @Test
    fun createDisputeInitiateEvidenceUploadResponse() {
      val disputeInitiateEvidenceUploadResponse = DisputeInitiateEvidenceUploadResponse.builder()
          .uploadUrl("string")
          .build()
      assertThat(disputeInitiateEvidenceUploadResponse).isNotNull
      assertThat(disputeInitiateEvidenceUploadResponse.uploadUrl()).contains("string")
    }
}
