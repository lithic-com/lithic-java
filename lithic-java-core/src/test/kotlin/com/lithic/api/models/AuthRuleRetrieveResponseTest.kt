// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuthRuleRetrieveResponseTest {

    @Test
    fun createAuthRuleRetrieveResponse() {
        val authRuleRetrieveResponse =
            AuthRuleRetrieveResponse.builder()
                .data(
                    listOf(
                        AuthRule.builder()
                            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .accountTokens(listOf("string"))
                            .allowedCountries(listOf("string"))
                            .allowedMcc(listOf("string"))
                            .blockedCountries(listOf("string"))
                            .blockedMcc(listOf("string"))
                            .cardTokens(listOf("string"))
                            .programLevel(true)
                            .state(AuthRule.State.ACTIVE)
                            .build()
                    )
                )
                .build()
        assertThat(authRuleRetrieveResponse).isNotNull
        assertThat(authRuleRetrieveResponse.data().get())
            .containsExactly(
                AuthRule.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountTokens(listOf("string"))
                    .allowedCountries(listOf("string"))
                    .allowedMcc(listOf("string"))
                    .blockedCountries(listOf("string"))
                    .blockedMcc(listOf("string"))
                    .cardTokens(listOf("string"))
                    .programLevel(true)
                    .state(AuthRule.State.ACTIVE)
                    .build()
            )
    }
}
