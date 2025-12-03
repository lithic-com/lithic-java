// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenizationRuleResultTest {

    @Test
    fun create() {
        val tokenizationRuleResult =
            TokenizationRuleResult.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .explanation("explanation")
                .name("name")
                .result(TokenizationRuleResult.Result.APPROVED)
                .build()

        assertThat(tokenizationRuleResult.authRuleToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tokenizationRuleResult.explanation()).contains("explanation")
        assertThat(tokenizationRuleResult.name()).contains("name")
        assertThat(tokenizationRuleResult.result())
            .isEqualTo(TokenizationRuleResult.Result.APPROVED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tokenizationRuleResult =
            TokenizationRuleResult.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .explanation("explanation")
                .name("name")
                .result(TokenizationRuleResult.Result.APPROVED)
                .build()

        val roundtrippedTokenizationRuleResult =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenizationRuleResult),
                jacksonTypeRef<TokenizationRuleResult>(),
            )

        assertThat(roundtrippedTokenizationRuleResult).isEqualTo(tokenizationRuleResult)
    }
}
