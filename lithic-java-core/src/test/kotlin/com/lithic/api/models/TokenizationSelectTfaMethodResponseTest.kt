// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenizationSelectTfaMethodResponseTest {

    @Test
    fun create() {
        val tokenizationSelectTfaMethodResponse =
            TokenizationSelectTfaMethodResponse.builder().success(true).build()

        assertThat(tokenizationSelectTfaMethodResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tokenizationSelectTfaMethodResponse =
            TokenizationSelectTfaMethodResponse.builder().success(true).build()

        val roundtrippedTokenizationSelectTfaMethodResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenizationSelectTfaMethodResponse),
                jacksonTypeRef<TokenizationSelectTfaMethodResponse>(),
            )

        assertThat(roundtrippedTokenizationSelectTfaMethodResponse)
            .isEqualTo(tokenizationSelectTfaMethodResponse)
    }
}
