// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthRuleV2UpdateEntitiesParamsTest {

    @Test
    fun create() {
        AuthRuleV2UpdateEntitiesParams.builder()
            .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .add(
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
            .remove(
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
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AuthRuleV2UpdateEntitiesParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AuthRuleV2UpdateEntitiesParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .add(
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
                .remove(
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
                .build()

        val body = params._body()

        assertThat(body.add())
            .contains(
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
        assertThat(body.remove())
            .contains(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AuthRuleV2UpdateEntitiesParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
