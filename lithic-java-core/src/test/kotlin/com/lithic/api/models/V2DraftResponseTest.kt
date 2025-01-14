// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V2DraftResponseTest {

    @Test
    fun createV2DraftResponse() {
        val v2DraftResponse =
            V2DraftResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountTokens(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .cardTokens(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .currentVersion(
                    V2DraftResponse.CurrentVersion.builder()
                        .parameters(
                            V2DraftResponse.CurrentVersion.Parameters.ofConditionalBlockParameters(
                                ConditionalBlockParameters.builder()
                                    .conditions(
                                        listOf(
                                            AuthRuleCondition.builder()
                                                .attribute(ConditionalAttribute.MCC)
                                                .operation(AuthRuleCondition.Operation.IS_ONE_OF)
                                                .value(AuthRuleCondition.Value.ofString("string"))
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
                    V2DraftResponse.DraftVersion.builder()
                        .parameters(
                            V2DraftResponse.DraftVersion.Parameters.ofConditionalBlockParameters(
                                ConditionalBlockParameters.builder()
                                    .conditions(
                                        listOf(
                                            AuthRuleCondition.builder()
                                                .attribute(ConditionalAttribute.MCC)
                                                .operation(AuthRuleCondition.Operation.IS_ONE_OF)
                                                .value(AuthRuleCondition.Value.ofString("string"))
                                                .build()
                                        )
                                    )
                                    .build()
                            )
                        )
                        .version(0L)
                        .build()
                )
                .name("name")
                .programLevel(true)
                .state(V2DraftResponse.AuthRuleState.ACTIVE)
                .type(V2DraftResponse.AuthRuleType.CONDITIONAL_BLOCK)
                .excludedCardTokens(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .build()
        assertThat(v2DraftResponse).isNotNull
        assertThat(v2DraftResponse.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v2DraftResponse.accountTokens())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v2DraftResponse.cardTokens())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v2DraftResponse.currentVersion())
            .contains(
                V2DraftResponse.CurrentVersion.builder()
                    .parameters(
                        V2DraftResponse.CurrentVersion.Parameters.ofConditionalBlockParameters(
                            ConditionalBlockParameters.builder()
                                .conditions(
                                    listOf(
                                        AuthRuleCondition.builder()
                                            .attribute(ConditionalAttribute.MCC)
                                            .operation(AuthRuleCondition.Operation.IS_ONE_OF)
                                            .value(AuthRuleCondition.Value.ofString("string"))
                                            .build()
                                    )
                                )
                                .build()
                        )
                    )
                    .version(0L)
                    .build()
            )
        assertThat(v2DraftResponse.draftVersion())
            .contains(
                V2DraftResponse.DraftVersion.builder()
                    .parameters(
                        V2DraftResponse.DraftVersion.Parameters.ofConditionalBlockParameters(
                            ConditionalBlockParameters.builder()
                                .conditions(
                                    listOf(
                                        AuthRuleCondition.builder()
                                            .attribute(ConditionalAttribute.MCC)
                                            .operation(AuthRuleCondition.Operation.IS_ONE_OF)
                                            .value(AuthRuleCondition.Value.ofString("string"))
                                            .build()
                                    )
                                )
                                .build()
                        )
                    )
                    .version(0L)
                    .build()
            )
        assertThat(v2DraftResponse.name()).contains("name")
        assertThat(v2DraftResponse.programLevel()).isEqualTo(true)
        assertThat(v2DraftResponse.state()).isEqualTo(V2DraftResponse.AuthRuleState.ACTIVE)
        assertThat(v2DraftResponse.type()).isEqualTo(V2DraftResponse.AuthRuleType.CONDITIONAL_BLOCK)
        assertThat(v2DraftResponse.excludedCardTokens().get())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
