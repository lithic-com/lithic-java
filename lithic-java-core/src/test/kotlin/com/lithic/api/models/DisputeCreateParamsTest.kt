// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DisputeCreateParamsTest {

    @Test
    fun createDisputeCreateParams() {
        DisputeCreateParams.builder()
            .amount(123L)
            .reason(DisputeCreateParams.Reason.ATM_CASH_MISDISPENSE)
            .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .customerFiledDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .customerNote("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            DisputeCreateParams.builder()
                .amount(123L)
                .reason(DisputeCreateParams.Reason.ATM_CASH_MISDISPENSE)
                .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customerFiledDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerNote("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.reason()).isEqualTo(DisputeCreateParams.Reason.ATM_CASH_MISDISPENSE)
        assertThat(body.transactionToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.customerFiledDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.customerNote()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            DisputeCreateParams.builder()
                .amount(123L)
                .reason(DisputeCreateParams.Reason.ATM_CASH_MISDISPENSE)
                .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.reason()).isEqualTo(DisputeCreateParams.Reason.ATM_CASH_MISDISPENSE)
        assertThat(body.transactionToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
