// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransactionListParamsTest {

    @Test
    fun create() {
        TransactionListParams.builder()
            .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .endingBefore("ending_before")
            .pageSize(1L)
            .result(TransactionListParams.Result.APPROVED)
            .startingAfter("starting_after")
            .status(TransactionListParams.CardTransactionStatusFilter.PENDING)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TransactionListParams.builder()
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endingBefore("ending_before")
                .pageSize(1L)
                .result(TransactionListParams.Result.APPROVED)
                .startingAfter("starting_after")
                .status(TransactionListParams.CardTransactionStatusFilter.PENDING)
                .build()
        val expected = QueryParams.builder()
        expected.put("account_token", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        expected.put("begin", "2019-12-27T18:11:19.117Z")
        expected.put("card_token", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        expected.put("end", "2019-12-27T18:11:19.117Z")
        expected.put("ending_before", "ending_before")
        expected.put("page_size", "1")
        expected.put("result", TransactionListParams.Result.APPROVED.toString())
        expected.put("starting_after", "starting_after")
        expected.put("status", TransactionListParams.CardTransactionStatusFilter.PENDING.toString())
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TransactionListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
