// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuthRuleV2DraftParamsTest {

    @Test
    fun createAuthRuleV2DraftParams() {
        AuthRuleV2DraftParams.builder()
            .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .parameters(
                AuthRuleV2DraftParams.AuthRuleParameters.ofConditionalBlockParameters(
                    AuthRuleV2DraftParams.AuthRuleParameters.ConditionalBlockParameters.builder()
                        .conditions(
                            listOf(
                                AuthRuleV2DraftParams.AuthRuleParameters.ConditionalBlockParameters
                                    .Condition
                                    .builder()
                                    .attribute(
                                        AuthRuleV2DraftParams.AuthRuleParameters
                                            .ConditionalBlockParameters
                                            .Condition
                                            .Attribute
                                            .MCC
                                    )
                                    .operation(
                                        AuthRuleV2DraftParams.AuthRuleParameters
                                            .ConditionalBlockParameters
                                            .Condition
                                            .Operation
                                            .IS_ONE_OF
                                    )
                                    .value(
                                        AuthRuleV2DraftParams.AuthRuleParameters
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
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AuthRuleV2DraftParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .parameters(
                    AuthRuleV2DraftParams.AuthRuleParameters.ofConditionalBlockParameters(
                        AuthRuleV2DraftParams.AuthRuleParameters.ConditionalBlockParameters
                            .builder()
                            .conditions(
                                listOf(
                                    AuthRuleV2DraftParams.AuthRuleParameters
                                        .ConditionalBlockParameters
                                        .Condition
                                        .builder()
                                        .attribute(
                                            AuthRuleV2DraftParams.AuthRuleParameters
                                                .ConditionalBlockParameters
                                                .Condition
                                                .Attribute
                                                .MCC
                                        )
                                        .operation(
                                            AuthRuleV2DraftParams.AuthRuleParameters
                                                .ConditionalBlockParameters
                                                .Condition
                                                .Operation
                                                .IS_ONE_OF
                                        )
                                        .value(
                                            AuthRuleV2DraftParams.AuthRuleParameters
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
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.parameters())
            .isEqualTo(
                AuthRuleV2DraftParams.AuthRuleParameters.ofConditionalBlockParameters(
                    AuthRuleV2DraftParams.AuthRuleParameters.ConditionalBlockParameters.builder()
                        .conditions(
                            listOf(
                                AuthRuleV2DraftParams.AuthRuleParameters.ConditionalBlockParameters
                                    .Condition
                                    .builder()
                                    .attribute(
                                        AuthRuleV2DraftParams.AuthRuleParameters
                                            .ConditionalBlockParameters
                                            .Condition
                                            .Attribute
                                            .MCC
                                    )
                                    .operation(
                                        AuthRuleV2DraftParams.AuthRuleParameters
                                            .ConditionalBlockParameters
                                            .Condition
                                            .Operation
                                            .IS_ONE_OF
                                    )
                                    .value(
                                        AuthRuleV2DraftParams.AuthRuleParameters
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
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AuthRuleV2DraftParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            AuthRuleV2DraftParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "authRuleToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
