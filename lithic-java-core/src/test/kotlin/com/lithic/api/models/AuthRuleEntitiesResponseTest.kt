// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthRuleEntitiesResponseTest {

    @Test
    fun create() {
        val authRuleEntitiesResponse =
            AuthRuleEntitiesResponse.builder()
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

        assertThat(authRuleEntitiesResponse.exclude())
            .containsExactly(
                AuthRuleEntity.ofProgram(
                    AuthRuleEntity.AuthRuleProgramEntity.builder()
                        .type(AuthRuleEntity.AuthRuleProgramEntity.Type.PROGRAM)
                        .build()
                )
            )
        assertThat(authRuleEntitiesResponse.include())
            .containsExactly(
                AuthRuleEntity.ofProgram(
                    AuthRuleEntity.AuthRuleProgramEntity.builder()
                        .type(AuthRuleEntity.AuthRuleProgramEntity.Type.PROGRAM)
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authRuleEntitiesResponse =
            AuthRuleEntitiesResponse.builder()
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

        val roundtrippedAuthRuleEntitiesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authRuleEntitiesResponse),
                jacksonTypeRef<AuthRuleEntitiesResponse>(),
            )

        assertThat(roundtrippedAuthRuleEntitiesResponse).isEqualTo(authRuleEntitiesResponse)
    }
}
