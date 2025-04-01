// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DisputeEvidenceTest {

    @Test
    fun create() {
        val disputeEvidence =
            DisputeEvidence.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .uploadStatus(DisputeEvidence.UploadStatus.DELETED)
                .downloadUrl("download_url")
                .filename("filename")
                .uploadUrl("upload_url")
                .build()

        assertThat(disputeEvidence.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(disputeEvidence.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeEvidence.disputeToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(disputeEvidence.uploadStatus()).isEqualTo(DisputeEvidence.UploadStatus.DELETED)
        assertThat(disputeEvidence.downloadUrl()).contains("download_url")
        assertThat(disputeEvidence.filename()).contains("filename")
        assertThat(disputeEvidence.uploadUrl()).contains("upload_url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val disputeEvidence =
            DisputeEvidence.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .uploadStatus(DisputeEvidence.UploadStatus.DELETED)
                .downloadUrl("download_url")
                .filename("filename")
                .uploadUrl("upload_url")
                .build()

        val roundtrippedDisputeEvidence =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(disputeEvidence),
                jacksonTypeRef<DisputeEvidence>(),
            )

        assertThat(roundtrippedDisputeEvidence).isEqualTo(disputeEvidence)
    }
}
