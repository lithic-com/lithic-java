// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardAggregateBalanceListParamsTest {

    @Test
    fun createCardAggregateBalanceListParams() {
        CardAggregateBalanceListParams.builder()
            .accountToken("account_token")
            .businessAccountToken("business_account_token")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            CardAggregateBalanceListParams.builder()
                .accountToken("account_token")
                .businessAccountToken("business_account_token")
                .build()
        val expected = QueryParams.builder()
        expected.put("account_token", "account_token")
        expected.put("business_account_token", "business_account_token")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = CardAggregateBalanceListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
