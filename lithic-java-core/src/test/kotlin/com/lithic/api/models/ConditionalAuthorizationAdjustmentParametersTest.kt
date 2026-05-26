// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConditionalAuthorizationAdjustmentParametersTest {

    @Test
    fun create() {
        val conditionalAuthorizationAdjustmentParameters =
            ConditionalAuthorizationAdjustmentParameters.builder()
                .adjustment(
                    ConditionalAuthorizationAdjustmentParameters.Adjustment.builder()
                        .mode(
                            ConditionalAuthorizationAdjustmentParameters.Adjustment.Mode
                                .REPLACE_WITH_AMOUNT
                        )
                        .type(
                            ConditionalAuthorizationAdjustmentParameters.Adjustment.Type
                                .HOLD_ADJUSTMENT
                        )
                        .value(0L)
                        .build()
                )
                .addCondition(
                    ConditionalAuthorizationAdjustmentParameters.Condition.builder()
                        .attribute(
                            ConditionalAuthorizationAdjustmentParameters.Condition.Attribute.MCC
                        )
                        .operation(ConditionalOperation.IS_ONE_OF)
                        .value("string")
                        .parameters(
                            ConditionalAuthorizationAdjustmentParameters.Condition.Parameters
                                .builder()
                                .interval(
                                    ConditionalAuthorizationAdjustmentParameters.Condition
                                        .Parameters
                                        .Interval
                                        .LIFETIME
                                )
                                .scope(
                                    ConditionalAuthorizationAdjustmentParameters.Condition
                                        .Parameters
                                        .Scope
                                        .CARD
                                )
                                .unit(
                                    ConditionalAuthorizationAdjustmentParameters.Condition
                                        .Parameters
                                        .Unit
                                        .MPH
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(conditionalAuthorizationAdjustmentParameters.adjustment())
            .isEqualTo(
                ConditionalAuthorizationAdjustmentParameters.Adjustment.builder()
                    .mode(
                        ConditionalAuthorizationAdjustmentParameters.Adjustment.Mode
                            .REPLACE_WITH_AMOUNT
                    )
                    .type(
                        ConditionalAuthorizationAdjustmentParameters.Adjustment.Type.HOLD_ADJUSTMENT
                    )
                    .value(0L)
                    .build()
            )
        assertThat(conditionalAuthorizationAdjustmentParameters.conditions())
            .containsExactly(
                ConditionalAuthorizationAdjustmentParameters.Condition.builder()
                    .attribute(ConditionalAuthorizationAdjustmentParameters.Condition.Attribute.MCC)
                    .operation(ConditionalOperation.IS_ONE_OF)
                    .value("string")
                    .parameters(
                        ConditionalAuthorizationAdjustmentParameters.Condition.Parameters.builder()
                            .interval(
                                ConditionalAuthorizationAdjustmentParameters.Condition.Parameters
                                    .Interval
                                    .LIFETIME
                            )
                            .scope(
                                ConditionalAuthorizationAdjustmentParameters.Condition.Parameters
                                    .Scope
                                    .CARD
                            )
                            .unit(
                                ConditionalAuthorizationAdjustmentParameters.Condition.Parameters
                                    .Unit
                                    .MPH
                            )
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conditionalAuthorizationAdjustmentParameters =
            ConditionalAuthorizationAdjustmentParameters.builder()
                .adjustment(
                    ConditionalAuthorizationAdjustmentParameters.Adjustment.builder()
                        .mode(
                            ConditionalAuthorizationAdjustmentParameters.Adjustment.Mode
                                .REPLACE_WITH_AMOUNT
                        )
                        .type(
                            ConditionalAuthorizationAdjustmentParameters.Adjustment.Type
                                .HOLD_ADJUSTMENT
                        )
                        .value(0L)
                        .build()
                )
                .addCondition(
                    ConditionalAuthorizationAdjustmentParameters.Condition.builder()
                        .attribute(
                            ConditionalAuthorizationAdjustmentParameters.Condition.Attribute.MCC
                        )
                        .operation(ConditionalOperation.IS_ONE_OF)
                        .value("string")
                        .parameters(
                            ConditionalAuthorizationAdjustmentParameters.Condition.Parameters
                                .builder()
                                .interval(
                                    ConditionalAuthorizationAdjustmentParameters.Condition
                                        .Parameters
                                        .Interval
                                        .LIFETIME
                                )
                                .scope(
                                    ConditionalAuthorizationAdjustmentParameters.Condition
                                        .Parameters
                                        .Scope
                                        .CARD
                                )
                                .unit(
                                    ConditionalAuthorizationAdjustmentParameters.Condition
                                        .Parameters
                                        .Unit
                                        .MPH
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedConditionalAuthorizationAdjustmentParameters =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conditionalAuthorizationAdjustmentParameters),
                jacksonTypeRef<ConditionalAuthorizationAdjustmentParameters>(),
            )

        assertThat(roundtrippedConditionalAuthorizationAdjustmentParameters)
            .isEqualTo(conditionalAuthorizationAdjustmentParameters)
    }
}
