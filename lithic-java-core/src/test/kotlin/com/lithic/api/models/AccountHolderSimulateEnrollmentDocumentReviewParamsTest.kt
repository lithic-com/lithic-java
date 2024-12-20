// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountHolderSimulateEnrollmentDocumentReviewParamsTest {

    @Test
    fun createAccountHolderSimulateEnrollmentDocumentReviewParams() {
        AccountHolderSimulateEnrollmentDocumentReviewParams.builder()
            .documentUploadToken("b11cd67b-0a52-4180-8365-314f3def5426")
            .status(AccountHolderSimulateEnrollmentDocumentReviewParams.Status.UPLOADED)
            .acceptedEntityStatusReasons(listOf("string"))
            .statusReason(
                AccountHolderSimulateEnrollmentDocumentReviewParams.DocumentUploadStatusReasons
                    .DOCUMENT_MISSING_REQUIRED_DATA
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AccountHolderSimulateEnrollmentDocumentReviewParams.builder()
                .documentUploadToken("b11cd67b-0a52-4180-8365-314f3def5426")
                .status(AccountHolderSimulateEnrollmentDocumentReviewParams.Status.UPLOADED)
                .acceptedEntityStatusReasons(listOf("string"))
                .statusReason(
                    AccountHolderSimulateEnrollmentDocumentReviewParams.DocumentUploadStatusReasons
                        .DOCUMENT_MISSING_REQUIRED_DATA
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.documentUploadToken()).isEqualTo("b11cd67b-0a52-4180-8365-314f3def5426")
        assertThat(body.status())
            .isEqualTo(AccountHolderSimulateEnrollmentDocumentReviewParams.Status.UPLOADED)
        assertThat(body.acceptedEntityStatusReasons()).contains(listOf("string"))
        assertThat(body.statusReason())
            .contains(
                AccountHolderSimulateEnrollmentDocumentReviewParams.DocumentUploadStatusReasons
                    .DOCUMENT_MISSING_REQUIRED_DATA
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AccountHolderSimulateEnrollmentDocumentReviewParams.builder()
                .documentUploadToken("b11cd67b-0a52-4180-8365-314f3def5426")
                .status(AccountHolderSimulateEnrollmentDocumentReviewParams.Status.UPLOADED)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.documentUploadToken()).isEqualTo("b11cd67b-0a52-4180-8365-314f3def5426")
        assertThat(body.status())
            .isEqualTo(AccountHolderSimulateEnrollmentDocumentReviewParams.Status.UPLOADED)
    }
}
