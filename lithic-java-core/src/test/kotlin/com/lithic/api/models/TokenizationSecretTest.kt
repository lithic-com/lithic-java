// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenizationSecretTest {

    @Test
    fun create() {
        val tokenizationSecret =
            TokenizationSecret.builder()
                .secret("whsec_1NDsYinMGr951KuDEaj78VtWzlyPaOnwUVagFiWIPJs=")
                .build()

        assertThat(tokenizationSecret.secret())
            .contains("whsec_1NDsYinMGr951KuDEaj78VtWzlyPaOnwUVagFiWIPJs=")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tokenizationSecret =
            TokenizationSecret.builder()
                .secret("whsec_1NDsYinMGr951KuDEaj78VtWzlyPaOnwUVagFiWIPJs=")
                .build()

        val roundtrippedTokenizationSecret =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenizationSecret),
                jacksonTypeRef<TokenizationSecret>(),
            )

        assertThat(roundtrippedTokenizationSecret).isEqualTo(tokenizationSecret)
    }
}
