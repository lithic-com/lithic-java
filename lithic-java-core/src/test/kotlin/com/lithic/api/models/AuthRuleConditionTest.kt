// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuthRuleConditionTest {

    @Test
    fun createAuthRuleCondition() {
        val authRuleCondition =
            AuthRuleCondition.builder()
                .attribute(ConditionalAttribute.MCC)
                .operation(AuthRuleCondition.Operation.IS_ONE_OF)
                .value("string")
                .build()
        assertThat(authRuleCondition).isNotNull
        assertThat(authRuleCondition.attribute()).contains(ConditionalAttribute.MCC)
        assertThat(authRuleCondition.operation()).contains(AuthRuleCondition.Operation.IS_ONE_OF)
        assertThat(authRuleCondition.value()).contains(AuthRuleCondition.Value.ofString("string"))
    }
}
