// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CategoryDetailsTest {

    @Test
    fun create() {
        val categoryDetails =
            CategoryDetails.builder()
                .balanceTransfers("balance_transfers")
                .cashAdvances("cash_advances")
                .purchases("purchases")
                .build()

        assertThat(categoryDetails.balanceTransfers()).isEqualTo("balance_transfers")
        assertThat(categoryDetails.cashAdvances()).isEqualTo("cash_advances")
        assertThat(categoryDetails.purchases()).isEqualTo("purchases")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val categoryDetails =
            CategoryDetails.builder()
                .balanceTransfers("balance_transfers")
                .cashAdvances("cash_advances")
                .purchases("purchases")
                .build()

        val roundtrippedCategoryDetails =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(categoryDetails),
                jacksonTypeRef<CategoryDetails>(),
            )

        assertThat(roundtrippedCategoryDetails).isEqualTo(categoryDetails)
    }
}
