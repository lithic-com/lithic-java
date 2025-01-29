// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentListParamsTest {

    @Test
    fun createPaymentListParams() {
        PaymentListParams.builder()
            .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .businessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .category(PaymentListParams.Category.ACH)
            .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .endingBefore("ending_before")
            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .pageSize(1L)
            .result(PaymentListParams.Result.APPROVED)
            .startingAfter("starting_after")
            .status(PaymentListParams.Status.DECLINED)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PaymentListParams.builder()
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .businessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .category(PaymentListParams.Category.ACH)
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endingBefore("ending_before")
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pageSize(1L)
                .result(PaymentListParams.Result.APPROVED)
                .startingAfter("starting_after")
                .status(PaymentListParams.Status.DECLINED)
                .build()
        val expected = QueryParams.builder()
        expected.put("account_token", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        expected.put("begin", "2019-12-27T18:11:19.117Z")
        expected.put("business_account_token", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        expected.put("category", PaymentListParams.Category.ACH.toString())
        expected.put("end", "2019-12-27T18:11:19.117Z")
        expected.put("ending_before", "ending_before")
        expected.put("financial_account_token", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        expected.put("page_size", "1")
        expected.put("result", PaymentListParams.Result.APPROVED.toString())
        expected.put("starting_after", "starting_after")
        expected.put("status", PaymentListParams.Status.DECLINED.toString())
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PaymentListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
