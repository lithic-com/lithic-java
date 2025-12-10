// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DisputeEvidenceUploadFailedWebhookEventTest {

    @Test
    fun create() {
        val disputeEvidenceUploadFailedWebhookEvent =
            DisputeEvidenceUploadFailedWebhookEvent.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .uploadStatus(DisputeEvidence.UploadStatus.DELETED)
                .downloadUrl("download_url")
                .filename("filename")
                .uploadUrl("upload_url")
                .eventType(
                    DisputeEvidenceUploadFailedWebhookEvent.EventType.DISPUTE_EVIDENCE_UPLOAD_FAILED
                )
                .build()

        assertThat(disputeEvidenceUploadFailedWebhookEvent.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(disputeEvidenceUploadFailedWebhookEvent.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeEvidenceUploadFailedWebhookEvent.disputeToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(disputeEvidenceUploadFailedWebhookEvent.uploadStatus())
            .isEqualTo(DisputeEvidence.UploadStatus.DELETED)
        assertThat(disputeEvidenceUploadFailedWebhookEvent.downloadUrl()).contains("download_url")
        assertThat(disputeEvidenceUploadFailedWebhookEvent.filename()).contains("filename")
        assertThat(disputeEvidenceUploadFailedWebhookEvent.uploadUrl()).contains("upload_url")
        assertThat(disputeEvidenceUploadFailedWebhookEvent.eventType())
            .isEqualTo(
                DisputeEvidenceUploadFailedWebhookEvent.EventType.DISPUTE_EVIDENCE_UPLOAD_FAILED
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val disputeEvidenceUploadFailedWebhookEvent =
            DisputeEvidenceUploadFailedWebhookEvent.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .uploadStatus(DisputeEvidence.UploadStatus.DELETED)
                .downloadUrl("download_url")
                .filename("filename")
                .uploadUrl("upload_url")
                .eventType(
                    DisputeEvidenceUploadFailedWebhookEvent.EventType.DISPUTE_EVIDENCE_UPLOAD_FAILED
                )
                .build()

        val roundtrippedDisputeEvidenceUploadFailedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(disputeEvidenceUploadFailedWebhookEvent),
                jacksonTypeRef<DisputeEvidenceUploadFailedWebhookEvent>(),
            )

        assertThat(roundtrippedDisputeEvidenceUploadFailedWebhookEvent)
            .isEqualTo(disputeEvidenceUploadFailedWebhookEvent)
    }
}
