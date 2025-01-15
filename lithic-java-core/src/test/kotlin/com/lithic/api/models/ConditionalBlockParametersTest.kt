// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ConditionalBlockParametersTest {

    @Test
    fun createConditionalBlockParameters() {
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
        assertThat(conditionalBlockParameters).isNotNull
        assertThat(conditionalBlockParameters.conditions())
            .containsExactly(
                AuthRuleCondition.builder()
                    .attribute(ConditionalAttribute.MCC)
                    .operation(AuthRuleCondition.Operation.IS_ONE_OF)
                    .value("string")
                    .build()
            )
    }
}
