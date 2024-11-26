// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class VelocityLimitParamsTest {

    @Test
    fun createVelocityLimitParams() {
        val velocityLimitParams =
            VelocityLimitParams.builder()
                .filters(
                    VelocityLimitParams.Filters.builder()
                        .includeCountries(listOf("USD"))
                        .includeMccs(listOf("5542"))
                        .build()
                )
                .period(VelocityLimitParams.Period.ofInteger(10L))
                .scope(VelocityLimitParams.Scope.CARD)
                .limitAmount(10000L)
                .limitCount(0L)
                .build()
        assertThat(velocityLimitParams).isNotNull
        assertThat(velocityLimitParams.filters())
            .isEqualTo(
                VelocityLimitParams.Filters.builder()
                    .includeCountries(listOf("USD"))
                    .includeMccs(listOf("5542"))
                    .build()
            )
        assertThat(velocityLimitParams.period())
            .isEqualTo(VelocityLimitParams.Period.ofInteger(10L))
        assertThat(velocityLimitParams.scope()).isEqualTo(VelocityLimitParams.Scope.CARD)
        assertThat(velocityLimitParams.limitAmount()).contains(10000L)
        assertThat(velocityLimitParams.limitCount()).contains(0L)
    }
}
