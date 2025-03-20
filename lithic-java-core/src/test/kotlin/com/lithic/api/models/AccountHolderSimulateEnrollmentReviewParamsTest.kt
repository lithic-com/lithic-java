// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountHolderSimulateEnrollmentReviewParamsTest {

    @Test
    fun create() {
        AccountHolderSimulateEnrollmentReviewParams.builder()
            .accountHolderToken("1415964d-4400-4d79-9fb3-eee0faaee4e4")
            .status(AccountHolderSimulateEnrollmentReviewParams.Status.ACCEPTED)
            .addStatusReason(
                AccountHolderSimulateEnrollmentReviewParams.StatusReason
                    .PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            AccountHolderSimulateEnrollmentReviewParams.builder()
                .accountHolderToken("1415964d-4400-4d79-9fb3-eee0faaee4e4")
                .status(AccountHolderSimulateEnrollmentReviewParams.Status.ACCEPTED)
                .addStatusReason(
                    AccountHolderSimulateEnrollmentReviewParams.StatusReason
                        .PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE
                )
                .build()

        val body = params._body()

        assertThat(body.accountHolderToken()).contains("1415964d-4400-4d79-9fb3-eee0faaee4e4")
        assertThat(body.status())
            .contains(AccountHolderSimulateEnrollmentReviewParams.Status.ACCEPTED)
        assertThat(body.statusReasons().getOrNull())
            .containsExactly(
                AccountHolderSimulateEnrollmentReviewParams.StatusReason
                    .PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AccountHolderSimulateEnrollmentReviewParams.builder().build()

        val body = params._body()
    }
}
