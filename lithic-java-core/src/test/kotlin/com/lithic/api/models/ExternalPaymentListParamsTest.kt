// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExternalPaymentListParamsTest {

    @Test
    fun create() {
        ExternalPaymentListParams.builder()
            .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .businessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .category(ExternalPaymentListParams.ExternalPaymentCategory.EXTERNAL_WIRE)
            .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .endingBefore("ending_before")
            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .pageSize(1L)
            .result(ExternalPaymentListParams.TransactionResult.APPROVED)
            .startingAfter("starting_after")
            .status(ExternalPaymentListParams.TransactionStatus.PENDING)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ExternalPaymentListParams.builder()
                .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .businessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .category(ExternalPaymentListParams.ExternalPaymentCategory.EXTERNAL_WIRE)
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endingBefore("ending_before")
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pageSize(1L)
                .result(ExternalPaymentListParams.TransactionResult.APPROVED)
                .startingAfter("starting_after")
                .status(ExternalPaymentListParams.TransactionStatus.PENDING)
                .build()
        val expected = QueryParams.builder()
        expected.put("begin", "2019-12-27T18:11:19.117Z")
        expected.put("business_account_token", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        expected.put(
            "category",
            ExternalPaymentListParams.ExternalPaymentCategory.EXTERNAL_WIRE.toString(),
        )
        expected.put("end", "2019-12-27T18:11:19.117Z")
        expected.put("ending_before", "ending_before")
        expected.put("financial_account_token", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        expected.put("page_size", "1")
        expected.put("result", ExternalPaymentListParams.TransactionResult.APPROVED.toString())
        expected.put("starting_after", "starting_after")
        expected.put("status", ExternalPaymentListParams.TransactionStatus.PENDING.toString())
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ExternalPaymentListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
