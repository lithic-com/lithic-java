// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DisputeCreateParamsTest {

    @Test
    fun create() {
        DisputeCreateParams.builder()
            .amount(10000L)
            .reason(DisputeCreateParams.Reason.ATM_CASH_MISDISPENSE)
            .transactionToken("12345624-aa69-4cbc-a946-30d90181b621")
            .customerFiledDate(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
            .customerNote("customer_note")
            .build()
    }

    @Test
    fun body() {
        val params =
            DisputeCreateParams.builder()
                .amount(10000L)
                .reason(DisputeCreateParams.Reason.ATM_CASH_MISDISPENSE)
                .transactionToken("12345624-aa69-4cbc-a946-30d90181b621")
                .customerFiledDate(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
                .customerNote("customer_note")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.amount()).isEqualTo(10000L)
        assertThat(body.reason()).isEqualTo(DisputeCreateParams.Reason.ATM_CASH_MISDISPENSE)
        assertThat(body.transactionToken()).isEqualTo("12345624-aa69-4cbc-a946-30d90181b621")
        assertThat(body.customerFiledDate()).contains(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
        assertThat(body.customerNote()).contains("customer_note")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DisputeCreateParams.builder()
                .amount(10000L)
                .reason(DisputeCreateParams.Reason.ATM_CASH_MISDISPENSE)
                .transactionToken("12345624-aa69-4cbc-a946-30d90181b621")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.amount()).isEqualTo(10000L)
        assertThat(body.reason()).isEqualTo(DisputeCreateParams.Reason.ATM_CASH_MISDISPENSE)
        assertThat(body.transactionToken()).isEqualTo("12345624-aa69-4cbc-a946-30d90181b621")
    }
}
