// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountHolderSimulateEnrollmentReviewParamsTest {

    @Test
    fun createAccountHolderSimulateEnrollmentReviewParams() {
        AccountHolderSimulateEnrollmentReviewParams.builder()
            .accountHolderToken("account_holder_token")
            .status(AccountHolderSimulateEnrollmentReviewParams.Status.ACCEPTED)
            .statusReasons(
                listOf(
                    AccountHolderSimulateEnrollmentReviewParams.StatusReason
                        .PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE
                )
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AccountHolderSimulateEnrollmentReviewParams.builder()
                .accountHolderToken("account_holder_token")
                .status(AccountHolderSimulateEnrollmentReviewParams.Status.ACCEPTED)
                .statusReasons(
                    listOf(
                        AccountHolderSimulateEnrollmentReviewParams.StatusReason
                            .PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountHolderToken()).isEqualTo("account_holder_token")
        assertThat(body.status())
            .isEqualTo(AccountHolderSimulateEnrollmentReviewParams.Status.ACCEPTED)
        assertThat(body.statusReasons())
            .isEqualTo(
                listOf(
                    AccountHolderSimulateEnrollmentReviewParams.StatusReason
                        .PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = AccountHolderSimulateEnrollmentReviewParams.builder().build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}
