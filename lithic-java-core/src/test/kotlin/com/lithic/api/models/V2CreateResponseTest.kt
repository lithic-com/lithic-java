// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V2CreateResponseTest {

    @Test
    fun create() {
        val v2CreateResponse =
            V2CreateResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBusinessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addCardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currentVersion(
                    V2CreateResponse.CurrentVersion.builder()
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
                    V2CreateResponse.DraftVersion.builder()
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
                .eventStream(V2CreateResponse.EventStream.AUTHORIZATION)
                .lithicManaged(true)
                .name("name")
                .programLevel(true)
                .state(V2CreateResponse.AuthRuleState.ACTIVE)
                .type(V2CreateResponse.AuthRuleType.CONDITIONAL_BLOCK)
                .addExcludedCardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(v2CreateResponse.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v2CreateResponse.accountTokens())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v2CreateResponse.businessAccountTokens())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v2CreateResponse.cardTokens())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v2CreateResponse.currentVersion())
            .contains(
                V2CreateResponse.CurrentVersion.builder()
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
        assertThat(v2CreateResponse.draftVersion())
            .contains(
                V2CreateResponse.DraftVersion.builder()
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
        assertThat(v2CreateResponse.eventStream())
            .isEqualTo(V2CreateResponse.EventStream.AUTHORIZATION)
        assertThat(v2CreateResponse.lithicManaged()).isEqualTo(true)
        assertThat(v2CreateResponse.name()).contains("name")
        assertThat(v2CreateResponse.programLevel()).isEqualTo(true)
        assertThat(v2CreateResponse.state()).isEqualTo(V2CreateResponse.AuthRuleState.ACTIVE)
        assertThat(v2CreateResponse.type())
            .isEqualTo(V2CreateResponse.AuthRuleType.CONDITIONAL_BLOCK)
        assertThat(v2CreateResponse.excludedCardTokens().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v2CreateResponse =
            V2CreateResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBusinessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addCardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currentVersion(
                    V2CreateResponse.CurrentVersion.builder()
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
                    V2CreateResponse.DraftVersion.builder()
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
                .eventStream(V2CreateResponse.EventStream.AUTHORIZATION)
                .lithicManaged(true)
                .name("name")
                .programLevel(true)
                .state(V2CreateResponse.AuthRuleState.ACTIVE)
                .type(V2CreateResponse.AuthRuleType.CONDITIONAL_BLOCK)
                .addExcludedCardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedV2CreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v2CreateResponse),
                jacksonTypeRef<V2CreateResponse>(),
            )

        assertThat(roundtrippedV2CreateResponse).isEqualTo(v2CreateResponse)
    }
}
