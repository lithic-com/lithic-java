package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuthRuleListParamsTest {

    @Test
    fun createAuthRuleListParams() {
        AuthRuleListParams.builder().page(123L).pageSize(123L).build()
    }

    @Test
    fun getQueryParams() {
        val params = AuthRuleListParams.builder().page(123L).pageSize(123L).build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("page", listOf("123"))
        expected.put("page_size", listOf("123"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = AuthRuleListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
