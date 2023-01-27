package com.lithic.api.models

import com.google.common.collect.ArrayListMultimap
import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransactionListParamsTest {

    @Test
    fun createTransactionListParams() {
        TransactionListParams.builder()
            .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .result(TransactionListParams.Result.APPROVED)
            .begin("2019-12-27T18:11:19.117Z")
            .end("2019-12-27T18:11:19.117Z")
            .page(123L)
            .pageSize(123L)
            .build()
    }

    @Test
    fun toQueryParams() {
        val params =
            TransactionListParams.builder()
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .result(TransactionListParams.Result.APPROVED)
                .begin("2019-12-27T18:11:19.117Z")
                .end("2019-12-27T18:11:19.117Z")
                .page(123L)
                .pageSize(123L)
                .build()
        val expected = ArrayListMultimap.create<String, String>()
        expected.put("account_token", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        expected.put("card_token", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        expected.put("result", TransactionListParams.Result.APPROVED.toString())
        expected.put("begin", "2019-12-27T18:11:19.117Z")
        expected.put("end", "2019-12-27T18:11:19.117Z")
        expected.put("page", "123")
        expected.put("page_size", "123")
        assertThat(params.toQueryParams()).isEqualTo(expected)
    }

    @Test
    fun toQueryParamsWithoutOptionalFields() {
        val params = TransactionListParams.builder().build()
        val expected = ArrayListMultimap.create<String, String>()
        assertThat(params.toQueryParams()).isEqualTo(expected)
    }
}
