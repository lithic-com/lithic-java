// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClaimDocumentUploadedWebhookEventTest {

    @Test
    fun create() {
        val claimDocumentUploadedWebhookEvent =
            ClaimDocumentUploadedWebhookEvent.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .downloadUrl("download_url")
                .downloadUrlExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventType(ClaimDocumentUploadedWebhookEvent.EventType.CLAIM_DOCUMENT_UPLOADED)
                .failureReason(ClaimDocumentUploadedWebhookEvent.FailureReason.INVALID_MIME_TYPE)
                .name("name")
                .requirementId("requirement_id")
                .status(ClaimDocumentUploadedWebhookEvent.Status.PENDING)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .uploadConstraints(
                    ClaimDocumentUploadedWebhookEvent.UploadConstraints2.builder()
                        .addAcceptedMimeType("string")
                        .maxSizeBytes(0L)
                        .build()
                )
                .uploadUrl("upload_url")
                .uploadUrlExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(claimDocumentUploadedWebhookEvent.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(claimDocumentUploadedWebhookEvent.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(claimDocumentUploadedWebhookEvent.downloadUrl()).contains("download_url")
        assertThat(claimDocumentUploadedWebhookEvent.downloadUrlExpiresAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(claimDocumentUploadedWebhookEvent.eventType())
            .isEqualTo(ClaimDocumentUploadedWebhookEvent.EventType.CLAIM_DOCUMENT_UPLOADED)
        assertThat(claimDocumentUploadedWebhookEvent.failureReason())
            .contains(ClaimDocumentUploadedWebhookEvent.FailureReason.INVALID_MIME_TYPE)
        assertThat(claimDocumentUploadedWebhookEvent.name()).isEqualTo("name")
        assertThat(claimDocumentUploadedWebhookEvent.requirementId()).contains("requirement_id")
        assertThat(claimDocumentUploadedWebhookEvent.status())
            .isEqualTo(ClaimDocumentUploadedWebhookEvent.Status.PENDING)
        assertThat(claimDocumentUploadedWebhookEvent.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(claimDocumentUploadedWebhookEvent.uploadConstraints())
            .contains(
                ClaimDocumentUploadedWebhookEvent.UploadConstraints2.builder()
                    .addAcceptedMimeType("string")
                    .maxSizeBytes(0L)
                    .build()
            )
        assertThat(claimDocumentUploadedWebhookEvent.uploadUrl()).contains("upload_url")
        assertThat(claimDocumentUploadedWebhookEvent.uploadUrlExpiresAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val claimDocumentUploadedWebhookEvent =
            ClaimDocumentUploadedWebhookEvent.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .downloadUrl("download_url")
                .downloadUrlExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventType(ClaimDocumentUploadedWebhookEvent.EventType.CLAIM_DOCUMENT_UPLOADED)
                .failureReason(ClaimDocumentUploadedWebhookEvent.FailureReason.INVALID_MIME_TYPE)
                .name("name")
                .requirementId("requirement_id")
                .status(ClaimDocumentUploadedWebhookEvent.Status.PENDING)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .uploadConstraints(
                    ClaimDocumentUploadedWebhookEvent.UploadConstraints2.builder()
                        .addAcceptedMimeType("string")
                        .maxSizeBytes(0L)
                        .build()
                )
                .uploadUrl("upload_url")
                .uploadUrlExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedClaimDocumentUploadedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(claimDocumentUploadedWebhookEvent),
                jacksonTypeRef<ClaimDocumentUploadedWebhookEvent>(),
            )

        assertThat(roundtrippedClaimDocumentUploadedWebhookEvent)
            .isEqualTo(claimDocumentUploadedWebhookEvent)
    }
}
