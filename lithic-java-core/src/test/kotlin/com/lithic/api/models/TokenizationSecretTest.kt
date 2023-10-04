// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TokenizationSecretTest {

    @Test
    fun createTokenizationSecret() {
        val tokenizationSecret =
            TokenizationSecret.builder()
                .secret("whsec_1NDsYinMGr951KuDEaj78VtWzlyPaOnwUVagFiWIPJs=")
                .build()
        assertThat(tokenizationSecret).isNotNull
        assertThat(tokenizationSecret.secret())
            .contains("whsec_1NDsYinMGr951KuDEaj78VtWzlyPaOnwUVagFiWIPJs=")
    }
}
