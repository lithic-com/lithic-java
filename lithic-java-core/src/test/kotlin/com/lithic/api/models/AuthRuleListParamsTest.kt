package com.lithic.api.models

import com.google.common.collect.ArrayListMultimap
import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuthRuleListParamsTest {

    @Test
    fun createAuthRuleListParams() {
        AuthRuleListParams.builder().page(123L).pageSize(123L).build()
    }

    @Test
    fun toQueryParams() {
        val params = AuthRuleListParams.builder().page(123L).pageSize(123L).build()
        val expected = ArrayListMultimap.create<String, String>()
        expected.put("page", "123")
        expected.put("page_size", "123")
        assertThat(params.toQueryParams()).isEqualTo(expected)
    }

    @Test
    fun toQueryParamsWithoutOptionalFields() {
        val params = AuthRuleListParams.builder().build()
        val expected = ArrayListMultimap.create<String, String>()
        assertThat(params.toQueryParams()).isEqualTo(expected)
    }
}
