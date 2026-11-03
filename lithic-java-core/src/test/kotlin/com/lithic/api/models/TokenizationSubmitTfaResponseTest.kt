// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenizationSubmitTfaResponseTest {

    @Test
    fun create() {
        val tokenizationSubmitTfaResponse =
            TokenizationSubmitTfaResponse.builder().success(true).build()

        assertThat(tokenizationSubmitTfaResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tokenizationSubmitTfaResponse =
            TokenizationSubmitTfaResponse.builder().success(true).build()

        val roundtrippedTokenizationSubmitTfaResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenizationSubmitTfaResponse),
                jacksonTypeRef<TokenizationSubmitTfaResponse>(),
            )

        assertThat(roundtrippedTokenizationSubmitTfaResponse)
            .isEqualTo(tokenizationSubmitTfaResponse)
    }
}
