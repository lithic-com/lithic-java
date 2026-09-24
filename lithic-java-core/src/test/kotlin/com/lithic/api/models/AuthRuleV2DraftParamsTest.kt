// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthRuleV2DraftParamsTest {

    @Test
    fun create() {
        AuthRuleV2DraftParams.builder()
            .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AuthRuleV2DraftParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AuthRuleV2DraftParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                .build()

        val body = params._body()

        assertThat(body.parameters())
            .contains(
                AuthRuleV2DraftParams.Parameters.ofVelocityLimitParams(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AuthRuleV2DraftParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
