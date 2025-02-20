// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuthRuleV2CreateParamsTest {

    @Test
    fun create() {
        AuthRuleV2CreateParams.builder()
            .body(
                AuthRuleV2CreateParams.Body.CreateAuthRuleRequestAccountTokens.builder()
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
                        AuthRuleV2CreateParams.Body.CreateAuthRuleRequestAccountTokens.AuthRuleType
                            .CONDITIONAL_BLOCK
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            AuthRuleV2CreateParams.builder()
                .body(
                    AuthRuleV2CreateParams.Body.CreateAuthRuleRequestAccountTokens.builder()
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
                            AuthRuleV2CreateParams.Body.CreateAuthRuleRequestAccountTokens
                                .AuthRuleType
                                .CONDITIONAL_BLOCK
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AuthRuleV2CreateParams.Body.ofCreateAuthRuleRequestAccountTokens(
                    AuthRuleV2CreateParams.Body.CreateAuthRuleRequestAccountTokens.builder()
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
                            AuthRuleV2CreateParams.Body.CreateAuthRuleRequestAccountTokens
                                .AuthRuleType
                                .CONDITIONAL_BLOCK
                        )
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AuthRuleV2CreateParams.builder()
                .body(
                    AuthRuleV2CreateParams.Body.CreateAuthRuleRequestAccountTokens.builder()
                        .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .parameters(
                            ConditionalBlockParameters.builder()
                                .addCondition(AuthRuleCondition.builder().build())
                                .build()
                        )
                        .type(
                            AuthRuleV2CreateParams.Body.CreateAuthRuleRequestAccountTokens
                                .AuthRuleType
                                .CONDITIONAL_BLOCK
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AuthRuleV2CreateParams.Body.ofCreateAuthRuleRequestAccountTokens(
                    AuthRuleV2CreateParams.Body.CreateAuthRuleRequestAccountTokens.builder()
                        .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .parameters(
                            ConditionalBlockParameters.builder()
                                .addCondition(AuthRuleCondition.builder().build())
                                .build()
                        )
                        .type(
                            AuthRuleV2CreateParams.Body.CreateAuthRuleRequestAccountTokens
                                .AuthRuleType
                                .CONDITIONAL_BLOCK
                        )
                        .build()
                )
            )
    }
}
