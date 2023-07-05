package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuthRuleTest {

    @Test
    fun createAuthRule() {
        val authRule =
            AuthRule.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .state(AuthRule.State.ACTIVE)
                .allowedMcc(listOf("string"))
                .blockedMcc(listOf("string"))
                .allowedCountries(listOf("string"))
                .blockedCountries(listOf("string"))
                .accountTokens(listOf("string"))
                .cardTokens(listOf("string"))
                .programLevel(true)
                .build()
        assertThat(authRule).isNotNull
        assertThat(authRule.token()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(authRule.state()).contains(AuthRule.State.ACTIVE)
        assertThat(authRule.allowedMcc().get()).containsExactly("string")
        assertThat(authRule.blockedMcc().get()).containsExactly("string")
        assertThat(authRule.allowedCountries().get()).containsExactly("string")
        assertThat(authRule.blockedCountries().get()).containsExactly("string")
        assertThat(authRule.accountTokens().get()).containsExactly("string")
        assertThat(authRule.cardTokens().get()).containsExactly("string")
        assertThat(authRule.programLevel()).contains(true)
    }
}
