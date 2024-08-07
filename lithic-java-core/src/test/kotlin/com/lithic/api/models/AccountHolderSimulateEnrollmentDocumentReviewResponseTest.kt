// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountHolderSimulateEnrollmentDocumentReviewResponseTest {

    @Test
    fun createAccountHolderSimulateEnrollmentDocumentReviewResponse() {
        val accountHolderSimulateEnrollmentDocumentReviewResponse =
            AccountHolderSimulateEnrollmentDocumentReviewResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .documentType(
                    AccountHolderSimulateEnrollmentDocumentReviewResponse.DocumentType
                        .COMMERCIAL_LICENSE
                )
                .requiredDocumentUploads(
                    listOf(
                        AccountHolderSimulateEnrollmentDocumentReviewResponse.RequiredDocumentUpload
                            .builder()
                            .imageType(
                                AccountHolderSimulateEnrollmentDocumentReviewResponse
                                    .RequiredDocumentUpload
                                    .ImageType
                                    .BACK
                            )
                            .status(
                                AccountHolderSimulateEnrollmentDocumentReviewResponse
                                    .RequiredDocumentUpload
                                    .Status
                                    .COMPLETED
                            )
                            .statusReasons(
                                listOf(
                                    AccountHolderSimulateEnrollmentDocumentReviewResponse
                                        .RequiredDocumentUpload
                                        .StatusReason
                                        .BACK_IMAGE_BLURRY
                                )
                            )
                            .uploadUrl("upload_url")
                            .build()
                    )
                )
                .build()
        assertThat(accountHolderSimulateEnrollmentDocumentReviewResponse).isNotNull
        assertThat(accountHolderSimulateEnrollmentDocumentReviewResponse.token())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountHolderSimulateEnrollmentDocumentReviewResponse.accountHolderToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountHolderSimulateEnrollmentDocumentReviewResponse.documentType())
            .contains(
                AccountHolderSimulateEnrollmentDocumentReviewResponse.DocumentType
                    .COMMERCIAL_LICENSE
            )
        assertThat(
                accountHolderSimulateEnrollmentDocumentReviewResponse
                    .requiredDocumentUploads()
                    .get()
            )
            .containsExactly(
                AccountHolderSimulateEnrollmentDocumentReviewResponse.RequiredDocumentUpload
                    .builder()
                    .imageType(
                        AccountHolderSimulateEnrollmentDocumentReviewResponse.RequiredDocumentUpload
                            .ImageType
                            .BACK
                    )
                    .status(
                        AccountHolderSimulateEnrollmentDocumentReviewResponse.RequiredDocumentUpload
                            .Status
                            .COMPLETED
                    )
                    .statusReasons(
                        listOf(
                            AccountHolderSimulateEnrollmentDocumentReviewResponse
                                .RequiredDocumentUpload
                                .StatusReason
                                .BACK_IMAGE_BLURRY
                        )
                    )
                    .uploadUrl("upload_url")
                    .build()
            )
    }
}
