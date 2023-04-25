package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuthRuleCreateResponseTest {

    @Test
    fun createAuthRuleCreateResponse() {
        val authRuleCreateResponse =
            AuthRuleCreateResponse.builder()
                .data(
                    AuthRule.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .state(AuthRule.State.ACTIVE)
                        .previousAuthRuleTokens(listOf("string"))
                        .allowedMcc(listOf("string"))
                        .blockedMcc(listOf("string"))
                        .allowedCountries(listOf("string"))
                        .blockedCountries(listOf("string"))
                        .avsType(AuthRule.AvsType.ZIP_ONLY)
                        .accountTokens(listOf("string"))
                        .cardTokens(listOf("string"))
                        .programLevel(true)
                        .build()
                )
                .build()
        assertThat(authRuleCreateResponse).isNotNull
        assertThat(authRuleCreateResponse.data())
            .contains(
                AuthRule.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .state(AuthRule.State.ACTIVE)
                    .previousAuthRuleTokens(listOf("string"))
                    .allowedMcc(listOf("string"))
                    .blockedMcc(listOf("string"))
                    .allowedCountries(listOf("string"))
                    .blockedCountries(listOf("string"))
                    .avsType(AuthRule.AvsType.ZIP_ONLY)
                    .accountTokens(listOf("string"))
                    .cardTokens(listOf("string"))
                    .programLevel(true)
                    .build()
            )
    }
}
