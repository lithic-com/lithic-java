// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthRuleTest {

    @Test
    fun create() {
        val authRule =
            AuthRule.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBusinessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addCardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currentVersion(
                    AuthRule.CurrentVersion.builder()
                        .parameters(
                            ConditionalBlockParameters.builder()
                                .addCondition(
                                    AuthRuleCondition.builder()
                                        .attribute(ConditionalAttribute.MCC)
                                        .operation(ConditionalOperation.IS_ONE_OF)
                                        .value("string")
                                        .build()
                                )
                                .build()
                        )
                        .version(0L)
                        .build()
                )
                .draftVersion(
                    AuthRule.DraftVersion.builder()
                        .parameters(
                            ConditionalBlockParameters.builder()
                                .addCondition(
                                    AuthRuleCondition.builder()
                                        .attribute(ConditionalAttribute.MCC)
                                        .operation(ConditionalOperation.IS_ONE_OF)
                                        .value("string")
                                        .build()
                                )
                                .build()
                        )
                        .version(0L)
                        .build()
                )
                .eventStream(AuthRule.EventStream.AUTHORIZATION)
                .lithicManaged(true)
                .name("name")
                .programLevel(true)
                .state(AuthRule.AuthRuleState.ACTIVE)
                .type(AuthRule.AuthRuleType.CONDITIONAL_BLOCK)
                .addExcludedCardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(authRule.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(authRule.accountTokens()).containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(authRule.businessAccountTokens())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(authRule.cardTokens()).containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(authRule.currentVersion())
            .contains(
                AuthRule.CurrentVersion.builder()
                    .parameters(
                        ConditionalBlockParameters.builder()
                            .addCondition(
                                AuthRuleCondition.builder()
                                    .attribute(ConditionalAttribute.MCC)
                                    .operation(ConditionalOperation.IS_ONE_OF)
                                    .value("string")
                                    .build()
                            )
                            .build()
                    )
                    .version(0L)
                    .build()
            )
        assertThat(authRule.draftVersion())
            .contains(
                AuthRule.DraftVersion.builder()
                    .parameters(
                        ConditionalBlockParameters.builder()
                            .addCondition(
                                AuthRuleCondition.builder()
                                    .attribute(ConditionalAttribute.MCC)
                                    .operation(ConditionalOperation.IS_ONE_OF)
                                    .value("string")
                                    .build()
                            )
                            .build()
                    )
                    .version(0L)
                    .build()
            )
        assertThat(authRule.eventStream()).isEqualTo(AuthRule.EventStream.AUTHORIZATION)
        assertThat(authRule.lithicManaged()).isEqualTo(true)
        assertThat(authRule.name()).contains("name")
        assertThat(authRule.programLevel()).isEqualTo(true)
        assertThat(authRule.state()).isEqualTo(AuthRule.AuthRuleState.ACTIVE)
        assertThat(authRule.type()).isEqualTo(AuthRule.AuthRuleType.CONDITIONAL_BLOCK)
        assertThat(authRule.excludedCardTokens().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authRule =
            AuthRule.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBusinessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addCardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currentVersion(
                    AuthRule.CurrentVersion.builder()
                        .parameters(
                            ConditionalBlockParameters.builder()
                                .addCondition(
                                    AuthRuleCondition.builder()
                                        .attribute(ConditionalAttribute.MCC)
                                        .operation(ConditionalOperation.IS_ONE_OF)
                                        .value("string")
                                        .build()
                                )
                                .build()
                        )
                        .version(0L)
                        .build()
                )
                .draftVersion(
                    AuthRule.DraftVersion.builder()
                        .parameters(
                            ConditionalBlockParameters.builder()
                                .addCondition(
                                    AuthRuleCondition.builder()
                                        .attribute(ConditionalAttribute.MCC)
                                        .operation(ConditionalOperation.IS_ONE_OF)
                                        .value("string")
                                        .build()
                                )
                                .build()
                        )
                        .version(0L)
                        .build()
                )
                .eventStream(AuthRule.EventStream.AUTHORIZATION)
                .lithicManaged(true)
                .name("name")
                .programLevel(true)
                .state(AuthRule.AuthRuleState.ACTIVE)
                .type(AuthRule.AuthRuleType.CONDITIONAL_BLOCK)
                .addExcludedCardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedAuthRule =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authRule),
                jacksonTypeRef<AuthRule>(),
            )

        assertThat(roundtrippedAuthRule).isEqualTo(authRule)
    }
}
