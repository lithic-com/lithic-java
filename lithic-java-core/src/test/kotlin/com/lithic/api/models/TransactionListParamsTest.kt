// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransactionListParamsTest {

    @Test
    fun createTransactionListParams() {
        TransactionListParams.builder()
            .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .endingBefore("ending_before")
            .pageSize(100L)
            .result(TransactionListParams.Result.APPROVED)
            .startingAfter("starting_after")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            TransactionListParams.builder()
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endingBefore("ending_before")
                .pageSize(100L)
                .result(TransactionListParams.Result.APPROVED)
                .startingAfter("starting_after")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("account_token", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        expected.put("begin", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("card_token", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        expected.put("end", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("ending_before", listOf("ending_before"))
        expected.put("page_size", listOf("100"))
        expected.put("result", listOf(TransactionListParams.Result.APPROVED.toString()))
        expected.put("starting_after", listOf("starting_after"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = TransactionListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
