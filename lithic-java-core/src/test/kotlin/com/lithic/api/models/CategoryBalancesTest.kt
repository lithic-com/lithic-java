// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CategoryBalancesTest {

    @Test
    fun create() {
        val categoryBalances =
            CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build()

        assertThat(categoryBalances.fees()).isEqualTo(0L)
        assertThat(categoryBalances.interest()).isEqualTo(0L)
        assertThat(categoryBalances.principal()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val categoryBalances =
            CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build()

        val roundtrippedCategoryBalances =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(categoryBalances),
                jacksonTypeRef<CategoryBalances>(),
            )

        assertThat(roundtrippedCategoryBalances).isEqualTo(categoryBalances)
    }
}
