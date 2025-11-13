// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConditionalAchActionParametersTest {

    @Test
    fun create() {
        val conditionalAchActionParameters =
            ConditionalAchActionParameters.builder()
                .action(
                    ConditionalAchActionParameters.Action.ApproveAction.builder()
                        .type(ConditionalAchActionParameters.Action.ApproveAction.Type.APPROVE)
                        .build()
                )
                .addCondition(
                    ConditionalAchActionParameters.Condition.builder()
                        .attribute(ConditionalAchActionParameters.Condition.Attribute.COMPANY_NAME)
                        .operation(ConditionalOperation.IS_ONE_OF)
                        .value("string")
                        .build()
                )
                .build()

        assertThat(conditionalAchActionParameters.action())
            .isEqualTo(
                ConditionalAchActionParameters.Action.ofApprove(
                    ConditionalAchActionParameters.Action.ApproveAction.builder()
                        .type(ConditionalAchActionParameters.Action.ApproveAction.Type.APPROVE)
                        .build()
                )
            )
        assertThat(conditionalAchActionParameters.conditions())
            .containsExactly(
                ConditionalAchActionParameters.Condition.builder()
                    .attribute(ConditionalAchActionParameters.Condition.Attribute.COMPANY_NAME)
                    .operation(ConditionalOperation.IS_ONE_OF)
                    .value("string")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conditionalAchActionParameters =
            ConditionalAchActionParameters.builder()
                .action(
                    ConditionalAchActionParameters.Action.ApproveAction.builder()
                        .type(ConditionalAchActionParameters.Action.ApproveAction.Type.APPROVE)
                        .build()
                )
                .addCondition(
                    ConditionalAchActionParameters.Condition.builder()
                        .attribute(ConditionalAchActionParameters.Condition.Attribute.COMPANY_NAME)
                        .operation(ConditionalOperation.IS_ONE_OF)
                        .value("string")
                        .build()
                )
                .build()

        val roundtrippedConditionalAchActionParameters =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conditionalAchActionParameters),
                jacksonTypeRef<ConditionalAchActionParameters>(),
            )

        assertThat(roundtrippedConditionalAchActionParameters)
            .isEqualTo(conditionalAchActionParameters)
    }
}
