package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuthStreamSecretTest {

    @Test
    fun createAuthStreamSecret() {
        val authStreamSecret =
            AuthStreamSecret.builder()
                .secret("whsec_1NDsYinMGr951KuDEaj78VtWzlyPaOnwUVagFiWIPJs=")
                .build()
        assertThat(authStreamSecret).isNotNull
        assertThat(authStreamSecret.secret())
            .contains("whsec_1NDsYinMGr951KuDEaj78VtWzlyPaOnwUVagFiWIPJs=")
    }
}
