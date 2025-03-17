// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardAggregateBalanceListParamsTest {

    @Test
    fun create() {
        CardAggregateBalanceListParams.builder()
            .accountToken("account_token")
            .businessAccountToken("business_account_token")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CardAggregateBalanceListParams.builder()
                .accountToken("account_token")
                .businessAccountToken("business_account_token")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("account_token", "account_token")
                    .put("business_account_token", "business_account_token")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CardAggregateBalanceListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
