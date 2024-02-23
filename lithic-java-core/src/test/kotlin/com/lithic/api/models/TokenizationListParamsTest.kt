// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TokenizationListParamsTest {

    @Test
    fun createTokenizationListParams() {
        TokenizationListParams.builder()
            .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .begin(LocalDate.parse("2019-12-27"))
            .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .end(LocalDate.parse("2019-12-27"))
            .endingBefore("string")
            .pageSize(123L)
            .startingAfter("string")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            TokenizationListParams.builder()
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .begin(LocalDate.parse("2019-12-27"))
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .end(LocalDate.parse("2019-12-27"))
                .endingBefore("string")
                .pageSize(123L)
                .startingAfter("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("account_token", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        expected.put("begin", listOf("2019-12-27"))
        expected.put("card_token", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        expected.put("end", listOf("2019-12-27"))
        expected.put("ending_before", listOf("string"))
        expected.put("page_size", listOf("123"))
        expected.put("starting_after", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = TokenizationListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
