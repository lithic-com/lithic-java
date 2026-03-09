// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VelocityLimitFiltersTest {

    @Test
    fun create() {
        val velocityLimitFilters =
            VelocityLimitFilters.builder()
                .addExcludeCountry("USD")
                .addExcludeMcc("5542")
                .addIncludeCountry("USD")
                .addIncludeMcc("5542")
                .addIncludePanEntryMode(VelocityLimitFilters.IncludePanEntryMode.AUTO_ENTRY)
                .build()

        assertThat(velocityLimitFilters.excludeCountries().getOrNull()).containsExactly("USD")
        assertThat(velocityLimitFilters.excludeMccs().getOrNull()).containsExactly("5542")
        assertThat(velocityLimitFilters.includeCountries().getOrNull()).containsExactly("USD")
        assertThat(velocityLimitFilters.includeMccs().getOrNull()).containsExactly("5542")
        assertThat(velocityLimitFilters.includePanEntryModes().getOrNull())
            .containsExactly(VelocityLimitFilters.IncludePanEntryMode.AUTO_ENTRY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val velocityLimitFilters =
            VelocityLimitFilters.builder()
                .addExcludeCountry("USD")
                .addExcludeMcc("5542")
                .addIncludeCountry("USD")
                .addIncludeMcc("5542")
                .addIncludePanEntryMode(VelocityLimitFilters.IncludePanEntryMode.AUTO_ENTRY)
                .build()

        val roundtrippedVelocityLimitFilters =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(velocityLimitFilters),
                jacksonTypeRef<VelocityLimitFilters>(),
            )

        assertThat(roundtrippedVelocityLimitFilters).isEqualTo(velocityLimitFilters)
    }
}
