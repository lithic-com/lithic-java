// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.junit.jupiter.api.Test

class AuthRuleV2CreateParamsTest {

    @Test
    fun createAuthRuleV2CreateParams() {
        AuthRuleV2CreateParams.builder()
            .forCreateAuthRuleRequestAccountTokens(
                AuthRuleV2CreateParams.CreateAuthRuleRequestAccountTokens.builder()
                    .accountTokens(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .parameters(
                        AuthRuleV2CreateParams.CreateAuthRuleRequestAccountTokens.AuthRuleParameters
                            .ofConditionalBlockParameters(
                                AuthRuleV2CreateParams.CreateAuthRuleRequestAccountTokens
                                    .AuthRuleParameters
                                    .ConditionalBlockParameters
                                    .builder()
                                    .conditions(
                                        listOf(
                                            AuthRuleV2CreateParams
                                                .CreateAuthRuleRequestAccountTokens
                                                .AuthRuleParameters
                                                .ConditionalBlockParameters
                                                .Condition
                                                .builder()
                                                .attribute(
                                                    AuthRuleV2CreateParams
                                                        .CreateAuthRuleRequestAccountTokens
                                                        .AuthRuleParameters
                                                        .ConditionalBlockParameters
                                                        .Condition
                                                        .Attribute
                                                        .MCC
                                                )
                                                .operation(
                                                    AuthRuleV2CreateParams
                                                        .CreateAuthRuleRequestAccountTokens
                                                        .AuthRuleParameters
                                                        .ConditionalBlockParameters
                                                        .Condition
                                                        .Operation
                                                        .IS_ONE_OF
                                                )
                                                .value(
                                                    AuthRuleV2CreateParams
                                                        .CreateAuthRuleRequestAccountTokens
                                                        .AuthRuleParameters
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
                    .type(
                        AuthRuleV2CreateParams.CreateAuthRuleRequestAccountTokens.AuthRuleType
                            .CONDITIONAL_BLOCK
                    )
                    .build()
            )
            .build()
    }
}
