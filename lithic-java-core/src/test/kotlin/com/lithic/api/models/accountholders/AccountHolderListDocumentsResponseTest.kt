// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.accountholders

import com.lithic.api.models.Document
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
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .documentType(Document.DocumentType.DRIVERS_LICENSE)
                        .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addRequiredDocumentUpload(
                            Document.RequiredDocumentUpload.builder()
                                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .addAcceptedEntityStatusReason("string")
                                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .imageType(Document.RequiredDocumentUpload.ImageType.FRONT)
                                .addRejectedEntityStatusReason("string")
                                .status(
                                    Document.RequiredDocumentUpload.DocumentUploadStatus.ACCEPTED
                                )
                                .addStatusReason(
                                    Document.RequiredDocumentUpload.DocumentUploadStatusReasons
                                        .DOCUMENT_MISSING_REQUIRED_DATA
                                )
                                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .uploadUrl("upload_url")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(accountHolderListDocumentsResponse.data().getOrNull())
            .containsExactly(
                Document.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .documentType(Document.DocumentType.DRIVERS_LICENSE)
                    .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addRequiredDocumentUpload(
                        Document.RequiredDocumentUpload.builder()
                            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addAcceptedEntityStatusReason("string")
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .imageType(Document.RequiredDocumentUpload.ImageType.FRONT)
                            .addRejectedEntityStatusReason("string")
                            .status(Document.RequiredDocumentUpload.DocumentUploadStatus.ACCEPTED)
                            .addStatusReason(
                                Document.RequiredDocumentUpload.DocumentUploadStatusReasons
                                    .DOCUMENT_MISSING_REQUIRED_DATA
                            )
                            .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .uploadUrl("upload_url")
                            .build()
                    )
                    .build()
            )
    }
}
