// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthRuleVersionTest {

    @Test
    fun create() {
        val authRuleVersion =
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

        assertThat(authRuleVersion.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(authRuleVersion.parameters())
            .isEqualTo(
                AuthRuleVersion.Parameters.ofVelocityLimitParams(
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
            )
        assertThat(authRuleVersion.state()).isEqualTo(AuthRuleVersion.AuthRuleVersionState.ACTIVE)
        assertThat(authRuleVersion.version()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authRuleVersion =
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

        val roundtrippedAuthRuleVersion =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authRuleVersion),
                jacksonTypeRef<AuthRuleVersion>(),
            )

        assertThat(roundtrippedAuthRuleVersion).isEqualTo(authRuleVersion)
    }
}
