// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthRuleConditionTest {

    @Test
    fun create() {
        val authRuleCondition =
            AuthRuleCondition.builder()
                .attribute(ConditionalAttribute.MCC)
                .operation(ConditionalOperation.IS_ONE_OF)
                .value("string")
                .parameters(
                    AuthRuleCondition.Parameters.builder()
                        .interval(AuthRuleCondition.Parameters.Interval.LIFETIME)
                        .scope(AuthRuleCondition.Parameters.Scope.CARD)
                        .unit(AuthRuleCondition.Parameters.Unit.MPH)
                        .build()
                )
                .build()

        assertThat(authRuleCondition.attribute()).isEqualTo(ConditionalAttribute.MCC)
        assertThat(authRuleCondition.operation()).isEqualTo(ConditionalOperation.IS_ONE_OF)
        assertThat(authRuleCondition.value()).isEqualTo(ConditionalValue.ofRegex("string"))
        assertThat(authRuleCondition.parameters())
            .contains(
                AuthRuleCondition.Parameters.builder()
                    .interval(AuthRuleCondition.Parameters.Interval.LIFETIME)
                    .scope(AuthRuleCondition.Parameters.Scope.CARD)
                    .unit(AuthRuleCondition.Parameters.Unit.MPH)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authRuleCondition =
            AuthRuleCondition.builder()
                .attribute(ConditionalAttribute.MCC)
                .operation(ConditionalOperation.IS_ONE_OF)
                .value("string")
                .parameters(
                    AuthRuleCondition.Parameters.builder()
                        .interval(AuthRuleCondition.Parameters.Interval.LIFETIME)
                        .scope(AuthRuleCondition.Parameters.Scope.CARD)
                        .unit(AuthRuleCondition.Parameters.Unit.MPH)
                        .build()
                )
                .build()

        val roundtrippedAuthRuleCondition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authRuleCondition),
                jacksonTypeRef<AuthRuleCondition>(),
            )

        assertThat(roundtrippedAuthRuleCondition).isEqualTo(authRuleCondition)
    }
}
