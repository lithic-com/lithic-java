// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TypescriptCodeParametersTest {

    @Test
    fun create() {
        val typescriptCodeParameters =
            TypescriptCodeParameters.builder()
                .code("code")
                .addFeature(
                    RuleFeature.AuthorizationFeature.builder()
                        .type(RuleFeature.AuthorizationFeature.Type.AUTHORIZATION)
                        .name("name")
                        .build()
                )
                .build()

        assertThat(typescriptCodeParameters.code()).isEqualTo("code")
        assertThat(typescriptCodeParameters.features())
            .containsExactly(
                RuleFeature.ofAuthorization(
                    RuleFeature.AuthorizationFeature.builder()
                        .type(RuleFeature.AuthorizationFeature.Type.AUTHORIZATION)
                        .name("name")
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val typescriptCodeParameters =
            TypescriptCodeParameters.builder()
                .code("code")
                .addFeature(
                    RuleFeature.AuthorizationFeature.builder()
                        .type(RuleFeature.AuthorizationFeature.Type.AUTHORIZATION)
                        .name("name")
                        .build()
                )
                .build()

        val roundtrippedTypescriptCodeParameters =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(typescriptCodeParameters),
                jacksonTypeRef<TypescriptCodeParameters>(),
            )

        assertThat(roundtrippedTypescriptCodeParameters).isEqualTo(typescriptCodeParameters)
    }
}
