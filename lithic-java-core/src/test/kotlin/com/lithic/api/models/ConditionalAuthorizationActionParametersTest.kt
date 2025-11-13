// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConditionalAuthorizationActionParametersTest {

    @Test
    fun create() {
        val conditionalAuthorizationActionParameters =
            ConditionalAuthorizationActionParameters.builder()
                .action(ConditionalAuthorizationActionParameters.Action.DECLINE)
                .addCondition(
                    ConditionalAuthorizationActionParameters.Condition.builder()
                        .attribute(ConditionalAuthorizationActionParameters.Condition.Attribute.MCC)
                        .operation(ConditionalOperation.IS_ONE_OF)
                        .value("string")
                        .build()
                )
                .build()

        assertThat(conditionalAuthorizationActionParameters.action())
            .isEqualTo(ConditionalAuthorizationActionParameters.Action.DECLINE)
        assertThat(conditionalAuthorizationActionParameters.conditions())
            .containsExactly(
                ConditionalAuthorizationActionParameters.Condition.builder()
                    .attribute(ConditionalAuthorizationActionParameters.Condition.Attribute.MCC)
                    .operation(ConditionalOperation.IS_ONE_OF)
                    .value("string")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conditionalAuthorizationActionParameters =
            ConditionalAuthorizationActionParameters.builder()
                .action(ConditionalAuthorizationActionParameters.Action.DECLINE)
                .addCondition(
                    ConditionalAuthorizationActionParameters.Condition.builder()
                        .attribute(ConditionalAuthorizationActionParameters.Condition.Attribute.MCC)
                        .operation(ConditionalOperation.IS_ONE_OF)
                        .value("string")
                        .build()
                )
                .build()

        val roundtrippedConditionalAuthorizationActionParameters =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conditionalAuthorizationActionParameters),
                jacksonTypeRef<ConditionalAuthorizationActionParameters>(),
            )

        assertThat(roundtrippedConditionalAuthorizationActionParameters)
            .isEqualTo(conditionalAuthorizationActionParameters)
    }
}
