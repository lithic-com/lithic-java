// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DocumentTest {

    @Test
    fun createDocument() {
        val document =
            Document.builder()
                .token("f41c975e-cad8-4e4f-a5cb-cef92ed91083")
                .accountHolderToken("aab6ad9a-3630-4cd0-bbec-1a0fa5c7e149")
                .documentType(Document.DocumentType.DRIVERS_LICENSE)
                .entityToken("b50a84c9-8e86-4016-b1c7-0b9f71d4bb84")
                .requiredDocumentUploads(
                    listOf(
                        Document.RequiredDocumentUpload.builder()
                            .token("e254beee-67db-4d8c-b610-306ee07de886")
                            .acceptedEntityStatusReasons(listOf("string"))
                            .created(OffsetDateTime.parse("2024-09-18T12:34:56Z"))
                            .imageType(Document.RequiredDocumentUpload.ImageType.FRONT)
                            .rejectedEntityStatusReasons(listOf("string"))
                            .status(Document.RequiredDocumentUpload.DocumentUploadStatus.ACCEPTED)
                            .statusReasons(
                                listOf(
                                    Document.RequiredDocumentUpload.DocumentUploadStatusReasons
                                        .DOCUMENT_MISSING_REQUIRED_DATA
                                )
                            )
                            .updated(OffsetDateTime.parse("2024-09-18T12:34:56Z"))
                            .uploadUrl("https://lithic-document-verification-uploads.com")
                            .build()
                    )
                )
                .build()
        assertThat(document).isNotNull
        assertThat(document.token()).isEqualTo("f41c975e-cad8-4e4f-a5cb-cef92ed91083")
        assertThat(document.accountHolderToken()).isEqualTo("aab6ad9a-3630-4cd0-bbec-1a0fa5c7e149")
        assertThat(document.documentType()).isEqualTo(Document.DocumentType.DRIVERS_LICENSE)
        assertThat(document.entityToken()).isEqualTo("b50a84c9-8e86-4016-b1c7-0b9f71d4bb84")
        assertThat(document.requiredDocumentUploads())
            .containsExactly(
                Document.RequiredDocumentUpload.builder()
                    .token("e254beee-67db-4d8c-b610-306ee07de886")
                    .acceptedEntityStatusReasons(listOf("string"))
                    .created(OffsetDateTime.parse("2024-09-18T12:34:56Z"))
                    .imageType(Document.RequiredDocumentUpload.ImageType.FRONT)
                    .rejectedEntityStatusReasons(listOf("string"))
                    .status(Document.RequiredDocumentUpload.DocumentUploadStatus.ACCEPTED)
                    .statusReasons(
                        listOf(
                            Document.RequiredDocumentUpload.DocumentUploadStatusReasons
                                .DOCUMENT_MISSING_REQUIRED_DATA
                        )
                    )
                    .updated(OffsetDateTime.parse("2024-09-18T12:34:56Z"))
                    .uploadUrl("https://lithic-document-verification-uploads.com")
                    .build()
            )
    }
}
