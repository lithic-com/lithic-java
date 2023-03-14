package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DisputeInitiateEvidenceUploadResponseTest {

    @Test
    fun createDisputeInitiateEvidenceUploadResponse() {
        val disputeInitiateEvidenceUploadResponse =
            DisputeInitiateEvidenceUploadResponse.builder().uploadUrl("string").build()
        assertThat(disputeInitiateEvidenceUploadResponse).isNotNull
        assertThat(disputeInitiateEvidenceUploadResponse.uploadUrl()).contains("string")
    }
}
