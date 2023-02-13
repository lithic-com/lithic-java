package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FundingSourceListParamsTest {

    @Test
    fun createFundingSourceListParams() {
        FundingSourceListParams.builder()
            .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .page(123L)
            .pageSize(123L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            FundingSourceListParams.builder()
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .page(123L)
                .pageSize(123L)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("account_token", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        expected.put("page", listOf("123"))
        expected.put("page_size", listOf("123"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = FundingSourceListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
