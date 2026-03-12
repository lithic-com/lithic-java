// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthRuleVersionTest {

    @Test
    fun create() {
        val authRuleVersion =
            AuthRuleVersion.builder()
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .parameters(
                    ConditionalBlockParameters.builder()
                        .addCondition(
                            AuthRuleCondition.builder()
                                .attribute(ConditionalAttribute.MCC)
                                .operation(ConditionalOperation.IS_ONE_OF)
                                .value("string")
                                .build()
                        )
                        .build()
                )
                .state(AuthRuleVersion.AuthRuleVersionState.ACTIVE)
                .version(0L)
                .build()

        assertThat(authRuleVersion.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(authRuleVersion.parameters())
            .isEqualTo(
                AuthRuleVersion.Parameters.ofConditionalBlock(
                    ConditionalBlockParameters.builder()
                        .addCondition(
                            AuthRuleCondition.builder()
                                .attribute(ConditionalAttribute.MCC)
                                .operation(ConditionalOperation.IS_ONE_OF)
                                .value("string")
                                .build()
                        )
                        .build()
                )
            )
        assertThat(authRuleVersion.state()).isEqualTo(AuthRuleVersion.AuthRuleVersionState.ACTIVE)
        assertThat(authRuleVersion.version()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authRuleVersion =
            AuthRuleVersion.builder()
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .parameters(
                    ConditionalBlockParameters.builder()
                        .addCondition(
                            AuthRuleCondition.builder()
                                .attribute(ConditionalAttribute.MCC)
                                .operation(ConditionalOperation.IS_ONE_OF)
                                .value("string")
                                .build()
                        )
                        .build()
                )
                .state(AuthRuleVersion.AuthRuleVersionState.ACTIVE)
                .version(0L)
                .build()

        val roundtrippedAuthRuleVersion =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authRuleVersion),
                jacksonTypeRef<AuthRuleVersion>(),
            )

        assertThat(roundtrippedAuthRuleVersion).isEqualTo(authRuleVersion)
    }
}
