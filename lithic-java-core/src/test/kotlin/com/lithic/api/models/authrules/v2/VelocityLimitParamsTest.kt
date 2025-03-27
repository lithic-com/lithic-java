// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.authrules.v2

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VelocityLimitParamsTest {

    @Test
    fun create() {
        val velocityLimitParams =
            VelocityLimitParams.builder()
                .filters(
                    VelocityLimitParams.Filters.builder()
                        .addIncludeCountry("USD")
                        .addIncludeMcc("5542")
                        .build()
                )
                .period(10L)
                .scope(VelocityLimitParams.Scope.CARD)
                .limitAmount(10000L)
                .limitCount(0L)
                .build()

        assertThat(velocityLimitParams.filters())
            .isEqualTo(
                VelocityLimitParams.Filters.builder()
                    .addIncludeCountry("USD")
                    .addIncludeMcc("5542")
                    .build()
            )
        assertThat(velocityLimitParams.period())
            .isEqualTo(VelocityLimitParams.Period.ofTrailingWindow(10L))
        assertThat(velocityLimitParams.scope()).isEqualTo(VelocityLimitParams.Scope.CARD)
        assertThat(velocityLimitParams.limitAmount()).contains(10000L)
        assertThat(velocityLimitParams.limitCount()).contains(0L)
    }
}
