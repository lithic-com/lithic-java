// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClaimDocumentAcceptedWebhookEventTest {

    @Test
    fun create() {
        val claimDocumentAcceptedWebhookEvent =
            ClaimDocumentAcceptedWebhookEvent.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .downloadUrl("download_url")
                .downloadUrlExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventType(ClaimDocumentAcceptedWebhookEvent.EventType.CLAIM_DOCUMENT_ACCEPTED)
                .failureReason(ClaimDocumentAcceptedWebhookEvent.FailureReason.INVALID_MIME_TYPE)
                .name("name")
                .requirementId("requirement_id")
                .status(ClaimDocumentAcceptedWebhookEvent.Status.PENDING)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .uploadConstraints(
                    ClaimDocumentAcceptedWebhookEvent.UploadConstraints2.builder()
                        .addAcceptedMimeType("string")
                        .maxSizeBytes(0L)
                        .build()
                )
                .uploadUrl("upload_url")
                .uploadUrlExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(claimDocumentAcceptedWebhookEvent.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(claimDocumentAcceptedWebhookEvent.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(claimDocumentAcceptedWebhookEvent.downloadUrl()).contains("download_url")
        assertThat(claimDocumentAcceptedWebhookEvent.downloadUrlExpiresAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(claimDocumentAcceptedWebhookEvent.eventType())
            .isEqualTo(ClaimDocumentAcceptedWebhookEvent.EventType.CLAIM_DOCUMENT_ACCEPTED)
        assertThat(claimDocumentAcceptedWebhookEvent.failureReason())
            .contains(ClaimDocumentAcceptedWebhookEvent.FailureReason.INVALID_MIME_TYPE)
        assertThat(claimDocumentAcceptedWebhookEvent.name()).isEqualTo("name")
        assertThat(claimDocumentAcceptedWebhookEvent.requirementId()).contains("requirement_id")
        assertThat(claimDocumentAcceptedWebhookEvent.status())
            .isEqualTo(ClaimDocumentAcceptedWebhookEvent.Status.PENDING)
        assertThat(claimDocumentAcceptedWebhookEvent.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(claimDocumentAcceptedWebhookEvent.uploadConstraints())
            .contains(
                ClaimDocumentAcceptedWebhookEvent.UploadConstraints2.builder()
                    .addAcceptedMimeType("string")
                    .maxSizeBytes(0L)
                    .build()
            )
        assertThat(claimDocumentAcceptedWebhookEvent.uploadUrl()).contains("upload_url")
        assertThat(claimDocumentAcceptedWebhookEvent.uploadUrlExpiresAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val claimDocumentAcceptedWebhookEvent =
            ClaimDocumentAcceptedWebhookEvent.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .downloadUrl("download_url")
                .downloadUrlExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventType(ClaimDocumentAcceptedWebhookEvent.EventType.CLAIM_DOCUMENT_ACCEPTED)
                .failureReason(ClaimDocumentAcceptedWebhookEvent.FailureReason.INVALID_MIME_TYPE)
                .name("name")
                .requirementId("requirement_id")
                .status(ClaimDocumentAcceptedWebhookEvent.Status.PENDING)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .uploadConstraints(
                    ClaimDocumentAcceptedWebhookEvent.UploadConstraints2.builder()
                        .addAcceptedMimeType("string")
                        .maxSizeBytes(0L)
                        .build()
                )
                .uploadUrl("upload_url")
                .uploadUrlExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedClaimDocumentAcceptedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(claimDocumentAcceptedWebhookEvent),
                jacksonTypeRef<ClaimDocumentAcceptedWebhookEvent>(),
            )

        assertThat(roundtrippedClaimDocumentAcceptedWebhookEvent)
            .isEqualTo(claimDocumentAcceptedWebhookEvent)
    }
}
