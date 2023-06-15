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
                            .state(AuthRule.State.ACTIVE)
                            .previousAuthRuleTokens(listOf("string"))
                            .allowedMcc(listOf("string"))
                            .blockedMcc(listOf("string"))
                            .allowedCountries(listOf("string"))
                            .blockedCountries(listOf("string"))
                            .accountTokens(listOf("string"))
                            .cardTokens(listOf("string"))
                            .programLevel(true)
                            .build()
                    )
                )
                .build()
        assertThat(authRuleRetrieveResponse).isNotNull
        assertThat(authRuleRetrieveResponse.data().get())
            .containsExactly(
                AuthRule.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .state(AuthRule.State.ACTIVE)
                    .previousAuthRuleTokens(listOf("string"))
                    .allowedMcc(listOf("string"))
                    .blockedMcc(listOf("string"))
                    .allowedCountries(listOf("string"))
                    .blockedCountries(listOf("string"))
                    .accountTokens(listOf("string"))
                    .cardTokens(listOf("string"))
                    .programLevel(true)
                    .build()
            )
    }
}
