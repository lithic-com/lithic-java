// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConditionalAchPaymentUpdateActionParametersTest {

    @Test
    fun create() {
        val conditionalAchPaymentUpdateActionParameters =
            ConditionalAchPaymentUpdateActionParameters.builder()
                .action(
                    AchPaymentUpdateAction.TagAction.builder()
                        .key("key")
                        .type(AchPaymentUpdateAction.TagAction.Type.TAG)
                        .value("value")
                        .build()
                )
                .addCondition(
                    ConditionalAchPaymentUpdateActionParameters.Condition.builder()
                        .attribute(
                            ConditionalAchPaymentUpdateActionParameters.Condition.Attribute
                                .TRANSACTION_AMOUNT
                        )
                        .operation(ConditionalOperation.IS_ONE_OF)
                        .value("string")
                        .build()
                )
                .build()

        assertThat(conditionalAchPaymentUpdateActionParameters.action())
            .isEqualTo(
                AchPaymentUpdateAction.ofTag(
                    AchPaymentUpdateAction.TagAction.builder()
                        .key("key")
                        .type(AchPaymentUpdateAction.TagAction.Type.TAG)
                        .value("value")
                        .build()
                )
            )
        assertThat(conditionalAchPaymentUpdateActionParameters.conditions())
            .containsExactly(
                ConditionalAchPaymentUpdateActionParameters.Condition.builder()
                    .attribute(
                        ConditionalAchPaymentUpdateActionParameters.Condition.Attribute
                            .TRANSACTION_AMOUNT
                    )
                    .operation(ConditionalOperation.IS_ONE_OF)
                    .value("string")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conditionalAchPaymentUpdateActionParameters =
            ConditionalAchPaymentUpdateActionParameters.builder()
                .action(
                    AchPaymentUpdateAction.TagAction.builder()
                        .key("key")
                        .type(AchPaymentUpdateAction.TagAction.Type.TAG)
                        .value("value")
                        .build()
                )
                .addCondition(
                    ConditionalAchPaymentUpdateActionParameters.Condition.builder()
                        .attribute(
                            ConditionalAchPaymentUpdateActionParameters.Condition.Attribute
                                .TRANSACTION_AMOUNT
                        )
                        .operation(ConditionalOperation.IS_ONE_OF)
                        .value("string")
                        .build()
                )
                .build()

        val roundtrippedConditionalAchPaymentUpdateActionParameters =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conditionalAchPaymentUpdateActionParameters),
                jacksonTypeRef<ConditionalAchPaymentUpdateActionParameters>(),
            )

        assertThat(roundtrippedConditionalAchPaymentUpdateActionParameters)
            .isEqualTo(conditionalAchPaymentUpdateActionParameters)
    }
}
