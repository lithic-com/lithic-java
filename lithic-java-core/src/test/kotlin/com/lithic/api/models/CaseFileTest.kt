// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CaseFileTest {

    @Test
    fun create() {
        val caseFile =
            CaseFile.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .downloadUrl("download_url")
                .downloadUrlExpires(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .failureReason("failure_reason")
                .mimeType("mime_type")
                .name("name")
                .sizeBytes(0L)
                .status(FileStatus.PENDING)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .uploadConstraints(
                    UploadConstraints.builder()
                        .addAcceptedMimeType("string")
                        .maxSizeBytes(0L)
                        .build()
                )
                .uploadUrl("upload_url")
                .uploadUrlExpires(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(caseFile.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(caseFile.created()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(caseFile.downloadUrl()).contains("download_url")
        assertThat(caseFile.downloadUrlExpires())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(caseFile.failureReason()).contains("failure_reason")
        assertThat(caseFile.mimeType()).contains("mime_type")
        assertThat(caseFile.name()).isEqualTo("name")
        assertThat(caseFile.sizeBytes()).contains(0L)
        assertThat(caseFile.status()).isEqualTo(FileStatus.PENDING)
        assertThat(caseFile.updated()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(caseFile.uploadConstraints())
            .contains(
                UploadConstraints.builder().addAcceptedMimeType("string").maxSizeBytes(0L).build()
            )
        assertThat(caseFile.uploadUrl()).contains("upload_url")
        assertThat(caseFile.uploadUrlExpires())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val caseFile =
            CaseFile.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .downloadUrl("download_url")
                .downloadUrlExpires(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .failureReason("failure_reason")
                .mimeType("mime_type")
                .name("name")
                .sizeBytes(0L)
                .status(FileStatus.PENDING)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .uploadConstraints(
                    UploadConstraints.builder()
                        .addAcceptedMimeType("string")
                        .maxSizeBytes(0L)
                        .build()
                )
                .uploadUrl("upload_url")
                .uploadUrlExpires(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedCaseFile =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(caseFile),
                jacksonTypeRef<CaseFile>(),
            )

        assertThat(roundtrippedCaseFile).isEqualTo(caseFile)
    }
}
