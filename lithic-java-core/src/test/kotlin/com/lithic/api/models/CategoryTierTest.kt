// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CategoryTierTest {

    @Test
    fun create() {
        val categoryTier = CategoryTier.builder().capRate("cap_rate").rate("rate").build()

        assertThat(categoryTier.capRate()).contains("cap_rate")
        assertThat(categoryTier.rate()).contains("rate")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val categoryTier = CategoryTier.builder().capRate("cap_rate").rate("rate").build()

        val roundtrippedCategoryTier =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(categoryTier),
                jacksonTypeRef<CategoryTier>(),
            )

        assertThat(roundtrippedCategoryTier).isEqualTo(categoryTier)
    }
}
