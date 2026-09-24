// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthRuleV2CreateParamsTest {

    @Test
    fun create() {
        AuthRuleV2CreateParams.builder()
            .body(
                AuthRuleV2CreateParams.Body.AccountLevelRule.builder()
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
                    .type(AuthRuleV2CreateParams.Body.AccountLevelRule.AuthRuleType.VELOCITY_LIMIT)
                    .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addBusinessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .eventStream(EventStream.AUTHORIZATION)
                    .name("name")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            AuthRuleV2CreateParams.builder()
                .body(
                    AuthRuleV2CreateParams.Body.AccountLevelRule.builder()
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
                        .type(
                            AuthRuleV2CreateParams.Body.AccountLevelRule.AuthRuleType.VELOCITY_LIMIT
                        )
                        .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addBusinessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .eventStream(EventStream.AUTHORIZATION)
                        .name("name")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AuthRuleV2CreateParams.Body.ofAccountLevelRule(
                    AuthRuleV2CreateParams.Body.AccountLevelRule.builder()
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
                        .type(
                            AuthRuleV2CreateParams.Body.AccountLevelRule.AuthRuleType.VELOCITY_LIMIT
                        )
                        .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addBusinessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .eventStream(EventStream.AUTHORIZATION)
                        .name("name")
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AuthRuleV2CreateParams.builder()
                .body(
                    AuthRuleV2CreateParams.Body.AccountLevelRule.builder()
                        .parameters(
                            VelocityLimitParams.builder()
                                .period(
                                    VelocityLimitPeriod.TrailingWindowObject.builder()
                                        .duration(10L)
                                        .type(VelocityLimitPeriod.TrailingWindowObject.Type.CUSTOM)
                                        .build()
                                )
                                .scope(VelocityLimitParams.VelocityScope.CARD)
                                .build()
                        )
                        .type(
                            AuthRuleV2CreateParams.Body.AccountLevelRule.AuthRuleType.VELOCITY_LIMIT
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AuthRuleV2CreateParams.Body.ofAccountLevelRule(
                    AuthRuleV2CreateParams.Body.AccountLevelRule.builder()
                        .parameters(
                            VelocityLimitParams.builder()
                                .period(
                                    VelocityLimitPeriod.TrailingWindowObject.builder()
                                        .duration(10L)
                                        .type(VelocityLimitPeriod.TrailingWindowObject.Type.CUSTOM)
                                        .build()
                                )
                                .scope(VelocityLimitParams.VelocityScope.CARD)
                                .build()
                        )
                        .type(
                            AuthRuleV2CreateParams.Body.AccountLevelRule.AuthRuleType.VELOCITY_LIMIT
                        )
                        .build()
                )
            )
    }
}
