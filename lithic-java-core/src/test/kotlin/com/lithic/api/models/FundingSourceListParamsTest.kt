package com.lithic.api.models

import com.google.common.collect.ArrayListMultimap
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
    fun toQueryParams() {
        val params =
            FundingSourceListParams.builder()
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .page(123L)
                .pageSize(123L)
                .build()
        val expected = ArrayListMultimap.create<String, String>()
        expected.put("account_token", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        expected.put("page", "123")
        expected.put("page_size", "123")
        assertThat(params.toQueryParams()).isEqualTo(expected)
    }

    @Test
    fun toQueryParamsWithoutOptionalFields() {
        val params = FundingSourceListParams.builder().build()
        val expected = ArrayListMultimap.create<String, String>()
        assertThat(params.toQueryParams()).isEqualTo(expected)
    }
}
