// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FraudTransactionReportParamsTest {

    @Test
    fun create() {
        FraudTransactionReportParams.builder()
            .transactionToken("00000000-0000-0000-0000-000000000000")
            .fraudStatus(FraudTransactionReportParams.FraudStatus.SUSPECTED_FRAUD)
            .comment("comment")
            .fraudType(FraudTransactionReportParams.FraudType.FIRST_PARTY_FRAUD)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FraudTransactionReportParams.builder()
                .transactionToken("00000000-0000-0000-0000-000000000000")
                .fraudStatus(FraudTransactionReportParams.FraudStatus.SUSPECTED_FRAUD)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("00000000-0000-0000-0000-000000000000")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            FraudTransactionReportParams.builder()
                .transactionToken("00000000-0000-0000-0000-000000000000")
                .fraudStatus(FraudTransactionReportParams.FraudStatus.SUSPECTED_FRAUD)
                .comment("comment")
                .fraudType(FraudTransactionReportParams.FraudType.FIRST_PARTY_FRAUD)
                .build()

        val body = params._body()

        assertThat(body.fraudStatus())
            .isEqualTo(FraudTransactionReportParams.FraudStatus.SUSPECTED_FRAUD)
        assertThat(body.comment()).contains("comment")
        assertThat(body.fraudType())
            .contains(FraudTransactionReportParams.FraudType.FIRST_PARTY_FRAUD)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FraudTransactionReportParams.builder()
                .transactionToken("00000000-0000-0000-0000-000000000000")
                .fraudStatus(FraudTransactionReportParams.FraudStatus.SUSPECTED_FRAUD)
                .build()

        val body = params._body()

        assertThat(body.fraudStatus())
            .isEqualTo(FraudTransactionReportParams.FraudStatus.SUSPECTED_FRAUD)
    }
}
