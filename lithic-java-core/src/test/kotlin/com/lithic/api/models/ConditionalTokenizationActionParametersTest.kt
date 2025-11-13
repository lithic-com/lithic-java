// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConditionalTokenizationActionParametersTest {

    @Test
    fun create() {
        val conditionalTokenizationActionParameters =
            ConditionalTokenizationActionParameters.builder()
                .action(
                    ConditionalTokenizationActionParameters.Action.DeclineAction.builder()
                        .type(
                            ConditionalTokenizationActionParameters.Action.DeclineAction.Type
                                .DECLINE
                        )
                        .reason(
                            ConditionalTokenizationActionParameters.Action.DeclineAction.Reason
                                .ACCOUNT_SCORE_1
                        )
                        .build()
                )
                .addCondition(
                    ConditionalTokenizationActionParameters.Condition.builder()
                        .attribute(
                            ConditionalTokenizationActionParameters.Condition.Attribute.TIMESTAMP
                        )
                        .operation(ConditionalOperation.IS_ONE_OF)
                        .value("string")
                        .build()
                )
                .build()

        assertThat(conditionalTokenizationActionParameters.action())
            .isEqualTo(
                ConditionalTokenizationActionParameters.Action.ofDecline(
                    ConditionalTokenizationActionParameters.Action.DeclineAction.builder()
                        .type(
                            ConditionalTokenizationActionParameters.Action.DeclineAction.Type
                                .DECLINE
                        )
                        .reason(
                            ConditionalTokenizationActionParameters.Action.DeclineAction.Reason
                                .ACCOUNT_SCORE_1
                        )
                        .build()
                )
            )
        assertThat(conditionalTokenizationActionParameters.conditions())
            .containsExactly(
                ConditionalTokenizationActionParameters.Condition.builder()
                    .attribute(
                        ConditionalTokenizationActionParameters.Condition.Attribute.TIMESTAMP
                    )
                    .operation(ConditionalOperation.IS_ONE_OF)
                    .value("string")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conditionalTokenizationActionParameters =
            ConditionalTokenizationActionParameters.builder()
                .action(
                    ConditionalTokenizationActionParameters.Action.DeclineAction.builder()
                        .type(
                            ConditionalTokenizationActionParameters.Action.DeclineAction.Type
                                .DECLINE
                        )
                        .reason(
                            ConditionalTokenizationActionParameters.Action.DeclineAction.Reason
                                .ACCOUNT_SCORE_1
                        )
                        .build()
                )
                .addCondition(
                    ConditionalTokenizationActionParameters.Condition.builder()
                        .attribute(
                            ConditionalTokenizationActionParameters.Condition.Attribute.TIMESTAMP
                        )
                        .operation(ConditionalOperation.IS_ONE_OF)
                        .value("string")
                        .build()
                )
                .build()

        val roundtrippedConditionalTokenizationActionParameters =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conditionalTokenizationActionParameters),
                jacksonTypeRef<ConditionalTokenizationActionParameters>(),
            )

        assertThat(roundtrippedConditionalTokenizationActionParameters)
            .isEqualTo(conditionalTokenizationActionParameters)
    }
}
