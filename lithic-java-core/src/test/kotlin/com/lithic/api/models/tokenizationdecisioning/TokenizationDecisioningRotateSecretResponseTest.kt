// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.tokenizationdecisioning

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
}
