// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.cards.aggregatebalances

import com.lithic.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AggregateBalanceListParamsTest {

    @Test
    fun create() {
        AggregateBalanceListParams.builder()
            .accountToken("account_token")
            .businessAccountToken("business_account_token")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AggregateBalanceListParams.builder()
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
        val params = AggregateBalanceListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
