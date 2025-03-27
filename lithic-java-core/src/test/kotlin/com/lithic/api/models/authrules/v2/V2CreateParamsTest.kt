// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.authrules.v2

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V2CreateParamsTest {

    @Test
    fun create() {
        V2CreateParams.builder()
            .body(
                V2CreateParams.Body.CreateAuthRuleRequestAccountTokens.builder()
                    .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
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
                    .type(
                        V2CreateParams.Body.CreateAuthRuleRequestAccountTokens.AuthRuleType
                            .CONDITIONAL_BLOCK
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            V2CreateParams.builder()
                .body(
                    V2CreateParams.Body.CreateAuthRuleRequestAccountTokens.builder()
                        .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
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
                        .type(
                            V2CreateParams.Body.CreateAuthRuleRequestAccountTokens.AuthRuleType
                                .CONDITIONAL_BLOCK
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                V2CreateParams.Body.ofCreateAuthRuleRequestAccountTokens(
                    V2CreateParams.Body.CreateAuthRuleRequestAccountTokens.builder()
                        .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
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
                        .type(
                            V2CreateParams.Body.CreateAuthRuleRequestAccountTokens.AuthRuleType
                                .CONDITIONAL_BLOCK
                        )
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V2CreateParams.builder()
                .body(
                    V2CreateParams.Body.CreateAuthRuleRequestAccountTokens.builder()
                        .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .parameters(
                            ConditionalBlockParameters.builder()
                                .addCondition(AuthRuleCondition.builder().build())
                                .build()
                        )
                        .type(
                            V2CreateParams.Body.CreateAuthRuleRequestAccountTokens.AuthRuleType
                                .CONDITIONAL_BLOCK
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                V2CreateParams.Body.ofCreateAuthRuleRequestAccountTokens(
                    V2CreateParams.Body.CreateAuthRuleRequestAccountTokens.builder()
                        .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .parameters(
                            ConditionalBlockParameters.builder()
                                .addCondition(AuthRuleCondition.builder().build())
                                .build()
                        )
                        .type(
                            V2CreateParams.Body.CreateAuthRuleRequestAccountTokens.AuthRuleType
                                .CONDITIONAL_BLOCK
                        )
                        .build()
                )
            )
    }
}
