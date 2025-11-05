// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountHolderListDocumentsResponseTest {

    @Test
    fun create() {
        val accountHolderListDocumentsResponse =
            AccountHolderListDocumentsResponse.builder()
                .addData(
                    Document.builder()
                        .token("f41c975e-cad8-4e4f-a5cb-cef92ed91083")
                        .accountHolderToken("aab6ad9a-3630-4cd0-bbec-1a0fa5c7e149")
                        .documentType(Document.DocumentType.EIN_LETTER)
                        .entityToken("b50a84c9-8e86-4016-b1c7-0b9f71d4bb84")
                        .addRequiredDocumentUpload(
                            Document.RequiredDocumentUpload.builder()
                                .token("e254beee-67db-4d8c-b610-306ee07de886")
                                .addAcceptedEntityStatusReason("string")
                                .created(OffsetDateTime.parse("2024-09-18T12:34:56Z"))
                                .imageType(Document.RequiredDocumentUpload.ImageType.FRONT)
                                .addRejectedEntityStatusReason("string")
                                .status(
                                    Document.RequiredDocumentUpload.DocumentUploadStatus
                                        .PENDING_UPLOAD
                                )
                                .addStatusReason(
                                    Document.RequiredDocumentUpload.DocumentUploadStatusReasons
                                        .DOCUMENT_MISSING_REQUIRED_DATA
                                )
                                .updated(OffsetDateTime.parse("2024-09-18T12:34:56Z"))
                                .uploadUrl("https://lithic-document-verification-uploads.com")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(accountHolderListDocumentsResponse.data().getOrNull())
            .containsExactly(
                Document.builder()
                    .token("f41c975e-cad8-4e4f-a5cb-cef92ed91083")
                    .accountHolderToken("aab6ad9a-3630-4cd0-bbec-1a0fa5c7e149")
                    .documentType(Document.DocumentType.EIN_LETTER)
                    .entityToken("b50a84c9-8e86-4016-b1c7-0b9f71d4bb84")
                    .addRequiredDocumentUpload(
                        Document.RequiredDocumentUpload.builder()
                            .token("e254beee-67db-4d8c-b610-306ee07de886")
                            .addAcceptedEntityStatusReason("string")
                            .created(OffsetDateTime.parse("2024-09-18T12:34:56Z"))
                            .imageType(Document.RequiredDocumentUpload.ImageType.FRONT)
                            .addRejectedEntityStatusReason("string")
                            .status(
                                Document.RequiredDocumentUpload.DocumentUploadStatus.PENDING_UPLOAD
                            )
                            .addStatusReason(
                                Document.RequiredDocumentUpload.DocumentUploadStatusReasons
                                    .DOCUMENT_MISSING_REQUIRED_DATA
                            )
                            .updated(OffsetDateTime.parse("2024-09-18T12:34:56Z"))
                            .uploadUrl("https://lithic-document-verification-uploads.com")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountHolderListDocumentsResponse =
            AccountHolderListDocumentsResponse.builder()
                .addData(
                    Document.builder()
                        .token("f41c975e-cad8-4e4f-a5cb-cef92ed91083")
                        .accountHolderToken("aab6ad9a-3630-4cd0-bbec-1a0fa5c7e149")
                        .documentType(Document.DocumentType.EIN_LETTER)
                        .entityToken("b50a84c9-8e86-4016-b1c7-0b9f71d4bb84")
                        .addRequiredDocumentUpload(
                            Document.RequiredDocumentUpload.builder()
                                .token("e254beee-67db-4d8c-b610-306ee07de886")
                                .addAcceptedEntityStatusReason("string")
                                .created(OffsetDateTime.parse("2024-09-18T12:34:56Z"))
                                .imageType(Document.RequiredDocumentUpload.ImageType.FRONT)
                                .addRejectedEntityStatusReason("string")
                                .status(
                                    Document.RequiredDocumentUpload.DocumentUploadStatus
                                        .PENDING_UPLOAD
                                )
                                .addStatusReason(
                                    Document.RequiredDocumentUpload.DocumentUploadStatusReasons
                                        .DOCUMENT_MISSING_REQUIRED_DATA
                                )
                                .updated(OffsetDateTime.parse("2024-09-18T12:34:56Z"))
                                .uploadUrl("https://lithic-document-verification-uploads.com")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedAccountHolderListDocumentsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountHolderListDocumentsResponse),
                jacksonTypeRef<AccountHolderListDocumentsResponse>(),
            )

        assertThat(roundtrippedAccountHolderListDocumentsResponse)
            .isEqualTo(accountHolderListDocumentsResponse)
    }
}
