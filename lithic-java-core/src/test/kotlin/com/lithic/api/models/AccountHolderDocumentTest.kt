// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountHolderDocumentTest {

    @Test
    fun createAccountHolderDocument() {
        val accountHolderDocument =
            AccountHolderDocument.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .documentType(AccountHolderDocument.DocumentType.COMMERCIAL_LICENSE)
                .requiredDocumentUploads(
                    listOf(
                        AccountHolderDocument.RequiredDocumentUpload.builder()
                            .imageType(AccountHolderDocument.RequiredDocumentUpload.ImageType.BACK)
                            .status(AccountHolderDocument.RequiredDocumentUpload.Status.COMPLETED)
                            .statusReasons(
                                listOf(
                                    AccountHolderDocument.RequiredDocumentUpload.StatusReason
                                        .BACK_IMAGE_BLURRY
                                )
                            )
                            .uploadUrl("string")
                            .build()
                    )
                )
                .build()
        assertThat(accountHolderDocument).isNotNull
        assertThat(accountHolderDocument.token()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountHolderDocument.accountHolderToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountHolderDocument.documentType())
            .contains(AccountHolderDocument.DocumentType.COMMERCIAL_LICENSE)
        assertThat(accountHolderDocument.requiredDocumentUploads().get())
            .containsExactly(
                AccountHolderDocument.RequiredDocumentUpload.builder()
                    .imageType(AccountHolderDocument.RequiredDocumentUpload.ImageType.BACK)
                    .status(AccountHolderDocument.RequiredDocumentUpload.Status.COMPLETED)
                    .statusReasons(
                        listOf(
                            AccountHolderDocument.RequiredDocumentUpload.StatusReason
                                .BACK_IMAGE_BLURRY
                        )
                    )
                    .uploadUrl("string")
                    .build()
            )
    }
}
