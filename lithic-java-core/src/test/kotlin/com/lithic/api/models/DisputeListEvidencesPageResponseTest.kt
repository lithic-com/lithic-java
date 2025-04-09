// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DisputeListEvidencesPageResponseTest {

    @Test
    fun create() {
        val disputeListEvidencesPageResponse =
            DisputeListEvidencesPageResponse.builder()
                .addData(
                    DisputeEvidence.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .uploadStatus(DisputeEvidence.UploadStatus.DELETED)
                        .downloadUrl("download_url")
                        .filename("filename")
                        .uploadUrl("upload_url")
                        .build()
                )
                .hasMore(true)
                .build()

        assertThat(disputeListEvidencesPageResponse.data())
            .containsExactly(
                DisputeEvidence.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .uploadStatus(DisputeEvidence.UploadStatus.DELETED)
                    .downloadUrl("download_url")
                    .filename("filename")
                    .uploadUrl("upload_url")
                    .build()
            )
        assertThat(disputeListEvidencesPageResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val disputeListEvidencesPageResponse =
            DisputeListEvidencesPageResponse.builder()
                .addData(
                    DisputeEvidence.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .uploadStatus(DisputeEvidence.UploadStatus.DELETED)
                        .downloadUrl("download_url")
                        .filename("filename")
                        .uploadUrl("upload_url")
                        .build()
                )
                .hasMore(true)
                .build()

        val roundtrippedDisputeListEvidencesPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(disputeListEvidencesPageResponse),
                jacksonTypeRef<DisputeListEvidencesPageResponse>(),
            )

        assertThat(roundtrippedDisputeListEvidencesPageResponse)
            .isEqualTo(disputeListEvidencesPageResponse)
    }
}
