// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthRuleV2ListPageResponseTest {

    @Test
    fun create() {
        val authRuleV2ListPageResponse =
            AuthRuleV2ListPageResponse.builder()
                .addData(
                    V2ListResponse.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addBusinessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addCardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .currentVersion(
                            V2ListResponse.CurrentVersion.builder()
                                .parameters(
                                    ConditionalBlockParameters.builder()
                                        .addCondition(
                                            AuthRuleCondition.builder()
                                                .attribute(ConditionalAttribute.MCC)
                                                .operation(AuthRuleCondition.Operation.IS_ONE_OF)
                                                .value("string")
                                                .build()
                                        )
                                        .build()
                                )
                                .version(0L)
                                .build()
                        )
                        .draftVersion(
                            V2ListResponse.DraftVersion.builder()
                                .parameters(
                                    ConditionalBlockParameters.builder()
                                        .addCondition(
                                            AuthRuleCondition.builder()
                                                .attribute(ConditionalAttribute.MCC)
                                                .operation(AuthRuleCondition.Operation.IS_ONE_OF)
                                                .value("string")
                                                .build()
                                        )
                                        .build()
                                )
                                .version(0L)
                                .build()
                        )
                        .eventStream(V2ListResponse.EventStream.AUTHORIZATION)
                        .name("name")
                        .programLevel(true)
                        .state(V2ListResponse.AuthRuleState.ACTIVE)
                        .type(V2ListResponse.AuthRuleType.CONDITIONAL_BLOCK)
                        .addExcludedCardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .hasMore(true)
                .build()

        assertThat(authRuleV2ListPageResponse.data())
            .containsExactly(
                V2ListResponse.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addBusinessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addCardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .currentVersion(
                        V2ListResponse.CurrentVersion.builder()
                            .parameters(
                                ConditionalBlockParameters.builder()
                                    .addCondition(
                                        AuthRuleCondition.builder()
                                            .attribute(ConditionalAttribute.MCC)
                                            .operation(AuthRuleCondition.Operation.IS_ONE_OF)
                                            .value("string")
                                            .build()
                                    )
                                    .build()
                            )
                            .version(0L)
                            .build()
                    )
                    .draftVersion(
                        V2ListResponse.DraftVersion.builder()
                            .parameters(
                                ConditionalBlockParameters.builder()
                                    .addCondition(
                                        AuthRuleCondition.builder()
                                            .attribute(ConditionalAttribute.MCC)
                                            .operation(AuthRuleCondition.Operation.IS_ONE_OF)
                                            .value("string")
                                            .build()
                                    )
                                    .build()
                            )
                            .version(0L)
                            .build()
                    )
                    .eventStream(V2ListResponse.EventStream.AUTHORIZATION)
                    .name("name")
                    .programLevel(true)
                    .state(V2ListResponse.AuthRuleState.ACTIVE)
                    .type(V2ListResponse.AuthRuleType.CONDITIONAL_BLOCK)
                    .addExcludedCardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(authRuleV2ListPageResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authRuleV2ListPageResponse =
            AuthRuleV2ListPageResponse.builder()
                .addData(
                    V2ListResponse.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addBusinessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addCardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .currentVersion(
                            V2ListResponse.CurrentVersion.builder()
                                .parameters(
                                    ConditionalBlockParameters.builder()
                                        .addCondition(
                                            AuthRuleCondition.builder()
                                                .attribute(ConditionalAttribute.MCC)
                                                .operation(AuthRuleCondition.Operation.IS_ONE_OF)
                                                .value("string")
                                                .build()
                                        )
                                        .build()
                                )
                                .version(0L)
                                .build()
                        )
                        .draftVersion(
                            V2ListResponse.DraftVersion.builder()
                                .parameters(
                                    ConditionalBlockParameters.builder()
                                        .addCondition(
                                            AuthRuleCondition.builder()
                                                .attribute(ConditionalAttribute.MCC)
                                                .operation(AuthRuleCondition.Operation.IS_ONE_OF)
                                                .value("string")
                                                .build()
                                        )
                                        .build()
                                )
                                .version(0L)
                                .build()
                        )
                        .eventStream(V2ListResponse.EventStream.AUTHORIZATION)
                        .name("name")
                        .programLevel(true)
                        .state(V2ListResponse.AuthRuleState.ACTIVE)
                        .type(V2ListResponse.AuthRuleType.CONDITIONAL_BLOCK)
                        .addExcludedCardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .hasMore(true)
                .build()

        val roundtrippedAuthRuleV2ListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authRuleV2ListPageResponse),
                jacksonTypeRef<AuthRuleV2ListPageResponse>(),
            )

        assertThat(roundtrippedAuthRuleV2ListPageResponse).isEqualTo(authRuleV2ListPageResponse)
    }
}
