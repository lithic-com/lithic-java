// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DisputeEvidenceTest {

    @Test
    fun createDisputeEvidence() {
        val disputeEvidence =
            DisputeEvidence.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .uploadStatus(DisputeEvidence.UploadStatus.DELETED)
                .downloadUrl("string")
                .filename("string")
                .uploadUrl("string")
                .build()
        assertThat(disputeEvidence).isNotNull
        assertThat(disputeEvidence.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(disputeEvidence.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeEvidence.disputeToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(disputeEvidence.uploadStatus()).isEqualTo(DisputeEvidence.UploadStatus.DELETED)
        assertThat(disputeEvidence.downloadUrl()).contains("string")
        assertThat(disputeEvidence.filename()).contains("string")
        assertThat(disputeEvidence.uploadUrl()).contains("string")
    }
}
