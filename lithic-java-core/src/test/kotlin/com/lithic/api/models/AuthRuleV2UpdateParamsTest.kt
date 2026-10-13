// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthRuleV2UpdateParamsTest {

    @Test
    fun create() {
        AuthRuleV2UpdateParams.builder()
            .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .body(
                AuthRuleV2UpdateParams.Body.Rule.builder()
                    .entities(
                        AuthRuleEntities.builder()
                            .addExclude(
                                AuthRuleEntity.AuthRuleProgramEntity.builder()
                                    .type(AuthRuleEntity.AuthRuleProgramEntity.Type.PROGRAM)
                                    .build()
                            )
                            .addInclude(
                                AuthRuleEntity.AuthRuleProgramEntity.builder()
                                    .type(AuthRuleEntity.AuthRuleProgramEntity.Type.PROGRAM)
                                    .build()
                            )
                            .build()
                    )
                    .name("name")
                    .state(AuthRuleV2UpdateParams.Body.Rule.State.INACTIVE)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AuthRuleV2UpdateParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .body(AuthRuleV2UpdateParams.Body.Rule.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AuthRuleV2UpdateParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .body(
                    AuthRuleV2UpdateParams.Body.Rule.builder()
                        .entities(
                            AuthRuleEntities.builder()
                                .addExclude(
                                    AuthRuleEntity.AuthRuleProgramEntity.builder()
                                        .type(AuthRuleEntity.AuthRuleProgramEntity.Type.PROGRAM)
                                        .build()
                                )
                                .addInclude(
                                    AuthRuleEntity.AuthRuleProgramEntity.builder()
                                        .type(AuthRuleEntity.AuthRuleProgramEntity.Type.PROGRAM)
                                        .build()
                                )
                                .build()
                        )
                        .name("name")
                        .state(AuthRuleV2UpdateParams.Body.Rule.State.INACTIVE)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AuthRuleV2UpdateParams.Body.ofRule(
                    AuthRuleV2UpdateParams.Body.Rule.builder()
                        .entities(
                            AuthRuleEntities.builder()
                                .addExclude(
                                    AuthRuleEntity.AuthRuleProgramEntity.builder()
                                        .type(AuthRuleEntity.AuthRuleProgramEntity.Type.PROGRAM)
                                        .build()
                                )
                                .addInclude(
                                    AuthRuleEntity.AuthRuleProgramEntity.builder()
                                        .type(AuthRuleEntity.AuthRuleProgramEntity.Type.PROGRAM)
                                        .build()
                                )
                                .build()
                        )
                        .name("name")
                        .state(AuthRuleV2UpdateParams.Body.Rule.State.INACTIVE)
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AuthRuleV2UpdateParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .body(AuthRuleV2UpdateParams.Body.Rule.builder().build())
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AuthRuleV2UpdateParams.Body.ofRule(
                    AuthRuleV2UpdateParams.Body.Rule.builder().build()
                )
            )
    }
}
