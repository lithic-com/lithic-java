// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthRuleV2DraftParamsTest {

    @Test
    fun create() {
        AuthRuleV2DraftParams.builder()
            .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AuthRuleV2DraftParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AuthRuleV2DraftParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.parameters())
            .contains(
                AuthRuleV2DraftParams.Parameters.ofConditionalBlock(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AuthRuleV2DraftParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertNotNull(body)
    }
}
