// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionMonitoringCaseFileListPageResponseTest {

    @Test
    fun create() {
        val transactionMonitoringCaseFileListPageResponse =
            TransactionMonitoringCaseFileListPageResponse.builder()
                .addData(
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
                )
                .hasMore(true)
                .build()

        assertThat(transactionMonitoringCaseFileListPageResponse.data())
            .containsExactly(
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
            )
        assertThat(transactionMonitoringCaseFileListPageResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionMonitoringCaseFileListPageResponse =
            TransactionMonitoringCaseFileListPageResponse.builder()
                .addData(
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
                )
                .hasMore(true)
                .build()

        val roundtrippedTransactionMonitoringCaseFileListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionMonitoringCaseFileListPageResponse),
                jacksonTypeRef<TransactionMonitoringCaseFileListPageResponse>(),
            )

        assertThat(roundtrippedTransactionMonitoringCaseFileListPageResponse)
            .isEqualTo(transactionMonitoringCaseFileListPageResponse)
    }
}
