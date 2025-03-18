// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

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
}
