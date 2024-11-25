// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V2UpdateResponseTest {

    @Test
    fun createV2UpdateResponse() {
        val v2UpdateResponse =
            V2UpdateResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountTokens(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .cardTokens(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .currentVersion(
                    V2UpdateResponse.CurrentVersion.builder()
                        .parameters(
                            V2UpdateResponse.CurrentVersion.Parameters.ofConditionalBlockParameters(
                                V2UpdateResponse.CurrentVersion.Parameters
                                    .ConditionalBlockParameters
                                    .builder()
                                    .conditions(
                                        listOf(
                                            V2UpdateResponse.CurrentVersion.Parameters
                                                .ConditionalBlockParameters
                                                .Condition
                                                .builder()
                                                .attribute(
                                                    V2UpdateResponse.CurrentVersion.Parameters
                                                        .ConditionalBlockParameters
                                                        .Condition
                                                        .Attribute
                                                        .MCC
                                                )
                                                .operation(
                                                    V2UpdateResponse.CurrentVersion.Parameters
                                                        .ConditionalBlockParameters
                                                        .Condition
                                                        .Operation
                                                        .IS_ONE_OF
                                                )
                                                .value(
                                                    V2UpdateResponse.CurrentVersion.Parameters
                                                        .ConditionalBlockParameters
                                                        .Condition
                                                        .Value
                                                        .ofString("string")
                                                )
                                                .build()
                                        )
                                    )
                                    .build()
                            )
                        )
                        .version(0L)
                        .build()
                )
                .draftVersion(
                    V2UpdateResponse.DraftVersion.builder()
                        .parameters(
                            V2UpdateResponse.DraftVersion.Parameters.ofConditionalBlockParameters(
                                V2UpdateResponse.DraftVersion.Parameters.ConditionalBlockParameters
                                    .builder()
                                    .conditions(
                                        listOf(
                                            V2UpdateResponse.DraftVersion.Parameters
                                                .ConditionalBlockParameters
                                                .Condition
                                                .builder()
                                                .attribute(
                                                    V2UpdateResponse.DraftVersion.Parameters
                                                        .ConditionalBlockParameters
                                                        .Condition
                                                        .Attribute
                                                        .MCC
                                                )
                                                .operation(
                                                    V2UpdateResponse.DraftVersion.Parameters
                                                        .ConditionalBlockParameters
                                                        .Condition
                                                        .Operation
                                                        .IS_ONE_OF
                                                )
                                                .value(
                                                    V2UpdateResponse.DraftVersion.Parameters
                                                        .ConditionalBlockParameters
                                                        .Condition
                                                        .Value
                                                        .ofString("string")
                                                )
                                                .build()
                                        )
                                    )
                                    .build()
                            )
                        )
                        .version(0L)
                        .build()
                )
                .programLevel(true)
                .state(V2UpdateResponse.AuthRuleState.ACTIVE)
                .type(V2UpdateResponse.AuthRuleType.CONDITIONAL_BLOCK)
                .build()
        assertThat(v2UpdateResponse).isNotNull
        assertThat(v2UpdateResponse.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v2UpdateResponse.accountTokens())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v2UpdateResponse.cardTokens())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v2UpdateResponse.currentVersion())
            .contains(
                V2UpdateResponse.CurrentVersion.builder()
                    .parameters(
                        V2UpdateResponse.CurrentVersion.Parameters.ofConditionalBlockParameters(
                            V2UpdateResponse.CurrentVersion.Parameters.ConditionalBlockParameters
                                .builder()
                                .conditions(
                                    listOf(
                                        V2UpdateResponse.CurrentVersion.Parameters
                                            .ConditionalBlockParameters
                                            .Condition
                                            .builder()
                                            .attribute(
                                                V2UpdateResponse.CurrentVersion.Parameters
                                                    .ConditionalBlockParameters
                                                    .Condition
                                                    .Attribute
                                                    .MCC
                                            )
                                            .operation(
                                                V2UpdateResponse.CurrentVersion.Parameters
                                                    .ConditionalBlockParameters
                                                    .Condition
                                                    .Operation
                                                    .IS_ONE_OF
                                            )
                                            .value(
                                                V2UpdateResponse.CurrentVersion.Parameters
                                                    .ConditionalBlockParameters
                                                    .Condition
                                                    .Value
                                                    .ofString("string")
                                            )
                                            .build()
                                    )
                                )
                                .build()
                        )
                    )
                    .version(0L)
                    .build()
            )
        assertThat(v2UpdateResponse.draftVersion())
            .contains(
                V2UpdateResponse.DraftVersion.builder()
                    .parameters(
                        V2UpdateResponse.DraftVersion.Parameters.ofConditionalBlockParameters(
                            V2UpdateResponse.DraftVersion.Parameters.ConditionalBlockParameters
                                .builder()
                                .conditions(
                                    listOf(
                                        V2UpdateResponse.DraftVersion.Parameters
                                            .ConditionalBlockParameters
                                            .Condition
                                            .builder()
                                            .attribute(
                                                V2UpdateResponse.DraftVersion.Parameters
                                                    .ConditionalBlockParameters
                                                    .Condition
                                                    .Attribute
                                                    .MCC
                                            )
                                            .operation(
                                                V2UpdateResponse.DraftVersion.Parameters
                                                    .ConditionalBlockParameters
                                                    .Condition
                                                    .Operation
                                                    .IS_ONE_OF
                                            )
                                            .value(
                                                V2UpdateResponse.DraftVersion.Parameters
                                                    .ConditionalBlockParameters
                                                    .Condition
                                                    .Value
                                                    .ofString("string")
                                            )
                                            .build()
                                    )
                                )
                                .build()
                        )
                    )
                    .version(0L)
                    .build()
            )
        assertThat(v2UpdateResponse.programLevel()).isEqualTo(true)
        assertThat(v2UpdateResponse.state()).isEqualTo(V2UpdateResponse.AuthRuleState.ACTIVE)
        assertThat(v2UpdateResponse.type())
            .isEqualTo(V2UpdateResponse.AuthRuleType.CONDITIONAL_BLOCK)
    }
}
