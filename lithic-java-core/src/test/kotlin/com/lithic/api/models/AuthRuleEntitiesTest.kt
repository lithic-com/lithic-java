// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthRuleEntitiesTest {

    @Test
    fun create() {
        val authRuleEntities =
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

        assertThat(authRuleEntities.exclude().getOrNull())
            .containsExactly(
                AuthRuleEntity.ofProgram(
                    AuthRuleEntity.AuthRuleProgramEntity.builder()
                        .type(AuthRuleEntity.AuthRuleProgramEntity.Type.PROGRAM)
                        .build()
                )
            )
        assertThat(authRuleEntities.include().getOrNull())
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
        val authRuleEntities =
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

        val roundtrippedAuthRuleEntities =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authRuleEntities),
                jacksonTypeRef<AuthRuleEntities>(),
            )

        assertThat(roundtrippedAuthRuleEntities).isEqualTo(authRuleEntities)
    }
}
