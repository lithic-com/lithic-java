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
                .period(VelocityLimitParams.Period.ofNumber(10.0))
                .scope(VelocityLimitParams.Scope.CARD)
                .limitAmount(10000.0)
                .limitCount(0.0)
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
            .isEqualTo(VelocityLimitParams.Period.ofNumber(10.0))
        assertThat(velocityLimitParams.scope()).isEqualTo(VelocityLimitParams.Scope.CARD)
        assertThat(velocityLimitParams.limitAmount()).contains(10000.0)
        assertThat(velocityLimitParams.limitCount()).contains(0.0)
    }
}
