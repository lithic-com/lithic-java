// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V2ListVersionsResponseTest {

    @Test
    fun create() {
        val v2ListVersionsResponse =
            V2ListVersionsResponse.builder()
                .addData(
                    AuthRuleVersion.builder()
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .parameters(
                            VelocityLimitParams.builder()
                                .period(
                                    VelocityLimitPeriod.TrailingWindowObject.builder()
                                        .duration(10L)
                                        .type(VelocityLimitPeriod.TrailingWindowObject.Type.CUSTOM)
                                        .build()
                                )
                                .scope(VelocityLimitParams.VelocityScope.CARD)
                                .filters(
                                    VelocityLimitFilters.builder()
                                        .addExcludeCountry("USD")
                                        .addExcludeMcc("5542")
                                        .addIncludeCountry("USD")
                                        .addIncludeMcc("5542")
                                        .addIncludePanEntryMode(
                                            VelocityLimitFilters.IncludePanEntryMode.AUTO_ENTRY
                                        )
                                        .build()
                                )
                                .limitAmount(10000L)
                                .limitCashAmount(5000L)
                                .limitCashCount(0L)
                                .limitCount(0L)
                                .build()
                        )
                        .state(AuthRuleVersion.AuthRuleVersionState.ACTIVE)
                        .version(0L)
                        .build()
                )
                .build()

        assertThat(v2ListVersionsResponse.data())
            .containsExactly(
                AuthRuleVersion.builder()
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .parameters(
                        VelocityLimitParams.builder()
                            .period(
                                VelocityLimitPeriod.TrailingWindowObject.builder()
                                    .duration(10L)
                                    .type(VelocityLimitPeriod.TrailingWindowObject.Type.CUSTOM)
                                    .build()
                            )
                            .scope(VelocityLimitParams.VelocityScope.CARD)
                            .filters(
                                VelocityLimitFilters.builder()
                                    .addExcludeCountry("USD")
                                    .addExcludeMcc("5542")
                                    .addIncludeCountry("USD")
                                    .addIncludeMcc("5542")
                                    .addIncludePanEntryMode(
                                        VelocityLimitFilters.IncludePanEntryMode.AUTO_ENTRY
                                    )
                                    .build()
                            )
                            .limitAmount(10000L)
                            .limitCashAmount(5000L)
                            .limitCashCount(0L)
                            .limitCount(0L)
                            .build()
                    )
                    .state(AuthRuleVersion.AuthRuleVersionState.ACTIVE)
                    .version(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v2ListVersionsResponse =
            V2ListVersionsResponse.builder()
                .addData(
                    AuthRuleVersion.builder()
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .parameters(
                            VelocityLimitParams.builder()
                                .period(
                                    VelocityLimitPeriod.TrailingWindowObject.builder()
                                        .duration(10L)
                                        .type(VelocityLimitPeriod.TrailingWindowObject.Type.CUSTOM)
                                        .build()
                                )
                                .scope(VelocityLimitParams.VelocityScope.CARD)
                                .filters(
                                    VelocityLimitFilters.builder()
                                        .addExcludeCountry("USD")
                                        .addExcludeMcc("5542")
                                        .addIncludeCountry("USD")
                                        .addIncludeMcc("5542")
                                        .addIncludePanEntryMode(
                                            VelocityLimitFilters.IncludePanEntryMode.AUTO_ENTRY
                                        )
                                        .build()
                                )
                                .limitAmount(10000L)
                                .limitCashAmount(5000L)
                                .limitCashCount(0L)
                                .limitCount(0L)
                                .build()
                        )
                        .state(AuthRuleVersion.AuthRuleVersionState.ACTIVE)
                        .version(0L)
                        .build()
                )
                .build()

        val roundtrippedV2ListVersionsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v2ListVersionsResponse),
                jacksonTypeRef<V2ListVersionsResponse>(),
            )

        assertThat(roundtrippedV2ListVersionsResponse).isEqualTo(v2ListVersionsResponse)
    }
}
