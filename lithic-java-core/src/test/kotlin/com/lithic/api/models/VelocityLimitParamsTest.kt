// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VelocityLimitParamsTest {

    @Test
    fun create() {
        val velocityLimitParams =
            VelocityLimitParams.builder()
                .filters(
                    VelocityLimitParams.VelocityLimitFilters.builder()
                        .addExcludeCountry("USD")
                        .addExcludeMcc("5542")
                        .addIncludeCountry("USD")
                        .addIncludeMcc("5542")
                        .addIncludePanEntryMode(
                            VelocityLimitParams.VelocityLimitFilters.IncludePanEntryMode.AUTO_ENTRY
                        )
                        .build()
                )
                .period(10L)
                .scope(VelocityLimitParams.VelocityScope.CARD)
                .limitAmount(10000L)
                .limitCount(0L)
                .build()

        assertThat(velocityLimitParams.filters())
            .isEqualTo(
                VelocityLimitParams.VelocityLimitFilters.builder()
                    .addExcludeCountry("USD")
                    .addExcludeMcc("5542")
                    .addIncludeCountry("USD")
                    .addIncludeMcc("5542")
                    .addIncludePanEntryMode(
                        VelocityLimitParams.VelocityLimitFilters.IncludePanEntryMode.AUTO_ENTRY
                    )
                    .build()
            )
        assertThat(velocityLimitParams.period())
            .isEqualTo(VelocityLimitParamsPeriodWindow.ofTrailing(10L))
        assertThat(velocityLimitParams.scope()).isEqualTo(VelocityLimitParams.VelocityScope.CARD)
        assertThat(velocityLimitParams.limitAmount()).contains(10000L)
        assertThat(velocityLimitParams.limitCount()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val velocityLimitParams =
            VelocityLimitParams.builder()
                .filters(
                    VelocityLimitParams.VelocityLimitFilters.builder()
                        .addExcludeCountry("USD")
                        .addExcludeMcc("5542")
                        .addIncludeCountry("USD")
                        .addIncludeMcc("5542")
                        .addIncludePanEntryMode(
                            VelocityLimitParams.VelocityLimitFilters.IncludePanEntryMode.AUTO_ENTRY
                        )
                        .build()
                )
                .period(10L)
                .scope(VelocityLimitParams.VelocityScope.CARD)
                .limitAmount(10000L)
                .limitCount(0L)
                .build()

        val roundtrippedVelocityLimitParams =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(velocityLimitParams),
                jacksonTypeRef<VelocityLimitParams>(),
            )

        assertThat(roundtrippedVelocityLimitParams).isEqualTo(velocityLimitParams)
    }
}
