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
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .documentType(Document.DocumentType.DRIVERS_LICENSE)
                .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .requiredDocumentUploads(
                    listOf(
                        Document.RequiredDocumentUpload.builder()
                            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .acceptedEntityStatusReasons(listOf("string"))
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .imageType(Document.RequiredDocumentUpload.ImageType.FRONT)
                            .rejectedEntityStatusReasons(listOf("string"))
                            .status(Document.RequiredDocumentUpload.DocumentUploadStatus.ACCEPTED)
                            .statusReasons(
                                listOf(
                                    Document.RequiredDocumentUpload.DocumentUploadStatusReasons
                                        .DOCUMENT_MISSING_REQUIRED_DATA
                                )
                            )
                            .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .uploadUrl("upload_url")
                            .build()
                    )
                )
                .build()
        assertThat(document).isNotNull
        assertThat(document.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(document.accountHolderToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(document.documentType()).isEqualTo(Document.DocumentType.DRIVERS_LICENSE)
        assertThat(document.entityToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(document.requiredDocumentUploads())
            .containsExactly(
                Document.RequiredDocumentUpload.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .acceptedEntityStatusReasons(listOf("string"))
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .imageType(Document.RequiredDocumentUpload.ImageType.FRONT)
                    .rejectedEntityStatusReasons(listOf("string"))
                    .status(Document.RequiredDocumentUpload.DocumentUploadStatus.ACCEPTED)
                    .statusReasons(
                        listOf(
                            Document.RequiredDocumentUpload.DocumentUploadStatusReasons
                                .DOCUMENT_MISSING_REQUIRED_DATA
                        )
                    )
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .uploadUrl("upload_url")
                    .build()
            )
    }
}
