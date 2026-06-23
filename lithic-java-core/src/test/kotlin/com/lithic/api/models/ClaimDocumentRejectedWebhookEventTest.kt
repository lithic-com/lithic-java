// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClaimDocumentRejectedWebhookEventTest {

    @Test
    fun create() {
        val claimDocumentRejectedWebhookEvent =
            ClaimDocumentRejectedWebhookEvent.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .downloadUrl("download_url")
                .downloadUrlExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventType(ClaimDocumentRejectedWebhookEvent.EventType.CLAIM_DOCUMENT_REJECTED)
                .failureReason(ClaimDocumentRejectedWebhookEvent.FailureReason.INVALID_MIME_TYPE)
                .name("name")
                .requirementId("requirement_id")
                .status(ClaimDocumentRejectedWebhookEvent.Status.PENDING)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .uploadConstraints(
                    ClaimDocumentRejectedWebhookEvent.UploadConstraints2.builder()
                        .addAcceptedMimeType("string")
                        .maxSizeBytes(0L)
                        .build()
                )
                .uploadUrl("upload_url")
                .uploadUrlExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(claimDocumentRejectedWebhookEvent.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(claimDocumentRejectedWebhookEvent.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(claimDocumentRejectedWebhookEvent.downloadUrl()).contains("download_url")
        assertThat(claimDocumentRejectedWebhookEvent.downloadUrlExpiresAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(claimDocumentRejectedWebhookEvent.eventType())
            .isEqualTo(ClaimDocumentRejectedWebhookEvent.EventType.CLAIM_DOCUMENT_REJECTED)
        assertThat(claimDocumentRejectedWebhookEvent.failureReason())
            .contains(ClaimDocumentRejectedWebhookEvent.FailureReason.INVALID_MIME_TYPE)
        assertThat(claimDocumentRejectedWebhookEvent.name()).isEqualTo("name")
        assertThat(claimDocumentRejectedWebhookEvent.requirementId()).contains("requirement_id")
        assertThat(claimDocumentRejectedWebhookEvent.status())
            .isEqualTo(ClaimDocumentRejectedWebhookEvent.Status.PENDING)
        assertThat(claimDocumentRejectedWebhookEvent.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(claimDocumentRejectedWebhookEvent.uploadConstraints())
            .contains(
                ClaimDocumentRejectedWebhookEvent.UploadConstraints2.builder()
                    .addAcceptedMimeType("string")
                    .maxSizeBytes(0L)
                    .build()
            )
        assertThat(claimDocumentRejectedWebhookEvent.uploadUrl()).contains("upload_url")
        assertThat(claimDocumentRejectedWebhookEvent.uploadUrlExpiresAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val claimDocumentRejectedWebhookEvent =
            ClaimDocumentRejectedWebhookEvent.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .downloadUrl("download_url")
                .downloadUrlExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventType(ClaimDocumentRejectedWebhookEvent.EventType.CLAIM_DOCUMENT_REJECTED)
                .failureReason(ClaimDocumentRejectedWebhookEvent.FailureReason.INVALID_MIME_TYPE)
                .name("name")
                .requirementId("requirement_id")
                .status(ClaimDocumentRejectedWebhookEvent.Status.PENDING)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .uploadConstraints(
                    ClaimDocumentRejectedWebhookEvent.UploadConstraints2.builder()
                        .addAcceptedMimeType("string")
                        .maxSizeBytes(0L)
                        .build()
                )
                .uploadUrl("upload_url")
                .uploadUrlExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedClaimDocumentRejectedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(claimDocumentRejectedWebhookEvent),
                jacksonTypeRef<ClaimDocumentRejectedWebhookEvent>(),
            )

        assertThat(roundtrippedClaimDocumentRejectedWebhookEvent)
            .isEqualTo(claimDocumentRejectedWebhookEvent)
    }
}
