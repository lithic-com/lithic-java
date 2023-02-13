package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardListParamsTest {

    @Test
    fun createCardListParams() {
        CardListParams.builder()
            .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .begin("2019-12-27T18:11:19.117Z")
            .end("2019-12-27T18:11:19.117Z")
            .page(123L)
            .pageSize(123L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            CardListParams.builder()
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .begin("2019-12-27T18:11:19.117Z")
                .end("2019-12-27T18:11:19.117Z")
                .page(123L)
                .pageSize(123L)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("account_token", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        expected.put("begin", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("end", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("page", listOf("123"))
        expected.put("page_size", listOf("123"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = CardListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
