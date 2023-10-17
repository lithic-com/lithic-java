// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardAggregateBalanceListParamsTest {

    @Test
    fun createCardAggregateBalanceListParams() {
        CardAggregateBalanceListParams.builder()
            .accountToken("string")
            .businessAccountToken("string")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            CardAggregateBalanceListParams.builder()
                .accountToken("string")
                .businessAccountToken("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("account_token", listOf("string"))
        expected.put("business_account_token", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = CardAggregateBalanceListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
