// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DisputeCreateParamsTest {

    @Test
    fun create() {
        DisputeCreateParams.builder()
            .amount(0L)
            .reason(DisputeCreateParams.Reason.ATM_CASH_MISDISPENSE)
            .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .customerFiledDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .customerNote("customer_note")
            .build()
    }

    @Test
    fun body() {
        val params =
            DisputeCreateParams.builder()
                .amount(0L)
                .reason(DisputeCreateParams.Reason.ATM_CASH_MISDISPENSE)
                .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customerFiledDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerNote("customer_note")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.reason()).isEqualTo(DisputeCreateParams.Reason.ATM_CASH_MISDISPENSE)
        assertThat(body.transactionToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.customerFiledDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.customerNote()).contains("customer_note")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DisputeCreateParams.builder()
                .amount(0L)
                .reason(DisputeCreateParams.Reason.ATM_CASH_MISDISPENSE)
                .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.reason()).isEqualTo(DisputeCreateParams.Reason.ATM_CASH_MISDISPENSE)
        assertThat(body.transactionToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
