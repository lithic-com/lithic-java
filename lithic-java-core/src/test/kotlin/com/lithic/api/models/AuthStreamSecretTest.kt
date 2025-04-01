// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthStreamSecretTest {

    @Test
    fun create() {
        val authStreamSecret =
            AuthStreamSecret.builder()
                .secret("whsec_1NDsYinMGr951KuDEaj78VtWzlyPaOnwUVagFiWIPJs=")
                .build()

        assertThat(authStreamSecret.secret())
            .contains("whsec_1NDsYinMGr951KuDEaj78VtWzlyPaOnwUVagFiWIPJs=")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authStreamSecret =
            AuthStreamSecret.builder()
                .secret("whsec_1NDsYinMGr951KuDEaj78VtWzlyPaOnwUVagFiWIPJs=")
                .build()

        val roundtrippedAuthStreamSecret =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authStreamSecret),
                jacksonTypeRef<AuthStreamSecret>(),
            )

        assertThat(roundtrippedAuthStreamSecret).isEqualTo(authStreamSecret)
    }
}
