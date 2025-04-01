// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenizationDecisioningRotateSecretResponseTest {

    @Test
    fun create() {
        val tokenizationDecisioningRotateSecretResponse =
            TokenizationDecisioningRotateSecretResponse.builder()
                .secret("whsec_1NDsYinMGr951KuDEaj78VtWzlyPaOnwUVagFiWIPJs=")
                .build()

        assertThat(tokenizationDecisioningRotateSecretResponse.secret())
            .contains("whsec_1NDsYinMGr951KuDEaj78VtWzlyPaOnwUVagFiWIPJs=")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tokenizationDecisioningRotateSecretResponse =
            TokenizationDecisioningRotateSecretResponse.builder()
                .secret("whsec_1NDsYinMGr951KuDEaj78VtWzlyPaOnwUVagFiWIPJs=")
                .build()

        val roundtrippedTokenizationDecisioningRotateSecretResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenizationDecisioningRotateSecretResponse),
                jacksonTypeRef<TokenizationDecisioningRotateSecretResponse>(),
            )

        assertThat(roundtrippedTokenizationDecisioningRotateSecretResponse)
            .isEqualTo(tokenizationDecisioningRotateSecretResponse)
    }
}
