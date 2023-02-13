package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountListParamsTest {

    @Test
    fun createAccountListParams() {
        AccountListParams.builder()
            .begin("2019-12-27T18:11:19.117Z")
            .end("2019-12-27T18:11:19.117Z")
            .page(123L)
            .pageSize(123L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            AccountListParams.builder()
                .begin("2019-12-27T18:11:19.117Z")
                .end("2019-12-27T18:11:19.117Z")
                .page(123L)
                .pageSize(123L)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("begin", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("end", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("page", listOf("123"))
        expected.put("page_size", listOf("123"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = AccountListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
