// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConditionalBlockParametersTest {

    @Test
    fun create() {
        val conditionalBlockParameters =
            ConditionalBlockParameters.builder()
                .addCondition(
                    AuthRuleCondition.builder()
                        .attribute(ConditionalAttribute.MCC)
                        .operation(AuthRuleCondition.Operation.IS_ONE_OF)
                        .value("string")
                        .build()
                )
                .build()

        assertThat(conditionalBlockParameters.conditions())
            .containsExactly(
                AuthRuleCondition.builder()
                    .attribute(ConditionalAttribute.MCC)
                    .operation(AuthRuleCondition.Operation.IS_ONE_OF)
                    .value("string")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conditionalBlockParameters =
            ConditionalBlockParameters.builder()
                .addCondition(
                    AuthRuleCondition.builder()
                        .attribute(ConditionalAttribute.MCC)
                        .operation(AuthRuleCondition.Operation.IS_ONE_OF)
                        .value("string")
                        .build()
                )
                .build()

        val roundtrippedConditionalBlockParameters =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conditionalBlockParameters),
                jacksonTypeRef<ConditionalBlockParameters>(),
            )

        assertThat(roundtrippedConditionalBlockParameters).isEqualTo(conditionalBlockParameters)
    }
}
