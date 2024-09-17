// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountHolderListDocumentsResponseTest {

    @Test
    fun createAccountHolderListDocumentsResponse() {
        val accountHolderListDocumentsResponse =
            AccountHolderListDocumentsResponse.builder()
                .data(
                    listOf(
                        Document.builder()
                            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .documentType(Document.DocumentType.DRIVERS_LICENSE)
                            .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .requiredDocumentUploads(
                                listOf(
                                    Document.RequiredDocumentUpload.builder()
                                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .imageType(Document.RequiredDocumentUpload.ImageType.FRONT)
                                        .status(Document.RequiredDocumentUpload.Status.ACCEPTED)
                                        .statusReasons(
                                            listOf(
                                                Document.RequiredDocumentUpload.StatusReason
                                                    .DOCUMENT_MISSING_REQUIRED_DATA
                                            )
                                        )
                                        .uploadUrl("upload_url")
                                        .build()
                                )
                            )
                            .build()
                    )
                )
                .build()
        assertThat(accountHolderListDocumentsResponse).isNotNull
        assertThat(accountHolderListDocumentsResponse.data().get())
            .containsExactly(
                Document.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .documentType(Document.DocumentType.DRIVERS_LICENSE)
                    .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .requiredDocumentUploads(
                        listOf(
                            Document.RequiredDocumentUpload.builder()
                                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .imageType(Document.RequiredDocumentUpload.ImageType.FRONT)
                                .status(Document.RequiredDocumentUpload.Status.ACCEPTED)
                                .statusReasons(
                                    listOf(
                                        Document.RequiredDocumentUpload.StatusReason
                                            .DOCUMENT_MISSING_REQUIRED_DATA
                                    )
                                )
                                .uploadUrl("upload_url")
                                .build()
                        )
                    )
                    .build()
            )
    }
}
