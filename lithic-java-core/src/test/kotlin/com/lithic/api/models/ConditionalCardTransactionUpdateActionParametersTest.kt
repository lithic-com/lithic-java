// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.JsonValue
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConditionalCardTransactionUpdateActionParametersTest {

    @Test
    fun create() {
        val conditionalCardTransactionUpdateActionParameters =
            ConditionalCardTransactionUpdateActionParameters.builder()
                .action(
                    CardTransactionUpdateAction.TagAction.builder()
                        .key("key")
                        .type(CardTransactionUpdateAction.TagAction.Type.TAG)
                        .value("value")
                        .build()
                )
                .addCondition(
                    ConditionalCardTransactionUpdateActionParameters.Condition.builder()
                        .attribute(
                            ConditionalCardTransactionUpdateActionParameters.Condition.Attribute.MCC
                        )
                        .operation(ConditionalOperation.IS_ONE_OF)
                        .value("string")
                        .parameters(
                            ConditionalCardTransactionUpdateActionParameters.Condition.Parameters
                                .builder()
                                .filters(
                                    SpendVelocityFilters.builder()
                                        .addExcludeCountry("USD")
                                        .addExcludeMcc("5542")
                                        .addIncludeCountry("USD")
                                        .addIncludeMcc("5542")
                                        .addIncludePanEntryMode(
                                            VelocityLimitFilters.IncludePanEntryMode.AUTO_ENTRY
                                        )
                                        .excludeTags(
                                            SpendVelocityFilters.ExcludeTags.builder()
                                                .putAdditionalProperty(
                                                    "foo",
                                                    JsonValue.from("string"),
                                                )
                                                .build()
                                        )
                                        .includeTags(
                                            SpendVelocityFilters.IncludeTags.builder()
                                                .putAdditionalProperty(
                                                    "foo",
                                                    JsonValue.from("string"),
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .period(
                                    VelocityLimitPeriod.TrailingWindowObject.builder()
                                        .duration(10L)
                                        .type(VelocityLimitPeriod.TrailingWindowObject.Type.CUSTOM)
                                        .build()
                                )
                                .scope(
                                    ConditionalCardTransactionUpdateActionParameters.Condition
                                        .Parameters
                                        .Scope
                                        .CARD
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(conditionalCardTransactionUpdateActionParameters.action())
            .isEqualTo(
                CardTransactionUpdateAction.ofTag(
                    CardTransactionUpdateAction.TagAction.builder()
                        .key("key")
                        .type(CardTransactionUpdateAction.TagAction.Type.TAG)
                        .value("value")
                        .build()
                )
            )
        assertThat(conditionalCardTransactionUpdateActionParameters.conditions())
            .containsExactly(
                ConditionalCardTransactionUpdateActionParameters.Condition.builder()
                    .attribute(
                        ConditionalCardTransactionUpdateActionParameters.Condition.Attribute.MCC
                    )
                    .operation(ConditionalOperation.IS_ONE_OF)
                    .value("string")
                    .parameters(
                        ConditionalCardTransactionUpdateActionParameters.Condition.Parameters
                            .builder()
                            .filters(
                                SpendVelocityFilters.builder()
                                    .addExcludeCountry("USD")
                                    .addExcludeMcc("5542")
                                    .addIncludeCountry("USD")
                                    .addIncludeMcc("5542")
                                    .addIncludePanEntryMode(
                                        VelocityLimitFilters.IncludePanEntryMode.AUTO_ENTRY
                                    )
                                    .excludeTags(
                                        SpendVelocityFilters.ExcludeTags.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .includeTags(
                                        SpendVelocityFilters.IncludeTags.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .build()
                            )
                            .period(
                                VelocityLimitPeriod.TrailingWindowObject.builder()
                                    .duration(10L)
                                    .type(VelocityLimitPeriod.TrailingWindowObject.Type.CUSTOM)
                                    .build()
                            )
                            .scope(
                                ConditionalCardTransactionUpdateActionParameters.Condition
                                    .Parameters
                                    .Scope
                                    .CARD
                            )
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conditionalCardTransactionUpdateActionParameters =
            ConditionalCardTransactionUpdateActionParameters.builder()
                .action(
                    CardTransactionUpdateAction.TagAction.builder()
                        .key("key")
                        .type(CardTransactionUpdateAction.TagAction.Type.TAG)
                        .value("value")
                        .build()
                )
                .addCondition(
                    ConditionalCardTransactionUpdateActionParameters.Condition.builder()
                        .attribute(
                            ConditionalCardTransactionUpdateActionParameters.Condition.Attribute.MCC
                        )
                        .operation(ConditionalOperation.IS_ONE_OF)
                        .value("string")
                        .parameters(
                            ConditionalCardTransactionUpdateActionParameters.Condition.Parameters
                                .builder()
                                .filters(
                                    SpendVelocityFilters.builder()
                                        .addExcludeCountry("USD")
                                        .addExcludeMcc("5542")
                                        .addIncludeCountry("USD")
                                        .addIncludeMcc("5542")
                                        .addIncludePanEntryMode(
                                            VelocityLimitFilters.IncludePanEntryMode.AUTO_ENTRY
                                        )
                                        .excludeTags(
                                            SpendVelocityFilters.ExcludeTags.builder()
                                                .putAdditionalProperty(
                                                    "foo",
                                                    JsonValue.from("string"),
                                                )
                                                .build()
                                        )
                                        .includeTags(
                                            SpendVelocityFilters.IncludeTags.builder()
                                                .putAdditionalProperty(
                                                    "foo",
                                                    JsonValue.from("string"),
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .period(
                                    VelocityLimitPeriod.TrailingWindowObject.builder()
                                        .duration(10L)
                                        .type(VelocityLimitPeriod.TrailingWindowObject.Type.CUSTOM)
                                        .build()
                                )
                                .scope(
                                    ConditionalCardTransactionUpdateActionParameters.Condition
                                        .Parameters
                                        .Scope
                                        .CARD
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedConditionalCardTransactionUpdateActionParameters =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conditionalCardTransactionUpdateActionParameters),
                jacksonTypeRef<ConditionalCardTransactionUpdateActionParameters>(),
            )

        assertThat(roundtrippedConditionalCardTransactionUpdateActionParameters)
            .isEqualTo(conditionalCardTransactionUpdateActionParameters)
    }
}
