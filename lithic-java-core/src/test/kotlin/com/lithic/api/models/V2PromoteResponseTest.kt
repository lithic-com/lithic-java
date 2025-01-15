// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V2PromoteResponseTest {

    @Test
    fun createV2PromoteResponse() {
        val v2PromoteResponse =
            V2PromoteResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addCardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currentVersion(
                    V2PromoteResponse.CurrentVersion.builder()
                        .parameters(
                            V2PromoteResponse.CurrentVersion.Parameters
                                .ofConditionalBlockParameters(
                                    ConditionalBlockParameters.builder()
                                        .addCondition(
                                            AuthRuleCondition.builder()
                                                .attribute(ConditionalAttribute.MCC)
                                                .operation(AuthRuleCondition.Operation.IS_ONE_OF)
                                                .value(AuthRuleCondition.Value.ofString("string"))
                                                .build()
                                        )
                                        .build()
                                )
                        )
                        .version(0L)
                        .build()
                )
                .draftVersion(
                    V2PromoteResponse.DraftVersion.builder()
                        .parameters(
                            V2PromoteResponse.DraftVersion.Parameters.ofConditionalBlockParameters(
                                ConditionalBlockParameters.builder()
                                    .addCondition(
                                        AuthRuleCondition.builder()
                                            .attribute(ConditionalAttribute.MCC)
                                            .operation(AuthRuleCondition.Operation.IS_ONE_OF)
                                            .value(AuthRuleCondition.Value.ofString("string"))
                                            .build()
                                    )
                                    .build()
                            )
                        )
                        .version(0L)
                        .build()
                )
                .name("name")
                .programLevel(true)
                .state(V2PromoteResponse.AuthRuleState.ACTIVE)
                .type(V2PromoteResponse.AuthRuleType.CONDITIONAL_BLOCK)
                .addExcludedCardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(v2PromoteResponse).isNotNull
        assertThat(v2PromoteResponse.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v2PromoteResponse.accountTokens())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v2PromoteResponse.cardTokens())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v2PromoteResponse.currentVersion())
            .contains(
                V2PromoteResponse.CurrentVersion.builder()
                    .parameters(
                        V2PromoteResponse.CurrentVersion.Parameters.ofConditionalBlockParameters(
                            ConditionalBlockParameters.builder()
                                .addCondition(
                                    AuthRuleCondition.builder()
                                        .attribute(ConditionalAttribute.MCC)
                                        .operation(AuthRuleCondition.Operation.IS_ONE_OF)
                                        .value(AuthRuleCondition.Value.ofString("string"))
                                        .build()
                                )
                                .build()
                        )
                    )
                    .version(0L)
                    .build()
            )
        assertThat(v2PromoteResponse.draftVersion())
            .contains(
                V2PromoteResponse.DraftVersion.builder()
                    .parameters(
                        V2PromoteResponse.DraftVersion.Parameters.ofConditionalBlockParameters(
                            ConditionalBlockParameters.builder()
                                .addCondition(
                                    AuthRuleCondition.builder()
                                        .attribute(ConditionalAttribute.MCC)
                                        .operation(AuthRuleCondition.Operation.IS_ONE_OF)
                                        .value(AuthRuleCondition.Value.ofString("string"))
                                        .build()
                                )
                                .build()
                        )
                    )
                    .version(0L)
                    .build()
            )
        assertThat(v2PromoteResponse.name()).contains("name")
        assertThat(v2PromoteResponse.programLevel()).isEqualTo(true)
        assertThat(v2PromoteResponse.state()).isEqualTo(V2PromoteResponse.AuthRuleState.ACTIVE)
        assertThat(v2PromoteResponse.type())
            .isEqualTo(V2PromoteResponse.AuthRuleType.CONDITIONAL_BLOCK)
        assertThat(v2PromoteResponse.excludedCardTokens().get())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
