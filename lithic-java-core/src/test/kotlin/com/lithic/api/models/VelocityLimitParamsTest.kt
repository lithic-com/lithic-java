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
                .period(VelocityLimitParams.Period.ofNumber(42.23))
                .scope(VelocityLimitParams.Scope.CARD)
                .limitAmount(42.23)
                .limitCount(42.23)
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
            .isEqualTo(VelocityLimitParams.Period.ofNumber(42.23))
        assertThat(velocityLimitParams.scope()).isEqualTo(VelocityLimitParams.Scope.CARD)
        assertThat(velocityLimitParams.limitAmount()).contains(42.23)
        assertThat(velocityLimitParams.limitCount()).contains(42.23)
    }
}
