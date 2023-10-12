// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentListParamsTest {

    @Test
    fun createPaymentListParams() {
        PaymentListParams.builder()
            .endingBefore("string")
            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .pageSize(123L)
            .result(PaymentListParams.Result.APPROVED)
            .startingAfter("string")
            .status(PaymentListParams.Status.PENDING)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            PaymentListParams.builder()
                .endingBefore("string")
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pageSize(123L)
                .result(PaymentListParams.Result.APPROVED)
                .startingAfter("string")
                .status(PaymentListParams.Status.PENDING)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("ending_before", listOf("string"))
        expected.put("financial_account_token", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        expected.put("page_size", listOf("123"))
        expected.put("result", listOf(PaymentListParams.Result.APPROVED.toString()))
        expected.put("starting_after", listOf("string"))
        expected.put("status", listOf(PaymentListParams.Status.PENDING.toString()))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = PaymentListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
