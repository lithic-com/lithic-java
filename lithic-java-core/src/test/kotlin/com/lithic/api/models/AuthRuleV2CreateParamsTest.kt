// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.junit.jupiter.api.Test

class AuthRuleV2CreateParamsTest {

    @Test
    fun create() {
        AuthRuleV2CreateParams.builder()
            .forCreateAuthRuleRequestAccountTokens(
                AuthRuleV2CreateParams.CreateAuthRuleRequestAccountTokens.builder()
                    .accountTokens(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .name("name")
                    .parameters(
                        AuthRuleV2CreateParams.CreateAuthRuleRequestAccountTokens.Parameters
                            .ofConditionalBlock(
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
                    )
                    .type(
                        AuthRuleV2CreateParams.CreateAuthRuleRequestAccountTokens.AuthRuleType
                            .CONDITIONAL_BLOCK
                    )
                    .build()
            )
            .build()
    }
}
