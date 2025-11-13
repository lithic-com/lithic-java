// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class Conditional3dsActionParametersTest {

    @Test
    fun create() {
        val conditional3dsActionParameters =
            Conditional3dsActionParameters.builder()
                .action(Conditional3dsActionParameters.Action.DECLINE)
                .addCondition(
                    Conditional3dsActionParameters.Condition.builder()
                        .attribute(Conditional3dsActionParameters.Condition.Attribute.MCC)
                        .operation(ConditionalOperation.IS_ONE_OF)
                        .value("string")
                        .build()
                )
                .build()

        assertThat(conditional3dsActionParameters.action())
            .isEqualTo(Conditional3dsActionParameters.Action.DECLINE)
        assertThat(conditional3dsActionParameters.conditions())
            .containsExactly(
                Conditional3dsActionParameters.Condition.builder()
                    .attribute(Conditional3dsActionParameters.Condition.Attribute.MCC)
                    .operation(ConditionalOperation.IS_ONE_OF)
                    .value("string")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conditional3dsActionParameters =
            Conditional3dsActionParameters.builder()
                .action(Conditional3dsActionParameters.Action.DECLINE)
                .addCondition(
                    Conditional3dsActionParameters.Condition.builder()
                        .attribute(Conditional3dsActionParameters.Condition.Attribute.MCC)
                        .operation(ConditionalOperation.IS_ONE_OF)
                        .value("string")
                        .build()
                )
                .build()

        val roundtrippedConditional3dsActionParameters =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conditional3dsActionParameters),
                jacksonTypeRef<Conditional3dsActionParameters>(),
            )

        assertThat(roundtrippedConditional3dsActionParameters)
            .isEqualTo(conditional3dsActionParameters)
    }
}
