// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V2RetrieveResponseTest {

    @Test
    fun create() {
        val v2RetrieveResponse =
            V2RetrieveResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBusinessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addCardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currentVersion(
                    V2RetrieveResponse.CurrentVersion.builder()
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
                    V2RetrieveResponse.DraftVersion.builder()
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
                .eventStream(V2RetrieveResponse.EventStream.AUTHORIZATION)
                .lithicManaged(true)
                .name("name")
                .programLevel(true)
                .state(V2RetrieveResponse.AuthRuleState.ACTIVE)
                .type(V2RetrieveResponse.AuthRuleType.CONDITIONAL_BLOCK)
                .addExcludedCardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(v2RetrieveResponse.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v2RetrieveResponse.accountTokens())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v2RetrieveResponse.businessAccountTokens())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v2RetrieveResponse.cardTokens())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v2RetrieveResponse.currentVersion())
            .contains(
                V2RetrieveResponse.CurrentVersion.builder()
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
        assertThat(v2RetrieveResponse.draftVersion())
            .contains(
                V2RetrieveResponse.DraftVersion.builder()
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
        assertThat(v2RetrieveResponse.eventStream())
            .isEqualTo(V2RetrieveResponse.EventStream.AUTHORIZATION)
        assertThat(v2RetrieveResponse.lithicManaged()).isEqualTo(true)
        assertThat(v2RetrieveResponse.name()).contains("name")
        assertThat(v2RetrieveResponse.programLevel()).isEqualTo(true)
        assertThat(v2RetrieveResponse.state()).isEqualTo(V2RetrieveResponse.AuthRuleState.ACTIVE)
        assertThat(v2RetrieveResponse.type())
            .isEqualTo(V2RetrieveResponse.AuthRuleType.CONDITIONAL_BLOCK)
        assertThat(v2RetrieveResponse.excludedCardTokens().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v2RetrieveResponse =
            V2RetrieveResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBusinessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addCardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currentVersion(
                    V2RetrieveResponse.CurrentVersion.builder()
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
                    V2RetrieveResponse.DraftVersion.builder()
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
                .eventStream(V2RetrieveResponse.EventStream.AUTHORIZATION)
                .lithicManaged(true)
                .name("name")
                .programLevel(true)
                .state(V2RetrieveResponse.AuthRuleState.ACTIVE)
                .type(V2RetrieveResponse.AuthRuleType.CONDITIONAL_BLOCK)
                .addExcludedCardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedV2RetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v2RetrieveResponse),
                jacksonTypeRef<V2RetrieveResponse>(),
            )

        assertThat(roundtrippedV2RetrieveResponse).isEqualTo(v2RetrieveResponse)
    }
}
